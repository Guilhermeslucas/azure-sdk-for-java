/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2018_08_20_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.healthcareapis.v2018_08_20_preview.implementation.HealthcareApisManager;
import com.microsoft.azure.management.healthcareapis.v2018_08_20_preview.implementation.ServicesDescriptionInner;

/**
 * Type representing ServicesDescription.
 */
public interface ServicesDescription extends HasInner<ServicesDescriptionInner>, Resource, GroupableResourceCore<HealthcareApisManager, ServicesDescriptionInner>, HasResourceGroup, Refreshable<ServicesDescription>, Updatable<ServicesDescription.Update>, HasManager<HealthcareApisManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the properties value.
     */
    ServicesProperties properties();

    /**
     * The entirety of the ServicesDescription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithKind, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServicesDescription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServicesDescription definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ServicesDescription definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithKind> {
        }

        /**
         * The stage of the servicesdescription definition allowing to specify Kind.
         */
        interface WithKind {
           /**
            * Specifies kind.
            * @param kind The kind of the service. Valid values are: fhir
            * @return the next definition stage
*/
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the servicesdescription definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag An etag associated with the resource, used for optimistic concurrency when editing it
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the servicesdescription definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The common properties of a service
             * @return the next definition stage
             */
            WithCreate withProperties(ServicesProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServicesDescription>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEtag, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a ServicesDescription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServicesDescription>, Resource.UpdateWithTags<Update>, UpdateStages.WithEtag, UpdateStages.WithProperties {
    }

    /**
     * Grouping of ServicesDescription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the servicesdescription update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag An etag associated with the resource, used for optimistic concurrency when editing it
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the servicesdescription update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The common properties of a service
             * @return the next update stage
             */
            Update withProperties(ServicesProperties properties);
        }

    }
}