package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class BlackFrame implements Serializable {
    private Float maxPixelThreshold;
    private Float minCoveragePercentage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BlackFrame)) {
            return false;
        }
        BlackFrame blackFrame = (BlackFrame) obj;
        if ((blackFrame.getMaxPixelThreshold() == null) ^ (getMaxPixelThreshold() == null)) {
            return false;
        }
        if (blackFrame.getMaxPixelThreshold() != null && !blackFrame.getMaxPixelThreshold().equals(getMaxPixelThreshold())) {
            return false;
        }
        if ((blackFrame.getMinCoveragePercentage() == null) ^ (getMinCoveragePercentage() == null)) {
            return false;
        }
        return blackFrame.getMinCoveragePercentage() == null || blackFrame.getMinCoveragePercentage().equals(getMinCoveragePercentage());
    }

    public Float getMaxPixelThreshold() {
        return this.maxPixelThreshold;
    }

    public Float getMinCoveragePercentage() {
        return this.minCoveragePercentage;
    }

    public int hashCode() {
        return (((getMaxPixelThreshold() == null ? 0 : getMaxPixelThreshold().hashCode()) + 31) * 31) + (getMinCoveragePercentage() != null ? getMinCoveragePercentage().hashCode() : 0);
    }

    public void setMaxPixelThreshold(Float f) {
        this.maxPixelThreshold = f;
    }

    public void setMinCoveragePercentage(Float f) {
        this.minCoveragePercentage = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxPixelThreshold() != null) {
            sb.append("MaxPixelThreshold: " + getMaxPixelThreshold() + ",");
        }
        if (getMinCoveragePercentage() != null) {
            sb.append("MinCoveragePercentage: " + getMinCoveragePercentage());
        }
        sb.append("}");
        return sb.toString();
    }

    public BlackFrame withMaxPixelThreshold(Float f) {
        this.maxPixelThreshold = f;
        return this;
    }

    public BlackFrame withMinCoveragePercentage(Float f) {
        this.minCoveragePercentage = f;
        return this;
    }
}
