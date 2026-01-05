package j$.time.chrono;

import j$.time.C3429e;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: H */
    ChronoZonedDateTime mo7840H(ZoneId zoneId);

    @Override // j$.time.temporal.Temporal
    /* renamed from: a */
    ChronoLocalDateTime mo7819a(long j6, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    /* renamed from: b */
    ChronoLocalDateTime mo7820b(long j6, TemporalUnit temporalUnit);

    /* renamed from: k */
    LocalTime mo7845k();

    /* renamed from: m */
    ChronoLocalDate mo7846m();

    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ default int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    /* renamed from: g */
    default Chronology m7886g() {
        return mo7846m().mo7834g();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    default ChronoLocalDateTime mo7835j(TemporalAdjuster temporalAdjuster) {
        return C3406e.m7919t(m7886g(), temporalAdjuster.mo7809f(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    default ChronoLocalDateTime mo7821c(long j6, TemporalUnit temporalUnit) {
        return C3406e.m7919t(m7886g(), super.mo7821c(j6, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    default Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18277a || c3429e == AbstractC3483m.f18281e || c3429e == AbstractC3483m.f18280d) {
            return null;
        }
        if (c3429e == AbstractC3483m.f18283g) {
            return mo7845k();
        }
        if (c3429e == AbstractC3483m.f18278b) {
            return m7886g();
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.NANOS;
        }
        return c3429e.m7936l(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    default Temporal mo7809f(Temporal temporal) {
        return temporal.mo7819a(mo7846m().toEpochDay(), ChronoField.EPOCH_DAY).mo7819a(mo7845k().g0(), ChronoField.NANO_OF_DAY);
    }

    default Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), mo7845k().f18031d);
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((mo7846m().toEpochDay() * 86400) + mo7845k().h0()) - zoneOffset.f18042b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = mo7846m().compareTo(chronoLocalDateTime.mo7846m());
        return (iCompareTo == 0 && (iCompareTo = mo7845k().compareTo(chronoLocalDateTime.mo7845k())) == 0) ? m7886g().compareTo(chronoLocalDateTime.m7886g()) : iCompareTo;
    }
}
