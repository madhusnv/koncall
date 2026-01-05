package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartStreamProcessorResult implements Serializable {
    private String sessionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartStreamProcessorResult)) {
            return false;
        }
        StartStreamProcessorResult startStreamProcessorResult = (StartStreamProcessorResult) obj;
        if ((startStreamProcessorResult.getSessionId() == null) ^ (getSessionId() == null)) {
            return false;
        }
        return startStreamProcessorResult.getSessionId() == null || startStreamProcessorResult.getSessionId().equals(getSessionId());
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return 31 + (getSessionId() == null ? 0 : getSessionId().hashCode());
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSessionId() != null) {
            sb.append("SessionId: " + getSessionId());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartStreamProcessorResult withSessionId(String str) {
        this.sessionId = str;
        return this;
    }
}
