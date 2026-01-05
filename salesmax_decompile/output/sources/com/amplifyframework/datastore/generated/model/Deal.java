package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM)}, pluralName = "Deals")
/* loaded from: classes5.dex */
public final class Deal implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "Float")
    private final Double amount;

    @ModelField(targetType = "DealAssociation")
    @HasMany(associatedWith = "deal", type = DealAssociation.class)
    private final List<DealAssociation> associations;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "ID")
    private final String createdByUser;

    @ModelField(targetType = "String")
    private final String currency;

    @ModelField(targetType = "AWSJSON")
    private final String customDealData;

    @ModelField(targetType = "String")
    private final String dealLostReason;

    @ModelField(targetType = "DealOutcome")
    private final DealOutcome dealOutcome;

    @ModelField(targetType = "String")
    private final String dealStage;

    @ModelField(targetType = "DealStageCustomValues")
    private final List<DealStageCustomValues> dealStageCustomValues;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime dealStageUpdatedAt;

    @ModelField(targetType = "DealState")
    private final DealState dealState;

    @ModelField(targetType = "String")
    private final String description;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "String")
    private final String lastActivity;

    @ModelField(targetType = "ID")
    private final String lastUpdatedByUser;

    @ModelField(targetType = "String")
    private final String name;

    @ModelField(targetType = "AWSJSON")
    private final String openTaskDetail;

    @ModelField(targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "ID")
    private final String primaryTeamId;

    @ModelField(targetType = "AWSJSON")
    private final List<String> recentEngagements;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime recentEngagementsUpdatedAt;

    @ModelField(targetType = "String")
    private final List<String> tags;

    @ModelField(targetType = "AWSJSON")
    private final List<String> transitionSummary;

    @ModelField(targetType = "DealTransition")
    @HasMany(associatedWith = "deal", type = DealTransition.class)
    private final List<DealTransition> transitions;

    @ModelField(targetType = "ProductServiceUnit")
    private final List<ProductServiceUnit> units;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("Deal", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("Deal", "accountId");
    public static final QueryField NAME = QueryField.field("Deal", "name");
    public static final QueryField DESCRIPTION = QueryField.field("Deal", MediaTrack.ROLE_DESCRIPTION);
    public static final QueryField DEAL_STAGE = QueryField.field("Deal", "dealStage");
    public static final QueryField DEAL_STAGE_UPDATED_AT = QueryField.field("Deal", "dealStageUpdatedAt");
    public static final QueryField DEAL_STATE = QueryField.field("Deal", "dealState");
    public static final QueryField DEAL_OUTCOME = QueryField.field("Deal", "dealOutcome");
    public static final QueryField DEAL_LOST_REASON = QueryField.field("Deal", "dealLostReason");
    public static final QueryField AMOUNT = QueryField.field("Deal", "amount");
    public static final QueryField CURRENCY = QueryField.field("Deal", FirebaseAnalytics.Param.CURRENCY);
    public static final QueryField UNITS = QueryField.field("Deal", "units");
    public static final QueryField CREATED_BY_USER = QueryField.field("Deal", "createdByUser");
    public static final QueryField LAST_UPDATED_BY_USER = QueryField.field("Deal", "lastUpdatedByUser");
    public static final QueryField OWNER_ID = QueryField.field("Deal", "ownerId");
    public static final QueryField PRIMARY_TEAM_ID = QueryField.field("Deal", "primaryTeamId");
    public static final QueryField OPEN_TASK_DETAIL = QueryField.field("Deal", "openTaskDetail");
    public static final QueryField TRANSITION_SUMMARY = QueryField.field("Deal", "transitionSummary");
    public static final QueryField RECENT_ENGAGEMENTS = QueryField.field("Deal", "recentEngagements");
    public static final QueryField RECENT_ENGAGEMENTS_UPDATED_AT = QueryField.field("Deal", "recentEngagementsUpdatedAt");
    public static final QueryField LAST_ACTIVITY = QueryField.field("Deal", "lastActivity");
    public static final QueryField TAGS = QueryField.field("Deal", "tags");
    public static final QueryField DEAL_STAGE_CUSTOM_VALUES = QueryField.field("Deal", "dealStageCustomValues");
    public static final QueryField CUSTOM_DEAL_DATA = QueryField.field("Deal", "customDealData");
    public static final QueryField CREATED_AT = QueryField.field("Deal", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("Deal", "updatedAt");

    public interface AccountIdStep {
        BuildStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep amount(Double d);

        Deal build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep createdByUser(String str);

        BuildStep currency(String str);

        BuildStep customDealData(String str);

        BuildStep dealLostReason(String str);

        BuildStep dealOutcome(DealOutcome dealOutcome);

        BuildStep dealStage(String str);

        BuildStep dealStageCustomValues(List<DealStageCustomValues> list);

        BuildStep dealStageUpdatedAt(Temporal.DateTime dateTime);

        BuildStep dealState(DealState dealState);

        BuildStep description(String str);

        BuildStep id(String str);

        BuildStep lastActivity(String str);

        BuildStep lastUpdatedByUser(String str);

        BuildStep name(String str);

        BuildStep openTaskDetail(String str);

        BuildStep ownerId(String str);

        BuildStep primaryTeamId(String str);

        BuildStep recentEngagements(List<String> list);

        BuildStep recentEngagementsUpdatedAt(Temporal.DateTime dateTime);

        BuildStep tags(List<String> list);

        BuildStep transitionSummary(List<String> list);

        BuildStep units(List<ProductServiceUnit> list);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, BuildStep {
        private String accountId;
        private Double amount;
        private Temporal.DateTime createdAt;
        private String createdByUser;
        private String currency;
        private String customDealData;
        private String dealLostReason;
        private DealOutcome dealOutcome;
        private String dealStage;
        private List<DealStageCustomValues> dealStageCustomValues;
        private Temporal.DateTime dealStageUpdatedAt;
        private DealState dealState;
        private String description;
        private String id;
        private String lastActivity;
        private String lastUpdatedByUser;
        private String name;
        private String openTaskDetail;
        private String ownerId;
        private String primaryTeamId;
        private List<String> recentEngagements;
        private Temporal.DateTime recentEngagementsUpdatedAt;
        private List<String> tags;
        private List<String> transitionSummary;
        private List<ProductServiceUnit> units;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.Deal.AccountIdStep
        public BuildStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep amount(Double d) {
            this.amount = d;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public Deal build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new Deal(string, this.accountId, this.name, this.description, this.dealStage, this.dealStageUpdatedAt, this.dealState, this.dealOutcome, this.dealLostReason, this.amount, this.currency, this.units, this.createdByUser, this.lastUpdatedByUser, this.ownerId, this.primaryTeamId, this.openTaskDetail, this.transitionSummary, this.recentEngagements, this.recentEngagementsUpdatedAt, this.lastActivity, this.tags, this.dealStageCustomValues, this.customDealData, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep createdByUser(String str) {
            this.createdByUser = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep currency(String str) {
            this.currency = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep customDealData(String str) {
            this.customDealData = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep dealLostReason(String str) {
            this.dealLostReason = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep dealOutcome(DealOutcome dealOutcome) {
            this.dealOutcome = dealOutcome;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep dealStage(String str) {
            this.dealStage = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep dealStageCustomValues(List<DealStageCustomValues> list) {
            this.dealStageCustomValues = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep dealStageUpdatedAt(Temporal.DateTime dateTime) {
            this.dealStageUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep dealState(DealState dealState) {
            this.dealState = dealState;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep description(String str) {
            this.description = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep lastActivity(String str) {
            this.lastActivity = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep lastUpdatedByUser(String str) {
            this.lastUpdatedByUser = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep openTaskDetail(String str) {
            this.openTaskDetail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep primaryTeamId(String str) {
            this.primaryTeamId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep recentEngagements(List<String> list) {
            this.recentEngagements = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep recentEngagementsUpdatedAt(Temporal.DateTime dateTime) {
            this.recentEngagementsUpdatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep transitionSummary(List<String> list) {
            this.transitionSummary = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep units(List<ProductServiceUnit> list) {
            this.units = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, Temporal.DateTime dateTime, DealState dealState, DealOutcome dealOutcome, String str6, Double d, String str7, List<ProductServiceUnit> list, String str8, String str9, String str10, String str11, String str12, List<String> list2, List<String> list3, Temporal.DateTime dateTime2, String str13, List<String> list4, List<DealStageCustomValues> list5, String str14, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            this.id = str;
            this.accountId = str2;
            this.name = str3;
            this.description = str4;
            this.dealStage = str5;
            this.dealStageUpdatedAt = dateTime;
            this.dealState = dealState;
            this.dealOutcome = dealOutcome;
            this.dealLostReason = str6;
            this.amount = d;
            this.currency = str7;
            this.units = list;
            this.createdByUser = str8;
            this.lastUpdatedByUser = str9;
            this.ownerId = str10;
            this.primaryTeamId = str11;
            this.openTaskDetail = str12;
            this.transitionSummary = list2;
            this.recentEngagements = list3;
            this.recentEngagementsUpdatedAt = dateTime2;
            this.lastActivity = str13;
            this.tags = list4;
            this.dealStageCustomValues = list5;
            this.customDealData = str14;
            this.createdAt = dateTime3;
            this.updatedAt = dateTime4;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public /* bridge */ /* synthetic */ BuildStep dealStageCustomValues(List list) {
            return dealStageCustomValues((List<DealStageCustomValues>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public /* bridge */ /* synthetic */ BuildStep recentEngagements(List list) {
            return recentEngagements((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public /* bridge */ /* synthetic */ BuildStep tags(List list) {
            return tags((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public /* bridge */ /* synthetic */ BuildStep transitionSummary(List list) {
            return transitionSummary((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public /* bridge */ /* synthetic */ BuildStep units(List list) {
            return units((List<ProductServiceUnit>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, Temporal.DateTime dateTime, DealState dealState, DealOutcome dealOutcome, String str6, Double d, String str7, List<ProductServiceUnit> list, String str8, String str9, String str10, String str11, String str12, List<String> list2, List<String> list3, Temporal.DateTime dateTime2, String str13, List<String> list4, List<DealStageCustomValues> list5, String str14, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
            super(str, str2, str3, str4, str5, dateTime, dealState, dealOutcome, str6, d, str7, list, str8, str9, str10, str11, str12, list2, list3, dateTime2, str13, list4, list5, str14, dateTime3, dateTime4);
            Objects.requireNonNull(str2);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder amount(Double d) {
            return (CopyOfBuilder) super.amount(d);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder createdByUser(String str) {
            return (CopyOfBuilder) super.createdByUser(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder currency(String str) {
            return (CopyOfBuilder) super.currency(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder customDealData(String str) {
            return (CopyOfBuilder) super.customDealData(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder dealLostReason(String str) {
            return (CopyOfBuilder) super.dealLostReason(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder dealOutcome(DealOutcome dealOutcome) {
            return (CopyOfBuilder) super.dealOutcome(dealOutcome);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder dealStage(String str) {
            return (CopyOfBuilder) super.dealStage(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder dealStageCustomValues(List<DealStageCustomValues> list) {
            return (CopyOfBuilder) super.dealStageCustomValues(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder dealStageUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.dealStageUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder dealState(DealState dealState) {
            return (CopyOfBuilder) super.dealState(dealState);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder description(String str) {
            return (CopyOfBuilder) super.description(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder lastActivity(String str) {
            return (CopyOfBuilder) super.lastActivity(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder lastUpdatedByUser(String str) {
            return (CopyOfBuilder) super.lastUpdatedByUser(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder openTaskDetail(String str) {
            return (CopyOfBuilder) super.openTaskDetail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder primaryTeamId(String str) {
            return (CopyOfBuilder) super.primaryTeamId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder recentEngagements(List<String> list) {
            return (CopyOfBuilder) super.recentEngagements(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder recentEngagementsUpdatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.recentEngagementsUpdatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder tags(List<String> list) {
            return (CopyOfBuilder) super.tags(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder transitionSummary(List<String> list) {
            return (CopyOfBuilder) super.transitionSummary(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder units(List<ProductServiceUnit> list) {
            return (CopyOfBuilder) super.units(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.Deal.Builder, com.amplifyframework.datastore.generated.model.Deal.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static Deal justId(String str) {
        return new Deal(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.name, this.description, this.dealStage, this.dealStageUpdatedAt, this.dealState, this.dealOutcome, this.dealLostReason, this.amount, this.currency, this.units, this.createdByUser, this.lastUpdatedByUser, this.ownerId, this.primaryTeamId, this.openTaskDetail, this.transitionSummary, this.recentEngagements, this.recentEngagementsUpdatedAt, this.lastActivity, this.tags, this.dealStageCustomValues, this.customDealData, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Deal.class != obj.getClass()) {
            return false;
        }
        Deal deal = (Deal) obj;
        return s6c.m47909a(getId(), deal.getId()) && s6c.m47909a(getAccountId(), deal.getAccountId()) && s6c.m47909a(getName(), deal.getName()) && s6c.m47909a(getDescription(), deal.getDescription()) && s6c.m47909a(getDealStage(), deal.getDealStage()) && s6c.m47909a(getDealStageUpdatedAt(), deal.getDealStageUpdatedAt()) && s6c.m47909a(getDealState(), deal.getDealState()) && s6c.m47909a(getDealOutcome(), deal.getDealOutcome()) && s6c.m47909a(getDealLostReason(), deal.getDealLostReason()) && s6c.m47909a(getAmount(), deal.getAmount()) && s6c.m47909a(getCurrency(), deal.getCurrency()) && s6c.m47909a(getUnits(), deal.getUnits()) && s6c.m47909a(getCreatedByUser(), deal.getCreatedByUser()) && s6c.m47909a(getLastUpdatedByUser(), deal.getLastUpdatedByUser()) && s6c.m47909a(getOwnerId(), deal.getOwnerId()) && s6c.m47909a(getPrimaryTeamId(), deal.getPrimaryTeamId()) && s6c.m47909a(getOpenTaskDetail(), deal.getOpenTaskDetail()) && s6c.m47909a(getTransitionSummary(), deal.getTransitionSummary()) && s6c.m47909a(getRecentEngagements(), deal.getRecentEngagements()) && s6c.m47909a(getRecentEngagementsUpdatedAt(), deal.getRecentEngagementsUpdatedAt()) && s6c.m47909a(getLastActivity(), deal.getLastActivity()) && s6c.m47909a(getTags(), deal.getTags()) && s6c.m47909a(getDealStageCustomValues(), deal.getDealStageCustomValues()) && s6c.m47909a(getCustomDealData(), deal.getCustomDealData()) && s6c.m47909a(getCreatedAt(), deal.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), deal.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Double getAmount() {
        return this.amount;
    }

    public List<DealAssociation> getAssociations() {
        return this.associations;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedByUser() {
        return this.createdByUser;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCustomDealData() {
        return this.customDealData;
    }

    public String getDealLostReason() {
        return this.dealLostReason;
    }

    public DealOutcome getDealOutcome() {
        return this.dealOutcome;
    }

    public String getDealStage() {
        return this.dealStage;
    }

    public List<DealStageCustomValues> getDealStageCustomValues() {
        return this.dealStageCustomValues;
    }

    public Temporal.DateTime getDealStageUpdatedAt() {
        return this.dealStageUpdatedAt;
    }

    public DealState getDealState() {
        return this.dealState;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getLastActivity() {
        return this.lastActivity;
    }

    public String getLastUpdatedByUser() {
        return this.lastUpdatedByUser;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenTaskDetail() {
        return this.openTaskDetail;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getPrimaryTeamId() {
        return this.primaryTeamId;
    }

    public List<String> getRecentEngagements() {
        return this.recentEngagements;
    }

    public Temporal.DateTime getRecentEngagementsUpdatedAt() {
        return this.recentEngagementsUpdatedAt;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public List<String> getTransitionSummary() {
        return this.transitionSummary;
    }

    public List<DealTransition> getTransitions() {
        return this.transitions;
    }

    public List<ProductServiceUnit> getUnits() {
        return this.units;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getName() + getDescription() + getDealStage() + getDealStageUpdatedAt() + getDealState() + getDealOutcome() + getDealLostReason() + getAmount() + getCurrency() + getUnits() + getCreatedByUser() + getLastUpdatedByUser() + getOwnerId() + getPrimaryTeamId() + getOpenTaskDetail() + getTransitionSummary() + getRecentEngagements() + getRecentEngagementsUpdatedAt() + getLastActivity() + getTags() + getDealStageCustomValues() + getCustomDealData() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deal {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("description=" + String.valueOf(getDescription()) + ", ");
        sb.append("dealStage=" + String.valueOf(getDealStage()) + ", ");
        sb.append("dealStageUpdatedAt=" + String.valueOf(getDealStageUpdatedAt()) + ", ");
        sb.append("dealState=" + String.valueOf(getDealState()) + ", ");
        sb.append("dealOutcome=" + String.valueOf(getDealOutcome()) + ", ");
        sb.append("dealLostReason=" + String.valueOf(getDealLostReason()) + ", ");
        sb.append("amount=" + String.valueOf(getAmount()) + ", ");
        sb.append("currency=" + String.valueOf(getCurrency()) + ", ");
        sb.append("units=" + String.valueOf(getUnits()) + ", ");
        sb.append("createdByUser=" + String.valueOf(getCreatedByUser()) + ", ");
        sb.append("lastUpdatedByUser=" + String.valueOf(getLastUpdatedByUser()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("primaryTeamId=" + String.valueOf(getPrimaryTeamId()) + ", ");
        sb.append("openTaskDetail=" + String.valueOf(getOpenTaskDetail()) + ", ");
        sb.append("transitionSummary=" + String.valueOf(getTransitionSummary()) + ", ");
        sb.append("recentEngagements=" + String.valueOf(getRecentEngagements()) + ", ");
        sb.append("recentEngagementsUpdatedAt=" + String.valueOf(getRecentEngagementsUpdatedAt()) + ", ");
        sb.append("lastActivity=" + String.valueOf(getLastActivity()) + ", ");
        sb.append("tags=" + String.valueOf(getTags()) + ", ");
        sb.append("dealStageCustomValues=" + String.valueOf(getDealStageCustomValues()) + ", ");
        sb.append("customDealData=" + String.valueOf(getCustomDealData()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private Deal(String str, String str2, String str3, String str4, String str5, Temporal.DateTime dateTime, DealState dealState, DealOutcome dealOutcome, String str6, Double d, String str7, List<ProductServiceUnit> list, String str8, String str9, String str10, String str11, String str12, List<String> list2, List<String> list3, Temporal.DateTime dateTime2, String str13, List<String> list4, List<DealStageCustomValues> list5, String str14, Temporal.DateTime dateTime3, Temporal.DateTime dateTime4) {
        this.associations = null;
        this.transitions = null;
        this.id = str;
        this.accountId = str2;
        this.name = str3;
        this.description = str4;
        this.dealStage = str5;
        this.dealStageUpdatedAt = dateTime;
        this.dealState = dealState;
        this.dealOutcome = dealOutcome;
        this.dealLostReason = str6;
        this.amount = d;
        this.currency = str7;
        this.units = list;
        this.createdByUser = str8;
        this.lastUpdatedByUser = str9;
        this.ownerId = str10;
        this.primaryTeamId = str11;
        this.openTaskDetail = str12;
        this.transitionSummary = list2;
        this.recentEngagements = list3;
        this.recentEngagementsUpdatedAt = dateTime2;
        this.lastActivity = str13;
        this.tags = list4;
        this.dealStageCustomValues = list5;
        this.customDealData = str14;
        this.createdAt = dateTime3;
        this.updatedAt = dateTime4;
    }
}
