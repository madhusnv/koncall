package j$.time.chrono;

import j$.time.C3401c;
import j$.time.DayOfWeek;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3402a implements Chronology {

    /* renamed from: a */
    public static final ConcurrentHashMap f18049a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final ConcurrentHashMap f18050b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final Locale f18051c = new Locale("ja", "JP", "JP");

    /* renamed from: I */
    public static Chronology m7911I(Chronology chronology, String str) {
        String strMo7905v;
        Chronology chronology2 = (Chronology) f18049a.putIfAbsent(str, chronology);
        if (chronology2 == null && (strMo7905v = chronology.mo7905v()) != null) {
            f18050b.putIfAbsent(strMo7905v, chronology);
        }
        return chronology2;
    }

    /* renamed from: C */
    public static boolean m7910C() {
        if (f18049a.get("ISO") != null) {
            return false;
        }
        C3413l c3413l = C3413l.f18074m;
        c3413l.getClass();
        m7911I(c3413l, "Hijrah-umalqura");
        C3419r c3419r = C3419r.f18092d;
        c3419r.getClass();
        m7911I(c3419r, "Japanese");
        C3424w c3424w = C3424w.f18104d;
        c3424w.getClass();
        m7911I(c3424w, "Minguo");
        c0 c0Var = c0.f18056d;
        c0Var.getClass();
        m7911I(c0Var, "ThaiBuddhist");
        try {
            for (AbstractC3402a abstractC3402a : Arrays.asList(new AbstractC3402a[0])) {
                if (!abstractC3402a.mo7904r().equals("ISO")) {
                    m7911I(abstractC3402a, abstractC3402a.mo7904r());
                }
            }
            IsoChronology isoChronology = IsoChronology.INSTANCE;
            isoChronology.getClass();
            m7911I(isoChronology, "ISO");
            return true;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static Chronology ofLocale(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(f18051c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return IsoChronology.INSTANCE;
        }
        do {
            Chronology chronology = (Chronology) f18050b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (m7910C());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (unicodeLocaleType.equals(chronology2.mo7905v())) {
                return chronology2;
            }
        }
        throw new C3401c("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: T */
    public ChronoLocalDate mo7900T(Map map, j$.time.format.b0 b0Var) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return mo7903q(((Long) map.remove(chronoField)).longValue());
        }
        mo7908Q(map, b0Var);
        ChronoLocalDate chronoLocalDateA0 = a0(map, b0Var);
        if (chronoLocalDateA0 != null) {
            return chronoLocalDateA0;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return mo7909X(map, b0Var);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int iM8015a = mo7891A(chronoField2).m8015a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return mo7899R(iM8015a, 1, 1).mo7820b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).mo7820b(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).mo7820b(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iM8015a2 = mo7891A(chronoField3).m8015a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iM8015a3 = mo7891A(chronoField4).m8015a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    ChronoLocalDate chronoLocalDateMo7820b = mo7899R(iM8015a, iM8015a2, 1).mo7820b((mo7891A(chronoField5).m8015a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((iM8015a3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateMo7820b.mo7810h(chronoField3) == iM8015a2) {
                        return chronoLocalDateMo7820b;
                    }
                    throw new C3401c("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int iM8015a4 = mo7891A(chronoField2).m8015a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return m7912K(mo7899R(iM8015a4, 1, 1), Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int iM8015a5 = mo7891A(chronoField3).m8015a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    ChronoLocalDate chronoLocalDateMo7835j = mo7899R(iM8015a4, iM8015a5, 1).mo7820b((mo7891A(chronoField4).m8015a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).mo7835j(TemporalAdjusters.nextOrSame(DayOfWeek.of(mo7891A(chronoField6).m8015a(((Long) map.remove(chronoField6)).longValue(), chronoField6))));
                    if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateMo7835j.mo7810h(chronoField3) == iM8015a5) {
                        return chronoLocalDateMo7835j;
                    }
                    throw new C3401c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int iM8015a6 = mo7891A(chronoField2).m8015a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (b0Var != j$.time.format.b0.LENIENT) {
                return mo7907x(iM8015a6, mo7891A(chronoField7).m8015a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            return mo7907x(iM8015a6, 1).mo7820b(Math.subtractExact(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int iM8015a7 = mo7891A(chronoField2).m8015a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (b0Var == j$.time.format.b0.LENIENT) {
                return mo7907x(iM8015a7, 1).mo7820b(Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).mo7820b(Math.subtractExact(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iM8015a8 = mo7891A(chronoField8).m8015a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            ChronoLocalDate chronoLocalDateMo7820b2 = mo7907x(iM8015a7, 1).mo7820b((mo7891A(chronoField9).m8015a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((iM8015a8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateMo7820b2.mo7810h(chronoField2) == iM8015a7) {
                return chronoLocalDateMo7820b2;
            }
            throw new C3401c("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int iM8015a9 = mo7891A(chronoField2).m8015a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (b0Var == j$.time.format.b0.LENIENT) {
            return m7912K(mo7907x(iM8015a9, 1), 0L, Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        ChronoLocalDate chronoLocalDateMo7835j2 = mo7907x(iM8015a9, 1).mo7820b((mo7891A(chronoField8).m8015a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).mo7835j(TemporalAdjusters.nextOrSame(DayOfWeek.of(mo7891A(chronoField10).m8015a(((Long) map.remove(chronoField10)).longValue(), chronoField10))));
        if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateMo7835j2.mo7810h(chronoField2) == iM8015a9) {
            return chronoLocalDateMo7835j2;
        }
        throw new C3401c("Strict mode rejected resolved date as it is in a different year");
    }

    /* renamed from: Q */
    public void mo7908Q(Map map, j$.time.format.b0 b0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                chronoField.a0(l9.longValue());
            }
            ChronoLocalDate chronoLocalDateMo7819a = mo7897N().mo7819a(1L, (TemporalField) ChronoField.DAY_OF_MONTH).mo7819a(l9.longValue(), (TemporalField) chronoField);
            m7913t(map, ChronoField.MONTH_OF_YEAR, chronoLocalDateMo7819a.mo7810h(r0));
            m7913t(map, ChronoField.YEAR, chronoLocalDateMo7819a.mo7810h(r0));
        }
    }

    public ChronoLocalDate a0(Map map, j$.time.format.b0 b0Var) {
        int intExact;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            Long l10 = (Long) map.remove(ChronoField.ERA);
            if (b0Var != j$.time.format.b0.LENIENT) {
                intExact = mo7891A(chronoField).m8015a(l9.longValue(), chronoField);
            } else {
                intExact = Math.toIntExact(l9.longValue());
            }
            if (l10 != null) {
                m7913t(map, ChronoField.YEAR, mo7895F(mo7893D(mo7891A(r2).m8015a(l10.longValue(), r2)), intExact));
                return null;
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            if (map.containsKey(chronoField2)) {
                m7913t(map, chronoField2, mo7895F(mo7907x(mo7891A(chronoField2).m8015a(((Long) map.get(chronoField2)).longValue(), chronoField2), 1).mo7828P(), intExact));
                return null;
            }
            if (b0Var == j$.time.format.b0.STRICT) {
                map.put(chronoField, l9);
                return null;
            }
            if (mo7892B().isEmpty()) {
                m7913t(map, chronoField2, intExact);
                return null;
            }
            m7913t(map, chronoField2, mo7895F((InterfaceC3411j) r9.get(r9.size() - 1), intExact));
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        mo7891A(chronoField3).m8016b(((Long) map.get(chronoField3)).longValue(), chronoField3);
        return null;
    }

    /* renamed from: X */
    public ChronoLocalDate mo7909X(Map map, j$.time.format.b0 b0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iM8015a = mo7891A(chronoField).m8015a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (b0Var == j$.time.format.b0.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return mo7899R(iM8015a, 1, 1).mo7820b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).mo7820b(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iM8015a2 = mo7891A(chronoField2).m8015a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iM8015a3 = mo7891A(chronoField3).m8015a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (b0Var == j$.time.format.b0.SMART) {
            try {
                return mo7899R(iM8015a, iM8015a2, iM8015a3);
            } catch (C3401c unused) {
                return mo7899R(iM8015a, iM8015a2, 1).mo7835j(TemporalAdjusters.lastDayOfMonth());
            }
        }
        return mo7899R(iM8015a, iM8015a2, iM8015a3);
    }

    /* renamed from: K */
    public static ChronoLocalDate m7912K(ChronoLocalDate chronoLocalDate, long j6, long j10, long j11) {
        long j12;
        ChronoLocalDate chronoLocalDateMo7820b = chronoLocalDate.mo7820b(j6, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateMo7820b2 = chronoLocalDateMo7820b.mo7820b(j10, (TemporalUnit) chronoUnit);
        if (j11 > 7) {
            long j13 = j11 - 1;
            chronoLocalDateMo7820b2 = chronoLocalDateMo7820b2.mo7820b(j13 / 7, (TemporalUnit) chronoUnit);
            j12 = j13 % 7;
        } else {
            if (j11 < 1) {
                chronoLocalDateMo7820b2 = chronoLocalDateMo7820b2.mo7820b(Math.subtractExact(j11, 7L) / 7, (TemporalUnit) chronoUnit);
                j12 = (j11 + 6) % 7;
            }
            return chronoLocalDateMo7820b2.mo7835j(TemporalAdjusters.nextOrSame(DayOfWeek.of((int) j11)));
        }
        j11 = j12 + 1;
        return chronoLocalDateMo7820b2.mo7835j(TemporalAdjusters.nextOrSame(DayOfWeek.of((int) j11)));
    }

    /* renamed from: t */
    public static void m7913t(Map map, ChronoField chronoField, long j6) {
        Long l9 = (Long) map.get(chronoField);
        if (l9 != null && l9.longValue() != j6) {
            throw new C3401c("Conflict found: " + chronoField + " " + l9 + " differs from " + chronoField + " " + j6);
        }
        map.put(chronoField, Long.valueOf(j6));
    }

    @Override // j$.time.chrono.Chronology, java.lang.Comparable
    /* renamed from: E */
    public final int compareTo(Chronology chronology) {
        return mo7904r().compareTo(chronology.mo7904r());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC3402a) && compareTo((AbstractC3402a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ mo7904r().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return mo7904r();
    }
}
