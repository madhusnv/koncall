package p001o;

import j$.time.LocalDate;

/* loaded from: classes6.dex */
public final class z6j {

    /* renamed from: a */
    public final LocalDate f56611a;

    /* renamed from: b */
    public final LocalDate f56612b;

    public z6j(LocalDate localDate, LocalDate localDate2) {
        sq8.m48649h(localDate, "startDateAdjusted");
        sq8.m48649h(localDate2, "endDateAdjusted");
        this.f56611a = localDate;
        this.f56612b = localDate2;
    }

    /* renamed from: a */
    public final LocalDate m58854a() {
        return this.f56612b;
    }

    /* renamed from: b */
    public final LocalDate m58855b() {
        return this.f56611a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6j)) {
            return false;
        }
        z6j z6jVar = (z6j) obj;
        return sq8.m48644c(this.f56611a, z6jVar.f56611a) && sq8.m48644c(this.f56612b, z6jVar.f56612b);
    }

    public int hashCode() {
        return (this.f56611a.hashCode() * 31) + this.f56612b.hashCode();
    }

    public String toString() {
        return "WeekDateRange(startDateAdjusted=" + this.f56611a + ", endDateAdjusted=" + this.f56612b + ")";
    }
}
