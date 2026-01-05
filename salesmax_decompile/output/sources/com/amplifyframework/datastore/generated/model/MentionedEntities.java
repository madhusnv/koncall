package com.amplifyframework.datastore.generated.model;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class MentionedEntities {
    private final String entityId;
    private final MentionedEntityType entityType;

    public interface BuildStep {
        MentionedEntities build();
    }

    public static class Builder implements EntityTypeStep, EntityIdStep, BuildStep {
        private String entityId;
        private MentionedEntityType entityType;

        @Override // com.amplifyframework.datastore.generated.model.MentionedEntities.BuildStep
        public MentionedEntities build() {
            return new MentionedEntities(this.entityType, this.entityId);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionedEntities.EntityIdStep
        public BuildStep entityId(String str) {
            Objects.requireNonNull(str);
            this.entityId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionedEntities.EntityTypeStep
        public EntityIdStep entityType(MentionedEntityType mentionedEntityType) {
            Objects.requireNonNull(mentionedEntityType);
            this.entityType = mentionedEntityType;
            return this;
        }

        public Builder() {
        }

        private Builder(MentionedEntityType mentionedEntityType, String str) {
            this.entityType = mentionedEntityType;
            this.entityId = str;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(MentionedEntityType mentionedEntityType, String str) {
            super(mentionedEntityType, str);
            Objects.requireNonNull(mentionedEntityType);
            Objects.requireNonNull(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionedEntities.Builder, com.amplifyframework.datastore.generated.model.MentionedEntities.EntityIdStep
        public CopyOfBuilder entityId(String str) {
            return (CopyOfBuilder) super.entityId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.MentionedEntities.Builder, com.amplifyframework.datastore.generated.model.MentionedEntities.EntityTypeStep
        public CopyOfBuilder entityType(MentionedEntityType mentionedEntityType) {
            return (CopyOfBuilder) super.entityType(mentionedEntityType);
        }
    }

    public interface EntityIdStep {
        BuildStep entityId(String str);
    }

    public interface EntityTypeStep {
        EntityIdStep entityType(MentionedEntityType mentionedEntityType);
    }

    public static EntityTypeStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.entityType, this.entityId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MentionedEntities.class != obj.getClass()) {
            return false;
        }
        MentionedEntities mentionedEntities = (MentionedEntities) obj;
        return s6c.m47909a(getEntityType(), mentionedEntities.getEntityType()) && s6c.m47909a(getEntityId(), mentionedEntities.getEntityId());
    }

    public String getEntityId() {
        return this.entityId;
    }

    public MentionedEntityType getEntityType() {
        return this.entityType;
    }

    public int hashCode() {
        return (getEntityType() + getEntityId()).hashCode();
    }

    private MentionedEntities(MentionedEntityType mentionedEntityType, String str) {
        this.entityType = mentionedEntityType;
        this.entityId = str;
    }
}
