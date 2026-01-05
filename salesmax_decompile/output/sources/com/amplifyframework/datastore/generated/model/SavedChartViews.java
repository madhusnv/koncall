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
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "SavedChartViews")
/* loaded from: classes5.dex */
public final class SavedChartViews implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "String")
    private final String aggregateOnField;

    @ModelField(targetType = "String")
    private final String aggregationType;

    @ModelField(targetType = "AWSJSON")
    private final String appliedFilter;

    @ModelField(isRequired = true, targetType = "String")
    private final String chartTitle;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSJSON")
    private final String dateBuckets;

    @ModelField(targetType = "String")
    private final String defaultPivotOnAttribute;

    @ModelField(targetType = "AWSJSON")
    private final String displayInformation;

    @ModelField(targetType = "AWSJSON")
    private final String filterModel;

    @ModelField(targetType = "String")
    private final List<String> forAuthorizations;

    @ModelField(targetType = "String")
    private final List<String> forTeamIds;

    @ModelField(targetType = "String")
    private final List<String> forUserIds;

    @ModelField(targetType = "String")
    private final String gridType;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean includeAll;

    @ModelField(targetType = "Boolean")
    private final Boolean isSystemCreated;

    @ModelField(targetType = "String")
    private final String objectTypeName;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "PositionInput")
    private final PositionInput position;

    @ModelField(targetType = "String")
    private final String reportCategory;

    @ModelField(targetType = "ID")
    private final String scopeId;

    @ModelField(targetType = "ScopeLevel")
    private final ScopeLevel scopeLevel;

    @ModelField(targetType = "String")
    private final String targetComponent;

    @ModelField(targetType = "String")
    private final String timeFilterAttributeName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;
    public static final QueryField ID = QueryField.field("SavedChartViews", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("SavedChartViews", "accountId");
    public static final QueryField OWNER_ID = QueryField.field("SavedChartViews", "ownerId");
    public static final QueryField TARGET_COMPONENT = QueryField.field("SavedChartViews", "targetComponent");
    public static final QueryField REPORT_CATEGORY = QueryField.field("SavedChartViews", "reportCategory");
    public static final QueryField CHART_TITLE = QueryField.field("SavedChartViews", "chartTitle");
    public static final QueryField IS_SYSTEM_CREATED = QueryField.field("SavedChartViews", "isSystemCreated");
    public static final QueryField INCLUDE_ALL = QueryField.field("SavedChartViews", "includeAll");
    public static final QueryField GRID_TYPE = QueryField.field("SavedChartViews", "gridType");
    public static final QueryField AGGREGATE_ON_FIELD = QueryField.field("SavedChartViews", "aggregateOnField");
    public static final QueryField AGGREGATION_TYPE = QueryField.field("SavedChartViews", "aggregationType");
    public static final QueryField DEFAULT_PIVOT_ON_ATTRIBUTE = QueryField.field("SavedChartViews", "defaultPivotOnAttribute");
    public static final QueryField TIME_FILTER_ATTRIBUTE_NAME = QueryField.field("SavedChartViews", "timeFilterAttributeName");
    public static final QueryField OBJECT_TYPE_NAME = QueryField.field("SavedChartViews", "objectTypeName");
    public static final QueryField APPLIED_FILTER = QueryField.field("SavedChartViews", "appliedFilter");
    public static final QueryField FILTER_MODEL = QueryField.field("SavedChartViews", "filterModel");
    public static final QueryField DATE_BUCKETS = QueryField.field("SavedChartViews", "dateBuckets");
    public static final QueryField POSITION = QueryField.field("SavedChartViews", "position");
    public static final QueryField SCOPE_LEVEL = QueryField.field("SavedChartViews", "scopeLevel");
    public static final QueryField SCOPE_ID = QueryField.field("SavedChartViews", "scopeId");
    public static final QueryField FOR_USER_IDS = QueryField.field("SavedChartViews", "forUserIds");
    public static final QueryField FOR_TEAM_IDS = QueryField.field("SavedChartViews", "forTeamIds");
    public static final QueryField FOR_AUTHORIZATIONS = QueryField.field("SavedChartViews", "forAuthorizations");
    public static final QueryField DISPLAY_INFORMATION = QueryField.field("SavedChartViews", "displayInformation");
    public static final QueryField CREATED_AT = QueryField.field("SavedChartViews", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("SavedChartViews", "updatedAt");

    public interface AccountIdStep {
        OwnerIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep aggregateOnField(String str);

        BuildStep aggregationType(String str);

        BuildStep appliedFilter(String str);

        SavedChartViews build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep dateBuckets(String str);

        BuildStep defaultPivotOnAttribute(String str);

        BuildStep displayInformation(String str);

        BuildStep filterModel(String str);

        BuildStep forAuthorizations(List<String> list);

        BuildStep forTeamIds(List<String> list);

        BuildStep forUserIds(List<String> list);

        BuildStep gridType(String str);

        BuildStep id(String str);

        BuildStep includeAll(Boolean bool);

        BuildStep isSystemCreated(Boolean bool);

        BuildStep objectTypeName(String str);

        BuildStep position(PositionInput positionInput);

        BuildStep reportCategory(String str);

        BuildStep scopeId(String str);

        BuildStep scopeLevel(ScopeLevel scopeLevel);

        BuildStep targetComponent(String str);

        BuildStep timeFilterAttributeName(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, OwnerIdStep, ChartTitleStep, BuildStep {
        private String accountId;
        private String aggregateOnField;
        private String aggregationType;
        private String appliedFilter;
        private String chartTitle;
        private Temporal.DateTime createdAt;
        private String dateBuckets;
        private String defaultPivotOnAttribute;
        private String displayInformation;
        private String filterModel;
        private List<String> forAuthorizations;
        private List<String> forTeamIds;
        private List<String> forUserIds;
        private String gridType;
        private String id;
        private Boolean includeAll;
        private Boolean isSystemCreated;
        private String objectTypeName;
        private String ownerId;
        private PositionInput position;
        private String reportCategory;
        private String scopeId;
        private ScopeLevel scopeLevel;
        private String targetComponent;
        private String timeFilterAttributeName;
        private Temporal.DateTime updatedAt;

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.AccountIdStep
        public OwnerIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep aggregateOnField(String str) {
            this.aggregateOnField = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep aggregationType(String str) {
            this.aggregationType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep appliedFilter(String str) {
            this.appliedFilter = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public SavedChartViews build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new SavedChartViews(string, this.accountId, this.ownerId, this.targetComponent, this.reportCategory, this.chartTitle, this.isSystemCreated, this.includeAll, this.gridType, this.aggregateOnField, this.aggregationType, this.defaultPivotOnAttribute, this.timeFilterAttributeName, this.objectTypeName, this.appliedFilter, this.filterModel, this.dateBuckets, this.position, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.displayInformation, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.ChartTitleStep
        public BuildStep chartTitle(String str) {
            Objects.requireNonNull(str);
            this.chartTitle = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep dateBuckets(String str) {
            this.dateBuckets = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep defaultPivotOnAttribute(String str) {
            this.defaultPivotOnAttribute = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep displayInformation(String str) {
            this.displayInformation = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep filterModel(String str) {
            this.filterModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep forAuthorizations(List<String> list) {
            this.forAuthorizations = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep forTeamIds(List<String> list) {
            this.forTeamIds = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep forUserIds(List<String> list) {
            this.forUserIds = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep gridType(String str) {
            this.gridType = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep includeAll(Boolean bool) {
            this.includeAll = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep isSystemCreated(Boolean bool) {
            this.isSystemCreated = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep objectTypeName(String str) {
            this.objectTypeName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.OwnerIdStep
        public ChartTitleStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep position(PositionInput positionInput) {
            this.position = positionInput;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep reportCategory(String str) {
            this.reportCategory = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep scopeId(String str) {
            this.scopeId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep scopeLevel(ScopeLevel scopeLevel) {
            this.scopeLevel = scopeLevel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep targetComponent(String str) {
            this.targetComponent = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep timeFilterAttributeName(String str) {
            this.timeFilterAttributeName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, PositionInput positionInput, ScopeLevel scopeLevel, String str16, List<String> list, List<String> list2, List<String> list3, String str17, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.accountId = str2;
            this.ownerId = str3;
            this.targetComponent = str4;
            this.reportCategory = str5;
            this.chartTitle = str6;
            this.isSystemCreated = bool;
            this.includeAll = bool2;
            this.gridType = str7;
            this.aggregateOnField = str8;
            this.aggregationType = str9;
            this.defaultPivotOnAttribute = str10;
            this.timeFilterAttributeName = str11;
            this.objectTypeName = str12;
            this.appliedFilter = str13;
            this.filterModel = str14;
            this.dateBuckets = str15;
            this.position = positionInput;
            this.scopeLevel = scopeLevel;
            this.scopeId = str16;
            this.forUserIds = list;
            this.forTeamIds = list2;
            this.forAuthorizations = list3;
            this.displayInformation = str17;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public interface ChartTitleStep {
        BuildStep chartTitle(String str);
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public /* bridge */ /* synthetic */ BuildStep forAuthorizations(List list) {
            return forAuthorizations((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public /* bridge */ /* synthetic */ BuildStep forTeamIds(List list) {
            return forTeamIds((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public /* bridge */ /* synthetic */ BuildStep forUserIds(List list) {
            return forUserIds((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, PositionInput positionInput, ScopeLevel scopeLevel, String str16, List<String> list, List<String> list2, List<String> list3, String str17, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, str2, str3, str4, str5, str6, bool, bool2, str7, str8, str9, str10, str11, str12, str13, str14, str15, positionInput, scopeLevel, str16, list, list2, list3, str17, dateTime, dateTime2);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str6);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder aggregateOnField(String str) {
            return (CopyOfBuilder) super.aggregateOnField(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder aggregationType(String str) {
            return (CopyOfBuilder) super.aggregationType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder appliedFilter(String str) {
            return (CopyOfBuilder) super.appliedFilter(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.ChartTitleStep
        public CopyOfBuilder chartTitle(String str) {
            return (CopyOfBuilder) super.chartTitle(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder dateBuckets(String str) {
            return (CopyOfBuilder) super.dateBuckets(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder defaultPivotOnAttribute(String str) {
            return (CopyOfBuilder) super.defaultPivotOnAttribute(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder displayInformation(String str) {
            return (CopyOfBuilder) super.displayInformation(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder filterModel(String str) {
            return (CopyOfBuilder) super.filterModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder forAuthorizations(List<String> list) {
            return (CopyOfBuilder) super.forAuthorizations(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder forTeamIds(List<String> list) {
            return (CopyOfBuilder) super.forTeamIds(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder forUserIds(List<String> list) {
            return (CopyOfBuilder) super.forUserIds(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder gridType(String str) {
            return (CopyOfBuilder) super.gridType(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder includeAll(Boolean bool) {
            return (CopyOfBuilder) super.includeAll(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder isSystemCreated(Boolean bool) {
            return (CopyOfBuilder) super.isSystemCreated(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder objectTypeName(String str) {
            return (CopyOfBuilder) super.objectTypeName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder position(PositionInput positionInput) {
            return (CopyOfBuilder) super.position(positionInput);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder reportCategory(String str) {
            return (CopyOfBuilder) super.reportCategory(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder scopeId(String str) {
            return (CopyOfBuilder) super.scopeId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder scopeLevel(ScopeLevel scopeLevel) {
            return (CopyOfBuilder) super.scopeLevel(scopeLevel);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder targetComponent(String str) {
            return (CopyOfBuilder) super.targetComponent(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder timeFilterAttributeName(String str) {
            return (CopyOfBuilder) super.timeFilterAttributeName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedChartViews.Builder, com.amplifyframework.datastore.generated.model.SavedChartViews.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }
    }

    public interface OwnerIdStep {
        ChartTitleStep ownerId(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static SavedChartViews justId(String str) {
        return new SavedChartViews(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.ownerId, this.targetComponent, this.reportCategory, this.chartTitle, this.isSystemCreated, this.includeAll, this.gridType, this.aggregateOnField, this.aggregationType, this.defaultPivotOnAttribute, this.timeFilterAttributeName, this.objectTypeName, this.appliedFilter, this.filterModel, this.dateBuckets, this.position, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.displayInformation, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SavedChartViews.class != obj.getClass()) {
            return false;
        }
        SavedChartViews savedChartViews = (SavedChartViews) obj;
        return s6c.m47909a(getId(), savedChartViews.getId()) && s6c.m47909a(getAccountId(), savedChartViews.getAccountId()) && s6c.m47909a(getOwnerId(), savedChartViews.getOwnerId()) && s6c.m47909a(getTargetComponent(), savedChartViews.getTargetComponent()) && s6c.m47909a(getReportCategory(), savedChartViews.getReportCategory()) && s6c.m47909a(getChartTitle(), savedChartViews.getChartTitle()) && s6c.m47909a(getIsSystemCreated(), savedChartViews.getIsSystemCreated()) && s6c.m47909a(getIncludeAll(), savedChartViews.getIncludeAll()) && s6c.m47909a(getGridType(), savedChartViews.getGridType()) && s6c.m47909a(getAggregateOnField(), savedChartViews.getAggregateOnField()) && s6c.m47909a(getAggregationType(), savedChartViews.getAggregationType()) && s6c.m47909a(getDefaultPivotOnAttribute(), savedChartViews.getDefaultPivotOnAttribute()) && s6c.m47909a(getTimeFilterAttributeName(), savedChartViews.getTimeFilterAttributeName()) && s6c.m47909a(getObjectTypeName(), savedChartViews.getObjectTypeName()) && s6c.m47909a(getAppliedFilter(), savedChartViews.getAppliedFilter()) && s6c.m47909a(getFilterModel(), savedChartViews.getFilterModel()) && s6c.m47909a(getDateBuckets(), savedChartViews.getDateBuckets()) && s6c.m47909a(getPosition(), savedChartViews.getPosition()) && s6c.m47909a(getScopeLevel(), savedChartViews.getScopeLevel()) && s6c.m47909a(getScopeId(), savedChartViews.getScopeId()) && s6c.m47909a(getForUserIds(), savedChartViews.getForUserIds()) && s6c.m47909a(getForTeamIds(), savedChartViews.getForTeamIds()) && s6c.m47909a(getForAuthorizations(), savedChartViews.getForAuthorizations()) && s6c.m47909a(getDisplayInformation(), savedChartViews.getDisplayInformation()) && s6c.m47909a(getCreatedAt(), savedChartViews.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), savedChartViews.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAggregateOnField() {
        return this.aggregateOnField;
    }

    public String getAggregationType() {
        return this.aggregationType;
    }

    public String getAppliedFilter() {
        return this.appliedFilter;
    }

    public String getChartTitle() {
        return this.chartTitle;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDateBuckets() {
        return this.dateBuckets;
    }

    public String getDefaultPivotOnAttribute() {
        return this.defaultPivotOnAttribute;
    }

    public String getDisplayInformation() {
        return this.displayInformation;
    }

    public String getFilterModel() {
        return this.filterModel;
    }

    public List<String> getForAuthorizations() {
        return this.forAuthorizations;
    }

    public List<String> getForTeamIds() {
        return this.forTeamIds;
    }

    public List<String> getForUserIds() {
        return this.forUserIds;
    }

    public String getGridType() {
        return this.gridType;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIncludeAll() {
        return this.includeAll;
    }

    public Boolean getIsSystemCreated() {
        return this.isSystemCreated;
    }

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public PositionInput getPosition() {
        return this.position;
    }

    public String getReportCategory() {
        return this.reportCategory;
    }

    public String getScopeId() {
        return this.scopeId;
    }

    public ScopeLevel getScopeLevel() {
        return this.scopeLevel;
    }

    public String getTargetComponent() {
        return this.targetComponent;
    }

    public String getTimeFilterAttributeName() {
        return this.timeFilterAttributeName;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getOwnerId() + getTargetComponent() + getReportCategory() + getChartTitle() + getIsSystemCreated() + getIncludeAll() + getGridType() + getAggregateOnField() + getAggregationType() + getDefaultPivotOnAttribute() + getTimeFilterAttributeName() + getObjectTypeName() + getAppliedFilter() + getFilterModel() + getDateBuckets() + getPosition() + getScopeLevel() + getScopeId() + getForUserIds() + getForTeamIds() + getForAuthorizations() + getDisplayInformation() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SavedChartViews {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("targetComponent=" + String.valueOf(getTargetComponent()) + ", ");
        sb.append("reportCategory=" + String.valueOf(getReportCategory()) + ", ");
        sb.append("chartTitle=" + String.valueOf(getChartTitle()) + ", ");
        sb.append("isSystemCreated=" + String.valueOf(getIsSystemCreated()) + ", ");
        sb.append("includeAll=" + String.valueOf(getIncludeAll()) + ", ");
        sb.append("gridType=" + String.valueOf(getGridType()) + ", ");
        sb.append("aggregateOnField=" + String.valueOf(getAggregateOnField()) + ", ");
        sb.append("aggregationType=" + String.valueOf(getAggregationType()) + ", ");
        sb.append("defaultPivotOnAttribute=" + String.valueOf(getDefaultPivotOnAttribute()) + ", ");
        sb.append("timeFilterAttributeName=" + String.valueOf(getTimeFilterAttributeName()) + ", ");
        sb.append("objectTypeName=" + String.valueOf(getObjectTypeName()) + ", ");
        sb.append("appliedFilter=" + String.valueOf(getAppliedFilter()) + ", ");
        sb.append("filterModel=" + String.valueOf(getFilterModel()) + ", ");
        sb.append("dateBuckets=" + String.valueOf(getDateBuckets()) + ", ");
        sb.append("position=" + String.valueOf(getPosition()) + ", ");
        sb.append("scopeLevel=" + String.valueOf(getScopeLevel()) + ", ");
        sb.append("scopeId=" + String.valueOf(getScopeId()) + ", ");
        sb.append("forUserIds=" + String.valueOf(getForUserIds()) + ", ");
        sb.append("forTeamIds=" + String.valueOf(getForTeamIds()) + ", ");
        sb.append("forAuthorizations=" + String.valueOf(getForAuthorizations()) + ", ");
        sb.append("displayInformation=" + String.valueOf(getDisplayInformation()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private SavedChartViews(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, PositionInput positionInput, ScopeLevel scopeLevel, String str16, List<String> list, List<String> list2, List<String> list3, String str17, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.accountId = str2;
        this.ownerId = str3;
        this.targetComponent = str4;
        this.reportCategory = str5;
        this.chartTitle = str6;
        this.isSystemCreated = bool;
        this.includeAll = bool2;
        this.gridType = str7;
        this.aggregateOnField = str8;
        this.aggregationType = str9;
        this.defaultPivotOnAttribute = str10;
        this.timeFilterAttributeName = str11;
        this.objectTypeName = str12;
        this.appliedFilter = str13;
        this.filterModel = str14;
        this.dateBuckets = str15;
        this.position = positionInput;
        this.scopeLevel = scopeLevel;
        this.scopeId = str16;
        this.forUserIds = list;
        this.forTeamIds = list2;
        this.forAuthorizations = list3;
        this.displayInformation = str17;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
