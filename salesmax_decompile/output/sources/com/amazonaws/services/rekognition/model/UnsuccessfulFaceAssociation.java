package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class UnsuccessfulFaceAssociation implements Serializable {
    private Float confidence;
    private String faceId;
    private List<String> reasons;
    private String userId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnsuccessfulFaceAssociation)) {
            return false;
        }
        UnsuccessfulFaceAssociation unsuccessfulFaceAssociation = (UnsuccessfulFaceAssociation) obj;
        if ((unsuccessfulFaceAssociation.getFaceId() == null) ^ (getFaceId() == null)) {
            return false;
        }
        if (unsuccessfulFaceAssociation.getFaceId() != null && !unsuccessfulFaceAssociation.getFaceId().equals(getFaceId())) {
            return false;
        }
        if ((unsuccessfulFaceAssociation.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (unsuccessfulFaceAssociation.getUserId() != null && !unsuccessfulFaceAssociation.getUserId().equals(getUserId())) {
            return false;
        }
        if ((unsuccessfulFaceAssociation.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (unsuccessfulFaceAssociation.getConfidence() != null && !unsuccessfulFaceAssociation.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((unsuccessfulFaceAssociation.getReasons() == null) ^ (getReasons() == null)) {
            return false;
        }
        return unsuccessfulFaceAssociation.getReasons() == null || unsuccessfulFaceAssociation.getReasons().equals(getReasons());
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public String getFaceId() {
        return this.faceId;
    }

    public List<String> getReasons() {
        return this.reasons;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((getFaceId() == null ? 0 : getFaceId().hashCode()) + 31) * 31) + (getUserId() == null ? 0 : getUserId().hashCode())) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getReasons() != null ? getReasons().hashCode() : 0);
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setFaceId(String str) {
        this.faceId = str;
    }

    public void setReasons(Collection<String> collection) {
        if (collection == null) {
            this.reasons = null;
        } else {
            this.reasons = new ArrayList(collection);
        }
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceId() != null) {
            sb.append("FaceId: " + getFaceId() + ",");
        }
        if (getUserId() != null) {
            sb.append("UserId: " + getUserId() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getReasons() != null) {
            sb.append("Reasons: " + getReasons());
        }
        sb.append("}");
        return sb.toString();
    }

    public UnsuccessfulFaceAssociation withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public UnsuccessfulFaceAssociation withFaceId(String str) {
        this.faceId = str;
        return this;
    }

    public UnsuccessfulFaceAssociation withReasons(String... strArr) {
        if (getReasons() == null) {
            this.reasons = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.reasons.add(str);
        }
        return this;
    }

    public UnsuccessfulFaceAssociation withUserId(String str) {
        this.userId = str;
        return this;
    }

    public UnsuccessfulFaceAssociation withReasons(Collection<String> collection) {
        setReasons(collection);
        return this;
    }
}
