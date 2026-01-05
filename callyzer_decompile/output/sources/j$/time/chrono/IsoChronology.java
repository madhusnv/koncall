package j$.time.chrono;

import j$.time.AbstractC3400b;
import j$.time.C3401c;
import j$.time.C3469s;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class IsoChronology extends AbstractC3402a implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.Chronology
    /* renamed from: D */
    public final InterfaceC3411j mo7893D(int i10) {
        if (i10 == 0) {
            return EnumC3417p.BCE;
        }
        if (i10 == 1) {
            return EnumC3417p.CE;
        }
        throw new C3401c("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: r */
    public final String mo7904r() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: v */
    public final String mo7905v() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: R */
    public final ChronoLocalDate mo7899R(int i10, int i11, int i12) {
        return LocalDate.of(i10, i11, i12);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: x */
    public final ChronoLocalDate mo7907x(int i10, int i11) {
        return LocalDate.e0(i10, i11);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: q */
    public final ChronoLocalDate mo7903q(long j6) {
        return LocalDate.d0(j6);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: J */
    public final ChronoLocalDate mo7896J(TemporalAccessor temporalAccessor) {
        return LocalDate.m7825I(temporalAccessor);
    }

    private IsoChronology() {
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: O */
    public final ChronoLocalDateTime mo7898O(TemporalAccessor temporalAccessor) {
        return LocalDateTime.m7838C(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: w */
    public final ChronoZonedDateTime mo7906w(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.m7868C(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: U */
    public final ChronoZonedDateTime mo7901U(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: N */
    public final ChronoLocalDate mo7897N() {
        return LocalDate.m7825I(LocalDate.c0(AbstractC3400b.m7885d()));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: Y */
    public final boolean mo7902Y(long j6) {
        if ((3 & j6) == 0) {
            return j6 % 100 != 0 || j6 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: F */
    public final int mo7895F(InterfaceC3411j interfaceC3411j, int i10) {
        if (interfaceC3411j instanceof EnumC3417p) {
            return interfaceC3411j == EnumC3417p.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: B */
    public final List mo7892B() {
        return AbstractC3400b.m7884c(EnumC3417p.values());
    }

    @Override // j$.time.chrono.AbstractC3402a, j$.time.chrono.Chronology
    /* renamed from: T */
    public final ChronoLocalDate mo7900T(Map map, j$.time.format.b0 b0Var) {
        return (LocalDate) super.mo7900T(map, b0Var);
    }

    @Override // j$.time.chrono.AbstractC3402a
    /* renamed from: Q */
    public final void mo7908Q(Map map, j$.time.format.b0 b0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                chronoField.a0(l9.longValue());
            }
            AbstractC3402a.m7913t(map, ChronoField.MONTH_OF_YEAR, ((int) Math.floorMod(l9.longValue(), r4)) + 1);
            AbstractC3402a.m7913t(map, ChronoField.YEAR, Math.floorDiv(l9.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC3402a
    public final ChronoLocalDate a0(Map map, j$.time.format.b0 b0Var) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l9 = (Long) map.remove(chronoField);
        if (l9 != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                chronoField.a0(l9.longValue());
            }
            Long l10 = (Long) map.remove(ChronoField.ERA);
            if (l10 != null) {
                if (l10.longValue() == 1) {
                    AbstractC3402a.m7913t(map, ChronoField.YEAR, l9.longValue());
                    return null;
                }
                if (l10.longValue() == 0) {
                    AbstractC3402a.m7913t(map, ChronoField.YEAR, Math.subtractExact(1L, l9.longValue()));
                    return null;
                }
                throw new C3401c("Invalid value for era: " + l10);
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            Long l11 = (Long) map.get(chronoField2);
            if (b0Var != j$.time.format.b0.STRICT) {
                AbstractC3402a.m7913t(map, chronoField2, (l11 == null || l11.longValue() > 0) ? l9.longValue() : Math.subtractExact(1L, l9.longValue()));
                return null;
            }
            if (l11 != null) {
                long jLongValue = l11.longValue();
                long jLongValue2 = l9.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractC3402a.m7913t(map, chronoField2, jLongValue2);
                return null;
            }
            map.put(chronoField, l9);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        chronoField3.a0(((Long) map.get(chronoField3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC3402a
    /* renamed from: X */
    public final ChronoLocalDate mo7909X(Map map, j$.time.format.b0 b0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iM8015a = chronoField.f18248b.m8015a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z6 = true;
        if (b0Var == j$.time.format.b0.LENIENT) {
            return LocalDate.of(iM8015a, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iM8015a2 = chronoField2.f18248b.m8015a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iM8015a3 = chronoField3.f18248b.m8015a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (b0Var == j$.time.format.b0.SMART) {
            if (iM8015a2 == 4 || iM8015a2 == 6 || iM8015a2 == 9 || iM8015a2 == 11) {
                iM8015a3 = Math.min(iM8015a3, 30);
            } else if (iM8015a2 == 2) {
                Month month = Month.FEBRUARY;
                long j6 = iM8015a;
                int i10 = C3469s.f18242b;
                if ((3 & j6) != 0 || (j6 % 100 == 0 && j6 % 400 != 0)) {
                    z6 = false;
                }
                iM8015a3 = Math.min(iM8015a3, month.m7855C(z6));
            }
        }
        return LocalDate.of(iM8015a, iM8015a2, iM8015a3);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: A */
    public final C3485o mo7891A(ChronoField chronoField) {
        return chronoField.f18248b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new a0((byte) 1, this);
    }
}
