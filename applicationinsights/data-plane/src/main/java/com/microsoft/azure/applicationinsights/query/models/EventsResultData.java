/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Events query result data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("eventsResultData")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "trace", value = EventsTraceResult.class),
    @JsonSubTypes.Type(name = "customEvent", value = EventsCustomEventResult.class),
    @JsonSubTypes.Type(name = "pageView", value = EventsPageViewResult.class),
    @JsonSubTypes.Type(name = "browserTiming", value = EventsBrowserTimingResult.class),
    @JsonSubTypes.Type(name = "request", value = EventsRequestResult.class),
    @JsonSubTypes.Type(name = "dependency", value = EventsDependencyResult.class),
    @JsonSubTypes.Type(name = "exception", value = EventsExceptionResult.class),
    @JsonSubTypes.Type(name = "availabilityResult", value = EventsAvailabilityResultResult.class),
    @JsonSubTypes.Type(name = "performanceCounter", value = EventsPerformanceCounterResult.class),
    @JsonSubTypes.Type(name = "customMetric", value = EventsCustomMetricResult.class)
})
public class EventsResultData {
    /**
     * The unique ID for this event.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Count of the event.
     */
    @JsonProperty(value = "count")
    private Long count;

    /**
     * Timestamp of the event.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Custom dimensions of the event.
     */
    @JsonProperty(value = "customDimensions")
    private EventsResultDataCustomDimensions customDimensions;

    /**
     * Custom measurements of the event.
     */
    @JsonProperty(value = "customMeasurements")
    private EventsResultDataCustomMeasurements customMeasurements;

    /**
     * Operation info of the event.
     */
    @JsonProperty(value = "operation")
    private EventsOperationInfo operation;

    /**
     * Session info of the event.
     */
    @JsonProperty(value = "session")
    private EventsSessionInfo session;

    /**
     * User info of the event.
     */
    @JsonProperty(value = "user")
    private EventsUserInfo user;

    /**
     * Cloud info of the event.
     */
    @JsonProperty(value = "cloud")
    private EventsCloudInfo cloud;

    /**
     * AI info of the event.
     */
    @JsonProperty(value = "ai")
    private EventsAiInfo ai;

    /**
     * Application info of the event.
     */
    @JsonProperty(value = "application")
    private EventsApplicationInfo application;

    /**
     * Client info of the event.
     */
    @JsonProperty(value = "client")
    private EventsClientInfo client;

    /**
     * Get the unique ID for this event.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the unique ID for this event.
     *
     * @param id the id value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get count of the event.
     *
     * @return the count value
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set count of the event.
     *
     * @param count the count value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get timestamp of the event.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set timestamp of the event.
     *
     * @param timestamp the timestamp value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get custom dimensions of the event.
     *
     * @return the customDimensions value
     */
    public EventsResultDataCustomDimensions customDimensions() {
        return this.customDimensions;
    }

    /**
     * Set custom dimensions of the event.
     *
     * @param customDimensions the customDimensions value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withCustomDimensions(EventsResultDataCustomDimensions customDimensions) {
        this.customDimensions = customDimensions;
        return this;
    }

    /**
     * Get custom measurements of the event.
     *
     * @return the customMeasurements value
     */
    public EventsResultDataCustomMeasurements customMeasurements() {
        return this.customMeasurements;
    }

    /**
     * Set custom measurements of the event.
     *
     * @param customMeasurements the customMeasurements value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withCustomMeasurements(EventsResultDataCustomMeasurements customMeasurements) {
        this.customMeasurements = customMeasurements;
        return this;
    }

    /**
     * Get operation info of the event.
     *
     * @return the operation value
     */
    public EventsOperationInfo operation() {
        return this.operation;
    }

    /**
     * Set operation info of the event.
     *
     * @param operation the operation value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withOperation(EventsOperationInfo operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get session info of the event.
     *
     * @return the session value
     */
    public EventsSessionInfo session() {
        return this.session;
    }

    /**
     * Set session info of the event.
     *
     * @param session the session value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withSession(EventsSessionInfo session) {
        this.session = session;
        return this;
    }

    /**
     * Get user info of the event.
     *
     * @return the user value
     */
    public EventsUserInfo user() {
        return this.user;
    }

    /**
     * Set user info of the event.
     *
     * @param user the user value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withUser(EventsUserInfo user) {
        this.user = user;
        return this;
    }

    /**
     * Get cloud info of the event.
     *
     * @return the cloud value
     */
    public EventsCloudInfo cloud() {
        return this.cloud;
    }

    /**
     * Set cloud info of the event.
     *
     * @param cloud the cloud value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withCloud(EventsCloudInfo cloud) {
        this.cloud = cloud;
        return this;
    }

    /**
     * Get aI info of the event.
     *
     * @return the ai value
     */
    public EventsAiInfo ai() {
        return this.ai;
    }

    /**
     * Set aI info of the event.
     *
     * @param ai the ai value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withAi(EventsAiInfo ai) {
        this.ai = ai;
        return this;
    }

    /**
     * Get application info of the event.
     *
     * @return the application value
     */
    public EventsApplicationInfo application() {
        return this.application;
    }

    /**
     * Set application info of the event.
     *
     * @param application the application value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withApplication(EventsApplicationInfo application) {
        this.application = application;
        return this;
    }

    /**
     * Get client info of the event.
     *
     * @return the client value
     */
    public EventsClientInfo client() {
        return this.client;
    }

    /**
     * Set client info of the event.
     *
     * @param client the client value to set
     * @return the EventsResultData object itself.
     */
    public EventsResultData withClient(EventsClientInfo client) {
        this.client = client;
        return this;
    }

}