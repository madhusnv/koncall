package p001o;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes6.dex */
public abstract class y6j {
    /* renamed from: a */
    public static final z6j m57321a(LocalDate localDate, LocalDate localDate2, DayOfWeek dayOfWeek) {
        sq8.m48649h(localDate, "startDate");
        sq8.m48649h(localDate2, "endDate");
        sq8.m48649h(dayOfWeek, "firstDayOfWeek");
        sq8.m48648g(localDate.getDayOfWeek(), "startDate.dayOfWeek");
        LocalDate localDateMinusDays = localDate.minusDays(zp6.m59675a(dayOfWeek, r0));
        LocalDate localDatePlusDays = localDateMinusDays.plusWeeks((int) ChronoUnit.WEEKS.between(localDateMinusDays, localDate2)).plusDays(6L);
        sq8.m48648g(localDateMinusDays, "startDateAdjusted");
        sq8.m48648g(localDatePlusDays, "endDateAdjusted");
        return new z6j(localDateMinusDays, localDatePlusDays);
    }

    /* renamed from: b */
    public static final x6j m57322b(LocalDate localDate, int i, LocalDate localDate2, LocalDate localDate3) {
        sq8.m48649h(localDate, "startDateAdjusted");
        sq8.m48649h(localDate2, "desiredStartDate");
        sq8.m48649h(localDate3, "desiredEndDate");
        LocalDate localDatePlusWeeks = localDate.plusWeeks(i);
        sq8.m48648g(localDatePlusWeeks, "firstDayInWeek");
        return new x6j(localDatePlusWeeks, localDate2, localDate3);
    }

    /* renamed from: c */
    public static final int m57323c(LocalDate localDate, LocalDate localDate2) {
        sq8.m48649h(localDate, "startDateAdjusted");
        sq8.m48649h(localDate2, "date");
        return (int) ChronoUnit.WEEKS.between(localDate, localDate2);
    }

    /* renamed from: d */
    public static final int m57324d(LocalDate localDate, LocalDate localDate2) {
        sq8.m48649h(localDate, "startDateAdjusted");
        sq8.m48649h(localDate2, "endDateAdjusted");
        return m57323c(localDate, localDate2) + 1;
    }
}
