/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.ServiceTagsListResultInner;
import java.util.List;

/**
 * Type representing ServiceTagsListResult.
 */
public interface ServiceTagsListResult extends HasInner<ServiceTagsListResultInner>, HasManager<NetworkManager> {
    /**
     * @return the changeNumber value.
     */
    String changeNumber();

    /**
     * @return the cloud value.
     */
    String cloud();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the values value.
     */
    List<ServiceTagInformation> values();

}