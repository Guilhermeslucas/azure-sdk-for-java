/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.speechservices.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for CreateLanguageGenerationEndpoint operation.
 */
public class CreateLanguageGenerationEndpointHeaders {
    /**
     * The URI of the operation.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * The URI of the operation.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /**
     * The minimum number of seconds to wait before not getting this response
     * anymore.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * The limit of requests for the resource.
     */
    @JsonProperty(value = "X-RateLimit-Limit")
    private Integer xRateLimitLimit;

    /**
     * The remaining number of requests until the rate limit is reached.
     */
    @JsonProperty(value = "X-RateLimit-Remaining")
    private Integer xRateLimitRemaining;

    /**
     * The timestamp when the rate limit will be reset formatted as ISO 8601
     * combined date and time in UTC.
     */
    @JsonProperty(value = "X-RateLimit-Reset")
    private String xRateLimitReset;

    /**
     * Get the URI of the operation.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the URI of the operation.
     *
     * @param location the location value to set
     * @return the CreateLanguageGenerationEndpointHeaders object itself.
     */
    public CreateLanguageGenerationEndpointHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the URI of the operation.
     *
     * @return the operationLocation value
     */
    public String operationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the URI of the operation.
     *
     * @param operationLocation the operationLocation value to set
     * @return the CreateLanguageGenerationEndpointHeaders object itself.
     */
    public CreateLanguageGenerationEndpointHeaders withOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }

    /**
     * Get the minimum number of seconds to wait before not getting this response anymore.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the minimum number of seconds to wait before not getting this response anymore.
     *
     * @param retryAfter the retryAfter value to set
     * @return the CreateLanguageGenerationEndpointHeaders object itself.
     */
    public CreateLanguageGenerationEndpointHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get the limit of requests for the resource.
     *
     * @return the xRateLimitLimit value
     */
    public Integer xRateLimitLimit() {
        return this.xRateLimitLimit;
    }

    /**
     * Set the limit of requests for the resource.
     *
     * @param xRateLimitLimit the xRateLimitLimit value to set
     * @return the CreateLanguageGenerationEndpointHeaders object itself.
     */
    public CreateLanguageGenerationEndpointHeaders withXRateLimitLimit(Integer xRateLimitLimit) {
        this.xRateLimitLimit = xRateLimitLimit;
        return this;
    }

    /**
     * Get the remaining number of requests until the rate limit is reached.
     *
     * @return the xRateLimitRemaining value
     */
    public Integer xRateLimitRemaining() {
        return this.xRateLimitRemaining;
    }

    /**
     * Set the remaining number of requests until the rate limit is reached.
     *
     * @param xRateLimitRemaining the xRateLimitRemaining value to set
     * @return the CreateLanguageGenerationEndpointHeaders object itself.
     */
    public CreateLanguageGenerationEndpointHeaders withXRateLimitRemaining(Integer xRateLimitRemaining) {
        this.xRateLimitRemaining = xRateLimitRemaining;
        return this;
    }

    /**
     * Get the timestamp when the rate limit will be reset formatted as ISO 8601 combined date and time in UTC.
     *
     * @return the xRateLimitReset value
     */
    public String xRateLimitReset() {
        return this.xRateLimitReset;
    }

    /**
     * Set the timestamp when the rate limit will be reset formatted as ISO 8601 combined date and time in UTC.
     *
     * @param xRateLimitReset the xRateLimitReset value to set
     * @return the CreateLanguageGenerationEndpointHeaders object itself.
     */
    public CreateLanguageGenerationEndpointHeaders withXRateLimitReset(String xRateLimitReset) {
        this.xRateLimitReset = xRateLimitReset;
        return this;
    }

}