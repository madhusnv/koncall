package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class SearchUsersRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private String faceId;
    private Integer maxUsers;
    private String userId;
    private Float userMatchThreshold;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchUsersRequest)) {
            return false;
        }
        SearchUsersRequest searchUsersRequest = (SearchUsersRequest) obj;
        if ((searchUsersRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (searchUsersRequest.getCollectionId() != null && !searchUsersRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((searchUsersRequest.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (searchUsersRequest.getUserId() != null && !searchUsersRequest.getUserId().equals(getUserId())) {
            return false;
        }
        if ((searchUsersRequest.getFaceId() == null) ^ (getFaceId() == null)) {
            return false;
        }
        if (searchUsersRequest.getFaceId() != null && !searchUsersRequest.getFaceId().equals(getFaceId())) {
            return false;
        }
        if ((searchUsersRequest.getUserMatchThreshold() == null) ^ (getUserMatchThreshold() == null)) {
            return false;
        }
        if (searchUsersRequest.getUserMatchThreshold() != null && !searchUsersRequest.getUserMatchThreshold().equals(getUserMatchThreshold())) {
            return false;
        }
        if ((searchUsersRequest.getMaxUsers() == null) ^ (getMaxUsers() == null)) {
            return false;
        }
        return searchUsersRequest.getMaxUsers() == null || searchUsersRequest.getMaxUsers().equals(getMaxUsers());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public String getFaceId() {
        return this.faceId;
    }

    public Integer getMaxUsers() {
        return this.maxUsers;
    }

    public String getUserId() {
        return this.userId;
    }

    public Float getUserMatchThreshold() {
        return this.userMatchThreshold;
    }

    public int hashCode() {
        return (((((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getUserId() == null ? 0 : getUserId().hashCode())) * 31) + (getFaceId() == null ? 0 : getFaceId().hashCode())) * 31) + (getUserMatchThreshold() == null ? 0 : getUserMatchThreshold().hashCode())) * 31) + (getMaxUsers() != null ? getMaxUsers().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setFaceId(String str) {
        this.faceId = str;
    }

    public void setMaxUsers(Integer num) {
        this.maxUsers = num;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserMatchThreshold(Float f) {
        this.userMatchThreshold = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getUserId() != null) {
            sb.append("UserId: " + getUserId() + ",");
        }
        if (getFaceId() != null) {
            sb.append("FaceId: " + getFaceId() + ",");
        }
        if (getUserMatchThreshold() != null) {
            sb.append("UserMatchThreshold: " + getUserMatchThreshold() + ",");
        }
        if (getMaxUsers() != null) {
            sb.append("MaxUsers: " + getMaxUsers());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchUsersRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public SearchUsersRequest withFaceId(String str) {
        this.faceId = str;
        return this;
    }

    public SearchUsersRequest withMaxUsers(Integer num) {
        this.maxUsers = num;
        return this;
    }

    public SearchUsersRequest withUserId(String str) {
        this.userId = str;
        return this;
    }

    public SearchUsersRequest withUserMatchThreshold(Float f) {
        this.userMatchThreshold = f;
        return this;
    }
}
