/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingSubscriptionSummaryInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import java.util.UUID;

/**
 * Type representing BillingSubscriptionSummary.
 */
public interface BillingSubscriptionSummary extends HasInner<BillingSubscriptionSummaryInner>, HasManager<BillingManager> {
    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the billingProfileName value.
     */
    String billingProfileName();

    /**
     * @return the customerDisplayName value.
     */
    String customerDisplayName();

    /**
     * @return the customerId value.
     */
    String customerId();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * @return the invoiceSectionName value.
     */
    String invoiceSectionName();

    /**
     * @return the lastMonthCharges value.
     */
    Amount lastMonthCharges();

    /**
     * @return the monthToDateCharges value.
     */
    Amount monthToDateCharges();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the serviceProviderDescription value.
     */
    String serviceProviderDescription();

    /**
     * @return the serviceProviderId value.
     */
    String serviceProviderId();

    /**
     * @return the skuDescription value.
     */
    String skuDescription();

    /**
     * @return the skuId value.
     */
    String skuId();

    /**
     * @return the subscriptionBillingStatus value.
     */
    BillingSubscriptionStatusType subscriptionBillingStatus();

    /**
     * @return the subscriptionId value.
     */
    UUID subscriptionId();

    /**
     * @return the type value.
     */
    String type();

}