/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.MongoCollectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.DocumentDBManager;
import java.util.Map;
import java.util.List;

/**
 * Type representing MongoCollection.
 */
public interface MongoCollection extends HasInner<MongoCollectionInner>, Indexable, Refreshable<MongoCollection>, Updatable<MongoCollection.Update>, HasManager<DocumentDBManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the indexes value.
     */
    List<MongoIndex> indexes();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the mongoCollectionId value.
     */
    String mongoCollectionId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the shardKey value.
     */
    Map<String, String> shardKey();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the MongoCollection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of MongoCollection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a MongoCollection definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the mongocollection definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, accountName, databaseRid.
            * @param resourceGroupName Name of an Azure resource group
            * @param accountName Cosmos DB database account name
            * @param databaseRid Cosmos DB database rid
            * @return the next definition stage
            */
            WithOptions withExistingDatabasis(String resourceGroupName, String accountName, String databaseRid);
        }

        /**
         * The stage of the mongocollection definition allowing to specify Options.
         */
        interface WithOptions {
           /**
            * Specifies options.
            * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request
            * @return the next definition stage
            */
            WithResource withOptions(Map<String, String> options);
        }

        /**
         * The stage of the mongocollection definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a Mongo collection
            * @return the next definition stage
            */
            WithCreate withResource(MongoCollectionResource resource);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<MongoCollection> {
        }
    }
    /**
     * The template for a MongoCollection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<MongoCollection> {
    }

    /**
     * Grouping of MongoCollection update stages.
     */
    interface UpdateStages {
    }
}
