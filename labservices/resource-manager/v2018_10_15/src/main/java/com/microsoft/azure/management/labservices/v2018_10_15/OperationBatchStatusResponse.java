/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.LabServicesManager;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.OperationBatchStatusResponseInner;
import java.util.List;

/**
 * Type representing OperationBatchStatusResponse.
 */
public interface OperationBatchStatusResponse extends HasInner<OperationBatchStatusResponseInner>, HasManager<LabServicesManager> {
    /**
     * @return the items value.
     */
    List<OperationBatchStatusResponseItem> items();

}
