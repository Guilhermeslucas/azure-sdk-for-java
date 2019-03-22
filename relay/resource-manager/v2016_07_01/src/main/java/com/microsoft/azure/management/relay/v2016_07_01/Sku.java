/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2016_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sku of the Namespace.
 */
public class Sku {
    /**
     * Name of this Sku.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The tier of this particular SKU.
     */
    @JsonProperty(value = "tier", required = true)
    private String tier;

    /**
     * Creates an instance of Sku class.
     */
    public Sku() {
        name = "Standard";
        tier = "Standard";
    }

    /**
     * Get name of this Sku.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of this Sku.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier of this particular SKU.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier of this particular SKU.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
        return this;
    }

}