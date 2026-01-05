package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ProtectiveEquipmentPerson implements Serializable {
    private List<ProtectiveEquipmentBodyPart> bodyParts;
    private BoundingBox boundingBox;
    private Float confidence;
    private Integer id;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProtectiveEquipmentPerson)) {
            return false;
        }
        ProtectiveEquipmentPerson protectiveEquipmentPerson = (ProtectiveEquipmentPerson) obj;
        if ((protectiveEquipmentPerson.getBodyParts() == null) ^ (getBodyParts() == null)) {
            return false;
        }
        if (protectiveEquipmentPerson.getBodyParts() != null && !protectiveEquipmentPerson.getBodyParts().equals(getBodyParts())) {
            return false;
        }
        if ((protectiveEquipmentPerson.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (protectiveEquipmentPerson.getBoundingBox() != null && !protectiveEquipmentPerson.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((protectiveEquipmentPerson.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (protectiveEquipmentPerson.getConfidence() != null && !protectiveEquipmentPerson.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((protectiveEquipmentPerson.getId() == null) ^ (getId() == null)) {
            return false;
        }
        return protectiveEquipmentPerson.getId() == null || protectiveEquipmentPerson.getId().equals(getId());
    }

    public List<ProtectiveEquipmentBodyPart> getBodyParts() {
        return this.bodyParts;
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public Integer getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((((getBodyParts() == null ? 0 : getBodyParts().hashCode()) + 31) * 31) + (getBoundingBox() == null ? 0 : getBoundingBox().hashCode())) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getId() != null ? getId().hashCode() : 0);
    }

    public void setBodyParts(Collection<ProtectiveEquipmentBodyPart> collection) {
        if (collection == null) {
            this.bodyParts = null;
        } else {
            this.bodyParts = new ArrayList(collection);
        }
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBodyParts() != null) {
            sb.append("BodyParts: " + getBodyParts() + ",");
        }
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getId() != null) {
            sb.append("Id: " + getId());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProtectiveEquipmentPerson withBodyParts(ProtectiveEquipmentBodyPart... protectiveEquipmentBodyPartArr) {
        if (getBodyParts() == null) {
            this.bodyParts = new ArrayList(protectiveEquipmentBodyPartArr.length);
        }
        for (ProtectiveEquipmentBodyPart protectiveEquipmentBodyPart : protectiveEquipmentBodyPartArr) {
            this.bodyParts.add(protectiveEquipmentBodyPart);
        }
        return this;
    }

    public ProtectiveEquipmentPerson withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public ProtectiveEquipmentPerson withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public ProtectiveEquipmentPerson withId(Integer num) {
        this.id = num;
        return this;
    }

    public ProtectiveEquipmentPerson withBodyParts(Collection<ProtectiveEquipmentBodyPart> collection) {
        setBodyParts(collection);
        return this;
    }
}
