package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DescribeCollectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeCollectionRequest)) {
            return false;
        }
        DescribeCollectionRequest describeCollectionRequest = (DescribeCollectionRequest) obj;
        if ((describeCollectionRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        return describeCollectionRequest.getCollectionId() == null || describeCollectionRequest.getCollectionId().equals(getCollectionId());
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

    public DescribeCollectionRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }
}
