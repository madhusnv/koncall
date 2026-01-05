package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StopProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private String projectVersionArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StopProjectVersionRequest)) {
            return false;
        }
        StopProjectVersionRequest stopProjectVersionRequest = (StopProjectVersionRequest) obj;
        if ((stopProjectVersionRequest.getProjectVersionArn() == null) ^ (getProjectVersionArn() == null)) {
            return false;
        }
        return stopProjectVersionRequest.getProjectVersionArn() == null || stopProjectVersionRequest.getProjectVersionArn().equals(getProjectVersionArn());
    }

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    public int hashCode() {
        return 31 + (getProjectVersionArn() == null ? 0 : getProjectVersionArn().hashCode());
    }

    public void setProjectVersionArn(String str) {
        this.projectVersionArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectVersionArn() != null) {
            sb.append("ProjectVersionArn: " + getProjectVersionArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public StopProjectVersionRequest withProjectVersionArn(String str) {
        this.projectVersionArn = str;
        return this;
    }
}
