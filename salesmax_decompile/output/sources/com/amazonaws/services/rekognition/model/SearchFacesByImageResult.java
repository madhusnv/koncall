package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class SearchFacesByImageResult implements Serializable {
    private List<FaceMatch> faceMatches;
    private String faceModelVersion;
    private BoundingBox searchedFaceBoundingBox;
    private Float searchedFaceConfidence;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchFacesByImageResult)) {
            return false;
        }
        SearchFacesByImageResult searchFacesByImageResult = (SearchFacesByImageResult) obj;
        if ((searchFacesByImageResult.getSearchedFaceBoundingBox() == null) ^ (getSearchedFaceBoundingBox() == null)) {
            return false;
        }
        if (searchFacesByImageResult.getSearchedFaceBoundingBox() != null && !searchFacesByImageResult.getSearchedFaceBoundingBox().equals(getSearchedFaceBoundingBox())) {
            return false;
        }
        if ((searchFacesByImageResult.getSearchedFaceConfidence() == null) ^ (getSearchedFaceConfidence() == null)) {
            return false;
        }
        if (searchFacesByImageResult.getSearchedFaceConfidence() != null && !searchFacesByImageResult.getSearchedFaceConfidence().equals(getSearchedFaceConfidence())) {
            return false;
        }
        if ((searchFacesByImageResult.getFaceMatches() == null) ^ (getFaceMatches() == null)) {
            return false;
        }
        if (searchFacesByImageResult.getFaceMatches() != null && !searchFacesByImageResult.getFaceMatches().equals(getFaceMatches())) {
            return false;
        }
        if ((searchFacesByImageResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        return searchFacesByImageResult.getFaceModelVersion() == null || searchFacesByImageResult.getFaceModelVersion().equals(getFaceModelVersion());
    }

    public List<FaceMatch> getFaceMatches() {
        return this.faceMatches;
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public BoundingBox getSearchedFaceBoundingBox() {
        return this.searchedFaceBoundingBox;
    }

    public Float getSearchedFaceConfidence() {
        return this.searchedFaceConfidence;
    }

    public int hashCode() {
        return (((((((getSearchedFaceBoundingBox() == null ? 0 : getSearchedFaceBoundingBox().hashCode()) + 31) * 31) + (getSearchedFaceConfidence() == null ? 0 : getSearchedFaceConfidence().hashCode())) * 31) + (getFaceMatches() == null ? 0 : getFaceMatches().hashCode())) * 31) + (getFaceModelVersion() != null ? getFaceModelVersion().hashCode() : 0);
    }

    public void setFaceMatches(Collection<FaceMatch> collection) {
        if (collection == null) {
            this.faceMatches = null;
        } else {
            this.faceMatches = new ArrayList(collection);
        }
    }

    public void setFaceModelVersion(String str) {
        this.faceModelVersion = str;
    }

    public void setSearchedFaceBoundingBox(BoundingBox boundingBox) {
        this.searchedFaceBoundingBox = boundingBox;
    }

    public void setSearchedFaceConfidence(Float f) {
        this.searchedFaceConfidence = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSearchedFaceBoundingBox() != null) {
            sb.append("SearchedFaceBoundingBox: " + getSearchedFaceBoundingBox() + ",");
        }
        if (getSearchedFaceConfidence() != null) {
            sb.append("SearchedFaceConfidence: " + getSearchedFaceConfidence() + ",");
        }
        if (getFaceMatches() != null) {
            sb.append("FaceMatches: " + getFaceMatches() + ",");
        }
        if (getFaceModelVersion() != null) {
            sb.append("FaceModelVersion: " + getFaceModelVersion());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchFacesByImageResult withFaceMatches(FaceMatch... faceMatchArr) {
        if (getFaceMatches() == null) {
            this.faceMatches = new ArrayList(faceMatchArr.length);
        }
        for (FaceMatch faceMatch : faceMatchArr) {
            this.faceMatches.add(faceMatch);
        }
        return this;
    }

    public SearchFacesByImageResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public SearchFacesByImageResult withSearchedFaceBoundingBox(BoundingBox boundingBox) {
        this.searchedFaceBoundingBox = boundingBox;
        return this;
    }

    public SearchFacesByImageResult withSearchedFaceConfidence(Float f) {
        this.searchedFaceConfidence = f;
        return this;
    }

    public SearchFacesByImageResult withFaceMatches(Collection<FaceMatch> collection) {
        setFaceMatches(collection);
        return this;
    }
}
