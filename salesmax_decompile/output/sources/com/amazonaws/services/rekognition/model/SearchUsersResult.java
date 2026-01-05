package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class SearchUsersResult implements Serializable {
    private String faceModelVersion;
    private SearchedFace searchedFace;
    private SearchedUser searchedUser;
    private List<UserMatch> userMatches;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchUsersResult)) {
            return false;
        }
        SearchUsersResult searchUsersResult = (SearchUsersResult) obj;
        if ((searchUsersResult.getUserMatches() == null) ^ (getUserMatches() == null)) {
            return false;
        }
        if (searchUsersResult.getUserMatches() != null && !searchUsersResult.getUserMatches().equals(getUserMatches())) {
            return false;
        }
        if ((searchUsersResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        if (searchUsersResult.getFaceModelVersion() != null && !searchUsersResult.getFaceModelVersion().equals(getFaceModelVersion())) {
            return false;
        }
        if ((searchUsersResult.getSearchedFace() == null) ^ (getSearchedFace() == null)) {
            return false;
        }
        if (searchUsersResult.getSearchedFace() != null && !searchUsersResult.getSearchedFace().equals(getSearchedFace())) {
            return false;
        }
        if ((searchUsersResult.getSearchedUser() == null) ^ (getSearchedUser() == null)) {
            return false;
        }
        return searchUsersResult.getSearchedUser() == null || searchUsersResult.getSearchedUser().equals(getSearchedUser());
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public SearchedFace getSearchedFace() {
        return this.searchedFace;
    }

    public SearchedUser getSearchedUser() {
        return this.searchedUser;
    }

    public List<UserMatch> getUserMatches() {
        return this.userMatches;
    }

    public int hashCode() {
        return (((((((getUserMatches() == null ? 0 : getUserMatches().hashCode()) + 31) * 31) + (getFaceModelVersion() == null ? 0 : getFaceModelVersion().hashCode())) * 31) + (getSearchedFace() == null ? 0 : getSearchedFace().hashCode())) * 31) + (getSearchedUser() != null ? getSearchedUser().hashCode() : 0);
    }

    public void setFaceModelVersion(String str) {
        this.faceModelVersion = str;
    }

    public void setSearchedFace(SearchedFace searchedFace) {
        this.searchedFace = searchedFace;
    }

    public void setSearchedUser(SearchedUser searchedUser) {
        this.searchedUser = searchedUser;
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
        if (getSearchedUser() != null) {
            sb.append("SearchedUser: " + getSearchedUser());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchUsersResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public SearchUsersResult withSearchedFace(SearchedFace searchedFace) {
        this.searchedFace = searchedFace;
        return this;
    }

    public SearchUsersResult withSearchedUser(SearchedUser searchedUser) {
        this.searchedUser = searchedUser;
        return this;
    }

    public SearchUsersResult withUserMatches(UserMatch... userMatchArr) {
        if (getUserMatches() == null) {
            this.userMatches = new ArrayList(userMatchArr.length);
        }
        for (UserMatch userMatch : userMatchArr) {
            this.userMatches.add(userMatch);
        }
        return this;
    }

    public SearchUsersResult withUserMatches(Collection<UserMatch> collection) {
        setUserMatches(collection);
        return this;
    }
}
