package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class SearchUsersByImageRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private Image image;
    private Integer maxUsers;
    private String qualityFilter;
    private Float userMatchThreshold;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SearchUsersByImageRequest)) {
            return false;
        }
        SearchUsersByImageRequest searchUsersByImageRequest = (SearchUsersByImageRequest) obj;
        if ((searchUsersByImageRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (searchUsersByImageRequest.getCollectionId() != null && !searchUsersByImageRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((searchUsersByImageRequest.getImage() == null) ^ (getImage() == null)) {
            return false;
        }
        if (searchUsersByImageRequest.getImage() != null && !searchUsersByImageRequest.getImage().equals(getImage())) {
            return false;
        }
        if ((searchUsersByImageRequest.getUserMatchThreshold() == null) ^ (getUserMatchThreshold() == null)) {
            return false;
        }
        if (searchUsersByImageRequest.getUserMatchThreshold() != null && !searchUsersByImageRequest.getUserMatchThreshold().equals(getUserMatchThreshold())) {
            return false;
        }
        if ((searchUsersByImageRequest.getMaxUsers() == null) ^ (getMaxUsers() == null)) {
            return false;
        }
        if (searchUsersByImageRequest.getMaxUsers() != null && !searchUsersByImageRequest.getMaxUsers().equals(getMaxUsers())) {
            return false;
        }
        if ((searchUsersByImageRequest.getQualityFilter() == null) ^ (getQualityFilter() == null)) {
            return false;
        }
        return searchUsersByImageRequest.getQualityFilter() == null || searchUsersByImageRequest.getQualityFilter().equals(getQualityFilter());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public Image getImage() {
        return this.image;
    }

    public Integer getMaxUsers() {
        return this.maxUsers;
    }

    public String getQualityFilter() {
        return this.qualityFilter;
    }

    public Float getUserMatchThreshold() {
        return this.userMatchThreshold;
    }

    public int hashCode() {
        return (((((((((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getImage() == null ? 0 : getImage().hashCode())) * 31) + (getUserMatchThreshold() == null ? 0 : getUserMatchThreshold().hashCode())) * 31) + (getMaxUsers() == null ? 0 : getMaxUsers().hashCode())) * 31) + (getQualityFilter() != null ? getQualityFilter().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setMaxUsers(Integer num) {
        this.maxUsers = num;
    }

    public void setQualityFilter(String str) {
        this.qualityFilter = str;
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
        if (getImage() != null) {
            sb.append("Image: " + getImage() + ",");
        }
        if (getUserMatchThreshold() != null) {
            sb.append("UserMatchThreshold: " + getUserMatchThreshold() + ",");
        }
        if (getMaxUsers() != null) {
            sb.append("MaxUsers: " + getMaxUsers() + ",");
        }
        if (getQualityFilter() != null) {
            sb.append("QualityFilter: " + getQualityFilter());
        }
        sb.append("}");
        return sb.toString();
    }

    public SearchUsersByImageRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public SearchUsersByImageRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    public SearchUsersByImageRequest withMaxUsers(Integer num) {
        this.maxUsers = num;
        return this;
    }

    public SearchUsersByImageRequest withQualityFilter(String str) {
        this.qualityFilter = str;
        return this;
    }

    public SearchUsersByImageRequest withUserMatchThreshold(Float f) {
        this.userMatchThreshold = f;
        return this;
    }

    public void setQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
    }

    public SearchUsersByImageRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
        return this;
    }
}
