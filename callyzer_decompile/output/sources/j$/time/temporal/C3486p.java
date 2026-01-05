package j$.time.temporal;

import j$.time.C3401c;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* renamed from: j$.time.temporal.p */
/* loaded from: classes2.dex */
public final class C3486p implements TemporalField {

    /* renamed from: f */
    public static final C3485o f18288f = C3485o.m8013f(1, 7);

    /* renamed from: g */
    public static final C3485o f18289g = C3485o.m8014g(0, 4, 6);

    /* renamed from: h */
    public static final C3485o f18290h = C3485o.m8014g(0, 52, 54);

    /* renamed from: i */
    public static final C3485o f18291i = C3485o.m8014g(1, 52, 53);

    /* renamed from: a */
    public final String f18292a;

    /* renamed from: b */
    public final WeekFields f18293b;

    /* renamed from: c */
    public final TemporalUnit f18294c;

    /* renamed from: d */
    public final TemporalUnit f18295d;

    /* renamed from: e */
    public final C3485o f18296e;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    /* renamed from: e */
    public final ChronoLocalDate m8024e(Chronology chronology, int i10, int i11, int i12) {
        ChronoLocalDate chronoLocalDateMo7899R = chronology.mo7899R(i10, 1, 1);
        int iM8027h = m8027h(1, m8021b(chronoLocalDateMo7899R));
        int i13 = i12 - 1;
        return chronoLocalDateMo7899R.mo7820b(((Math.min(i11, m8020a(iM8027h, chronoLocalDateMo7899R.mo7831V() + this.f18293b.f18255b) - 1) - 1) * 7) + i13 + (-iM8027h), (TemporalUnit) ChronoUnit.DAYS);
    }

    public C3486p(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, C3485o c3485o) {
        this.f18292a = str;
        this.f18293b = weekFields;
        this.f18294c = temporalUnit;
        this.f18295d = temporalUnit2;
        this.f18296e = c3485o;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: Q */
    public final long mo8006Q(TemporalAccessor temporalAccessor) {
        int iM8022c;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f18295d;
        if (temporalUnit == chronoUnit) {
            iM8022c = m8021b(temporalAccessor);
        } else if (temporalUnit != ChronoUnit.MONTHS) {
            if (temporalUnit != ChronoUnit.YEARS) {
                if (temporalUnit == WeekFields.f18253h) {
                    iM8022c = m8023d(temporalAccessor);
                } else if (temporalUnit == ChronoUnit.FOREVER) {
                    iM8022c = m8022c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
            } else {
                int iM8021b = m8021b(temporalAccessor);
                int iMo7810h = temporalAccessor.mo7810h(ChronoField.DAY_OF_YEAR);
                iM8022c = m8020a(m8027h(iMo7810h, iM8021b), iMo7810h);
            }
        } else {
            int iM8021b2 = m8021b(temporalAccessor);
            int iMo7810h2 = temporalAccessor.mo7810h(ChronoField.DAY_OF_MONTH);
            iM8022c = m8020a(m8027h(iMo7810h2, iM8021b2), iMo7810h2);
        }
        return iM8022c;
    }

    /* renamed from: b */
    public final int m8021b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.mo7810h(ChronoField.DAY_OF_WEEK) - this.f18293b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    /* renamed from: c */
    public final int m8022c(TemporalAccessor temporalAccessor) {
        int iM8021b = m8021b(temporalAccessor);
        int iMo7810h = temporalAccessor.mo7810h(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iMo7810h2 = temporalAccessor.mo7810h(chronoField);
        int iM8027h = m8027h(iMo7810h2, iM8021b);
        int iM8020a = m8020a(iM8027h, iMo7810h2);
        return iM8020a == 0 ? iMo7810h - 1 : iM8020a >= m8020a(iM8027h, ((int) temporalAccessor.mo7812l(chronoField).f18287d) + this.f18293b.f18255b) ? iMo7810h + 1 : iMo7810h;
    }

    /* renamed from: d */
    public final int m8023d(TemporalAccessor temporalAccessor) {
        int iM8020a;
        int iM8021b = m8021b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iMo7810h = temporalAccessor.mo7810h(chronoField);
        int iM8027h = m8027h(iMo7810h, iM8021b);
        int iM8020a2 = m8020a(iM8027h, iMo7810h);
        if (iM8020a2 == 0) {
            return m8023d(Chronology.m7890s(temporalAccessor).mo7896J(temporalAccessor).mo7821c(iMo7810h, (TemporalUnit) ChronoUnit.DAYS));
        }
        return (iM8020a2 <= 50 || iM8020a2 < (iM8020a = m8020a(iM8027h, ((int) temporalAccessor.mo7812l(chronoField).f18287d) + this.f18293b.f18255b))) ? iM8020a2 : (iM8020a2 - iM8020a) + 1;
    }

    /* renamed from: h */
    public final int m8027h(int i10, int i11) {
        int iFloorMod = Math.floorMod(i10 - i11, 7);
        return iFloorMod + 1 > this.f18293b.f18255b ? 7 - iFloorMod : -iFloorMod;
    }

    /* renamed from: a */
    public static int m8020a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: X */
    public final Temporal mo8007X(Temporal temporal, long j6) {
        if (this.f18296e.m8015a(j6, this) == temporal.mo7810h(this)) {
            return temporal;
        }
        if (this.f18295d != ChronoUnit.FOREVER) {
            return temporal.mo7820b(r0 - r1, this.f18294c);
        }
        WeekFields weekFields = this.f18293b;
        return m8024e(Chronology.m7890s(temporal), (int) j6, temporal.mo7810h(weekFields.f18258e), temporal.mo7810h(weekFields.f18256c));
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: I */
    public final TemporalAccessor mo8011I(Map map, a0 a0Var, b0 b0Var) {
        ChronoLocalDate chronoLocalDateMo7820b;
        ChronoLocalDate chronoLocalDateMo7820b2;
        ChronoLocalDate chronoLocalDateMo7820b3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        C3485o c3485o = this.f18296e;
        WeekFields weekFields = this.f18293b;
        TemporalUnit temporalUnit = this.f18295d;
        if (temporalUnit == chronoUnit) {
            long jFloorMod = Math.floorMod((c3485o.m8015a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int iFloorMod = Math.floorMod(chronoField.f18248b.m8015a(((Long) map.get(chronoField)).longValue(), chronoField) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyM7890s = Chronology.m7890s(a0Var);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            if ((temporalUnit != WeekFields.f18253h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(weekFields.f18259f) || !map.containsKey(weekFields.f18258e)) {
                return null;
            }
            C3486p c3486p = weekFields.f18259f;
            int iM8015a = c3486p.f18296e.m8015a(((Long) map.get(c3486p)).longValue(), weekFields.f18259f);
            if (b0Var == b0.LENIENT) {
                chronoLocalDateMo7820b = m8024e(chronologyM7890s, iM8015a, 1, iFloorMod).mo7820b(Math.subtractExact(((Long) map.get(weekFields.f18258e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                C3486p c3486p2 = weekFields.f18258e;
                ChronoLocalDate chronoLocalDateM8024e = m8024e(chronologyM7890s, iM8015a, c3486p2.f18296e.m8015a(((Long) map.get(c3486p2)).longValue(), weekFields.f18258e), iFloorMod);
                if (b0Var == b0.STRICT && m8022c(chronoLocalDateM8024e) != iM8015a) {
                    throw new C3401c("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateMo7820b = chronoLocalDateM8024e;
            }
            map.remove(this);
            map.remove(weekFields.f18259f);
            map.remove(weekFields.f18258e);
            map.remove(chronoField);
            return chronoLocalDateMo7820b;
        }
        int iM8015a2 = chronoField2.f18248b.m8015a(((Long) map.get(chronoField2)).longValue(), chronoField2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                long jLongValue2 = ((Long) map.get(chronoField3)).longValue();
                long j6 = intExact;
                if (b0Var == b0.LENIENT) {
                    ChronoLocalDate chronoLocalDateMo7820b4 = chronologyM7890s.mo7899R(iM8015a2, 1, 1).mo7820b(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iM8021b = m8021b(chronoLocalDateMo7820b4);
                    int iMo7810h = chronoLocalDateMo7820b4.mo7810h(ChronoField.DAY_OF_MONTH);
                    chronoLocalDateMo7820b3 = chronoLocalDateMo7820b4.mo7820b(Math.addExact(Math.multiplyExact(Math.subtractExact(j6, m8020a(m8027h(iMo7810h, iM8021b), iMo7810h)), 7), iFloorMod - m8021b(chronoLocalDateMo7820b4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateMo7899R = chronologyM7890s.mo7899R(iM8015a2, chronoField3.f18248b.m8015a(jLongValue2, chronoField3), 1);
                    long jM8015a = c3485o.m8015a(j6, this);
                    int iM8021b2 = m8021b(chronoLocalDateMo7899R);
                    int iMo7810h2 = chronoLocalDateMo7899R.mo7810h(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateMo7820b5 = chronoLocalDateMo7899R.mo7820b((((int) (jM8015a - m8020a(m8027h(iMo7810h2, iM8021b2), iMo7810h2))) * 7) + (iFloorMod - m8021b(chronoLocalDateMo7899R)), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var == b0.STRICT && chronoLocalDateMo7820b5.getLong(chronoField3) != jLongValue2) {
                        throw new C3401c("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDateMo7820b3 = chronoLocalDateMo7820b5;
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField3);
                map.remove(chronoField);
                return chronoLocalDateMo7820b3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j10 = intExact;
        ChronoLocalDate chronoLocalDateMo7899R2 = chronologyM7890s.mo7899R(iM8015a2, 1, 1);
        if (b0Var == b0.LENIENT) {
            int iM8021b3 = m8021b(chronoLocalDateMo7899R2);
            int iMo7810h3 = chronoLocalDateMo7899R2.mo7810h(ChronoField.DAY_OF_YEAR);
            chronoLocalDateMo7820b2 = chronoLocalDateMo7899R2.mo7820b(Math.addExact(Math.multiplyExact(Math.subtractExact(j10, m8020a(m8027h(iMo7810h3, iM8021b3), iMo7810h3)), 7), iFloorMod - m8021b(chronoLocalDateMo7899R2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jM8015a2 = c3485o.m8015a(j10, this);
            int iM8021b4 = m8021b(chronoLocalDateMo7899R2);
            int iMo7810h4 = chronoLocalDateMo7899R2.mo7810h(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateMo7820b6 = chronoLocalDateMo7899R2.mo7820b((((int) (jM8015a2 - m8020a(m8027h(iMo7810h4, iM8021b4), iMo7810h4))) * 7) + (iFloorMod - m8021b(chronoLocalDateMo7899R2)), (TemporalUnit) ChronoUnit.DAYS);
            if (b0Var == b0.STRICT && chronoLocalDateMo7820b6.getLong(chronoField2) != iM8015a2) {
                throw new C3401c("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateMo7820b2 = chronoLocalDateMo7820b6;
        }
        map.remove(this);
        map.remove(chronoField2);
        map.remove(chronoField);
        return chronoLocalDateMo7820b2;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: K */
    public final C3485o mo8005K() {
        return this.f18296e;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: t */
    public final boolean mo8008t(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.mo7811i(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f18295d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.mo7811i(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.mo7811i(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f18253h) {
            return temporalAccessor.mo7811i(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.mo7811i(ChronoField.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    /* renamed from: C */
    public final C3485o mo8004C(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f18295d;
        if (temporalUnit == chronoUnit) {
            return this.f18296e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return m8025f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return m8025f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f18253h) {
            return m8026g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.f18248b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    /* renamed from: f */
    public final C3485o m8025f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iM8027h = m8027h(temporalAccessor.mo7810h(chronoField), m8021b(temporalAccessor));
        C3485o c3485oMo7812l = temporalAccessor.mo7812l(chronoField);
        return C3485o.m8013f(m8020a(iM8027h, (int) c3485oMo7812l.f18284a), m8020a(iM8027h, (int) c3485oMo7812l.f18287d));
    }

    /* renamed from: g */
    public final C3485o m8026g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.mo7811i(chronoField)) {
            return f18290h;
        }
        int iM8021b = m8021b(temporalAccessor);
        int iMo7810h = temporalAccessor.mo7810h(chronoField);
        int iM8027h = m8027h(iMo7810h, iM8021b);
        int iM8020a = m8020a(iM8027h, iMo7810h);
        if (iM8020a != 0) {
            if (iM8020a >= m8020a(iM8027h, this.f18293b.f18255b + ((int) temporalAccessor.mo7812l(chronoField).f18287d))) {
                return m8026g(Chronology.m7890s(temporalAccessor).mo7896J(temporalAccessor).mo7820b((r0 - iMo7810h) + 8, (TemporalUnit) ChronoUnit.DAYS));
            }
            return C3485o.m8013f(1L, r1 - 1);
        }
        return m8026g(Chronology.m7890s(temporalAccessor).mo7896J(temporalAccessor).mo7821c(iMo7810h + 7, (TemporalUnit) ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.f18292a + "[" + this.f18293b.toString() + "]";
    }
}
