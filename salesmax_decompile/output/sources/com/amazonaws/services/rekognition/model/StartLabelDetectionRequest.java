package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class StartLabelDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private List<String> features;
    private String jobTag;
    private Float minConfidence;
    private NotificationChannel notificationChannel;
    private LabelDetectionSettings settings;
    private Video video;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartLabelDetectionRequest)) {
            return false;
        }
        StartLabelDetectionRequest startLabelDetectionRequest = (StartLabelDetectionRequest) obj;
        if ((startLabelDetectionRequest.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (startLabelDetectionRequest.getVideo() != null && !startLabelDetectionRequest.getVideo().equals(getVideo())) {
            return false;
        }
        if ((startLabelDetectionRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        if (startLabelDetectionRequest.getClientRequestToken() != null && !startLabelDetectionRequest.getClientRequestToken().equals(getClientRequestToken())) {
            return false;
        }
        if ((startLabelDetectionRequest.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        if (startLabelDetectionRequest.getMinConfidence() != null && !startLabelDetectionRequest.getMinConfidence().equals(getMinConfidence())) {
            return false;
        }
        if ((startLabelDetectionRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (startLabelDetectionRequest.getNotificationChannel() != null && !startLabelDetectionRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((startLabelDetectionRequest.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        if (startLabelDetectionRequest.getJobTag() != null && !startLabelDetectionRequest.getJobTag().equals(getJobTag())) {
            return false;
        }
        if ((startLabelDetectionRequest.getFeatures() == null) ^ (getFeatures() == null)) {
            return false;
        }
        if (startLabelDetectionRequest.getFeatures() != null && !startLabelDetectionRequest.getFeatures().equals(getFeatures())) {
            return false;
        }
        if ((startLabelDetectionRequest.getSettings() == null) ^ (getSettings() == null)) {
            return false;
        }
        return startLabelDetectionRequest.getSettings() == null || startLabelDetectionRequest.getSettings().equals(getSettings());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public List<String> getFeatures() {
        return this.features;
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

    public LabelDetectionSettings getSettings() {
        return this.settings;
    }

    public Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        return (((((((((((((getVideo() == null ? 0 : getVideo().hashCode()) + 31) * 31) + (getClientRequestToken() == null ? 0 : getClientRequestToken().hashCode())) * 31) + (getMinConfidence() == null ? 0 : getMinConfidence().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getJobTag() == null ? 0 : getJobTag().hashCode())) * 31) + (getFeatures() == null ? 0 : getFeatures().hashCode())) * 31) + (getSettings() != null ? getSettings().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setFeatures(Collection<String> collection) {
        if (collection == null) {
            this.features = null;
        } else {
            this.features = new ArrayList(collection);
        }
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

    public void setSettings(LabelDetectionSettings labelDetectionSettings) {
        this.settings = labelDetectionSettings;
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
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        }
        if (getNotificationChannel() != null) {
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        }
        if (getJobTag() != null) {
            sb.append("JobTag: " + getJobTag() + ",");
        }
        if (getFeatures() != null) {
            sb.append("Features: " + getFeatures() + ",");
        }
        if (getSettings() != null) {
            sb.append("Settings: " + getSettings());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartLabelDetectionRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public StartLabelDetectionRequest withFeatures(String... strArr) {
        if (getFeatures() == null) {
            this.features = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.features.add(str);
        }
        return this;
    }

    public StartLabelDetectionRequest withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public StartLabelDetectionRequest withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }

    public StartLabelDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    public StartLabelDetectionRequest withSettings(LabelDetectionSettings labelDetectionSettings) {
        this.settings = labelDetectionSettings;
        return this;
    }

    public StartLabelDetectionRequest withVideo(Video video) {
        this.video = video;
        return this;
    }

    public StartLabelDetectionRequest withFeatures(Collection<String> collection) {
        setFeatures(collection);
        return this;
    }
}
