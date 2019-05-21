/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mariadb.v2018_06_01.implementation.LogFileInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mariadb.v2018_06_01.implementation.DBforMariaDBManager;
import org.joda.time.DateTime;

/**
 * Type representing LogFile.
 */
public interface LogFile extends HasInner<LogFileInner>, HasManager<DBforMariaDBManager> {
    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the logFileType value.
     */
    String logFileType();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sizeInKB value.
     */
    Long sizeInKB();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the url value.
     */
    String url();

}
