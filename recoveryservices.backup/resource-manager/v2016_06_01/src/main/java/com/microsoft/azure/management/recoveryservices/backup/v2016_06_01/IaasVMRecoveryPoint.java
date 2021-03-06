/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.RecoveryPointInner;

/**
 * Azure VM (also known as IaaS VM) workload-specific backup copy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("IaasVMRecoveryPoint")
public class IaasVMRecoveryPoint extends RecoveryPointInner {
    /**
     * Type of the backup copy.
     */
    @JsonProperty(value = "recoveryPointType")
    private String recoveryPointType;

    /**
     * The date and time when the backup copy was created.
     */
    @JsonProperty(value = "recoveryPointTime")
    private DateTime recoveryPointTime;

    /**
     * Additional information associated with this backup copy.
     */
    @JsonProperty(value = "recoveryPointAdditionalInfo")
    private String recoveryPointAdditionalInfo;

    /**
     * The storage type for the VM whose backup copy was created.
     */
    @JsonProperty(value = "sourceVMStorageType")
    private String sourceVMStorageType;

    /**
     * Identifies whether the VM was encrypted when the backup copy is created.
     */
    @JsonProperty(value = "isSourceVMEncrypted")
    private Boolean isSourceVMEncrypted;

    /**
     * Required details for recovering an encrypted VM. Applicable only when
     * IsSourceVMEncrypted is true.
     */
    @JsonProperty(value = "keyAndSecret")
    private KeyAndSecretDetails keyAndSecret;

    /**
     * Answer to the question - Is the session to recover items from this
     * backup copy still active.
     */
    @JsonProperty(value = "isInstantILRSessionActive")
    private Boolean isInstantILRSessionActive;

    /**
     * Get type of the backup copy.
     *
     * @return the recoveryPointType value
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set type of the backup copy.
     *
     * @param recoveryPointType the recoveryPointType value to set
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointType(String recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the date and time when the backup copy was created.
     *
     * @return the recoveryPointTime value
     */
    public DateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the date and time when the backup copy was created.
     *
     * @param recoveryPointTime the recoveryPointTime value to set
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointTime(DateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get additional information associated with this backup copy.
     *
     * @return the recoveryPointAdditionalInfo value
     */
    public String recoveryPointAdditionalInfo() {
        return this.recoveryPointAdditionalInfo;
    }

    /**
     * Set additional information associated with this backup copy.
     *
     * @param recoveryPointAdditionalInfo the recoveryPointAdditionalInfo value to set
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withRecoveryPointAdditionalInfo(String recoveryPointAdditionalInfo) {
        this.recoveryPointAdditionalInfo = recoveryPointAdditionalInfo;
        return this;
    }

    /**
     * Get the storage type for the VM whose backup copy was created.
     *
     * @return the sourceVMStorageType value
     */
    public String sourceVMStorageType() {
        return this.sourceVMStorageType;
    }

    /**
     * Set the storage type for the VM whose backup copy was created.
     *
     * @param sourceVMStorageType the sourceVMStorageType value to set
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withSourceVMStorageType(String sourceVMStorageType) {
        this.sourceVMStorageType = sourceVMStorageType;
        return this;
    }

    /**
     * Get identifies whether the VM was encrypted when the backup copy is created.
     *
     * @return the isSourceVMEncrypted value
     */
    public Boolean isSourceVMEncrypted() {
        return this.isSourceVMEncrypted;
    }

    /**
     * Set identifies whether the VM was encrypted when the backup copy is created.
     *
     * @param isSourceVMEncrypted the isSourceVMEncrypted value to set
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsSourceVMEncrypted(Boolean isSourceVMEncrypted) {
        this.isSourceVMEncrypted = isSourceVMEncrypted;
        return this;
    }

    /**
     * Get required details for recovering an encrypted VM. Applicable only when IsSourceVMEncrypted is true.
     *
     * @return the keyAndSecret value
     */
    public KeyAndSecretDetails keyAndSecret() {
        return this.keyAndSecret;
    }

    /**
     * Set required details for recovering an encrypted VM. Applicable only when IsSourceVMEncrypted is true.
     *
     * @param keyAndSecret the keyAndSecret value to set
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withKeyAndSecret(KeyAndSecretDetails keyAndSecret) {
        this.keyAndSecret = keyAndSecret;
        return this;
    }

    /**
     * Get answer to the question - Is the session to recover items from this backup copy still active.
     *
     * @return the isInstantILRSessionActive value
     */
    public Boolean isInstantILRSessionActive() {
        return this.isInstantILRSessionActive;
    }

    /**
     * Set answer to the question - Is the session to recover items from this backup copy still active.
     *
     * @param isInstantILRSessionActive the isInstantILRSessionActive value to set
     * @return the IaasVMRecoveryPoint object itself.
     */
    public IaasVMRecoveryPoint withIsInstantILRSessionActive(Boolean isInstantILRSessionActive) {
        this.isInstantILRSessionActive = isInstantILRSessionActive;
        return this;
    }

}
