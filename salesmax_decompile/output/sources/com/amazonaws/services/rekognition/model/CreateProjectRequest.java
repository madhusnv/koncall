package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateProjectRequest extends AmazonWebServiceRequest implements Serializable {
    private String projectName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateProjectRequest)) {
            return false;
        }
        CreateProjectRequest createProjectRequest = (CreateProjectRequest) obj;
        if ((createProjectRequest.getProjectName() == null) ^ (getProjectName() == null)) {
            return false;
        }
        return createProjectRequest.getProjectName() == null || createProjectRequest.getProjectName().equals(getProjectName());
    }

    public String getProjectName() {
        return this.projectName;
    }

    public int hashCode() {
        return 31 + (getProjectName() == null ? 0 : getProjectName().hashCode());
    }

    public void setProjectName(String str) {
        this.projectName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectName() != null) {
            sb.append("ProjectName: " + getProjectName());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateProjectRequest withProjectName(String str) {
        this.projectName = str;
        return this;
    }
}
