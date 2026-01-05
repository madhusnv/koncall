package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectCustomLabelsRequest extends AmazonWebServiceRequest implements Serializable {
    private Image image;
    private Integer maxResults;
    private Float minConfidence;
    private String projectVersionArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectCustomLabelsRequest)) {
            return false;
        }
        DetectCustomLabelsRequest detectCustomLabelsRequest = (DetectCustomLabelsRequest) obj;
        if ((detectCustomLabelsRequest.getProjectVersionArn() == null) ^ (getProjectVersionArn() == null)) {
            return false;
        }
        if (detectCustomLabelsRequest.getProjectVersionArn() != null && !detectCustomLabelsRequest.getProjectVersionArn().equals(getProjectVersionArn())) {
            return false;
        }
        if ((detectCustomLabelsRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (detectCustomLabelsRequest.getImage() != null && !detectCustomLabelsRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((detectCustomLabelsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (detectCustomLabelsRequest.getMaxResults() != null && !detectCustomLabelsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((detectCustomLabelsRequest.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        return detectCustomLabelsRequest.getMinConfidence() == null || detectCustomLabelsRequest.getMinConfidence().equals(getMinConfidence());
    }

    public Image getImage() {
        return this.image;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    public int hashCode() {
        return (((((((getProjectVersionArn() == null ? 0 : getProjectVersionArn().hashCode()) + 31) * 31) + (getImage() == null ? 0 : getImage().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getMinConfidence() != null ? getMinConfidence().hashCode() : 0);
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setMinConfidence(Float f) {
        this.minConfidence = f;
    }

    public void setProjectVersionArn(String str) {
        this.projectVersionArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectVersionArn() != null) {
            sb.append("ProjectVersionArn: " + getProjectVersionArn() + ",");
        }
        if (getImage() != null) {
            sb.append("Image: " + getImage() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectCustomLabelsRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public DetectCustomLabelsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public DetectCustomLabelsRequest withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }

    public DetectCustomLabelsRequest withProjectVersionArn(String str) {
        this.projectVersionArn = str;
        return this;
    }
}
