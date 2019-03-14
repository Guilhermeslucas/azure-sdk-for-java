/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for GetMemberGroups API call.
 */
public class UserGetMemberGroupsParameters {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * If true, only membership in security-enabled groups should be checked.
     * Otherwise, membership in all groups should be checked.
     */
    @JsonProperty(value = "securityEnabledOnly", required = true)
    private boolean securityEnabledOnly;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the UserGetMemberGroupsParameters object itself.
     */
    public UserGetMemberGroupsParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get if true, only membership in security-enabled groups should be checked. Otherwise, membership in all groups should be checked.
     *
     * @return the securityEnabledOnly value
     */
    public boolean securityEnabledOnly() {
        return this.securityEnabledOnly;
    }

    /**
     * Set if true, only membership in security-enabled groups should be checked. Otherwise, membership in all groups should be checked.
     *
     * @param securityEnabledOnly the securityEnabledOnly value to set
     * @return the UserGetMemberGroupsParameters object itself.
     */
    public UserGetMemberGroupsParameters withSecurityEnabledOnly(boolean securityEnabledOnly) {
        this.securityEnabledOnly = securityEnabledOnly;
        return this;
    }

}