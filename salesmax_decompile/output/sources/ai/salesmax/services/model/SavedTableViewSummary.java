package ai.salesmax.services.model;

import androidx.databinding.ObservableBoolean;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.SavedTableViews;
import com.amplifyframework.datastore.generated.model.ScopeLevel;
import p001o.a81;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class SavedTableViewSummary {
    private boolean isAmendable;
    private SavedTableViews underlyingSavedTableViews;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final SavedTableViews newInstance() {
            SavedTableViews savedTableViewsBuild = SavedTableViews.builder().accountId("").ownerId("").tableName("").viewName("").filterModel("{}").columnState("[]").build();
            sq8.m48648g(savedTableViewsBuild, "build(...)");
            return savedTableViewsBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedTableViewSummary() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String getAccountId() {
        return this.underlyingSavedTableViews.getAccountId();
    }

    public final Long getAddedToAppHomeOn() {
        Temporal.DateTime addedToAppHomeOn = this.underlyingSavedTableViews.getAddedToAppHomeOn();
        if (addedToAppHomeOn != null) {
            return a81.m16645F(addedToAppHomeOn);
        }
        return null;
    }

    public final String getColumnState() {
        return this.underlyingSavedTableViews.getColumnState();
    }

    public final String getFilterModel() {
        return this.underlyingSavedTableViews.getFilterModel();
    }

    public final String getId() {
        return this.underlyingSavedTableViews.getId();
    }

    public final Boolean getIncludeAll() {
        return this.underlyingSavedTableViews.getIncludeAll();
    }

    public final String getOwnerId() {
        return this.underlyingSavedTableViews.getOwnerId();
    }

    public final String getScopeId() {
        return this.underlyingSavedTableViews.getScopeId();
    }

    public final String getScopeLevel() {
        ScopeLevel scopeLevel = this.underlyingSavedTableViews.getScopeLevel();
        if (scopeLevel != null) {
            return scopeLevel.name();
        }
        return null;
    }

    public final Boolean getShowMetricsInApp() {
        return this.underlyingSavedTableViews.getShowMetricsInApp();
    }

    public final String getSortModel() {
        return this.underlyingSavedTableViews.getSortModel();
    }

    public final String getTableName() {
        return this.underlyingSavedTableViews.getTableName();
    }

    public final SavedTableViews getUnderlyingSavedTableViews() {
        return this.underlyingSavedTableViews;
    }

    public final String getViewName() {
        return this.underlyingSavedTableViews.getViewName();
    }

    public final boolean isAmendable() {
        return this.isAmendable;
    }

    public final void setAccountId(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().accountId(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setAddedToAppHomeOn(Long l) {
        Temporal.DateTime dateTimeM16658m;
        if (l == null || (dateTimeM16658m = a81.m16658m(Long.valueOf(l.longValue()))) == null) {
            return;
        }
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().addedToAppHomeOn(dateTimeM16658m).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setAmendable(boolean z) {
        this.isAmendable = z;
    }

    public final void setColumnState(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().columnState(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setFilterModel(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().filterModel(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setId(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().id(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setIncludeAll(Boolean bool) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().includeAll(bool).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setOwnerId(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().ownerId(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setScopeId(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().scopeId(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setScopeLevel(String str) {
        ScopeLevel scopeLevelValueOf;
        if (str == null || (scopeLevelValueOf = ScopeLevel.valueOf(str)) == null) {
            return;
        }
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().scopeLevel(scopeLevelValueOf).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setShowMetricsInApp(Boolean bool) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().showMetricsInApp(bool).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setSortModel(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().sortModel(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setTableName(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().tableName(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final void setUnderlyingSavedTableViews(SavedTableViews savedTableViews) {
        sq8.m48649h(savedTableViews, "<set-?>");
        this.underlyingSavedTableViews = savedTableViews;
    }

    public final void setViewName(String str) {
        SavedTableViews savedTableViewsBuild = this.underlyingSavedTableViews.copyOfBuilder().viewName(str).build();
        sq8.m48648g(savedTableViewsBuild, "build(...)");
        this.underlyingSavedTableViews = savedTableViewsBuild;
    }

    public final SavedTableViewInfo toSavedTableViewInfo() {
        String accountId = getAccountId();
        String ownerId = getOwnerId();
        String tableName = getTableName();
        String viewName = getViewName();
        Boolean includeAll = getIncludeAll();
        String scopeId = getScopeId();
        String scopeLevel = getScopeLevel();
        String filterModel = getFilterModel();
        String columnState = getColumnState();
        String sortModel = getSortModel();
        Boolean showMetricsInApp = getShowMetricsInApp();
        return new SavedTableViewInfo(accountId, ownerId, tableName, viewName, scopeId, scopeLevel, filterModel, columnState, sortModel, includeAll, new ObservableBoolean(showMetricsInApp != null ? showMetricsInApp.booleanValue() : false), getAddedToAppHomeOn(), null, false, this.isAmendable, 12288, null);
    }

    public SavedTableViewSummary(SavedTableViews savedTableViews) {
        sq8.m48649h(savedTableViews, "underlyingSavedTableViews");
        this.underlyingSavedTableViews = savedTableViews;
        this.isAmendable = true;
    }

    public /* synthetic */ SavedTableViewSummary(SavedTableViews savedTableViews, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : savedTableViews);
    }
}
