package ai.salesmax.model;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;
import p001o.vs6;

/* loaded from: classes.dex */
public final class ActivitiesStatus {
    public static final int $stable = 8;
    private int color;
    private Integer icon;
    private long id;
    private String metricsName;
    private long metricsValue;
    private long previousMetricsValue;
    private String title;

    public ActivitiesStatus() {
        this(0L, null, null, 0L, null, 0, 0L, Opcodes.LAND, null);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.metricsName;
    }

    public final long component4() {
        return this.metricsValue;
    }

    public final Integer component5() {
        return this.icon;
    }

    public final int component6() {
        return this.color;
    }

    public final long component7() {
        return this.previousMetricsValue;
    }

    public final ActivitiesStatus copy(long j, String str, String str2, long j2, Integer num, int i, long j3) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, "metricsName");
        return new ActivitiesStatus(j, str, str2, j2, num, i, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivitiesStatus)) {
            return false;
        }
        ActivitiesStatus activitiesStatus = (ActivitiesStatus) obj;
        return this.id == activitiesStatus.id && sq8.m48644c(this.title, activitiesStatus.title) && sq8.m48644c(this.metricsName, activitiesStatus.metricsName) && this.metricsValue == activitiesStatus.metricsValue && sq8.m48644c(this.icon, activitiesStatus.icon) && this.color == activitiesStatus.color && this.previousMetricsValue == activitiesStatus.previousMetricsValue;
    }

    public final int getColor() {
        return this.color;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMetricsName() {
        return this.metricsName;
    }

    public final long getMetricsValue() {
        return this.metricsValue;
    }

    public final int getPercentage() {
        long j = this.previousMetricsValue;
        if (j == 0 && this.metricsValue == 0) {
            return 0;
        }
        if (this.metricsValue == 0) {
            return -100;
        }
        if (j == 0) {
            return 100;
        }
        return (int) (((r4 - j) / (j * 1.0d)) * 100.0d);
    }

    public final long getPreviousMetricsValue() {
        return this.previousMetricsValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.metricsName.hashCode()) * 31) + Long.hashCode(this.metricsValue)) * 31;
        Integer num = this.icon;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.color)) * 31) + Long.hashCode(this.previousMetricsValue);
    }

    public final boolean isBetterThanPrevious() {
        return this.metricsValue >= this.previousMetricsValue;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setIcon(Integer num) {
        this.icon = num;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setMetricsName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.metricsName = str;
    }

    public final void setMetricsValue(long j) {
        this.metricsValue = j;
    }

    public final void setPreviousMetricsValue(long j) {
        this.previousMetricsValue = j;
    }

    public final void setTitle(String str) {
        sq8.m48649h(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "ActivitiesStatus(id=" + this.id + ", title=" + this.title + ", metricsName=" + this.metricsName + ", metricsValue=" + this.metricsValue + ", icon=" + this.icon + ", color=" + this.color + ", previousMetricsValue=" + this.previousMetricsValue + ")";
    }

    public ActivitiesStatus(long j) {
        this(j, null, null, 0L, null, 0, 0L, 126, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivitiesStatus(long j, String str) {
        this(j, str, null, 0L, null, 0, 0L, 124, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivitiesStatus(long j, String str, String str2) {
        this(j, str, str2, 0L, null, 0, 0L, 120, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, "metricsName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivitiesStatus(long j, String str, String str2, long j2) {
        this(j, str, str2, j2, null, 0, 0L, 112, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, "metricsName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivitiesStatus(long j, String str, String str2, long j2, Integer num) {
        this(j, str, str2, j2, num, 0, 0L, 96, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, "metricsName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivitiesStatus(long j, String str, String str2, long j2, Integer num, int i) {
        this(j, str, str2, j2, num, i, 0L, 64, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, "metricsName");
    }

    public ActivitiesStatus(long j, String str, String str2, long j2, Integer num, int i, long j3) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        sq8.m48649h(str2, "metricsName");
        this.id = j;
        this.title = str;
        this.metricsName = str2;
        this.metricsValue = j2;
        this.icon = num;
        this.color = i;
        this.previousMetricsValue = j3;
    }

    public /* synthetic */ ActivitiesStatus(long j, String str, String str2, long j2, Integer num, int i, long j3, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 1L : j, (i2 & 2) != 0 ? vs6.m53364a() : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? Integer.valueOf(vs6.m53366c()) : num, (i2 & 32) != 0 ? vs6.m53365b() : i, (i2 & 64) == 0 ? j3 : 0L);
    }
}
