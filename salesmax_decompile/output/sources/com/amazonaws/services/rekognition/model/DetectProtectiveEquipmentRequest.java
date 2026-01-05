package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DetectProtectiveEquipmentRequest extends AmazonWebServiceRequest implements Serializable {
    private Image image;
    private ProtectiveEquipmentSummarizationAttributes summarizationAttributes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectProtectiveEquipmentRequest)) {
            return false;
        }
        DetectProtectiveEquipmentRequest detectProtectiveEquipmentRequest = (DetectProtectiveEquipmentRequest) obj;
        if ((detectProtectiveEquipmentRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (detectProtectiveEquipmentRequest.getImage() != null && !detectProtectiveEquipmentRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((detectProtectiveEquipmentRequest.getSummarizationAttributes() == null) ^ (getSummarizationAttributes() == null)) {
            return false;
        }
        return detectProtectiveEquipmentRequest.getSummarizationAttributes() == null || detectProtectiveEquipmentRequest.getSummarizationAttributes().equals(getSummarizationAttributes());
    }

    public Image getImage() {
        return this.image;
    }

    public ProtectiveEquipmentSummarizationAttributes getSummarizationAttributes() {
        return this.summarizationAttributes;
    }

    public int hashCode() {
        return (((getImage() == null ? 0 : getImage().hashCode()) + 31) * 31) + (getSummarizationAttributes() != null ? getSummarizationAttributes().hashCode() : 0);
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setSummarizationAttributes(ProtectiveEquipmentSummarizationAttributes protectiveEquipmentSummarizationAttributes) {
        this.summarizationAttributes = protectiveEquipmentSummarizationAttributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImage() != null) {
            sb.append("Image: " + getImage() + ",");
        }
        if (getSummarizationAttributes() != null) {
            sb.append("SummarizationAttributes: " + getSummarizationAttributes());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectProtectiveEquipmentRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public DetectProtectiveEquipmentRequest withSummarizationAttributes(ProtectiveEquipmentSummarizationAttributes protectiveEquipmentSummarizationAttributes) {
        this.summarizationAttributes = protectiveEquipmentSummarizationAttributes;
        return this;
    }
}
