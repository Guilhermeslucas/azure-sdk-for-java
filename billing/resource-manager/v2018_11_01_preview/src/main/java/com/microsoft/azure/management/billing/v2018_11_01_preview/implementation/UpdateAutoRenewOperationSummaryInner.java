/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Summary of cancel product operation.
 */
@JsonFlatten
public class UpdateAutoRenewOperationSummaryInner {
    /**
     * The end date of this asset.
     */
    @JsonProperty(value = "properties.endDate")
    private DateTime endDate;

    /**
     * Get the end date of this asset.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the end date of this asset.
     *
     * @param endDate the endDate value to set
     * @return the UpdateAutoRenewOperationSummaryInner object itself.
     */
    public UpdateAutoRenewOperationSummaryInner withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

}