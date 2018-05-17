/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights.implementation;

import com.microsoft.azure.management.customerinsights.EntityTypes;
import java.util.Map;
import com.microsoft.azure.management.customerinsights.CalculationWindowTypes;
import com.microsoft.azure.management.customerinsights.KpiFunctions;
import java.util.List;
import com.microsoft.azure.management.customerinsights.KpiGroupByMetadata;
import com.microsoft.azure.management.customerinsights.KpiParticipantProfilesMetadata;
import com.microsoft.azure.management.customerinsights.ProvisioningStates;
import com.microsoft.azure.management.customerinsights.KpiThresholds;
import com.microsoft.azure.management.customerinsights.KpiAlias;
import com.microsoft.azure.management.customerinsights.KpiExtract;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the KPI Threshold limits.
 */
public class KpiDefinitionInner {
    /**
     * The mapping entity type. Possible values include: 'None', 'Profile',
     * 'Interaction', 'Relationship'.
     */
    @JsonProperty(value = "entityType", required = true)
    private EntityTypes entityType;

    /**
     * The mapping entity name.
     */
    @JsonProperty(value = "entityTypeName", required = true)
    private String entityTypeName;

    /**
     * The hub name.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The KPI name.
     */
    @JsonProperty(value = "kpiName", access = JsonProperty.Access.WRITE_ONLY)
    private String kpiName;

    /**
     * Localized display name for the KPI.
     */
    @JsonProperty(value = "displayName")
    private Map<String, String> displayName;

    /**
     * Localized description for the KPI.
     */
    @JsonProperty(value = "description")
    private Map<String, String> description;

    /**
     * The calculation window. Possible values include: 'Lifetime', 'Hour',
     * 'Day', 'Week', 'Month'.
     */
    @JsonProperty(value = "calculationWindow", required = true)
    private CalculationWindowTypes calculationWindow;

    /**
     * Name of calculation window field.
     */
    @JsonProperty(value = "calculationWindowFieldName")
    private String calculationWindowFieldName;

    /**
     * The computation function for the KPI. Possible values include: 'Sum',
     * 'Avg', 'Min', 'Max', 'Last', 'Count', 'None', 'CountDistinct'.
     */
    @JsonProperty(value = "function", required = true)
    private KpiFunctions function;

    /**
     * The computation expression for the KPI.
     */
    @JsonProperty(value = "expression", required = true)
    private String expression;

    /**
     * The unit of measurement for the KPI.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * The filter expression for the KPI.
     */
    @JsonProperty(value = "filter")
    private String filter;

    /**
     * the group by properties for the KPI.
     */
    @JsonProperty(value = "groupBy")
    private List<String> groupBy;

    /**
     * The KPI GroupByMetadata.
     */
    @JsonProperty(value = "groupByMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private List<KpiGroupByMetadata> groupByMetadata;

    /**
     * The participant profiles.
     */
    @JsonProperty(value = "participantProfilesMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private List<KpiParticipantProfilesMetadata> participantProfilesMetadata;

    /**
     * Provisioning state. Possible values include: 'Provisioning',
     * 'Succeeded', 'Expiring', 'Deleting', 'HumanIntervention', 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStates provisioningState;

    /**
     * The KPI thresholds.
     */
    @JsonProperty(value = "thresHolds")
    private KpiThresholds thresHolds;

    /**
     * The aliases.
     */
    @JsonProperty(value = "aliases")
    private List<KpiAlias> aliases;

    /**
     * The KPI extracts.
     */
    @JsonProperty(value = "extracts")
    private List<KpiExtract> extracts;

    /**
     * Get the entityType value.
     *
     * @return the entityType value
     */
    public EntityTypes entityType() {
        return this.entityType;
    }

    /**
     * Set the entityType value.
     *
     * @param entityType the entityType value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withEntityType(EntityTypes entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get the entityTypeName value.
     *
     * @return the entityTypeName value
     */
    public String entityTypeName() {
        return this.entityTypeName;
    }

    /**
     * Set the entityTypeName value.
     *
     * @param entityTypeName the entityTypeName value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the kpiName value.
     *
     * @return the kpiName value
     */
    public String kpiName() {
        return this.kpiName;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public Map<String, String> displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withDisplayName(Map<String, String> displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public Map<String, String> description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    /**
     * Get the calculationWindow value.
     *
     * @return the calculationWindow value
     */
    public CalculationWindowTypes calculationWindow() {
        return this.calculationWindow;
    }

    /**
     * Set the calculationWindow value.
     *
     * @param calculationWindow the calculationWindow value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withCalculationWindow(CalculationWindowTypes calculationWindow) {
        this.calculationWindow = calculationWindow;
        return this;
    }

    /**
     * Get the calculationWindowFieldName value.
     *
     * @return the calculationWindowFieldName value
     */
    public String calculationWindowFieldName() {
        return this.calculationWindowFieldName;
    }

    /**
     * Set the calculationWindowFieldName value.
     *
     * @param calculationWindowFieldName the calculationWindowFieldName value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withCalculationWindowFieldName(String calculationWindowFieldName) {
        this.calculationWindowFieldName = calculationWindowFieldName;
        return this;
    }

    /**
     * Get the function value.
     *
     * @return the function value
     */
    public KpiFunctions function() {
        return this.function;
    }

    /**
     * Set the function value.
     *
     * @param function the function value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withFunction(KpiFunctions function) {
        this.function = function;
        return this;
    }

    /**
     * Get the expression value.
     *
     * @return the expression value
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression value.
     *
     * @param expression the expression value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the filter value.
     *
     * @return the filter value
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set the filter value.
     *
     * @param filter the filter value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the groupBy value.
     *
     * @return the groupBy value
     */
    public List<String> groupBy() {
        return this.groupBy;
    }

    /**
     * Set the groupBy value.
     *
     * @param groupBy the groupBy value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * Get the groupByMetadata value.
     *
     * @return the groupByMetadata value
     */
    public List<KpiGroupByMetadata> groupByMetadata() {
        return this.groupByMetadata;
    }

    /**
     * Get the participantProfilesMetadata value.
     *
     * @return the participantProfilesMetadata value
     */
    public List<KpiParticipantProfilesMetadata> participantProfilesMetadata() {
        return this.participantProfilesMetadata;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningStates provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the thresHolds value.
     *
     * @return the thresHolds value
     */
    public KpiThresholds thresHolds() {
        return this.thresHolds;
    }

    /**
     * Set the thresHolds value.
     *
     * @param thresHolds the thresHolds value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withThresHolds(KpiThresholds thresHolds) {
        this.thresHolds = thresHolds;
        return this;
    }

    /**
     * Get the aliases value.
     *
     * @return the aliases value
     */
    public List<KpiAlias> aliases() {
        return this.aliases;
    }

    /**
     * Set the aliases value.
     *
     * @param aliases the aliases value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withAliases(List<KpiAlias> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Get the extracts value.
     *
     * @return the extracts value
     */
    public List<KpiExtract> extracts() {
        return this.extracts;
    }

    /**
     * Set the extracts value.
     *
     * @param extracts the extracts value to set
     * @return the KpiDefinitionInner object itself.
     */
    public KpiDefinitionInner withExtracts(List<KpiExtract> extracts) {
        this.extracts = extracts;
        return this;
    }

}