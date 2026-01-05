package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateFaceLivenessSessionRequestSettings implements Serializable {
    private Integer auditImagesLimit;
    private LivenessOutputConfig outputConfig;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateFaceLivenessSessionRequestSettings)) {
            return false;
        }
        CreateFaceLivenessSessionRequestSettings createFaceLivenessSessionRequestSettings = (CreateFaceLivenessSessionRequestSettings) obj;
        if ((createFaceLivenessSessionRequestSettings.getOutputConfig() == null) ^ (getOutputConfig() == null)) {
            return false;
        }
        if (createFaceLivenessSessionRequestSettings.getOutputConfig() != null && !createFaceLivenessSessionRequestSettings.getOutputConfig().equals(getOutputConfig())) {
            return false;
        }
        if ((createFaceLivenessSessionRequestSettings.getAuditImagesLimit() == null) ^ (getAuditImagesLimit() == null)) {
            return false;
        }
        return createFaceLivenessSessionRequestSettings.getAuditImagesLimit() == null || createFaceLivenessSessionRequestSettings.getAuditImagesLimit().equals(getAuditImagesLimit());
    }

    public Integer getAuditImagesLimit() {
        return this.auditImagesLimit;
    }

    public LivenessOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public int hashCode() {
        return (((getOutputConfig() == null ? 0 : getOutputConfig().hashCode()) + 31) * 31) + (getAuditImagesLimit() != null ? getAuditImagesLimit().hashCode() : 0);
    }

    public void setAuditImagesLimit(Integer num) {
        this.auditImagesLimit = num;
    }

    public void setOutputConfig(LivenessOutputConfig livenessOutputConfig) {
        this.outputConfig = livenessOutputConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOutputConfig() != null) {
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        }
        if (getAuditImagesLimit() != null) {
            sb.append("AuditImagesLimit: " + getAuditImagesLimit());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateFaceLivenessSessionRequestSettings withAuditImagesLimit(Integer num) {
        this.auditImagesLimit = num;
        return this;
    }

    public CreateFaceLivenessSessionRequestSettings withOutputConfig(LivenessOutputConfig livenessOutputConfig) {
        this.outputConfig = livenessOutputConfig;
        return this;
    }
}
