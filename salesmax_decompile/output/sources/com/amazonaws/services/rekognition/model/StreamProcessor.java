package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessor implements Serializable {
    private String name;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessor)) {
            return false;
        }
        StreamProcessor streamProcessor = (StreamProcessor) obj;
        if ((streamProcessor.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (streamProcessor.getName() != null && !streamProcessor.getName().equals(getName())) {
            return false;
        }
        if ((streamProcessor.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return streamProcessor.getStatus() == null || streamProcessor.getStatus().equals(getStatus());
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getStatus() != null ? getStatus().hashCode() : 0);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getStatus() != null) {
            sb.append("Status: " + getStatus());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessor withName(String str) {
        this.name = str;
        return this;
    }

    public StreamProcessor withStatus(String str) {
        this.status = str;
        return this;
    }

    public void setStatus(StreamProcessorStatus streamProcessorStatus) {
        this.status = streamProcessorStatus.toString();
    }

    public StreamProcessor withStatus(StreamProcessorStatus streamProcessorStatus) {
        this.status = streamProcessorStatus.toString();
        return this;
    }
}
