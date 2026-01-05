package j$.time.chrono;

import j$.time.C3429e;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    /* renamed from: G */
    ChronoZonedDateTime mo7871G(ZoneId zoneId);

    /* renamed from: L */
    ZoneId mo7873L();

    @Override // j$.time.temporal.Temporal
    /* renamed from: a */
    ChronoZonedDateTime mo7819a(long j6, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    /* renamed from: b */
    ChronoZonedDateTime mo7820b(long j6, TemporalUnit temporalUnit);

    /* renamed from: o */
    ZoneOffset mo7879o();

    /* renamed from: p */
    ChronoZonedDateTime mo7880p(ZoneId zoneId);

    /* renamed from: y */
    ChronoLocalDateTime mo7881y();

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    default C3485o mo7812l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return mo7881y().mo7812l(temporalField);
            }
            return ((ChronoField) temporalField).f18248b;
        }
        return temporalField.mo8004C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    default int mo7810h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = AbstractC3408g.f18068a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new C3484n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 != 2) {
                return mo7881y().mo7810h(temporalField);
            }
            return mo7879o().f18042b;
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = AbstractC3408g.f18068a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return m7887Z();
            }
            if (i10 != 2) {
                return mo7881y().getLong(temporalField);
            }
            return mo7879o().f18042b;
        }
        return temporalField.mo8006Q(this);
    }

    /* renamed from: m */
    default ChronoLocalDate mo7878m() {
        return mo7881y().mo7846m();
    }

    /* renamed from: k */
    default LocalTime mo7877k() {
        return mo7881y().mo7845k();
    }

    /* renamed from: g */
    default Chronology m7888g() {
        return mo7878m().mo7834g();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    default ChronoZonedDateTime mo7835j(TemporalAdjuster temporalAdjuster) {
        return C3410i.m7928t(m7888g(), temporalAdjuster.mo7809f(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    default ChronoZonedDateTime mo7821c(long j6, TemporalUnit temporalUnit) {
        return C3410i.m7928t(m7888g(), super.mo7821c(j6, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    default Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18281e || c3429e == AbstractC3483m.f18277a) {
            return mo7873L();
        }
        if (c3429e == AbstractC3483m.f18280d) {
            return mo7879o();
        }
        if (c3429e == AbstractC3483m.f18283g) {
            return mo7877k();
        }
        if (c3429e == AbstractC3483m.f18278b) {
            return m7888g();
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.NANOS;
        }
        return c3429e.m7936l(this);
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(m7887Z(), mo7877k().f18031d);
    }

    /* renamed from: Z */
    default long m7887Z() {
        return ((mo7878m().toEpochDay() * 86400) + mo7877k().h0()) - mo7879o().f18042b;
    }

    @Override // java.lang.Comparable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(m7887Z(), chronoZonedDateTime.m7887Z());
        return (iCompare == 0 && (iCompare = mo7877k().f18031d - chronoZonedDateTime.mo7877k().f18031d) == 0 && (iCompare = mo7881y().compareTo(chronoZonedDateTime.mo7881y())) == 0 && (iCompare = mo7873L().mo7867r().compareTo(chronoZonedDateTime.mo7873L().mo7867r())) == 0) ? m7888g().compareTo(chronoZonedDateTime.m7888g()) : iCompare;
    }
}
