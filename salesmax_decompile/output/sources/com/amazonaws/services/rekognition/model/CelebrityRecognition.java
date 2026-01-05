package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CelebrityRecognition implements Serializable {
    private CelebrityDetail celebrity;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CelebrityRecognition)) {
            return false;
        }
        CelebrityRecognition celebrityRecognition = (CelebrityRecognition) obj;
        if ((celebrityRecognition.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (celebrityRecognition.getTimestamp() != null && !celebrityRecognition.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((celebrityRecognition.getCelebrity() == null) ^ (getCelebrity() == null)) {
            return false;
        }
        return celebrityRecognition.getCelebrity() == null || celebrityRecognition.getCelebrity().equals(getCelebrity());
    }

    public CelebrityDetail getCelebrity() {
        return this.celebrity;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getCelebrity() != null ? getCelebrity().hashCode() : 0);
    }

    public void setCelebrity(CelebrityDetail celebrityDetail) {
        this.celebrity = celebrityDetail;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimestamp() != null) {
            sb.append("Timestamp: " + getTimestamp() + ",");
        }
        if (getCelebrity() != null) {
            sb.append("Celebrity: " + getCelebrity());
        }
        sb.append("}");
        return sb.toString();
    }

    public CelebrityRecognition withCelebrity(CelebrityDetail celebrityDetail) {
        this.celebrity = celebrityDetail;
        return this;
    }

    public CelebrityRecognition withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
