package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"campaignId"}, name = "runByCampaignId")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "CampaignRuns")
/* loaded from: classes5.dex */
public final class CampaignRun implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "CampaignDefinition")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = CampaignDefinition.class)
    private final CampaignDefinition campaign;

    @ModelField(targetType = "String")
    private final String campaignChannelIdentifier;

    @ModelField(isRequired = true, targetType = "ID")
    private final String campaignId;

    @ModelField(targetType = "String")
    private final String campaignName;

    @ModelField(targetType = "CampaignType")
    private final CampaignType campaignType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "Int")
    private final Integer deliveredCount;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime endDate;

    @ModelField(targetType = "Int")
    private final Integer failedCount;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Int")
    private final Integer leadCount;

    @ModelField(targetType = "Int")
    private final Integer messageCreated;

    @ModelField(isRequired = true, targetType = "String")
    private final String name;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User owner;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "Team")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = Team.class)
    private final Team primaryTeam;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "Int")
    private final Integer readCount;

    @ModelField(targetType = "Int")
    private final Integer repliedCount;

    @ModelField(targetType = "Int")
    private final Integer sentCount;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime startDate;

    @ModelField(isRequired = true, targetType = "CampaignStatus")
    private final CampaignStatus status;

    @ModelField(targetType = "String")
    private final String systemPauseReason;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("CampaignRun", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CampaignRun", "accountId");
    public static final QueryField CAMPAIGN_ID = QueryField.field("CampaignRun", "campaignId");
    public static final QueryField CAMPAIGN_NAME = QueryField.field("CampaignRun", "campaignName");
    public static final QueryField CAMPAIGN_TYPE = QueryField.field("CampaignRun", "campaignType");
    public static final QueryField CAMPAIGN_CHANNEL_IDENTIFIER = QueryField.field("CampaignRun", "campaignChannelIdentifier");
    public static final QueryField NAME = QueryField.field("CampaignRun", "name");
    public static final QueryField START_DATE = QueryField.field("CampaignRun", "startDate");
    public static final QueryField END_DATE = QueryField.field("CampaignRun", "endDate");
    public static final QueryField STATUS = QueryField.field("CampaignRun", "status");
    public static final QueryField SYSTEM_PAUSE_REASON = QueryField.field("CampaignRun", "systemPauseReason");
    public static final QueryField LEAD_COUNT = QueryField.field("CampaignRun", "leadCount");
    public static final QueryField MESSAGE_CREATED = QueryField.field("CampaignRun", "messageCreated");
    public static final QueryField SENT_COUNT = QueryField.field("CampaignRun", "sentCount");
    public static final QueryField DELIVERED_COUNT = QueryField.field("CampaignRun", "deliveredCount");
    public static final QueryField READ_COUNT = QueryField.field("CampaignRun", "readCount");
    public static final QueryField REPLIED_COUNT = QueryField.field("CampaignRun", "repliedCount");
    public static final QueryField FAILED_COUNT = QueryField.field("CampaignRun", "failedCount");
    public static final QueryField OWNER_ID = QueryField.field("CampaignRun", "ownerId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("CampaignRun", "primaryTeamId");
    public static final QueryField CREATED_AT = QueryField.field("CampaignRun", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CampaignRun", "updatedAt");

    public interface AccountIdStep {
        CampaignIdStep accountId(String str);
    }

    public interface BuildStep {
        CampaignRun build();

        BuildStep campaignChannelIdentifier(String str);

        BuildStep campaignName(String str);

        BuildStep campaignType(CampaignType campaignType);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deliveredCount(Integer num);

        BuildStep endDate(Temporal.DateTime dateTime);

        BuildStep failedCount(Integer num);

        BuildStep id(String str);

        BuildStep leadCount(Integer num);

        BuildStep messageCreated(Integer num);

        BuildStep primaryTeamId(String str);

        BuildStep readCount(Integer num);

        BuildStep repliedCount(Integer num);

        BuildStep sentCount(Integer num);

        BuildStep startDate(Temporal.DateTime dateTime);

        BuildStep systemPauseReason(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, CampaignIdStep, NameStep, StatusStep, OwnerIdStep, BuildStep {
        private String accountId;
        private String campaignChannelIdentifier;
        private String campaignId;
        private String campaignName;
        private CampaignType campaignType;
        private Temporal.DateTime createdAt;
        private Integer deliveredCount;
        private Temporal.DateTime endDate;
        private Integer failedCount;
        private String id;
        private Integer leadCount;
        private Integer messageCreated;
        private String name;
        private String ownerId;
        private String primaryTeamId;
        private Integer readCount;
        private Integer repliedCount;
        private Integer sentCount;
        private Temporal.DateTime startDate;
        private CampaignStatus status;
        private String systemPauseReason;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.AccountIdStep
        public CampaignIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CampaignRun build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CampaignRun(string, this.accountId, this.campaignId, this.campaignName, this.campaignType, this.campaignChannelIdentifier, this.name, this.startDate, this.endDate, this.status, this.systemPauseReason, this.leadCount, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.ownerId, this.primaryTeamId, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep campaignChannelIdentifier(String str) {
            this.campaignChannelIdentifier = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.CampaignIdStep
        public NameStep campaignId(String str) {
            Objects.requireNonNull(str);
            this.campaignId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep campaignName(String str) {
            this.campaignName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep campaignType(CampaignType campaignType) {
            this.campaignType = campaignType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep deliveredCount(Integer num) {
            this.deliveredCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep endDate(Temporal.DateTime dateTime) {
            this.endDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep failedCount(Integer num) {
            this.failedCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep leadCount(Integer num) {
            this.leadCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep messageCreated(Integer num) {
            this.messageCreated = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.NameStep
        public StatusStep name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.OwnerIdStep
        public BuildStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep readCount(Integer num) {
            this.readCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep repliedCount(Integer num) {
            this.repliedCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep sentCount(Integer num) {
            this.sentCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep startDate(Temporal.DateTime dateTime) {
            this.startDate = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.StatusStep
        public OwnerIdStep status(CampaignStatus campaignStatus) {
            Objects.requireNonNull(campaignStatus);
            this.status = campaignStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep systemPauseReason(String str) {
            this.systemPauseReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, CampaignType campaignType, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, CampaignStatus campaignStatus, String str7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str8, String str9, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.campaignId = str3;
            this.campaignName = str4;
            this.campaignType = campaignType;
            this.campaignChannelIdentifier = str5;
            this.name = str6;
            this.startDate = dateTime;
            this.endDate = dateTime2;
            this.status = campaignStatus;
            this.systemPauseReason = str7;
            this.leadCount = num;
            this.messageCreated = num2;
            this.sentCount = num3;
            this.deliveredCount = num4;
            this.readCount = num5;
            this.repliedCount = num6;
            this.failedCount = num7;
            this.ownerId = str8;
            this.primaryTeamId = str9;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public interface CampaignIdStep {
        NameStep campaignId(String str);
    }

    public final class CopyOfBuilder extends Builder {
        private CopyOfBuilder(String str, String str2, String str3, String str4, CampaignType campaignType, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, CampaignStatus campaignStatus, String str7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str8, String str9, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, str4, campaignType, str5, str6, dateTime, dateTime2, campaignStatus, str7, num, num2, num3, num4, num5, num6, num7, str8, str9, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str6);
            Objects.requireNonNull(campaignStatus);
            Objects.requireNonNull(str8);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder campaignChannelIdentifier(String str) {
            return (CopyOfBuilder) super.campaignChannelIdentifier(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.CampaignIdStep
        public CopyOfBuilder campaignId(String str) {
            return (CopyOfBuilder) super.campaignId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder campaignName(String str) {
            return (CopyOfBuilder) super.campaignName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder campaignType(CampaignType campaignType) {
            return (CopyOfBuilder) super.campaignType(campaignType);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder deliveredCount(Integer num) {
            return (CopyOfBuilder) super.deliveredCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder endDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.endDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder failedCount(Integer num) {
            return (CopyOfBuilder) super.failedCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder leadCount(Integer num) {
            return (CopyOfBuilder) super.leadCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder messageCreated(Integer num) {
            return (CopyOfBuilder) super.messageCreated(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.NameStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder readCount(Integer num) {
            return (CopyOfBuilder) super.readCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder repliedCount(Integer num) {
            return (CopyOfBuilder) super.repliedCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder sentCount(Integer num) {
            return (CopyOfBuilder) super.sentCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder startDate(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.startDate(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.StatusStep
        public CopyOfBuilder status(CampaignStatus campaignStatus) {
            return (CopyOfBuilder) super.status(campaignStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder systemPauseReason(String str) {
            return (CopyOfBuilder) super.systemPauseReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignRun.Builder, com.amplifyframework.datastore.generated.model.CampaignRun.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface NameStep {
        StatusStep name(String str);
    }

    public interface OwnerIdStep {
        BuildStep ownerId(String str);
    }

    public interface StatusStep {
        OwnerIdStep status(CampaignStatus campaignStatus);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CampaignRun justId(String str) {
        return new CampaignRun(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.campaignId, this.campaignName, this.campaignType, this.campaignChannelIdentifier, this.name, this.startDate, this.endDate, this.status, this.systemPauseReason, this.leadCount, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.ownerId, this.primaryTeamId, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CampaignRun.class != obj.getClass()) {
            return false;
        }
        CampaignRun campaignRun = (CampaignRun) obj;
        return s6c.m47909a(getId(), campaignRun.getId()) && s6c.m47909a(getAccountId(), campaignRun.getAccountId()) && s6c.m47909a(getCampaignId(), campaignRun.getCampaignId()) && s6c.m47909a(getCampaignName(), campaignRun.getCampaignName()) && s6c.m47909a(getCampaignType(), campaignRun.getCampaignType()) && s6c.m47909a(getCampaignChannelIdentifier(), campaignRun.getCampaignChannelIdentifier()) && s6c.m47909a(getName(), campaignRun.getName()) && s6c.m47909a(getStartDate(), campaignRun.getStartDate()) && s6c.m47909a(getEndDate(), campaignRun.getEndDate()) && s6c.m47909a(getStatus(), campaignRun.getStatus()) && s6c.m47909a(getSystemPauseReason(), campaignRun.getSystemPauseReason()) && s6c.m47909a(getLeadCount(), campaignRun.getLeadCount()) && s6c.m47909a(getMessageCreated(), campaignRun.getMessageCreated()) && s6c.m47909a(getSentCount(), campaignRun.getSentCount()) && s6c.m47909a(getDeliveredCount(), campaignRun.getDeliveredCount()) && s6c.m47909a(getReadCount(), campaignRun.getReadCount()) && s6c.m47909a(getRepliedCount(), campaignRun.getRepliedCount()) && s6c.m47909a(getFailedCount(), campaignRun.getFailedCount()) && s6c.m47909a(getOwnerId(), campaignRun.getOwnerId()) && s6c.m47909a(getPrimaryTeamId(), campaignRun.getPrimaryTeamId()) && s6c.m47909a(getCreatedAt(), campaignRun.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), campaignRun.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public CampaignDefinition getCampaign() {
        return this.campaign;
    }

    public String getCampaignChannelIdentifier() {
        return this.campaignChannelIdentifier;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public String getCampaignName() {
        return this.campaignName;
    }

    public CampaignType getCampaignType() {
        return this.campaignType;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public Integer getDeliveredCount() {
        return this.deliveredCount;
    }

    public Temporal.DateTime getEndDate() {
        return this.endDate;
    }

    public Integer getFailedCount() {
        return this.failedCount;
    }

    public String getId() {
        return this.id;
    }

    public Integer getLeadCount() {
        return this.leadCount;
    }

    public Integer getMessageCreated() {
        return this.messageCreated;
    }

    public String getName() {
        return this.name;
    }

    public User getOwner() {
        return this.owner;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public Team getPrimaryTeam() {
        return this.primaryTeam;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public Integer getReadCount() {
        return this.readCount;
    }

    public Integer getRepliedCount() {
        return this.repliedCount;
    }

    public Integer getSentCount() {
        return this.sentCount;
    }

    public Temporal.DateTime getStartDate() {
        return this.startDate;
    }

    public CampaignStatus getStatus() {
        return this.status;
    }

    public String getSystemPauseReason() {
        return this.systemPauseReason;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getCampaignId() + getCampaignName() + getCampaignType() + getCampaignChannelIdentifier() + getName() + getStartDate() + getEndDate() + getStatus() + getSystemPauseReason() + getLeadCount() + getMessageCreated() + getSentCount() + getDeliveredCount() + getReadCount() + getRepliedCount() + getFailedCount() + getOwnerId() + getPrimaryTeamId() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CampaignRun {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("campaignId=" + String.valueOf(getCampaignId()) + ", ");
        sb.append("campaignName=" + String.valueOf(getCampaignName()) + ", ");
        sb.append("campaignType=" + String.valueOf(getCampaignType()) + ", ");
        sb.append("campaignChannelIdentifier=" + String.valueOf(getCampaignChannelIdentifier()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("startDate=" + String.valueOf(getStartDate()) + ", ");
        sb.append("endDate=" + String.valueOf(getEndDate()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("systemPauseReason=" + String.valueOf(getSystemPauseReason()) + ", ");
        sb.append("leadCount=" + String.valueOf(getLeadCount()) + ", ");
        sb.append("messageCreated=" + String.valueOf(getMessageCreated()) + ", ");
        sb.append("sentCount=" + String.valueOf(getSentCount()) + ", ");
        sb.append("deliveredCount=" + String.valueOf(getDeliveredCount()) + ", ");
        sb.append("readCount=" + String.valueOf(getReadCount()) + ", ");
        sb.append("repliedCount=" + String.valueOf(getRepliedCount()) + ", ");
        sb.append("failedCount=" + String.valueOf(getFailedCount()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CampaignRun(String str, String str2, String str3, String str4, CampaignType campaignType, String str5, String str6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, CampaignStatus campaignStatus, String str7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str8, String str9, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.campaign = null;
        this.owner = null;
        this.primaryTeam = null;
        this.id = str;
        this.accountId = str2;
        this.campaignId = str3;
        this.campaignName = str4;
        this.campaignType = campaignType;
        this.campaignChannelIdentifier = str5;
        this.name = str6;
        this.startDate = dateTime;
        this.endDate = dateTime2;
        this.status = campaignStatus;
        this.systemPauseReason = str7;
        this.leadCount = num;
        this.messageCreated = num2;
        this.sentCount = num3;
        this.deliveredCount = num4;
        this.readCount = num5;
        this.repliedCount = num6;
        this.failedCount = num7;
        this.ownerId = str8;
        this.primaryTeamId = str9;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
