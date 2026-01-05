package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class KinesisVideoStreamStartSelector implements Serializable {
    private String fragmentNumber;
    private Long producerTimestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof KinesisVideoStreamStartSelector)) {
            return false;
        }
        KinesisVideoStreamStartSelector kinesisVideoStreamStartSelector = (KinesisVideoStreamStartSelector) obj;
        if ((kinesisVideoStreamStartSelector.getProducerTimestamp() == null) ^ (getProducerTimestamp() == null)) {
            return false;
        }
        if (kinesisVideoStreamStartSelector.getProducerTimestamp() != null && !kinesisVideoStreamStartSelector.getProducerTimestamp().equals(getProducerTimestamp())) {
            return false;
        }
        if ((kinesisVideoStreamStartSelector.getFragmentNumber() == null) ^ (getFragmentNumber() == null)) {
            return false;
        }
        return kinesisVideoStreamStartSelector.getFragmentNumber() == null || kinesisVideoStreamStartSelector.getFragmentNumber().equals(getFragmentNumber());
    }

    public String getFragmentNumber() {
        return this.fragmentNumber;
    }

    public Long getProducerTimestamp() {
        return this.producerTimestamp;
    }

    public int hashCode() {
        return (((getProducerTimestamp() == null ? 0 : getProducerTimestamp().hashCode()) + 31) * 31) + (getFragmentNumber() != null ? getFragmentNumber().hashCode() : 0);
    }

    public void setFragmentNumber(String str) {
        this.fragmentNumber = str;
    }

    public void setProducerTimestamp(Long l) {
        this.producerTimestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProducerTimestamp() != null) {
            sb.append("ProducerTimestamp: " + getProducerTimestamp() + ",");
        }
        if (getFragmentNumber() != null) {
            sb.append("FragmentNumber: " + getFragmentNumber());
        }
        sb.append("}");
        return sb.toString();
    }

    public KinesisVideoStreamStartSelector withFragmentNumber(String str) {
        this.fragmentNumber = str;
        return this;
    }

    public KinesisVideoStreamStartSelector withProducerTimestamp(Long l) {
        this.producerTimestamp = l;
        return this;
    }
}
