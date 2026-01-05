package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer maxInferenceUnits;
    private Integer minInferenceUnits;
    private String projectVersionArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartProjectVersionRequest)) {
            return false;
        }
        StartProjectVersionRequest startProjectVersionRequest = (StartProjectVersionRequest) obj;
        if ((startProjectVersionRequest.getProjectVersionArn() == null) ^ (getProjectVersionArn() == null)) {
            return false;
        }
        if (startProjectVersionRequest.getProjectVersionArn() != null && !startProjectVersionRequest.getProjectVersionArn().equals(getProjectVersionArn())) {
            return false;
        }
        if ((startProjectVersionRequest.getMinInferenceUnits() == null) ^ (getMinInferenceUnits() == null)) {
            return false;
        }
        if (startProjectVersionRequest.getMinInferenceUnits() != null && !startProjectVersionRequest.getMinInferenceUnits().equals(getMinInferenceUnits())) {
            return false;
        }
        if ((startProjectVersionRequest.getMaxInferenceUnits() == null) ^ (getMaxInferenceUnits() == null)) {
            return false;
        }
        return startProjectVersionRequest.getMaxInferenceUnits() == null || startProjectVersionRequest.getMaxInferenceUnits().equals(getMaxInferenceUnits());
    }

    public Integer getMaxInferenceUnits() {
        return this.maxInferenceUnits;
    }

    public Integer getMinInferenceUnits() {
        return this.minInferenceUnits;
    }

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    public int hashCode() {
        return (((((getProjectVersionArn() == null ? 0 : getProjectVersionArn().hashCode()) + 31) * 31) + (getMinInferenceUnits() == null ? 0 : getMinInferenceUnits().hashCode())) * 31) + (getMaxInferenceUnits() != null ? getMaxInferenceUnits().hashCode() : 0);
    }

    public void setMaxInferenceUnits(Integer num) {
        this.maxInferenceUnits = num;
    }

    public void setMinInferenceUnits(Integer num) {
        this.minInferenceUnits = num;
    }

    public void setProjectVersionArn(String str) {
        this.projectVersionArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectVersionArn() != null) {
            sb.append("ProjectVersionArn: " + getProjectVersionArn() + ",");
        }
        if (getMinInferenceUnits() != null) {
            sb.append("MinInferenceUnits: " + getMinInferenceUnits() + ",");
        }
        if (getMaxInferenceUnits() != null) {
            sb.append("MaxInferenceUnits: " + getMaxInferenceUnits());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartProjectVersionRequest withMaxInferenceUnits(Integer num) {
        this.maxInferenceUnits = num;
        return this;
    }

    public StartProjectVersionRequest withMinInferenceUnits(Integer num) {
        this.minInferenceUnits = num;
        return this;
    }

    public StartProjectVersionRequest withProjectVersionArn(String str) {
        this.projectVersionArn = str;
        return this;
    }
}
