/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A JSON object that identities the image to get insights of . It also
 * includes the optional crop area that you use to identify the region of
 * interest in the image.
 */
public class ImageInfo {
    /**
     * An image insights token. To get the insights token, call one of the
     * Image Search APIs (for example, /images/search). In the search results,
     * the
     * [Image](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#image)
     * object's
     * [imageInsightsToken](https://docs.microsoft.com/en-us/rest/api/cognitiveservices/bing-images-api-v7-reference#image-imageinsightstoken)
     * field contains the token. The imageInsightsToken and url fields mutually
     * exclusive; do not specify both. Do not specify an insights token if the
     * request includes the image form data.
     */
    @JsonProperty(value = "imageInsightsToken")
    private String imageInsightsToken;

    /**
     * The URL of the input image. The imageInsightsToken and url fields are
     * mutually exclusive; do not specify both. Do not specify the URL if the
     * request includes the image form data.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * A JSON object consisting of coordinates specifying the four corners of a
     * cropped rectangle within the input image. Use the crop area to identify
     * the region of interest in the image. You can apply the crop area to the
     * images specified using the imageInsightsToken or url fields, or an image
     * binary specified in an image form data.
     */
    @JsonProperty(value = "cropArea")
    private CropArea cropArea;

    /**
     * Get the imageInsightsToken value.
     *
     * @return the imageInsightsToken value
     */
    public String imageInsightsToken() {
        return this.imageInsightsToken;
    }

    /**
     * Set the imageInsightsToken value.
     *
     * @param imageInsightsToken the imageInsightsToken value to set
     * @return the ImageInfo object itself.
     */
    public ImageInfo withImageInsightsToken(String imageInsightsToken) {
        this.imageInsightsToken = imageInsightsToken;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the ImageInfo object itself.
     */
    public ImageInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the cropArea value.
     *
     * @return the cropArea value
     */
    public CropArea cropArea() {
        return this.cropArea;
    }

    /**
     * Set the cropArea value.
     *
     * @param cropArea the cropArea value to set
     * @return the ImageInfo object itself.
     */
    public ImageInfo withCropArea(CropArea cropArea) {
        this.cropArea = cropArea;
        return this;
    }

}
