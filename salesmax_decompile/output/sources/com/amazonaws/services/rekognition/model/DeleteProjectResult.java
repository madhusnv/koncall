package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteProjectResult implements Serializable {
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteProjectResult)) {
            return false;
        }
        DeleteProjectResult deleteProjectResult = (DeleteProjectResult) obj;
        if ((deleteProjectResult.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        return deleteProjectResult.getStatus() == null || deleteProjectResult.getStatus().equals(getStatus());
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 31 + (getStatus() == null ? 0 : getStatus().hashCode());
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null) {
            sb.append("Status: " + getStatus());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteProjectResult withStatus(String str) {
        this.status = str;
        return this;
    }

    public void setStatus(ProjectStatus projectStatus) {
        this.status = projectStatus.toString();
    }

    public DeleteProjectResult withStatus(ProjectStatus projectStatus) {
        this.status = projectStatus.toString();
        return this;
    }
}
