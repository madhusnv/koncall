package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class AudioMetadata implements Serializable {
    private String codec;
    private Long durationMillis;
    private Long numberOfChannels;
    private Long sampleRate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioMetadata)) {
            return false;
        }
        AudioMetadata audioMetadata = (AudioMetadata) obj;
        if ((audioMetadata.getCodec() == null) ^ (getCodec() == null)) {
            return false;
        }
        if (audioMetadata.getCodec() != null && !audioMetadata.getCodec().equals(getCodec())) {
            return false;
        }
        if ((audioMetadata.getDurationMillis() == null) ^ (getDurationMillis() == null)) {
            return false;
        }
        if (audioMetadata.getDurationMillis() != null && !audioMetadata.getDurationMillis().equals(getDurationMillis())) {
            return false;
        }
        if ((audioMetadata.getSampleRate() == null) ^ (getSampleRate() == null)) {
            return false;
        }
        if (audioMetadata.getSampleRate() != null && !audioMetadata.getSampleRate().equals(getSampleRate())) {
            return false;
        }
        if ((audioMetadata.getNumberOfChannels() == null) ^ (getNumberOfChannels() == null)) {
            return false;
        }
        return audioMetadata.getNumberOfChannels() == null || audioMetadata.getNumberOfChannels().equals(getNumberOfChannels());
    }

    public String getCodec() {
        return this.codec;
    }

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    public Long getNumberOfChannels() {
        return this.numberOfChannels;
    }

    public Long getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return (((((((getCodec() == null ? 0 : getCodec().hashCode()) + 31) * 31) + (getDurationMillis() == null ? 0 : getDurationMillis().hashCode())) * 31) + (getSampleRate() == null ? 0 : getSampleRate().hashCode())) * 31) + (getNumberOfChannels() != null ? getNumberOfChannels().hashCode() : 0);
    }

    public void setCodec(String str) {
        this.codec = str;
    }

    public void setDurationMillis(Long l) {
        this.durationMillis = l;
    }

    public void setNumberOfChannels(Long l) {
        this.numberOfChannels = l;
    }

    public void setSampleRate(Long l) {
        this.sampleRate = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCodec() != null) {
            sb.append("Codec: " + getCodec() + ",");
        }
        if (getDurationMillis() != null) {
            sb.append("DurationMillis: " + getDurationMillis() + ",");
        }
        if (getSampleRate() != null) {
            sb.append("SampleRate: " + getSampleRate() + ",");
        }
        if (getNumberOfChannels() != null) {
            sb.append("NumberOfChannels: " + getNumberOfChannels());
        }
        sb.append("}");
        return sb.toString();
    }

    public AudioMetadata withCodec(String str) {
        this.codec = str;
        return this;
    }

    public AudioMetadata withDurationMillis(Long l) {
        this.durationMillis = l;
        return this;
    }

    public AudioMetadata withNumberOfChannels(Long l) {
        this.numberOfChannels = l;
        return this;
    }

    public AudioMetadata withSampleRate(Long l) {
        this.sampleRate = l;
        return this;
    }
}
