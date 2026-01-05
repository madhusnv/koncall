package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.C3491b;
import j$.time.zone.C3495f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* renamed from: j$.time.chrono.i */
/* loaded from: classes2.dex */
public final class C3410i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a */
    public final transient C3406e f18070a;

    /* renamed from: b */
    public final transient ZoneOffset f18071b;

    /* renamed from: c */
    public final transient ZoneId f18072c;

    /* renamed from: C */
    public static C3410i m7926C(ZoneId zoneId, ZoneOffset zoneOffset, C3406e c3406e) {
        Objects.requireNonNull(c3406e, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new C3410i(zoneId, (ZoneOffset) zoneId, c3406e);
        }
        C3495f c3495fMo7865C = zoneId.mo7865C();
        LocalDateTime localDateTimeM7838C = LocalDateTime.m7838C(c3406e);
        List listM8047f = c3495fMo7865C.m8047f(localDateTimeM7838C);
        if (listM8047f.size() == 1) {
            zoneOffset = (ZoneOffset) listM8047f.get(0);
        } else if (listM8047f.size() != 0) {
            if (zoneOffset == null || !listM8047f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listM8047f.get(0);
            }
            c3406e = c3406e;
        } else {
            Object objM8046e = c3495fMo7865C.m8046e(localDateTimeM7838C);
            C3491b c3491b = objM8046e instanceof C3491b ? (C3491b) objM8046e : null;
            c3406e = c3406e.m7921I(c3406e.f18059a, 0L, 0L, Duration.m7813C(c3491b.f18310d.f18042b - c3491b.f18309c.f18042b, 0).getSeconds(), 0L);
            zoneOffset = c3491b.f18310d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new C3410i(zoneId, zoneOffset, c3406e);
    }

    /* renamed from: I */
    public static C3410i m7927I(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetM8045d = zoneId.mo7865C().m8045d(instant);
        Objects.requireNonNull(zoneOffsetM8045d, "offset");
        return new C3410i(zoneId, zoneOffsetM8045d, (C3406e) chronology.mo7898O(LocalDateTime.m7839I(instant.getEpochSecond(), instant.getNano(), zoneOffsetM8045d)));
    }

    /* renamed from: t */
    public static C3410i m7928t(Chronology chronology, Temporal temporal) {
        C3410i c3410i = (C3410i) temporal;
        if (chronology.equals(c3410i.m7888g())) {
            return c3410i;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.mo7904r() + ", actual: " + c3410i.m7888g().mo7904r());
    }

    public C3410i(ZoneId zoneId, ZoneOffset zoneOffset, C3406e c3406e) {
        Objects.requireNonNull(c3406e, "dateTime");
        this.f18070a = c3406e;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f18071b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f18072c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: o */
    public final ZoneOffset mo7879o() {
        return this.f18071b;
    }

    public final int hashCode() {
        return (this.f18070a.hashCode() ^ this.f18071b.f18042b) ^ Integer.rotateLeft(this.f18072c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f18070a.toString() + this.f18071b.f18043c;
        ZoneOffset zoneOffset = this.f18071b;
        ZoneId zoneId = this.f18072c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: y */
    public final ChronoLocalDateTime mo7881y() {
        return this.f18070a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: L */
    public final ZoneId mo7873L() {
        return this.f18072c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: G */
    public final ChronoZonedDateTime mo7871G(ZoneId zoneId) {
        return m7926C(zoneId, this.f18071b, this.f18070a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: p */
    public final ChronoZonedDateTime mo7880p(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f18072c.equals(zoneId)) {
            return this;
        }
        return m7927I(m7888g(), this.f18070a.toInstant(this.f18071b), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    /* renamed from: a */
    public final ChronoZonedDateTime mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = AbstractC3409h.f18069a[chronoField.ordinal()];
            if (i10 == 1) {
                return mo7820b(j6 - m7887Z(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            if (i10 == 2) {
                return m7927I(m7888g(), this.f18070a.toInstant(ZoneOffset.ofTotalSeconds(chronoField.f18248b.m8015a(j6, chronoField))), this.f18072c);
            }
            return m7926C(this.f18072c, this.f18071b, this.f18070a.mo7819a(j6, temporalField));
        }
        return m7928t(m7888g(), temporalField.mo8007X(this, j6));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    /* renamed from: b */
    public final ChronoZonedDateTime mo7820b(long j6, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return mo7835j(this.f18070a.mo7820b(j6, temporalUnit));
        }
        return m7928t(m7888g(), temporalUnit.mo8009C(this, j6));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeMo7906w = m7888g().mo7906w(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f18070a.mo7823n(chronoZonedDateTimeMo7906w.mo7880p(this.f18071b).mo7881y(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.mo8010t(this, chronoZonedDateTimeMo7906w);
    }

    private Object writeReplace() {
        return new a0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }
}
