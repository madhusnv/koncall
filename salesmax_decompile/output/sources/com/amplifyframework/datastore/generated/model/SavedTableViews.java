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
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"accountId", "ownerId", "tableName", "viewName"}, name = SQLiteCommandFactory.UNDEFINED)
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "SavedTableViews")
/* loaded from: classes5.dex */
public final class SavedTableViews implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String accountId;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime addedToAppHomeOn;

    @ModelField(targetType = "AWSJSON")
    private final String columnState;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "AWSJSON")
    private final String dbFilterModel;

    @ModelField(targetType = "AWSJSON")
    private final String filterModel;

    @ModelField(targetType = "String")
    private final List<String> forAuthorizations;

    @ModelField(targetType = "String")
    private final List<String> forTeamIds;

    @ModelField(targetType = "String")
    private final List<String> forUserIds;

    @ModelField(targetType = "AWSJSON")
    private final String hiddenColumnms;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "Boolean")
    private final Boolean includeAll;

    @ModelField(targetType = "Boolean")
    private final Boolean isMetrics;

    @ModelField(targetType = "Boolean")
    private final Boolean isOnlyMetrics;

    @ModelField(targetType = "Boolean")
    private final Boolean isSystemCreated;

    @ModelField(isRequired = true, targetType = "ID")
    private final String ownerId;

    @ModelField(targetType = "ID")
    private final String scopeId;

    @ModelField(targetType = "ScopeLevel")
    private final ScopeLevel scopeLevel;

    @ModelField(targetType = "Boolean")
    private final Boolean showMetricsInApp;

    @ModelField(targetType = "Boolean")
    private final Boolean showMetricsOnDashboard;

    @ModelField(targetType = "AWSJSON")
    private final String sortModel;

    @ModelField(isRequired = true, targetType = "String")
    private final String tableName;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(isRequired = true, targetType = "String")
    private final String viewName;
    public static final QueryField ID = QueryField.field("SavedTableViews", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ACCOUNT_ID = QueryField.field("SavedTableViews", "accountId");
    public static final QueryField OWNER_ID = QueryField.field("SavedTableViews", "ownerId");
    public static final QueryField TABLE_NAME = QueryField.field("SavedTableViews", "tableName");
    public static final QueryField VIEW_NAME = QueryField.field("SavedTableViews", "viewName");
    public static final QueryField IS_SYSTEM_CREATED = QueryField.field("SavedTableViews", "isSystemCreated");
    public static final QueryField INCLUDE_ALL = QueryField.field("SavedTableViews", "includeAll");
    public static final QueryField FILTER_MODEL = QueryField.field("SavedTableViews", "filterModel");
    public static final QueryField SORT_MODEL = QueryField.field("SavedTableViews", "sortModel");
    public static final QueryField COLUMN_STATE = QueryField.field("SavedTableViews", "columnState");
    public static final QueryField HIDDEN_COLUMNMS = QueryField.field("SavedTableViews", "hiddenColumnms");
    public static final QueryField SCOPE_LEVEL = QueryField.field("SavedTableViews", "scopeLevel");
    public static final QueryField SCOPE_ID = QueryField.field("SavedTableViews", "scopeId");
    public static final QueryField FOR_USER_IDS = QueryField.field("SavedTableViews", "forUserIds");
    public static final QueryField FOR_TEAM_IDS = QueryField.field("SavedTableViews", "forTeamIds");
    public static final QueryField FOR_AUTHORIZATIONS = QueryField.field("SavedTableViews", "forAuthorizations");
    public static final QueryField IS_METRICS = QueryField.field("SavedTableViews", "isMetrics");
    public static final QueryField IS_ONLY_METRICS = QueryField.field("SavedTableViews", "isOnlyMetrics");
    public static final QueryField DB_FILTER_MODEL = QueryField.field("SavedTableViews", "dbFilterModel");
    public static final QueryField SHOW_METRICS_ON_DASHBOARD = QueryField.field("SavedTableViews", "showMetricsOnDashboard");
    public static final QueryField SHOW_METRICS_IN_APP = QueryField.field("SavedTableViews", "showMetricsInApp");
    public static final QueryField ADDED_TO_APP_HOME_ON = QueryField.field("SavedTableViews", "addedToAppHomeOn");
    public static final QueryField CREATED_AT = QueryField.field("SavedTableViews", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("SavedTableViews", "updatedAt");

    public interface AccountIdStep {
        OwnerIdStep accountId(String str);
    }

    public interface BuildStep {
        BuildStep addedToAppHomeOn(Temporal.DateTime dateTime);

        SavedTableViews build();

        BuildStep columnState(String str);

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep dbFilterModel(String str);

        BuildStep filterModel(String str);

        BuildStep forAuthorizations(List<String> list);

        BuildStep forTeamIds(List<String> list);

        BuildStep forUserIds(List<String> list);

        BuildStep hiddenColumnms(String str);

        BuildStep id(String str);

        BuildStep includeAll(Boolean bool);

        BuildStep isMetrics(Boolean bool);

        BuildStep isOnlyMetrics(Boolean bool);

        BuildStep isSystemCreated(Boolean bool);

        BuildStep scopeId(String str);

        BuildStep scopeLevel(ScopeLevel scopeLevel);

        BuildStep showMetricsInApp(Boolean bool);

        BuildStep showMetricsOnDashboard(Boolean bool);

        BuildStep sortModel(String str);

        BuildStep updatedAt(Temporal.DateTime dateTime);
    }

    public static class Builder implements AccountIdStep, OwnerIdStep, TableNameStep, ViewNameStep, BuildStep {
        private String accountId;
        private Temporal.DateTime addedToAppHomeOn;
        private String columnState;
        private Temporal.DateTime createdAt;
        private String dbFilterModel;
        private String filterModel;
        private List<String> forAuthorizations;
        private List<String> forTeamIds;
        private List<String> forUserIds;
        private String hiddenColumnms;
        private String id;
        private Boolean includeAll;
        private Boolean isMetrics;
        private Boolean isOnlyMetrics;
        private Boolean isSystemCreated;
        private String ownerId;
        private String scopeId;
        private ScopeLevel scopeLevel;
        private Boolean showMetricsInApp;
        private Boolean showMetricsOnDashboard;
        private String sortModel;
        private String tableName;
        private Temporal.DateTime updatedAt;
        private String viewName;

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.AccountIdStep
        public OwnerIdStep accountId(String str) {
            Objects.requireNonNull(str);
            this.accountId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep addedToAppHomeOn(Temporal.DateTime dateTime) {
            this.addedToAppHomeOn = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public SavedTableViews build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new SavedTableViews(string, this.accountId, this.ownerId, this.tableName, this.viewName, this.isSystemCreated, this.includeAll, this.filterModel, this.sortModel, this.columnState, this.hiddenColumnms, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.isMetrics, this.isOnlyMetrics, this.dbFilterModel, this.showMetricsOnDashboard, this.showMetricsInApp, this.addedToAppHomeOn, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep columnState(String str) {
            this.columnState = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep dbFilterModel(String str) {
            this.dbFilterModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep filterModel(String str) {
            this.filterModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep forAuthorizations(List<String> list) {
            this.forAuthorizations = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep forTeamIds(List<String> list) {
            this.forTeamIds = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep forUserIds(List<String> list) {
            this.forUserIds = list;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep hiddenColumnms(String str) {
            this.hiddenColumnms = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep includeAll(Boolean bool) {
            this.includeAll = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep isMetrics(Boolean bool) {
            this.isMetrics = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep isOnlyMetrics(Boolean bool) {
            this.isOnlyMetrics = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep isSystemCreated(Boolean bool) {
            this.isSystemCreated = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.OwnerIdStep
        public TableNameStep ownerId(String str) {
            Objects.requireNonNull(str);
            this.ownerId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep scopeId(String str) {
            this.scopeId = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep scopeLevel(ScopeLevel scopeLevel) {
            this.scopeLevel = scopeLevel;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep showMetricsInApp(Boolean bool) {
            this.showMetricsInApp = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep showMetricsOnDashboard(Boolean bool) {
            this.showMetricsOnDashboard = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep sortModel(String str) {
            this.sortModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.TableNameStep
        public ViewNameStep tableName(String str) {
            Objects.requireNonNull(str);
            this.tableName = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.ViewNameStep
        public BuildStep viewName(String str) {
            Objects.requireNonNull(str);
            this.viewName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, String str9, ScopeLevel scopeLevel, String str10, List<String> list, List<String> list2, List<String> list3, Boolean bool3, Boolean bool4, String str11, Boolean bool5, Boolean bool6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            this.id = str;
            this.accountId = str2;
            this.ownerId = str3;
            this.tableName = str4;
            this.viewName = str5;
            this.isSystemCreated = bool;
            this.includeAll = bool2;
            this.filterModel = str6;
            this.sortModel = str7;
            this.columnState = str8;
            this.hiddenColumnms = str9;
            this.scopeLevel = scopeLevel;
            this.scopeId = str10;
            this.forUserIds = list;
            this.forTeamIds = list2;
            this.forAuthorizations = list3;
            this.isMetrics = bool3;
            this.isOnlyMetrics = bool4;
            this.dbFilterModel = str11;
            this.showMetricsOnDashboard = bool5;
            this.showMetricsInApp = bool6;
            this.addedToAppHomeOn = dateTime;
            this.createdAt = dateTime2;
            this.updatedAt = dateTime3;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public /* bridge */ /* synthetic */ BuildStep forAuthorizations(List list) {
            return forAuthorizations((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public /* bridge */ /* synthetic */ BuildStep forTeamIds(List list) {
            return forTeamIds((List<String>) list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public /* bridge */ /* synthetic */ BuildStep forUserIds(List list) {
            return forUserIds((List<String>) list);
        }

        private CopyOfBuilder(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, String str9, ScopeLevel scopeLevel, String str10, List<String> list, List<String> list2, List<String> list3, Boolean bool3, Boolean bool4, String str11, Boolean bool5, Boolean bool6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
            super(str, str2, str3, str4, str5, bool, bool2, str6, str7, str8, str9, scopeLevel, str10, list, list2, list3, bool3, bool4, str11, bool5, bool6, dateTime, dateTime2, dateTime3);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str3);
            Objects.requireNonNull(str4);
            Objects.requireNonNull(str5);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.AccountIdStep
        public CopyOfBuilder accountId(String str) {
            return (CopyOfBuilder) super.accountId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder addedToAppHomeOn(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.addedToAppHomeOn(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder columnState(String str) {
            return (CopyOfBuilder) super.columnState(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder dbFilterModel(String str) {
            return (CopyOfBuilder) super.dbFilterModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder filterModel(String str) {
            return (CopyOfBuilder) super.filterModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder forAuthorizations(List<String> list) {
            return (CopyOfBuilder) super.forAuthorizations(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder forTeamIds(List<String> list) {
            return (CopyOfBuilder) super.forTeamIds(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder forUserIds(List<String> list) {
            return (CopyOfBuilder) super.forUserIds(list);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder hiddenColumnms(String str) {
            return (CopyOfBuilder) super.hiddenColumnms(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder includeAll(Boolean bool) {
            return (CopyOfBuilder) super.includeAll(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder isMetrics(Boolean bool) {
            return (CopyOfBuilder) super.isMetrics(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder isOnlyMetrics(Boolean bool) {
            return (CopyOfBuilder) super.isOnlyMetrics(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder isSystemCreated(Boolean bool) {
            return (CopyOfBuilder) super.isSystemCreated(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.OwnerIdStep
        public CopyOfBuilder ownerId(String str) {
            return (CopyOfBuilder) super.ownerId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder scopeId(String str) {
            return (CopyOfBuilder) super.scopeId(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder scopeLevel(ScopeLevel scopeLevel) {
            return (CopyOfBuilder) super.scopeLevel(scopeLevel);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder showMetricsInApp(Boolean bool) {
            return (CopyOfBuilder) super.showMetricsInApp(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder showMetricsOnDashboard(Boolean bool) {
            return (CopyOfBuilder) super.showMetricsOnDashboard(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder sortModel(String str) {
            return (CopyOfBuilder) super.sortModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.TableNameStep
        public CopyOfBuilder tableName(String str) {
            return (CopyOfBuilder) super.tableName(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.SavedTableViews.Builder, com.amplifyframework.datastore.generated.model.SavedTableViews.ViewNameStep
        public CopyOfBuilder viewName(String str) {
            return (CopyOfBuilder) super.viewName(str);
        }
    }

    public interface OwnerIdStep {
        TableNameStep ownerId(String str);
    }

    public interface TableNameStep {
        ViewNameStep tableName(String str);
    }

    public interface ViewNameStep {
        BuildStep viewName(String str);
    }

    public static AccountIdStep builder() {
        return new Builder();
    }

    public static SavedTableViews justId(String str) {
        return new SavedTableViews(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.accountId, this.ownerId, this.tableName, this.viewName, this.isSystemCreated, this.includeAll, this.filterModel, this.sortModel, this.columnState, this.hiddenColumnms, this.scopeLevel, this.scopeId, this.forUserIds, this.forTeamIds, this.forAuthorizations, this.isMetrics, this.isOnlyMetrics, this.dbFilterModel, this.showMetricsOnDashboard, this.showMetricsInApp, this.addedToAppHomeOn, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SavedTableViews.class != obj.getClass()) {
            return false;
        }
        SavedTableViews savedTableViews = (SavedTableViews) obj;
        return s6c.m47909a(getId(), savedTableViews.getId()) && s6c.m47909a(getAccountId(), savedTableViews.getAccountId()) && s6c.m47909a(getOwnerId(), savedTableViews.getOwnerId()) && s6c.m47909a(getTableName(), savedTableViews.getTableName()) && s6c.m47909a(getViewName(), savedTableViews.getViewName()) && s6c.m47909a(getIsSystemCreated(), savedTableViews.getIsSystemCreated()) && s6c.m47909a(getIncludeAll(), savedTableViews.getIncludeAll()) && s6c.m47909a(getFilterModel(), savedTableViews.getFilterModel()) && s6c.m47909a(getSortModel(), savedTableViews.getSortModel()) && s6c.m47909a(getColumnState(), savedTableViews.getColumnState()) && s6c.m47909a(getHiddenColumnms(), savedTableViews.getHiddenColumnms()) && s6c.m47909a(getScopeLevel(), savedTableViews.getScopeLevel()) && s6c.m47909a(getScopeId(), savedTableViews.getScopeId()) && s6c.m47909a(getForUserIds(), savedTableViews.getForUserIds()) && s6c.m47909a(getForTeamIds(), savedTableViews.getForTeamIds()) && s6c.m47909a(getForAuthorizations(), savedTableViews.getForAuthorizations()) && s6c.m47909a(getIsMetrics(), savedTableViews.getIsMetrics()) && s6c.m47909a(getIsOnlyMetrics(), savedTableViews.getIsOnlyMetrics()) && s6c.m47909a(getDbFilterModel(), savedTableViews.getDbFilterModel()) && s6c.m47909a(getShowMetricsOnDashboard(), savedTableViews.getShowMetricsOnDashboard()) && s6c.m47909a(getShowMetricsInApp(), savedTableViews.getShowMetricsInApp()) && s6c.m47909a(getAddedToAppHomeOn(), savedTableViews.getAddedToAppHomeOn()) && s6c.m47909a(getCreatedAt(), savedTableViews.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), savedTableViews.getUpdatedAt());
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Temporal.DateTime getAddedToAppHomeOn() {
        return this.addedToAppHomeOn;
    }

    public String getColumnState() {
        return this.columnState;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDbFilterModel() {
        return this.dbFilterModel;
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

    public String getHiddenColumnms() {
        return this.hiddenColumnms;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIncludeAll() {
        return this.includeAll;
    }

    public Boolean getIsMetrics() {
        return this.isMetrics;
    }

    public Boolean getIsOnlyMetrics() {
        return this.isOnlyMetrics;
    }

    public Boolean getIsSystemCreated() {
        return this.isSystemCreated;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getScopeId() {
        return this.scopeId;
    }

    public ScopeLevel getScopeLevel() {
        return this.scopeLevel;
    }

    public Boolean getShowMetricsInApp() {
        return this.showMetricsInApp;
    }

    public Boolean getShowMetricsOnDashboard() {
        return this.showMetricsOnDashboard;
    }

    public String getSortModel() {
        return this.sortModel;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getViewName() {
        return this.viewName;
    }

    public int hashCode() {
        return (getId() + getAccountId() + getOwnerId() + getTableName() + getViewName() + getIsSystemCreated() + getIncludeAll() + getFilterModel() + getSortModel() + getColumnState() + getHiddenColumnms() + getScopeLevel() + getScopeId() + getForUserIds() + getForTeamIds() + getForAuthorizations() + getIsMetrics() + getIsOnlyMetrics() + getDbFilterModel() + getShowMetricsOnDashboard() + getShowMetricsInApp() + getAddedToAppHomeOn() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SavedTableViews {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("accountId=" + String.valueOf(getAccountId()) + ", ");
        sb.append("ownerId=" + String.valueOf(getOwnerId()) + ", ");
        sb.append("tableName=" + String.valueOf(getTableName()) + ", ");
        sb.append("viewName=" + String.valueOf(getViewName()) + ", ");
        sb.append("isSystemCreated=" + String.valueOf(getIsSystemCreated()) + ", ");
        sb.append("includeAll=" + String.valueOf(getIncludeAll()) + ", ");
        sb.append("filterModel=" + String.valueOf(getFilterModel()) + ", ");
        sb.append("sortModel=" + String.valueOf(getSortModel()) + ", ");
        sb.append("columnState=" + String.valueOf(getColumnState()) + ", ");
        sb.append("hiddenColumnms=" + String.valueOf(getHiddenColumnms()) + ", ");
        sb.append("scopeLevel=" + String.valueOf(getScopeLevel()) + ", ");
        sb.append("scopeId=" + String.valueOf(getScopeId()) + ", ");
        sb.append("forUserIds=" + String.valueOf(getForUserIds()) + ", ");
        sb.append("forTeamIds=" + String.valueOf(getForTeamIds()) + ", ");
        sb.append("forAuthorizations=" + String.valueOf(getForAuthorizations()) + ", ");
        sb.append("isMetrics=" + String.valueOf(getIsMetrics()) + ", ");
        sb.append("isOnlyMetrics=" + String.valueOf(getIsOnlyMetrics()) + ", ");
        sb.append("dbFilterModel=" + String.valueOf(getDbFilterModel()) + ", ");
        sb.append("showMetricsOnDashboard=" + String.valueOf(getShowMetricsOnDashboard()) + ", ");
        sb.append("showMetricsInApp=" + String.valueOf(getShowMetricsInApp()) + ", ");
        sb.append("addedToAppHomeOn=" + String.valueOf(getAddedToAppHomeOn()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private SavedTableViews(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, String str9, ScopeLevel scopeLevel, String str10, List<String> list, List<String> list2, List<String> list3, Boolean bool3, Boolean bool4, String str11, Boolean bool5, Boolean bool6, Temporal.DateTime dateTime, Temporal.DateTime dateTime2, Temporal.DateTime dateTime3) {
        this.id = str;
        this.accountId = str2;
        this.ownerId = str3;
        this.tableName = str4;
        this.viewName = str5;
        this.isSystemCreated = bool;
        this.includeAll = bool2;
        this.filterModel = str6;
        this.sortModel = str7;
        this.columnState = str8;
        this.hiddenColumnms = str9;
        this.scopeLevel = scopeLevel;
        this.scopeId = str10;
        this.forUserIds = list;
        this.forTeamIds = list2;
        this.forAuthorizations = list3;
        this.isMetrics = bool3;
        this.isOnlyMetrics = bool4;
        this.dbFilterModel = str11;
        this.showMetricsOnDashboard = bool5;
        this.showMetricsInApp = bool6;
        this.addedToAppHomeOn = dateTime;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }
}
