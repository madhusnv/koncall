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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "VerificationCodes")
/* loaded from: classes5.dex */
public final class VerificationCode implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String code;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSEmail")
    private final String emailId;

    @ModelField(targetType = "AWSTimestamp")
    private final Temporal.Timestamp expirationUnixTime;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "AWSPhone")
    private final String phoneNumber;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(isRequired = true, targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("VerificationCode", OutcomeConstants.OUTCOME_ID);
    public static final QueryField EMAIL_ID = QueryField.field("VerificationCode", "emailId");
    public static final QueryField PHONE_NUMBER = QueryField.field("VerificationCode", "phoneNumber");
    public static final QueryField CODE = QueryField.field("VerificationCode", "code");
    public static final QueryField EXPIRATION_UNIX_TIME = QueryField.field("VerificationCode", "expirationUnixTime");
    public static final QueryField USER_ID = QueryField.field("VerificationCode", "userId");
    public static final QueryField ACCOUNT_ID = QueryField.field("VerificationCode", "accountId");
    public static final QueryField CREATED_AT = QueryField.field("VerificationCode", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("VerificationCode", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        VerificationCode build();

        BuildStep code(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep emailId(String str);

        BuildStep expirationUnixTime(Temporal.Timestamp timestamp);

        BuildStep id(String str);

        BuildStep phoneNumber(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements UserIdStep, AccountIdStep, BuildStep {
        private String accountId;
        private String code;
        private Temporal.DateTime createdAt;
        private String emailId;
        private Temporal.Timestamp expirationUnixTime;
        private String id;
        private String phoneNumber;
        private Temporal.DateTime updatedAt;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public VerificationCode build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new VerificationCode(string, this.emailId, this.phoneNumber, this.code, this.expirationUnixTime, this.userId, this.accountId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public BuildStep code(String str) {
            this.code = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public BuildStep emailId(String str) {
            this.emailId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public BuildStep expirationUnixTime(Temporal.Timestamp timestamp) {
            this.expirationUnixTime = timestamp;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public BuildStep phoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.UserIdStep
        public AccountIdStep userId(String str) {
            Objects.requireNonNull(str);
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, Temporal.Timestamp timestamp, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.emailId = str2;
            this.phoneNumber = str3;
            this.code = str4;
            this.expirationUnixTime = timestamp;
            this.userId = str5;
            this.accountId = str6;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, Temporal.Timestamp timestamp, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, timestamp, str5, str6, dateTime, dateTime2);
            Objects.requireNonNull(str5);
            Objects.requireNonNull(str6);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public CopyOfBuilder code(String str) {
            return (CopyOfBuilder) super.code(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public CopyOfBuilder emailId(String str) {
            return (CopyOfBuilder) super.emailId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public CopyOfBuilder expirationUnixTime(Temporal.Timestamp timestamp) {
            return (CopyOfBuilder) super.expirationUnixTime(timestamp);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public CopyOfBuilder phoneNumber(String str) {
            return (CopyOfBuilder) super.phoneNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.VerificationCode.Builder, com.amplifyframework.datastore.generated.model.VerificationCode.UserIdStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public interface UserIdStep {
        AccountIdStep userId(String str);
    }

    public static UserIdStep builder() {
        return new Builder();
    }

    public static VerificationCode justId(String str) {
        return new VerificationCode(str, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.emailId, this.phoneNumber, this.code, this.expirationUnixTime, this.userId, this.accountId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VerificationCode.class != obj.getClass()) {
            return false;
        }
        VerificationCode verificationCode = (VerificationCode) obj;
        return s6c.m47909a(getId(), verificationCode.getId()) && s6c.m47909a(getEmailId(), verificationCode.getEmailId()) && s6c.m47909a(getPhoneNumber(), verificationCode.getPhoneNumber()) && s6c.m47909a(getCode(), verificationCode.getCode()) && s6c.m47909a(getExpirationUnixTime(), verificationCode.getExpirationUnixTime()) && s6c.m47909a(getUserId(), verificationCode.getUserId()) && s6c.m47909a(getAccountId(), verificationCode.getAccountId()) && s6c.m47909a(getCreatedAt(), verificationCode.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), verificationCode.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCode() {
        return this.code;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public Temporal.Timestamp getExpirationUnixTime() {
        return this.expirationUnixTime;
    }

    public String getId() {
        return this.id;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (getId() + getEmailId() + getPhoneNumber() + getCode() + getExpirationUnixTime() + getUserId() + getAccountId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerificationCode {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("emailId=" + String.valueOf(getEmailId()) + ", ");
        sb.append("phoneNumber=" + String.valueOf(getPhoneNumber()) + ", ");
        sb.append("code=" + String.valueOf(getCode()) + ", ");
        sb.append("expirationUnixTime=" + String.valueOf(getExpirationUnixTime()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private VerificationCode(String str, String str2, String str3, String str4, Temporal.Timestamp timestamp, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.emailId = str2;
        this.phoneNumber = str3;
        this.code = str4;
        this.expirationUnixTime = timestamp;
        this.userId = str5;
        this.accountId = str6;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
