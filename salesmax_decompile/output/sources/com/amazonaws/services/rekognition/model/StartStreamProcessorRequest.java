package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartStreamProcessorRequest extends AmazonWebServiceRequest implements Serializable {
    private String name;
    private StreamProcessingStartSelector startSelector;
    private StreamProcessingStopSelector stopSelector;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartStreamProcessorRequest)) {
            return false;
        }
        StartStreamProcessorRequest startStreamProcessorRequest = (StartStreamProcessorRequest) obj;
        if ((startStreamProcessorRequest.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (startStreamProcessorRequest.getName() != null && !startStreamProcessorRequest.getName().equals(getName())) {
            return false;
        }
        if ((startStreamProcessorRequest.getStartSelector() == null) ^ (getStartSelector() == null)) {
            return false;
        }
        if (startStreamProcessorRequest.getStartSelector() != null && !startStreamProcessorRequest.getStartSelector().equals(getStartSelector())) {
            return false;
        }
        if ((startStreamProcessorRequest.getStopSelector() == null) ^ (getStopSelector() == null)) {
            return false;
        }
        return startStreamProcessorRequest.getStopSelector() == null || startStreamProcessorRequest.getStopSelector().equals(getStopSelector());
    }

    public String getName() {
        return this.name;
    }

    public StreamProcessingStartSelector getStartSelector() {
        return this.startSelector;
    }

    public StreamProcessingStopSelector getStopSelector() {
        return this.stopSelector;
    }

    public int hashCode() {
        return (((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getStartSelector() == null ? 0 : getStartSelector().hashCode())) * 31) + (getStopSelector() != null ? getStopSelector().hashCode() : 0);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStartSelector(StreamProcessingStartSelector streamProcessingStartSelector) {
        this.startSelector = streamProcessingStartSelector;
    }

    public void setStopSelector(StreamProcessingStopSelector streamProcessingStopSelector) {
        this.stopSelector = streamProcessingStopSelector;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getStartSelector() != null) {
            sb.append("StartSelector: " + getStartSelector() + ",");
        }
        if (getStopSelector() != null) {
            sb.append("StopSelector: " + getStopSelector());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartStreamProcessorRequest withName(String str) {
        this.name = str;
        return this;
    }

    public StartStreamProcessorRequest withStartSelector(StreamProcessingStartSelector streamProcessingStartSelector) {
        this.startSelector = streamProcessingStartSelector;
        return this;
    }

    public StartStreamProcessorRequest withStopSelector(StreamProcessingStopSelector streamProcessingStopSelector) {
        this.stopSelector = streamProcessingStopSelector;
        return this;
    }
}
