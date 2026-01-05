package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class SegmentTypeInfo implements Serializable {
    private String modelVersion;

    /* renamed from: type, reason: collision with root package name */
    private String f58091type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SegmentTypeInfo)) {
            return false;
        }
        SegmentTypeInfo segmentTypeInfo = (SegmentTypeInfo) obj;
        if ((segmentTypeInfo.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (segmentTypeInfo.getType() != null && !segmentTypeInfo.getType().equals(getType())) {
            return false;
        }
        if ((segmentTypeInfo.getModelVersion() == null) ^ (getModelVersion() == null)) {
            return false;
        }
        return segmentTypeInfo.getModelVersion() == null || segmentTypeInfo.getModelVersion().equals(getModelVersion());
    }

    public String getModelVersion() {
        return this.modelVersion;
    }

    public String getType() {
        return this.f58091type;
    }

    public int hashCode() {
        return (((getType() == null ? 0 : getType().hashCode()) + 31) * 31) + (getModelVersion() != null ? getModelVersion().hashCode() : 0);
    }

    public void setModelVersion(String str) {
        this.modelVersion = str;
    }

    public void setType(String str) {
        this.f58091type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) {
            sb.append("Type: " + getType() + ",");
        }
        if (getModelVersion() != null) {
            sb.append("ModelVersion: " + getModelVersion());
        }
        sb.append("}");
        return sb.toString();
    }

    public SegmentTypeInfo withModelVersion(String str) {
        this.modelVersion = str;
        return this;
    }

    public SegmentTypeInfo withType(String str) {
        this.f58091type = str;
        return this;
    }

    public void setType(SegmentType segmentType) {
        this.f58091type = segmentType.toString();
    }

    public SegmentTypeInfo withType(SegmentType segmentType) {
        this.f58091type = segmentType.toString();
        return this;
    }
}
