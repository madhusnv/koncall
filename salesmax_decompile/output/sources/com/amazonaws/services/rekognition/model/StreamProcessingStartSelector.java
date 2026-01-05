package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessingStartSelector implements Serializable {
    private KinesisVideoStreamStartSelector kVSStreamStartSelector;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessingStartSelector)) {
            return false;
        }
        StreamProcessingStartSelector streamProcessingStartSelector = (StreamProcessingStartSelector) obj;
        if ((streamProcessingStartSelector.getKVSStreamStartSelector() == null) ^ (getKVSStreamStartSelector() == null)) {
            return false;
        }
        return streamProcessingStartSelector.getKVSStreamStartSelector() == null || streamProcessingStartSelector.getKVSStreamStartSelector().equals(getKVSStreamStartSelector());
    }

    public KinesisVideoStreamStartSelector getKVSStreamStartSelector() {
        return this.kVSStreamStartSelector;
    }

    public int hashCode() {
        return 31 + (getKVSStreamStartSelector() == null ? 0 : getKVSStreamStartSelector().hashCode());
    }

    public void setKVSStreamStartSelector(KinesisVideoStreamStartSelector kinesisVideoStreamStartSelector) {
        this.kVSStreamStartSelector = kinesisVideoStreamStartSelector;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKVSStreamStartSelector() != null) {
            sb.append("KVSStreamStartSelector: " + getKVSStreamStartSelector());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessingStartSelector withKVSStreamStartSelector(KinesisVideoStreamStartSelector kinesisVideoStreamStartSelector) {
        this.kVSStreamStartSelector = kinesisVideoStreamStartSelector;
        return this;
    }
}
