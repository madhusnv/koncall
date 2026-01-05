package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class UnindexedFace implements Serializable {
    private FaceDetail faceDetail;
    private List<String> reasons;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnindexedFace)) {
            return false;
        }
        UnindexedFace unindexedFace = (UnindexedFace) obj;
        if ((unindexedFace.getReasons() == null) ^ (getReasons() == null)) {
            return false;
        }
        if (unindexedFace.getReasons() != null && !unindexedFace.getReasons().equals(getReasons())) {
            return false;
        }
        if ((unindexedFace.getFaceDetail() == null) ^ (getFaceDetail() == null)) {
            return false;
        }
        return unindexedFace.getFaceDetail() == null || unindexedFace.getFaceDetail().equals(getFaceDetail());
    }

    public FaceDetail getFaceDetail() {
        return this.faceDetail;
    }

    public List<String> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        return (((getReasons() == null ? 0 : getReasons().hashCode()) + 31) * 31) + (getFaceDetail() != null ? getFaceDetail().hashCode() : 0);
    }

    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    public void setReasons(Collection<String> collection) {
        if (collection == null) {
            this.reasons = null;
        } else {
            this.reasons = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReasons() != null) {
            sb.append("Reasons: " + getReasons() + ",");
        }
        if (getFaceDetail() != null) {
            sb.append("FaceDetail: " + getFaceDetail());
        }
        sb.append("}");
        return sb.toString();
    }

    public UnindexedFace withFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
        return this;
    }

    public UnindexedFace withReasons(String... strArr) {
        if (getReasons() == null) {
            this.reasons = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.reasons.add(str);
        }
        return this;
    }

    public UnindexedFace withReasons(Collection<String> collection) {
        setReasons(collection);
        return this;
    }
}
