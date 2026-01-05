package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class UnsuccessfulFaceDeletion implements Serializable {
    private String faceId;
    private List<String> reasons;
    private String userId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnsuccessfulFaceDeletion)) {
            return false;
        }
        UnsuccessfulFaceDeletion unsuccessfulFaceDeletion = (UnsuccessfulFaceDeletion) obj;
        if ((unsuccessfulFaceDeletion.getFaceId() == null) ^ (getFaceId() == null)) {
            return false;
        }
        if (unsuccessfulFaceDeletion.getFaceId() != null && !unsuccessfulFaceDeletion.getFaceId().equals(getFaceId())) {
            return false;
        }
        if ((unsuccessfulFaceDeletion.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (unsuccessfulFaceDeletion.getUserId() != null && !unsuccessfulFaceDeletion.getUserId().equals(getUserId())) {
            return false;
        }
        if ((unsuccessfulFaceDeletion.getReasons() == null) ^ (getReasons() == null)) {
            return false;
        }
        return unsuccessfulFaceDeletion.getReasons() == null || unsuccessfulFaceDeletion.getReasons().equals(getReasons());
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
        return (((((getFaceId() == null ? 0 : getFaceId().hashCode()) + 31) * 31) + (getUserId() == null ? 0 : getUserId().hashCode())) * 31) + (getReasons() != null ? getReasons().hashCode() : 0);
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
        if (getReasons() != null) {
            sb.append("Reasons: " + getReasons());
        }
        sb.append("}");
        return sb.toString();
    }

    public UnsuccessfulFaceDeletion withFaceId(String str) {
        this.faceId = str;
        return this;
    }

    public UnsuccessfulFaceDeletion withReasons(String... strArr) {
        if (getReasons() == null) {
            this.reasons = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.reasons.add(str);
        }
        return this;
    }

    public UnsuccessfulFaceDeletion withUserId(String str) {
        this.userId = str;
        return this;
    }

    public UnsuccessfulFaceDeletion withReasons(Collection<String> collection) {
        setReasons(collection);
        return this;
    }
}
