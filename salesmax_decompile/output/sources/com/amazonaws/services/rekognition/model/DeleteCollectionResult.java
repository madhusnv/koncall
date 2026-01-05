package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteCollectionResult implements Serializable {
    private Integer statusCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteCollectionResult)) {
            return false;
        }
        DeleteCollectionResult deleteCollectionResult = (DeleteCollectionResult) obj;
        if ((deleteCollectionResult.getStatusCode() == null) ^ (getStatusCode() == null)) {
            return false;
        }
        return deleteCollectionResult.getStatusCode() == null || deleteCollectionResult.getStatusCode().equals(getStatusCode());
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return 31 + (getStatusCode() == null ? 0 : getStatusCode().hashCode());
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatusCode() != null) {
            sb.append("StatusCode: " + getStatusCode());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteCollectionResult withStatusCode(Integer num) {
        this.statusCode = num;
        return this;
    }
}
