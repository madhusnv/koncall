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
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "createdAt"}, name = "eventsByAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "WabaWebhookEvents")
/* loaded from: classes5.dex */
public final class WabaWebhookEvent implements Model {

    @ModelField(targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String displayPhoneNumber;

    @ModelField(targetType = "String")
    private final String field;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSJSON")
    private final String payload;

    @ModelField(targetType = "ID")
    private final String phoneNumberId;

    @ModelField(targetType = "ID")
    private final String wabaAccountId;
    public static final QueryField ID = QueryField.field("WabaWebhookEvent", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("WabaWebhookEvent", "accountId");
    public static final QueryField WABA_ACCOUNT_ID = QueryField.field("WabaWebhookEvent", "wabaAccountId");
    public static final QueryField DISPLAY_PHONE_NUMBER = QueryField.field("WabaWebhookEvent", "displayPhoneNumber");
    public static final QueryField PHONE_NUMBER_ID = QueryField.field("WabaWebhookEvent", "phoneNumberId");
    public static final QueryField FIELD = QueryField.field("WabaWebhookEvent", "field");
    public static final QueryField PAYLOAD = QueryField.field("WabaWebhookEvent", "payload");
    public static final QueryField CREATED_AT = QueryField.field("WabaWebhookEvent", "createdAt");

    public interface BuildStep {
        BuildStep accountId(String str);

        WabaWebhookEvent build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep displayPhoneNumber(String str);

        BuildStep field(String str);

        BuildStep id(String str);

        BuildStep payload(String str);

        BuildStep phoneNumberId(String str);

        BuildStep wabaAccountId(String str);
    }

    public static class Builder implements BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String displayPhoneNumber;
        private String field;
        private String id;
        private String payload;
        private String phoneNumberId;
        private String wabaAccountId;

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep accountId(String str) {
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public WabaWebhookEvent build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new WabaWebhookEvent(string, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.field, this.payload, this.createdAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep displayPhoneNumber(String str) {
            this.displayPhoneNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep field(String str) {
            this.field = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep payload(String str) {
            this.payload = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep phoneNumberId(String str) {
            this.phoneNumberId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public BuildStep wabaAccountId(String str) {
            this.wabaAccountId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Temporal.DateTime dateTime) {
            this.id = str;
            this.accountId = str2;
            this.wabaAccountId = str3;
            this.displayPhoneNumber = str4;
            this.phoneNumberId = str5;
            this.field = str6;
            this.payload = str7;
            this.createdAt = dateTime;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, Temporal.DateTime dateTime) {
            super(str, str2, str3, str4, str5, str6, str7, dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.Builder, com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.Builder, com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.Builder, com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public CopyOfBuilder displayPhoneNumber(String str) {
            return (CopyOfBuilder) super.displayPhoneNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.Builder, com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public CopyOfBuilder field(String str) {
            return (CopyOfBuilder) super.field(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.Builder, com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public CopyOfBuilder payload(String str) {
            return (CopyOfBuilder) super.payload(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.Builder, com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public CopyOfBuilder phoneNumberId(String str) {
            return (CopyOfBuilder) super.phoneNumberId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaWebhookEvent.Builder, com.amplifyframework.datastore.generated.model.WabaWebhookEvent.BuildStep
        public CopyOfBuilder wabaAccountId(String str) {
            return (CopyOfBuilder) super.wabaAccountId(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public static WabaWebhookEvent justId(String str) {
        return new WabaWebhookEvent(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.wabaAccountId, this.displayPhoneNumber, this.phoneNumberId, this.field, this.payload, this.createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WabaWebhookEvent.class != obj.getClass()) {
            return false;
        }
        WabaWebhookEvent wabaWebhookEvent = (WabaWebhookEvent) obj;
        return s6c.m47909a(getId(), wabaWebhookEvent.getId()) && s6c.m47909a(getAccountId(), wabaWebhookEvent.getAccountId()) && s6c.m47909a(getWabaAccountId(), wabaWebhookEvent.getWabaAccountId()) && s6c.m47909a(getDisplayPhoneNumber(), wabaWebhookEvent.getDisplayPhoneNumber()) && s6c.m47909a(getPhoneNumberId(), wabaWebhookEvent.getPhoneNumberId()) && s6c.m47909a(getField(), wabaWebhookEvent.getField()) && s6c.m47909a(getPayload(), wabaWebhookEvent.getPayload()) && s6c.m47909a(getCreatedAt(), wabaWebhookEvent.getCreatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDisplayPhoneNumber() {
        return this.displayPhoneNumber;
    }

    public String getField() {
        return this.field;
    }

    public String getId() {
        return this.id;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public String getWabaAccountId() {
        return this.wabaAccountId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getWabaAccountId() + getDisplayPhoneNumber() + getPhoneNumberId() + getField() + getPayload() + getCreatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WabaWebhookEvent {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("wabaAccountId=" + String.valueOf(getWabaAccountId()) + ", ");
        sb.append("displayPhoneNumber=" + String.valueOf(getDisplayPhoneNumber()) + ", ");
        sb.append("phoneNumberId=" + String.valueOf(getPhoneNumberId()) + ", ");
        sb.append("field=" + String.valueOf(getField()) + ", ");
        sb.append("payload=" + String.valueOf(getPayload()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createdAt=");
        sb2.append(String.valueOf(getCreatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private WabaWebhookEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, Temporal.DateTime dateTime) {
        this.id = str;
        this.accountId = str2;
        this.wabaAccountId = str3;
        this.displayPhoneNumber = str4;
        this.phoneNumberId = str5;
        this.field = str6;
        this.payload = str7;
        this.createdAt = dateTime;
    }
}
