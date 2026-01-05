package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class SearchUsersByImageResult implements Serializable {
    private String faceModelVersion;
    private SearchedFaceDetails searchedFace;
    private List<UnsearchedFace> unsearchedFaces;
    private List<UserMatch> userMatches;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchUsersByImageResult)) {
            return false;
        }
        SearchUsersByImageResult searchUsersByImageResult = (SearchUsersByImageResult) obj;
        if ((searchUsersByImageResult.getUserMatches() == null) ^ (getUserMatches() == null)) {
            return false;
        }
        if (searchUsersByImageResult.getUserMatches() != null && !searchUsersByImageResult.getUserMatches().equals(getUserMatches())) {
            return false;
        }
        if ((searchUsersByImageResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        if (searchUsersByImageResult.getFaceModelVersion() != null && !searchUsersByImageResult.getFaceModelVersion().equals(getFaceModelVersion())) {
            return false;
        }
        if ((searchUsersByImageResult.getSearchedFace() == null) ^ (getSearchedFace() == null)) {
            return false;
        }
        if (searchUsersByImageResult.getSearchedFace() != null && !searchUsersByImageResult.getSearchedFace().equals(getSearchedFace())) {
            return false;
        }
        if ((searchUsersByImageResult.getUnsearchedFaces() == null) ^ (getUnsearchedFaces() == null)) {
            return false;
        }
        return searchUsersByImageResult.getUnsearchedFaces() == null || searchUsersByImageResult.getUnsearchedFaces().equals(getUnsearchedFaces());
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public SearchedFaceDetails getSearchedFace() {
        return this.searchedFace;
    }

    public List<UnsearchedFace> getUnsearchedFaces() {
        return this.unsearchedFaces;
    }

    public List<UserMatch> getUserMatches() {
        return this.userMatches;
    }

    public int hashCode() {
        return (((((((getUserMatches() == null ? 0 : getUserMatches().hashCode()) + 31) * 31) + (getFaceModelVersion() == null ? 0 : getFaceModelVersion().hashCode())) * 31) + (getSearchedFace() == null ? 0 : getSearchedFace().hashCode())) * 31) + (getUnsearchedFaces() != null ? getUnsearchedFaces().hashCode() : 0);
    }

    public void setFaceModelVersion(String str) {
        this.faceModelVersion = str;
    }

    public void setSearchedFace(SearchedFaceDetails searchedFaceDetails) {
        this.searchedFace = searchedFaceDetails;
    }

    public void setUnsearchedFaces(Collection<UnsearchedFace> collection) {
        if (collection == null) {
            this.unsearchedFaces = null;
        } else {
            this.unsearchedFaces = new ArrayList(collection);
        }
    }

    public void setUserMatches(Collection<UserMatch> collection) {
        if (collection == null) {
            this.userMatches = null;
        } else {
            this.userMatches = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserMatches() != null) {
            sb.append("UserMatches: " + getUserMatches() + ",");
        }
        if (getFaceModelVersion() != null) {
            sb.append("FaceModelVersion: " + getFaceModelVersion() + ",");
        }
        if (getSearchedFace() != null) {
            sb.append("SearchedFace: " + getSearchedFace() + ",");
        }
        if (getUnsearchedFaces() != null) {
            sb.append("UnsearchedFaces: " + getUnsearchedFaces());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchUsersByImageResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public SearchUsersByImageResult withSearchedFace(SearchedFaceDetails searchedFaceDetails) {
        this.searchedFace = searchedFaceDetails;
        return this;
    }

    public SearchUsersByImageResult withUnsearchedFaces(UnsearchedFace... unsearchedFaceArr) {
        if (getUnsearchedFaces() == null) {
            this.unsearchedFaces = new ArrayList(unsearchedFaceArr.length);
        }
        for (UnsearchedFace unsearchedFace : unsearchedFaceArr) {
            this.unsearchedFaces.add(unsearchedFace);
        }
        return this;
    }

    public SearchUsersByImageResult withUserMatches(UserMatch... userMatchArr) {
        if (getUserMatches() == null) {
            this.userMatches = new ArrayList(userMatchArr.length);
        }
        for (UserMatch userMatch : userMatchArr) {
            this.userMatches.add(userMatch);
        }
        return this;
    }

    public SearchUsersByImageResult withUnsearchedFaces(Collection<UnsearchedFace> collection) {
        setUnsearchedFaces(collection);
        return this;
    }

    public SearchUsersByImageResult withUserMatches(Collection<UserMatch> collection) {
        setUserMatches(collection);
        return this;
    }
}
