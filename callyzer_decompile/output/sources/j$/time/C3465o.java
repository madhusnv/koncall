package j$.time;

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

/* renamed from: j$.time.o */
/* loaded from: classes2.dex */
public final class C3465o implements Temporal, TemporalAdjuster, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f18231c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a */
    public final LocalTime f18232a;

    /* renamed from: b */
    public final ZoneOffset f18233b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3465o c3465o = (C3465o) obj;
        if (this.f18233b.equals(c3465o.f18233b)) {
            return this.f18232a.compareTo(c3465o.f18232a);
        }
        int iCompare = Long.compare(m7995C(), c3465o.m7995C());
        return iCompare == 0 ? this.f18232a.compareTo(c3465o.f18232a) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f18041g;
        localTime.getClass();
        new C3465o(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f18040f;
        localTime2.getClass();
        new C3465o(localTime2, zoneOffset2);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        C3465o c3465o;
        if (temporal instanceof C3465o) {
            c3465o = (C3465o) temporal;
        } else {
            try {
                c3465o = new C3465o(LocalTime.m7849I(temporal), ZoneOffset.a0(temporal));
            } catch (C3401c e2) {
                throw new C3401c("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jM7995C = c3465o.m7995C() - m7995C();
            switch (AbstractC3464n.f18230a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM7995C;
                case 2:
                    return jM7995C / 1000;
                case 3:
                    return jM7995C / 1000000;
                case 4:
                    return jM7995C / 1000000000;
                case 5:
                    return jM7995C / 60000000000L;
                case 6:
                    return jM7995C / 3600000000000L;
                case 7:
                    return jM7995C / 43200000000000L;
                default:
                    throw new C3484n("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.mo8010t(this, c3465o);
    }

    public C3465o(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.f18232a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f18233b = zoneOffset;
    }

    /* renamed from: I */
    public final C3465o m7996I(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f18232a == localTime && this.f18233b.equals(zoneOffset)) ? this : new C3465o(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).b0() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.OFFSET_SECONDS) {
                return this.f18232a.mo7812l(temporalField);
            }
            return ((ChronoField) temporalField).f18248b;
        }
        return temporalField.mo8004C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.f18233b.f18042b;
            }
            return this.f18232a.getLong(temporalField);
        }
        return temporalField.mo8006Q(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (C3465o) localDate.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a */
    public final Temporal mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                ChronoField chronoField = (ChronoField) temporalField;
                return m7996I(this.f18232a, ZoneOffset.ofTotalSeconds(chronoField.f18248b.m8015a(j6, chronoField)));
            }
            return m7996I(this.f18232a.mo7819a(j6, temporalField), this.f18233b);
        }
        return (C3465o) temporalField.mo8007X(this, j6);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final C3465o mo7820b(long j6, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m7996I(this.f18232a.mo7820b(j6, temporalUnit), this.f18233b);
        }
        return (C3465o) temporalUnit.mo8009C(this, j6);
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
            return this.f18233b;
        }
        if (((c3429e == AbstractC3483m.f18277a) || (c3429e == AbstractC3483m.f18278b)) || c3429e == AbstractC3483m.f18282f) {
            return null;
        }
        if (c3429e == AbstractC3483m.f18283g) {
            return this.f18232a;
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.NANOS;
        }
        return c3429e.m7936l(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        return temporal.mo7819a(this.f18232a.g0(), ChronoField.NANO_OF_DAY).mo7819a(this.f18233b.f18042b, ChronoField.OFFSET_SECONDS);
    }

    /* renamed from: C */
    public final long m7995C() {
        return this.f18232a.g0() - (this.f18233b.f18042b * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3465o) {
            C3465o c3465o = (C3465o) obj;
            if (this.f18232a.equals(c3465o.f18232a) && this.f18233b.equals(c3465o.f18233b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18232a.hashCode() ^ this.f18233b.f18042b;
    }

    public final String toString() {
        return this.f18232a.toString() + this.f18233b.f18043c;
    }

    private Object writeReplace() {
        return new C3467q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
