package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListFacesRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private List<String> faceIds;
    private Integer maxResults;
    private String nextToken;
    private String userId;

    public ListFacesRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListFacesRequest)) {
            return false;
        }
        ListFacesRequest listFacesRequest = (ListFacesRequest) obj;
        if ((listFacesRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (listFacesRequest.getCollectionId() != null && !listFacesRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((listFacesRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listFacesRequest.getNextToken() != null && !listFacesRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listFacesRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listFacesRequest.getMaxResults() != null && !listFacesRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listFacesRequest.getUserId() == null) ^ (getUserId() == null)) {
            return false;
        }
        if (listFacesRequest.getUserId() != null && !listFacesRequest.getUserId().equals(getUserId())) {
            return false;
        }
        if ((listFacesRequest.getFaceIds() == null) ^ (getFaceIds() == null)) {
            return false;
        }
        return listFacesRequest.getFaceIds() == null || listFacesRequest.getFaceIds().equals(getFaceIds());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public List<String> getFaceIds() {
        return this.faceIds;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getUserId() == null ? 0 : getUserId().hashCode())) * 31) + (getFaceIds() != null ? getFaceIds().hashCode() : 0);
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

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
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
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getUserId() != null) {
            sb.append("UserId: " + getUserId() + ",");
        }
        if (getFaceIds() != null) {
            sb.append("FaceIds: " + getFaceIds());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListFacesRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public ListFacesRequest withFaceIds(String... strArr) {
        if (getFaceIds() == null) {
            this.faceIds = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.faceIds.add(str);
        }
        return this;
    }

    public ListFacesRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListFacesRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListFacesRequest withUserId(String str) {
        this.userId = str;
        return this;
    }

    public ListFacesRequest(String str) {
        setCollectionId(str);
    }

    public ListFacesRequest withFaceIds(Collection<String> collection) {
        setFaceIds(collection);
        return this;
    }
}
