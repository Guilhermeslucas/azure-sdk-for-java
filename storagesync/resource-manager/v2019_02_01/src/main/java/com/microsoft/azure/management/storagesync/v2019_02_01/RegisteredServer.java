/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2019_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storagesync.v2019_02_01.implementation.RegisteredServerInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storagesync.v2019_02_01.implementation.StorageSyncManager;

/**
 * Type representing RegisteredServer.
 */
public interface RegisteredServer extends HasInner<RegisteredServerInner>, Indexable, Refreshable<RegisteredServer>, Updatable<RegisteredServer.Update>, HasManager<StorageSyncManager> {
    /**
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * @return the clusterName value.
     */
    String clusterName();

    /**
     * @return the discoveryEndpointUri value.
     */
    String discoveryEndpointUri();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastHeartBeat value.
     */
    String lastHeartBeat();

    /**
     * @return the lastOperationName value.
     */
    String lastOperationName();

    /**
     * @return the lastWorkflowId value.
     */
    String lastWorkflowId();

    /**
     * @return the managementEndpointUri value.
     */
    String managementEndpointUri();

    /**
     * @return the monitoringConfiguration value.
     */
    String monitoringConfiguration();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceLocation value.
     */
    String resourceLocation();

    /**
     * @return the serverCertificate value.
     */
    String serverCertificate();

    /**
     * @return the serverId value.
     */
    String serverId();

    /**
     * @return the serverManagementErrorCode value.
     */
    Integer serverManagementErrorCode();

    /**
     * @return the serverOSVersion value.
     */
    String serverOSVersion();

    /**
     * @return the serverRole value.
     */
    String serverRole();

    /**
     * @return the serviceLocation value.
     */
    String serviceLocation();

    /**
     * @return the storageSyncServiceUid value.
     */
    String storageSyncServiceUid();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the RegisteredServer definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageSyncService, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RegisteredServer definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RegisteredServer definition.
         */
        interface Blank extends WithStorageSyncService {
        }

        /**
         * The stage of the registeredserver definition allowing to specify StorageSyncService.
         */
        interface WithStorageSyncService {
           /**
            * Specifies resourceGroupName, storageSyncServiceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param storageSyncServiceName Name of Storage Sync Service resource
            * @return the next definition stage
            */
            WithCreate withExistingStorageSyncService(String resourceGroupName, String storageSyncServiceName);
        }

        /**
         * The stage of the registeredserver definition allowing to specify AgentVersion.
         */
        interface WithAgentVersion {
            /**
             * Specifies agentVersion.
             * @param agentVersion Registered Server Agent Version
             * @return the next definition stage
             */
            WithCreate withAgentVersion(String agentVersion);
        }

        /**
         * The stage of the registeredserver definition allowing to specify ClusterId.
         */
        interface WithClusterId {
            /**
             * Specifies clusterId.
             * @param clusterId Registered Server clusterId
             * @return the next definition stage
             */
            WithCreate withClusterId(String clusterId);
        }

        /**
         * The stage of the registeredserver definition allowing to specify ClusterName.
         */
        interface WithClusterName {
            /**
             * Specifies clusterName.
             * @param clusterName Registered Server clusterName
             * @return the next definition stage
             */
            WithCreate withClusterName(String clusterName);
        }

        /**
         * The stage of the registeredserver definition allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly Name
             * @return the next definition stage
             */
            WithCreate withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the registeredserver definition allowing to specify LastHeartBeat.
         */
        interface WithLastHeartBeat {
            /**
             * Specifies lastHeartBeat.
             * @param lastHeartBeat Registered Server last heart beat
             * @return the next definition stage
             */
            WithCreate withLastHeartBeat(String lastHeartBeat);
        }

        /**
         * The stage of the registeredserver definition allowing to specify ServerCertificate.
         */
        interface WithServerCertificate {
            /**
             * Specifies serverCertificate.
             * @param serverCertificate Registered Server Certificate
             * @return the next definition stage
             */
            WithCreate withServerCertificate(String serverCertificate);
        }

        /**
         * The stage of the registeredserver definition allowing to specify ServerId.
         */
        interface WithServerId {
            /**
             * Specifies serverId.
             * @param serverId Registered Server serverId
             * @return the next definition stage
             */
            WithCreate withServerId(String serverId);
        }

        /**
         * The stage of the registeredserver definition allowing to specify ServerOSVersion.
         */
        interface WithServerOSVersion {
            /**
             * Specifies serverOSVersion.
             * @param serverOSVersion Registered Server OS Version
             * @return the next definition stage
             */
            WithCreate withServerOSVersion(String serverOSVersion);
        }

        /**
         * The stage of the registeredserver definition allowing to specify ServerRole.
         */
        interface WithServerRole {
            /**
             * Specifies serverRole.
             * @param serverRole Registered Server serverRole
             * @return the next definition stage
             */
            WithCreate withServerRole(String serverRole);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RegisteredServer>, DefinitionStages.WithAgentVersion, DefinitionStages.WithClusterId, DefinitionStages.WithClusterName, DefinitionStages.WithFriendlyName, DefinitionStages.WithLastHeartBeat, DefinitionStages.WithServerCertificate, DefinitionStages.WithServerId, DefinitionStages.WithServerOSVersion, DefinitionStages.WithServerRole {
        }
    }
    /**
     * The template for a RegisteredServer update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RegisteredServer>, UpdateStages.WithAgentVersion, UpdateStages.WithClusterId, UpdateStages.WithClusterName, UpdateStages.WithFriendlyName, UpdateStages.WithLastHeartBeat, UpdateStages.WithServerCertificate, UpdateStages.WithServerId, UpdateStages.WithServerOSVersion, UpdateStages.WithServerRole {
    }

    /**
     * Grouping of RegisteredServer update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the registeredserver update allowing to specify AgentVersion.
         */
        interface WithAgentVersion {
            /**
             * Specifies agentVersion.
             * @param agentVersion Registered Server Agent Version
             * @return the next update stage
             */
            Update withAgentVersion(String agentVersion);
        }

        /**
         * The stage of the registeredserver update allowing to specify ClusterId.
         */
        interface WithClusterId {
            /**
             * Specifies clusterId.
             * @param clusterId Registered Server clusterId
             * @return the next update stage
             */
            Update withClusterId(String clusterId);
        }

        /**
         * The stage of the registeredserver update allowing to specify ClusterName.
         */
        interface WithClusterName {
            /**
             * Specifies clusterName.
             * @param clusterName Registered Server clusterName
             * @return the next update stage
             */
            Update withClusterName(String clusterName);
        }

        /**
         * The stage of the registeredserver update allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly Name
             * @return the next update stage
             */
            Update withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the registeredserver update allowing to specify LastHeartBeat.
         */
        interface WithLastHeartBeat {
            /**
             * Specifies lastHeartBeat.
             * @param lastHeartBeat Registered Server last heart beat
             * @return the next update stage
             */
            Update withLastHeartBeat(String lastHeartBeat);
        }

        /**
         * The stage of the registeredserver update allowing to specify ServerCertificate.
         */
        interface WithServerCertificate {
            /**
             * Specifies serverCertificate.
             * @param serverCertificate Registered Server Certificate
             * @return the next update stage
             */
            Update withServerCertificate(String serverCertificate);
        }

        /**
         * The stage of the registeredserver update allowing to specify ServerId.
         */
        interface WithServerId {
            /**
             * Specifies serverId.
             * @param serverId Registered Server serverId
             * @return the next update stage
             */
            Update withServerId(String serverId);
        }

        /**
         * The stage of the registeredserver update allowing to specify ServerOSVersion.
         */
        interface WithServerOSVersion {
            /**
             * Specifies serverOSVersion.
             * @param serverOSVersion Registered Server OS Version
             * @return the next update stage
             */
            Update withServerOSVersion(String serverOSVersion);
        }

        /**
         * The stage of the registeredserver update allowing to specify ServerRole.
         */
        interface WithServerRole {
            /**
             * Specifies serverRole.
             * @param serverRole Registered Server serverRole
             * @return the next update stage
             */
            Update withServerRole(String serverRole);
        }

    }
}