package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartContentModerationResult implements Serializable {
    private String jobId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartContentModerationResult)) {
            return false;
        }
        StartContentModerationResult startContentModerationResult = (StartContentModerationResult) obj;
        if ((startContentModerationResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        return startContentModerationResult.getJobId() == null || startContentModerationResult.getJobId().equals(getJobId());
    }

    public String getJobId() {
        return this.jobId;
    }

    public int hashCode() {
        return 31 + (getJobId() == null ? 0 : getJobId().hashCode());
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null) {
            sb.append("JobId: " + getJobId());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartContentModerationResult withJobId(String str) {
        this.jobId = str;
        return this;
    }
}
