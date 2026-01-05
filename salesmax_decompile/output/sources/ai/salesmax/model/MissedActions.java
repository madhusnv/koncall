package ai.salesmax.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class MissedActions {
    public static final int $stable = 8;
    private String content;
    private String duration;
    private long id;
    private boolean isSelected;
    private String logo;
    private String title;

    public MissedActions() {
        this(0L, null, null, null, null, false, 63, null);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.duration;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.content;
    }

    public final String component5() {
        return this.logo;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final MissedActions copy(long j, String str, String str2, String str3, String str4, boolean z) {
        sq8.m48649h(str, "duration");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, FirebaseAnalytics.Param.CONTENT);
        return new MissedActions(j, str, str2, str3, str4, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissedActions)) {
            return false;
        }
        MissedActions missedActions = (MissedActions) obj;
        return this.id == missedActions.id && sq8.m48644c(this.duration, missedActions.duration) && sq8.m48644c(this.title, missedActions.title) && sq8.m48644c(this.content, missedActions.content) && sq8.m48644c(this.logo, missedActions.logo) && this.isSelected == missedActions.isSelected;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.id) * 31) + this.duration.hashCode()) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31;
        String str = this.logo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode2 + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setContent(String str) {
        sq8.m48649h(str, "<set-?>");
        this.content = str;
    }

    public final void setDuration(String str) {
        sq8.m48649h(str, "<set-?>");
        this.duration = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "MissedActions(id=" + this.id + ", duration=" + this.duration + ", title=" + this.title + ", content=" + this.content + ", logo=" + this.logo + ", isSelected=" + this.isSelected + ")";
    }

    public MissedActions(long j, String str, String str2, String str3, String str4, boolean z) {
        sq8.m48649h(str, "duration");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str3, FirebaseAnalytics.Param.CONTENT);
        this.id = j;
        this.duration = str;
        this.title = str2;
        this.content = str3;
        this.logo = str4;
        this.isSelected = z;
    }

    public /* synthetic */ MissedActions(long j, String str, String str2, String str3, String str4, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? 1L : j, (i & 2) != 0 ? "0" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z);
    }
}
