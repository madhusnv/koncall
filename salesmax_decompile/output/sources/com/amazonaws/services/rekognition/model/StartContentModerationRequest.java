package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartContentModerationRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String jobTag;
    private Float minConfidence;
    private NotificationChannel notificationChannel;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartContentModerationRequest)) {
            return false;
        }
        StartContentModerationRequest startContentModerationRequest = (StartContentModerationRequest) obj;
        if ((startContentModerationRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startContentModerationRequest.getVideo() != null && !startContentModerationRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startContentModerationRequest.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        if (startContentModerationRequest.getMinConfidence() != null && !startContentModerationRequest.getMinConfidence().equals(getMinConfidence())) {
            return false;
        }
        if ((startContentModerationRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startContentModerationRequest.getClientRequestToken() != null && !startContentModerationRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startContentModerationRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startContentModerationRequest.getNotificationChannel() != null && !startContentModerationRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startContentModerationRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return startContentModerationRequest.getJobTag() == null || startContentModerationRequest.getJobTag().equals(getJobTag());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getJobTag() {
        return this.jobTag;
    }

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    public Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        return (((((((((getVideo() == null ? 0 : getVideo().hashCode()) + 31) * 31) + (getMinConfidence() == null ? 0 : getMinConfidence().hashCode())) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setJobTag(String str) {
        this.jobTag = str;
    }

    public void setMinConfidence(Float f) {
        this.minConfidence = f;
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
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence() + ",");
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

    public StartContentModerationRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartContentModerationRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartContentModerationRequest withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }

    public StartContentModerationRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartContentModerationRequest withVideo(Video video) {
        this.video = video;
        return this;
    }
}
