package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectTextRequest extends AmazonWebServiceRequest implements Serializable {
    private DetectTextFilters filters;
    private Image image;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectTextRequest)) {
            return false;
        }
        DetectTextRequest detectTextRequest = (DetectTextRequest) obj;
        if ((detectTextRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (detectTextRequest.getImage() != null && !detectTextRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((detectTextRequest.getFilters() == null) ^ (getFilters() == null)) {
            return false;
        }
        return detectTextRequest.getFilters() == null || detectTextRequest.getFilters().equals(getFilters());
    }

    public DetectTextFilters getFilters() {
        return this.filters;
    }

    public Image getImage() {
        return this.image;
    }

    public int hashCode() {
        return (((getImage() == null ? 0 : getImage().hashCode()) + 31) * 31) + (getFilters() != null ? getFilters().hashCode() : 0);
    }

    public void setFilters(DetectTextFilters detectTextFilters) {
        this.filters = detectTextFilters;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImage() != null) {
            sb.append("Image: " + getImage() + ",");
        }
        if (getFilters() != null) {
            sb.append("Filters: " + getFilters());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectTextRequest withFilters(DetectTextFilters detectTextFilters) {
        this.filters = detectTextFilters;
        return this;
    }

    public DetectTextRequest withImage(Image image) {
        this.image = image;
        return this;
    }
}
