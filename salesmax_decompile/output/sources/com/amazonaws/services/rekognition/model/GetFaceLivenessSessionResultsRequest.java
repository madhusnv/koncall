package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetFaceLivenessSessionResultsRequest extends AmazonWebServiceRequest implements Serializable {
    private String sessionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetFaceLivenessSessionResultsRequest)) {
            return false;
        }
        GetFaceLivenessSessionResultsRequest getFaceLivenessSessionResultsRequest = (GetFaceLivenessSessionResultsRequest) obj;
        if ((getFaceLivenessSessionResultsRequest.getSessionId() == null) ^ (getSessionId() == null)) {
            return false;
        }
        return getFaceLivenessSessionResultsRequest.getSessionId() == null || getFaceLivenessSessionResultsRequest.getSessionId().equals(getSessionId());
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

    public GetFaceLivenessSessionResultsRequest withSessionId(String str) {
        this.sessionId = str;
        return this;
    }
}
