package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ExternalReference {
    private final String externalReferenceId;
    private final String externalReferenceIdSource;
    private final Temporal.DateTime externalReferenceSourceDate;

    public interface BuildStep {
        ExternalReference build();

        BuildStep externalReferenceSourceDate(Temporal.DateTime dateTime);
    }

    public static class Builder implements ExternalReferenceIdStep, ExternalReferenceIdSourceStep, BuildStep {
        private String externalReferenceId;
        private String externalReferenceIdSource;
        private Temporal.DateTime externalReferenceSourceDate;

        @Override // com.amplifyframework.datastore.generated.model.ExternalReference.BuildStep
        public ExternalReference build() {
            return new ExternalReference(this.externalReferenceId, this.externalReferenceIdSource, this.externalReferenceSourceDate);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalReference.ExternalReferenceIdStep
        public ExternalReferenceIdSourceStep externalReferenceId(String str) {
            Objects.requireNonNull(str);
            this.externalReferenceId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalReference.ExternalReferenceIdSourceStep
        public BuildStep externalReferenceIdSource(String str) {
            Objects.requireNonNull(str);
            this.externalReferenceIdSource = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalReference.BuildStep
        public BuildStep externalReferenceSourceDate(Temporal.DateTime dateTime) {
            this.externalReferenceSourceDate = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, Temporal.DateTime dateTime) {
            this.externalReferenceId = str;
            this.externalReferenceIdSource = str2;
            this.externalReferenceSourceDate = dateTime;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, Temporal.DateTime dateTime) {
            super(str, str2, dateTime);
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalReference.Builder, com.amplifyframework.datastore.generated.model.ExternalReference.ExternalReferenceIdStep
        public CopyOfBuilder externalReferenceId(String str) {
            return (CopyOfBuilder) super.externalReferenceId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalReference.Builder, com.amplifyframework.datastore.generated.model.ExternalReference.ExternalReferenceIdSourceStep
        public CopyOfBuilder externalReferenceIdSource(String str) {
            return (CopyOfBuilder) super.externalReferenceIdSource(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.ExternalReference.Builder, com.amplifyframework.datastore.generated.model.ExternalReference.BuildStep
        public CopyOfBuilder externalReferenceSourceDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.externalReferenceSourceDate(dateTime);
        }
    }

    public interface ExternalReferenceIdSourceStep {
        BuildStep externalReferenceIdSource(String str);
    }

    public interface ExternalReferenceIdStep {
        ExternalReferenceIdSourceStep externalReferenceId(String str);
    }

    public static ExternalReferenceIdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.externalReferenceId, this.externalReferenceIdSource, this.externalReferenceSourceDate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExternalReference.class != obj.getClass()) {
            return false;
        }
        ExternalReference externalReference = (ExternalReference) obj;
        return s6c.m47909a(getExternalReferenceId(), externalReference.getExternalReferenceId()) && s6c.m47909a(getExternalReferenceIdSource(), externalReference.getExternalReferenceIdSource()) && s6c.m47909a(getExternalReferenceSourceDate(), externalReference.getExternalReferenceSourceDate());
    }

    public String getExternalReferenceId() {
        return this.externalReferenceId;
    }

    public String getExternalReferenceIdSource() {
        return this.externalReferenceIdSource;
    }

    public Temporal.DateTime getExternalReferenceSourceDate() {
        return this.externalReferenceSourceDate;
    }

    public int hashCode() {
        return (getExternalReferenceId() + getExternalReferenceIdSource() + getExternalReferenceSourceDate()).hashCode();
    }

    private ExternalReference(String str, String str2, Temporal.DateTime dateTime) {
        this.externalReferenceId = str;
        this.externalReferenceIdSource = str2;
        this.externalReferenceSourceDate = dateTime;
    }
}
