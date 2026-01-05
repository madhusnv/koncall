package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartFaceDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String faceAttributes;
    private String jobTag;
    private NotificationChannel notificationChannel;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartFaceDetectionRequest)) {
            return false;
        }
        StartFaceDetectionRequest startFaceDetectionRequest = (StartFaceDetectionRequest) obj;
        if ((startFaceDetectionRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startFaceDetectionRequest.getVideo() != null && !startFaceDetectionRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startFaceDetectionRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startFaceDetectionRequest.getClientRequestToken() != null && !startFaceDetectionRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startFaceDetectionRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startFaceDetectionRequest.getNotificationChannel() != null && !startFaceDetectionRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startFaceDetectionRequest.getFaceAttributes() == null) ^ (getFaceAttributes() == null)) {
            return false;
        }
        if (startFaceDetectionRequest.getFaceAttributes() != null && !startFaceDetectionRequest.getFaceAttributes().equals(getFaceAttributes())) {
            return false;
        }
        if ((startFaceDetectionRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return startFaceDetectionRequest.getJobTag() == null || startFaceDetectionRequest.getJobTag().equals(getJobTag());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getFaceAttributes() {
        return this.faceAttributes;
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
        return (((((((((getVideo() == null ? 0 : getVideo().hashCode()) + 31) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getFaceAttributes() == null ? 0 : getFaceAttributes().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setFaceAttributes(String str) {
        this.faceAttributes = str;
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
        if (getNotificationChannel() != null) {
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        }
        if (getFaceAttributes() != null) {
            sb.append("FaceAttributes: " + getFaceAttributes() + ",");
        }
        if (getJobTag() != null) {
            sb.append("JobTag: " + getJobTag());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartFaceDetectionRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartFaceDetectionRequest withFaceAttributes(String str) {
        this.faceAttributes = str;
        return this;
    }

    public StartFaceDetectionRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartFaceDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartFaceDetectionRequest withVideo(Video video) {
        this.video = video;
        return this;
    }

    public void setFaceAttributes(FaceAttributes faceAttributes) {
        this.faceAttributes = faceAttributes.toString();
    }

    public StartFaceDetectionRequest withFaceAttributes(FaceAttributes faceAttributes) {
        this.faceAttributes = faceAttributes.toString();
        return this;
    }
}
