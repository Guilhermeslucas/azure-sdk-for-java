/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionsBillingPermissions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPermissionsListResult;

class InvoiceSectionsBillingPermissionsImpl extends WrapperImpl<InvoiceSectionsBillingPermissionsInner> implements InvoiceSectionsBillingPermissions {
    private final BillingManager manager;

    InvoiceSectionsBillingPermissionsImpl(BillingManager manager) {
        super(manager.inner().invoiceSectionsBillingPermissions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingPermissionsListResult> listAsync(String billingAccountName, String invoiceSectionName) {
        InvoiceSectionsBillingPermissionsInner client = this.inner();
        return client.listAsync(billingAccountName, invoiceSectionName)
        .map(new Func1<BillingPermissionsListResultInner, BillingPermissionsListResult>() {
            @Override
            public BillingPermissionsListResult call(BillingPermissionsListResultInner inner) {
                return new BillingPermissionsListResultImpl(inner, manager());
            }
        });
    }

}