package j$.time;

import com.sun.mail.imap.IMAPStore;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a */
    public final long f18018a;

    /* renamed from: b */
    public final int f18019b;

    /* renamed from: c */
    public static final Instant f18017c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        C3399a.f18047b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochSecond(long j6) {
        return m7816t(j6, 0);
    }

    public static Instant ofEpochSecond(long j6, long j10) {
        return m7816t(Math.addExact(j6, Math.floorDiv(j10, 1000000000L)), (int) Math.floorMod(j10, 1000000000L));
    }

    public static Instant ofEpochMilli(long j6) {
        long j10 = IMAPStore.RESPONSE;
        return m7816t(Math.floorDiv(j6, j10), ((int) Math.floorMod(j6, j10)) * 1000000);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.getLong(ChronoField.INSTANT_SECONDS), temporalAccessor.mo7810h(ChronoField.NANO_OF_SECOND));
        } catch (C3401c e2) {
            throw new C3401c("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.ISO_INSTANT.m7937a(charSequence, new C3429e(0));
    }

    /* renamed from: t */
    public static Instant m7816t(long j6, int i10) {
        if ((i10 | j6) == 0) {
            return f18017c;
        }
        if (j6 < -31557014167219200L || j6 > 31556889864403199L) {
            throw new C3401c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j6, i10);
    }

    public Instant(long j6, int i10) {
        this.f18018a = j6;
        this.f18019b = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.mo7812l(temporalField).m8015a(temporalField.mo8006Q(this), temporalField);
        }
        int i10 = AbstractC3430f.f18109a[((ChronoField) temporalField).ordinal()];
        if (i10 == 1) {
            return this.f18019b;
        }
        if (i10 == 2) {
            return this.f18019b / IMAPStore.RESPONSE;
        }
        if (i10 == 3) {
            return this.f18019b / 1000000;
        }
        if (i10 == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.f18248b.m8015a(this.f18018a, chronoField);
        }
        throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        int i10;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo8006Q(this);
        }
        int i11 = AbstractC3430f.f18109a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f18019b;
        } else if (i11 == 2) {
            i10 = this.f18019b / IMAPStore.RESPONSE;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f18018a;
                }
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
            }
            i10 = this.f18019b / 1000000;
        }
        return i10;
    }

    public long getEpochSecond() {
        return this.f18018a;
    }

    public int getNano() {
        return this.f18019b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (Instant) localDate.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a */
    public final Temporal mo7819a(long j6, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.mo8007X(this, j6);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.a0(j6);
        int i10 = AbstractC3430f.f18109a[chronoField.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ((int) j6) * IMAPStore.RESPONSE;
                if (i11 != this.f18019b) {
                    return m7816t(this.f18018a, i11);
                }
            } else if (i10 == 3) {
                int i12 = ((int) j6) * 1000000;
                if (i12 != this.f18019b) {
                    return m7816t(this.f18018a, i12);
                }
            } else {
                if (i10 != 4) {
                    throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
                }
                if (j6 != this.f18018a) {
                    return m7816t(j6, this.f18019b);
                }
            }
        } else if (j6 != this.f18019b) {
            return m7816t(this.f18018a, (int) j6);
        }
        return this;
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new C3484n("Unit is too large to be used for truncation");
        }
        long j6 = duration.f18015a;
        long j10 = duration.f18016b;
        if (j6 < 0) {
            j6++;
            j10 -= 1000000000;
        }
        long jAddExact = Math.addExact(Math.multiplyExact(j6, 1000000000L), j10);
        if (86400000000000L % jAddExact != 0) {
            throw new C3484n("Unit must divide into a standard day without remainder");
        }
        long j11 = ((this.f18018a % 86400) * 1000000000) + this.f18019b;
        return m7817C(0L, (Math.floorDiv(j11, jAddExact) * jAddExact) - j11);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant mo7820b(long j6, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.mo8009C(this, j6);
        }
        switch (AbstractC3430f.f18110b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m7817C(0L, j6);
            case 2:
                return m7817C(j6 / 1000000, (j6 % 1000000) * 1000);
            case 3:
                return m7817C(j6 / 1000, (j6 % 1000) * 1000000);
            case 4:
                return m7817C(j6, 0L);
            case 5:
                return m7817C(Math.multiplyExact(j6, 60), 0L);
            case 6:
                return m7817C(Math.multiplyExact(j6, 3600), 0L);
            case 7:
                return m7817C(Math.multiplyExact(j6, 43200), 0L);
            case 8:
                return m7817C(Math.multiplyExact(j6, 86400), 0L);
            default:
                throw new C3484n("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: C */
    public final Instant m7817C(long j6, long j10) {
        if ((j6 | j10) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f18018a, j6), j10 / 1000000000), this.f18019b + (j10 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.NANOS;
        }
        if (c3429e == AbstractC3483m.f18278b || c3429e == AbstractC3483m.f18277a || c3429e == AbstractC3483m.f18281e || c3429e == AbstractC3483m.f18280d || c3429e == AbstractC3483m.f18282f || c3429e == AbstractC3483m.f18283g) {
            return null;
        }
        return c3429e.m7936l(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        return temporal.mo7819a(this.f18018a, ChronoField.INSTANT_SECONDS).mo7819a(this.f18019b, ChronoField.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo8010t(this, instantFrom);
        }
        switch (AbstractC3430f.f18110b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.f18018a, this.f18018a), 1000000000L), instantFrom.f18019b - this.f18019b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.f18018a, this.f18018a), 1000000000L), instantFrom.f18019b - this.f18019b) / 1000;
            case 3:
                return Math.subtractExact(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return m7818I(instantFrom);
            case 5:
                return m7818I(instantFrom) / 60;
            case 6:
                return m7818I(instantFrom) / 3600;
            case 7:
                return m7818I(instantFrom) / 43200;
            case 8:
                return m7818I(instantFrom) / 86400;
            default:
                throw new C3484n("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: I */
    public final long m7818I(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.f18018a, this.f18018a);
        long j6 = instant.f18019b - this.f18019b;
        return (jSubtractExact <= 0 || j6 >= 0) ? (jSubtractExact >= 0 || j6 <= 0) ? jSubtractExact : jSubtractExact + 1 : jSubtractExact - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m7858t(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public long toEpochMilli() {
        long j6 = this.f18018a;
        return (j6 >= 0 || this.f18019b <= 0) ? Math.addExact(Math.multiplyExact(j6, IMAPStore.RESPONSE), this.f18019b / 1000000) : Math.addExact(Math.multiplyExact(j6 + 1, IMAPStore.RESPONSE), (this.f18019b / 1000000) - IMAPStore.RESPONSE);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.f18018a, instant.f18018a);
        return iCompare != 0 ? iCompare : this.f18019b - instant.f18019b;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f18018a == instant.f18018a && this.f18019b == instant.f18019b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j6 = this.f18018a;
        return (this.f18019b * 51) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new C3467q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
