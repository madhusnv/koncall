package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class SearchedFaceDetails implements Serializable {
    private FaceDetail faceDetail;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchedFaceDetails)) {
            return false;
        }
        SearchedFaceDetails searchedFaceDetails = (SearchedFaceDetails) obj;
        if ((searchedFaceDetails.getFaceDetail() == null) ^ (getFaceDetail() == null)) {
            return false;
        }
        return searchedFaceDetails.getFaceDetail() == null || searchedFaceDetails.getFaceDetail().equals(getFaceDetail());
    }

    public FaceDetail getFaceDetail() {
        return this.faceDetail;
    }

    public int hashCode() {
        return 31 + (getFaceDetail() == null ? 0 : getFaceDetail().hashCode());
    }

    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceDetail() != null) {
            sb.append("FaceDetail: " + getFaceDetail());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchedFaceDetails withFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
        return this;
    }
}
