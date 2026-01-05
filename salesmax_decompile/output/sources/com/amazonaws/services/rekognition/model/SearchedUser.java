package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class SearchedUser implements Serializable {
    private String userId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchedUser)) {
            return false;
        }
        SearchedUser searchedUser = (SearchedUser) obj;
        if ((searchedUser.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        return searchedUser.getUserId() == null || searchedUser.getUserId().equals(getUserId());
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return 31 + (getUserId() == null ? 0 : getUserId().hashCode());
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserId() != null) {
            sb.append("UserId: " + getUserId());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchedUser withUserId(String str) {
        this.userId = str;
        return this;
    }
}
