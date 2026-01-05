package ai.salesmax.model;

import androidx.databinding.ObservableBoolean;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ActiveProfilePermissionIssues {
    public static final int $stable = 8;
    private boolean hasDrawOverAppPermissionIssue;
    private ObservableBoolean hasOpenPermissionIssues;
    private boolean hasPostCallLogAppPermissionIssue;
    private boolean hasSaveCallLogPermissionIssue;

    public ActiveProfilePermissionIssues() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ ActiveProfilePermissionIssues copy$default(ActiveProfilePermissionIssues activeProfilePermissionIssues, boolean z, boolean z2, boolean z3, ObservableBoolean observableBoolean, int i, Object obj) {
        if ((i & 1) != 0) {
            z = activeProfilePermissionIssues.hasSaveCallLogPermissionIssue;
        }
        if ((i & 2) != 0) {
            z2 = activeProfilePermissionIssues.hasDrawOverAppPermissionIssue;
        }
        if ((i & 4) != 0) {
            z3 = activeProfilePermissionIssues.hasPostCallLogAppPermissionIssue;
        }
        if ((i & 8) != 0) {
            observableBoolean = activeProfilePermissionIssues.hasOpenPermissionIssues;
        }
        return activeProfilePermissionIssues.copy(z, z2, z3, observableBoolean);
    }

    public final boolean component1() {
        return this.hasSaveCallLogPermissionIssue;
    }

    public final boolean component2() {
        return this.hasDrawOverAppPermissionIssue;
    }

    public final boolean component3() {
        return this.hasPostCallLogAppPermissionIssue;
    }

    public final ObservableBoolean component4() {
        return this.hasOpenPermissionIssues;
    }

    public final ActiveProfilePermissionIssues copy(boolean z, boolean z2, boolean z3, ObservableBoolean observableBoolean) {
        sq8.m48649h(observableBoolean, "hasOpenPermissionIssues");
        return new ActiveProfilePermissionIssues(z, z2, z3, observableBoolean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveProfilePermissionIssues)) {
            return false;
        }
        ActiveProfilePermissionIssues activeProfilePermissionIssues = (ActiveProfilePermissionIssues) obj;
        return this.hasSaveCallLogPermissionIssue == activeProfilePermissionIssues.hasSaveCallLogPermissionIssue && this.hasDrawOverAppPermissionIssue == activeProfilePermissionIssues.hasDrawOverAppPermissionIssue && this.hasPostCallLogAppPermissionIssue == activeProfilePermissionIssues.hasPostCallLogAppPermissionIssue && sq8.m48644c(this.hasOpenPermissionIssues, activeProfilePermissionIssues.hasOpenPermissionIssues);
    }

    public final boolean getHasDrawOverAppPermissionIssue() {
        return this.hasDrawOverAppPermissionIssue;
    }

    public final ObservableBoolean getHasOpenPermissionIssues() {
        return this.hasOpenPermissionIssues;
    }

    public final boolean getHasPostCallLogAppPermissionIssue() {
        return this.hasPostCallLogAppPermissionIssue;
    }

    public final boolean getHasSaveCallLogPermissionIssue() {
        return this.hasSaveCallLogPermissionIssue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.hasSaveCallLogPermissionIssue;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.hasDrawOverAppPermissionIssue;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.hasPostCallLogAppPermissionIssue;
        return ((i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.hasOpenPermissionIssues.hashCode();
    }

    public final void setHasDrawOverAppPermissionIssue(boolean z) {
        this.hasDrawOverAppPermissionIssue = z;
    }

    public final void setHasOpenPermissionIssues(ObservableBoolean observableBoolean) {
        sq8.m48649h(observableBoolean, "<set-?>");
        this.hasOpenPermissionIssues = observableBoolean;
    }

    public final void setHasPostCallLogAppPermissionIssue(boolean z) {
        this.hasPostCallLogAppPermissionIssue = z;
    }

    public final void setHasSaveCallLogPermissionIssue(boolean z) {
        this.hasSaveCallLogPermissionIssue = z;
    }

    public String toString() {
        return "ActiveProfilePermissionIssues(hasSaveCallLogPermissionIssue=" + this.hasSaveCallLogPermissionIssue + ", hasDrawOverAppPermissionIssue=" + this.hasDrawOverAppPermissionIssue + ", hasPostCallLogAppPermissionIssue=" + this.hasPostCallLogAppPermissionIssue + ", hasOpenPermissionIssues=" + this.hasOpenPermissionIssues + ")";
    }

    public ActiveProfilePermissionIssues(boolean z, boolean z2, boolean z3, ObservableBoolean observableBoolean) {
        sq8.m48649h(observableBoolean, "hasOpenPermissionIssues");
        this.hasSaveCallLogPermissionIssue = z;
        this.hasDrawOverAppPermissionIssue = z2;
        this.hasPostCallLogAppPermissionIssue = z3;
        this.hasOpenPermissionIssues = observableBoolean;
        observableBoolean.m5960j(z | z2 | z3);
    }

    public /* synthetic */ ActiveProfilePermissionIssues(boolean z, boolean z2, boolean z3, ObservableBoolean observableBoolean, int i, id5 id5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? new ObservableBoolean(false) : observableBoolean);
    }
}
