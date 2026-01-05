package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "BotActionLogs")
/* loaded from: classes5.dex */
public final class BotActionLog implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String actionId;

    @ModelField(targetType = "String")
    private final String actionName;

    @ModelField(isRequired = true, targetType = "ID")
    private final String botId;

    @ModelField(targetType = "AWSJSON")
    private final String context;

    @ModelField(targetType = "String")
    private final String errorMessage;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(isRequired = true, targetType = "AWSDateTime")
    private final Temporal.DateTime timestamp;

    @ModelField(targetType = "ID")
    private final String triggerMessageId;
    public static final QueryField ID = QueryField.field("BotActionLog", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("BotActionLog", "accountId");
    public static final QueryField BOT_ID = QueryField.field("BotActionLog", "botId");
    public static final QueryField ACTION_ID = QueryField.field("BotActionLog", NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID);
    public static final QueryField ACTION_NAME = QueryField.field("BotActionLog", "actionName");
    public static final QueryField TRIGGER_MESSAGE_ID = QueryField.field("BotActionLog", "triggerMessageId");
    public static final QueryField CONTEXT = QueryField.field("BotActionLog", "context");
    public static final QueryField STATUS = QueryField.field("BotActionLog", "status");
    public static final QueryField ERROR_MESSAGE = QueryField.field("BotActionLog", "errorMessage");
    public static final QueryField TIMESTAMP = QueryField.field("BotActionLog", "timestamp");

    public interface AccountIdStep {
        BotIdStep accountId(String str);
    }

    public interface ActionIdStep {
        TimestampStep actionId(String str);
    }

    public interface BotIdStep {
        ActionIdStep botId(String str);
    }

    public interface BuildStep {
        BuildStep actionName(String str);

        BotActionLog build();

        BuildStep context(String str);

        BuildStep errorMessage(String str);

        BuildStep id(String str);

        BuildStep status(String str);

        BuildStep triggerMessageId(String str);
    }

    public static class Builder implements AccountIdStep, BotIdStep, ActionIdStep, TimestampStep, BuildStep {
        private String accountId;
        private String actionId;
        private String actionName;
        private String botId;
        private String context;
        private String errorMessage;
        private String id;
        private String status;
        private Temporal.DateTime timestamp;
        private String triggerMessageId;

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.AccountIdStep
        public BotIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.ActionIdStep
        public TimestampStep actionId(String str) {
            Objects.requireNonNull(str);
            this.actionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public BuildStep actionName(String str) {
            this.actionName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BotIdStep
        public ActionIdStep botId(String str) {
            Objects.requireNonNull(str);
            this.botId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public BotActionLog build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new BotActionLog(string, this.accountId, this.botId, this.actionId, this.actionName, this.triggerMessageId, this.context, this.status, this.errorMessage, this.timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public BuildStep context(String str) {
            this.context = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public BuildStep errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.TimestampStep
        public BuildStep timestamp(Temporal.DateTime dateTime) {
            Objects.requireNonNull(dateTime);
            this.timestamp = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public BuildStep triggerMessageId(String str) {
            this.triggerMessageId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime) {
            this.id = str;
            this.accountId = str2;
            this.botId = str3;
            this.actionId = str4;
            this.actionName = str5;
            this.triggerMessageId = str6;
            this.context = str7;
            this.status = str8;
            this.errorMessage = str9;
            this.timestamp = dateTime;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime) {
            super(str, str2, str3, str4, str5, str6, str7, str8, str9, dateTime);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.ActionIdStep
        public CopyOfBuilder actionId(String str) {
            return (CopyOfBuilder) super.actionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public CopyOfBuilder actionName(String str) {
            return (CopyOfBuilder) super.actionName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.BotIdStep
        public CopyOfBuilder botId(String str) {
            return (CopyOfBuilder) super.botId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public CopyOfBuilder context(String str) {
            return (CopyOfBuilder) super.context(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public CopyOfBuilder errorMessage(String str) {
            return (CopyOfBuilder) super.errorMessage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.TimestampStep
        public CopyOfBuilder timestamp(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.timestamp(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotActionLog.Builder, com.amplifyframework.datastore.generated.model.BotActionLog.BuildStep
        public CopyOfBuilder triggerMessageId(String str) {
            return (CopyOfBuilder) super.triggerMessageId(str);
        }
    }

    public interface TimestampStep {
        BuildStep timestamp(Temporal.DateTime dateTime);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static BotActionLog justId(String str) {
        return new BotActionLog(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.botId, this.actionId, this.actionName, this.triggerMessageId, this.context, this.status, this.errorMessage, this.timestamp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BotActionLog.class != obj.getClass()) {
            return false;
        }
        BotActionLog botActionLog = (BotActionLog) obj;
        return s6c.m47909a(getId(), botActionLog.getId()) && s6c.m47909a(getAccountId(), botActionLog.getAccountId()) && s6c.m47909a(getBotId(), botActionLog.getBotId()) && s6c.m47909a(getActionId(), botActionLog.getActionId()) && s6c.m47909a(getActionName(), botActionLog.getActionName()) && s6c.m47909a(getTriggerMessageId(), botActionLog.getTriggerMessageId()) && s6c.m47909a(getContext(), botActionLog.getContext()) && s6c.m47909a(getStatus(), botActionLog.getStatus()) && s6c.m47909a(getErrorMessage(), botActionLog.getErrorMessage()) && s6c.m47909a(getTimestamp(), botActionLog.getTimestamp());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getContext() {
        return this.context;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public Temporal.DateTime getTimestamp() {
        return this.timestamp;
    }

    public String getTriggerMessageId() {
        return this.triggerMessageId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getBotId() + getActionId() + getActionName() + getTriggerMessageId() + getContext() + getStatus() + getErrorMessage() + getTimestamp()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BotActionLog {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("botId=" + String.valueOf(getBotId()) + ", ");
        sb.append("actionId=" + String.valueOf(getActionId()) + ", ");
        sb.append("actionName=" + String.valueOf(getActionName()) + ", ");
        sb.append("triggerMessageId=" + String.valueOf(getTriggerMessageId()) + ", ");
        sb.append("context=" + String.valueOf(getContext()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("errorMessage=" + String.valueOf(getErrorMessage()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("timestamp=");
        sb2.append(String.valueOf(getTimestamp()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private BotActionLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Temporal.DateTime dateTime) {
        this.id = str;
        this.accountId = str2;
        this.botId = str3;
        this.actionId = str4;
        this.actionName = str5;
        this.triggerMessageId = str6;
        this.context = str7;
        this.status = str8;
        this.errorMessage = str9;
        this.timestamp = dateTime;
    }
}
