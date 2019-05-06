/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.MetadataSupportedValueDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The metadata entity contract.
 */
@JsonFlatten
public class MetadataEntityInner extends ProxyResource {
    /**
     * The display name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The list of keys on which this entity depends on.
     */
    @JsonProperty(value = "properties.dependsOn")
    private List<String> dependsOn;

    /**
     * The list of supported values.
     */
    @JsonProperty(value = "properties.supportedValues")
    private List<MetadataSupportedValueDetail> supportedValues;

    /**
     * Get the display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name.
     *
     * @param displayName the displayName value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the list of keys on which this entity depends on.
     *
     * @return the dependsOn value
     */
    public List<String> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the list of keys on which this entity depends on.
     *
     * @param dependsOn the dependsOn value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the list of supported values.
     *
     * @return the supportedValues value
     */
    public List<MetadataSupportedValueDetail> supportedValues() {
        return this.supportedValues;
    }

    /**
     * Set the list of supported values.
     *
     * @param supportedValues the supportedValues value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withSupportedValues(List<MetadataSupportedValueDetail> supportedValues) {
        this.supportedValues = supportedValues;
        return this;
    }

}