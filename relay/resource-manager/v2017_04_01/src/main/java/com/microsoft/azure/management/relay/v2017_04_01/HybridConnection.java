/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.relay.v2017_04_01.implementation.HybridConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.relay.v2017_04_01.implementation.RelayManager;
import org.joda.time.DateTime;

/**
 * Type representing HybridConnection.
 */
public interface HybridConnection extends HasInner<HybridConnectionInner>, Indexable, Refreshable<HybridConnection>, Updatable<HybridConnection.Update>, HasManager<RelayManager> {
    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the listenerCount value.
     */
    Integer listenerCount();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the requiresClientAuthorization value.
     */
    Boolean requiresClientAuthorization();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updatedAt value.
     */
    DateTime updatedAt();

    /**
     * @return the userMetadata value.
     */
    String userMetadata();

    /**
     * The entirety of the HybridConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of HybridConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a HybridConnection definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the hybridconnection definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param namespaceName The namespace name
            * @return the next definition stage
            */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify RequiresClientAuthorization.
         */
        interface WithRequiresClientAuthorization {
            /**
             * Specifies requiresClientAuthorization.
             * @param requiresClientAuthorization Returns true if client authorization is needed for this hybrid connection; otherwise, false
             * @return the next definition stage
             */
            WithCreate withRequiresClientAuthorization(Boolean requiresClientAuthorization);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify UserMetadata.
         */
        interface WithUserMetadata {
            /**
             * Specifies userMetadata.
             * @param userMetadata The userMetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored
             * @return the next definition stage
             */
            WithCreate withUserMetadata(String userMetadata);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<HybridConnection>, DefinitionStages.WithRequiresClientAuthorization, DefinitionStages.WithUserMetadata {
        }
    }
    /**
     * The template for a HybridConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<HybridConnection>, UpdateStages.WithRequiresClientAuthorization, UpdateStages.WithUserMetadata {
    }

    /**
     * Grouping of HybridConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the hybridconnection update allowing to specify RequiresClientAuthorization.
         */
        interface WithRequiresClientAuthorization {
            /**
             * Specifies requiresClientAuthorization.
             * @param requiresClientAuthorization Returns true if client authorization is needed for this hybrid connection; otherwise, false
             * @return the next update stage
             */
            Update withRequiresClientAuthorization(Boolean requiresClientAuthorization);
        }

        /**
         * The stage of the hybridconnection update allowing to specify UserMetadata.
         */
        interface WithUserMetadata {
            /**
             * Specifies userMetadata.
             * @param userMetadata The userMetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored
             * @return the next update stage
             */
            Update withUserMetadata(String userMetadata);
        }

    }
}