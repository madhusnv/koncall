package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetContentModerationRequestMetadata implements Serializable {
    private String aggregateBy;
    private String sortBy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetContentModerationRequestMetadata)) {
            return false;
        }
        GetContentModerationRequestMetadata getContentModerationRequestMetadata = (GetContentModerationRequestMetadata) obj;
        if ((getContentModerationRequestMetadata.getSortBy() == null) ^ (getSortBy() == null)) {
            return false;
        }
        if (getContentModerationRequestMetadata.getSortBy() != null && !getContentModerationRequestMetadata.getSortBy().equals(getSortBy())) {
            return false;
        }
        if ((getContentModerationRequestMetadata.getAggregateBy() == null) ^ (getAggregateBy() == null)) {
            return false;
        }
        return getContentModerationRequestMetadata.getAggregateBy() == null || getContentModerationRequestMetadata.getAggregateBy().equals(getAggregateBy());
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

    public GetContentModerationRequestMetadata withAggregateBy(String str) {
        this.aggregateBy = str;
        return this;
    }

    public GetContentModerationRequestMetadata withSortBy(String str) {
        this.sortBy = str;
        return this;
    }

    public void setAggregateBy(ContentModerationAggregateBy contentModerationAggregateBy) {
        this.aggregateBy = contentModerationAggregateBy.toString();
    }

    public void setSortBy(ContentModerationSortBy contentModerationSortBy) {
        this.sortBy = contentModerationSortBy.toString();
    }

    public GetContentModerationRequestMetadata withAggregateBy(ContentModerationAggregateBy contentModerationAggregateBy) {
        this.aggregateBy = contentModerationAggregateBy.toString();
        return this;
    }

    public GetContentModerationRequestMetadata withSortBy(ContentModerationSortBy contentModerationSortBy) {
        this.sortBy = contentModerationSortBy.toString();
        return this;
    }
}
