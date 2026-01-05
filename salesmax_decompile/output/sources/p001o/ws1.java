package p001o;

import j$.time.YearMonth;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes6.dex */
public final class ws1 implements Serializable {

    /* renamed from: a */
    public final YearMonth f52609a;

    /* renamed from: b */
    public final List f52610b;

    public ws1(YearMonth yearMonth, List list) {
        sq8.m48649h(yearMonth, "yearMonth");
        sq8.m48649h(list, "weekDays");
        this.f52609a = yearMonth;
        this.f52610b = list;
    }

    /* renamed from: a */
    public final List m54946a() {
        return this.f52610b;
    }

    /* renamed from: b */
    public final YearMonth m54947b() {
        return this.f52609a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(ws1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type com.kizitonwose.calendar.core.CalendarMonth");
        ws1 ws1Var = (ws1) obj;
        return sq8.m48644c(this.f52609a, ws1Var.f52609a) && sq8.m48644c(kh3.f0((List) kh3.f0(this.f52610b)), kh3.f0((List) kh3.f0(ws1Var.f52610b))) && sq8.m48644c(kh3.r0((List) kh3.r0(this.f52610b)), kh3.r0((List) kh3.r0(ws1Var.f52610b)));
    }

    public int hashCode() {
        return (((this.f52609a.hashCode() * 31) + ((ps1) kh3.f0((List) kh3.f0(this.f52610b))).hashCode()) * 31) + ((ps1) kh3.r0((List) kh3.r0(this.f52610b))).hashCode();
    }

    public String toString() {
        return "CalendarMonth { first = " + kh3.f0((List) kh3.f0(this.f52610b)) + ", last = " + kh3.r0((List) kh3.r0(this.f52610b)) + " } ";
    }
}
