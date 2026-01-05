package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetLabelDetectionRequestMetadata implements Serializable {
    private String aggregateBy;
    private String sortBy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetLabelDetectionRequestMetadata)) {
            return false;
        }
        GetLabelDetectionRequestMetadata getLabelDetectionRequestMetadata = (GetLabelDetectionRequestMetadata) obj;
        if ((getLabelDetectionRequestMetadata.getSortBy() == null) ^ (getSortBy() == null)) {
            return false;
        }
        if (getLabelDetectionRequestMetadata.getSortBy() != null && !getLabelDetectionRequestMetadata.getSortBy().equals(getSortBy())) {
            return false;
        }
        if ((getLabelDetectionRequestMetadata.getAggregateBy() == null) ^ (getAggregateBy() == null)) {
            return false;
        }
        return getLabelDetectionRequestMetadata.getAggregateBy() == null || getLabelDetectionRequestMetadata.getAggregateBy().equals(getAggregateBy());
    }

    public String getAggregateBy() {
        return this.aggregateBy;
    }

    public String getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        return (((getSortBy() == null ? 0 : getSortBy().hashCode()) + 31) * 31) + (getAggregateBy() != null ? getAggregateBy().hashCode() : 0);
    }

    public void setAggregateBy(String str) {
        this.aggregateBy = str;
    }

    public void setSortBy(String str) {
        this.sortBy = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSortBy() != null) {
            sb.append("SortBy: " + getSortBy() + ",");
        }
        if (getAggregateBy() != null) {
            sb.append("AggregateBy: " + getAggregateBy());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetLabelDetectionRequestMetadata withAggregateBy(String str) {
        this.aggregateBy = str;
        return this;
    }

    public GetLabelDetectionRequestMetadata withSortBy(String str) {
        this.sortBy = str;
        return this;
    }

    public void setAggregateBy(LabelDetectionAggregateBy labelDetectionAggregateBy) {
        this.aggregateBy = labelDetectionAggregateBy.toString();
    }

    public void setSortBy(LabelDetectionSortBy labelDetectionSortBy) {
        this.sortBy = labelDetectionSortBy.toString();
    }

    public GetLabelDetectionRequestMetadata withAggregateBy(LabelDetectionAggregateBy labelDetectionAggregateBy) {
        this.aggregateBy = labelDetectionAggregateBy.toString();
        return this;
    }

    public GetLabelDetectionRequestMetadata withSortBy(LabelDetectionSortBy labelDetectionSortBy) {
        this.sortBy = labelDetectionSortBy.toString();
        return this;
    }
}
