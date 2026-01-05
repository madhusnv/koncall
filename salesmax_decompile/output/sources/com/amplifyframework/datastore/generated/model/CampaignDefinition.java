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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"associatedEntityListId"}, name = "campaignByEntityList")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.READ, ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "CampaignDefinitions")
/* loaded from: classes5.dex */
public final class CampaignDefinition implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Boolean")
    private final Boolean allowMultiple;

    @ModelField(isRequired = true, targetType = "ID")
    private final String associatedEntityListId;

    @ModelField(targetType = "EntityList")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = EntityList.class)
    private final EntityList associatedList;

    @ModelField(targetType = "String")
    private final String campaignCategory;

    @ModelField(targetType = "String")
    private final String campaignChannelIdentifier;

    @ModelField(targetType = "AWSJSON")
    private final String campaignData;

    @ModelField(targetType = "User")
    @HasOne(associatedWith = OutcomeConstants.OUTCOME_ID, type = User.class)
    private final User campaignOwner;

    @ModelField(targetType = "CampaignRunFrequencyUnit")
    private final CampaignRunFrequencyUnit campaignRunFrequencyUnit;

    @ModelField(targetType = "Int")
    private final Integer campaignRunFrequencyValue;

    @ModelField(targetType = "String")
    private final String campaignSubCategory;

    @ModelField(isRequired = true, targetType = "CampaignType")
    private final CampaignType campaignType;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final List<String> daysToSend;

    @ModelField(targetType = "Int")
    private final Integer deliveredCount;

    @ModelField(isRequired = true, targetType = "String")
    private final String description;

    @ModelField(targetType = "Int")
    private final Integer durationOfRunInDays;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime endDateOfRun;

    @ModelField(targetType = "Int")
    private final Integer failedCount;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean includeHistoricalMemberships;

    @ModelField(targetType = "Int")
    private final Integer leadLimit;

    @ModelField(targetType = "Int")
    private final Integer messageCreated;

    @ModelField(isRequired = true, targetType = "String")
    private final String name;

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
    private final Temporal.DateTime startDateOfRun;

    @ModelField(isRequired = true, targetType = "CampaignStatus")
    private final CampaignStatus status;

    @ModelField(targetType = "String")
    private final String systemPauseReason;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "TimeSlotToSend")
    private final List<TimeSlotToSend> timeSlotToSend;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("CampaignDefinition", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("CampaignDefinition", "accountId");
    public static final QueryField NAME = QueryField.field("CampaignDefinition", "name");
    public static final QueryField DESCRIPTION = QueryField.field("CampaignDefinition", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField CAMPAIGN_CATEGORY = QueryField.field("CampaignDefinition", "campaignCategory");
    public static final QueryField CAMPAIGN_SUB_CATEGORY = QueryField.field("CampaignDefinition", "campaignSubCategory");
    public static final QueryField CAMPAIGN_TYPE = QueryField.field("CampaignDefinition", "campaignType");
    public static final QueryField CAMPAIGN_CHANNEL_IDENTIFIER = QueryField.field("CampaignDefinition", "campaignChannelIdentifier");
    public static final QueryField CAMPAIGN_DATA = QueryField.field("CampaignDefinition", "campaignData");
    public static final QueryField CAMPAIGN_RUN_FREQUENCY_UNIT = QueryField.field("CampaignDefinition", "campaignRunFrequencyUnit");
    public static final QueryField CAMPAIGN_RUN_FREQUENCY_VALUE = QueryField.field("CampaignDefinition", "campaignRunFrequencyValue");
    public static final QueryField START_DATE_OF_RUN = QueryField.field("CampaignDefinition", "startDateOfRun");
    public static final QueryField END_DATE_OF_RUN = QueryField.field("CampaignDefinition", "endDateOfRun");
    public static final QueryField DURATION_OF_RUN_IN_DAYS = QueryField.field("CampaignDefinition", "durationOfRunInDays");
    public static final QueryField DAYS_TO_SEND = QueryField.field("CampaignDefinition", "daysToSend");
    public static final QueryField TIME_SLOT_TO_SEND = QueryField.field("CampaignDefinition", "timeSlotToSend");
    public static final QueryField OWNER_ID = QueryField.field("CampaignDefinition", "ownerId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("CampaignDefinition", "primaryTeamId");
    public static final QueryField STATUS = QueryField.field("CampaignDefinition", "status");
    public static final QueryField SYSTEM_PAUSE_REASON = QueryField.field("CampaignDefinition", "systemPauseReason");
    public static final QueryField ASSOCIATED_ENTITY_LIST_ID = QueryField.field("CampaignDefinition", "associatedEntityListId");
    public static final QueryField INCLUDE_HISTORICAL_MEMBERSHIPS = QueryField.field("CampaignDefinition", "includeHistoricalMemberships");
    public static final QueryField ALLOW_MULTIPLE = QueryField.field("CampaignDefinition", "allowMultiple");
    public static final QueryField MESSAGE_CREATED = QueryField.field("CampaignDefinition", "messageCreated");
    public static final QueryField SENT_COUNT = QueryField.field("CampaignDefinition", "sentCount");
    public static final QueryField DELIVERED_COUNT = QueryField.field("CampaignDefinition", "deliveredCount");
    public static final QueryField READ_COUNT = QueryField.field("CampaignDefinition", "readCount");
    public static final QueryField REPLIED_COUNT = QueryField.field("CampaignDefinition", "repliedCount");
    public static final QueryField FAILED_COUNT = QueryField.field("CampaignDefinition", "failedCount");
    public static final QueryField TAGS = QueryField.field("CampaignDefinition", "tags");
    public static final QueryField LEAD_LIMIT = QueryField.field("CampaignDefinition", "leadLimit");
    public static final QueryField CREATED_AT = QueryField.field("CampaignDefinition", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("CampaignDefinition", "updatedAt");

    public interface AccountIdStep {
        NameStep accountId(String str);
    }

    public interface AssociatedEntityListIdStep {
        BuildStep associatedEntityListId(String str);
    }

    public interface BuildStep {
        BuildStep allowMultiple(Boolean bool);

        CampaignDefinition build();

        BuildStep campaignCategory(String str);

        BuildStep campaignChannelIdentifier(String str);

        BuildStep campaignData(String str);

        BuildStep campaignRunFrequencyUnit(CampaignRunFrequencyUnit campaignRunFrequencyUnit);

        BuildStep campaignRunFrequencyValue(Integer num);

        BuildStep campaignSubCategory(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep daysToSend(List<String> list);

        BuildStep deliveredCount(Integer num);

        BuildStep durationOfRunInDays(Integer num);

        BuildStep endDateOfRun(Temporal.DateTime dateTime);

        BuildStep failedCount(Integer num);

        BuildStep id(String str);

        BuildStep includeHistoricalMemberships(Boolean bool);

        BuildStep leadLimit(Integer num);

        BuildStep messageCreated(Integer num);

        BuildStep primaryTeamId(String str);

        BuildStep readCount(Integer num);

        BuildStep repliedCount(Integer num);

        BuildStep sentCount(Integer num);

        BuildStep startDateOfRun(Temporal.DateTime dateTime);

        BuildStep systemPauseReason(String str);

        BuildStep tags(List<String> list);

        BuildStep timeSlotToSend(List<TimeSlotToSend> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, NameStep, DescriptionStep, CampaignTypeStep, OwnerIdStep, StatusStep, AssociatedEntityListIdStep, BuildStep {
        private String accountId;
        private Boolean allowMultiple;
        private String associatedEntityListId;
        private String campaignCategory;
        private String campaignChannelIdentifier;
        private String campaignData;
        private CampaignRunFrequencyUnit campaignRunFrequencyUnit;
        private Integer campaignRunFrequencyValue;
        private String campaignSubCategory;
        private CampaignType campaignType;
        private Temporal.DateTime createdAt;
        private List<String> daysToSend;
        private Integer deliveredCount;
        private String description;
        private Integer durationOfRunInDays;
        private Temporal.DateTime endDateOfRun;
        private Integer failedCount;
        private String id;
        private Boolean includeHistoricalMemberships;
        private Integer leadLimit;
        private Integer messageCreated;
        private String name;
        private String ownerId;
        private String primaryTeamId;
        private Integer readCount;
        private Integer repliedCount;
        private Integer sentCount;
        private Temporal.DateTime startDateOfRun;
        private CampaignStatus status;
        private String systemPauseReason;
        private List<String> tags;
        private List<TimeSlotToSend> timeSlotToSend;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.AccountIdStep
        public NameStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep allowMultiple(Boolean bool) {
            this.allowMultiple = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.AssociatedEntityListIdStep
        public BuildStep associatedEntityListId(String str) {
            Objects.requireNonNull(str);
            this.associatedEntityListId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CampaignDefinition build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new CampaignDefinition(string, this.accountId, this.name, this.description, this.campaignCategory, this.campaignSubCategory, this.campaignType, this.campaignChannelIdentifier, this.campaignData, this.campaignRunFrequencyUnit, this.campaignRunFrequencyValue, this.startDateOfRun, this.endDateOfRun, this.durationOfRunInDays, this.daysToSend, this.timeSlotToSend, this.ownerId, this.primaryTeamId, this.status, this.systemPauseReason, this.associatedEntityListId, this.includeHistoricalMemberships, this.allowMultiple, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.tags, this.leadLimit, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep campaignCategory(String str) {
            this.campaignCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep campaignChannelIdentifier(String str) {
            this.campaignChannelIdentifier = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep campaignData(String str) {
            this.campaignData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep campaignRunFrequencyUnit(CampaignRunFrequencyUnit campaignRunFrequencyUnit) {
            this.campaignRunFrequencyUnit = campaignRunFrequencyUnit;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep campaignRunFrequencyValue(Integer num) {
            this.campaignRunFrequencyValue = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep campaignSubCategory(String str) {
            this.campaignSubCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.CampaignTypeStep
        public OwnerIdStep campaignType(CampaignType campaignType) {
            Objects.requireNonNull(campaignType);
            this.campaignType = campaignType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep daysToSend(List<String> list) {
            this.daysToSend = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep deliveredCount(Integer num) {
            this.deliveredCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.DescriptionStep
        public CampaignTypeStep description(String str) {
            Objects.requireNonNull(str);
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep durationOfRunInDays(Integer num) {
            this.durationOfRunInDays = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep endDateOfRun(Temporal.DateTime dateTime) {
            this.endDateOfRun = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep failedCount(Integer num) {
            this.failedCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep includeHistoricalMemberships(Boolean bool) {
            this.includeHistoricalMemberships = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep leadLimit(Integer num) {
            this.leadLimit = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep messageCreated(Integer num) {
            this.messageCreated = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.NameStep
        public DescriptionStep name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.OwnerIdStep
        public StatusStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep readCount(Integer num) {
            this.readCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep repliedCount(Integer num) {
            this.repliedCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep sentCount(Integer num) {
            this.sentCount = num;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep startDateOfRun(Temporal.DateTime dateTime) {
            this.startDateOfRun = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.StatusStep
        public AssociatedEntityListIdStep status(CampaignStatus campaignStatus) {
            Objects.requireNonNull(campaignStatus);
            this.status = campaignStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep systemPauseReason(String str) {
            this.systemPauseReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep timeSlotToSend(List<TimeSlotToSend> list) {
            this.timeSlotToSend = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, CampaignType campaignType, String str7, String str8, CampaignRunFrequencyUnit campaignRunFrequencyUnit, Integer num, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num2, List<String> list, List<TimeSlotToSend> list2, String str9, String str10, CampaignStatus campaignStatus, String str11, String str12, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List<String> list3, Integer num9, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.description = str4;
            this.campaignCategory = str5;
            this.campaignSubCategory = str6;
            this.campaignType = campaignType;
            this.campaignChannelIdentifier = str7;
            this.campaignData = str8;
            this.campaignRunFrequencyUnit = campaignRunFrequencyUnit;
            this.campaignRunFrequencyValue = num;
            this.startDateOfRun = dateTime;
            this.endDateOfRun = dateTime2;
            this.durationOfRunInDays = num2;
            this.daysToSend = list;
            this.timeSlotToSend = list2;
            this.ownerId = str9;
            this.primaryTeamId = str10;
            this.status = campaignStatus;
            this.systemPauseReason = str11;
            this.associatedEntityListId = str12;
            this.includeHistoricalMemberships = bool;
            this.allowMultiple = bool2;
            this.messageCreated = num3;
            this.sentCount = num4;
            this.deliveredCount = num5;
            this.readCount = num6;
            this.repliedCount = num7;
            this.failedCount = num8;
            this.tags = list3;
            this.leadLimit = num9;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public interface CampaignTypeStep {
        OwnerIdStep campaignType(CampaignType campaignType);
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public /* bridge */ /* synthetic */ BuildStep daysToSend(List list) {
            return daysToSend((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public /* bridge */ /* synthetic */ BuildStep timeSlotToSend(List list) {
            return timeSlotToSend((List<TimeSlotToSend>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, CampaignType campaignType, String str7, String str8, CampaignRunFrequencyUnit campaignRunFrequencyUnit, Integer num, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num2, List<String> list, List<TimeSlotToSend> list2, String str9, String str10, CampaignStatus campaignStatus, String str11, String str12, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List<String> list3, Integer num9, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, str4, str5, str6, campaignType, str7, str8, campaignRunFrequencyUnit, num, dateTime, dateTime2, num2, list, list2, str9, str10, campaignStatus, str11, str12, bool, bool2, num3, num4, num5, num6, num7, num8, list3, num9, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(campaignType);
            Objects.requireNonNull(str9);
            Objects.requireNonNull(campaignStatus);
            Objects.requireNonNull(str12);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder allowMultiple(Boolean bool) {
            return (CopyOfBuilder) super.allowMultiple(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.AssociatedEntityListIdStep
        public CopyOfBuilder associatedEntityListId(String str) {
            return (CopyOfBuilder) super.associatedEntityListId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder campaignCategory(String str) {
            return (CopyOfBuilder) super.campaignCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder campaignChannelIdentifier(String str) {
            return (CopyOfBuilder) super.campaignChannelIdentifier(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder campaignData(String str) {
            return (CopyOfBuilder) super.campaignData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder campaignRunFrequencyUnit(CampaignRunFrequencyUnit campaignRunFrequencyUnit) {
            return (CopyOfBuilder) super.campaignRunFrequencyUnit(campaignRunFrequencyUnit);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder campaignRunFrequencyValue(Integer num) {
            return (CopyOfBuilder) super.campaignRunFrequencyValue(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder campaignSubCategory(String str) {
            return (CopyOfBuilder) super.campaignSubCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.CampaignTypeStep
        public CopyOfBuilder campaignType(CampaignType campaignType) {
            return (CopyOfBuilder) super.campaignType(campaignType);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder daysToSend(List<String> list) {
            return (CopyOfBuilder) super.daysToSend(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder deliveredCount(Integer num) {
            return (CopyOfBuilder) super.deliveredCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.DescriptionStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder durationOfRunInDays(Integer num) {
            return (CopyOfBuilder) super.durationOfRunInDays(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder endDateOfRun(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.endDateOfRun(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder failedCount(Integer num) {
            return (CopyOfBuilder) super.failedCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder includeHistoricalMemberships(Boolean bool) {
            return (CopyOfBuilder) super.includeHistoricalMemberships(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder leadLimit(Integer num) {
            return (CopyOfBuilder) super.leadLimit(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder messageCreated(Integer num) {
            return (CopyOfBuilder) super.messageCreated(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.NameStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder readCount(Integer num) {
            return (CopyOfBuilder) super.readCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder repliedCount(Integer num) {
            return (CopyOfBuilder) super.repliedCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder sentCount(Integer num) {
            return (CopyOfBuilder) super.sentCount(num);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder startDateOfRun(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.startDateOfRun(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.StatusStep
        public CopyOfBuilder status(CampaignStatus campaignStatus) {
            return (CopyOfBuilder) super.status(campaignStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder systemPauseReason(String str) {
            return (CopyOfBuilder) super.systemPauseReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder timeSlotToSend(List<TimeSlotToSend> list) {
            return (CopyOfBuilder) super.timeSlotToSend(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.CampaignDefinition.Builder, com.amplifyframework.datastore.generated.model.CampaignDefinition.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface DescriptionStep {
        CampaignTypeStep description(String str);
    }

    public interface NameStep {
        DescriptionStep name(String str);
    }

    public interface OwnerIdStep {
        StatusStep ownerId(String str);
    }

    public interface StatusStep {
        AssociatedEntityListIdStep status(CampaignStatus campaignStatus);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static CampaignDefinition justId(String str) {
        return new CampaignDefinition(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.description, this.campaignCategory, this.campaignSubCategory, this.campaignType, this.campaignChannelIdentifier, this.campaignData, this.campaignRunFrequencyUnit, this.campaignRunFrequencyValue, this.startDateOfRun, this.endDateOfRun, this.durationOfRunInDays, this.daysToSend, this.timeSlotToSend, this.ownerId, this.primaryTeamId, this.status, this.systemPauseReason, this.associatedEntityListId, this.includeHistoricalMemberships, this.allowMultiple, this.messageCreated, this.sentCount, this.deliveredCount, this.readCount, this.repliedCount, this.failedCount, this.tags, this.leadLimit, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CampaignDefinition.class != obj.getClass()) {
            return false;
        }
        CampaignDefinition campaignDefinition = (CampaignDefinition) obj;
        return s6c.m47909a(getId(), campaignDefinition.getId()) && s6c.m47909a(getAccountId(), campaignDefinition.getAccountId()) && s6c.m47909a(getName(), campaignDefinition.getName()) && s6c.m47909a(getDescription(), campaignDefinition.getDescription()) && s6c.m47909a(getCampaignCategory(), campaignDefinition.getCampaignCategory()) && s6c.m47909a(getCampaignSubCategory(), campaignDefinition.getCampaignSubCategory()) && s6c.m47909a(getCampaignType(), campaignDefinition.getCampaignType()) && s6c.m47909a(getCampaignChannelIdentifier(), campaignDefinition.getCampaignChannelIdentifier()) && s6c.m47909a(getCampaignData(), campaignDefinition.getCampaignData()) && s6c.m47909a(getCampaignRunFrequencyUnit(), campaignDefinition.getCampaignRunFrequencyUnit()) && s6c.m47909a(getCampaignRunFrequencyValue(), campaignDefinition.getCampaignRunFrequencyValue()) && s6c.m47909a(getStartDateOfRun(), campaignDefinition.getStartDateOfRun()) && s6c.m47909a(getEndDateOfRun(), campaignDefinition.getEndDateOfRun()) && s6c.m47909a(getDurationOfRunInDays(), campaignDefinition.getDurationOfRunInDays()) && s6c.m47909a(getDaysToSend(), campaignDefinition.getDaysToSend()) && s6c.m47909a(getTimeSlotToSend(), campaignDefinition.getTimeSlotToSend()) && s6c.m47909a(getOwnerId(), campaignDefinition.getOwnerId()) && s6c.m47909a(getPrimaryTeamId(), campaignDefinition.getPrimaryTeamId()) && s6c.m47909a(getStatus(), campaignDefinition.getStatus()) && s6c.m47909a(getSystemPauseReason(), campaignDefinition.getSystemPauseReason()) && s6c.m47909a(getAssociatedEntityListId(), campaignDefinition.getAssociatedEntityListId()) && s6c.m47909a(getIncludeHistoricalMemberships(), campaignDefinition.getIncludeHistoricalMemberships()) && s6c.m47909a(getAllowMultiple(), campaignDefinition.getAllowMultiple()) && s6c.m47909a(getMessageCreated(), campaignDefinition.getMessageCreated()) && s6c.m47909a(getSentCount(), campaignDefinition.getSentCount()) && s6c.m47909a(getDeliveredCount(), campaignDefinition.getDeliveredCount()) && s6c.m47909a(getReadCount(), campaignDefinition.getReadCount()) && s6c.m47909a(getRepliedCount(), campaignDefinition.getRepliedCount()) && s6c.m47909a(getFailedCount(), campaignDefinition.getFailedCount()) && s6c.m47909a(getTags(), campaignDefinition.getTags()) && s6c.m47909a(getLeadLimit(), campaignDefinition.getLeadLimit()) && s6c.m47909a(getCreatedAt(), campaignDefinition.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), campaignDefinition.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    public String getAssociatedEntityListId() {
        return this.associatedEntityListId;
    }

    public EntityList getAssociatedList() {
        return this.associatedList;
    }

    public String getCampaignCategory() {
        return this.campaignCategory;
    }

    public String getCampaignChannelIdentifier() {
        return this.campaignChannelIdentifier;
    }

    public String getCampaignData() {
        return this.campaignData;
    }

    public User getCampaignOwner() {
        return this.campaignOwner;
    }

    public CampaignRunFrequencyUnit getCampaignRunFrequencyUnit() {
        return this.campaignRunFrequencyUnit;
    }

    public Integer getCampaignRunFrequencyValue() {
        return this.campaignRunFrequencyValue;
    }

    public String getCampaignSubCategory() {
        return this.campaignSubCategory;
    }

    public CampaignType getCampaignType() {
        return this.campaignType;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public List<String> getDaysToSend() {
        return this.daysToSend;
    }

    public Integer getDeliveredCount() {
        return this.deliveredCount;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getDurationOfRunInDays() {
        return this.durationOfRunInDays;
    }

    public Temporal.DateTime getEndDateOfRun() {
        return this.endDateOfRun;
    }

    public Integer getFailedCount() {
        return this.failedCount;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIncludeHistoricalMemberships() {
        return this.includeHistoricalMemberships;
    }

    public Integer getLeadLimit() {
        return this.leadLimit;
    }

    public Integer getMessageCreated() {
        return this.messageCreated;
    }

    public String getName() {
        return this.name;
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

    public Temporal.DateTime getStartDateOfRun() {
        return this.startDateOfRun;
    }

    public CampaignStatus getStatus() {
        return this.status;
    }

    public String getSystemPauseReason() {
        return this.systemPauseReason;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public List<TimeSlotToSend> getTimeSlotToSend() {
        return this.timeSlotToSend;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getDescription() + getCampaignCategory() + getCampaignSubCategory() + getCampaignType() + getCampaignChannelIdentifier() + getCampaignData() + getCampaignRunFrequencyUnit() + getCampaignRunFrequencyValue() + getStartDateOfRun() + getEndDateOfRun() + getDurationOfRunInDays() + getDaysToSend() + getTimeSlotToSend() + getOwnerId() + getPrimaryTeamId() + getStatus() + getSystemPauseReason() + getAssociatedEntityListId() + getIncludeHistoricalMemberships() + getAllowMultiple() + getMessageCreated() + getSentCount() + getDeliveredCount() + getReadCount() + getRepliedCount() + getFailedCount() + getTags() + getLeadLimit() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CampaignDefinition {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("campaignCategory=" + String.valueOf(getCampaignCategory()) + ", ");
        sb.append("campaignSubCategory=" + String.valueOf(getCampaignSubCategory()) + ", ");
        sb.append("campaignType=" + String.valueOf(getCampaignType()) + ", ");
        sb.append("campaignChannelIdentifier=" + String.valueOf(getCampaignChannelIdentifier()) + ", ");
        sb.append("campaignData=" + String.valueOf(getCampaignData()) + ", ");
        sb.append("campaignRunFrequencyUnit=" + String.valueOf(getCampaignRunFrequencyUnit()) + ", ");
        sb.append("campaignRunFrequencyValue=" + String.valueOf(getCampaignRunFrequencyValue()) + ", ");
        sb.append("startDateOfRun=" + String.valueOf(getStartDateOfRun()) + ", ");
        sb.append("endDateOfRun=" + String.valueOf(getEndDateOfRun()) + ", ");
        sb.append("durationOfRunInDays=" + String.valueOf(getDurationOfRunInDays()) + ", ");
        sb.append("daysToSend=" + String.valueOf(getDaysToSend()) + ", ");
        sb.append("timeSlotToSend=" + String.valueOf(getTimeSlotToSend()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("status=" + String.valueOf(getStatus()) + ", ");
        sb.append("systemPauseReason=" + String.valueOf(getSystemPauseReason()) + ", ");
        sb.append("associatedEntityListId=" + String.valueOf(getAssociatedEntityListId()) + ", ");
        sb.append("includeHistoricalMemberships=" + String.valueOf(getIncludeHistoricalMemberships()) + ", ");
        sb.append("allowMultiple=" + String.valueOf(getAllowMultiple()) + ", ");
        sb.append("messageCreated=" + String.valueOf(getMessageCreated()) + ", ");
        sb.append("sentCount=" + String.valueOf(getSentCount()) + ", ");
        sb.append("deliveredCount=" + String.valueOf(getDeliveredCount()) + ", ");
        sb.append("readCount=" + String.valueOf(getReadCount()) + ", ");
        sb.append("repliedCount=" + String.valueOf(getRepliedCount()) + ", ");
        sb.append("failedCount=" + String.valueOf(getFailedCount()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("leadLimit=" + String.valueOf(getLeadLimit()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private CampaignDefinition(String str, String str2, String str3, String str4, String str5, String str6, CampaignType campaignType, String str7, String str8, CampaignRunFrequencyUnit campaignRunFrequencyUnit, Integer num, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Integer num2, List<String> list, List<TimeSlotToSend> list2, String str9, String str10, CampaignStatus campaignStatus, String str11, String str12, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List<String> list3, Integer num9, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.campaignOwner = null;
        this.primaryTeam = null;
        this.associatedList = null;
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.description = str4;
        this.campaignCategory = str5;
        this.campaignSubCategory = str6;
        this.campaignType = campaignType;
        this.campaignChannelIdentifier = str7;
        this.campaignData = str8;
        this.campaignRunFrequencyUnit = campaignRunFrequencyUnit;
        this.campaignRunFrequencyValue = num;
        this.startDateOfRun = dateTime;
        this.endDateOfRun = dateTime2;
        this.durationOfRunInDays = num2;
        this.daysToSend = list;
        this.timeSlotToSend = list2;
        this.ownerId = str9;
        this.primaryTeamId = str10;
        this.status = campaignStatus;
        this.systemPauseReason = str11;
        this.associatedEntityListId = str12;
        this.includeHistoricalMemberships = bool;
        this.allowMultiple = bool2;
        this.messageCreated = num3;
        this.sentCount = num4;
        this.deliveredCount = num5;
        this.readCount = num6;
        this.repliedCount = num7;
        this.failedCount = num8;
        this.tags = list3;
        this.leadLimit = num9;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
