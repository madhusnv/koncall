package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectLabelsRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> features;
    private Image image;
    private Integer maxLabels;
    private Float minConfidence;
    private DetectLabelsSettings settings;

    public DetectLabelsRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectLabelsRequest)) {
            return false;
        }
        DetectLabelsRequest detectLabelsRequest = (DetectLabelsRequest) obj;
        if ((detectLabelsRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (detectLabelsRequest.getImage() != null && !detectLabelsRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((detectLabelsRequest.getMaxLabels() == null) ^ (getMaxLabels() == null)) {
            return false;
        }
        if (detectLabelsRequest.getMaxLabels() != null && !detectLabelsRequest.getMaxLabels().equals(getMaxLabels())) {
            return false;
        }
        if ((detectLabelsRequest.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        if (detectLabelsRequest.getMinConfidence() != null && !detectLabelsRequest.getMinConfidence().equals(getMinConfidence())) {
            return false;
        }
        if ((detectLabelsRequest.getFeatures() == null) ^ (getFeatures() == null)) {
            return false;
        }
        if (detectLabelsRequest.getFeatures() != null && !detectLabelsRequest.getFeatures().equals(getFeatures())) {
            return false;
        }
        if ((detectLabelsRequest.getSettings() == null) ^ (getSettings() == null)) {
            return false;
        }
        return detectLabelsRequest.getSettings() == null || detectLabelsRequest.getSettings().equals(getSettings());
    }

    public List<String> getFeatures() {
        return this.features;
    }

    public Image getImage() {
        return this.image;
    }

    public Integer getMaxLabels() {
        return this.maxLabels;
    }

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    public DetectLabelsSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return (((((((((getImage() == null ? 0 : getImage().hashCode()) + 31) * 31) + (getMaxLabels() == null ? 0 : getMaxLabels().hashCode())) * 31) + (getMinConfidence() == null ? 0 : getMinConfidence().hashCode())) * 31) + (getFeatures() == null ? 0 : getFeatures().hashCode())) * 31) + (getSettings() != null ? getSettings().hashCode() : 0);
    }

    public void setFeatures(Collection<String> collection) {
        if (collection == null) {
            this.features = null;
        } else {
            this.features = new ArrayList(collection);
        }
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setMaxLabels(Integer num) {
        this.maxLabels = num;
    }

    public void setMinConfidence(Float f) {
        this.minConfidence = f;
    }

    public void setSettings(DetectLabelsSettings detectLabelsSettings) {
        this.settings = detectLabelsSettings;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImage() != null) {
            sb.append("Image: " + getImage() + ",");
        }
        if (getMaxLabels() != null) {
            sb.append("MaxLabels: " + getMaxLabels() + ",");
        }
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        }
        if (getFeatures() != null) {
            sb.append("Features: " + getFeatures() + ",");
        }
        if (getSettings() != null) {
            sb.append("Settings: " + getSettings());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectLabelsRequest withFeatures(String... strArr) {
        if (getFeatures() == null) {
            this.features = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.features.add(str);
        }
        return this;
    }

    public DetectLabelsRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public DetectLabelsRequest withMaxLabels(Integer num) {
        this.maxLabels = num;
        return this;
    }

    public DetectLabelsRequest withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }

    public DetectLabelsRequest withSettings(DetectLabelsSettings detectLabelsSettings) {
        this.settings = detectLabelsSettings;
        return this;
    }

    public DetectLabelsRequest(Image image) {
        setImage(image);
    }

    public DetectLabelsRequest withFeatures(Collection<String> collection) {
        setFeatures(collection);
        return this;
    }
}
