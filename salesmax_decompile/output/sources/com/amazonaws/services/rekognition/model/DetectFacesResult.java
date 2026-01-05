package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectFacesResult implements Serializable {
    private List<FaceDetail> faceDetails;
    private String orientationCorrection;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectFacesResult)) {
            return false;
        }
        DetectFacesResult detectFacesResult = (DetectFacesResult) obj;
        if ((detectFacesResult.getFaceDetails() == null) ^ (getFaceDetails() == null)) {
            return false;
        }
        if (detectFacesResult.getFaceDetails() != null && !detectFacesResult.getFaceDetails().equals(getFaceDetails())) {
            return false;
        }
        if ((detectFacesResult.getOrientationCorrection() == null) ^ (getOrientationCorrection() == null)) {
            return false;
        }
        return detectFacesResult.getOrientationCorrection() == null || detectFacesResult.getOrientationCorrection().equals(getOrientationCorrection());
    }

    public List<FaceDetail> getFaceDetails() {
        return this.faceDetails;
    }

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    public int hashCode() {
        return (((getFaceDetails() == null ? 0 : getFaceDetails().hashCode()) + 31) * 31) + (getOrientationCorrection() != null ? getOrientationCorrection().hashCode() : 0);
    }

    public void setFaceDetails(Collection<FaceDetail> collection) {
        if (collection == null) {
            this.faceDetails = null;
        } else {
            this.faceDetails = new ArrayList(collection);
        }
    }

    public void setOrientationCorrection(String str) {
        this.orientationCorrection = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceDetails() != null) {
            sb.append("FaceDetails: " + getFaceDetails() + ",");
        }
        if (getOrientationCorrection() != null) {
            sb.append("OrientationCorrection: " + getOrientationCorrection());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectFacesResult withFaceDetails(FaceDetail... faceDetailArr) {
        if (getFaceDetails() == null) {
            this.faceDetails = new ArrayList(faceDetailArr.length);
        }
        for (FaceDetail faceDetail : faceDetailArr) {
            this.faceDetails.add(faceDetail);
        }
        return this;
    }

    public DetectFacesResult withOrientationCorrection(String str) {
        this.orientationCorrection = str;
        return this;
    }

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    public DetectFacesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
        return this;
    }

    public DetectFacesResult withFaceDetails(Collection<FaceDetail> collection) {
        setFaceDetails(collection);
        return this;
    }
}
