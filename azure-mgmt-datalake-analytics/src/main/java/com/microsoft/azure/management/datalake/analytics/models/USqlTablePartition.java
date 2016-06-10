/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL table partition item.
 */
public class USqlTablePartition extends CatalogItem {
    /**
     * the name of the database.
     */
    private String databaseName;

    /**
     * the name of the schema associated with this table partition and
     * database.
     */
    private String schemaName;

    /**
     * the name of the table partition.
     */
    @JsonProperty(value = "partitionName")
    private String name;

    /**
     * the Ddl object of the partition's parent.
     */
    private DdlName parentName;

    /**
     * the index ID for this partition.
     */
    private Integer indexId;

    /**
     * the list of labels associated with this partition.
     */
    private List<String> label;

    /**
     * the creation time of the partition.
     */
    private DateTime createDate;

    /**
     * Get the databaseName value.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName value.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the schemaName value.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName value.
     *
     * @param schemaName the schemaName value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parentName value.
     *
     * @return the parentName value
     */
    public DdlName parentName() {
        return this.parentName;
    }

    /**
     * Set the parentName value.
     *
     * @param parentName the parentName value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withParentName(DdlName parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get the indexId value.
     *
     * @return the indexId value
     */
    public Integer indexId() {
        return this.indexId;
    }

    /**
     * Set the indexId value.
     *
     * @param indexId the indexId value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withIndexId(Integer indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * Get the label value.
     *
     * @return the label value
     */
    public List<String> label() {
        return this.label;
    }

    /**
     * Set the label value.
     *
     * @param label the label value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withLabel(List<String> label) {
        this.label = label;
        return this;
    }

    /**
     * Get the createDate value.
     *
     * @return the createDate value
     */
    public DateTime createDate() {
        return this.createDate;
    }

    /**
     * Set the createDate value.
     *
     * @param createDate the createDate value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withCreateDate(DateTime createDate) {
        this.createDate = createDate;
        return this;
    }

}