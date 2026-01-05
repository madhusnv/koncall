package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> attributes;
    private Image image;

    public DetectFacesRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectFacesRequest)) {
            return false;
        }
        DetectFacesRequest detectFacesRequest = (DetectFacesRequest) obj;
        if ((detectFacesRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (detectFacesRequest.getImage() != null && !detectFacesRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((detectFacesRequest.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        return detectFacesRequest.getAttributes() == null || detectFacesRequest.getAttributes().equals(getAttributes());
    }

    public List<String> getAttributes() {
        return this.attributes;
    }

    public Image getImage() {
        return this.image;
    }

    public int hashCode() {
        return (((getImage() == null ? 0 : getImage().hashCode()) + 31) * 31) + (getAttributes() != null ? getAttributes().hashCode() : 0);
    }

    public void setAttributes(Collection<String> collection) {
        if (collection == null) {
            this.attributes = null;
        } else {
            this.attributes = new ArrayList(collection);
        }
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
        if (getAttributes() != null) {
            sb.append("Attributes: " + getAttributes());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectFacesRequest withAttributes(String... strArr) {
        if (getAttributes() == null) {
            this.attributes = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.attributes.add(str);
        }
        return this;
    }

    public DetectFacesRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public DetectFacesRequest(Image image) {
        setImage(image);
    }

    public DetectFacesRequest withAttributes(Collection<String> collection) {
        setAttributes(collection);
        return this;
    }
}
