package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessorOutput implements Serializable {
    private KinesisDataStream kinesisDataStream;
    private S3Destination s3Destination;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessorOutput)) {
            return false;
        }
        StreamProcessorOutput streamProcessorOutput = (StreamProcessorOutput) obj;
        if ((streamProcessorOutput.getKinesisDataStream() == null) ^ (getKinesisDataStream() == null)) {
            return false;
        }
        if (streamProcessorOutput.getKinesisDataStream() != null && !streamProcessorOutput.getKinesisDataStream().equals(getKinesisDataStream())) {
            return false;
        }
        if ((streamProcessorOutput.getS3Destination() == null) ^ (getS3Destination() == null)) {
            return false;
        }
        return streamProcessorOutput.getS3Destination() == null || streamProcessorOutput.getS3Destination().equals(getS3Destination());
    }

    public KinesisDataStream getKinesisDataStream() {
        return this.kinesisDataStream;
    }

    public S3Destination getS3Destination() {
        return this.s3Destination;
    }

    public int hashCode() {
        return (((getKinesisDataStream() == null ? 0 : getKinesisDataStream().hashCode()) + 31) * 31) + (getS3Destination() != null ? getS3Destination().hashCode() : 0);
    }

    public void setKinesisDataStream(KinesisDataStream kinesisDataStream) {
        this.kinesisDataStream = kinesisDataStream;
    }

    public void setS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKinesisDataStream() != null) {
            sb.append("KinesisDataStream: " + getKinesisDataStream() + ",");
        }
        if (getS3Destination() != null) {
            sb.append("S3Destination: " + getS3Destination());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessorOutput withKinesisDataStream(KinesisDataStream kinesisDataStream) {
        this.kinesisDataStream = kinesisDataStream;
        return this;
    }

    public StreamProcessorOutput withS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
        return this;
    }
}
