package p001o;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.YearMonth;
import j$.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class yp6 {
    /* renamed from: a */
    public static final LocalDate m58057a(YearMonth yearMonth) {
        sq8.m48649h(yearMonth, "<this>");
        LocalDate localDateAtDay = yearMonth.atDay(1);
        sq8.m48648g(localDateAtDay, "this.atDay(1)");
        return localDateAtDay;
    }

    /* renamed from: b */
    public static final List m58058b(DayOfWeek dayOfWeek) {
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        int iOrdinal = 7 - dayOfWeek.ordinal();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        return kh3.x0(gp0.x0(dayOfWeekArrValues, iOrdinal), gp0.m29254U(dayOfWeekArrValues, iOrdinal));
    }

    /* renamed from: c */
    public static /* synthetic */ List m58059c(DayOfWeek dayOfWeek, int i, Object obj) {
        if ((i & 1) != 0) {
            dayOfWeek = m58060d();
        }
        return m58058b(dayOfWeek);
    }

    /* renamed from: d */
    public static final DayOfWeek m58060d() {
        DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
        sq8.m48648g(firstDayOfWeek, "of(Locale.getDefault()).firstDayOfWeek");
        return firstDayOfWeek;
    }

    /* renamed from: e */
    public static final YearMonth m58061e(YearMonth yearMonth) {
        sq8.m48649h(yearMonth, "<this>");
        YearMonth yearMonthPlusMonths = yearMonth.plusMonths(1L);
        sq8.m48648g(yearMonthPlusMonths, "this.plusMonths(1)");
        return yearMonthPlusMonths;
    }

    /* renamed from: f */
    public static final YearMonth m58062f(YearMonth yearMonth) {
        sq8.m48649h(yearMonth, "<this>");
        YearMonth yearMonthMinusMonths = yearMonth.minusMonths(1L);
        sq8.m48648g(yearMonthMinusMonths, "this.minusMonths(1)");
        return yearMonthMinusMonths;
    }

    /* renamed from: g */
    public static final YearMonth m58063g(LocalDate localDate) {
        sq8.m48649h(localDate, "<this>");
        YearMonth yearMonthOf = YearMonth.of(localDate.getYear(), localDate.getMonth());
        sq8.m48648g(yearMonthOf, "of(year, month)");
        return yearMonthOf;
    }
}
