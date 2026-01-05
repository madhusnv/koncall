package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetContentModerationResult implements Serializable {
    private GetContentModerationRequestMetadata getRequestMetadata;
    private String jobId;
    private String jobStatus;
    private String jobTag;
    private List<ContentModerationDetection> moderationLabels;
    private String moderationModelVersion;
    private String nextToken;
    private String statusMessage;
    private Video video;
    private VideoMetadata videoMetadata;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetContentModerationResult)) {
            return false;
        }
        GetContentModerationResult getContentModerationResult = (GetContentModerationResult) obj;
        if ((getContentModerationResult.getJobStatus() == null) ^ (getJobStatus() == null)) {
            return false;
        }
        if (getContentModerationResult.getJobStatus() != null && !getContentModerationResult.getJobStatus().equals(getJobStatus())) {
            return false;
        }
        if ((getContentModerationResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (getContentModerationResult.getStatusMessage() != null && !getContentModerationResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((getContentModerationResult.getVideoMetadata() == null) ^ (getVideoMetadata() == null)) {
            return false;
        }
        if (getContentModerationResult.getVideoMetadata() != null && !getContentModerationResult.getVideoMetadata().equals(getVideoMetadata())) {
            return false;
        }
        if ((getContentModerationResult.getModerationLabels() == null) ^ (getModerationLabels() == null)) {
            return false;
        }
        if (getContentModerationResult.getModerationLabels() != null && !getContentModerationResult.getModerationLabels().equals(getModerationLabels())) {
            return false;
        }
        if ((getContentModerationResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getContentModerationResult.getNextToken() != null && !getContentModerationResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getContentModerationResult.getModerationModelVersion() == null) ^ (getModerationModelVersion() == null)) {
            return false;
        }
        if (getContentModerationResult.getModerationModelVersion() != null && !getContentModerationResult.getModerationModelVersion().equals(getModerationModelVersion())) {
            return false;
        }
        if ((getContentModerationResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getContentModerationResult.getJobId() != null && !getContentModerationResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getContentModerationResult.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (getContentModerationResult.getVideo() != null && !getContentModerationResult.getVideo().equals(getVideo())) {
            return false;
        }
        if ((getContentModerationResult.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        if (getContentModerationResult.getJobTag() != null && !getContentModerationResult.getJobTag().equals(getJobTag())) {
            return false;
        }
        if ((getContentModerationResult.getGetRequestMetadata() == null) ^ (getGetRequestMetadata() == null)) {
            return false;
        }
        return getContentModerationResult.getGetRequestMetadata() == null || getContentModerationResult.getGetRequestMetadata().equals(getGetRequestMetadata());
    }

    public GetContentModerationRequestMetadata getGetRequestMetadata() {
        return this.getRequestMetadata;
    }

    public String getJobId() {
        return this.jobId;
    }

    public String getJobStatus() {
        return this.jobStatus;
    }

    public String getJobTag() {
        return this.jobTag;
    }

    public List<ContentModerationDetection> getModerationLabels() {
        return this.moderationLabels;
    }

    public String getModerationModelVersion() {
        return this.moderationModelVersion;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    public int hashCode() {
        return (((((((((((((((((((getJobStatus() == null ? 0 : getJobStatus().hashCode()) + 31) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getVideoMetadata() == null ? 0 : getVideoMetadata().hashCode())) * 31) + (getModerationLabels() == null ? 0 : getModerationLabels().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getModerationModelVersion() == null ? 0 : getModerationModelVersion().hashCode())) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getVideo() == null ? 0 : getVideo().hashCode())) * 31) + (getJobTag() == null ? 0 : getJobTag().hashCode())) * 31) + (getGetRequestMetadata() != null ? getGetRequestMetadata().hashCode() : 0);
    }

    public void setGetRequestMetadata(GetContentModerationRequestMetadata getContentModerationRequestMetadata) {
        this.getRequestMetadata = getContentModerationRequestMetadata;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public void setJobStatus(String str) {
        this.jobStatus = str;
    }

    public void setJobTag(String str) {
        this.jobTag = str;
    }

    public void setModerationLabels(Collection<ContentModerationDetection> collection) {
        if (collection == null) {
            this.moderationLabels = null;
        } else {
            this.moderationLabels = new ArrayList(collection);
        }
    }

    public void setModerationModelVersion(String str) {
        this.moderationModelVersion = str;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobStatus() != null) {
            sb.append("JobStatus: " + getJobStatus() + ",");
        }
        if (getStatusMessage() != null) {
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        }
        if (getVideoMetadata() != null) {
            sb.append("VideoMetadata: " + getVideoMetadata() + ",");
        }
        if (getModerationLabels() != null) {
            sb.append("ModerationLabels: " + getModerationLabels() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getModerationModelVersion() != null) {
            sb.append("ModerationModelVersion: " + getModerationModelVersion() + ",");
        }
        if (getJobId() != null) {
            sb.append("JobId: " + getJobId() + ",");
        }
        if (getVideo() != null) {
            sb.append("Video: " + getVideo() + ",");
        }
        if (getJobTag() != null) {
            sb.append("JobTag: " + getJobTag() + ",");
        }
        if (getGetRequestMetadata() != null) {
            sb.append("GetRequestMetadata: " + getGetRequestMetadata());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetContentModerationResult withGetRequestMetadata(GetContentModerationRequestMetadata getContentModerationRequestMetadata) {
        this.getRequestMetadata = getContentModerationRequestMetadata;
        return this;
    }

    public GetContentModerationResult withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetContentModerationResult withJobStatus(String str) {
        this.jobStatus = str;
        return this;
    }

    public GetContentModerationResult withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public GetContentModerationResult withModerationLabels(ContentModerationDetection... contentModerationDetectionArr) {
        if (getModerationLabels() == null) {
            this.moderationLabels = new ArrayList(contentModerationDetectionArr.length);
        }
        for (ContentModerationDetection contentModerationDetection : contentModerationDetectionArr) {
            this.moderationLabels.add(contentModerationDetection);
        }
        return this;
    }

    public GetContentModerationResult withModerationModelVersion(String str) {
        this.moderationModelVersion = str;
        return this;
    }

    public GetContentModerationResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetContentModerationResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public GetContentModerationResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    public GetContentModerationResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    public void setJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
    }

    public GetContentModerationResult withJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
        return this;
    }

    public GetContentModerationResult withModerationLabels(Collection<ContentModerationDetection> collection) {
        setModerationLabels(collection);
        return this;
    }
}
