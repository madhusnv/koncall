package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: j$.time.chrono.e */
/* loaded from: classes2.dex */
public final class C3406e implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a */
    public final transient ChronoLocalDate f18059a;

    /* renamed from: b */
    public final transient LocalTime f18060b;

    /* renamed from: t */
    public static C3406e m7919t(Chronology chronology, Temporal temporal) {
        C3406e c3406e = (C3406e) temporal;
        if (chronology.equals(c3406e.m7886g())) {
            return c3406e;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.mo7904r() + ", actual: " + c3406e.m7886g().mo7904r());
    }

    public C3406e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.f18059a = chronoLocalDate;
        this.f18060b = localTime;
    }

    /* renamed from: Q */
    public final C3406e m7923Q(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.f18059a;
        return (chronoLocalDate == temporal && this.f18060b == localTime) ? this : new C3406e(AbstractC3404c.m7914t(chronoLocalDate.mo7834g(), temporal), localTime);
    }

    public final int hashCode() {
        return this.f18059a.hashCode() ^ this.f18060b.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: m */
    public final ChronoLocalDate mo7846m() {
        return this.f18059a;
    }

    public final String toString() {
        return this.f18059a.toString() + "T" + this.f18060b.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: k */
    public final LocalTime mo7845k() {
        return this.f18060b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.mo8008t(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.b0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (((ChronoField) temporalField).b0() ? this.f18060b : this.f18059a).mo7812l(temporalField);
        }
        return temporalField.mo8004C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).b0() ? this.f18060b.mo7810h(temporalField) : this.f18059a.mo7810h(temporalField);
        }
        return mo7812l(temporalField).m8015a(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).b0() ? this.f18060b.getLong(temporalField) : this.f18059a.getLong(temporalField);
        }
        return temporalField.mo8006Q(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C3406e mo7835j(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof ChronoLocalDate) {
            return m7923Q((ChronoLocalDate) temporalAdjuster, this.f18060b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return m7923Q(this.f18059a, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof C3406e) {
            return m7919t(this.f18059a.mo7834g(), (C3406e) temporalAdjuster);
        }
        return m7919t(this.f18059a.mo7834g(), (C3406e) temporalAdjuster.mo7809f(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C3406e mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).b0()) {
                return m7923Q(this.f18059a, this.f18060b.mo7819a(j6, temporalField));
            }
            return m7923Q(this.f18059a.mo7819a(j6, temporalField), this.f18060b);
        }
        return m7919t(this.f18059a.mo7834g(), temporalField.mo8007X(this, j6));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C3406e mo7820b(long j6, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return m7919t(this.f18059a.mo7834g(), temporalUnit.mo8009C(this, j6));
        }
        switch (AbstractC3405d.f18057a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m7921I(this.f18059a, 0L, 0L, 0L, j6);
            case 2:
                C3406e c3406eM7923Q = m7923Q(this.f18059a.mo7820b(j6 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.f18060b);
                return c3406eM7923Q.m7921I(c3406eM7923Q.f18059a, 0L, 0L, 0L, (j6 % 86400000000L) * 1000);
            case 3:
                C3406e c3406eM7923Q2 = m7923Q(this.f18059a.mo7820b(j6 / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.f18060b);
                return c3406eM7923Q2.m7921I(c3406eM7923Q2.f18059a, 0L, 0L, 0L, (j6 % 86400000) * 1000000);
            case 4:
                return m7921I(this.f18059a, 0L, 0L, j6, 0L);
            case 5:
                return m7921I(this.f18059a, 0L, j6, 0L, 0L);
            case 6:
                return m7921I(this.f18059a, j6, 0L, 0L, 0L);
            case 7:
                C3406e c3406eM7923Q3 = m7923Q(this.f18059a.mo7820b(j6 / 256, (TemporalUnit) ChronoUnit.DAYS), this.f18060b);
                return c3406eM7923Q3.m7921I(c3406eM7923Q3.f18059a, (j6 % 256) * 12, 0L, 0L, 0L);
            default:
                return m7923Q(this.f18059a.mo7820b(j6, temporalUnit), this.f18060b);
        }
    }

    /* renamed from: I */
    public final C3406e m7921I(ChronoLocalDate chronoLocalDate, long j6, long j10, long j11, long j12) {
        if ((j6 | j10 | j11 | j12) == 0) {
            return m7923Q(chronoLocalDate, this.f18060b);
        }
        long j13 = j6 / 24;
        long j14 = ((j6 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jG0 = this.f18060b.g0();
        long j15 = j14 + jG0;
        long jFloorDiv = Math.floorDiv(j15, 86400000000000L) + j13 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long jFloorMod = Math.floorMod(j15, 86400000000000L);
        return m7923Q(chronoLocalDate.mo7820b(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == jG0 ? this.f18060b : LocalTime.m7851X(jFloorMod));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: H */
    public final ChronoZonedDateTime mo7840H(ZoneId zoneId) {
        return C3410i.m7926C(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime chronoLocalDateTimeMo7898O = m7886g().mo7898O(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.mo8010t(this, chronoLocalDateTimeMo7898O);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            ChronoLocalDate chronoLocalDateMo7846m = chronoLocalDateTimeMo7898O.mo7846m();
            if (chronoLocalDateTimeMo7898O.mo7845k().compareTo(this.f18060b) < 0) {
                chronoLocalDateMo7846m = chronoLocalDateMo7846m.mo7821c(1L, (TemporalUnit) chronoUnit2);
            }
            return this.f18059a.mo7823n(chronoLocalDateMo7846m, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long jMultiplyExact = chronoLocalDateTimeMo7898O.getLong(chronoField) - this.f18059a.getLong(chronoField);
        switch (AbstractC3405d.f18057a[chronoUnit.ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400);
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                break;
        }
        return Math.addExact(jMultiplyExact, this.f18060b.mo7823n(chronoLocalDateTimeMo7898O.mo7845k(), temporalUnit));
    }

    private Object writeReplace() {
        return new a0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }
}
