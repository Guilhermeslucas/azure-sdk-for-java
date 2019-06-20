/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the invoice download.
 */
public class DownloadProperties {
    /**
     * Document type. Possible values include: 'Invoice', 'VoidNote',
     * 'Receipt', 'CreditNote'.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * Document URL.
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /**
     * Get document type. Possible values include: 'Invoice', 'VoidNote', 'Receipt', 'CreditNote'.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get document URL.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

}