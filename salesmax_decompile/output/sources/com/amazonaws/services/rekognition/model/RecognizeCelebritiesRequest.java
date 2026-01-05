package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class RecognizeCelebritiesRequest extends AmazonWebServiceRequest implements Serializable {
    private Image image;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RecognizeCelebritiesRequest)) {
            return false;
        }
        RecognizeCelebritiesRequest recognizeCelebritiesRequest = (RecognizeCelebritiesRequest) obj;
        if ((recognizeCelebritiesRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        return recognizeCelebritiesRequest.getImage() == null || recognizeCelebritiesRequest.getImage().equals(getImage());
    }

    public Image getImage() {
        return this.image;
    }

    public int hashCode() {
        return 31 + (getImage() == null ? 0 : getImage().hashCode());
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImage() != null) {
            sb.append("Image: " + getImage());
        }
        sb.append("}");
        return sb.toString();
    }

    public RecognizeCelebritiesRequest withImage(Image image) {
        this.image = image;
        return this;
    }
}
