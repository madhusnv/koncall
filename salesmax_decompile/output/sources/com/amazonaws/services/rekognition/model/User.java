package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class User implements Serializable {
    private String userId;
    private String userStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if ((user.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (user.getUserId() != null && !user.getUserId().equals(getUserId())) {
            return false;
        }
        if ((user.getUserStatus() == null) ^ (getUserStatus() == null)) {
            return false;
        }
        return user.getUserStatus() == null || user.getUserStatus().equals(getUserStatus());
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

    public User withUserId(String str) {
        this.userId = str;
        return this;
    }

    public User withUserStatus(String str) {
        this.userStatus = str;
        return this;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
    }

    public User withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }
}
