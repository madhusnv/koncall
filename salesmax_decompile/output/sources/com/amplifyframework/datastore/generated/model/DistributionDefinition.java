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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Indexes({@Index(fields = {"accountId", "ownerId", "updatedAt"}, name = "byDistributionOwner"), @Index(fields = {"accountId", "updatedAt"}, name = "distributionForAccount")})
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "DistributionDefinitions")
/* loaded from: classes5.dex */
public final class DistributionDefinition implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Boolean")
    private final Boolean assignLeadOwnerToTask;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(isRequired = true, targetType = "String")
    private final String description;

    @ModelField(isRequired = true, targetType = "DistributedEntityType")
    private final List<DistributedEntityType> distributedEntityType;

    @ModelField(targetType = "DistributionCreationType")
    private final DistributionCreationType distributionCreationType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "IfOwnerExists")
    private final IfOwnerExists ifOwnerExists;

    @ModelField(isRequired = true, targetType = "String")
    private final String name;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "Boolean")
    private final Boolean remeberAssigneeInDistributionScope;

    @ModelField(targetType = "Boolean")
    private final Boolean remeberAssigneeInGlobalScope;

    @ModelField(targetType = "AssignmentRuleset")
    private final List<AssignmentRuleset> rule;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("DistributionDefinition", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("DistributionDefinition", "accountId");
    public static final QueryField NAME = QueryField.field("DistributionDefinition", "name");
    public static final QueryField DESCRIPTION = QueryField.field("DistributionDefinition", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField DISTRIBUTED_ENTITY_TYPE = QueryField.field("DistributionDefinition", "distributedEntityType");
    public static final QueryField IF_OWNER_EXISTS = QueryField.field("DistributionDefinition", "ifOwnerExists");
    public static final QueryField ASSIGN_LEAD_OWNER_TO_TASK = QueryField.field("DistributionDefinition", "assignLeadOwnerToTask");
    public static final QueryField REMEBER_ASSIGNEE_IN_DISTRIBUTION_SCOPE = QueryField.field("DistributionDefinition", "remeberAssigneeInDistributionScope");
    public static final QueryField REMEBER_ASSIGNEE_IN_GLOBAL_SCOPE = QueryField.field("DistributionDefinition", "remeberAssigneeInGlobalScope");
    public static final QueryField OWNER_ID = QueryField.field("DistributionDefinition", "ownerId");
    public static final QueryField RULE = QueryField.field("DistributionDefinition", "rule");
    public static final QueryField DISTRIBUTION_CREATION_TYPE = QueryField.field("DistributionDefinition", "distributionCreationType");
    public static final QueryField CREATED_AT = QueryField.field("DistributionDefinition", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("DistributionDefinition", "updatedAt");

    public interface AccountIdStep {
        NameStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep assignLeadOwnerToTask(Boolean bool);

        DistributionDefinition build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep distributionCreationType(DistributionCreationType distributionCreationType);

        BuildStep id(String str);

        BuildStep ifOwnerExists(IfOwnerExists ifOwnerExists);

        BuildStep remeberAssigneeInDistributionScope(Boolean bool);

        BuildStep remeberAssigneeInGlobalScope(Boolean bool);

        BuildStep rule(List<AssignmentRuleset> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, NameStep, DescriptionStep, DistributedEntityTypeStep, OwnerIdStep, BuildStep {
        private String accountId;
        private Boolean assignLeadOwnerToTask;
        private Temporal.DateTime createdAt;
        private String description;
        private List<DistributedEntityType> distributedEntityType;
        private DistributionCreationType distributionCreationType;
        private String id;
        private IfOwnerExists ifOwnerExists;
        private String name;
        private String ownerId;
        private Boolean remeberAssigneeInDistributionScope;
        private Boolean remeberAssigneeInGlobalScope;
        private List<AssignmentRuleset> rule;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.AccountIdStep
        public NameStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep assignLeadOwnerToTask(Boolean bool) {
            this.assignLeadOwnerToTask = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public DistributionDefinition build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new DistributionDefinition(string, this.accountId, this.name, this.description, this.distributedEntityType, this.ifOwnerExists, this.assignLeadOwnerToTask, this.remeberAssigneeInDistributionScope, this.remeberAssigneeInGlobalScope, this.ownerId, this.rule, this.distributionCreationType, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.DescriptionStep
        public DistributedEntityTypeStep description(String str) {
            Objects.requireNonNull(str);
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.DistributedEntityTypeStep
        public OwnerIdStep distributedEntityType(List<DistributedEntityType> list) {
            Objects.requireNonNull(list);
            this.distributedEntityType = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep distributionCreationType(DistributionCreationType distributionCreationType) {
            this.distributionCreationType = distributionCreationType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep ifOwnerExists(IfOwnerExists ifOwnerExists) {
            this.ifOwnerExists = ifOwnerExists;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.NameStep
        public DescriptionStep name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.OwnerIdStep
        public BuildStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep remeberAssigneeInDistributionScope(Boolean bool) {
            this.remeberAssigneeInDistributionScope = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep remeberAssigneeInGlobalScope(Boolean bool) {
            this.remeberAssigneeInGlobalScope = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep rule(List<AssignmentRuleset> list) {
            this.rule = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, List<DistributedEntityType> list, IfOwnerExists ifOwnerExists, Boolean bool, Boolean bool2, Boolean bool3, String str5, List<AssignmentRuleset> list2, DistributionCreationType distributionCreationType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.description = str4;
            this.distributedEntityType = list;
            this.ifOwnerExists = ifOwnerExists;
            this.assignLeadOwnerToTask = bool;
            this.remeberAssigneeInDistributionScope = bool2;
            this.remeberAssigneeInGlobalScope = bool3;
            this.ownerId = str5;
            this.rule = list2;
            this.distributionCreationType = distributionCreationType;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.DistributedEntityTypeStep
        public /* bridge */ /* synthetic */ OwnerIdStep distributedEntityType(List list) {
            return distributedEntityType((List<DistributedEntityType>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public /* bridge */ /* synthetic */ BuildStep rule(List list) {
            return rule((List<AssignmentRuleset>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, List<DistributedEntityType> list, IfOwnerExists ifOwnerExists, Boolean bool, Boolean bool2, Boolean bool3, String str5, List<AssignmentRuleset> list2, DistributionCreationType distributionCreationType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, list, ifOwnerExists, bool, bool2, bool3, str5, list2, distributionCreationType, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(list);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder assignLeadOwnerToTask(Boolean bool) {
            return (CopyOfBuilder) super.assignLeadOwnerToTask(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.DescriptionStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.DistributedEntityTypeStep
        public CopyOfBuilder distributedEntityType(List<DistributedEntityType> list) {
            return (CopyOfBuilder) super.distributedEntityType(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder distributionCreationType(DistributionCreationType distributionCreationType) {
            return (CopyOfBuilder) super.distributionCreationType(distributionCreationType);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder ifOwnerExists(IfOwnerExists ifOwnerExists) {
            return (CopyOfBuilder) super.ifOwnerExists(ifOwnerExists);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.NameStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder remeberAssigneeInDistributionScope(Boolean bool) {
            return (CopyOfBuilder) super.remeberAssigneeInDistributionScope(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder remeberAssigneeInGlobalScope(Boolean bool) {
            return (CopyOfBuilder) super.remeberAssigneeInGlobalScope(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder rule(List<AssignmentRuleset> list) {
            return (CopyOfBuilder) super.rule(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionDefinition.Builder, com.amplifyframework.datastore.generated.model.DistributionDefinition.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface DescriptionStep {
        DistributedEntityTypeStep description(String str);
    }

    public interface DistributedEntityTypeStep {
        OwnerIdStep distributedEntityType(List<DistributedEntityType> list);
    }

    public interface NameStep {
        DescriptionStep name(String str);
    }

    public interface OwnerIdStep {
        BuildStep ownerId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static DistributionDefinition justId(String str) {
        return new DistributionDefinition(str, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.description, this.distributedEntityType, this.ifOwnerExists, this.assignLeadOwnerToTask, this.remeberAssigneeInDistributionScope, this.remeberAssigneeInGlobalScope, this.ownerId, this.rule, this.distributionCreationType, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DistributionDefinition.class != obj.getClass()) {
            return false;
        }
        DistributionDefinition distributionDefinition = (DistributionDefinition) obj;
        return s6c.m47909a(getId(), distributionDefinition.getId()) && s6c.m47909a(getAccountId(), distributionDefinition.getAccountId()) && s6c.m47909a(getName(), distributionDefinition.getName()) && s6c.m47909a(getDescription(), distributionDefinition.getDescription()) && s6c.m47909a(getDistributedEntityType(), distributionDefinition.getDistributedEntityType()) && s6c.m47909a(getIfOwnerExists(), distributionDefinition.getIfOwnerExists()) && s6c.m47909a(getAssignLeadOwnerToTask(), distributionDefinition.getAssignLeadOwnerToTask()) && s6c.m47909a(getRemeberAssigneeInDistributionScope(), distributionDefinition.getRemeberAssigneeInDistributionScope()) && s6c.m47909a(getRemeberAssigneeInGlobalScope(), distributionDefinition.getRemeberAssigneeInGlobalScope()) && s6c.m47909a(getOwnerId(), distributionDefinition.getOwnerId()) && s6c.m47909a(getRule(), distributionDefinition.getRule()) && s6c.m47909a(getDistributionCreationType(), distributionDefinition.getDistributionCreationType()) && s6c.m47909a(getCreatedAt(), distributionDefinition.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), distributionDefinition.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Boolean getAssignLeadOwnerToTask() {
        return this.assignLeadOwnerToTask;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDescription() {
        return this.description;
    }

    public List<DistributedEntityType> getDistributedEntityType() {
        return this.distributedEntityType;
    }

    public DistributionCreationType getDistributionCreationType() {
        return this.distributionCreationType;
    }

    public String getId() {
        return this.id;
    }

    public IfOwnerExists getIfOwnerExists() {
        return this.ifOwnerExists;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public Boolean getRemeberAssigneeInDistributionScope() {
        return this.remeberAssigneeInDistributionScope;
    }

    public Boolean getRemeberAssigneeInGlobalScope() {
        return this.remeberAssigneeInGlobalScope;
    }

    public List<AssignmentRuleset> getRule() {
        return this.rule;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getDescription() + getDistributedEntityType() + getIfOwnerExists() + getAssignLeadOwnerToTask() + getRemeberAssigneeInDistributionScope() + getRemeberAssigneeInGlobalScope() + getOwnerId() + getRule() + getDistributionCreationType() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DistributionDefinition {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("distributedEntityType=" + String.valueOf(getDistributedEntityType()) + ", ");
        sb.append("ifOwnerExists=" + String.valueOf(getIfOwnerExists()) + ", ");
        sb.append("assignLeadOwnerToTask=" + String.valueOf(getAssignLeadOwnerToTask()) + ", ");
        sb.append("remeberAssigneeInDistributionScope=" + String.valueOf(getRemeberAssigneeInDistributionScope()) + ", ");
        sb.append("remeberAssigneeInGlobalScope=" + String.valueOf(getRemeberAssigneeInGlobalScope()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("rule=" + String.valueOf(getRule()) + ", ");
        sb.append("distributionCreationType=" + String.valueOf(getDistributionCreationType()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private DistributionDefinition(String str, String str2, String str3, String str4, List<DistributedEntityType> list, IfOwnerExists ifOwnerExists, Boolean bool, Boolean bool2, Boolean bool3, String str5, List<AssignmentRuleset> list2, DistributionCreationType distributionCreationType, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.description = str4;
        this.distributedEntityType = list;
        this.ifOwnerExists = ifOwnerExists;
        this.assignLeadOwnerToTask = bool;
        this.remeberAssigneeInDistributionScope = bool2;
        this.remeberAssigneeInGlobalScope = bool3;
        this.ownerId = str5;
        this.rule = list2;
        this.distributionCreationType = distributionCreationType;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
