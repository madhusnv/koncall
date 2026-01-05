package ai.salesmax.services.model;

import ai.salesmax.model.LeadFilter;
import ai.salesmax.services.model.SavedTableViewInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.ObservableBoolean;
import org.objectweb.asm.Opcodes;
import p001o.a81;
import p001o.gu3;
import p001o.id5;
import p001o.iu9;
import p001o.jm;
import p001o.sq8;
import p001o.t7c;

/* loaded from: classes.dex */
public final class SavedTableViewInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SavedTableViewInfo> CREATOR = new Creator();
    private String accountId;
    private Long addedToAppHomeOn;
    private String columnState;
    private String filterModel;
    private Boolean includeAll;
    private boolean isAmendable;
    private String ownerId;
    private t7c rowCount;
    private String scopeId;
    private String scopeLevel;
    private boolean selected;
    private ObservableBoolean showMetricsInApp;
    private String sortModel;
    private String tableName;
    private String viewName;

    public static final class Creator implements Parcelable.Creator<SavedTableViewInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavedTableViewInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SavedTableViewInfo(string, string2, string3, string4, string5, string6, string7, string8, string9, boolValueOf, (ObservableBoolean) parcel.readParcelable(SavedTableViewInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (t7c) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavedTableViewInfo[] newArray(int i) {
            return new SavedTableViewInfo[i];
        }
    }

    public SavedTableViewInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 32767, null);
    }

    public static /* synthetic */ void reloadCount$default(SavedTableViewInfo savedTableViewInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        savedTableViewInfo.reloadCount(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reloadCount$lambda$0() {
    }

    public final String component1() {
        return this.accountId;
    }

    public final Boolean component10() {
        return this.includeAll;
    }

    public final ObservableBoolean component11() {
        return this.showMetricsInApp;
    }

    public final Long component12() {
        return this.addedToAppHomeOn;
    }

    public final t7c component13() {
        return this.rowCount;
    }

    public final boolean component14() {
        return this.selected;
    }

    public final boolean component15() {
        return this.isAmendable;
    }

    public final String component2() {
        return this.ownerId;
    }

    public final String component3() {
        return this.tableName;
    }

    public final String component4() {
        return this.viewName;
    }

    public final String component5() {
        return this.scopeId;
    }

    public final String component6() {
        return this.scopeLevel;
    }

    public final String component7() {
        return this.filterModel;
    }

    public final String component8() {
        return this.columnState;
    }

    public final String component9() {
        return this.sortModel;
    }

    public final SavedTableViewInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, ObservableBoolean observableBoolean, Long l, t7c t7cVar, boolean z, boolean z2) {
        sq8.m48649h(t7cVar, "rowCount");
        return new SavedTableViewInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, observableBoolean, l, t7cVar, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedTableViewInfo)) {
            return false;
        }
        SavedTableViewInfo savedTableViewInfo = (SavedTableViewInfo) obj;
        return sq8.m48644c(this.accountId, savedTableViewInfo.accountId) && sq8.m48644c(this.ownerId, savedTableViewInfo.ownerId) && sq8.m48644c(this.tableName, savedTableViewInfo.tableName) && sq8.m48644c(this.viewName, savedTableViewInfo.viewName) && sq8.m48644c(this.scopeId, savedTableViewInfo.scopeId) && sq8.m48644c(this.scopeLevel, savedTableViewInfo.scopeLevel) && sq8.m48644c(this.filterModel, savedTableViewInfo.filterModel) && sq8.m48644c(this.columnState, savedTableViewInfo.columnState) && sq8.m48644c(this.sortModel, savedTableViewInfo.sortModel) && sq8.m48644c(this.includeAll, savedTableViewInfo.includeAll) && sq8.m48644c(this.showMetricsInApp, savedTableViewInfo.showMetricsInApp) && sq8.m48644c(this.addedToAppHomeOn, savedTableViewInfo.addedToAppHomeOn) && sq8.m48644c(this.rowCount, savedTableViewInfo.rowCount) && this.selected == savedTableViewInfo.selected && this.isAmendable == savedTableViewInfo.isAmendable;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final Long getAddedToAppHomeOn() {
        return this.addedToAppHomeOn;
    }

    public final String getColumnState() {
        return this.columnState;
    }

    public final String getFilterModel() {
        return this.filterModel;
    }

    public final Boolean getIncludeAll() {
        return this.includeAll;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final t7c getRowCount() {
        return this.rowCount;
    }

    public final String getScopeId() {
        return this.scopeId;
    }

    public final String getScopeLevel() {
        return this.scopeLevel;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final ObservableBoolean getShowMetricsInApp() {
        return this.showMetricsInApp;
    }

    public final String getSortModel() {
        return this.sortModel;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public final String getViewName() {
        return this.viewName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tableName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.viewName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scopeId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scopeLevel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.filterModel;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.columnState;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sortModel;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.includeAll;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        ObservableBoolean observableBoolean = this.showMetricsInApp;
        int iHashCode11 = (iHashCode10 + (observableBoolean == null ? 0 : observableBoolean.hashCode())) * 31;
        Long l = this.addedToAppHomeOn;
        int iHashCode12 = (((iHashCode11 + (l != null ? l.hashCode() : 0)) * 31) + this.rowCount.hashCode()) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode12 + i) * 31;
        boolean z2 = this.isAmendable;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isAmendable() {
        return this.isAmendable;
    }

    public final void reloadCount(boolean z) {
        Long l = null;
        LeadFilter leadFilter = new LeadFilter(null, null, null, null, null, null, null, null, null, null, null, null, null, null, l, l, null, null, null, null, null, null, null, true, this, null, null, false, null, null, null, null, null, null, -25165825, 3, null);
        (z ? iu9.r0(leadFilter) : iu9.h0(leadFilter)).w0(new gu3() { // from class: ai.salesmax.services.model.SavedTableViewInfo.reloadCount.1
            @Override // p001o.gu3
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                accept(((Number) obj).intValue());
            }

            public final void accept(int i) {
                SavedTableViewInfo.this.getRowCount().m49536i(String.valueOf(i));
            }
        }, new gu3() { // from class: ai.salesmax.services.model.SavedTableViewInfo.reloadCount.2
            @Override // p001o.gu3
            public final void accept(Throwable th) {
                sq8.m48649h(th, "it");
                SavedTableViewInfo.this.getClass();
            }
        }, new jm() { // from class: o.j1f
            @Override // p001o.jm
            public final void run() {
                SavedTableViewInfo.reloadCount$lambda$0();
            }
        });
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setAddedToAppHomeOn(Long l) {
        this.addedToAppHomeOn = l;
    }

    public final void setAmendable(boolean z) {
        this.isAmendable = z;
    }

    public final void setColumnState(String str) {
        this.columnState = str;
    }

    public final void setFilterModel(String str) {
        this.filterModel = str;
    }

    public final void setIncludeAll(Boolean bool) {
        this.includeAll = bool;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setRowCount(t7c t7cVar) {
        sq8.m48649h(t7cVar, "<set-?>");
        this.rowCount = t7cVar;
    }

    public final void setScopeId(String str) {
        this.scopeId = str;
    }

    public final void setScopeLevel(String str) {
        this.scopeLevel = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setShowMetricsInApp(ObservableBoolean observableBoolean) {
        this.showMetricsInApp = observableBoolean;
    }

    public final void setShowMetricsInAppValue(boolean z) {
        ObservableBoolean observableBoolean = this.showMetricsInApp;
        if (observableBoolean != null) {
            observableBoolean.m5960j(z);
        }
        this.addedToAppHomeOn = Long.valueOf(a81.m16641B().toDate().getTime());
    }

    public final void setSortModel(String str) {
        this.sortModel = str;
    }

    public final void setTableName(String str) {
        this.tableName = str;
    }

    public final void setViewName(String str) {
        this.viewName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SavedTableViewSummary toSavedTableViewSummary() {
        SavedTableViewSummary savedTableViewSummary = new SavedTableViewSummary(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        savedTableViewSummary.setAccountId(this.accountId);
        savedTableViewSummary.setFilterModel(this.filterModel);
        savedTableViewSummary.setColumnState(this.columnState);
        savedTableViewSummary.setViewName(this.viewName);
        savedTableViewSummary.setIncludeAll(this.includeAll);
        savedTableViewSummary.setSortModel(this.sortModel);
        savedTableViewSummary.setOwnerId(this.ownerId);
        savedTableViewSummary.setScopeId(this.scopeId);
        savedTableViewSummary.setScopeLevel(this.scopeLevel);
        savedTableViewSummary.setTableName(this.tableName);
        ObservableBoolean observableBoolean = this.showMetricsInApp;
        savedTableViewSummary.setShowMetricsInApp(observableBoolean != null ? Boolean.valueOf(observableBoolean.m5959i()) : null);
        savedTableViewSummary.setAddedToAppHomeOn(this.addedToAppHomeOn);
        savedTableViewSummary.setAmendable(this.isAmendable);
        return savedTableViewSummary;
    }

    public String toString() {
        return "SavedTableViewInfo(accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", tableName=" + this.tableName + ", viewName=" + this.viewName + ", scopeId=" + this.scopeId + ", scopeLevel=" + this.scopeLevel + ", filterModel=" + this.filterModel + ", columnState=" + this.columnState + ", sortModel=" + this.sortModel + ", includeAll=" + this.includeAll + ", showMetricsInApp=" + this.showMetricsInApp + ", addedToAppHomeOn=" + this.addedToAppHomeOn + ", rowCount=" + this.rowCount + ", selected=" + this.selected + ", isAmendable=" + this.isAmendable + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.accountId);
        parcel.writeString(this.ownerId);
        parcel.writeString(this.tableName);
        parcel.writeString(this.viewName);
        parcel.writeString(this.scopeId);
        parcel.writeString(this.scopeLevel);
        parcel.writeString(this.filterModel);
        parcel.writeString(this.columnState);
        parcel.writeString(this.sortModel);
        Boolean bool = this.includeAll;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.showMetricsInApp, i);
        Long l = this.addedToAppHomeOn;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeSerializable(this.rowCount);
        parcel.writeInt(this.selected ? 1 : 0);
        parcel.writeInt(this.isAmendable ? 1 : 0);
    }

    public SavedTableViewInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, ObservableBoolean observableBoolean, Long l, t7c t7cVar, boolean z, boolean z2) {
        sq8.m48649h(t7cVar, "rowCount");
        this.accountId = str;
        this.ownerId = str2;
        this.tableName = str3;
        this.viewName = str4;
        this.scopeId = str5;
        this.scopeLevel = str6;
        this.filterModel = str7;
        this.columnState = str8;
        this.sortModel = str9;
        this.includeAll = bool;
        this.showMetricsInApp = observableBoolean;
        this.addedToAppHomeOn = l;
        this.rowCount = t7cVar;
        this.selected = z;
        this.isAmendable = z2;
    }

    public /* synthetic */ SavedTableViewInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, ObservableBoolean observableBoolean, Long l, t7c t7cVar, boolean z, boolean z2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? new ObservableBoolean(false) : observableBoolean, (i & 2048) == 0 ? l : null, (i & 4096) != 0 ? new t7c("0") : t7cVar, (i & 8192) == 0 ? z : false, (i & Opcodes.ACC_ENUM) != 0 ? true : z2);
    }
}
