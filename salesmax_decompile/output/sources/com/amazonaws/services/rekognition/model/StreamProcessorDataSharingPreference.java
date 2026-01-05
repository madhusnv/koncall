package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessorDataSharingPreference implements Serializable {
    private Boolean optIn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessorDataSharingPreference)) {
            return false;
        }
        StreamProcessorDataSharingPreference streamProcessorDataSharingPreference = (StreamProcessorDataSharingPreference) obj;
        if ((streamProcessorDataSharingPreference.getOptIn() == null) ^ (getOptIn() == null)) {
            return false;
        }
        return streamProcessorDataSharingPreference.getOptIn() == null || streamProcessorDataSharingPreference.getOptIn().equals(getOptIn());
    }

    public Boolean getOptIn() {
        return this.optIn;
    }

    public int hashCode() {
        return 31 + (getOptIn() == null ? 0 : getOptIn().hashCode());
    }

    public Boolean isOptIn() {
        return this.optIn;
    }

    public void setOptIn(Boolean bool) {
        this.optIn = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOptIn() != null) {
            sb.append("OptIn: " + getOptIn());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessorDataSharingPreference withOptIn(Boolean bool) {
        this.optIn = bool;
        return this;
    }
}
