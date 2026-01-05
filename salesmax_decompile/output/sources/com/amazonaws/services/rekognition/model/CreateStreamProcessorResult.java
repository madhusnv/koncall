package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateStreamProcessorResult implements Serializable {
    private String streamProcessorArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateStreamProcessorResult)) {
            return false;
        }
        CreateStreamProcessorResult createStreamProcessorResult = (CreateStreamProcessorResult) obj;
        if ((createStreamProcessorResult.getStreamProcessorArn() == null) ^ (getStreamProcessorArn() == null)) {
            return false;
        }
        return createStreamProcessorResult.getStreamProcessorArn() == null || createStreamProcessorResult.getStreamProcessorArn().equals(getStreamProcessorArn());
    }

    public String getStreamProcessorArn() {
        return this.streamProcessorArn;
    }

    public int hashCode() {
        return 31 + (getStreamProcessorArn() == null ? 0 : getStreamProcessorArn().hashCode());
    }

    public void setStreamProcessorArn(String str) {
        this.streamProcessorArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamProcessorArn() != null) {
            sb.append("StreamProcessorArn: " + getStreamProcessorArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateStreamProcessorResult withStreamProcessorArn(String str) {
        this.streamProcessorArn = str;
        return this;
    }
}
