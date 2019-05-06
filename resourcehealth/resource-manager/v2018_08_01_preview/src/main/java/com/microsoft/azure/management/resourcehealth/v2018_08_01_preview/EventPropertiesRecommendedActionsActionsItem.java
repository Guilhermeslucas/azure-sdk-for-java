/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recommended action for the service health event.
 */
public class EventPropertiesRecommendedActionsActionsItem {
    /**
     * Recommended action group Id for the service health event.
     */
    @JsonProperty(value = "groupId")
    private Integer groupId;

    /**
     * Recommended action text.
     */
    @JsonProperty(value = "actionText")
    private String actionText;

    /**
     * Get recommended action group Id for the service health event.
     *
     * @return the groupId value
     */
    public Integer groupId() {
        return this.groupId;
    }

    /**
     * Set recommended action group Id for the service health event.
     *
     * @param groupId the groupId value to set
     * @return the EventPropertiesRecommendedActionsActionsItem object itself.
     */
    public EventPropertiesRecommendedActionsActionsItem withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get recommended action text.
     *
     * @return the actionText value
     */
    public String actionText() {
        return this.actionText;
    }

    /**
     * Set recommended action text.
     *
     * @param actionText the actionText value to set
     * @return the EventPropertiesRecommendedActionsActionsItem object itself.
     */
    public EventPropertiesRecommendedActionsActionsItem withActionText(String actionText) {
        this.actionText = actionText;
        return this;
    }

}