package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "updatedAt"}, name = "byAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ})}, pluralName = "AccountUpdates")
/* loaded from: classes5.dex */
public final class AccountUpdates implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ActionType")
    private final ActionType actionType;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String entityId;

    @ModelField(isRequired = true, targetType = "EntityType")
    private final EntityType entityType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("AccountUpdates", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("AccountUpdates", "accountId");
    public static final QueryField USER_ID = QueryField.field("AccountUpdates", "userId");
    public static final QueryField ENTITY_TYPE = QueryField.field("AccountUpdates", "entityType");
    public static final QueryField ENTITY_ID = QueryField.field("AccountUpdates", "entityId");
    public static final QueryField ACTION_TYPE = QueryField.field("AccountUpdates", "actionType");
    public static final QueryField CREATED_AT = QueryField.field("AccountUpdates", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("AccountUpdates", "updatedAt");

    public interface AccountIdStep {
        UserIdStep accountId(String str);
    }

    public interface ActionTypeStep {
        CreatedAtStep actionType(ActionType actionType);
    }

    public interface BuildStep {
        AccountUpdates build();

        BuildStep id(String str);
    }

    public static class Builder implements AccountIdStep, UserIdStep, EntityTypeStep, EntityIdStep, ActionTypeStep, CreatedAtStep, UpdatedAtStep, BuildStep {
        private String accountId;
        private ActionType actionType;
        private Temporal.DateTime createdAt;
        private String entityId;
        private EntityType entityType;
        private String id;
        private Temporal.DateTime updatedAt;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.AccountIdStep
        public UserIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.ActionTypeStep
        public CreatedAtStep actionType(ActionType actionType) {
            Objects.requireNonNull(actionType);
            this.actionType = actionType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.BuildStep
        public AccountUpdates build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new AccountUpdates(string, this.accountId, this.userId, this.entityType, this.entityId, this.actionType, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.CreatedAtStep
        public UpdatedAtStep createdAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.EntityIdStep
        public ActionTypeStep entityId(String str) {
            Objects.requireNonNull(str);
            this.entityId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.EntityTypeStep
        public EntityIdStep entityType(EntityType entityType) {
            Objects.requireNonNull(entityType);
            this.entityType = entityType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.UpdatedAtStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.UserIdStep
        public EntityTypeStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, EntityType entityType, String str4, ActionType actionType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.userId = str3;
            this.entityType = entityType;
            this.entityId = str4;
            this.actionType = actionType;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, EntityType entityType, String str4, ActionType actionType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, entityType, str4, actionType, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(entityType);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(actionType);
            Objects.requireNonNull(dateTime);
            Objects.requireNonNull(dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.Builder, com.amplifyframework.datastore.generated.model.AccountUpdates.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.Builder, com.amplifyframework.datastore.generated.model.AccountUpdates.ActionTypeStep
        public CopyOfBuilder actionType(ActionType actionType) {
            return (CopyOfBuilder) super.actionType(actionType);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.Builder, com.amplifyframework.datastore.generated.model.AccountUpdates.CreatedAtStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.Builder, com.amplifyframework.datastore.generated.model.AccountUpdates.EntityIdStep
        public CopyOfBuilder entityId(String str) {
            return (CopyOfBuilder) super.entityId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.Builder, com.amplifyframework.datastore.generated.model.AccountUpdates.EntityTypeStep
        public CopyOfBuilder entityType(EntityType entityType) {
            return (CopyOfBuilder) super.entityType(entityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.Builder, com.amplifyframework.datastore.generated.model.AccountUpdates.UpdatedAtStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountUpdates.Builder, com.amplifyframework.datastore.generated.model.AccountUpdates.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface CreatedAtStep {
        UpdatedAtStep createdAt(Temporal.DateTime dateTime);
    }

    public interface EntityIdStep {
        ActionTypeStep entityId(String str);
    }

    public interface EntityTypeStep {
        EntityIdStep entityType(EntityType entityType);
    }

    public interface UpdatedAtStep {
        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public interface UserIdStep {
        EntityTypeStep userId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static AccountUpdates justId(String str) {
        return new AccountUpdates(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.userId, this.entityType, this.entityId, this.actionType, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountUpdates.class != obj.getClass()) {
            return false;
        }
        AccountUpdates accountUpdates = (AccountUpdates) obj;
        return s6c.m47909a(getId(), accountUpdates.getId()) && s6c.m47909a(getAccountId(), accountUpdates.getAccountId()) && s6c.m47909a(getUserId(), accountUpdates.getUserId()) && s6c.m47909a(getEntityType(), accountUpdates.getEntityType()) && s6c.m47909a(getEntityId(), accountUpdates.getEntityId()) && s6c.m47909a(getActionType(), accountUpdates.getActionType()) && s6c.m47909a(getCreatedAt(), accountUpdates.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), accountUpdates.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ActionType getActionType() {
        return this.actionType;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public EntityType getEntityType() {
        return this.entityType;
    }

    public String getId() {
        return this.id;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getUserId() + getEntityType() + getEntityId() + getActionType() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountUpdates {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("entityType=" + String.valueOf(getEntityType()) + ", ");
        sb.append("entityId=" + String.valueOf(getEntityId()) + ", ");
        sb.append("actionType=" + String.valueOf(getActionType()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private AccountUpdates(String str, String str2, String str3, EntityType entityType, String str4, ActionType actionType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.entityType = entityType;
        this.entityId = str4;
        this.actionType = actionType;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
