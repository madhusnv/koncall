package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetLabelDetectionResult implements Serializable {
    private GetLabelDetectionRequestMetadata getRequestMetadata;
    private String jobId;
    private String jobStatus;
    private String jobTag;
    private String labelModelVersion;
    private List<LabelDetection> labels;
    private String nextToken;
    private String statusMessage;
    private Video video;
    private VideoMetadata videoMetadata;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetLabelDetectionResult)) {
            return false;
        }
        GetLabelDetectionResult getLabelDetectionResult = (GetLabelDetectionResult) obj;
        if ((getLabelDetectionResult.getJobStatus() == null) ^ (getJobStatus() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getJobStatus() != null && !getLabelDetectionResult.getJobStatus().equals(getJobStatus())) {
            return false;
        }
        if ((getLabelDetectionResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getStatusMessage() != null && !getLabelDetectionResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((getLabelDetectionResult.getVideoMetadata() == null) ^ (getVideoMetadata() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getVideoMetadata() != null && !getLabelDetectionResult.getVideoMetadata().equals(getVideoMetadata())) {
            return false;
        }
        if ((getLabelDetectionResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getNextToken() != null && !getLabelDetectionResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getLabelDetectionResult.getLabels() == null) ^ (getLabels() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getLabels() != null && !getLabelDetectionResult.getLabels().equals(getLabels())) {
            return false;
        }
        if ((getLabelDetectionResult.getLabelModelVersion() == null) ^ (getLabelModelVersion() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getLabelModelVersion() != null && !getLabelDetectionResult.getLabelModelVersion().equals(getLabelModelVersion())) {
            return false;
        }
        if ((getLabelDetectionResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getJobId() != null && !getLabelDetectionResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getLabelDetectionResult.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getVideo() != null && !getLabelDetectionResult.getVideo().equals(getVideo())) {
            return false;
        }
        if ((getLabelDetectionResult.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        if (getLabelDetectionResult.getJobTag() != null && !getLabelDetectionResult.getJobTag().equals(getJobTag())) {
            return false;
        }
        if ((getLabelDetectionResult.getGetRequestMetadata() == null) ^ (getGetRequestMetadata() == null)) {
            return false;
        }
        return getLabelDetectionResult.getGetRequestMetadata() == null || getLabelDetectionResult.getGetRequestMetadata().equals(getGetRequestMetadata());
    }

    public GetLabelDetectionRequestMetadata getGetRequestMetadata() {
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

    public String getLabelModelVersion() {
        return this.labelModelVersion;
    }

    public List<LabelDetection> getLabels() {
        return this.labels;
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
        return (((((((((((((((((((getJobStatus() == null ? 0 : getJobStatus().hashCode()) + 31) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getVideoMetadata() == null ? 0 : getVideoMetadata().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getLabels() == null ? 0 : getLabels().hashCode())) * 31) + (getLabelModelVersion() == null ? 0 : getLabelModelVersion().hashCode())) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getVideo() == null ? 0 : getVideo().hashCode())) * 31) + (getJobTag() == null ? 0 : getJobTag().hashCode())) * 31) + (getGetRequestMetadata() != null ? getGetRequestMetadata().hashCode() : 0);
    }

    public void setGetRequestMetadata(GetLabelDetectionRequestMetadata getLabelDetectionRequestMetadata) {
        this.getRequestMetadata = getLabelDetectionRequestMetadata;
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

    public void setLabelModelVersion(String str) {
        this.labelModelVersion = str;
    }

    public void setLabels(Collection<LabelDetection> collection) {
        if (collection == null) {
            this.labels = null;
        } else {
            this.labels = new ArrayList(collection);
        }
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
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getLabels() != null) {
            sb.append("Labels: " + getLabels() + ",");
        }
        if (getLabelModelVersion() != null) {
            sb.append("LabelModelVersion: " + getLabelModelVersion() + ",");
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

    public GetLabelDetectionResult withGetRequestMetadata(GetLabelDetectionRequestMetadata getLabelDetectionRequestMetadata) {
        this.getRequestMetadata = getLabelDetectionRequestMetadata;
        return this;
    }

    public GetLabelDetectionResult withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetLabelDetectionResult withJobStatus(String str) {
        this.jobStatus = str;
        return this;
    }

    public GetLabelDetectionResult withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public GetLabelDetectionResult withLabelModelVersion(String str) {
        this.labelModelVersion = str;
        return this;
    }

    public GetLabelDetectionResult withLabels(LabelDetection... labelDetectionArr) {
        if (getLabels() == null) {
            this.labels = new ArrayList(labelDetectionArr.length);
        }
        for (LabelDetection labelDetection : labelDetectionArr) {
            this.labels.add(labelDetection);
        }
        return this;
    }

    public GetLabelDetectionResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetLabelDetectionResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public GetLabelDetectionResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    public GetLabelDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    public void setJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
    }

    public GetLabelDetectionResult withJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
        return this;
    }

    public GetLabelDetectionResult withLabels(Collection<LabelDetection> collection) {
        setLabels(collection);
        return this;
    }
}
