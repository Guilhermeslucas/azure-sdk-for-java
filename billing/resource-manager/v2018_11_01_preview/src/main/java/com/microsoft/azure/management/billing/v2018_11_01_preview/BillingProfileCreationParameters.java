/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.AddressInner;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters for creating a new billing profile.
 */
public class BillingProfileCreationParameters {
    /**
     * The billing profile name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Purchase order number.
     */
    @JsonProperty(value = "poNumber")
    private String poNumber;

    /**
     * Billing address.
     */
    @JsonProperty(value = "address")
    private AddressInner address;

    /**
     * If the billing profile is opted in to receive invoices via email.
     */
    @JsonProperty(value = "invoiceEmailOptIn")
    private Boolean invoiceEmailOptIn;

    /**
     * Azure skus to enable for this billing profile..
     */
    @JsonProperty(value = "enableAzureSKUs")
    private List<EnabledAzureSKUs> enableAzureSKUs;

    /**
     * Get the billing profile name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the billing profile name.
     *
     * @param displayName the displayName value to set
     * @return the BillingProfileCreationParameters object itself.
     */
    public BillingProfileCreationParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get purchase order number.
     *
     * @return the poNumber value
     */
    public String poNumber() {
        return this.poNumber;
    }

    /**
     * Set purchase order number.
     *
     * @param poNumber the poNumber value to set
     * @return the BillingProfileCreationParameters object itself.
     */
    public BillingProfileCreationParameters withPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    /**
     * Get billing address.
     *
     * @return the address value
     */
    public AddressInner address() {
        return this.address;
    }

    /**
     * Set billing address.
     *
     * @param address the address value to set
     * @return the BillingProfileCreationParameters object itself.
     */
    public BillingProfileCreationParameters withAddress(AddressInner address) {
        this.address = address;
        return this;
    }

    /**
     * Get if the billing profile is opted in to receive invoices via email.
     *
     * @return the invoiceEmailOptIn value
     */
    public Boolean invoiceEmailOptIn() {
        return this.invoiceEmailOptIn;
    }

    /**
     * Set if the billing profile is opted in to receive invoices via email.
     *
     * @param invoiceEmailOptIn the invoiceEmailOptIn value to set
     * @return the BillingProfileCreationParameters object itself.
     */
    public BillingProfileCreationParameters withInvoiceEmailOptIn(Boolean invoiceEmailOptIn) {
        this.invoiceEmailOptIn = invoiceEmailOptIn;
        return this;
    }

    /**
     * Get azure skus to enable for this billing profile..
     *
     * @return the enableAzureSKUs value
     */
    public List<EnabledAzureSKUs> enableAzureSKUs() {
        return this.enableAzureSKUs;
    }

    /**
     * Set azure skus to enable for this billing profile..
     *
     * @param enableAzureSKUs the enableAzureSKUs value to set
     * @return the BillingProfileCreationParameters object itself.
     */
    public BillingProfileCreationParameters withEnableAzureSKUs(List<EnabledAzureSKUs> enableAzureSKUs) {
        this.enableAzureSKUs = enableAzureSKUs;
        return this;
    }

}