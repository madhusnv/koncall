package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ProtectiveEquipmentSummarizationAttributes implements Serializable {
    private Float minConfidence;
    private List<String> requiredEquipmentTypes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProtectiveEquipmentSummarizationAttributes)) {
            return false;
        }
        ProtectiveEquipmentSummarizationAttributes protectiveEquipmentSummarizationAttributes = (ProtectiveEquipmentSummarizationAttributes) obj;
        if ((protectiveEquipmentSummarizationAttributes.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        if (protectiveEquipmentSummarizationAttributes.getMinConfidence() != null && !protectiveEquipmentSummarizationAttributes.getMinConfidence().equals(getMinConfidence())) {
            return false;
        }
        if ((protectiveEquipmentSummarizationAttributes.getRequiredEquipmentTypes() == null) ^ (getRequiredEquipmentTypes() == null)) {
            return false;
        }
        return protectiveEquipmentSummarizationAttributes.getRequiredEquipmentTypes() == null || protectiveEquipmentSummarizationAttributes.getRequiredEquipmentTypes().equals(getRequiredEquipmentTypes());
    }

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    public List<String> getRequiredEquipmentTypes() {
        return this.requiredEquipmentTypes;
    }

    public int hashCode() {
        return (((getMinConfidence() == null ? 0 : getMinConfidence().hashCode()) + 31) * 31) + (getRequiredEquipmentTypes() != null ? getRequiredEquipmentTypes().hashCode() : 0);
    }

    public void setMinConfidence(Float f) {
        this.minConfidence = f;
    }

    public void setRequiredEquipmentTypes(Collection<String> collection) {
        if (collection == null) {
            this.requiredEquipmentTypes = null;
        } else {
            this.requiredEquipmentTypes = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        }
        if (getRequiredEquipmentTypes() != null) {
            sb.append("RequiredEquipmentTypes: " + getRequiredEquipmentTypes());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProtectiveEquipmentSummarizationAttributes withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }

    public ProtectiveEquipmentSummarizationAttributes withRequiredEquipmentTypes(String... strArr) {
        if (getRequiredEquipmentTypes() == null) {
            this.requiredEquipmentTypes = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.requiredEquipmentTypes.add(str);
        }
        return this;
    }

    public ProtectiveEquipmentSummarizationAttributes withRequiredEquipmentTypes(Collection<String> collection) {
        setRequiredEquipmentTypes(collection);
        return this;
    }
}
