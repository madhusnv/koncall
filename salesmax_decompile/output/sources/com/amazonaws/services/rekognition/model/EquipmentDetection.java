package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class EquipmentDetection implements Serializable {
    private BoundingBox boundingBox;
    private Float confidence;
    private CoversBodyPart coversBodyPart;

    /* renamed from: type, reason: collision with root package name */
    private String f58087type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EquipmentDetection)) {
            return false;
        }
        EquipmentDetection equipmentDetection = (EquipmentDetection) obj;
        if ((equipmentDetection.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (equipmentDetection.getBoundingBox() != null && !equipmentDetection.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((equipmentDetection.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (equipmentDetection.getConfidence() != null && !equipmentDetection.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((equipmentDetection.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (equipmentDetection.getType() != null && !equipmentDetection.getType().equals(getType())) {
            return false;
        }
        if ((equipmentDetection.getCoversBodyPart() == null) ^ (getCoversBodyPart() == null)) {
            return false;
        }
        return equipmentDetection.getCoversBodyPart() == null || equipmentDetection.getCoversBodyPart().equals(getCoversBodyPart());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public CoversBodyPart getCoversBodyPart() {
        return this.coversBodyPart;
    }

    public String getType() {
        return this.f58087type;
    }

    public int hashCode() {
        return (((((((getBoundingBox() == null ? 0 : getBoundingBox().hashCode()) + 31) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getType() == null ? 0 : getType().hashCode())) * 31) + (getCoversBodyPart() != null ? getCoversBodyPart().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setCoversBodyPart(CoversBodyPart coversBodyPart) {
        this.coversBodyPart = coversBodyPart;
    }

    public void setType(String str) {
        this.f58087type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getCoversBodyPart() != null) {
            sb.append("CoversBodyPart: " + getCoversBodyPart());
        }
        sb.append("}");
        return sb.toString();
    }

    public EquipmentDetection withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public EquipmentDetection withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public EquipmentDetection withCoversBodyPart(CoversBodyPart coversBodyPart) {
        this.coversBodyPart = coversBodyPart;
        return this;
    }

    public EquipmentDetection withType(String str) {
        this.f58087type = str;
        return this;
    }

    public void setType(ProtectiveEquipmentType protectiveEquipmentType) {
        this.f58087type = protectiveEquipmentType.toString();
    }

    public EquipmentDetection withType(ProtectiveEquipmentType protectiveEquipmentType) {
        this.f58087type = protectiveEquipmentType.toString();
        return this;
    }
}
