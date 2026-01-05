package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteUserRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String collectionId;
    private String userId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteUserRequest)) {
            return false;
        }
        DeleteUserRequest deleteUserRequest = (DeleteUserRequest) obj;
        if ((deleteUserRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (deleteUserRequest.getCollectionId() != null && !deleteUserRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((deleteUserRequest.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (deleteUserRequest.getUserId() != null && !deleteUserRequest.getUserId().equals(getUserId())) {
            return false;
        }
        if ((deleteUserRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        return deleteUserRequest.getClientRequestToken() == null || deleteUserRequest.getClientRequestToken().equals(getClientRequestToken());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getUserId() == null ? 0 : getUserId().hashCode())) * 31) + (getClientRequestToken() != null ? getClientRequestToken().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
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
        if (getClientRequestToken() != null) {
            sb.append("ClientRequestToken: " + getClientRequestToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteUserRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public DeleteUserRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public DeleteUserRequest withUserId(String str) {
        this.userId = str;
        return this;
    }
}
