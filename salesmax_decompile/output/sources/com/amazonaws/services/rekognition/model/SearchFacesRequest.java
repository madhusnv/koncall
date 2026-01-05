package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class SearchFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private String faceId;
    private Float faceMatchThreshold;
    private Integer maxFaces;

    public SearchFacesRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchFacesRequest)) {
            return false;
        }
        SearchFacesRequest searchFacesRequest = (SearchFacesRequest) obj;
        if ((searchFacesRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (searchFacesRequest.getCollectionId() != null && !searchFacesRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((searchFacesRequest.getFaceId() == null) ^ (getFaceId() == null)) {
            return false;
        }
        if (searchFacesRequest.getFaceId() != null && !searchFacesRequest.getFaceId().equals(getFaceId())) {
            return false;
        }
        if ((searchFacesRequest.getMaxFaces() == null) ^ (getMaxFaces() == null)) {
            return false;
        }
        if (searchFacesRequest.getMaxFaces() != null && !searchFacesRequest.getMaxFaces().equals(getMaxFaces())) {
            return false;
        }
        if ((searchFacesRequest.getFaceMatchThreshold() == null) ^ (getFaceMatchThreshold() == null)) {
            return false;
        }
        return searchFacesRequest.getFaceMatchThreshold() == null || searchFacesRequest.getFaceMatchThreshold().equals(getFaceMatchThreshold());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public String getFaceId() {
        return this.faceId;
    }

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    public Integer getMaxFaces() {
        return this.maxFaces;
    }

    public int hashCode() {
        return (((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getFaceId() == null ? 0 : getFaceId().hashCode())) * 31) + (getMaxFaces() == null ? 0 : getMaxFaces().hashCode())) * 31) + (getFaceMatchThreshold() != null ? getFaceMatchThreshold().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setFaceId(String str) {
        this.faceId = str;
    }

    public void setFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
    }

    public void setMaxFaces(Integer num) {
        this.maxFaces = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getFaceId() != null) {
            sb.append("FaceId: " + getFaceId() + ",");
        }
        if (getMaxFaces() != null) {
            sb.append("MaxFaces: " + getMaxFaces() + ",");
        }
        if (getFaceMatchThreshold() != null) {
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchFacesRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public SearchFacesRequest withFaceId(String str) {
        this.faceId = str;
        return this;
    }

    public SearchFacesRequest withFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
        return this;
    }

    public SearchFacesRequest withMaxFaces(Integer num) {
        this.maxFaces = num;
        return this;
    }

    public SearchFacesRequest(String str, String str2) {
        setCollectionId(str);
        setFaceId(str2);
    }
}
