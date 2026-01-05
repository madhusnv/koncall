package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class IndexFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private List<String> detectionAttributes;
    private String externalImageId;
    private Image image;
    private Integer maxFaces;
    private String qualityFilter;

    public IndexFacesRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IndexFacesRequest)) {
            return false;
        }
        IndexFacesRequest indexFacesRequest = (IndexFacesRequest) obj;
        if ((indexFacesRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (indexFacesRequest.getCollectionId() != null && !indexFacesRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((indexFacesRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (indexFacesRequest.getImage() != null && !indexFacesRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((indexFacesRequest.getExternalImageId() == null) ^ (getExternalImageId() == null)) {
            return false;
        }
        if (indexFacesRequest.getExternalImageId() != null && !indexFacesRequest.getExternalImageId().equals(getExternalImageId())) {
            return false;
        }
        if ((indexFacesRequest.getDetectionAttributes() == null) ^ (getDetectionAttributes() == null)) {
            return false;
        }
        if (indexFacesRequest.getDetectionAttributes() != null && !indexFacesRequest.getDetectionAttributes().equals(getDetectionAttributes())) {
            return false;
        }
        if ((indexFacesRequest.getMaxFaces() == null) ^ (getMaxFaces() == null)) {
            return false;
        }
        if (indexFacesRequest.getMaxFaces() != null && !indexFacesRequest.getMaxFaces().equals(getMaxFaces())) {
            return false;
        }
        if ((indexFacesRequest.getQualityFilter() == null) ^ (getQualityFilter() == null)) {
            return false;
        }
        return indexFacesRequest.getQualityFilter() == null || indexFacesRequest.getQualityFilter().equals(getQualityFilter());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public List<String> getDetectionAttributes() {
        return this.detectionAttributes;
    }

    public String getExternalImageId() {
        return this.externalImageId;
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
        return (((((((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getImage() == null ? 0 : getImage().hashCode())) * 31) + (getExternalImageId() == null ? 0 : getExternalImageId().hashCode())) * 31) + (getDetectionAttributes() == null ? 0 : getDetectionAttributes().hashCode())) * 31) + (getMaxFaces() == null ? 0 : getMaxFaces().hashCode())) * 31) + (getQualityFilter() != null ? getQualityFilter().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setDetectionAttributes(Collection<String> collection) {
        if (collection == null) {
            this.detectionAttributes = null;
        } else {
            this.detectionAttributes = new ArrayList(collection);
        }
    }

    public void setExternalImageId(String str) {
        this.externalImageId = str;
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
        if (getExternalImageId() != null) {
            sb.append("ExternalImageId: " + getExternalImageId() + ",");
        }
        if (getDetectionAttributes() != null) {
            sb.append("DetectionAttributes: " + getDetectionAttributes() + ",");
        }
        if (getMaxFaces() != null) {
            sb.append("MaxFaces: " + getMaxFaces() + ",");
        }
        if (getQualityFilter() != null) {
            sb.append("QualityFilter: " + getQualityFilter());
        }
        sb.append("}");
        return sb.toString();
    }

    public IndexFacesRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public IndexFacesRequest withDetectionAttributes(String... strArr) {
        if (getDetectionAttributes() == null) {
            this.detectionAttributes = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.detectionAttributes.add(str);
        }
        return this;
    }

    public IndexFacesRequest withExternalImageId(String str) {
        this.externalImageId = str;
        return this;
    }

    public IndexFacesRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public IndexFacesRequest withMaxFaces(Integer num) {
        this.maxFaces = num;
        return this;
    }

    public IndexFacesRequest withQualityFilter(String str) {
        this.qualityFilter = str;
        return this;
    }

    public IndexFacesRequest(String str, Image image) {
        setCollectionId(str);
        setImage(image);
    }

    public void setQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
    }

    public IndexFacesRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
        return this;
    }

    public IndexFacesRequest withDetectionAttributes(Collection<String> collection) {
        setDetectionAttributes(collection);
        return this;
    }
}
