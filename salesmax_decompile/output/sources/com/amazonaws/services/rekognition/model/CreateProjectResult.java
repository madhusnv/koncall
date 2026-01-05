package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateProjectResult implements Serializable {
    private String projectArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateProjectResult)) {
            return false;
        }
        CreateProjectResult createProjectResult = (CreateProjectResult) obj;
        if ((createProjectResult.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        return createProjectResult.getProjectArn() == null || createProjectResult.getProjectArn().equals(getProjectArn());
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

    public CreateProjectResult withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }
}
