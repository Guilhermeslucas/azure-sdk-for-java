/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Frequently asked question for the service health event.
 */
public class Faq {
    /**
     * FAQ question for the service health event.
     */
    @JsonProperty(value = "question")
    private String question;

    /**
     * FAQ answer for the service health event.
     */
    @JsonProperty(value = "answer")
    private String answer;

    /**
     * FAQ locale for the service health event.
     */
    @JsonProperty(value = "localeCode")
    private String localeCode;

    /**
     * Get fAQ question for the service health event.
     *
     * @return the question value
     */
    public String question() {
        return this.question;
    }

    /**
     * Set fAQ question for the service health event.
     *
     * @param question the question value to set
     * @return the Faq object itself.
     */
    public Faq withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * Get fAQ answer for the service health event.
     *
     * @return the answer value
     */
    public String answer() {
        return this.answer;
    }

    /**
     * Set fAQ answer for the service health event.
     *
     * @param answer the answer value to set
     * @return the Faq object itself.
     */
    public Faq withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Get fAQ locale for the service health event.
     *
     * @return the localeCode value
     */
    public String localeCode() {
        return this.localeCode;
    }

    /**
     * Set fAQ locale for the service health event.
     *
     * @param localeCode the localeCode value to set
     * @return the Faq object itself.
     */
    public Faq withLocaleCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

}