package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class MatchedUser implements Serializable {
    private String userId;
    private String userStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MatchedUser)) {
            return false;
        }
        MatchedUser matchedUser = (MatchedUser) obj;
        if ((matchedUser.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (matchedUser.getUserId() != null && !matchedUser.getUserId().equals(getUserId())) {
            return false;
        }
        if ((matchedUser.getUserStatus() == null) ^ (getUserStatus() == null)) {
            return false;
        }
        return matchedUser.getUserStatus() == null || matchedUser.getUserStatus().equals(getUserStatus());
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserStatus() {
        return this.userStatus;
    }

    public int hashCode() {
        return (((getUserId() == null ? 0 : getUserId().hashCode()) + 31) * 31) + (getUserStatus() != null ? getUserStatus().hashCode() : 0);
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserStatus(String str) {
        this.userStatus = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserId() != null) {
            sb.append("UserId: " + getUserId() + ",");
        }
        if (getUserStatus() != null) {
            sb.append("UserStatus: " + getUserStatus());
        }
        sb.append("}");
        return sb.toString();
    }

    public MatchedUser withUserId(String str) {
        this.userId = str;
        return this;
    }

    public MatchedUser withUserStatus(String str) {
        this.userStatus = str;
        return this;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
    }

    public MatchedUser withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }
}
