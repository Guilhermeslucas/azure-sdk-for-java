/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TestMigrationState.
 */
public final class TestMigrationState extends ExpandableStringEnum<TestMigrationState> {
    /** Static value None for TestMigrationState. */
    public static final TestMigrationState NONE = fromString("None");

    /** Static value TestMigrationInProgress for TestMigrationState. */
    public static final TestMigrationState TEST_MIGRATION_IN_PROGRESS = fromString("TestMigrationInProgress");

    /** Static value TestMigrationSucceeded for TestMigrationState. */
    public static final TestMigrationState TEST_MIGRATION_SUCCEEDED = fromString("TestMigrationSucceeded");

    /** Static value TestMigrationFailed for TestMigrationState. */
    public static final TestMigrationState TEST_MIGRATION_FAILED = fromString("TestMigrationFailed");

    /** Static value TestMigrationCleanupInProgress for TestMigrationState. */
    public static final TestMigrationState TEST_MIGRATION_CLEANUP_IN_PROGRESS = fromString("TestMigrationCleanupInProgress");

    /**
     * Creates or finds a TestMigrationState from its string representation.
     * @param name a name to look for
     * @return the corresponding TestMigrationState
     */
    @JsonCreator
    public static TestMigrationState fromString(String name) {
        return fromString(name, TestMigrationState.class);
    }

    /**
     * @return known TestMigrationState values
     */
    public static Collection<TestMigrationState> values() {
        return values(TestMigrationState.class);
    }
}
