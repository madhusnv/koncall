package p001o;

import j$.time.DayOfWeek;
import j$.time.YearMonth;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes6.dex */
public abstract class xlb {
    /* renamed from: a */
    public static final wlb m56450a(YearMonth yearMonth, int i, DayOfWeek dayOfWeek, xfc xfcVar) {
        sq8.m48649h(yearMonth, "startMonth");
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        sq8.m48649h(xfcVar, "outDateStyle");
        YearMonth yearMonthPlusMonths = yearMonth.plusMonths(i);
        sq8.m48648g(yearMonthPlusMonths, "month");
        DayOfWeek dayOfWeek2 = yp6.m58057a(yearMonthPlusMonths).getDayOfWeek();
        sq8.m48648g(dayOfWeek2, "firstDay.dayOfWeek");
        int iM59675a = zp6.m59675a(dayOfWeek, dayOfWeek2);
        int iLengthOfMonth = yearMonthPlusMonths.lengthOfMonth() + iM59675a;
        int i2 = iLengthOfMonth % 7;
        int i3 = i2 != 0 ? 7 - i2 : 0;
        return new wlb(yearMonthPlusMonths, iM59675a, i3 + (xfcVar != xfc.EndOfRow ? (6 - ((iLengthOfMonth + i3) / 7)) * 7 : 0));
    }

    /* renamed from: b */
    public static final int m56451b(YearMonth yearMonth, YearMonth yearMonth2) {
        sq8.m48649h(yearMonth, "startMonth");
        sq8.m48649h(yearMonth2, "targetMonth");
        return (int) ChronoUnit.MONTHS.between(yearMonth, yearMonth2);
    }

    /* renamed from: c */
    public static final int m56452c(YearMonth yearMonth, YearMonth yearMonth2) {
        sq8.m48649h(yearMonth, "startMonth");
        sq8.m48649h(yearMonth2, "endMonth");
        return m56451b(yearMonth, yearMonth2) + 1;
    }
}
