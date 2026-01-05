package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartCelebrityRecognitionRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String jobTag;
    private NotificationChannel notificationChannel;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartCelebrityRecognitionRequest)) {
            return false;
        }
        StartCelebrityRecognitionRequest startCelebrityRecognitionRequest = (StartCelebrityRecognitionRequest) obj;
        if ((startCelebrityRecognitionRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startCelebrityRecognitionRequest.getVideo() != null && !startCelebrityRecognitionRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startCelebrityRecognitionRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startCelebrityRecognitionRequest.getClientRequestToken() != null && !startCelebrityRecognitionRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startCelebrityRecognitionRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startCelebrityRecognitionRequest.getNotificationChannel() != null && !startCelebrityRecognitionRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startCelebrityRecognitionRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return startCelebrityRecognitionRequest.getJobTag() == null || startCelebrityRecognitionRequest.getJobTag().equals(getJobTag());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
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
        return (((((((getVideo() == null ? 0 : getVideo().hashCode()) + 31) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
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
        if (getJobTag() != null) {
            sb.append("JobTag: " + getJobTag());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartCelebrityRecognitionRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartCelebrityRecognitionRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartCelebrityRecognitionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartCelebrityRecognitionRequest withVideo(Video video) {
        this.video = video;
        return this;
    }
}
