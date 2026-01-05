package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class SearchFacesByImageRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private Float faceMatchThreshold;
    private Image image;
    private Integer maxFaces;
    private String qualityFilter;

    public SearchFacesByImageRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchFacesByImageRequest)) {
            return false;
        }
        SearchFacesByImageRequest searchFacesByImageRequest = (SearchFacesByImageRequest) obj;
        if ((searchFacesByImageRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (searchFacesByImageRequest.getCollectionId() != null && !searchFacesByImageRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((searchFacesByImageRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (searchFacesByImageRequest.getImage() != null && !searchFacesByImageRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((searchFacesByImageRequest.getMaxFaces() == null) ^ (getMaxFaces() == null)) {
            return false;
        }
        if (searchFacesByImageRequest.getMaxFaces() != null && !searchFacesByImageRequest.getMaxFaces().equals(getMaxFaces())) {
            return false;
        }
        if ((searchFacesByImageRequest.getFaceMatchThreshold() == null) ^ (getFaceMatchThreshold() == null)) {
            return false;
        }
        if (searchFacesByImageRequest.getFaceMatchThreshold() != null && !searchFacesByImageRequest.getFaceMatchThreshold().equals(getFaceMatchThreshold())) {
            return false;
        }
        if ((searchFacesByImageRequest.getQualityFilter() == null) ^ (getQualityFilter() == null)) {
            return false;
        }
        return searchFacesByImageRequest.getQualityFilter() == null || searchFacesByImageRequest.getQualityFilter().equals(getQualityFilter());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    public Image getImage() {
        return this.image;
    }

    public Integer getMaxFaces() {
        return this.maxFaces;
    }

    public String getQualityFilter() {
        return this.qualityFilter;
    }

    public int hashCode() {
        return (((((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getImage() == null ? 0 : getImage().hashCode())) * 31) + (getMaxFaces() == null ? 0 : getMaxFaces().hashCode())) * 31) + (getFaceMatchThreshold() == null ? 0 : getFaceMatchThreshold().hashCode())) * 31) + (getQualityFilter() != null ? getQualityFilter().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setMaxFaces(Integer num) {
        this.maxFaces = num;
    }

    public void setQualityFilter(String str) {
        this.qualityFilter = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getImage() != null) {
            sb.append("Image: " + getImage() + ",");
        }
        if (getMaxFaces() != null) {
            sb.append("MaxFaces: " + getMaxFaces() + ",");
        }
        if (getFaceMatchThreshold() != null) {
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold() + ",");
        }
        if (getQualityFilter() != null) {
            sb.append("QualityFilter: " + getQualityFilter());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchFacesByImageRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public SearchFacesByImageRequest withFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
        return this;
    }

    public SearchFacesByImageRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public SearchFacesByImageRequest withMaxFaces(Integer num) {
        this.maxFaces = num;
        return this;
    }

    public SearchFacesByImageRequest withQualityFilter(String str) {
        this.qualityFilter = str;
        return this;
    }

    public SearchFacesByImageRequest(String str, Image image) {
        setCollectionId(str);
        setImage(image);
    }

    public void setQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
    }

    public SearchFacesByImageRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
        return this;
    }
}
