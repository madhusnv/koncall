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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "userId"}, name = "wabaPhoneNumbersByUser"), @Index(fields = {"accountId", "wabaPhoneNumberId"}, name = "usersBywabaPhoneNumber")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "WabaPhoneNumberUsers")
/* loaded from: classes5.dex */
public final class WabaPhoneNumberUser implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean isDefault;

    @ModelField(targetType = "ID")
    private final String teamId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "ID")
    private final String userId;

    @ModelField(targetType = "ID")
    private final String wabaPhoneNumberId;
    public static final QueryField ID = QueryField.field("WabaPhoneNumberUser", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("WabaPhoneNumberUser", "accountId");
    public static final QueryField WABA_PHONE_NUMBER_ID = QueryField.field("WabaPhoneNumberUser", "wabaPhoneNumberId");
    public static final QueryField IS_DEFAULT = QueryField.field("WabaPhoneNumberUser", "isDefault");
    public static final QueryField USER_ID = QueryField.field("WabaPhoneNumberUser", "userId");
    public static final QueryField TEAM_ID = QueryField.field("WabaPhoneNumberUser", "teamId");
    public static final QueryField CREATED_AT = QueryField.field("WabaPhoneNumberUser", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("WabaPhoneNumberUser", "updatedAt");
    public static final QueryField CREATED_BY_ID = QueryField.field("WabaPhoneNumberUser", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("WabaPhoneNumberUser", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        WabaPhoneNumberUser build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep id(String str);

        BuildStep isDefault(Boolean bool);

        BuildStep teamId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep userId(String str);

        BuildStep wabaPhoneNumberId(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String id;
        private Boolean isDefault;
        private String teamId;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String userId;
        private String wabaPhoneNumberId;

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public WabaPhoneNumberUser build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new WabaPhoneNumberUser(string, this.accountId, this.wabaPhoneNumberId, this.isDefault, this.userId, this.teamId, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep isDefault(Boolean bool) {
            this.isDefault = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep teamId(String str) {
            this.teamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep userId(String str) {
            this.userId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public BuildStep wabaPhoneNumberId(String str) {
            this.wabaPhoneNumberId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, Boolean bool, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str6, String str7) {
            this.id = str;
            this.accountId = str2;
            this.wabaPhoneNumberId = str3;
            this.isDefault = bool;
            this.userId = str4;
            this.teamId = str5;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.createdById = str6;
            this.updatedById = str7;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, Boolean bool, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str6, String str7) {
            super(str, str2, str3, bool, str4, str5, dateTime, dateTime2, str6, str7);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder isDefault(Boolean bool) {
            return (CopyOfBuilder) super.isDefault(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder teamId(String str) {
            return (CopyOfBuilder) super.teamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.Builder, com.amplifyframework.datastore.generated.model.WabaPhoneNumberUser.BuildStep
        public CopyOfBuilder wabaPhoneNumberId(String str) {
            return (CopyOfBuilder) super.wabaPhoneNumberId(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static WabaPhoneNumberUser justId(String str) {
        return new WabaPhoneNumberUser(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.wabaPhoneNumberId, this.isDefault, this.userId, this.teamId, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WabaPhoneNumberUser.class != obj.getClass()) {
            return false;
        }
        WabaPhoneNumberUser wabaPhoneNumberUser = (WabaPhoneNumberUser) obj;
        return s6c.m47909a(getId(), wabaPhoneNumberUser.getId()) && s6c.m47909a(getAccountId(), wabaPhoneNumberUser.getAccountId()) && s6c.m47909a(getWabaPhoneNumberId(), wabaPhoneNumberUser.getWabaPhoneNumberId()) && s6c.m47909a(getIsDefault(), wabaPhoneNumberUser.getIsDefault()) && s6c.m47909a(getUserId(), wabaPhoneNumberUser.getUserId()) && s6c.m47909a(getTeamId(), wabaPhoneNumberUser.getTeamId()) && s6c.m47909a(getCreatedAt(), wabaPhoneNumberUser.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), wabaPhoneNumberUser.getUpdatedAt()) && s6c.m47909a(getCreatedById(), wabaPhoneNumberUser.getCreatedById()) && s6c.m47909a(getUpdatedById(), wabaPhoneNumberUser.getUpdatedById());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getTeamId() {
        return this.teamId;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getWabaPhoneNumberId() {
        return this.wabaPhoneNumberId;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getWabaPhoneNumberId() + getIsDefault() + getUserId() + getTeamId() + getCreatedAt() + getUpdatedAt() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WabaPhoneNumberUser {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("wabaPhoneNumberId=" + String.valueOf(getWabaPhoneNumberId()) + ", ");
        sb.append("isDefault=" + String.valueOf(getIsDefault()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("teamId=" + String.valueOf(getTeamId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private WabaPhoneNumberUser(String str, String str2, String str3, Boolean bool, String str4, String str5, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str6, String str7) {
        this.id = str;
        this.accountId = str2;
        this.wabaPhoneNumberId = str3;
        this.isDefault = bool;
        this.userId = str4;
        this.teamId = str5;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.createdById = str6;
        this.updatedById = str7;
    }
}
