package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetFaceDetectionResult implements Serializable {
    private List<FaceDetection> faces;
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
        if (obj == null || !(obj instanceof GetFaceDetectionResult)) {
            return false;
        }
        GetFaceDetectionResult getFaceDetectionResult = (GetFaceDetectionResult) obj;
        if ((getFaceDetectionResult.getJobStatus() == null) ^ (getJobStatus() == null)) {
            return false;
        }
        if (getFaceDetectionResult.getJobStatus() != null && !getFaceDetectionResult.getJobStatus().equals(getJobStatus())) {
            return false;
        }
        if ((getFaceDetectionResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (getFaceDetectionResult.getStatusMessage() != null && !getFaceDetectionResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((getFaceDetectionResult.getVideoMetadata() == null) ^ (getVideoMetadata() == null)) {
            return false;
        }
        if (getFaceDetectionResult.getVideoMetadata() != null && !getFaceDetectionResult.getVideoMetadata().equals(getVideoMetadata())) {
            return false;
        }
        if ((getFaceDetectionResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getFaceDetectionResult.getNextToken() != null && !getFaceDetectionResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getFaceDetectionResult.getFaces() == null) ^ (getFaces() == null)) {
            return false;
        }
        if (getFaceDetectionResult.getFaces() != null && !getFaceDetectionResult.getFaces().equals(getFaces())) {
            return false;
        }
        if ((getFaceDetectionResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getFaceDetectionResult.getJobId() != null && !getFaceDetectionResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getFaceDetectionResult.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (getFaceDetectionResult.getVideo() != null && !getFaceDetectionResult.getVideo().equals(getVideo())) {
            return false;
        }
        if ((getFaceDetectionResult.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return getFaceDetectionResult.getJobTag() == null || getFaceDetectionResult.getJobTag().equals(getJobTag());
    }

    public List<FaceDetection> getFaces() {
        return this.faces;
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
        return (((((((((((((((getJobStatus() == null ? 0 : getJobStatus().hashCode()) + 31) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getVideoMetadata() == null ? 0 : getVideoMetadata().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getFaces() == null ? 0 : getFaces().hashCode())) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getVideo() == null ? 0 : getVideo().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
    }

    public void setFaces(Collection<FaceDetection> collection) {
        if (collection == null) {
            this.faces = null;
        } else {
            this.faces = new ArrayList(collection);
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
        if (getFaces() != null) {
            sb.append("Faces: " + getFaces() + ",");
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

    public GetFaceDetectionResult withFaces(FaceDetection... faceDetectionArr) {
        if (getFaces() == null) {
            this.faces = new ArrayList(faceDetectionArr.length);
        }
        for (FaceDetection faceDetection : faceDetectionArr) {
            this.faces.add(faceDetection);
        }
        return this;
    }

    public GetFaceDetectionResult withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetFaceDetectionResult withJobStatus(String str) {
        this.jobStatus = str;
        return this;
    }

    public GetFaceDetectionResult withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public GetFaceDetectionResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetFaceDetectionResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public GetFaceDetectionResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    public GetFaceDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    public void setJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
    }

    public GetFaceDetectionResult withJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
        return this;
    }

    public GetFaceDetectionResult withFaces(Collection<FaceDetection> collection) {
        setFaces(collection);
        return this;
    }
}
