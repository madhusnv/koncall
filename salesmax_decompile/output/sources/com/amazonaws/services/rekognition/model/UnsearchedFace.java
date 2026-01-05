package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class UnsearchedFace implements Serializable {
    private FaceDetail faceDetails;
    private List<String> reasons;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnsearchedFace)) {
            return false;
        }
        UnsearchedFace unsearchedFace = (UnsearchedFace) obj;
        if ((unsearchedFace.getFaceDetails() == null) ^ (getFaceDetails() == null)) {
            return false;
        }
        if (unsearchedFace.getFaceDetails() != null && !unsearchedFace.getFaceDetails().equals(getFaceDetails())) {
            return false;
        }
        if ((unsearchedFace.getReasons() == null) ^ (getReasons() == null)) {
            return false;
        }
        return unsearchedFace.getReasons() == null || unsearchedFace.getReasons().equals(getReasons());
    }

    public FaceDetail getFaceDetails() {
        return this.faceDetails;
    }

    public List<String> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        return (((getFaceDetails() == null ? 0 : getFaceDetails().hashCode()) + 31) * 31) + (getReasons() != null ? getReasons().hashCode() : 0);
    }

    public void setFaceDetails(FaceDetail faceDetail) {
        this.faceDetails = faceDetail;
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
        if (getFaceDetails() != null) {
            sb.append("FaceDetails: " + getFaceDetails() + ",");
        }
        if (getReasons() != null) {
            sb.append("Reasons: " + getReasons());
        }
        sb.append("}");
        return sb.toString();
    }

    public UnsearchedFace withFaceDetails(FaceDetail faceDetail) {
        this.faceDetails = faceDetail;
        return this;
    }

    public UnsearchedFace withReasons(String... strArr) {
        if (getReasons() == null) {
            this.reasons = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.reasons.add(str);
        }
        return this;
    }

    public UnsearchedFace withReasons(Collection<String> collection) {
        setReasons(collection);
        return this;
    }
}
