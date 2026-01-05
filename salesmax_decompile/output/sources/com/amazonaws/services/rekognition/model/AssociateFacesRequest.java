package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class AssociateFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String collectionId;
    private List<String> faceIds;
    private String userId;
    private Float userMatchThreshold;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssociateFacesRequest)) {
            return false;
        }
        AssociateFacesRequest associateFacesRequest = (AssociateFacesRequest) obj;
        if ((associateFacesRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (associateFacesRequest.getCollectionId() != null && !associateFacesRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((associateFacesRequest.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (associateFacesRequest.getUserId() != null && !associateFacesRequest.getUserId().equals(getUserId())) {
            return false;
        }
        if ((associateFacesRequest.getFaceIds() == null) ^ (getFaceIds() == null)) {
            return false;
        }
        if (associateFacesRequest.getFaceIds() != null && !associateFacesRequest.getFaceIds().equals(getFaceIds())) {
            return false;
        }
        if ((associateFacesRequest.getUserMatchThreshold() == null) ^ (getUserMatchThreshold() == null)) {
            return false;
        }
        if (associateFacesRequest.getUserMatchThreshold() != null && !associateFacesRequest.getUserMatchThreshold().equals(getUserMatchThreshold())) {
            return false;
        }
        if ((associateFacesRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        return associateFacesRequest.getClientRequestToken() == null || associateFacesRequest.getClientRequestToken().equals(getClientRequestToken());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public List<String> getFaceIds() {
        return this.faceIds;
    }

    public String getUserId() {
        return this.userId;
    }

    public Float getUserMatchThreshold() {
        return this.userMatchThreshold;
    }

    public int hashCode() {
        return (((((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getUserId() == null ? 0 : getUserId().hashCode())) * 31) + (getFaceIds() == null ? 0 : getFaceIds().hashCode())) * 31) + (getUserMatchThreshold() == null ? 0 : getUserMatchThreshold().hashCode())) * 31) + (getClientRequestToken() != null ? getClientRequestToken().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setFaceIds(Collection<String> collection) {
        if (collection == null) {
            this.faceIds = null;
        } else {
            this.faceIds = new ArrayList(collection);
        }
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
        if (getFaceIds() != null) {
            sb.append("FaceIds: " + getFaceIds() + ",");
        }
        if (getUserMatchThreshold() != null) {
            sb.append("UserMatchThreshold: " + getUserMatchThreshold() + ",");
        }
        if (getClientRequestToken() != null) {
            sb.append("ClientRequestToken: " + getClientRequestToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public AssociateFacesRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public AssociateFacesRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public AssociateFacesRequest withFaceIds(String... strArr) {
        if (getFaceIds() == null) {
            this.faceIds = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.faceIds.add(str);
        }
        return this;
    }

    public AssociateFacesRequest withUserId(String str) {
        this.userId = str;
        return this;
    }

    public AssociateFacesRequest withUserMatchThreshold(Float f) {
        this.userMatchThreshold = f;
        return this;
    }

    public AssociateFacesRequest withFaceIds(Collection<String> collection) {
        setFaceIds(collection);
        return this;
    }
}
