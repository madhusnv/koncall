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

@Index(fields = {"accountId"}, name = "integrationsByAccount")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ})}, pluralName = "AccountIntegrations")
/* loaded from: classes5.dex */
public final class AccountIntegration implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdById;

    @ModelField(targetType = "Boolean")
    private final Boolean fetchHistorical;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String metadata;

    @ModelField(targetType = "String")
    private final String networkType;

    @ModelField(targetType = "String")
    private final String nextActionTaskType;

    @ModelField(targetType = "String")
    private final String status;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("AccountIntegration", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("AccountIntegration", "accountId");
    public static final QueryField NETWORK_TYPE = QueryField.field("AccountIntegration", "networkType");
    public static final QueryField CREATED_BY_ID = QueryField.field("AccountIntegration", "createdById");
    public static final QueryField FETCH_HISTORICAL = QueryField.field("AccountIntegration", "fetchHistorical");
    public static final QueryField NEXT_ACTION_TASK_TYPE = QueryField.field("AccountIntegration", "nextActionTaskType");
    public static final QueryField STATUS = QueryField.field("AccountIntegration", "status");
    public static final QueryField METADATA = QueryField.field("AccountIntegration", "metadata");
    public static final QueryField CREATED_AT = QueryField.field("AccountIntegration", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("AccountIntegration", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        AccountIntegration build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdById(String str);

        BuildStep fetchHistorical(Boolean bool);

        BuildStep id(String str);

        BuildStep metadata(String str);

        BuildStep networkType(String str);

        BuildStep nextActionTaskType(String str);

        BuildStep status(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Temporal.DateTime createdAt;
        private String createdById;
        private Boolean fetchHistorical;
        private String id;
        private String metadata;
        private String networkType;
        private String nextActionTaskType;
        private String status;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public AccountIntegration build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new AccountIntegration(string, this.accountId, this.networkType, this.createdById, this.fetchHistorical, this.nextActionTaskType, this.status, this.metadata, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep createdById(String str) {
            this.createdById = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep fetchHistorical(Boolean bool) {
            this.fetchHistorical = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep metadata(String str) {
            this.metadata = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep networkType(String str) {
            this.networkType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep nextActionTaskType(String str) {
            this.nextActionTaskType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep status(String str) {
            this.status = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super.id(str);
            super.accountId(str2).networkType(str3).createdById(str4).fetchHistorical(bool).nextActionTaskType(str5).status(str6).metadata(str7).createdAt(dateTime).updatedAt(dateTime2);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder createdById(String str) {
            return (CopyOfBuilder) super.createdById(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder fetchHistorical(Boolean bool) {
            return (CopyOfBuilder) super.fetchHistorical(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder metadata(String str) {
            return (CopyOfBuilder) super.metadata(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder networkType(String str) {
            return (CopyOfBuilder) super.networkType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder nextActionTaskType(String str) {
            return (CopyOfBuilder) super.nextActionTaskType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder status(String str) {
            return (CopyOfBuilder) super.status(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.AccountIntegration.Builder, com.amplifyframework.datastore.generated.model.AccountIntegration.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static AccountIntegration justId(String str) {
        return new AccountIntegration(str, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.networkType, this.createdById, this.fetchHistorical, this.nextActionTaskType, this.status, this.metadata, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountIntegration.class != obj.getClass()) {
            return false;
        }
        AccountIntegration accountIntegration = (AccountIntegration) obj;
        return s6c.m47909a(getId(), accountIntegration.getId()) && s6c.m47909a(getAccountId(), accountIntegration.getAccountId()) && s6c.m47909a(getNetworkType(), accountIntegration.getNetworkType()) && s6c.m47909a(getCreatedById(), accountIntegration.getCreatedById()) && s6c.m47909a(getFetchHistorical(), accountIntegration.getFetchHistorical()) && s6c.m47909a(getNextActionTaskType(), accountIntegration.getNextActionTaskType()) && s6c.m47909a(getStatus(), accountIntegration.getStatus()) && s6c.m47909a(getMetadata(), accountIntegration.getMetadata()) && s6c.m47909a(getCreatedAt(), accountIntegration.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), accountIntegration.getUpdatedAt());
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

    public Boolean getFetchHistorical() {
        return this.fetchHistorical;
    }

    public String getId() {
        return this.id;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String getNextActionTaskType() {
        return this.nextActionTaskType;
    }

    public String getStatus() {
        return this.status;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getNetworkType() + getCreatedById() + getFetchHistorical() + getNextActionTaskType() + getStatus() + getMetadata() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountIntegration {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("networkType=" + String.valueOf(getNetworkType()) + ", ");
        sb.append("createdById=" + String.valueOf(getCreatedById()) + ", ");
        sb.append("fetchHistorical=" + String.valueOf(getFetchHistorical()) + ", ");
        sb.append("nextActionTaskType=" + String.valueOf(getNextActionTaskType()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("metadata=" + String.valueOf(getMetadata()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private AccountIntegration(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.networkType = str3;
        this.createdById = str4;
        this.fetchHistorical = bool;
        this.nextActionTaskType = str5;
        this.status = str6;
        this.metadata = str7;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
