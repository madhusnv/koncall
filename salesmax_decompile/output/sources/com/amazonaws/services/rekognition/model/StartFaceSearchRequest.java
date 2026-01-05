package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartFaceSearchRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String collectionId;
    private Float faceMatchThreshold;
    private String jobTag;
    private NotificationChannel notificationChannel;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartFaceSearchRequest)) {
            return false;
        }
        StartFaceSearchRequest startFaceSearchRequest = (StartFaceSearchRequest) obj;
        if ((startFaceSearchRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startFaceSearchRequest.getVideo() != null && !startFaceSearchRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startFaceSearchRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startFaceSearchRequest.getClientRequestToken() != null && !startFaceSearchRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startFaceSearchRequest.getFaceMatchThreshold() == null) ^ (getFaceMatchThreshold() == null)) {
            return false;
        }
        if (startFaceSearchRequest.getFaceMatchThreshold() != null && !startFaceSearchRequest.getFaceMatchThreshold().equals(getFaceMatchThreshold())) {
            return false;
        }
        if ((startFaceSearchRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (startFaceSearchRequest.getCollectionId() != null && !startFaceSearchRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((startFaceSearchRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startFaceSearchRequest.getNotificationChannel() != null && !startFaceSearchRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startFaceSearchRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return startFaceSearchRequest.getJobTag() == null || startFaceSearchRequest.getJobTag().equals(getJobTag());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    public String getJobTag() {
        return this.jobTag;
    }

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    public Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        return (((((((((((getVideo() == null ? 0 : getVideo().hashCode()) + 31) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getFaceMatchThreshold() == null ? 0 : getFaceMatchThreshold().hashCode())) * 31) + (getCollectionId() == null ? 0 : getCollectionId().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
    }

    public void setJobTag(String str) {
        this.jobTag = str;
    }

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVideo() != null) {
            sb.append("Video: " + getVideo() + ",");
        }
        if (getClientRequestToken() != null) {
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        }
        if (getFaceMatchThreshold() != null) {
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold() + ",");
        }
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getNotificationChannel() != null) {
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        }
        if (getJobTag() != null) {
            sb.append("JobTag: " + getJobTag());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartFaceSearchRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartFaceSearchRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public StartFaceSearchRequest withFaceMatchThreshold(Float f) {
        this.faceMatchThreshold = f;
        return this;
    }

    public StartFaceSearchRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartFaceSearchRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartFaceSearchRequest withVideo(Video video) {
        this.video = video;
        return this;
    }
}
