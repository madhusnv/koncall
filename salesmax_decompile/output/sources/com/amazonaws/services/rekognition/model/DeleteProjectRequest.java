package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteProjectRequest extends AmazonWebServiceRequest implements Serializable {
    private String projectArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteProjectRequest)) {
            return false;
        }
        DeleteProjectRequest deleteProjectRequest = (DeleteProjectRequest) obj;
        if ((deleteProjectRequest.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        return deleteProjectRequest.getProjectArn() == null || deleteProjectRequest.getProjectArn().equals(getProjectArn());
    }

    public String getProjectArn() {
        return this.projectArn;
    }

    public int hashCode() {
        return 31 + (getProjectArn() == null ? 0 : getProjectArn().hashCode());
    }

    public void setProjectArn(String str) {
        this.projectArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectArn() != null) {
            sb.append("ProjectArn: " + getProjectArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteProjectRequest withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }
}
