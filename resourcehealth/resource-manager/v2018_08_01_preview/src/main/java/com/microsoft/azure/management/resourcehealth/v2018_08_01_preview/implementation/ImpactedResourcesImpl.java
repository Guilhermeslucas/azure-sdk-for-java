/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.ImpactedResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.ImpactedResourceStatus;

class ImpactedResourcesImpl extends WrapperImpl<ImpactedResourcesInner> implements ImpactedResources {
    private PagedListConverter<ImpactedResourceStatusInner, ImpactedResourceStatus> converter;
    private final ResourceHealthManager manager;

    ImpactedResourcesImpl(ResourceHealthManager manager) {
        super(manager.inner().impactedResources());
        this.manager = manager;
        this.converter = new PagedListConverter<ImpactedResourceStatusInner, ImpactedResourceStatus>() {
            @Override
            public Observable<ImpactedResourceStatus> typeConvertAsync(ImpactedResourceStatusInner inner) {
                return Observable.just((ImpactedResourceStatus) wrapModel(inner));
            }
        };
    }

    public ResourceHealthManager manager() {
        return this.manager;
    }

    private ImpactedResourceStatusImpl wrapModel(ImpactedResourceStatusInner inner) {
        return  new ImpactedResourceStatusImpl(inner, manager());
    }

    @Override
    public PagedList<ImpactedResourceStatus> list() {
        ImpactedResourcesInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<ImpactedResourceStatus> listAsync() {
        ImpactedResourcesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ImpactedResourceStatusInner>, Iterable<ImpactedResourceStatusInner>>() {
            @Override
            public Iterable<ImpactedResourceStatusInner> call(Page<ImpactedResourceStatusInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ImpactedResourceStatusInner, ImpactedResourceStatus>() {
            @Override
            public ImpactedResourceStatus call(ImpactedResourceStatusInner inner) {
                return wrapModel(inner);
            }
        });
    }

}