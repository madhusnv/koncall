package h2;

import com.sun.mail.imap.IMAPStore;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.FormatStyle;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.n */
/* loaded from: classes.dex */
public final class C2809n extends AbstractC2808m {

    /* renamed from: d */
    public static final ZoneId f15741d = ZoneId.of("UTC");

    /* renamed from: b */
    public final int f15742b;

    /* renamed from: c */
    public final ArrayList f15743c;

    public C2809n(Locale locale) {
        this.f15742b = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(new C6361k(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f15743c = arrayList;
    }

    @Override // h2.AbstractC2808m
    /* renamed from: a */
    public final String mo6897a(long j6, String str, Locale locale) {
        return AbstractC2812q.m6913e(j6, str, locale, this.f15733a);
    }

    @Override // h2.AbstractC2808m
    /* renamed from: b */
    public final C2807l mo6898b(long j6) {
        LocalDate localDateMo7878m = Instant.ofEpochMilli(j6).atZone(f15741d).mo7878m();
        return new C2807l(localDateMo7878m.getYear(), localDateMo7878m.getMonthValue(), localDateMo7878m.getDayOfMonth(), IMAPStore.RESPONSE * localDateMo7878m.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // h2.AbstractC2808m
    /* renamed from: c */
    public final C2811p mo6899c(Locale locale) {
        return AbstractC2812q.m6912d(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // h2.AbstractC2808m
    /* renamed from: d */
    public final int mo6900d() {
        return this.f15742b;
    }

    @Override // h2.AbstractC2808m
    /* renamed from: e */
    public final C2810o mo6901e(int i10, int i11) {
        return m6908l(LocalDate.of(i10, i11, 1));
    }

    @Override // h2.AbstractC2808m
    /* renamed from: f */
    public final C2810o mo6902f(long j6) {
        return m6908l(Instant.ofEpochMilli(j6).atZone(f15741d).withDayOfMonth(1).mo7878m());
    }

    @Override // h2.AbstractC2808m
    /* renamed from: g */
    public final C2810o mo6903g(C2807l c2807l) {
        return m6908l(LocalDate.of(c2807l.f15724a, c2807l.f15725b, 1));
    }

    @Override // h2.AbstractC2808m
    /* renamed from: h */
    public final C2807l mo6904h() {
        LocalDate localDateNow = LocalDate.now();
        return new C2807l(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.mo7827M(LocalTime.MIDNIGHT).mo7840H(f15741d).toInstant().toEpochMilli());
    }

    @Override // h2.AbstractC2808m
    /* renamed from: i */
    public final List mo6905i() {
        return this.f15743c;
    }

    @Override // h2.AbstractC2808m
    /* renamed from: j */
    public final C2807l mo6906j(String str, String str2) {
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
            return new C2807l(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.mo7827M(LocalTime.MIDNIGHT).mo7840H(f15741d).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // h2.AbstractC2808m
    /* renamed from: k */
    public final C2810o mo6907k(C2810o c2810o, int i10) {
        return i10 <= 0 ? c2810o : m6908l(Instant.ofEpochMilli(c2810o.f15751e).atZone(f15741d).mo7878m().plusMonths(i10));
    }

    /* renamed from: l */
    public final C2810o m6908l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f15742b;
        if (value < 0) {
            value += 7;
        }
        return new C2810o(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.mo7827M(LocalTime.MIDNIGHT).mo7840H(f15741d).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
