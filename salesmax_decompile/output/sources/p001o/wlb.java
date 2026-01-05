package p001o;

import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class wlb {

    /* renamed from: a */
    public final YearMonth f52305a;

    /* renamed from: b */
    public final int f52306b;

    /* renamed from: c */
    public final int f52307c;

    /* renamed from: d */
    public final int f52308d;

    /* renamed from: e */
    public final LocalDate f52309e;

    /* renamed from: f */
    public final List f52310f;

    /* renamed from: g */
    public final YearMonth f52311g;

    /* renamed from: h */
    public final YearMonth f52312h;

    /* renamed from: i */
    public final ws1 f52313i;

    public wlb(YearMonth yearMonth, int i, int i2) {
        sq8.m48649h(yearMonth, "month");
        this.f52305a = yearMonth;
        this.f52306b = i;
        this.f52307c = i2;
        int iLengthOfMonth = yearMonth.lengthOfMonth() + i + i2;
        this.f52308d = iLengthOfMonth;
        this.f52309e = yp6.m58057a(yearMonth).minusDays(i);
        List<List> listM35707W = kh3.m35707W(bce.m18616s(0, iLengthOfMonth), 7);
        this.f52310f = listM35707W;
        this.f52311g = yp6.m58062f(yearMonth);
        this.f52312h = yp6.m58061e(yearMonth);
        ArrayList arrayList = new ArrayList(dh3.m23088v(listM35707W, 10));
        for (List list : listM35707W) {
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(m54686b(((Number) it.next()).intValue()));
            }
            arrayList.add(arrayList2);
        }
        this.f52313i = new ws1(yearMonth, arrayList);
    }

    /* renamed from: a */
    public final ws1 m54685a() {
        return this.f52313i;
    }

    /* renamed from: b */
    public final ps1 m54686b(int i) {
        d05 d05Var;
        LocalDate localDatePlusDays = this.f52309e.plusDays(i);
        sq8.m48648g(localDatePlusDays, "date");
        YearMonth yearMonthM58063g = yp6.m58063g(localDatePlusDays);
        if (sq8.m48644c(yearMonthM58063g, this.f52305a)) {
            d05Var = d05.MonthDate;
        } else if (sq8.m48644c(yearMonthM58063g, this.f52311g)) {
            d05Var = d05.InDate;
        } else {
            if (!sq8.m48644c(yearMonthM58063g, this.f52312h)) {
                throw new IllegalArgumentException("Invalid date: " + localDatePlusDays + " in month: " + this.f52305a);
            }
            d05Var = d05.OutDate;
        }
        return new ps1(localDatePlusDays, d05Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlb)) {
            return false;
        }
        wlb wlbVar = (wlb) obj;
        return sq8.m48644c(this.f52305a, wlbVar.f52305a) && this.f52306b == wlbVar.f52306b && this.f52307c == wlbVar.f52307c;
    }

    public int hashCode() {
        return (((this.f52305a.hashCode() * 31) + Integer.hashCode(this.f52306b)) * 31) + Integer.hashCode(this.f52307c);
    }

    public String toString() {
        return "MonthData(month=" + this.f52305a + ", inDays=" + this.f52306b + ", outDays=" + this.f52307c + ")";
    }
}
