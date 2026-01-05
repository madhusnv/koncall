package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class CelebrityDetail implements Serializable {
    private BoundingBox boundingBox;
    private Float confidence;
    private FaceDetail face;
    private String id;
    private KnownGender knownGender;
    private String name;
    private List<String> urls;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CelebrityDetail)) {
            return false;
        }
        CelebrityDetail celebrityDetail = (CelebrityDetail) obj;
        if ((celebrityDetail.getUrls() == null) ^ (getUrls() == null)) {
            return false;
        }
        if (celebrityDetail.getUrls() != null && !celebrityDetail.getUrls().equals(getUrls())) {
            return false;
        }
        if ((celebrityDetail.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (celebrityDetail.getName() != null && !celebrityDetail.getName().equals(getName())) {
            return false;
        }
        if ((celebrityDetail.getId() == null) ^ (getId() == null)) {
            return false;
        }
        if (celebrityDetail.getId() != null && !celebrityDetail.getId().equals(getId())) {
            return false;
        }
        if ((celebrityDetail.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (celebrityDetail.getConfidence() != null && !celebrityDetail.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((celebrityDetail.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (celebrityDetail.getBoundingBox() != null && !celebrityDetail.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((celebrityDetail.getFace() == null) ^ (getFace() == null)) {
            return false;
        }
        if (celebrityDetail.getFace() != null && !celebrityDetail.getFace().equals(getFace())) {
            return false;
        }
        if ((celebrityDetail.getKnownGender() == null) ^ (getKnownGender() == null)) {
            return false;
        }
        return celebrityDetail.getKnownGender() == null || celebrityDetail.getKnownGender().equals(getKnownGender());
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public FaceDetail getFace() {
        return this.face;
    }

    public String getId() {
        return this.id;
    }

    public KnownGender getKnownGender() {
        return this.knownGender;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return (((((((((((((getUrls() == null ? 0 : getUrls().hashCode()) + 31) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getBoundingBox() == null ? 0 : getBoundingBox().hashCode())) * 31) + (getFace() == null ? 0 : getFace().hashCode())) * 31) + (getKnownGender() != null ? getKnownGender().hashCode() : 0);
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setFace(FaceDetail faceDetail) {
        this.face = faceDetail;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setKnownGender(KnownGender knownGender) {
        this.knownGender = knownGender;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrls(Collection<String> collection) {
        if (collection == null) {
            this.urls = null;
        } else {
            this.urls = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUrls() != null) {
            sb.append("Urls: " + getUrls() + ",");
        }
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getId() != null) {
            sb.append("Id: " + getId() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getFace() != null) {
            sb.append("Face: " + getFace() + ",");
        }
        if (getKnownGender() != null) {
            sb.append("KnownGender: " + getKnownGender());
        }
        sb.append("}");
        return sb.toString();
    }

    public CelebrityDetail withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public CelebrityDetail withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public CelebrityDetail withFace(FaceDetail faceDetail) {
        this.face = faceDetail;
        return this;
    }

    public CelebrityDetail withId(String str) {
        this.id = str;
        return this;
    }

    public CelebrityDetail withKnownGender(KnownGender knownGender) {
        this.knownGender = knownGender;
        return this;
    }

    public CelebrityDetail withName(String str) {
        this.name = str;
        return this;
    }

    public CelebrityDetail withUrls(String... strArr) {
        if (getUrls() == null) {
            this.urls = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.urls.add(str);
        }
        return this;
    }

    public CelebrityDetail withUrls(Collection<String> collection) {
        setUrls(collection);
        return this;
    }
}
