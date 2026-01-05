package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartTextDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private StartTextDetectionFilters filters;
    private String jobTag;
    private NotificationChannel notificationChannel;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartTextDetectionRequest)) {
            return false;
        }
        StartTextDetectionRequest startTextDetectionRequest = (StartTextDetectionRequest) obj;
        if ((startTextDetectionRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startTextDetectionRequest.getVideo() != null && !startTextDetectionRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startTextDetectionRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startTextDetectionRequest.getClientRequestToken() != null && !startTextDetectionRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startTextDetectionRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startTextDetectionRequest.getNotificationChannel() != null && !startTextDetectionRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startTextDetectionRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        if (startTextDetectionRequest.getJobTag() != null && !startTextDetectionRequest.getJobTag().equals(getJobTag())) {
            return false;
        }
        if ((startTextDetectionRequest.getFilters() == null) ^ (getFilters() == null)) {
            return false;
        }
        return startTextDetectionRequest.getFilters() == null || startTextDetectionRequest.getFilters().equals(getFilters());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public StartTextDetectionFilters getFilters() {
        return this.filters;
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
        return (((((((((getVideo() == null ? 0 : getVideo().hashCode()) + 31) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getJobTag() == null ? 0 : getJobTag().hashCode())) * 31) + (getFilters() != null ? getFilters().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setFilters(StartTextDetectionFilters startTextDetectionFilters) {
        this.filters = startTextDetectionFilters;
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
            sb.append("JobTag: " + getJobTag() + ",");
        }
        if (getFilters() != null) {
            sb.append("Filters: " + getFilters());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartTextDetectionRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartTextDetectionRequest withFilters(StartTextDetectionFilters startTextDetectionFilters) {
        this.filters = startTextDetectionFilters;
        return this;
    }

    public StartTextDetectionRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartTextDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartTextDetectionRequest withVideo(Video video) {
        this.video = video;
        return this;
    }
}
