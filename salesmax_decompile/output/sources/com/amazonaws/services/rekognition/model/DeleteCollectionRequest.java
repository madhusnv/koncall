package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteCollectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;

    public DeleteCollectionRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteCollectionRequest)) {
            return false;
        }
        DeleteCollectionRequest deleteCollectionRequest = (DeleteCollectionRequest) obj;
        if ((deleteCollectionRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        return deleteCollectionRequest.getCollectionId() == null || deleteCollectionRequest.getCollectionId().equals(getCollectionId());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public int hashCode() {
        return 31 + (getCollectionId() == null ? 0 : getCollectionId().hashCode());
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteCollectionRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public DeleteCollectionRequest(String str) {
        setCollectionId(str);
    }
}
