package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private String projectVersionArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteProjectVersionRequest)) {
            return false;
        }
        DeleteProjectVersionRequest deleteProjectVersionRequest = (DeleteProjectVersionRequest) obj;
        if ((deleteProjectVersionRequest.getProjectVersionArn() == null) ^ (getProjectVersionArn() == null)) {
            return false;
        }
        return deleteProjectVersionRequest.getProjectVersionArn() == null || deleteProjectVersionRequest.getProjectVersionArn().equals(getProjectVersionArn());
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

    public DeleteProjectVersionRequest withProjectVersionArn(String str) {
        this.projectVersionArn = str;
        return this;
    }
}
