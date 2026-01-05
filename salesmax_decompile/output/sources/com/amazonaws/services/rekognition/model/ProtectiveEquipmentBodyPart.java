package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ProtectiveEquipmentBodyPart implements Serializable {
    private Float confidence;
    private List<EquipmentDetection> equipmentDetections;
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProtectiveEquipmentBodyPart)) {
            return false;
        }
        ProtectiveEquipmentBodyPart protectiveEquipmentBodyPart = (ProtectiveEquipmentBodyPart) obj;
        if ((protectiveEquipmentBodyPart.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (protectiveEquipmentBodyPart.getName() != null && !protectiveEquipmentBodyPart.getName().equals(getName())) {
            return false;
        }
        if ((protectiveEquipmentBodyPart.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (protectiveEquipmentBodyPart.getConfidence() != null && !protectiveEquipmentBodyPart.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((protectiveEquipmentBodyPart.getEquipmentDetections() == null) ^ (getEquipmentDetections() == null)) {
            return false;
        }
        return protectiveEquipmentBodyPart.getEquipmentDetections() == null || protectiveEquipmentBodyPart.getEquipmentDetections().equals(getEquipmentDetections());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public List<EquipmentDetection> getEquipmentDetections() {
        return this.equipmentDetections;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getEquipmentDetections() != null ? getEquipmentDetections().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setEquipmentDetections(Collection<EquipmentDetection> collection) {
        if (collection == null) {
            this.equipmentDetections = null;
        } else {
            this.equipmentDetections = new ArrayList(collection);
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getEquipmentDetections() != null) {
            sb.append("EquipmentDetections: " + getEquipmentDetections());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProtectiveEquipmentBodyPart withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public ProtectiveEquipmentBodyPart withEquipmentDetections(EquipmentDetection... equipmentDetectionArr) {
        if (getEquipmentDetections() == null) {
            this.equipmentDetections = new ArrayList(equipmentDetectionArr.length);
        }
        for (EquipmentDetection equipmentDetection : equipmentDetectionArr) {
            this.equipmentDetections.add(equipmentDetection);
        }
        return this;
    }

    public ProtectiveEquipmentBodyPart withName(String str) {
        this.name = str;
        return this;
    }

    public void setName(BodyPart bodyPart) {
        this.name = bodyPart.toString();
    }

    public ProtectiveEquipmentBodyPart withName(BodyPart bodyPart) {
        this.name = bodyPart.toString();
        return this;
    }

    public ProtectiveEquipmentBodyPart withEquipmentDetections(Collection<EquipmentDetection> collection) {
        setEquipmentDetections(collection);
        return this;
    }
}
