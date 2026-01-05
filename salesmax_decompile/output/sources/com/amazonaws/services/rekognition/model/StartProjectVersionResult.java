package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartProjectVersionResult implements Serializable {
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartProjectVersionResult)) {
            return false;
        }
        StartProjectVersionResult startProjectVersionResult = (StartProjectVersionResult) obj;
        if ((startProjectVersionResult.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return startProjectVersionResult.getStatus() == null || startProjectVersionResult.getStatus().equals(getStatus());
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 31 + (getStatus() == null ? 0 : getStatus().hashCode());
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null) {
            sb.append("Status: " + getStatus());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartProjectVersionResult withStatus(String str) {
        this.status = str;
        return this;
    }

    public void setStatus(ProjectVersionStatus projectVersionStatus) {
        this.status = projectVersionStatus.toString();
    }

    public StartProjectVersionResult withStatus(ProjectVersionStatus projectVersionStatus) {
        this.status = projectVersionStatus.toString();
        return this;
    }
}
