package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class StatusTransition {
    private final Temporal.DateTime recordedAt;
    private final String status;

    public interface BuildStep {
        StatusTransition build();

        BuildStep recordedAt(Temporal.DateTime dateTime);

        BuildStep status(String str);
    }

    public static class Builder implements BuildStep {
        private Temporal.DateTime recordedAt;
        private String status;

        @Override // com.amplifyframework.datastore.generated.model.StatusTransition.BuildStep
        public StatusTransition build() {
            return new StatusTransition(this.status, this.recordedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.StatusTransition.BuildStep
        public BuildStep recordedAt(Temporal.DateTime dateTime) {
            this.recordedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.StatusTransition.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, Temporal.DateTime dateTime) {
            this.status = str;
            this.recordedAt = dateTime;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, Temporal.DateTime dateTime) {
            super(str, dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.StatusTransition.Builder, com.amplifyframework.datastore.generated.model.StatusTransition.BuildStep
        public CopyOfBuilder recordedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.recordedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.StatusTransition.Builder, com.amplifyframework.datastore.generated.model.StatusTransition.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.status, this.recordedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StatusTransition.class != obj.getClass()) {
            return false;
        }
        StatusTransition statusTransition = (StatusTransition) obj;
        return s6c.m47909a(getStatus(), statusTransition.getStatus()) && s6c.m47909a(getRecordedAt(), statusTransition.getRecordedAt());
    }

    public Temporal.DateTime getRecordedAt() {
        return this.recordedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (getStatus() + getRecordedAt()).hashCode();
    }

    private StatusTransition(String str, Temporal.DateTime dateTime) {
        this.status = str;
        this.recordedAt = dateTime;
    }
}
