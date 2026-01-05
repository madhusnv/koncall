package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class VideoMetadata implements Serializable {
    private String codec;
    private String colorRange;
    private Long durationMillis;
    private String format;
    private Long frameHeight;
    private Float frameRate;
    private Long frameWidth;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VideoMetadata)) {
            return false;
        }
        VideoMetadata videoMetadata = (VideoMetadata) obj;
        if ((videoMetadata.getCodec() == null) ^ (getCodec() == null)) {
            return false;
        }
        if (videoMetadata.getCodec() != null && !videoMetadata.getCodec().equals(getCodec())) {
            return false;
        }
        if ((videoMetadata.getDurationMillis() == null) ^ (getDurationMillis() == null)) {
            return false;
        }
        if (videoMetadata.getDurationMillis() != null && !videoMetadata.getDurationMillis().equals(getDurationMillis())) {
            return false;
        }
        if ((videoMetadata.getFormat() == null) ^ (getFormat() == null)) {
            return false;
        }
        if (videoMetadata.getFormat() != null && !videoMetadata.getFormat().equals(getFormat())) {
            return false;
        }
        if ((videoMetadata.getFrameRate() == null) ^ (getFrameRate() == null)) {
            return false;
        }
        if (videoMetadata.getFrameRate() != null && !videoMetadata.getFrameRate().equals(getFrameRate())) {
            return false;
        }
        if ((videoMetadata.getFrameHeight() == null) ^ (getFrameHeight() == null)) {
            return false;
        }
        if (videoMetadata.getFrameHeight() != null && !videoMetadata.getFrameHeight().equals(getFrameHeight())) {
            return false;
        }
        if ((videoMetadata.getFrameWidth() == null) ^ (getFrameWidth() == null)) {
            return false;
        }
        if (videoMetadata.getFrameWidth() != null && !videoMetadata.getFrameWidth().equals(getFrameWidth())) {
            return false;
        }
        if ((videoMetadata.getColorRange() == null) ^ (getColorRange() == null)) {
            return false;
        }
        return videoMetadata.getColorRange() == null || videoMetadata.getColorRange().equals(getColorRange());
    }

    public String getCodec() {
        return this.codec;
    }

    public String getColorRange() {
        return this.colorRange;
    }

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    public String getFormat() {
        return this.format;
    }

    public Long getFrameHeight() {
        return this.frameHeight;
    }

    public Float getFrameRate() {
        return this.frameRate;
    }

    public Long getFrameWidth() {
        return this.frameWidth;
    }

    public int hashCode() {
        return (((((((((((((getCodec() == null ? 0 : getCodec().hashCode()) + 31) * 31) + (getDurationMillis() == null ? 0 : getDurationMillis().hashCode())) * 31) + (getFormat() == null ? 0 : getFormat().hashCode())) * 31) + (getFrameRate() == null ? 0 : getFrameRate().hashCode())) * 31) + (getFrameHeight() == null ? 0 : getFrameHeight().hashCode())) * 31) + (getFrameWidth() == null ? 0 : getFrameWidth().hashCode())) * 31) + (getColorRange() != null ? getColorRange().hashCode() : 0);
    }

    public void setCodec(String str) {
        this.codec = str;
    }

    public void setColorRange(String str) {
        this.colorRange = str;
    }

    public void setDurationMillis(Long l) {
        this.durationMillis = l;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setFrameHeight(Long l) {
        this.frameHeight = l;
    }

    public void setFrameRate(Float f) {
        this.frameRate = f;
    }

    public void setFrameWidth(Long l) {
        this.frameWidth = l;
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
        if (getFormat() != null) {
            sb.append("Format: " + getFormat() + ",");
        }
        if (getFrameRate() != null) {
            sb.append("FrameRate: " + getFrameRate() + ",");
        }
        if (getFrameHeight() != null) {
            sb.append("FrameHeight: " + getFrameHeight() + ",");
        }
        if (getFrameWidth() != null) {
            sb.append("FrameWidth: " + getFrameWidth() + ",");
        }
        if (getColorRange() != null) {
            sb.append("ColorRange: " + getColorRange());
        }
        sb.append("}");
        return sb.toString();
    }

    public VideoMetadata withCodec(String str) {
        this.codec = str;
        return this;
    }

    public VideoMetadata withColorRange(String str) {
        this.colorRange = str;
        return this;
    }

    public VideoMetadata withDurationMillis(Long l) {
        this.durationMillis = l;
        return this;
    }

    public VideoMetadata withFormat(String str) {
        this.format = str;
        return this;
    }

    public VideoMetadata withFrameHeight(Long l) {
        this.frameHeight = l;
        return this;
    }

    public VideoMetadata withFrameRate(Float f) {
        this.frameRate = f;
        return this;
    }

    public VideoMetadata withFrameWidth(Long l) {
        this.frameWidth = l;
        return this;
    }

    public void setColorRange(VideoColorRange videoColorRange) {
        this.colorRange = videoColorRange.toString();
    }

    public VideoMetadata withColorRange(VideoColorRange videoColorRange) {
        this.colorRange = videoColorRange.toString();
        return this;
    }
}
