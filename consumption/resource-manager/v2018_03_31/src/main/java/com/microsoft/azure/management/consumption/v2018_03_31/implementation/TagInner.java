/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_03_31.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The tag resource.
 */
public class TagInner {
    /**
     * Tag key.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get tag key.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set tag key.
     *
     * @param key the key value to set
     * @return the TagInner object itself.
     */
    public TagInner withKey(String key) {
        this.key = key;
        return this;
    }

}