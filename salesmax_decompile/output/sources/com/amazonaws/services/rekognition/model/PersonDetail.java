package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class PersonDetail implements Serializable {
    private BoundingBox boundingBox;
    private FaceDetail face;
    private Long index;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PersonDetail)) {
            return false;
        }
        PersonDetail personDetail = (PersonDetail) obj;
        if ((personDetail.getIndex() == null) ^ (getIndex() == null)) {
            return false;
        }
        if (personDetail.getIndex() != null && !personDetail.getIndex().equals(getIndex())) {
            return false;
        }
        if ((personDetail.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (personDetail.getBoundingBox() != null && !personDetail.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((personDetail.getFace() == null) ^ (getFace() == null)) {
            return false;
        }
        return personDetail.getFace() == null || personDetail.getFace().equals(getFace());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public FaceDetail getFace() {
        return this.face;
    }

    public Long getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (((((getIndex() == null ? 0 : getIndex().hashCode()) + 31) * 31) + (getBoundingBox() == null ? 0 : getBoundingBox().hashCode())) * 31) + (getFace() != null ? getFace().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setFace(FaceDetail faceDetail) {
        this.face = faceDetail;
    }

    public void setIndex(Long l) {
        this.index = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIndex() != null) {
            sb.append("Index: " + getIndex() + ",");
        }
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getFace() != null) {
            sb.append("Face: " + getFace());
        }
        sb.append("}");
        return sb.toString();
    }

    public PersonDetail withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public PersonDetail withFace(FaceDetail faceDetail) {
        this.face = faceDetail;
        return this;
    }

    public PersonDetail withIndex(Long l) {
        this.index = l;
        return this;
    }
}
