package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class ModerationLabel implements Serializable {
    private Float confidence;
    private String name;
    private String parentName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ModerationLabel)) {
            return false;
        }
        ModerationLabel moderationLabel = (ModerationLabel) obj;
        if ((moderationLabel.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (moderationLabel.getConfidence() != null && !moderationLabel.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((moderationLabel.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (moderationLabel.getName() != null && !moderationLabel.getName().equals(getName())) {
            return false;
        }
        if ((moderationLabel.getParentName() == null) ^ (getParentName() == null)) {
            return false;
        }
        return moderationLabel.getParentName() == null || moderationLabel.getParentName().equals(getParentName());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public String getName() {
        return this.name;
    }

    public String getParentName() {
        return this.parentName;
    }

    public int hashCode() {
        return (((((getConfidence() == null ? 0 : getConfidence().hashCode()) + 31) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getParentName() != null ? getParentName().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentName(String str) {
        this.parentName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getParentName() != null) {
            sb.append("ParentName: " + getParentName());
        }
        sb.append("}");
        return sb.toString();
    }

    public ModerationLabel withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public ModerationLabel withName(String str) {
        this.name = str;
        return this;
    }

    public ModerationLabel withParentName(String str) {
        this.parentName = str;
        return this;
    }
}
