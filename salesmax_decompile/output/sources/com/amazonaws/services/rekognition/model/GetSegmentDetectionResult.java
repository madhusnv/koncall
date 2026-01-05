package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetSegmentDetectionResult implements Serializable {
    private List<AudioMetadata> audioMetadata;
    private String jobId;
    private String jobStatus;
    private String jobTag;
    private String nextToken;
    private List<SegmentDetection> segments;
    private List<SegmentTypeInfo> selectedSegmentTypes;
    private String statusMessage;
    private Video video;
    private List<VideoMetadata> videoMetadata;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSegmentDetectionResult)) {
            return false;
        }
        GetSegmentDetectionResult getSegmentDetectionResult = (GetSegmentDetectionResult) obj;
        if ((getSegmentDetectionResult.getJobStatus() == null) ^ (getJobStatus() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getJobStatus() != null && !getSegmentDetectionResult.getJobStatus().equals(getJobStatus())) {
            return false;
        }
        if ((getSegmentDetectionResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getStatusMessage() != null && !getSegmentDetectionResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((getSegmentDetectionResult.getVideoMetadata() == null) ^ (getVideoMetadata() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getVideoMetadata() != null && !getSegmentDetectionResult.getVideoMetadata().equals(getVideoMetadata())) {
            return false;
        }
        if ((getSegmentDetectionResult.getAudioMetadata() == null) ^ (getAudioMetadata() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getAudioMetadata() != null && !getSegmentDetectionResult.getAudioMetadata().equals(getAudioMetadata())) {
            return false;
        }
        if ((getSegmentDetectionResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getNextToken() != null && !getSegmentDetectionResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getSegmentDetectionResult.getSegments() == null) ^ (getSegments() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getSegments() != null && !getSegmentDetectionResult.getSegments().equals(getSegments())) {
            return false;
        }
        if ((getSegmentDetectionResult.getSelectedSegmentTypes() == null) ^ (getSelectedSegmentTypes() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getSelectedSegmentTypes() != null && !getSegmentDetectionResult.getSelectedSegmentTypes().equals(getSelectedSegmentTypes())) {
            return false;
        }
        if ((getSegmentDetectionResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getJobId() != null && !getSegmentDetectionResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getSegmentDetectionResult.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (getSegmentDetectionResult.getVideo() != null && !getSegmentDetectionResult.getVideo().equals(getVideo())) {
            return false;
        }
        if ((getSegmentDetectionResult.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return getSegmentDetectionResult.getJobTag() == null || getSegmentDetectionResult.getJobTag().equals(getJobTag());
    }

    public List<AudioMetadata> getAudioMetadata() {
        return this.audioMetadata;
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

    public List<SegmentDetection> getSegments() {
        return this.segments;
    }

    public List<SegmentTypeInfo> getSelectedSegmentTypes() {
        return this.selectedSegmentTypes;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public Video getVideo() {
        return this.video;
    }

    public List<VideoMetadata> getVideoMetadata() {
        return this.videoMetadata;
    }

    public int hashCode() {
        return (((((((((((((((((((getJobStatus() == null ? 0 : getJobStatus().hashCode()) + 31) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getVideoMetadata() == null ? 0 : getVideoMetadata().hashCode())) * 31) + (getAudioMetadata() == null ? 0 : getAudioMetadata().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getSegments() == null ? 0 : getSegments().hashCode())) * 31) + (getSelectedSegmentTypes() == null ? 0 : getSelectedSegmentTypes().hashCode())) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getVideo() == null ? 0 : getVideo().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
    }

    public void setAudioMetadata(Collection<AudioMetadata> collection) {
        if (collection == null) {
            this.audioMetadata = null;
        } else {
            this.audioMetadata = new ArrayList(collection);
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

    public void setSegments(Collection<SegmentDetection> collection) {
        if (collection == null) {
            this.segments = null;
        } else {
            this.segments = new ArrayList(collection);
        }
    }

    public void setSelectedSegmentTypes(Collection<SegmentTypeInfo> collection) {
        if (collection == null) {
            this.selectedSegmentTypes = null;
        } else {
            this.selectedSegmentTypes = new ArrayList(collection);
        }
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoMetadata(Collection<VideoMetadata> collection) {
        if (collection == null) {
            this.videoMetadata = null;
        } else {
            this.videoMetadata = new ArrayList(collection);
        }
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
        if (getAudioMetadata() != null) {
            sb.append("AudioMetadata: " + getAudioMetadata() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getSegments() != null) {
            sb.append("Segments: " + getSegments() + ",");
        }
        if (getSelectedSegmentTypes() != null) {
            sb.append("SelectedSegmentTypes: " + getSelectedSegmentTypes() + ",");
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

    public GetSegmentDetectionResult withAudioMetadata(AudioMetadata... audioMetadataArr) {
        if (getAudioMetadata() == null) {
            this.audioMetadata = new ArrayList(audioMetadataArr.length);
        }
        for (AudioMetadata audioMetadata : audioMetadataArr) {
            this.audioMetadata.add(audioMetadata);
        }
        return this;
    }

    public GetSegmentDetectionResult withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetSegmentDetectionResult withJobStatus(String str) {
        this.jobStatus = str;
        return this;
    }

    public GetSegmentDetectionResult withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public GetSegmentDetectionResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetSegmentDetectionResult withSegments(SegmentDetection... segmentDetectionArr) {
        if (getSegments() == null) {
            this.segments = new ArrayList(segmentDetectionArr.length);
        }
        for (SegmentDetection segmentDetection : segmentDetectionArr) {
            this.segments.add(segmentDetection);
        }
        return this;
    }

    public GetSegmentDetectionResult withSelectedSegmentTypes(SegmentTypeInfo... segmentTypeInfoArr) {
        if (getSelectedSegmentTypes() == null) {
            this.selectedSegmentTypes = new ArrayList(segmentTypeInfoArr.length);
        }
        for (SegmentTypeInfo segmentTypeInfo : segmentTypeInfoArr) {
            this.selectedSegmentTypes.add(segmentTypeInfo);
        }
        return this;
    }

    public GetSegmentDetectionResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public GetSegmentDetectionResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    public GetSegmentDetectionResult withVideoMetadata(VideoMetadata... videoMetadataArr) {
        if (getVideoMetadata() == null) {
            this.videoMetadata = new ArrayList(videoMetadataArr.length);
        }
        for (VideoMetadata videoMetadata : videoMetadataArr) {
            this.videoMetadata.add(videoMetadata);
        }
        return this;
    }

    public void setJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
    }

    public GetSegmentDetectionResult withJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
        return this;
    }

    public GetSegmentDetectionResult withAudioMetadata(Collection<AudioMetadata> collection) {
        setAudioMetadata(collection);
        return this;
    }

    public GetSegmentDetectionResult withSegments(Collection<SegmentDetection> collection) {
        setSegments(collection);
        return this;
    }

    public GetSegmentDetectionResult withSelectedSegmentTypes(Collection<SegmentTypeInfo> collection) {
        setSelectedSegmentTypes(collection);
        return this;
    }

    public GetSegmentDetectionResult withVideoMetadata(Collection<VideoMetadata> collection) {
        setVideoMetadata(collection);
        return this;
    }
}
