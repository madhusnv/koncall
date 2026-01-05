package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectModerationLabelsRequest extends AmazonWebServiceRequest implements Serializable {
    private HumanLoopConfig humanLoopConfig;
    private Image image;
    private Float minConfidence;

    public DetectModerationLabelsRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectModerationLabelsRequest)) {
            return false;
        }
        DetectModerationLabelsRequest detectModerationLabelsRequest = (DetectModerationLabelsRequest) obj;
        if ((detectModerationLabelsRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (detectModerationLabelsRequest.getImage() != null && !detectModerationLabelsRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((detectModerationLabelsRequest.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        if (detectModerationLabelsRequest.getMinConfidence() != null && !detectModerationLabelsRequest.getMinConfidence().equals(getMinConfidence())) {
            return false;
        }
        if ((detectModerationLabelsRequest.getHumanLoopConfig() == null) ^ (getHumanLoopConfig() == null)) {
            return false;
        }
        return detectModerationLabelsRequest.getHumanLoopConfig() == null || detectModerationLabelsRequest.getHumanLoopConfig().equals(getHumanLoopConfig());
    }

    public HumanLoopConfig getHumanLoopConfig() {
        return this.humanLoopConfig;
    }

    public Image getImage() {
        return this.image;
    }

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    public int hashCode() {
        return (((((getImage() == null ? 0 : getImage().hashCode()) + 31) * 31) + (getMinConfidence() == null ? 0 : getMinConfidence().hashCode())) * 31) + (getHumanLoopConfig() != null ? getHumanLoopConfig().hashCode() : 0);
    }

    public void setHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setMinConfidence(Float f) {
        this.minConfidence = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImage() != null) {
            sb.append("Image: " + getImage() + ",");
        }
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        }
        if (getHumanLoopConfig() != null) {
            sb.append("HumanLoopConfig: " + getHumanLoopConfig());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectModerationLabelsRequest withHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
        return this;
    }

    public DetectModerationLabelsRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public DetectModerationLabelsRequest withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }

    public DetectModerationLabelsRequest(Image image) {
        setImage(image);
    }
}
