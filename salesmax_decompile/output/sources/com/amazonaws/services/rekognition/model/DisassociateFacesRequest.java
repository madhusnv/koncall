package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DisassociateFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String collectionId;
    private List<String> faceIds;
    private String userId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisassociateFacesRequest)) {
            return false;
        }
        DisassociateFacesRequest disassociateFacesRequest = (DisassociateFacesRequest) obj;
        if ((disassociateFacesRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (disassociateFacesRequest.getCollectionId() != null && !disassociateFacesRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((disassociateFacesRequest.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (disassociateFacesRequest.getUserId() != null && !disassociateFacesRequest.getUserId().equals(getUserId())) {
            return false;
        }
        if ((disassociateFacesRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (disassociateFacesRequest.getClientRequestToken() != null && !disassociateFacesRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((disassociateFacesRequest.getFaceIds() == null) ^ (getFaceIds() == null)) {
            return false;
        }
        return disassociateFacesRequest.getFaceIds() == null || disassociateFacesRequest.getFaceIds().equals(getFaceIds());
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

    public int hashCode() {
        return (((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getUserId() == null ? 0 : getUserId().hashCode())) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getFaceIds() != null ? getFaceIds().hashCode() : 0);
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
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        }
        if (getFaceIds() != null) {
            sb.append("FaceIds: " + getFaceIds());
        }
        sb.append("}");
        return sb.toString();
    }

    public DisassociateFacesRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public DisassociateFacesRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public DisassociateFacesRequest withFaceIds(String... strArr) {
        if (getFaceIds() == null) {
            this.faceIds = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.faceIds.add(str);
        }
        return this;
    }

    public DisassociateFacesRequest withUserId(String str) {
        this.userId = str;
        return this;
    }

    public DisassociateFacesRequest withFaceIds(Collection<String> collection) {
        setFaceIds(collection);
        return this;
    }
}
