package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessorSettings implements Serializable {
    private ConnectedHomeSettings connectedHome;
    private FaceSearchSettings faceSearch;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessorSettings)) {
            return false;
        }
        StreamProcessorSettings streamProcessorSettings = (StreamProcessorSettings) obj;
        if ((streamProcessorSettings.getFaceSearch() == null) ^ (getFaceSearch() == null)) {
            return false;
        }
        if (streamProcessorSettings.getFaceSearch() != null && !streamProcessorSettings.getFaceSearch().equals(getFaceSearch())) {
            return false;
        }
        if ((streamProcessorSettings.getConnectedHome() == null) ^ (getConnectedHome() == null)) {
            return false;
        }
        return streamProcessorSettings.getConnectedHome() == null || streamProcessorSettings.getConnectedHome().equals(getConnectedHome());
    }

    public ConnectedHomeSettings getConnectedHome() {
        return this.connectedHome;
    }

    public FaceSearchSettings getFaceSearch() {
        return this.faceSearch;
    }

    public int hashCode() {
        return (((getFaceSearch() == null ? 0 : getFaceSearch().hashCode()) + 31) * 31) + (getConnectedHome() != null ? getConnectedHome().hashCode() : 0);
    }

    public void setConnectedHome(ConnectedHomeSettings connectedHomeSettings) {
        this.connectedHome = connectedHomeSettings;
    }

    public void setFaceSearch(FaceSearchSettings faceSearchSettings) {
        this.faceSearch = faceSearchSettings;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceSearch() != null) {
            sb.append("FaceSearch: " + getFaceSearch() + ",");
        }
        if (getConnectedHome() != null) {
            sb.append("ConnectedHome: " + getConnectedHome());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessorSettings withConnectedHome(ConnectedHomeSettings connectedHomeSettings) {
        this.connectedHome = connectedHomeSettings;
        return this;
    }

    public StreamProcessorSettings withFaceSearch(FaceSearchSettings faceSearchSettings) {
        this.faceSearch = faceSearchSettings;
        return this;
    }
}
