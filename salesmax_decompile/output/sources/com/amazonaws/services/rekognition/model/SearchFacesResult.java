package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class SearchFacesResult implements Serializable {
    private List<FaceMatch> faceMatches;
    private String faceModelVersion;
    private String searchedFaceId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchFacesResult)) {
            return false;
        }
        SearchFacesResult searchFacesResult = (SearchFacesResult) obj;
        if ((searchFacesResult.getSearchedFaceId() == null) ^ (getSearchedFaceId() == null)) {
            return false;
        }
        if (searchFacesResult.getSearchedFaceId() != null && !searchFacesResult.getSearchedFaceId().equals(getSearchedFaceId())) {
            return false;
        }
        if ((searchFacesResult.getFaceMatches() == null) ^ (getFaceMatches() == null)) {
            return false;
        }
        if (searchFacesResult.getFaceMatches() != null && !searchFacesResult.getFaceMatches().equals(getFaceMatches())) {
            return false;
        }
        if ((searchFacesResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        return searchFacesResult.getFaceModelVersion() == null || searchFacesResult.getFaceModelVersion().equals(getFaceModelVersion());
    }

    public List<FaceMatch> getFaceMatches() {
        return this.faceMatches;
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public String getSearchedFaceId() {
        return this.searchedFaceId;
    }

    public int hashCode() {
        return (((((getSearchedFaceId() == null ? 0 : getSearchedFaceId().hashCode()) + 31) * 31) + (getFaceMatches() == null ? 0 : getFaceMatches().hashCode())) * 31) + (getFaceModelVersion() != null ? getFaceModelVersion().hashCode() : 0);
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

    public void setSearchedFaceId(String str) {
        this.searchedFaceId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSearchedFaceId() != null) {
            sb.append("SearchedFaceId: " + getSearchedFaceId() + ",");
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

    public SearchFacesResult withFaceMatches(FaceMatch... faceMatchArr) {
        if (getFaceMatches() == null) {
            this.faceMatches = new ArrayList(faceMatchArr.length);
        }
        for (FaceMatch faceMatch : faceMatchArr) {
            this.faceMatches.add(faceMatch);
        }
        return this;
    }

    public SearchFacesResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public SearchFacesResult withSearchedFaceId(String str) {
        this.searchedFaceId = str;
        return this;
    }

    public SearchFacesResult withFaceMatches(Collection<FaceMatch> collection) {
        setFaceMatches(collection);
        return this;
    }
}
