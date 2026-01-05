package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class AgeRange implements Serializable {
    private Integer high;
    private Integer low;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AgeRange)) {
            return false;
        }
        AgeRange ageRange = (AgeRange) obj;
        if ((ageRange.getLow() == null) ^ (getLow() == null)) {
            return false;
        }
        if (ageRange.getLow() != null && !ageRange.getLow().equals(getLow())) {
            return false;
        }
        if ((ageRange.getHigh() == null) ^ (getHigh() == null)) {
            return false;
        }
        return ageRange.getHigh() == null || ageRange.getHigh().equals(getHigh());
    }

    public Integer getHigh() {
        return this.high;
    }

    public Integer getLow() {
        return this.low;
    }

    public int hashCode() {
        return (((getLow() == null ? 0 : getLow().hashCode()) + 31) * 31) + (getHigh() != null ? getHigh().hashCode() : 0);
    }

    public void setHigh(Integer num) {
        this.high = num;
    }

    public void setLow(Integer num) {
        this.low = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLow() != null) {
            sb.append("Low: " + getLow() + ",");
        }
        if (getHigh() != null) {
            sb.append("High: " + getHigh());
        }
        sb.append("}");
        return sb.toString();
    }

    public AgeRange withHigh(Integer num) {
        this.high = num;
        return this;
    }

    public AgeRange withLow(Integer num) {
        this.low = num;
        return this;
    }
}
