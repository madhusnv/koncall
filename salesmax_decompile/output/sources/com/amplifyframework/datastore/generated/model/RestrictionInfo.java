package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class RestrictionInfo {
    private final Temporal.DateTime restrictionExpiry;
    private final String restrictionType;

    public interface BuildStep {
        RestrictionInfo build();

        BuildStep restrictionExpiry(Temporal.DateTime dateTime);

        BuildStep restrictionType(String str);
    }

    public static class Builder implements BuildStep {
        private Temporal.DateTime restrictionExpiry;
        private String restrictionType;

        @Override // com.amplifyframework.datastore.generated.model.RestrictionInfo.BuildStep
        public RestrictionInfo build() {
            return new RestrictionInfo(this.restrictionType, this.restrictionExpiry);
        }

        @Override // com.amplifyframework.datastore.generated.model.RestrictionInfo.BuildStep
        public BuildStep restrictionExpiry(Temporal.DateTime dateTime) {
            this.restrictionExpiry = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.RestrictionInfo.BuildStep
        public BuildStep restrictionType(String str) {
            this.restrictionType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Temporal.DateTime dateTime) {
            this.restrictionType = str;
            this.restrictionExpiry = dateTime;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Temporal.DateTime dateTime) {
            super(str, dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.RestrictionInfo.Builder, com.amplifyframework.datastore.generated.model.RestrictionInfo.BuildStep
        public CopyOfBuilder restrictionExpiry(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.restrictionExpiry(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.RestrictionInfo.Builder, com.amplifyframework.datastore.generated.model.RestrictionInfo.BuildStep
        public CopyOfBuilder restrictionType(String str) {
            return (CopyOfBuilder) super.restrictionType(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.restrictionType, this.restrictionExpiry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RestrictionInfo.class != obj.getClass()) {
            return false;
        }
        RestrictionInfo restrictionInfo = (RestrictionInfo) obj;
        return s6c.m47909a(getRestrictionType(), restrictionInfo.getRestrictionType()) && s6c.m47909a(getRestrictionExpiry(), restrictionInfo.getRestrictionExpiry());
    }

    public Temporal.DateTime getRestrictionExpiry() {
        return this.restrictionExpiry;
    }

    public String getRestrictionType() {
        return this.restrictionType;
    }

    public int hashCode() {
        return (getRestrictionType() + getRestrictionExpiry()).hashCode();
    }

    private RestrictionInfo(String str, Temporal.DateTime dateTime) {
        this.restrictionType = str;
        this.restrictionExpiry = dateTime;
    }
}
