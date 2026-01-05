package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListCollectionsResult implements Serializable {
    private List<String> collectionIds;
    private List<String> faceModelVersions;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListCollectionsResult)) {
            return false;
        }
        ListCollectionsResult listCollectionsResult = (ListCollectionsResult) obj;
        if ((listCollectionsResult.getCollectionIds() == null) ^ (getCollectionIds() == null)) {
            return false;
        }
        if (listCollectionsResult.getCollectionIds() != null && !listCollectionsResult.getCollectionIds().equals(getCollectionIds())) {
            return false;
        }
        if ((listCollectionsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listCollectionsResult.getNextToken() != null && !listCollectionsResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listCollectionsResult.getFaceModelVersions() == null) ^ (getFaceModelVersions() == null)) {
            return false;
        }
        return listCollectionsResult.getFaceModelVersions() == null || listCollectionsResult.getFaceModelVersions().equals(getFaceModelVersions());
    }

    public List<String> getCollectionIds() {
        return this.collectionIds;
    }

    public List<String> getFaceModelVersions() {
        return this.faceModelVersions;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getCollectionIds() == null ? 0 : getCollectionIds().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getFaceModelVersions() != null ? getFaceModelVersions().hashCode() : 0);
    }

    public void setCollectionIds(Collection<String> collection) {
        if (collection == null) {
            this.collectionIds = null;
        } else {
            this.collectionIds = new ArrayList(collection);
        }
    }

    public void setFaceModelVersions(Collection<String> collection) {
        if (collection == null) {
            this.faceModelVersions = null;
        } else {
            this.faceModelVersions = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionIds() != null) {
            sb.append("CollectionIds: " + getCollectionIds() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getFaceModelVersions() != null) {
            sb.append("FaceModelVersions: " + getFaceModelVersions());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListCollectionsResult withCollectionIds(String... strArr) {
        if (getCollectionIds() == null) {
            this.collectionIds = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.collectionIds.add(str);
        }
        return this;
    }

    public ListCollectionsResult withFaceModelVersions(String... strArr) {
        if (getFaceModelVersions() == null) {
            this.faceModelVersions = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.faceModelVersions.add(str);
        }
        return this;
    }

    public ListCollectionsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListCollectionsResult withCollectionIds(Collection<String> collection) {
        setCollectionIds(collection);
        return this;
    }

    public ListCollectionsResult withFaceModelVersions(Collection<String> collection) {
        setFaceModelVersions(collection);
        return this;
    }
}
