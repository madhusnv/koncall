package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class DateRangePicked {
    public static final int $stable = 8;
    private Long endDate;
    private Long startDate;

    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePicked() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DateRangePicked copy$default(DateRangePicked dateRangePicked, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = dateRangePicked.startDate;
        }
        if ((i & 2) != 0) {
            l2 = dateRangePicked.endDate;
        }
        return dateRangePicked.copy(l, l2);
    }

    public final Long component1() {
        return this.startDate;
    }

    public final Long component2() {
        return this.endDate;
    }

    public final DateRangePicked copy(Long l, Long l2) {
        return new DateRangePicked(l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRangePicked)) {
            return false;
        }
        DateRangePicked dateRangePicked = (DateRangePicked) obj;
        return sq8.m48644c(this.startDate, dateRangePicked.startDate) && sq8.m48644c(this.endDate, dateRangePicked.endDate);
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        Long l = this.startDate;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.endDate;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final void setEndDate(Long l) {
        this.endDate = l;
    }

    public final void setStartDate(Long l) {
        this.startDate = l;
    }

    public String toString() {
        return "DateRangePicked(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }

    public DateRangePicked(Long l, Long l2) {
        this.startDate = l;
        this.endDate = l2;
    }

    public /* synthetic */ DateRangePicked(Long l, Long l2, int i, id5 id5Var) {
        this((i & 1) != 0 ? -1L : l, (i & 2) != 0 ? -1L : l2);
    }
}
