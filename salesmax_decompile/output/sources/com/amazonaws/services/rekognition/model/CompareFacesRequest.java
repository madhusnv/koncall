package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class CompareFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private String qualityFilter;
    private Float similarityThreshold;
    private Image sourceImage;
    private Image targetImage;

    public CompareFacesRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CompareFacesRequest)) {
            return false;
        }
        CompareFacesRequest compareFacesRequest = (CompareFacesRequest) obj;
        if ((compareFacesRequest.getSourceImage() == null) ^ (getSourceImage() == null)) {
            return false;
        }
        if (compareFacesRequest.getSourceImage() != null && !compareFacesRequest.getSourceImage().equals(getSourceImage())) {
            return false;
        }
        if ((compareFacesRequest.getTargetImage() == null) ^ (getTargetImage() == null)) {
            return false;
        }
        if (compareFacesRequest.getTargetImage() != null && !compareFacesRequest.getTargetImage().equals(getTargetImage())) {
            return false;
        }
        if ((compareFacesRequest.getSimilarityThreshold() == null) ^ (getSimilarityThreshold() == null)) {
            return false;
        }
        if (compareFacesRequest.getSimilarityThreshold() != null && !compareFacesRequest.getSimilarityThreshold().equals(getSimilarityThreshold())) {
            return false;
        }
        if ((compareFacesRequest.getQualityFilter() == null) ^ (getQualityFilter() == null)) {
            return false;
        }
        return compareFacesRequest.getQualityFilter() == null || compareFacesRequest.getQualityFilter().equals(getQualityFilter());
    }

    public String getQualityFilter() {
        return this.qualityFilter;
    }

    public Float getSimilarityThreshold() {
        return this.similarityThreshold;
    }

    public Image getSourceImage() {
        return this.sourceImage;
    }

    public Image getTargetImage() {
        return this.targetImage;
    }

    public int hashCode() {
        return (((((((getSourceImage() == null ? 0 : getSourceImage().hashCode()) + 31) * 31) + (getTargetImage() == null ? 0 : getTargetImage().hashCode())) * 31) + (getSimilarityThreshold() == null ? 0 : getSimilarityThreshold().hashCode())) * 31) + (getQualityFilter() != null ? getQualityFilter().hashCode() : 0);
    }

    public void setQualityFilter(String str) {
        this.qualityFilter = str;
    }

    public void setSimilarityThreshold(Float f) {
        this.similarityThreshold = f;
    }

    public void setSourceImage(Image image) {
        this.sourceImage = image;
    }

    public void setTargetImage(Image image) {
        this.targetImage = image;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceImage() != null) {
            sb.append("SourceImage: " + getSourceImage() + ",");
        }
        if (getTargetImage() != null) {
            sb.append("TargetImage: " + getTargetImage() + ",");
        }
        if (getSimilarityThreshold() != null) {
            sb.append("SimilarityThreshold: " + getSimilarityThreshold() + ",");
        }
        if (getQualityFilter() != null) {
            sb.append("QualityFilter: " + getQualityFilter());
        }
        sb.append("}");
        return sb.toString();
    }

    public CompareFacesRequest withQualityFilter(String str) {
        this.qualityFilter = str;
        return this;
    }

    public CompareFacesRequest withSimilarityThreshold(Float f) {
        this.similarityThreshold = f;
        return this;
    }

    public CompareFacesRequest withSourceImage(Image image) {
        this.sourceImage = image;
        return this;
    }

    public CompareFacesRequest withTargetImage(Image image) {
        this.targetImage = image;
        return this;
    }

    public CompareFacesRequest(Image image, Image image2) {
        setSourceImage(image);
        setTargetImage(image2);
    }

    public void setQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
    }

    public CompareFacesRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
        return this;
    }
}
