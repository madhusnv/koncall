package j$.time.chrono;

import j$.time.AbstractC3428d;
import j$.time.C3429e;
import j$.time.LocalTime;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.InterfaceC3482l;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes2.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    /* renamed from: g */
    Chronology mo7834g();

    int hashCode();

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    long mo7823n(Temporal temporal, TemporalUnit temporalUnit);

    String toString();

    /* renamed from: M */
    default ChronoLocalDateTime mo7827M(LocalTime localTime) {
        return new C3406e(this, localTime);
    }

    /* renamed from: P */
    default InterfaceC3411j mo7828P() {
        return mo7834g().mo7893D(mo7810h(ChronoField.ERA));
    }

    /* renamed from: z */
    default boolean mo7837z() {
        return mo7834g().mo7902Y(getLong(ChronoField.YEAR));
    }

    /* renamed from: V */
    default int mo7831V() {
        return mo7837z() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    default boolean mo7811i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j */
    default ChronoLocalDate mo7835j(TemporalAdjuster temporalAdjuster) {
        return AbstractC3404c.m7914t(mo7834g(), temporalAdjuster.mo7809f(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a */
    default ChronoLocalDate mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
        return AbstractC3404c.m7914t(mo7834g(), temporalField.mo8007X(this, j6));
    }

    /* renamed from: S */
    default ChronoLocalDate mo7830S(InterfaceC3482l interfaceC3482l) {
        return AbstractC3404c.m7914t(mo7834g(), interfaceC3482l.mo7815t(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b */
    default ChronoLocalDate mo7820b(long j6, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            throw new C3484n("Unsupported unit: " + temporalUnit);
        }
        return AbstractC3404c.m7914t(mo7834g(), temporalUnit.mo8009C(this, j6));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    default ChronoLocalDate mo7821c(long j6, TemporalUnit temporalUnit) {
        return AbstractC3404c.m7914t(mo7834g(), super.mo7821c(j6, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    default Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18277a || c3429e == AbstractC3483m.f18281e || c3429e == AbstractC3483m.f18280d || c3429e == AbstractC3483m.f18283g) {
            return null;
        }
        if (c3429e == AbstractC3483m.f18278b) {
            return mo7834g();
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.DAYS;
        }
        return c3429e.m7936l(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    default Temporal mo7809f(Temporal temporal) {
        return temporal.mo7819a(toEpochDay(), ChronoField.EPOCH_DAY);
    }

    default long toEpochDay() {
        return getLong(ChronoField.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: W */
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC3402a) mo7834g()).compareTo(chronoLocalDate.mo7834g());
    }
}
