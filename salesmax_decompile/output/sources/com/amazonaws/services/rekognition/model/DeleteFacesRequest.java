package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DeleteFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private List<String> faceIds;

    public DeleteFacesRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteFacesRequest)) {
            return false;
        }
        DeleteFacesRequest deleteFacesRequest = (DeleteFacesRequest) obj;
        if ((deleteFacesRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (deleteFacesRequest.getCollectionId() != null && !deleteFacesRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((deleteFacesRequest.getFaceIds() == null) ^ (getFaceIds() == null)) {
            return false;
        }
        return deleteFacesRequest.getFaceIds() == null || deleteFacesRequest.getFaceIds().equals(getFaceIds());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public List<String> getFaceIds() {
        return this.faceIds;
    }

    public int hashCode() {
        return (((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getFaceIds() != null ? getFaceIds().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setFaceIds(Collection<String> collection) {
        if (collection == null) {
            this.faceIds = null;
        } else {
            this.faceIds = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getFaceIds() != null) {
            sb.append("FaceIds: " + getFaceIds());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteFacesRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public DeleteFacesRequest withFaceIds(String... strArr) {
        if (getFaceIds() == null) {
            this.faceIds = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.faceIds.add(str);
        }
        return this;
    }

    public DeleteFacesRequest(String str, List<String> list) {
        setCollectionId(str);
        setFaceIds(list);
    }

    public DeleteFacesRequest withFaceIds(Collection<String> collection) {
        setFaceIds(collection);
        return this;
    }
}
