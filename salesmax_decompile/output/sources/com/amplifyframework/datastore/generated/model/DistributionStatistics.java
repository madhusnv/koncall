package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "DistributionStatistics")
/* loaded from: classes5.dex */
public final class DistributionStatistics implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String assigneeId;

    @ModelField(isRequired = true, targetType = "String")
    private final String assigneeType;

    @ModelField(isRequired = true, targetType = "Int")
    private final Integer count;

    @ModelField(isRequired = true, targetType = "ID")
    private final String distributindefinitionId;

    @ModelField(isRequired = true, targetType = "DistributedEntityType")
    private final DistributedEntityType distributionEntityType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String entityListId;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;
    public static final QueryField ID = QueryField.field("DistributionStatistics", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("DistributionStatistics", "accountId");
    public static final QueryField ENTITY_LIST_ID = QueryField.field("DistributionStatistics", "entityListId");
    public static final QueryField DISTRIBUTINDEFINITION_ID = QueryField.field("DistributionStatistics", "distributindefinitionId");
    public static final QueryField ASSIGNEE_ID = QueryField.field("DistributionStatistics", "assigneeId");
    public static final QueryField ASSIGNEE_TYPE = QueryField.field("DistributionStatistics", "assigneeType");
    public static final QueryField DISTRIBUTION_ENTITY_TYPE = QueryField.field("DistributionStatistics", "distributionEntityType");
    public static final QueryField COUNT = QueryField.field("DistributionStatistics", NewHtcHomeBadger.COUNT);

    public interface AccountIdStep {
        EntityListIdStep accountId(String str);
    }

    public interface AssigneeIdStep {
        AssigneeTypeStep assigneeId(String str);
    }

    public interface AssigneeTypeStep {
        DistributionEntityTypeStep assigneeType(String str);
    }

    public interface BuildStep {
        DistributionStatistics build();

        BuildStep id(String str);
    }

    public static class Builder implements AccountIdStep, EntityListIdStep, DistributindefinitionIdStep, AssigneeIdStep, AssigneeTypeStep, DistributionEntityTypeStep, CountStep, BuildStep {
        private String accountId;
        private String assigneeId;
        private String assigneeType;
        private Integer count;
        private String distributindefinitionId;
        private DistributedEntityType distributionEntityType;
        private String entityListId;
        private String id;

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.AccountIdStep
        public EntityListIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.AssigneeIdStep
        public AssigneeTypeStep assigneeId(String str) {
            Objects.requireNonNull(str);
            this.assigneeId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.AssigneeTypeStep
        public DistributionEntityTypeStep assigneeType(String str) {
            Objects.requireNonNull(str);
            this.assigneeType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.BuildStep
        public DistributionStatistics build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new DistributionStatistics(string, this.accountId, this.entityListId, this.distributindefinitionId, this.assigneeId, this.assigneeType, this.distributionEntityType, this.count);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.CountStep
        public BuildStep count(Integer num) {
            Objects.requireNonNull(num);
            this.count = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.DistributindefinitionIdStep
        public AssigneeIdStep distributindefinitionId(String str) {
            Objects.requireNonNull(str);
            this.distributindefinitionId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.DistributionEntityTypeStep
        public CountStep distributionEntityType(DistributedEntityType distributedEntityType) {
            Objects.requireNonNull(distributedEntityType);
            this.distributionEntityType = distributedEntityType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.EntityListIdStep
        public DistributindefinitionIdStep entityListId(String str) {
            Objects.requireNonNull(str);
            this.entityListId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, DistributedEntityType distributedEntityType, Integer num) {
            super.id(str);
            super.accountId(str2).entityListId(str3).distributindefinitionId(str4).assigneeId(str5).assigneeType(str6).distributionEntityType(distributedEntityType).count(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.Builder, com.amplifyframework.datastore.generated.model.DistributionStatistics.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.Builder, com.amplifyframework.datastore.generated.model.DistributionStatistics.AssigneeIdStep
        public CopyOfBuilder assigneeId(String str) {
            return (CopyOfBuilder) super.assigneeId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.Builder, com.amplifyframework.datastore.generated.model.DistributionStatistics.AssigneeTypeStep
        public CopyOfBuilder assigneeType(String str) {
            return (CopyOfBuilder) super.assigneeType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.Builder, com.amplifyframework.datastore.generated.model.DistributionStatistics.CountStep
        public CopyOfBuilder count(Integer num) {
            return (CopyOfBuilder) super.count(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.Builder, com.amplifyframework.datastore.generated.model.DistributionStatistics.DistributindefinitionIdStep
        public CopyOfBuilder distributindefinitionId(String str) {
            return (CopyOfBuilder) super.distributindefinitionId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.Builder, com.amplifyframework.datastore.generated.model.DistributionStatistics.DistributionEntityTypeStep
        public CopyOfBuilder distributionEntityType(DistributedEntityType distributedEntityType) {
            return (CopyOfBuilder) super.distributionEntityType(distributedEntityType);
        }

        @Override // com.amplifyframework.datastore.generated.model.DistributionStatistics.Builder, com.amplifyframework.datastore.generated.model.DistributionStatistics.EntityListIdStep
        public CopyOfBuilder entityListId(String str) {
            return (CopyOfBuilder) super.entityListId(str);
        }
    }

    public interface CountStep {
        BuildStep count(Integer num);
    }

    public interface DistributindefinitionIdStep {
        AssigneeIdStep distributindefinitionId(String str);
    }

    public interface DistributionEntityTypeStep {
        CountStep distributionEntityType(DistributedEntityType distributedEntityType);
    }

    public interface EntityListIdStep {
        DistributindefinitionIdStep entityListId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static DistributionStatistics justId(String str) {
        return new DistributionStatistics(str, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.entityListId, this.distributindefinitionId, this.assigneeId, this.assigneeType, this.distributionEntityType, this.count);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DistributionStatistics.class != obj.getClass()) {
            return false;
        }
        DistributionStatistics distributionStatistics = (DistributionStatistics) obj;
        return s6c.m47909a(getId(), distributionStatistics.getId()) && s6c.m47909a(getAccountId(), distributionStatistics.getAccountId()) && s6c.m47909a(getEntityListId(), distributionStatistics.getEntityListId()) && s6c.m47909a(getDistributindefinitionId(), distributionStatistics.getDistributindefinitionId()) && s6c.m47909a(getAssigneeId(), distributionStatistics.getAssigneeId()) && s6c.m47909a(getAssigneeType(), distributionStatistics.getAssigneeType()) && s6c.m47909a(getDistributionEntityType(), distributionStatistics.getDistributionEntityType()) && s6c.m47909a(getCount(), distributionStatistics.getCount());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAssigneeId() {
        return this.assigneeId;
    }

    public String getAssigneeType() {
        return this.assigneeType;
    }

    public Integer getCount() {
        return this.count;
    }

    public String getDistributindefinitionId() {
        return this.distributindefinitionId;
    }

    public DistributedEntityType getDistributionEntityType() {
        return this.distributionEntityType;
    }

    public String getEntityListId() {
        return this.entityListId;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getEntityListId() + getDistributindefinitionId() + getAssigneeId() + getAssigneeType() + getDistributionEntityType() + getCount()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DistributionStatistics {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("entityListId=" + String.valueOf(getEntityListId()) + ", ");
        sb.append("distributindefinitionId=" + String.valueOf(getDistributindefinitionId()) + ", ");
        sb.append("assigneeId=" + String.valueOf(getAssigneeId()) + ", ");
        sb.append("assigneeType=" + String.valueOf(getAssigneeType()) + ", ");
        sb.append("distributionEntityType=" + String.valueOf(getDistributionEntityType()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("count=");
        sb2.append(String.valueOf(getCount()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private DistributionStatistics(String str, String str2, String str3, String str4, String str5, String str6, DistributedEntityType distributedEntityType, Integer num) {
        this.id = str;
        this.accountId = str2;
        this.entityListId = str3;
        this.distributindefinitionId = str4;
        this.assigneeId = str5;
        this.assigneeType = str6;
        this.distributionEntityType = distributedEntityType;
        this.count = num;
    }
}
