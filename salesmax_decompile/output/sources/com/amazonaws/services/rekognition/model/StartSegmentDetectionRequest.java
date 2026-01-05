package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class StartSegmentDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private StartSegmentDetectionFilters filters;
    private String jobTag;
    private NotificationChannel notificationChannel;
    private List<String> segmentTypes;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartSegmentDetectionRequest)) {
            return false;
        }
        StartSegmentDetectionRequest startSegmentDetectionRequest = (StartSegmentDetectionRequest) obj;
        if ((startSegmentDetectionRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startSegmentDetectionRequest.getVideo() != null && !startSegmentDetectionRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startSegmentDetectionRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startSegmentDetectionRequest.getClientRequestToken() != null && !startSegmentDetectionRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startSegmentDetectionRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startSegmentDetectionRequest.getNotificationChannel() != null && !startSegmentDetectionRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startSegmentDetectionRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        if (startSegmentDetectionRequest.getJobTag() != null && !startSegmentDetectionRequest.getJobTag().equals(getJobTag())) {
            return false;
        }
        if ((startSegmentDetectionRequest.getFilters() == null) ^ (getFilters() == null)) {
            return false;
        }
        if (startSegmentDetectionRequest.getFilters() != null && !startSegmentDetectionRequest.getFilters().equals(getFilters())) {
            return false;
        }
        if ((startSegmentDetectionRequest.getSegmentTypes() == null) ^ (getSegmentTypes() == null)) {
            return false;
        }
        return startSegmentDetectionRequest.getSegmentTypes() == null || startSegmentDetectionRequest.getSegmentTypes().equals(getSegmentTypes());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public StartSegmentDetectionFilters getFilters() {
        return this.filters;
    }

    public String getJobTag() {
        return this.jobTag;
    }

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    public List<String> getSegmentTypes() {
        return this.segmentTypes;
    }

    public Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        return (((((((((((getVideo() == null ? 0 : getVideo().hashCode()) + 31) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getJobTag() == null ? 0 : getJobTag().hashCode())) * 31) + (getFilters() == null ? 0 : getFilters().hashCode())) * 31) + (getSegmentTypes() != null ? getSegmentTypes().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setFilters(StartSegmentDetectionFilters startSegmentDetectionFilters) {
        this.filters = startSegmentDetectionFilters;
    }

    public void setJobTag(String str) {
        this.jobTag = str;
    }

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void setSegmentTypes(Collection<String> collection) {
        if (collection == null) {
            this.segmentTypes = null;
        } else {
            this.segmentTypes = new ArrayList(collection);
        }
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
            sb.append("Filters: " + getFilters() + ",");
        }
        if (getSegmentTypes() != null) {
            sb.append("SegmentTypes: " + getSegmentTypes());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartSegmentDetectionRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartSegmentDetectionRequest withFilters(StartSegmentDetectionFilters startSegmentDetectionFilters) {
        this.filters = startSegmentDetectionFilters;
        return this;
    }

    public StartSegmentDetectionRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartSegmentDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartSegmentDetectionRequest withSegmentTypes(String... strArr) {
        if (getSegmentTypes() == null) {
            this.segmentTypes = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.segmentTypes.add(str);
        }
        return this;
    }

    public StartSegmentDetectionRequest withVideo(Video video) {
        this.video = video;
        return this;
    }

    public StartSegmentDetectionRequest withSegmentTypes(Collection<String> collection) {
        setSegmentTypes(collection);
        return this;
    }
}
