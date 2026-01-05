package p001o;

import j$.time.LocalDate;
import j$.time.YearMonth;
import j$.time.chrono.ChronoLocalDate;

/* loaded from: classes6.dex */
public abstract class ori {
    /* renamed from: a */
    public static final void m42608a(LocalDate localDate, LocalDate localDate2) {
        sq8.m48649h(localDate, "startDate");
        sq8.m48649h(localDate2, "endDate");
        if (localDate2.compareTo((ChronoLocalDate) localDate) >= 0) {
            return;
        }
        throw new IllegalStateException(("startDate: " + localDate + " is greater than endDate: " + localDate2).toString());
    }

    /* renamed from: b */
    public static final void m42609b(YearMonth yearMonth, YearMonth yearMonth2) {
        sq8.m48649h(yearMonth, "startMonth");
        sq8.m48649h(yearMonth2, "endMonth");
        if (yearMonth2.compareTo(yearMonth) >= 0) {
            return;
        }
        throw new IllegalStateException(("startMonth: " + yearMonth + " is greater than endMonth: " + yearMonth2).toString());
    }
}
