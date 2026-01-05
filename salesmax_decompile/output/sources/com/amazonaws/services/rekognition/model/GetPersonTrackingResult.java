package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetPersonTrackingResult implements Serializable {
    private String jobId;
    private String jobStatus;
    private String jobTag;
    private String nextToken;
    private List<PersonDetection> persons;
    private String statusMessage;
    private Video video;
    private VideoMetadata videoMetadata;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetPersonTrackingResult)) {
            return false;
        }
        GetPersonTrackingResult getPersonTrackingResult = (GetPersonTrackingResult) obj;
        if ((getPersonTrackingResult.getJobStatus() == null) ^ (getJobStatus() == null)) {
            return false;
        }
        if (getPersonTrackingResult.getJobStatus() != null && !getPersonTrackingResult.getJobStatus().equals(getJobStatus())) {
            return false;
        }
        if ((getPersonTrackingResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (getPersonTrackingResult.getStatusMessage() != null && !getPersonTrackingResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((getPersonTrackingResult.getVideoMetadata() == null) ^ (getVideoMetadata() == null)) {
            return false;
        }
        if (getPersonTrackingResult.getVideoMetadata() != null && !getPersonTrackingResult.getVideoMetadata().equals(getVideoMetadata())) {
            return false;
        }
        if ((getPersonTrackingResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (getPersonTrackingResult.getNextToken() != null && !getPersonTrackingResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((getPersonTrackingResult.getPersons() == null) ^ (getPersons() == null)) {
            return false;
        }
        if (getPersonTrackingResult.getPersons() != null && !getPersonTrackingResult.getPersons().equals(getPersons())) {
            return false;
        }
        if ((getPersonTrackingResult.getJobId() == null) ^ (getJobId() == null)) {
            return false;
        }
        if (getPersonTrackingResult.getJobId() != null && !getPersonTrackingResult.getJobId().equals(getJobId())) {
            return false;
        }
        if ((getPersonTrackingResult.getVideo() == null) ^ (getVideo() == null)) {
            return false;
        }
        if (getPersonTrackingResult.getVideo() != null && !getPersonTrackingResult.getVideo().equals(getVideo())) {
            return false;
        }
        if ((getPersonTrackingResult.getJobTag() == null) ^ (getJobTag() == null)) {
            return false;
        }
        return getPersonTrackingResult.getJobTag() == null || getPersonTrackingResult.getJobTag().equals(getJobTag());
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

    public List<PersonDetection> getPersons() {
        return this.persons;
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
        return (((((((((((((((getJobStatus() == null ? 0 : getJobStatus().hashCode()) + 31) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getVideoMetadata() == null ? 0 : getVideoMetadata().hashCode())) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getPersons() == null ? 0 : getPersons().hashCode())) * 31) + (getJobId() == null ? 0 : getJobId().hashCode())) * 31) + (getVideo() == null ? 0 : getVideo().hashCode())) * 31) + (getJobTag() != null ? getJobTag().hashCode() : 0);
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

    public void setPersons(Collection<PersonDetection> collection) {
        if (collection == null) {
            this.persons = null;
        } else {
            this.persons = new ArrayList(collection);
        }
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
        if (getPersons() != null) {
            sb.append("Persons: " + getPersons() + ",");
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

    public GetPersonTrackingResult withJobId(String str) {
        this.jobId = str;
        return this;
    }

    public GetPersonTrackingResult withJobStatus(String str) {
        this.jobStatus = str;
        return this;
    }

    public GetPersonTrackingResult withJobTag(String str) {
        this.jobTag = str;
        return this;
    }

    public GetPersonTrackingResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetPersonTrackingResult withPersons(PersonDetection... personDetectionArr) {
        if (getPersons() == null) {
            this.persons = new ArrayList(personDetectionArr.length);
        }
        for (PersonDetection personDetection : personDetectionArr) {
            this.persons.add(personDetection);
        }
        return this;
    }

    public GetPersonTrackingResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public GetPersonTrackingResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    public GetPersonTrackingResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    public void setJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
    }

    public GetPersonTrackingResult withJobStatus(VideoJobStatus videoJobStatus) {
        this.jobStatus = videoJobStatus.toString();
        return this;
    }

    public GetPersonTrackingResult withPersons(Collection<PersonDetection> collection) {
        setPersons(collection);
        return this;
    }
}
