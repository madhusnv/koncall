package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
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

/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f18034c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a */
    public final LocalDateTime f18035a;

    /* renamed from: b */
    public final ZoneOffset f18036b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f18036b.equals(offsetDateTime2.f18036b)) {
            iCompare = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f18035a.toEpochSecond(this.f18036b), offsetDateTime2.f18035a.toEpochSecond(offsetDateTime2.f18036b));
            if (iCompare == 0) {
                iCompare = this.f18035a.f18026b.f18031d - offsetDateTime2.f18035a.f18026b.f18031d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime.f18023c.atOffset(ZoneOffset.f18041g);
        LocalDateTime.f18024d.atOffset(ZoneOffset.f18040f);
    }

    /* renamed from: t */
    public static OffsetDateTime m7858t(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetM8045d = zoneId.mo7865C().m8045d(instant);
        return new OffsetDateTime(LocalDateTime.m7839I(instant.getEpochSecond(), instant.getNano(), zoneOffsetM8045d), zoneOffsetM8045d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetA0 = ZoneOffset.a0(temporal);
                LocalDate localDate = (LocalDate) temporal.mo7808d(AbstractC3483m.f18282f);
                LocalTime localTime = (LocalTime) temporal.mo7808d(AbstractC3483m.f18283g);
                if (localDate != null && localTime != null) {
                    temporal = new OffsetDateTime(LocalDateTime.of(localDate, localTime), zoneOffsetA0);
                } else {
                    temporal = m7858t(Instant.from(temporal), zoneOffsetA0);
                }
            } catch (C3401c e2) {
                throw new C3401c("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.f18036b;
            boolean zEquals = zoneOffset.equals(temporal.f18036b);
            OffsetDateTime offsetDateTime = temporal;
            if (!zEquals) {
                offsetDateTime = new OffsetDateTime(temporal.f18035a.plusSeconds(zoneOffset.f18042b - temporal.f18036b.f18042b), zoneOffset);
            }
            return this.f18035a.mo7823n(offsetDateTime.f18035a, temporalUnit);
        }
        return temporalUnit.mo8010t(this, temporal);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f18035a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f18036b = zoneOffset;
    }

    /* renamed from: I */
    public final OffsetDateTime m7860I(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f18035a == localDateTime && this.f18036b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return this.f18035a.mo7812l(temporalField);
            }
            return ((ChronoField) temporalField).f18248b;
        }
        return temporalField.mo8004C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = AbstractC3463m.f18229a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new C3484n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f18036b.f18042b;
            }
            return this.f18035a.mo7810h(temporalField);
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = AbstractC3463m.f18229a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return this.f18035a.toEpochSecond(this.f18036b);
            }
            if (i10 == 2) {
                return this.f18036b.f18042b;
            }
            return this.f18035a.getLong(temporalField);
        }
        return temporalField.mo8006Q(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f18035a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        if (localDate != null) {
            return m7860I(this.f18035a.mo7822e(localDate), this.f18036b);
        }
        return (OffsetDateTime) localDate.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a */
    public final Temporal mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = AbstractC3463m.f18229a[chronoField.ordinal()];
            if (i10 == 1) {
                return m7858t(Instant.ofEpochSecond(j6, this.f18035a.f18026b.f18031d), this.f18036b);
            }
            if (i10 == 2) {
                return m7860I(this.f18035a, ZoneOffset.ofTotalSeconds(chronoField.f18248b.m8015a(j6, chronoField)));
            }
            return m7860I(this.f18035a.mo7819a(j6, temporalField), this.f18036b);
        }
        return (OffsetDateTime) temporalField.mo8007X(this, j6);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime mo7820b(long j6, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m7860I(this.f18035a.mo7820b(j6, temporalUnit), this.f18036b);
        }
        return (OffsetDateTime) temporalUnit.mo8009C(this, j6);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18280d || c3429e == AbstractC3483m.f18281e) {
            return this.f18036b;
        }
        if (c3429e == AbstractC3483m.f18277a) {
            return null;
        }
        if (c3429e == AbstractC3483m.f18282f) {
            return this.f18035a.mo7846m();
        }
        if (c3429e == AbstractC3483m.f18283g) {
            return this.f18035a.f18026b;
        }
        if (c3429e == AbstractC3483m.f18278b) {
            return IsoChronology.INSTANCE;
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.NANOS;
        }
        return c3429e.m7936l(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        return temporal.mo7819a(this.f18035a.mo7846m().toEpochDay(), ChronoField.EPOCH_DAY).mo7819a(this.f18035a.f18026b.g0(), ChronoField.NANO_OF_DAY).mo7819a(this.f18036b.f18042b, ChronoField.OFFSET_SECONDS);
    }

    public Instant toInstant() {
        return this.f18035a.toInstant(this.f18036b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f18035a.equals(offsetDateTime.f18035a) && this.f18036b.equals(offsetDateTime.f18036b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18035a.hashCode() ^ this.f18036b.f18042b;
    }

    public final String toString() {
        return this.f18035a.toString() + this.f18036b.f18043c;
    }

    private Object writeReplace() {
        return new C3467q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
