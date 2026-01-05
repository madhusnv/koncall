package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessorSettingsForUpdate implements Serializable {
    private ConnectedHomeSettingsForUpdate connectedHomeForUpdate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessorSettingsForUpdate)) {
            return false;
        }
        StreamProcessorSettingsForUpdate streamProcessorSettingsForUpdate = (StreamProcessorSettingsForUpdate) obj;
        if ((streamProcessorSettingsForUpdate.getConnectedHomeForUpdate() == null) ^ (getConnectedHomeForUpdate() == null)) {
            return false;
        }
        return streamProcessorSettingsForUpdate.getConnectedHomeForUpdate() == null || streamProcessorSettingsForUpdate.getConnectedHomeForUpdate().equals(getConnectedHomeForUpdate());
    }

    public ConnectedHomeSettingsForUpdate getConnectedHomeForUpdate() {
        return this.connectedHomeForUpdate;
    }

    public int hashCode() {
        return 31 + (getConnectedHomeForUpdate() == null ? 0 : getConnectedHomeForUpdate().hashCode());
    }

    public void setConnectedHomeForUpdate(ConnectedHomeSettingsForUpdate connectedHomeSettingsForUpdate) {
        this.connectedHomeForUpdate = connectedHomeSettingsForUpdate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectedHomeForUpdate() != null) {
            sb.append("ConnectedHomeForUpdate: " + getConnectedHomeForUpdate());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessorSettingsForUpdate withConnectedHomeForUpdate(ConnectedHomeSettingsForUpdate connectedHomeSettingsForUpdate) {
        this.connectedHomeForUpdate = connectedHomeSettingsForUpdate;
        return this;
    }
}
