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

@Indexes({@Index(fields = {"accountId", "updatedAt"}, name = "telephonyByAccount"), @Index(fields = {"providerName", "displayNumber"}, name = "telephonyAccountByNumber")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "CloudTelephonyAccounts")
/* loaded from: classes5.dex */
public final class CloudTelephonyAccount implements Model {

    @ModelField(targetType = "String")
    private final String accessToken;

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String cloudTelephonyAccountSid;

    @ModelField(targetType = "String")
    private final String cloudTelephonySubdomain;

    @ModelField(targetType = "Boolean")
    private final Boolean createNewLead;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "String")
    private final String displayNumber;

    @ModelField(targetType = "ID")
    private final String entityListId;

    @ModelField(targetType = "Boolean")
    private final Boolean hasOutbound;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String providerAccountId;

    @ModelField(isRequired = true, targetType = "String")
    private final String providerName;

    @ModelField(targetType = "String")
    private final String telephonyNumber;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(targetType = "ID")
    private final String updatedById;
    public static final QueryField ID = QueryField.field("CloudTelephonyAccount", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CloudTelephonyAccount", "accountId");
    public static final QueryField PROVIDER_NAME = QueryField.field("CloudTelephonyAccount", "providerName");
    public static final QueryField TELEPHONY_NUMBER = QueryField.field("CloudTelephonyAccount", "telephonyNumber");
    public static final QueryField PROVIDER_ACCOUNT_ID = QueryField.field("CloudTelephonyAccount", "providerAccountId");
    public static final QueryField DISPLAY_NUMBER = QueryField.field("CloudTelephonyAccount", "displayNumber");
    public static final QueryField HAS_OUTBOUND = QueryField.field("CloudTelephonyAccount", "hasOutbound");
    public static final QueryField CREATE_NEW_LEAD = QueryField.field("CloudTelephonyAccount", "createNewLead");
    public static final QueryField ACCESS_TOKEN = QueryField.field("CloudTelephonyAccount", "accessToken");
    public static final QueryField CLOUD_TELEPHONY_SUBDOMAIN = QueryField.field("CloudTelephonyAccount", "cloudTelephonySubdomain");
    public static final QueryField CLOUD_TELEPHONY_ACCOUNT_SID = QueryField.field("CloudTelephonyAccount", "cloudTelephonyAccountSid");
    public static final QueryField CREATED_AT = QueryField.field("CloudTelephonyAccount", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CloudTelephonyAccount", "updatedAt");
    public static final QueryField ENTITY_LIST_ID = QueryField.field("CloudTelephonyAccount", "entityListId");
    public static final QueryField CREATED_BY_ID = QueryField.field("CloudTelephonyAccount", "createdById");
    public static final QueryField UPDATED_BY_ID = QueryField.field("CloudTelephonyAccount", "updatedById");

    public interface AccountIdStep {
        ProviderNameStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep accessToken(String str);

        CloudTelephonyAccount build();

        BuildStep cloudTelephonyAccountSid(String str);

        BuildStep cloudTelephonySubdomain(String str);

        BuildStep createNewLead(Boolean bool);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep displayNumber(String str);

        BuildStep entityListId(String str);

        BuildStep hasOutbound(Boolean bool);

        BuildStep id(String str);

        BuildStep providerAccountId(String str);

        BuildStep telephonyNumber(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep updatedById(String str);
    }

    public static class Builder implements AccountIdStep, ProviderNameStep, BuildStep {
        private String accessToken;
        private String accountId;
        private String cloudTelephonyAccountSid;
        private String cloudTelephonySubdomain;
        private Boolean createNewLead;
        private Temporal.DateTime createdAt;
        private String createdById;
        private String displayNumber;
        private String entityListId;
        private Boolean hasOutbound;
        private String id;
        private String providerAccountId;
        private String providerName;
        private String telephonyNumber;
        private Temporal.DateTime updatedAt;
        private String updatedById;

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.AccountIdStep
        public ProviderNameStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CloudTelephonyAccount build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CloudTelephonyAccount(string, this.accountId, this.providerName, this.telephonyNumber, this.providerAccountId, this.displayNumber, this.hasOutbound, this.createNewLead, this.accessToken, this.cloudTelephonySubdomain, this.cloudTelephonyAccountSid, this.createdAt, this.updatedAt, this.entityListId, this.createdById, this.updatedById);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep cloudTelephonyAccountSid(String str) {
            this.cloudTelephonyAccountSid = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep cloudTelephonySubdomain(String str) {
            this.cloudTelephonySubdomain = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep createNewLead(Boolean bool) {
            this.createNewLead = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep displayNumber(String str) {
            this.displayNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep entityListId(String str) {
            this.entityListId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep hasOutbound(Boolean bool) {
            this.hasOutbound = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep providerAccountId(String str) {
            this.providerAccountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.ProviderNameStep
        public BuildStep providerName(String str) {
            Objects.requireNonNull(str);
            this.providerName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep telephonyNumber(String str) {
            this.telephonyNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public BuildStep updatedById(String str) {
            this.updatedById = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11, String str12) {
            this.id = str;
            this.accountId = str2;
            this.providerName = str3;
            this.telephonyNumber = str4;
            this.providerAccountId = str5;
            this.displayNumber = str6;
            this.hasOutbound = bool;
            this.createNewLead = bool2;
            this.accessToken = str7;
            this.cloudTelephonySubdomain = str8;
            this.cloudTelephonyAccountSid = str9;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
            this.entityListId = str10;
            this.createdById = str11;
            this.updatedById = str12;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11, String str12) {
            super(str, str2, str3, str4, str5, str6, bool, bool2, str7, str8, str9, dateTime, dateTime2, str10, str11, str12);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder accessToken(String str) {
            return (CopyOfBuilder) super.accessToken(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder cloudTelephonyAccountSid(String str) {
            return (CopyOfBuilder) super.cloudTelephonyAccountSid(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder cloudTelephonySubdomain(String str) {
            return (CopyOfBuilder) super.cloudTelephonySubdomain(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder createNewLead(Boolean bool) {
            return (CopyOfBuilder) super.createNewLead(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder displayNumber(String str) {
            return (CopyOfBuilder) super.displayNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder entityListId(String str) {
            return (CopyOfBuilder) super.entityListId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder hasOutbound(Boolean bool) {
            return (CopyOfBuilder) super.hasOutbound(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder providerAccountId(String str) {
            return (CopyOfBuilder) super.providerAccountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.ProviderNameStep
        public CopyOfBuilder providerName(String str) {
            return (CopyOfBuilder) super.providerName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder telephonyNumber(String str) {
            return (CopyOfBuilder) super.telephonyNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.Builder, com.amplifyframework.datastore.generated.model.CloudTelephonyAccount.BuildStep
        public CopyOfBuilder updatedById(String str) {
            return (CopyOfBuilder) super.updatedById(str);
        }
    }

    public interface ProviderNameStep {
        BuildStep providerName(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CloudTelephonyAccount justId(String str) {
        return new CloudTelephonyAccount(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.providerName, this.telephonyNumber, this.providerAccountId, this.displayNumber, this.hasOutbound, this.createNewLead, this.accessToken, this.cloudTelephonySubdomain, this.cloudTelephonyAccountSid, this.createdAt, this.updatedAt, this.entityListId, this.createdById, this.updatedById);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CloudTelephonyAccount.class != obj.getClass()) {
            return false;
        }
        CloudTelephonyAccount cloudTelephonyAccount = (CloudTelephonyAccount) obj;
        return s6c.m47909a(getId(), cloudTelephonyAccount.getId()) && s6c.m47909a(getAccountId(), cloudTelephonyAccount.getAccountId()) && s6c.m47909a(getProviderName(), cloudTelephonyAccount.getProviderName()) && s6c.m47909a(getTelephonyNumber(), cloudTelephonyAccount.getTelephonyNumber()) && s6c.m47909a(getProviderAccountId(), cloudTelephonyAccount.getProviderAccountId()) && s6c.m47909a(getDisplayNumber(), cloudTelephonyAccount.getDisplayNumber()) && s6c.m47909a(getHasOutbound(), cloudTelephonyAccount.getHasOutbound()) && s6c.m47909a(getCreateNewLead(), cloudTelephonyAccount.getCreateNewLead()) && s6c.m47909a(getAccessToken(), cloudTelephonyAccount.getAccessToken()) && s6c.m47909a(getCloudTelephonySubdomain(), cloudTelephonyAccount.getCloudTelephonySubdomain()) && s6c.m47909a(getCloudTelephonyAccountSid(), cloudTelephonyAccount.getCloudTelephonyAccountSid()) && s6c.m47909a(getCreatedAt(), cloudTelephonyAccount.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), cloudTelephonyAccount.getUpdatedAt()) && s6c.m47909a(getEntityListId(), cloudTelephonyAccount.getEntityListId()) && s6c.m47909a(getCreatedById(), cloudTelephonyAccount.getCreatedById()) && s6c.m47909a(getUpdatedById(), cloudTelephonyAccount.getUpdatedById());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getCloudTelephonyAccountSid() {
        return this.cloudTelephonyAccountSid;
    }

    public String getCloudTelephonySubdomain() {
        return this.cloudTelephonySubdomain;
    }

    public Boolean getCreateNewLead() {
        return this.createNewLead;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedById() {
        return this.createdById;
    }

    public String getDisplayNumber() {
        return this.displayNumber;
    }

    public String getEntityListId() {
        return this.entityListId;
    }

    public Boolean getHasOutbound() {
        return this.hasOutbound;
    }

    public String getId() {
        return this.id;
    }

    public String getProviderAccountId() {
        return this.providerAccountId;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getTelephonyNumber() {
        return this.telephonyNumber;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedById() {
        return this.updatedById;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getProviderName() + getTelephonyNumber() + getProviderAccountId() + getDisplayNumber() + getHasOutbound() + getCreateNewLead() + getAccessToken() + getCloudTelephonySubdomain() + getCloudTelephonyAccountSid() + getCreatedAt() + getUpdatedAt() + getEntityListId() + getCreatedById() + getUpdatedById()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloudTelephonyAccount {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("providerName=" + String.valueOf(getProviderName()) + ", ");
        sb.append("telephonyNumber=" + String.valueOf(getTelephonyNumber()) + ", ");
        sb.append("providerAccountId=" + String.valueOf(getProviderAccountId()) + ", ");
        sb.append("displayNumber=" + String.valueOf(getDisplayNumber()) + ", ");
        sb.append("hasOutbound=" + String.valueOf(getHasOutbound()) + ", ");
        sb.append("createNewLead=" + String.valueOf(getCreateNewLead()) + ", ");
        sb.append("accessToken=" + String.valueOf(getAccessToken()) + ", ");
        sb.append("cloudTelephonySubdomain=" + String.valueOf(getCloudTelephonySubdomain()) + ", ");
        sb.append("cloudTelephonyAccountSid=" + String.valueOf(getCloudTelephonyAccountSid()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        sb.append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ");
        sb.append("entityListId=" + String.valueOf(getEntityListId()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedById=");
        sb2.append(String.valueOf(getUpdatedById()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CloudTelephonyAccount(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, String str9, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, String str10, String str11, String str12) {
        this.id = str;
        this.accountId = str2;
        this.providerName = str3;
        this.telephonyNumber = str4;
        this.providerAccountId = str5;
        this.displayNumber = str6;
        this.hasOutbound = bool;
        this.createNewLead = bool2;
        this.accessToken = str7;
        this.cloudTelephonySubdomain = str8;
        this.cloudTelephonyAccountSid = str9;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.entityListId = str10;
        this.createdById = str11;
        this.updatedById = str12;
    }
}
