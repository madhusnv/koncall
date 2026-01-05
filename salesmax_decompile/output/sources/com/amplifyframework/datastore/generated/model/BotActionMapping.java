package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, OutcomeConstants.OUTCOME_ID}, name = "byAction"), @Index(fields = {"botId", OutcomeConstants.OUTCOME_ID}, name = "byBot")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "BotActionMappings")
/* loaded from: classes5.dex */
public final class BotActionMapping implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String actionId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String botId;

    @ModelField(targetType = "String")
    private final String context;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isPaused;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("BotActionMapping", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("BotActionMapping", "accountId");
    public static final QueryField BOT_ID = QueryField.field("BotActionMapping", "botId");
    public static final QueryField ACTION_ID = QueryField.field("BotActionMapping", NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID);
    public static final QueryField CONTEXT = QueryField.field("BotActionMapping", "context");
    public static final QueryField IS_PAUSED = QueryField.field("BotActionMapping", "isPaused");
    public static final QueryField CREATED_AT = QueryField.field("BotActionMapping", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("BotActionMapping", "updatedAt");

    public interface AccountIdStep {
        BotIdStep accountId(String str);
    }

    public interface ActionIdStep {
        BuildStep actionId(String str);
    }

    public interface BotIdStep {
        ActionIdStep botId(String str);
    }

    public interface BuildStep {
        BotActionMapping build();

        BuildStep context(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep id(String str);

        BuildStep isPaused(Boolean bool);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BotIdStep, ActionIdStep, BuildStep {
        private String accountId;
        private String actionId;
        private String botId;
        private String context;
        private Temporal.DateTime createdAt;
        private String id;
        private Boolean isPaused;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.AccountIdStep
        public BotIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.ActionIdStep
        public BuildStep actionId(String str) {
            Objects.requireNonNull(str);
            this.actionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.BotIdStep
        public ActionIdStep botId(String str) {
            Objects.requireNonNull(str);
            this.botId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public BotActionMapping build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new BotActionMapping(string, this.accountId, this.botId, this.actionId, this.context, this.isPaused, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public BuildStep context(String str) {
            this.context = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public BuildStep isPaused(Boolean bool) {
            this.isPaused = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.botId = str3;
            this.actionId = str4;
            this.context = str5;
            this.isPaused = bool;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, bool, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.Builder, com.amplifyframework.datastore.generated.model.BotActionMapping.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.Builder, com.amplifyframework.datastore.generated.model.BotActionMapping.ActionIdStep
        public CopyOfBuilder actionId(String str) {
            return (CopyOfBuilder) super.actionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.Builder, com.amplifyframework.datastore.generated.model.BotActionMapping.BotIdStep
        public CopyOfBuilder botId(String str) {
            return (CopyOfBuilder) super.botId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.Builder, com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public CopyOfBuilder context(String str) {
            return (CopyOfBuilder) super.context(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.Builder, com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.Builder, com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public CopyOfBuilder isPaused(Boolean bool) {
            return (CopyOfBuilder) super.isPaused(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionMapping.Builder, com.amplifyframework.datastore.generated.model.BotActionMapping.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static BotActionMapping justId(String str) {
        return new BotActionMapping(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.botId, this.actionId, this.context, this.isPaused, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BotActionMapping.class != obj.getClass()) {
            return false;
        }
        BotActionMapping botActionMapping = (BotActionMapping) obj;
        return s6c.m47909a(getId(), botActionMapping.getId()) && s6c.m47909a(getAccountId(), botActionMapping.getAccountId()) && s6c.m47909a(getBotId(), botActionMapping.getBotId()) && s6c.m47909a(getActionId(), botActionMapping.getActionId()) && s6c.m47909a(getContext(), botActionMapping.getContext()) && s6c.m47909a(getIsPaused(), botActionMapping.getIsPaused()) && s6c.m47909a(getCreatedAt(), botActionMapping.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), botActionMapping.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getContext() {
        return this.context;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsPaused() {
        return this.isPaused;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getBotId() + getActionId() + getContext() + getIsPaused() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BotActionMapping {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("botId=" + String.valueOf(getBotId()) + ", ");
        sb.append("actionId=" + String.valueOf(getActionId()) + ", ");
        sb.append("context=" + String.valueOf(getContext()) + ", ");
        sb.append("isPaused=" + String.valueOf(getIsPaused()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private BotActionMapping(String str, String str2, String str3, String str4, String str5, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.botId = str3;
        this.actionId = str4;
        this.context = str5;
        this.isPaused = bool;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
