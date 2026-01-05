package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartPersonTrackingRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String jobTag;
    private NotificationChannel notificationChannel;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartPersonTrackingRequest)) {
            return false;
        }
        StartPersonTrackingRequest startPersonTrackingRequest = (StartPersonTrackingRequest) obj;
        if ((startPersonTrackingRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startPersonTrackingRequest.getVideo() != null && !startPersonTrackingRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startPersonTrackingRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startPersonTrackingRequest.getClientRequestToken() != null && !startPersonTrackingRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startPersonTrackingRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startPersonTrackingRequest.getNotificationChannel() != null && !startPersonTrackingRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startPersonTrackingRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return startPersonTrackingRequest.getJobTag() == null || startPersonTrackingRequest.getJobTag().equals(getJobTag());
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

    public StartPersonTrackingRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartPersonTrackingRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartPersonTrackingRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartPersonTrackingRequest withVideo(Video video) {
        this.video = video;
        return this;
    }
}
