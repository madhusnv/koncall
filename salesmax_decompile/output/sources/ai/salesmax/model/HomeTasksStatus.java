package ai.salesmax.model;

import ai.salesmax.services.model.ActivityMetrics;
import java.util.ArrayList;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class HomeTasksStatus {
    public static final int $stable = 8;
    private ArrayList<HomeActivity> activities;
    private ArrayList<HomeActivity> calls;
    private ActivityMetrics.Period period;
    private boolean showUniqueCalls;
    private ArrayList<HomeActivity> uniqueCalls;
    private ArrayList<HomeActivity> visits;

    public HomeTasksStatus() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ HomeTasksStatus copy$default(HomeTasksStatus homeTasksStatus, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ActivityMetrics.Period period, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = homeTasksStatus.calls;
        }
        if ((i & 2) != 0) {
            arrayList2 = homeTasksStatus.uniqueCalls;
        }
        ArrayList arrayList5 = arrayList2;
        if ((i & 4) != 0) {
            arrayList3 = homeTasksStatus.visits;
        }
        ArrayList arrayList6 = arrayList3;
        if ((i & 8) != 0) {
            arrayList4 = homeTasksStatus.activities;
        }
        ArrayList arrayList7 = arrayList4;
        if ((i & 16) != 0) {
            period = homeTasksStatus.period;
        }
        ActivityMetrics.Period period2 = period;
        if ((i & 32) != 0) {
            z = homeTasksStatus.showUniqueCalls;
        }
        return homeTasksStatus.copy(arrayList, arrayList5, arrayList6, arrayList7, period2, z);
    }

    public final ArrayList<HomeActivity> component1() {
        return this.calls;
    }

    public final ArrayList<HomeActivity> component2() {
        return this.uniqueCalls;
    }

    public final ArrayList<HomeActivity> component3() {
        return this.visits;
    }

    public final ArrayList<HomeActivity> component4() {
        return this.activities;
    }

    public final ActivityMetrics.Period component5() {
        return this.period;
    }

    public final boolean component6() {
        return this.showUniqueCalls;
    }

    public final HomeTasksStatus copy(ArrayList<HomeActivity> arrayList, ArrayList<HomeActivity> arrayList2, ArrayList<HomeActivity> arrayList3, ArrayList<HomeActivity> arrayList4, ActivityMetrics.Period period, boolean z) {
        sq8.m48649h(arrayList, "calls");
        sq8.m48649h(arrayList2, "uniqueCalls");
        sq8.m48649h(arrayList3, "visits");
        sq8.m48649h(arrayList4, "activities");
        sq8.m48649h(period, "period");
        return new HomeTasksStatus(arrayList, arrayList2, arrayList3, arrayList4, period, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTasksStatus)) {
            return false;
        }
        HomeTasksStatus homeTasksStatus = (HomeTasksStatus) obj;
        return sq8.m48644c(this.calls, homeTasksStatus.calls) && sq8.m48644c(this.uniqueCalls, homeTasksStatus.uniqueCalls) && sq8.m48644c(this.visits, homeTasksStatus.visits) && sq8.m48644c(this.activities, homeTasksStatus.activities) && this.period == homeTasksStatus.period && this.showUniqueCalls == homeTasksStatus.showUniqueCalls;
    }

    public final ArrayList<HomeActivity> getActivities() {
        return this.activities;
    }

    public final ArrayList<HomeActivity> getCalls() {
        return this.calls;
    }

    public final ActivityMetrics.Period getPeriod() {
        return this.period;
    }

    public final boolean getShowUniqueCalls() {
        return this.showUniqueCalls;
    }

    public final ArrayList<HomeActivity> getUniqueCalls() {
        return this.uniqueCalls;
    }

    public final ArrayList<HomeActivity> getVisits() {
        return this.visits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((((this.calls.hashCode() * 31) + this.uniqueCalls.hashCode()) * 31) + this.visits.hashCode()) * 31) + this.activities.hashCode()) * 31) + this.period.hashCode()) * 31;
        boolean z = this.showUniqueCalls;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final void setActivities(ArrayList<HomeActivity> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.activities = arrayList;
    }

    public final void setCalls(ArrayList<HomeActivity> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.calls = arrayList;
    }

    public final void setPeriod(ActivityMetrics.Period period) {
        sq8.m48649h(period, "<set-?>");
        this.period = period;
    }

    public final void setShowUniqueCalls(boolean z) {
        this.showUniqueCalls = z;
    }

    public final void setUniqueCalls(ArrayList<HomeActivity> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.uniqueCalls = arrayList;
    }

    public final void setVisits(ArrayList<HomeActivity> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.visits = arrayList;
    }

    public String toString() {
        return "HomeTasksStatus(calls=" + this.calls + ", uniqueCalls=" + this.uniqueCalls + ", visits=" + this.visits + ", activities=" + this.activities + ", period=" + this.period + ", showUniqueCalls=" + this.showUniqueCalls + ")";
    }

    public HomeTasksStatus(ArrayList<HomeActivity> arrayList, ArrayList<HomeActivity> arrayList2, ArrayList<HomeActivity> arrayList3, ArrayList<HomeActivity> arrayList4, ActivityMetrics.Period period, boolean z) {
        sq8.m48649h(arrayList, "calls");
        sq8.m48649h(arrayList2, "uniqueCalls");
        sq8.m48649h(arrayList3, "visits");
        sq8.m48649h(arrayList4, "activities");
        sq8.m48649h(period, "period");
        this.calls = arrayList;
        this.uniqueCalls = arrayList2;
        this.visits = arrayList3;
        this.activities = arrayList4;
        this.period = period;
        this.showUniqueCalls = z;
    }

    public /* synthetic */ HomeTasksStatus(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ActivityMetrics.Period period, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? new ArrayList() : arrayList3, (i & 8) != 0 ? new ArrayList() : arrayList4, (i & 16) != 0 ? ActivityMetrics.Period.DAY : period, (i & 32) != 0 ? false : z);
    }
}
