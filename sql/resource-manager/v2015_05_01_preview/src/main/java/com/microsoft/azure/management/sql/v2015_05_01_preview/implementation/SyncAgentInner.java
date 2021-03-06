/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncAgentState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An Azure SQL Database sync agent.
 */
@JsonFlatten
public class SyncAgentInner extends ProxyResource {
    /**
     * Name of the sync agent.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String syncAgentName;

    /**
     * ARM resource id of the sync database in the sync agent.
     */
    @JsonProperty(value = "properties.syncDatabaseId")
    private String syncDatabaseId;

    /**
     * Last alive time of the sync agent.
     */
    @JsonProperty(value = "properties.lastAliveTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastAliveTime;

    /**
     * State of the sync agent. Possible values include: 'Online', 'Offline',
     * 'NeverConnected'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private SyncAgentState state;

    /**
     * If the sync agent version is up to date.
     */
    @JsonProperty(value = "properties.isUpToDate", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isUpToDate;

    /**
     * Expiration time of the sync agent version.
     */
    @JsonProperty(value = "properties.expiryTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expiryTime;

    /**
     * Version of the sync agent.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Get name of the sync agent.
     *
     * @return the syncAgentName value
     */
    public String syncAgentName() {
        return this.syncAgentName;
    }

    /**
     * Get aRM resource id of the sync database in the sync agent.
     *
     * @return the syncDatabaseId value
     */
    public String syncDatabaseId() {
        return this.syncDatabaseId;
    }

    /**
     * Set aRM resource id of the sync database in the sync agent.
     *
     * @param syncDatabaseId the syncDatabaseId value to set
     * @return the SyncAgentInner object itself.
     */
    public SyncAgentInner withSyncDatabaseId(String syncDatabaseId) {
        this.syncDatabaseId = syncDatabaseId;
        return this;
    }

    /**
     * Get last alive time of the sync agent.
     *
     * @return the lastAliveTime value
     */
    public DateTime lastAliveTime() {
        return this.lastAliveTime;
    }

    /**
     * Get state of the sync agent. Possible values include: 'Online', 'Offline', 'NeverConnected'.
     *
     * @return the state value
     */
    public SyncAgentState state() {
        return this.state;
    }

    /**
     * Get if the sync agent version is up to date.
     *
     * @return the isUpToDate value
     */
    public Boolean isUpToDate() {
        return this.isUpToDate;
    }

    /**
     * Get expiration time of the sync agent version.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Get version of the sync agent.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

}
