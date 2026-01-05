package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class DealStageCustomValues {
    private final String customValue;
    private final String dealStage;

    public interface BuildStep {
        DealStageCustomValues build();

        BuildStep customValue(String str);
    }

    public static class Builder implements DealStageStep, BuildStep {
        private String customValue;
        private String dealStage;

        @Override // com.amplifyframework.datastore.generated.model.DealStageCustomValues.BuildStep
        public DealStageCustomValues build() {
            return new DealStageCustomValues(this.dealStage, this.customValue);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealStageCustomValues.BuildStep
        public BuildStep customValue(String str) {
            this.customValue = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DealStageCustomValues.DealStageStep
        public BuildStep dealStage(String str) {
            Objects.requireNonNull(str);
            this.dealStage = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2) {
            this.dealStage = str;
            this.customValue = str2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2) {
            super(str, str2);
            Objects.requireNonNull(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealStageCustomValues.Builder, com.amplifyframework.datastore.generated.model.DealStageCustomValues.BuildStep
        public CopyOfBuilder customValue(String str) {
            return (CopyOfBuilder) super.customValue(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DealStageCustomValues.Builder, com.amplifyframework.datastore.generated.model.DealStageCustomValues.DealStageStep
        public CopyOfBuilder dealStage(String str) {
            return (CopyOfBuilder) super.dealStage(str);
        }
    }

    public interface DealStageStep {
        BuildStep dealStage(String str);
    }

    public static DealStageStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.dealStage, this.customValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DealStageCustomValues.class != obj.getClass()) {
            return false;
        }
        DealStageCustomValues dealStageCustomValues = (DealStageCustomValues) obj;
        return s6c.m47909a(getDealStage(), dealStageCustomValues.getDealStage()) && s6c.m47909a(getCustomValue(), dealStageCustomValues.getCustomValue());
    }

    public String getCustomValue() {
        return this.customValue;
    }

    public String getDealStage() {
        return this.dealStage;
    }

    public int hashCode() {
        return (getDealStage() + getCustomValue()).hashCode();
    }

    private DealStageCustomValues(String str, String str2) {
        this.dealStage = str;
        this.customValue = str2;
    }
}
