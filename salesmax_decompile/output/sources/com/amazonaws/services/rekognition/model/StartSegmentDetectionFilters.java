package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StartSegmentDetectionFilters implements Serializable {
    private StartShotDetectionFilter shotFilter;
    private StartTechnicalCueDetectionFilter technicalCueFilter;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartSegmentDetectionFilters)) {
            return false;
        }
        StartSegmentDetectionFilters startSegmentDetectionFilters = (StartSegmentDetectionFilters) obj;
        if ((startSegmentDetectionFilters.getTechnicalCueFilter() == null) ^ (getTechnicalCueFilter() == null)) {
            return false;
        }
        if (startSegmentDetectionFilters.getTechnicalCueFilter() != null && !startSegmentDetectionFilters.getTechnicalCueFilter().equals(getTechnicalCueFilter())) {
            return false;
        }
        if ((startSegmentDetectionFilters.getShotFilter() == null) ^ (getShotFilter() == null)) {
            return false;
        }
        return startSegmentDetectionFilters.getShotFilter() == null || startSegmentDetectionFilters.getShotFilter().equals(getShotFilter());
    }

    public StartShotDetectionFilter getShotFilter() {
        return this.shotFilter;
    }

    public StartTechnicalCueDetectionFilter getTechnicalCueFilter() {
        return this.technicalCueFilter;
    }

    public int hashCode() {
        return (((getTechnicalCueFilter() == null ? 0 : getTechnicalCueFilter().hashCode()) + 31) * 31) + (getShotFilter() != null ? getShotFilter().hashCode() : 0);
    }

    public void setShotFilter(StartShotDetectionFilter startShotDetectionFilter) {
        this.shotFilter = startShotDetectionFilter;
    }

    public void setTechnicalCueFilter(StartTechnicalCueDetectionFilter startTechnicalCueDetectionFilter) {
        this.technicalCueFilter = startTechnicalCueDetectionFilter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTechnicalCueFilter() != null) {
            sb.append("TechnicalCueFilter: " + getTechnicalCueFilter() + ",");
        }
        if (getShotFilter() != null) {
            sb.append("ShotFilter: " + getShotFilter());
        }
        sb.append("}");
        return sb.toString();
    }

    public StartSegmentDetectionFilters withShotFilter(StartShotDetectionFilter startShotDetectionFilter) {
        this.shotFilter = startShotDetectionFilter;
        return this;
    }

    public StartSegmentDetectionFilters withTechnicalCueFilter(StartTechnicalCueDetectionFilter startTechnicalCueDetectionFilter) {
        this.technicalCueFilter = startTechnicalCueDetectionFilter;
        return this;
    }
}
