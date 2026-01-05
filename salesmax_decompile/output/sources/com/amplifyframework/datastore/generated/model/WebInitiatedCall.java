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
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "userId"}, name = SQLiteCommandFactory.UNDEFINED)
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "WebInitiatedCalls")
/* loaded from: classes5.dex */
public final class WebInitiatedCall implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String callId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("WebInitiatedCall", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("WebInitiatedCall", "accountId");
    public static final QueryField USER_ID = QueryField.field("WebInitiatedCall", "userId");
    public static final QueryField CALL_ID = QueryField.field("WebInitiatedCall", "callId");
    public static final QueryField STATUS = QueryField.field("WebInitiatedCall", "status");

    public interface AccountIdStep {
        UserIdStep accountId(String str);
    }

    public interface BuildStep {
        WebInitiatedCall build();

        BuildStep id(String str);

        BuildStep status(String str);
    }

    public static class Builder implements AccountIdStep, UserIdStep, CallIdStep, BuildStep {
        private String accountId;
        private String callId;
        private String id;
        private String status;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.AccountIdStep
        public UserIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.BuildStep
        public WebInitiatedCall build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new WebInitiatedCall(string, this.accountId, this.userId, this.callId, this.status);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.CallIdStep
        public BuildStep callId(String str) {
            Objects.requireNonNull(str);
            this.callId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.UserIdStep
        public CallIdStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5) {
            this.id = str;
            this.accountId = str2;
            this.userId = str3;
            this.callId = str4;
            this.status = str5;
        }
    }

    public interface CallIdStep {
        BuildStep callId(String str);
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5) {
            super(str, str2, str3, str4, str5);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.Builder, com.amplifyframework.datastore.generated.model.WebInitiatedCall.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.Builder, com.amplifyframework.datastore.generated.model.WebInitiatedCall.CallIdStep
        public CopyOfBuilder callId(String str) {
            return (CopyOfBuilder) super.callId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.Builder, com.amplifyframework.datastore.generated.model.WebInitiatedCall.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WebInitiatedCall.Builder, com.amplifyframework.datastore.generated.model.WebInitiatedCall.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface UserIdStep {
        CallIdStep userId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static WebInitiatedCall justId(String str) {
        return new WebInitiatedCall(str, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.userId, this.callId, this.status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebInitiatedCall.class != obj.getClass()) {
            return false;
        }
        WebInitiatedCall webInitiatedCall = (WebInitiatedCall) obj;
        return s6c.m47909a(getId(), webInitiatedCall.getId()) && s6c.m47909a(getAccountId(), webInitiatedCall.getAccountId()) && s6c.m47909a(getUserId(), webInitiatedCall.getUserId()) && s6c.m47909a(getCallId(), webInitiatedCall.getCallId()) && s6c.m47909a(getStatus(), webInitiatedCall.getStatus());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCallId() {
        return this.callId;
    }

    public String getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getUserId() + getCallId() + getStatus()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WebInitiatedCall {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("callId=" + String.valueOf(getCallId()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("status=");
        sb2.append(String.valueOf(getStatus()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private WebInitiatedCall(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.accountId = str2;
        this.userId = str3;
        this.callId = str4;
        this.status = str5;
    }
}
