package j$.time.temporal;

import j$.time.C3401c;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.temporal.f */
/* loaded from: classes2.dex */
public abstract class EnumC3476f implements TemporalField {
    public static final EnumC3476f DAY_OF_QUARTER;
    public static final EnumC3476f QUARTER_OF_YEAR;
    public static final EnumC3476f WEEK_BASED_YEAR;
    public static final EnumC3476f WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    public static final int[] f18261a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC3476f[] f18262b;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC3476f valueOf(String str) {
        return (EnumC3476f) Enum.valueOf(EnumC3476f.class, str);
    }

    public static EnumC3476f[] values() {
        return (EnumC3476f[]) f18262b.clone();
    }

    static {
        EnumC3476f enumC3476f = new EnumC3476f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            /* renamed from: K */
            public final C3485o mo8005K() {
                return C3485o.m8014g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: t */
            public final boolean mo8008t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.mo7811i(ChronoField.DAY_OF_YEAR) || !temporalAccessor.mo7811i(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.mo7811i(ChronoField.YEAR)) {
                    return false;
                }
                EnumC3476f enumC3476f2 = AbstractC3478h.f18266a;
                return Chronology.m7890s(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: C */
            public final C3485o mo8004C(TemporalAccessor temporalAccessor) {
                if (!mo8008t(temporalAccessor)) {
                    throw new C3484n("Unsupported field: DayOfQuarter");
                }
                long j6 = temporalAccessor.getLong(EnumC3476f.QUARTER_OF_YEAR);
                if (j6 == 1) {
                    return IsoChronology.INSTANCE.mo7902Y(temporalAccessor.getLong(ChronoField.YEAR)) ? C3485o.m8013f(1L, 91L) : C3485o.m8013f(1L, 90L);
                }
                if (j6 == 2) {
                    return C3485o.m8013f(1L, 91L);
                }
                if (j6 == 3 || j6 == 4) {
                    return C3485o.m8013f(1L, 92L);
                }
                return mo8005K();
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: Q */
            public final long mo8006Q(TemporalAccessor temporalAccessor) {
                if (!mo8008t(temporalAccessor)) {
                    throw new C3484n("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.mo7810h(ChronoField.DAY_OF_YEAR) - EnumC3476f.f18261a[((temporalAccessor.mo7810h(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.mo7902Y(temporalAccessor.getLong(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: X */
            public final Temporal mo8007X(Temporal temporal, long j6) {
                long jMo8006Q = mo8006Q(temporal);
                mo8005K().m8016b(j6, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.mo7819a((j6 - jMo8006Q) + temporal.getLong(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: I */
            public final TemporalAccessor mo8011I(Map map, a0 a0Var, b0 b0Var) {
                long jSubtractExact;
                LocalDate localDatePlusMonths;
                ChronoField chronoField = ChronoField.YEAR;
                Long l9 = (Long) map.get(chronoField);
                TemporalField temporalField = EnumC3476f.QUARTER_OF_YEAR;
                Long l10 = (Long) map.get(temporalField);
                if (l9 == null || l10 == null) {
                    return null;
                }
                int iM8015a = chronoField.f18248b.m8015a(l9.longValue(), chronoField);
                long jLongValue = ((Long) map.get(EnumC3476f.DAY_OF_QUARTER)).longValue();
                EnumC3476f enumC3476f2 = AbstractC3478h.f18266a;
                if (!Chronology.m7890s(a0Var).equals(IsoChronology.INSTANCE)) {
                    throw new C3401c("Resolve requires IsoChronology");
                }
                if (b0Var == b0.LENIENT) {
                    localDatePlusMonths = LocalDate.of(iM8015a, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l10.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iM8015a, ((temporalField.mo8005K().m8015a(l10.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (b0Var == b0.STRICT) {
                            mo8004C(localDateOf).m8016b(jLongValue, this);
                        } else {
                            mo8005K().m8016b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDatePlusMonths = localDateOf;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDatePlusMonths.plusDays(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC3476f;
        EnumC3476f enumC3476f2 = new EnumC3476f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            /* renamed from: K */
            public final C3485o mo8005K() {
                return C3485o.m8013f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: t */
            public final boolean mo8008t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.mo7811i(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                EnumC3476f enumC3476f3 = AbstractC3478h.f18266a;
                return Chronology.m7890s(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: Q */
            public final long mo8006Q(TemporalAccessor temporalAccessor) {
                if (!mo8008t(temporalAccessor)) {
                    throw new C3484n("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: C */
            public final C3485o mo8004C(TemporalAccessor temporalAccessor) {
                if (!mo8008t(temporalAccessor)) {
                    throw new C3484n("Unsupported field: QuarterOfYear");
                }
                return mo8005K();
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: X */
            public final Temporal mo8007X(Temporal temporal, long j6) {
                long jMo8006Q = mo8006Q(temporal);
                mo8005K().m8016b(j6, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.mo7819a(((j6 - jMo8006Q) * 3) + temporal.getLong(chronoField), chronoField);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC3476f2;
        EnumC3476f enumC3476f3 = new EnumC3476f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            /* renamed from: K */
            public final C3485o mo8005K() {
                return C3485o.m8014g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: t */
            public final boolean mo8008t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.mo7811i(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                EnumC3476f enumC3476f4 = AbstractC3478h.f18266a;
                return Chronology.m7890s(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: C */
            public final C3485o mo8004C(TemporalAccessor temporalAccessor) {
                if (mo8008t(temporalAccessor)) {
                    return EnumC3476f.d0(LocalDate.m7825I(temporalAccessor));
                }
                throw new C3484n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: Q */
            public final long mo8006Q(TemporalAccessor temporalAccessor) {
                if (!mo8008t(temporalAccessor)) {
                    throw new C3484n("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC3476f.a0(LocalDate.m7825I(temporalAccessor));
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: X */
            public final Temporal mo8007X(Temporal temporal, long j6) {
                mo8005K().m8016b(j6, this);
                return temporal.mo7820b(Math.subtractExact(j6, mo8006Q(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: I */
            public final TemporalAccessor mo8011I(Map map, a0 a0Var, b0 b0Var) {
                LocalDate localDateMo7819a;
                long j6;
                long j10;
                TemporalField temporalField = EnumC3476f.WEEK_BASED_YEAR;
                Long l9 = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l10 = (Long) map.get(chronoField);
                if (l9 == null || l10 == null) {
                    return null;
                }
                int iM8015a = temporalField.mo8005K().m8015a(l9.longValue(), temporalField);
                long jLongValue = ((Long) map.get(EnumC3476f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                EnumC3476f enumC3476f4 = AbstractC3478h.f18266a;
                if (!Chronology.m7890s(a0Var).equals(IsoChronology.INSTANCE)) {
                    throw new C3401c("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iM8015a, 1, 4);
                if (b0Var == b0.LENIENT) {
                    long jLongValue2 = l10.longValue();
                    if (jLongValue2 > 7) {
                        long j11 = jLongValue2 - 1;
                        j6 = 1;
                        localDateOf = localDateOf.g0(j11 / 7);
                        j10 = j11 % 7;
                    } else {
                        j6 = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.g0(Math.subtractExact(jLongValue2, 7L) / 7);
                            j10 = (jLongValue2 + 6) % 7;
                        }
                        localDateMo7819a = localDateOf.g0(Math.subtractExact(jLongValue, j6)).mo7819a(jLongValue2, chronoField);
                    }
                    jLongValue2 = j10 + j6;
                    localDateMo7819a = localDateOf.g0(Math.subtractExact(jLongValue, j6)).mo7819a(jLongValue2, chronoField);
                } else {
                    int iM8015a2 = chronoField.f18248b.m8015a(l10.longValue(), chronoField);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (b0Var == b0.STRICT) {
                            EnumC3476f.d0(localDateOf).m8016b(jLongValue, this);
                        } else {
                            mo8005K().m8016b(jLongValue, this);
                        }
                    }
                    localDateMo7819a = localDateOf.g0(jLongValue - 1).mo7819a(iM8015a2, chronoField);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateMo7819a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC3476f3;
        EnumC3476f enumC3476f4 = new EnumC3476f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            /* renamed from: K */
            public final C3485o mo8005K() {
                return ChronoField.YEAR.f18248b;
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: t */
            public final boolean mo8008t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.mo7811i(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                EnumC3476f enumC3476f5 = AbstractC3478h.f18266a;
                return Chronology.m7890s(temporalAccessor).equals(IsoChronology.INSTANCE);
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: Q */
            public final long mo8006Q(TemporalAccessor temporalAccessor) {
                if (mo8008t(temporalAccessor)) {
                    return EnumC3476f.b0(LocalDate.m7825I(temporalAccessor));
                }
                throw new C3484n("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: C */
            public final C3485o mo8004C(TemporalAccessor temporalAccessor) {
                if (!mo8008t(temporalAccessor)) {
                    throw new C3484n("Unsupported field: WeekBasedYear");
                }
                return mo8005K();
            }

            @Override // j$.time.temporal.TemporalField
            /* renamed from: X */
            public final Temporal mo8007X(Temporal temporal, long j6) {
                if (!mo8008t(temporal)) {
                    throw new C3484n("Unsupported field: WeekBasedYear");
                }
                int iM8015a = ChronoField.YEAR.f18248b.m8015a(j6, EnumC3476f.WEEK_BASED_YEAR);
                LocalDate localDateM7825I = LocalDate.m7825I(temporal);
                int iMo7810h = localDateM7825I.mo7810h(ChronoField.DAY_OF_WEEK);
                int iA0 = EnumC3476f.a0(localDateM7825I);
                if (iA0 == 53 && EnumC3476f.c0(iM8015a) == 52) {
                    iA0 = 52;
                }
                return temporal.mo7835j(LocalDate.of(iM8015a, 1, 4).plusDays(((iA0 - 1) * 7) + (iMo7810h - r6.mo7810h(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC3476f4;
        f18262b = new EnumC3476f[]{enumC3476f, enumC3476f2, enumC3476f3, enumC3476f4};
        f18261a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static C3485o d0(LocalDate localDate) {
        return C3485o.m8013f(1L, c0(b0(localDate)));
    }

    public static int c0(int i10) {
        LocalDate localDateOf = LocalDate.of(i10, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.mo7837z()) ? 53 : 52;
        }
        return 53;
    }

    public static int a0(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iM7829Q = localDate.m7829Q() - 1;
        int i10 = (3 - iOrdinal) + iM7829Q;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iM7829Q >= i12) {
            int i13 = ((iM7829Q - i12) / 7) + 1;
            if (i13 != 53 || i12 == -3 || (i12 == -2 && localDate.mo7837z())) {
                return i13;
            }
            return 1;
        }
        if (localDate.m7829Q() != 180) {
            localDate = LocalDate.e0(localDate.f18020a, 180);
        }
        return (int) d0(localDate.minusYears(1L)).f18287d;
    }

    public static int b0(LocalDate localDate) {
        int year = localDate.getYear();
        int iM7829Q = localDate.m7829Q();
        if (iM7829Q <= 3) {
            return iM7829Q - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iM7829Q >= 363) {
            return ((iM7829Q - 363) - (localDate.mo7837z() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
