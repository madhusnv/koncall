package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetCelebrityRecognitionResult implements Serializable {
    private List<CelebrityRecognition> celebrities;
    private String jobId;
    private String jobStatus;
    private String jobTag;
    private String nextToken;
    private String statusMessage;
    private Video video;
    private VideoMetadata videoMetadata;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCelebrityRecognitionResult)) {
            return false;
        }
        GetCelebrityRecognitionResult getCelebrityRecognitionResult = (GetCelebrityRecognitionResult) obj;
        if ((getCelebrityRecognitionResult.getJobStatus() == null) ^ (getJobStatus() == null)) {
            return false;
        }
        if (getCelebrityRecognitionResult.getJobStatus() != null && !getCelebrityRecognitionResult.getJobStatus().equals(getJobStatus())) {
            return false;
        }
        if ((getCelebrityRecognitionResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (getCelebrityRecognitionResult.getStatusMessage() != null && !getCelebrityRecognitionResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((getCelebrityRecognitionResult.getVideoMetadata() == null) ^ (getVideoMetadata() == null)) {
            return false;
        }
        if (getCelebrityRecognitionResult.getVideoMetadata() != null && !getCelebrityRecognitionResult.getVideoMetadata().equals(getVideoMetadata())) {
            return false;
        }
        if ((getCelebrityRecognitionResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getCelebrityRecognitionResult.getNextToken() != null && !getCelebrityRecognitionResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getCelebrityRecognitionResult.getCelebrities() == null) ^ (getCelebrities() == null)) {
            return false;
        }
        if (getCelebrityRecognitionResult.getCelebrities() != null && !getCelebrityRecognitionResult.getCelebrities().equals(getCelebrities())) {
            return false;
        }
        if ((getCelebrityRecognitionResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getCelebrityRecognitionResult.getJobId() != null && !getCelebrityRecognitionResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getCelebrityRecognitionResult.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (getCelebrityRecognitionResult.getVideo() != null && !getCelebrityRecognitionResult.getVideo().equals(getVideo())) {
            return false;
        }
        if ((getCelebrityRecognitionResult.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return getCelebrityRecognitionResult.getJobTag() == null || getCelebrityRecognitionResult.getJobTag().equals(getJobTag());
    }

    public List<CelebrityRecognition> getCelebrities() {
        return this.celebrities;
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

    public Video getVideo() {
        return this.video;
    }

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    public int hashCode() {
        return (((((((((((((((getJobStatus() == null ? 0 : getJobStatus().hashCode()) + 31) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getVideoMetadata() == null ? 0 : getVideoMetadata().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getCelebrities() == null ? 0 : getCelebrities().hashCode())) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getVideo() == null ? 0 : getVideo().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
    }

    public void setCelebrities(Collection<CelebrityRecognition> collection) {
        if (collection == null) {
            this.celebrities = null;
        } else {
            this.celebrities = new ArrayList(collection);
        }
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
        if (getCelebrities() != null) {
            sb.append("Celebrities: " + getCelebrities() + ",");
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

    public GetCelebrityRecognitionResult withCelebrities(CelebrityRecognition... celebrityRecognitionArr) {
        if (getCelebrities() == null) {
            this.celebrities = new ArrayList(celebrityRecognitionArr.length);
        }
        for (CelebrityRecognition celebrityRecognition : celebrityRecognitionArr) {
            this.celebrities.add(celebrityRecognition);
        }
        return this;
    }

    public GetCelebrityRecognitionResult withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetCelebrityRecognitionResult withJobStatus(String str) {
        this.jobStatus = str;
        return this;
    }

    public GetCelebrityRecognitionResult withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public GetCelebrityRecognitionResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetCelebrityRecognitionResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public GetCelebrityRecognitionResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    public GetCelebrityRecognitionResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    public void setJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
    }

    public GetCelebrityRecognitionResult withJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
        return this;
    }

    public GetCelebrityRecognitionResult withCelebrities(Collection<CelebrityRecognition> collection) {
        setCelebrities(collection);
        return this;
    }
}
