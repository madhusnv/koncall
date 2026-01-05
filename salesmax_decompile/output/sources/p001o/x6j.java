package p001o;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class x6j {

    /* renamed from: a */
    public final LocalDate f53281a;

    /* renamed from: b */
    public final LocalDate f53282b;

    /* renamed from: c */
    public final LocalDate f53283c;

    /* renamed from: d */
    public final s6j f53284d;

    public x6j(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        sq8.m48649h(localDate, "firstDayInWeek");
        sq8.m48649h(localDate2, "desiredStartDate");
        sq8.m48649h(localDate3, "desiredEndDate");
        this.f53281a = localDate;
        this.f53282b = localDate2;
        this.f53283c = localDate3;
        kl8 kl8VarM18616s = bce.m18616s(0, 7);
        ArrayList arrayList = new ArrayList(dh3.m23088v(kl8VarM18616s, 10));
        Iterator it = kl8VarM18616s.iterator();
        while (it.hasNext()) {
            arrayList.add(m55752a(((dl8) it).mo23412a()));
        }
        this.f53284d = new s6j(arrayList);
    }

    /* renamed from: a */
    public final a7j m55752a(int i) {
        LocalDate localDatePlusDays = this.f53281a.plusDays(i);
        c7j c7jVar = localDatePlusDays.compareTo((ChronoLocalDate) this.f53282b) < 0 ? c7j.InDate : localDatePlusDays.compareTo((ChronoLocalDate) this.f53283c) > 0 ? c7j.OutDate : c7j.RangeDate;
        sq8.m48648g(localDatePlusDays, "date");
        return new a7j(localDatePlusDays, c7jVar);
    }

    /* renamed from: b */
    public final s6j m55753b() {
        return this.f53284d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6j)) {
            return false;
        }
        x6j x6jVar = (x6j) obj;
        return sq8.m48644c(this.f53281a, x6jVar.f53281a) && sq8.m48644c(this.f53282b, x6jVar.f53282b) && sq8.m48644c(this.f53283c, x6jVar.f53283c);
    }

    public int hashCode() {
        return (((this.f53281a.hashCode() * 31) + this.f53282b.hashCode()) * 31) + this.f53283c.hashCode();
    }

    public String toString() {
        return "WeekData(firstDayInWeek=" + this.f53281a + ", desiredStartDate=" + this.f53282b + ", desiredEndDate=" + this.f53283c + ")";
    }
}
