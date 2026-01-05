package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class WorkingHours {
    public static final int $stable = 8;
    private String day;
    private String endTime;
    private long id;
    private boolean isSelected;
    private String startTime;

    public WorkingHours() {
        this(0L, null, null, null, false, 31, null);
    }

    public static /* synthetic */ WorkingHours copy$default(WorkingHours workingHours, long j, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = workingHours.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = workingHours.day;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = workingHours.startTime;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = workingHours.endTime;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = workingHours.isSelected;
        }
        return workingHours.copy(j2, str4, str5, str6, z);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.day;
    }

    public final String component3() {
        return this.startTime;
    }

    public final String component4() {
        return this.endTime;
    }

    public final boolean component5() {
        return this.isSelected;
    }

    public final WorkingHours copy(long j, String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, "day");
        sq8.m48649h(str2, "startTime");
        sq8.m48649h(str3, "endTime");
        return new WorkingHours(j, str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkingHours)) {
            return false;
        }
        WorkingHours workingHours = (WorkingHours) obj;
        return this.id == workingHours.id && sq8.m48644c(this.day, workingHours.day) && sq8.m48644c(this.startTime, workingHours.startTime) && sq8.m48644c(this.endTime, workingHours.endTime) && this.isSelected == workingHours.isSelected;
    }

    public final String getDay() {
        return this.day;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.id) * 31) + this.day.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setDay(String str) {
        sq8.m48649h(str, "<set-?>");
        this.day = str;
    }

    public final void setEndTime(String str) {
        sq8.m48649h(str, "<set-?>");
        this.endTime = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setIsSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setStartTime(String str) {
        sq8.m48649h(str, "<set-?>");
        this.startTime = str;
    }

    public String toString() {
        return "WorkingHours(id=" + this.id + ", day=" + this.day + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isSelected=" + this.isSelected + ")";
    }

    public WorkingHours(long j, String str, String str2, String str3, boolean z) {
        sq8.m48649h(str, "day");
        sq8.m48649h(str2, "startTime");
        sq8.m48649h(str3, "endTime");
        this.id = j;
        this.day = str;
        this.startTime = str2;
        this.endTime = str3;
        this.isSelected = z;
    }

    public /* synthetic */ WorkingHours(long j, String str, String str2, String str3, boolean z, int i, id5 id5Var) {
        this((i & 1) != 0 ? 1L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
    }
}
