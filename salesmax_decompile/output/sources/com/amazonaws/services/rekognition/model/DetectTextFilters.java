package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectTextFilters implements Serializable {
    private List<RegionOfInterest> regionsOfInterest;
    private DetectionFilter wordFilter;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectTextFilters)) {
            return false;
        }
        DetectTextFilters detectTextFilters = (DetectTextFilters) obj;
        if ((detectTextFilters.getWordFilter() == null) ^ (getWordFilter() == null)) {
            return false;
        }
        if (detectTextFilters.getWordFilter() != null && !detectTextFilters.getWordFilter().equals(getWordFilter())) {
            return false;
        }
        if ((detectTextFilters.getRegionsOfInterest() == null) ^ (getRegionsOfInterest() == null)) {
            return false;
        }
        return detectTextFilters.getRegionsOfInterest() == null || detectTextFilters.getRegionsOfInterest().equals(getRegionsOfInterest());
    }

    public List<RegionOfInterest> getRegionsOfInterest() {
        return this.regionsOfInterest;
    }

    public DetectionFilter getWordFilter() {
        return this.wordFilter;
    }

    public int hashCode() {
        return (((getWordFilter() == null ? 0 : getWordFilter().hashCode()) + 31) * 31) + (getRegionsOfInterest() != null ? getRegionsOfInterest().hashCode() : 0);
    }

    public void setRegionsOfInterest(Collection<RegionOfInterest> collection) {
        if (collection == null) {
            this.regionsOfInterest = null;
        } else {
            this.regionsOfInterest = new ArrayList(collection);
        }
    }

    public void setWordFilter(DetectionFilter detectionFilter) {
        this.wordFilter = detectionFilter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWordFilter() != null) {
            sb.append("WordFilter: " + getWordFilter() + ",");
        }
        if (getRegionsOfInterest() != null) {
            sb.append("RegionsOfInterest: " + getRegionsOfInterest());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectTextFilters withRegionsOfInterest(RegionOfInterest... regionOfInterestArr) {
        if (getRegionsOfInterest() == null) {
            this.regionsOfInterest = new ArrayList(regionOfInterestArr.length);
        }
        for (RegionOfInterest regionOfInterest : regionOfInterestArr) {
            this.regionsOfInterest.add(regionOfInterest);
        }
        return this;
    }

    public DetectTextFilters withWordFilter(DetectionFilter detectionFilter) {
        this.wordFilter = detectionFilter;
        return this;
    }

    public DetectTextFilters withRegionsOfInterest(Collection<RegionOfInterest> collection) {
        setRegionsOfInterest(collection);
        return this;
    }
}
