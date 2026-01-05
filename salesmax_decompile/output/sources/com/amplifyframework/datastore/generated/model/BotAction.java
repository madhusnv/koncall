package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "BotActions")
/* loaded from: classes5.dex */
public final class BotAction implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "BotActionMapping")
    @HasMany(associatedWith = NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, type = BotActionMapping.class)
    private final List<BotActionMapping> botMappings;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(targetType = "String")
    private final String endpoint;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isPaused;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "AWSJSON")
    private final String payload;

    /* renamed from: type, reason: collision with root package name */
    @ModelField(targetType = "String")
    private final String f58101type;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("BotAction", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("BotAction", "accountId");
    public static final QueryField NAME = QueryField.field("BotAction", "name");
    public static final QueryField TYPE = QueryField.field("BotAction", "type");
    public static final QueryField ENDPOINT = QueryField.field("BotAction", "endpoint");
    public static final QueryField PAYLOAD = QueryField.field("BotAction", "payload");
    public static final QueryField DESCRIPTION = QueryField.field("BotAction", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField IS_PAUSED = QueryField.field("BotAction", "isPaused");
    public static final QueryField CREATED_AT = QueryField.field("BotAction", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("BotAction", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BotAction build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep description(String str);

        BuildStep endpoint(String str);

        BuildStep id(String str);

        BuildStep isPaused(Boolean bool);

        BuildStep name(String str);

        BuildStep payload(String str);

        BuildStep type(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String description;
        private String endpoint;
        private String id;
        private Boolean isPaused;
        private String name;
        private String payload;

        /* renamed from: type, reason: collision with root package name */
        private String f58102type;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.BotAction.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BotAction build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new BotAction(string, this.accountId, this.name, this.f58102type, this.endpoint, this.payload, this.description, this.isPaused, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep endpoint(String str) {
            this.endpoint = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep isPaused(Boolean bool) {
            this.isPaused = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep payload(String str) {
            this.payload = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep type(String str) {
            this.f58102type = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.f58102type = str4;
            this.endpoint = str5;
            this.payload = str6;
            this.description = str7;
            this.isPaused = bool;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, str7, bool, dateTime, dateTime2);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder endpoint(String str) {
            return (CopyOfBuilder) super.endpoint(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder isPaused(Boolean bool) {
            return (CopyOfBuilder) super.isPaused(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder payload(String str) {
            return (CopyOfBuilder) super.payload(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder type(String str) {
            return (CopyOfBuilder) super.type(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.BotAction.Builder, com.amplifyframework.datastore.generated.model.BotAction.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static BotAction justId(String str) {
        return new BotAction(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.f58101type, this.endpoint, this.payload, this.description, this.isPaused, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BotAction.class != obj.getClass()) {
            return false;
        }
        BotAction botAction = (BotAction) obj;
        return s6c.m47909a(getId(), botAction.getId()) && s6c.m47909a(getAccountId(), botAction.getAccountId()) && s6c.m47909a(getName(), botAction.getName()) && s6c.m47909a(getType(), botAction.getType()) && s6c.m47909a(getEndpoint(), botAction.getEndpoint()) && s6c.m47909a(getPayload(), botAction.getPayload()) && s6c.m47909a(getDescription(), botAction.getDescription()) && s6c.m47909a(getIsPaused(), botAction.getIsPaused()) && s6c.m47909a(getCreatedAt(), botAction.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), botAction.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public List<BotActionMapping> getBotMappings() {
        return this.botMappings;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsPaused() {
        return this.isPaused;
    }

    public String getName() {
        return this.name;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getType() {
        return this.f58101type;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getType() + getEndpoint() + getPayload() + getDescription() + getIsPaused() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BotAction {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("type=" + String.valueOf(getType()) + ", ");
        sb.append("endpoint=" + String.valueOf(getEndpoint()) + ", ");
        sb.append("payload=" + String.valueOf(getPayload()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("isPaused=" + String.valueOf(getIsPaused()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private BotAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.botMappings = null;
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.f58101type = str4;
        this.endpoint = str5;
        this.payload = str6;
        this.description = str7;
        this.isPaused = bool;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
