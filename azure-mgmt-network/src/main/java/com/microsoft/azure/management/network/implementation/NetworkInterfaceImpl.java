/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.network.Network;
import com.microsoft.azure.management.network.NetworkInterface;
import com.microsoft.azure.management.network.Networks;
import com.microsoft.azure.management.network.NicIpConfiguration;
import com.microsoft.azure.management.network.PublicIpAddress;
import com.microsoft.azure.management.network.PublicIpAddresses;
import com.microsoft.azure.management.network.implementation.api.NetworkInterfaceIPConfiguration;
import com.microsoft.azure.management.network.implementation.api.NetworkInterfaceInner;
import com.microsoft.azure.management.network.implementation.api.NetworkInterfacesInner;
import com.microsoft.azure.management.resources.ResourceGroup;
import com.microsoft.azure.management.resources.ResourceGroups;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.utils.Utils;
import com.microsoft.rest.ServiceResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The type representing Azure network interface.
 */
class NetworkInterfaceImpl
        extends GroupableResourceImpl<NetworkInterface, NetworkInterfaceInner, NetworkInterfaceImpl>
        implements
        NetworkInterface,
        NetworkInterface.Definitions,
        NetworkInterface.Update {
    // Clients
    private final NetworkInterfacesInner client;
    private final Networks networks;
    private final PublicIpAddresses publicIpAddresses;
    // the name of the network interface
    private final String nicName;
    // used to generate unique name for any dependency resources
    private final String randomId;
    // reference to the primary ip configuration
    private NicIpConfigurationImpl nicPrimaryIpConfiguration;
    // list of references to all ip configuration
    private List<NicIpConfiguration> nicIpConfigurations;
    // Cached related resources.
    private PublicIpAddress primaryPublicIp;
    private Network primaryNetwork;

    NetworkInterfaceImpl(String name,
                         NetworkInterfaceInner innerModel,
                         final NetworkInterfacesInner client,
                         final Networks networks,
                         final PublicIpAddresses publicIpAddresses,
                         final ResourceGroups resourceGroups) {
        super(name, innerModel, resourceGroups);
        this.client = client;
        this.networks = networks;
        this.publicIpAddresses = publicIpAddresses;
        this.nicName = name;
        this.randomId = Utils.randomId(this.nicName);
        initializeNicIpConfigurations();
    }

    /**************************************************.
     * Verbs
     **************************************************/

    @Override
    public NetworkInterface refresh() throws Exception {
        ServiceResponse<NetworkInterfaceInner> response =
                this.client.get(this.resourceGroupName(), this.name());
        this.setInner(response.getBody());
        initializeNicIpConfigurations();
        return this;
    }

    @Override
    public NetworkInterfaceImpl create() throws Exception {
        this.creatablesCreate();
        return this;
    }

    @Override
    public NetworkInterfaceImpl update() throws Exception {
        return this;
    }

    @Override
    public NetworkInterfaceImpl apply() throws Exception {
        return this.create();
    }

    /**************************************************.
     * Setters
     **************************************************/

    @Override
    public NetworkInterfaceImpl withNewPrimaryNetwork(Network.DefinitionCreatable creatable) {
        this.primaryIpConfiguration().withNewNetwork(creatable);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withNewPrimaryNetwork(String name, String addressSpaceCidr) {
        this.primaryIpConfiguration().withNewNetwork(name, addressSpaceCidr);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withNewPrimaryNetwork(String addressSpaceCidr) {
        this.primaryIpConfiguration().withNewNetwork(addressSpaceCidr);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withExistingPrimaryNetwork(Network network) {
        this.primaryIpConfiguration().withExistingNetwork(network);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withNewPrimaryPublicIpAddress(PublicIpAddress.DefinitionCreatable creatable) {
        this.primaryIpConfiguration().withNewPublicIpAddress(creatable);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withNewPrimaryPublicIpAddress() {
        this.primaryIpConfiguration().withNewPublicIpAddress();
        return this;
    }

    @Override
    public NetworkInterfaceImpl withNewPrimaryPublicIpAddress(String leafDnsLabel) {
        this.primaryIpConfiguration().withNewPublicIpAddress(leafDnsLabel);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withoutPrimaryPublicIpAddress() {
        this.primaryIpConfiguration().withoutPublicIpAddress();
        return this;
    }

    @Override
    public NetworkInterfaceImpl withExistingPrimaryPublicIpAddress(PublicIpAddress publicIpAddress) {
        this.primaryIpConfiguration().withExistingPublicIpAddress(publicIpAddress);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withPrimaryPrivateIpAddressDynamic() {
        this.primaryIpConfiguration().withPrivateIpAddressDynamic();
        return this;
    }

    @Override
    public NetworkInterfaceImpl withPrimaryPrivateIpAddressStatic(String staticPrivateIpAddress) {
        this.primaryIpConfiguration().withPrivateIpAddressStatic(staticPrivateIpAddress);
        return this;
    }

    @Override
    public NicIpConfigurationImpl defineSecondaryIpConfiguration(String name) {
        return prepareNewNicIpConfiguration(name);
    }

    @Override
    public NicIpConfigurationImpl updateIpConfiguration(String name) {
        for (NicIpConfiguration nicIpConfiguration : this.nicIpConfigurations) {
            if (name.compareToIgnoreCase(nicIpConfiguration.name()) == 0) {
                return (NicIpConfigurationImpl) nicIpConfiguration;
            }
        }
        throw new RuntimeException("An Ip configuration with name'" + name + "' not found");
    }

    @Override
    public NetworkInterfaceImpl withIpForwardingEnabled() {
        this.inner().withEnableIPForwarding(true);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withIpForwardingDisabled() {
        this.inner().withEnableIPForwarding(false);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withDnsServer(String ipAddress) {
        this.dnsServerIps().add(ipAddress);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withoutDnsServer(String ipAddress) {
        this.dnsServerIps().remove(ipAddress);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withAzureDnsServer() {
        this.dnsServerIps().clear();
        return this;
    }

    @Override
    public NetworkInterfaceImpl withSubnet(String name) {
        this.primaryIpConfiguration().withSubnet(name);
        return this;
    }

    @Override
    public NetworkInterfaceImpl withInternalDnsNameLabel(String dnsNameLabel) {
        this.inner().dnsSettings().withInternalDnsNameLabel(dnsNameLabel);
        return this;
    }

    /**************************************************.
     * Getters
     **************************************************/

    @Override
    public boolean isIpForwardingEnabled() {
        return Utils.toPrimitiveBoolean(this.inner().enableIPForwarding());
    }

    @Override
    public boolean isPrimary() {
        return Utils.toPrimitiveBoolean(this.inner().primary());
    }

    @Override
    public String macAddress() {
        return this.inner().macAddress();
    }

    @Override
    public String internalDnsNameLabel() {
        return this.inner().dnsSettings().internalDnsNameLabel();
    }

    @Override
    public String internalFqdn() {
        return this.inner().dnsSettings().internalFqdn();
    }

    @Override
    public List<String> dnsServers() {
        return this.dnsServerIps();
    }

    @Override
    public PublicIpAddress primaryPublicIpAddress() throws CloudException, IOException {
        if (this.primaryPublicIp == null) {
            this.primaryPublicIp = this.primaryIpConfiguration().publicIpAddress();
        }
        return primaryPublicIp;
    }

    @Override
    public String primarySubnetId() {
        return this.primaryIpConfiguration().subnetId();
    }

    @Override
    public Network primaryNetwork() throws CloudException, IOException {
        if (this.primaryNetwork == null) {
            this.primaryNetwork = this.primaryIpConfiguration().network();
        }
        return this.primaryNetwork;
    }

    @Override
    public String primaryPrivateIp() {
        return this.primaryIpConfiguration().privateIp();
    }

    @Override
    public String primaryPrivateIpAllocationMethod() {
        return this.primaryIpConfiguration().privateIpAllocationMethod();
    }

    @Override
    public List<NicIpConfiguration> ipConfigurations() {
        return Collections.unmodifiableList(this.nicIpConfigurations);
    }

    /**************************************************.
     * CreatableImpl::createResource
     **************************************************/

    @Override
    protected void createResource() throws Exception {
        NicIpConfigurationImpl.ensureConfigurations(this.nicIpConfigurations);
        ServiceResponse<NetworkInterfaceInner> response = this.client.createOrUpdate(this.resourceGroupName(),
                this.nicName,
                this.inner());
        this.setInner(response.getBody());
        initializeNicIpConfigurations();
    }

    /**************************************************.
     * Helper methods
     **************************************************/

    /**
     * @return the primary IP configuration of the network interface
     */
    private NicIpConfigurationImpl primaryIpConfiguration() {
        if (this.nicPrimaryIpConfiguration != null) {
            return this.nicPrimaryIpConfiguration;
        }

        if (isInCreateMode()) {
            this.nicPrimaryIpConfiguration = prepareNewNicIpConfiguration("primary-nic-config");
        } else {
            // Currently Azure supports only one Ip configuration and that is the primary
            // hence we pick the first one here.
            // when Azure support multiple Ip configurations then there will be a flag in
            // the IpConfiguration or a property in the network interface to identify the
            // primary so below logic will be changed.
            this.nicPrimaryIpConfiguration = (NicIpConfigurationImpl) this.nicIpConfigurations.get(0);
        }
        return this.nicPrimaryIpConfiguration;
    }

    /**
     * @return the list of DNS server IPs from the DNS settings
     */
    private List<String> dnsServerIps() {
        if (this.inner().dnsSettings().dnsServers() == null) {
            this.inner().dnsSettings().withDnsServers(new ArrayList<String>());
        }
        return this.inner().dnsSettings().dnsServers();
    }

    /**
     * Initializes the list of {@link NicIpConfiguration} that wraps {@link NetworkInterfaceInner#ipConfigurations()}.
     */
    private void initializeNicIpConfigurations() {
        if (this.inner().ipConfigurations() == null) {
            this.inner().withIpConfigurations(new ArrayList<NetworkInterfaceIPConfiguration>());
        }

        this.nicIpConfigurations = new ArrayList<>();
        for (NetworkInterfaceIPConfiguration ipConfig : this.inner().ipConfigurations()) {
            NicIpConfigurationImpl  nicIpConfiguration = new NicIpConfigurationImpl(ipConfig.name(),
                    ipConfig,
                    this,
                    this.networks,
                    this.publicIpAddresses,
                    false);
            this.nicIpConfigurations.add(nicIpConfiguration);
        }
    }

    /**
     * Gets a new Ip configuration child resource {@link NicIpConfiguration} wrapping {@link NetworkInterfaceIPConfiguration}.
     *
     * @param name the name for the new ip configuration
     * @return {@link NicIpConfiguration}
     */
    private NicIpConfigurationImpl prepareNewNicIpConfiguration(String name) {
        NicIpConfigurationImpl nicIpConfiguration = NicIpConfigurationImpl.prepareNicIpConfiguration(
                name,
                this,
                this.networks,
                this.publicIpAddresses
        );
        this.nicIpConfigurations.add(nicIpConfiguration);
        return nicIpConfiguration;
    }

    /**
     * @param prefix the prefix
     * @return a random value (derived from the resource) with the given prefix
     */
    String nameWithPrefix(String prefix) {
        return prefix + "-" + this.randomId;
    }

    void addToCreatableDependencies(Creatable<?> creatableResource) {
        super.addCreatableDependency(creatableResource);
    }

    Resource createdDependencyResource(String key) {
        return super.createdResource(key);
    }

    ResourceGroup.DefinitionCreatable newGroup() {
        return this.newGroup;
    }
}