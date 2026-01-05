package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.C3491b;
import j$.time.zone.C3495f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a */
    public final LocalDateTime f18044a;

    /* renamed from: b */
    public final ZoneOffset f18045b;

    /* renamed from: c */
    public final ZoneId f18046c;

    public static ZonedDateTime now() {
        return ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), AbstractC3400b.m7885d().f18048a);
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return m7869I(localDateTime, zoneId, null);
    }

    /* renamed from: I */
    public static ZonedDateTime m7869I(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        C3495f c3495fMo7865C = zoneId.mo7865C();
        List listM8047f = c3495fMo7865C.m8047f(localDateTime);
        if (listM8047f.size() == 1) {
            zoneOffset = (ZoneOffset) listM8047f.get(0);
        } else if (listM8047f.size() != 0) {
            if (zoneOffset == null || !listM8047f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listM8047f.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objM8046e = c3495fMo7865C.m8046e(localDateTime);
            C3491b c3491b = objM8046e instanceof C3491b ? (C3491b) objM8046e : null;
            localDateTime = localDateTime.plusSeconds(Duration.m7813C(c3491b.f18310d.f18042b - c3491b.f18309c.f18042b, 0).getSeconds());
            zoneOffset = c3491b.f18310d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m7870t(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    /* renamed from: t */
    public static ZonedDateTime m7870t(long j6, int i10, ZoneId zoneId) {
        ZoneOffset zoneOffsetM8045d = zoneId.mo7865C().m8045d(Instant.ofEpochSecond(j6, i10));
        return new ZonedDateTime(LocalDateTime.m7839I(j6, i10, zoneOffsetM8045d), zoneId, zoneOffsetM8045d);
    }

    /* renamed from: C */
    public static ZonedDateTime m7868C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdM7864t = ZoneId.m7864t(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (!temporalAccessor.mo7811i(chronoField)) {
                return of(LocalDateTime.of(LocalDate.m7825I(temporalAccessor), LocalTime.m7849I(temporalAccessor)), zoneIdM7864t);
            }
            return m7870t(temporalAccessor.getLong(chronoField), temporalAccessor.mo7810h(ChronoField.NANO_OF_SECOND), zoneIdM7864t);
        } catch (C3401c e2) {
            throw new C3401c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f18044a = localDateTime;
        this.f18045b = zoneOffset;
        this.f18046c = zoneId;
    }

    /* renamed from: Q */
    public final ZonedDateTime m7874Q(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f18045b) || !this.f18046c.mo7865C().m8047f(this.f18044a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f18044a, this.f18046c, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).f18248b;
            }
            return this.f18044a.mo7812l(temporalField);
        }
        return temporalField.mo8004C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = AbstractC3489w.f18303a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new C3484n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f18045b.f18042b;
            }
            return this.f18044a.mo7810h(temporalField);
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = AbstractC3489w.f18303a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return m7887Z();
            }
            if (i10 == 2) {
                return this.f18045b.f18042b;
            }
            return this.f18044a.getLong(temporalField);
        }
        return temporalField.mo8006Q(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: o */
    public final ZoneOffset mo7879o() {
        return this.f18045b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: L */
    public final ZoneId mo7873L() {
        return this.f18046c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: G */
    public final ChronoZonedDateTime mo7871G(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f18046c.equals(zoneId) ? this : m7869I(this.f18044a, zoneId, this.f18045b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime mo7880p(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f18046c.equals(zoneId) ? this : m7870t(this.f18044a.toEpochSecond(this.f18045b), this.f18044a.f18026b.f18031d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime mo7881y() {
        return this.f18044a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate mo7878m() {
        return this.f18044a.mo7846m();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: k */
    public final LocalTime mo7877k() {
        return this.f18044a.f18026b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime mo7835j(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return m7869I(LocalDateTime.of((LocalDate) temporalAdjuster, this.f18044a.f18026b), this.f18046c, this.f18045b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return m7869I(LocalDateTime.of(this.f18044a.mo7846m(), (LocalTime) temporalAdjuster), this.f18046c, this.f18045b);
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return m7869I((LocalDateTime) temporalAdjuster, this.f18046c, this.f18045b);
        }
        if (temporalAdjuster instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) temporalAdjuster;
            return m7869I(offsetDateTime.toLocalDateTime(), this.f18046c, offsetDateTime.f18036b);
        }
        if (temporalAdjuster instanceof Instant) {
            Instant instant = (Instant) temporalAdjuster;
            return m7870t(instant.getEpochSecond(), instant.getNano(), this.f18046c);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            return m7874Q((ZoneOffset) temporalAdjuster);
        }
        return (ZonedDateTime) temporalAdjuster.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = AbstractC3489w.f18303a[chronoField.ordinal()];
            if (i10 == 1) {
                return m7870t(j6, this.f18044a.f18026b.f18031d, this.f18046c);
            }
            if (i10 != 2) {
                return m7869I(this.f18044a.mo7819a(j6, temporalField), this.f18046c, this.f18045b);
            }
            return m7874Q(ZoneOffset.ofTotalSeconds(chronoField.f18248b.m8015a(j6, chronoField)));
        }
        return (ZonedDateTime) temporalField.mo8007X(this, j6);
    }

    public ZonedDateTime withDayOfMonth(int i10) {
        LocalDateTime localDateTime = this.f18044a;
        LocalDate localDateOf = localDateTime.f18025a;
        if (localDateOf.f18022c != i10) {
            localDateOf = LocalDate.of(localDateOf.f18020a, localDateOf.f18021b, i10);
        }
        return m7869I(localDateTime.a0(localDateOf, localDateTime.f18026b), this.f18046c, this.f18045b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime mo7820b(long j6, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return m7869I(this.f18044a.mo7820b(j6, temporalUnit), this.f18046c, this.f18045b);
            }
            LocalDateTime localDateTimeMo7820b = this.f18044a.mo7820b(j6, temporalUnit);
            ZoneOffset zoneOffset = this.f18045b;
            ZoneId zoneId = this.f18046c;
            Objects.requireNonNull(localDateTimeMo7820b, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.mo7865C().m8047f(localDateTimeMo7820b).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTimeMo7820b, zoneId, zoneOffset);
            }
            return m7870t(localDateTimeMo7820b.toEpochSecond(zoneOffset), localDateTimeMo7820b.f18026b.f18031d, zoneId);
        }
        return (ZonedDateTime) temporalUnit.mo8009C(this, j6);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final ChronoZonedDateTime mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18282f) {
            return mo7878m();
        }
        return super.mo7808d(c3429e);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeM7868C = m7868C(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeMo7880p = zonedDateTimeM7868C.mo7880p(this.f18046c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.f18044a.mo7823n(zonedDateTimeMo7880p.f18044a, temporalUnit);
            }
            return new OffsetDateTime(this.f18044a, this.f18045b).mo7823n(new OffsetDateTime(zonedDateTimeMo7880p.f18044a, zonedDateTimeMo7880p.f18045b), temporalUnit);
        }
        return temporalUnit.mo8010t(this, zonedDateTimeM7868C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f18044a.equals(zonedDateTime.f18044a) && this.f18045b.equals(zonedDateTime.f18045b) && this.f18046c.equals(zonedDateTime.f18046c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18044a.hashCode() ^ this.f18045b.f18042b) ^ Integer.rotateLeft(this.f18046c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f18044a.toString() + this.f18045b.f18043c;
        ZoneOffset zoneOffset = this.f18045b;
        ZoneId zoneId = this.f18046c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new C3467q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
