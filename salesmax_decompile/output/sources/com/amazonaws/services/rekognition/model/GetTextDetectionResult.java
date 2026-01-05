package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetTextDetectionResult implements Serializable {
    private String jobId;
    private String jobStatus;
    private String jobTag;
    private String nextToken;
    private String statusMessage;
    private List<TextDetectionResult> textDetections;
    private String textModelVersion;
    private Video video;
    private VideoMetadata videoMetadata;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetTextDetectionResult)) {
            return false;
        }
        GetTextDetectionResult getTextDetectionResult = (GetTextDetectionResult) obj;
        if ((getTextDetectionResult.getJobStatus() == null) ^ (getJobStatus() == null)) {
            return false;
        }
        if (getTextDetectionResult.getJobStatus() != null && !getTextDetectionResult.getJobStatus().equals(getJobStatus())) {
            return false;
        }
        if ((getTextDetectionResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (getTextDetectionResult.getStatusMessage() != null && !getTextDetectionResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((getTextDetectionResult.getVideoMetadata() == null) ^ (getVideoMetadata() == null)) {
            return false;
        }
        if (getTextDetectionResult.getVideoMetadata() != null && !getTextDetectionResult.getVideoMetadata().equals(getVideoMetadata())) {
            return false;
        }
        if ((getTextDetectionResult.getTextDetections() == null) ^ (getTextDetections() == null)) {
            return false;
        }
        if (getTextDetectionResult.getTextDetections() != null && !getTextDetectionResult.getTextDetections().equals(getTextDetections())) {
            return false;
        }
        if ((getTextDetectionResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getTextDetectionResult.getNextToken() != null && !getTextDetectionResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getTextDetectionResult.getTextModelVersion() == null) ^ (getTextModelVersion() == null)) {
            return false;
        }
        if (getTextDetectionResult.getTextModelVersion() != null && !getTextDetectionResult.getTextModelVersion().equals(getTextModelVersion())) {
            return false;
        }
        if ((getTextDetectionResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getTextDetectionResult.getJobId() != null && !getTextDetectionResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getTextDetectionResult.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (getTextDetectionResult.getVideo() != null && !getTextDetectionResult.getVideo().equals(getVideo())) {
            return false;
        }
        if ((getTextDetectionResult.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return getTextDetectionResult.getJobTag() == null || getTextDetectionResult.getJobTag().equals(getJobTag());
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

    public String getNextToken() {
        return this.nextToken;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public List<TextDetectionResult> getTextDetections() {
        return this.textDetections;
    }

    public String getTextModelVersion() {
        return this.textModelVersion;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    public int hashCode() {
        return (((((((((((((((((getJobStatus() == null ? 0 : getJobStatus().hashCode()) + 31) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getVideoMetadata() == null ? 0 : getVideoMetadata().hashCode())) * 31) + (getTextDetections() == null ? 0 : getTextDetections().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getTextModelVersion() == null ? 0 : getTextModelVersion().hashCode())) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getVideo() == null ? 0 : getVideo().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
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

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setTextDetections(Collection<TextDetectionResult> collection) {
        if (collection == null) {
            this.textDetections = null;
        } else {
            this.textDetections = new ArrayList(collection);
        }
    }

    public void setTextModelVersion(String str) {
        this.textModelVersion = str;
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
        if (getTextDetections() != null) {
            sb.append("TextDetections: " + getTextDetections() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getTextModelVersion() != null) {
            sb.append("TextModelVersion: " + getTextModelVersion() + ",");
        }
        if (getJobId() != null) {
            sb.append("JobId: " + getJobId() + ",");
        }
        if (getVideo() != null) {
            sb.append("Video: " + getVideo() + ",");
        }
        if (getJobTag() != null) {
            sb.append("JobTag: " + getJobTag());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetTextDetectionResult withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetTextDetectionResult withJobStatus(String str) {
        this.jobStatus = str;
        return this;
    }

    public GetTextDetectionResult withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public GetTextDetectionResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetTextDetectionResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public GetTextDetectionResult withTextDetections(TextDetectionResult... textDetectionResultArr) {
        if (getTextDetections() == null) {
            this.textDetections = new ArrayList(textDetectionResultArr.length);
        }
        for (TextDetectionResult textDetectionResult : textDetectionResultArr) {
            this.textDetections.add(textDetectionResult);
        }
        return this;
    }

    public GetTextDetectionResult withTextModelVersion(String str) {
        this.textModelVersion = str;
        return this;
    }

    public GetTextDetectionResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    public GetTextDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    public void setJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
    }

    public GetTextDetectionResult withJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
        return this;
    }

    public GetTextDetectionResult withTextDetections(Collection<TextDetectionResult> collection) {
        setTextDetections(collection);
        return this;
    }
}
