package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class Recipient {
    private final String entityId;
    private final AssigneeType entityType;

    public interface BuildStep {
        Recipient build();

        BuildStep entityType(AssigneeType assigneeType);
    }

    public static class Builder implements EntityIdStep, BuildStep {
        private String entityId;
        private AssigneeType entityType;

        @Override // com.amplifyframework.datastore.generated.model.Recipient.BuildStep
        public Recipient build() {
            return new Recipient(this.entityId, this.entityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.Recipient.EntityIdStep
        public BuildStep entityId(String str) {
            Objects.requireNonNull(str);
            this.entityId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Recipient.BuildStep
        public BuildStep entityType(AssigneeType assigneeType) {
            this.entityType = assigneeType;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, AssigneeType assigneeType) {
            this.entityId = str;
            this.entityType = assigneeType;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, AssigneeType assigneeType) {
            super(str, assigneeType);
            Objects.requireNonNull(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Recipient.Builder, com.amplifyframework.datastore.generated.model.Recipient.EntityIdStep
        public CopyOfBuilder entityId(String str) {
            return (CopyOfBuilder) super.entityId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Recipient.Builder, com.amplifyframework.datastore.generated.model.Recipient.BuildStep
        public CopyOfBuilder entityType(AssigneeType assigneeType) {
            return (CopyOfBuilder) super.entityType(assigneeType);
        }
    }

    public interface EntityIdStep {
        BuildStep entityId(String str);
    }

    public static EntityIdStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.entityId, this.entityType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Recipient.class != obj.getClass()) {
            return false;
        }
        Recipient recipient = (Recipient) obj;
        return s6c.m47909a(getEntityId(), recipient.getEntityId()) && s6c.m47909a(getEntityType(), recipient.getEntityType());
    }

    public String getEntityId() {
        return this.entityId;
    }

    public AssigneeType getEntityType() {
        return this.entityType;
    }

    public int hashCode() {
        return (getEntityId() + getEntityType()).hashCode();
    }

    private Recipient(String str, AssigneeType assigneeType) {
        this.entityId = str;
        this.entityType = assigneeType;
    }
}
