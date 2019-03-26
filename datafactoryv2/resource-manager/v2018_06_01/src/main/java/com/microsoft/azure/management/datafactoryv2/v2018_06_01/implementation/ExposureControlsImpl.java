/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ExposureControls;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ExposureControlResponse;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ExposureControlRequest;

class ExposureControlsImpl extends WrapperImpl<ExposureControlsInner> implements ExposureControls {
    private final DataFactoryManager manager;

    ExposureControlsImpl(DataFactoryManager manager) {
        super(manager.inner().exposureControls());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExposureControlResponse> getFeatureValueAsync(String locationId, ExposureControlRequest exposureControlRequest) {
        ExposureControlsInner client = this.inner();
        return client.getFeatureValueAsync(locationId, exposureControlRequest)
        .map(new Func1<ExposureControlResponseInner, ExposureControlResponse>() {
            @Override
            public ExposureControlResponse call(ExposureControlResponseInner inner) {
                return new ExposureControlResponseImpl(inner, manager());
            }
        });
    }

}