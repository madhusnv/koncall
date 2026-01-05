package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessorInput implements Serializable {
    private KinesisVideoStream kinesisVideoStream;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessorInput)) {
            return false;
        }
        StreamProcessorInput streamProcessorInput = (StreamProcessorInput) obj;
        if ((streamProcessorInput.getKinesisVideoStream() == null) ^ (getKinesisVideoStream() == null)) {
            return false;
        }
        return streamProcessorInput.getKinesisVideoStream() == null || streamProcessorInput.getKinesisVideoStream().equals(getKinesisVideoStream());
    }

    public KinesisVideoStream getKinesisVideoStream() {
        return this.kinesisVideoStream;
    }

    public int hashCode() {
        return 31 + (getKinesisVideoStream() == null ? 0 : getKinesisVideoStream().hashCode());
    }

    public void setKinesisVideoStream(KinesisVideoStream kinesisVideoStream) {
        this.kinesisVideoStream = kinesisVideoStream;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKinesisVideoStream() != null) {
            sb.append("KinesisVideoStream: " + getKinesisVideoStream());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessorInput withKinesisVideoStream(KinesisVideoStream kinesisVideoStream) {
        this.kinesisVideoStream = kinesisVideoStream;
        return this;
    }
}
