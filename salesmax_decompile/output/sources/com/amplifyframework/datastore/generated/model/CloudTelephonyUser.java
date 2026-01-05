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
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "agentNumber", "providerName"}, name = "userByAgentNumber"), @Index(fields = {"accountId", "userId"}, name = "telephonyByUserId")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "CloudTelephonyUsers")
/* loaded from: classes5.dex */
public final class CloudTelephonyUser implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String agentId;

    @ModelField(targetType = "String")
    private final String agentNumber;

    @ModelField(targetType = "String")
    private final String agentStatus;

    @ModelField(targetType = "String")
    private final List<String> allowedOutboundNumbers;

    @ModelField(targetType = "ID")
    private final String cloudTelephonyAccount;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean ouboundEnabled;

    @ModelField(targetType = "String")
    private final String providerName;

    @ModelField(targetType = "String")
    private final String remoteUserId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;

    @ModelField(targetType = "ID")
    private final String userId;
    public static final QueryField ID = QueryField.field("CloudTelephonyUser", OutcomeConstants.OUTCOME_ID);
    public static final QueryField USER_ID = QueryField.field("CloudTelephonyUser", "userId");
    public static final QueryField REMOTE_USER_ID = QueryField.field("CloudTelephonyUser", "remoteUserId");
    public static final QueryField ACCOUNT_ID = QueryField.field("CloudTelephonyUser", "accountId");
    public static final QueryField CLOUD_TELEPHONY_ACCOUNT = QueryField.field("CloudTelephonyUser", "cloudTelephonyAccount");
    public static final QueryField AGENT_NUMBER = QueryField.field("CloudTelephonyUser", "agentNumber");
    public static final QueryField AGENT_ID = QueryField.field("CloudTelephonyUser", "agentId");
    public static final QueryField PROVIDER_NAME = QueryField.field("CloudTelephonyUser", "providerName");
    public static final QueryField AGENT_STATUS = QueryField.field("CloudTelephonyUser", "agentStatus");
    public static final QueryField OUBOUND_ENABLED = QueryField.field("CloudTelephonyUser", "ouboundEnabled");
    public static final QueryField ALLOWED_OUTBOUND_NUMBERS = QueryField.field("CloudTelephonyUser", "allowedOutboundNumbers");
    public static final QueryField CREATED_AT = QueryField.field("CloudTelephonyUser", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CloudTelephonyUser", "updatedAt");
    public static final QueryField CREATED_BY_ID = QueryField.field("CloudTelephonyUser", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("CloudTelephonyUser", "updatedById");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep agentId(String str);

        BuildStep agentNumber(String str);

        BuildStep agentStatus(String str);

        BuildStep allowedOutboundNumbers(List<String> list);

        CloudTelephonyUser build();

        BuildStep cloudTelephonyAccount(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep id(String str);

        BuildStep ouboundEnabled(Boolean bool);

        BuildStep providerName(String str);

        BuildStep remoteUserId(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);

        BuildStep userId(String str);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private String agentId;
        private String agentNumber;
        private String agentStatus;
        private List<String> allowedOutboundNumbers;
        private String cloudTelephonyAccount;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String id;
        private Boolean ouboundEnabled;
        private String providerName;
        private String remoteUserId;
        private Temporal.DateTime updatedAt;
        private String updatedById;
        private String userId;

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep agentId(String str) {
            this.agentId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep agentNumber(String str) {
            this.agentNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep agentStatus(String str) {
            this.agentStatus = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep allowedOutboundNumbers(List<String> list) {
            this.allowedOutboundNumbers = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CloudTelephonyUser build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CloudTelephonyUser(string, this.userId, this.remoteUserId, this.accountId, this.cloudTelephonyAccount, this.agentNumber, this.agentId, this.providerName, this.agentStatus, this.ouboundEnabled, this.allowedOutboundNumbers, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep cloudTelephonyAccount(String str) {
            this.cloudTelephonyAccount = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep ouboundEnabled(Boolean bool) {
            this.ouboundEnabled = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep providerName(String str) {
            this.providerName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep remoteUserId(String str) {
            this.remoteUserId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public BuildStep userId(String str) {
            this.userId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, List<String> list, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11) {
            this.id = str;
            this.userId = str2;
            this.remoteUserId = str3;
            this.accountId = str4;
            this.cloudTelephonyAccount = str5;
            this.agentNumber = str6;
            this.agentId = str7;
            this.providerName = str8;
            this.agentStatus = str9;
            this.ouboundEnabled = bool;
            this.allowedOutboundNumbers = list;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.createdById = str10;
            this.updatedById = str11;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public /* bridge */ /* synthetic */ BuildStep allowedOutboundNumbers(List list) {
            return allowedOutboundNumbers((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, List<String> list, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11) {
            super(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, list, dateTime, dateTime2, str10, str11);
            Objects.requireNonNull(str4);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder agentId(String str) {
            return (CopyOfBuilder) super.agentId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder agentNumber(String str) {
            return (CopyOfBuilder) super.agentNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder agentStatus(String str) {
            return (CopyOfBuilder) super.agentStatus(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder allowedOutboundNumbers(List<String> list) {
            return (CopyOfBuilder) super.allowedOutboundNumbers(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder cloudTelephonyAccount(String str) {
            return (CopyOfBuilder) super.cloudTelephonyAccount(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder ouboundEnabled(Boolean bool) {
            return (CopyOfBuilder) super.ouboundEnabled(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder providerName(String str) {
            return (CopyOfBuilder) super.providerName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder remoteUserId(String str) {
            return (CopyOfBuilder) super.remoteUserId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyUser.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyUser.BuildStep
        public CopyOfBuilder userId(String str) {
            return (CopyOfBuilder) super.userId(str);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CloudTelephonyUser justId(String str) {
        return new CloudTelephonyUser(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.userId, this.remoteUserId, this.accountId, this.cloudTelephonyAccount, this.agentNumber, this.agentId, this.providerName, this.agentStatus, this.ouboundEnabled, this.allowedOutboundNumbers, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CloudTelephonyUser.class != obj.getClass()) {
            return false;
        }
        CloudTelephonyUser cloudTelephonyUser = (CloudTelephonyUser) obj;
        return s6c.m47909a(getId(), cloudTelephonyUser.getId()) && s6c.m47909a(getUserId(), cloudTelephonyUser.getUserId()) && s6c.m47909a(getRemoteUserId(), cloudTelephonyUser.getRemoteUserId()) && s6c.m47909a(getAccountId(), cloudTelephonyUser.getAccountId()) && s6c.m47909a(getCloudTelephonyAccount(), cloudTelephonyUser.getCloudTelephonyAccount()) && s6c.m47909a(getAgentNumber(), cloudTelephonyUser.getAgentNumber()) && s6c.m47909a(getAgentId(), cloudTelephonyUser.getAgentId()) && s6c.m47909a(getProviderName(), cloudTelephonyUser.getProviderName()) && s6c.m47909a(getAgentStatus(), cloudTelephonyUser.getAgentStatus()) && s6c.m47909a(getOuboundEnabled(), cloudTelephonyUser.getOuboundEnabled()) && s6c.m47909a(getAllowedOutboundNumbers(), cloudTelephonyUser.getAllowedOutboundNumbers()) && s6c.m47909a(getCreatedAt(), cloudTelephonyUser.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), cloudTelephonyUser.getUpdatedAt()) && s6c.m47909a(getCreatedById(), cloudTelephonyUser.getCreatedById()) && s6c.m47909a(getUpdatedById(), cloudTelephonyUser.getUpdatedById());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAgentId() {
        return this.agentId;
    }

    public String getAgentNumber() {
        return this.agentNumber;
    }

    public String getAgentStatus() {
        return this.agentStatus;
    }

    public List<String> getAllowedOutboundNumbers() {
        return this.allowedOutboundNumbers;
    }

    public String getCloudTelephonyAccount() {
        return this.cloudTelephonyAccount;
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

    public Boolean getOuboundEnabled() {
        return this.ouboundEnabled;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getRemoteUserId() {
        return this.remoteUserId;
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

    public int hashCode() {
        return (getId() + getUserId() + getRemoteUserId() + getAccountId() + getCloudTelephonyAccount() + getAgentNumber() + getAgentId() + getProviderName() + getAgentStatus() + getOuboundEnabled() + getAllowedOutboundNumbers() + getCreatedAt() + getUpdatedAt() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloudTelephonyUser {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("userId=" + String.valueOf(getUserId()) + ", ");
        sb.append("remoteUserId=" + String.valueOf(getRemoteUserId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("cloudTelephonyAccount=" + String.valueOf(getCloudTelephonyAccount()) + ", ");
        sb.append("agentNumber=" + String.valueOf(getAgentNumber()) + ", ");
        sb.append("agentId=" + String.valueOf(getAgentId()) + ", ");
        sb.append("providerName=" + String.valueOf(getProviderName()) + ", ");
        sb.append("agentStatus=" + String.valueOf(getAgentStatus()) + ", ");
        sb.append("ouboundEnabled=" + String.valueOf(getOuboundEnabled()) + ", ");
        sb.append("allowedOutboundNumbers=" + String.valueOf(getAllowedOutboundNumbers()) + ", ");
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

    private CloudTelephonyUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, List<String> list, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11) {
        this.id = str;
        this.userId = str2;
        this.remoteUserId = str3;
        this.accountId = str4;
        this.cloudTelephonyAccount = str5;
        this.agentNumber = str6;
        this.agentId = str7;
        this.providerName = str8;
        this.agentStatus = str9;
        this.ouboundEnabled = bool;
        this.allowedOutboundNumbers = list;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.createdById = str10;
        this.updatedById = str11;
    }
}
