package j$.time;

import com.sun.mail.imap.IMAPStore;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import org.bouncycastle.iana.AEADAlgorithm;

/* loaded from: classes2.dex */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIDNIGHT;
    public static final LocalTime MIN;

    /* renamed from: e */
    public static final LocalTime[] f18027e = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a */
    public final byte f18028a;

    /* renamed from: b */
    public final byte f18029b;

    /* renamed from: c */
    public final byte f18030c;

    /* renamed from: d */
    public final int f18031d;

    static {
        int i10 = 0;
        while (true) {
            LocalTime[] localTimeArr = f18027e;
            if (i10 < localTimeArr.length) {
                localTimeArr[i10] = new LocalTime(i10, 0, 0, 0);
                i10++;
            } else {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime now() {
        C3399a c3399aM7885d = AbstractC3400b.m7885d();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = c3399aM7885d.f18048a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m7851X((((int) Math.floorMod(instantOfEpochMilli.getEpochSecond() + zoneId.mo7865C().m8045d(instantOfEpochMilli).f18042b, 86400)) * 1000000000) + instantOfEpochMilli.getNano());
    }

    public static LocalTime of(int i10, int i11) {
        ChronoField.HOUR_OF_DAY.a0(i10);
        if (i11 == 0) {
            return f18027e[i10];
        }
        ChronoField.MINUTE_OF_HOUR.a0(i11);
        return new LocalTime(i10, i11, 0, 0);
    }

    /* renamed from: Q */
    public static LocalTime m7850Q(int i10, int i11, int i12, int i13) {
        ChronoField.HOUR_OF_DAY.a0(i10);
        ChronoField.MINUTE_OF_HOUR.a0(i11);
        ChronoField.SECOND_OF_MINUTE.a0(i12);
        ChronoField.NANO_OF_SECOND.a0(i13);
        return m7848C(i10, i11, i12, i13);
    }

    /* renamed from: X */
    public static LocalTime m7851X(long j6) {
        ChronoField.NANO_OF_DAY.a0(j6);
        int i10 = (int) (j6 / 3600000000000L);
        long j10 = j6 - (i10 * 3600000000000L);
        int i11 = (int) (j10 / 60000000000L);
        long j11 = j10 - (i11 * 60000000000L);
        int i12 = (int) (j11 / 1000000000);
        return m7848C(i10, i11, i12, (int) (j11 - (i12 * 1000000000)));
    }

    /* renamed from: I */
    public static LocalTime m7849I(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.mo7808d(AbstractC3483m.f18283g);
        if (localTime != null) {
            return localTime;
        }
        throw new C3401c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    /* renamed from: C */
    public static LocalTime m7848C(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f18027e[i10];
        }
        return new LocalTime(i10, i11, i12, i13);
    }

    public LocalTime(int i10, int i11, int i12, int i13) {
        this.f18028a = (byte) i10;
        this.f18029b = (byte) i11;
        this.f18030c = (byte) i12;
        this.f18031d = i13;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).b0();
        }
        return temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return m7852K(temporalField);
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return g0();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return g0() / 1000;
            }
            return m7852K(temporalField);
        }
        return temporalField.mo8006Q(this);
    }

    /* renamed from: K */
    public final int m7852K(TemporalField temporalField) {
        switch (AbstractC3459i.f18222a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f18031d;
            case 2:
                throw new C3484n("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f18031d / IMAPStore.RESPONSE;
            case 4:
                throw new C3484n("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f18031d / 1000000;
            case 6:
                return (int) (g0() / 1000000);
            case 7:
                return this.f18030c;
            case 8:
                return h0();
            case 9:
                return this.f18029b;
            case 10:
                return (this.f18028a * 60) + this.f18029b;
            case 11:
                return this.f18028a % 12;
            case 12:
                int i10 = this.f18028a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f18028a;
            case 14:
                byte b10 = this.f18028a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return this.f18028a / 12;
            default:
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (LocalTime) localDate.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalTime mo7819a(long j6, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.mo8007X(this, j6);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.a0(j6);
        switch (AbstractC3459i.f18222a[chronoField.ordinal()]) {
            case 1:
                return j0((int) j6);
            case 2:
                return m7851X(j6);
            case 3:
                return j0(((int) j6) * IMAPStore.RESPONSE);
            case 4:
                return m7851X(j6 * 1000);
            case 5:
                return j0(((int) j6) * 1000000);
            case 6:
                return m7851X(j6 * 1000000);
            case 7:
                int i10 = (int) j6;
                if (this.f18030c != i10) {
                    ChronoField.SECOND_OF_MINUTE.a0(i10);
                    return m7848C(this.f18028a, this.f18029b, i10, this.f18031d);
                }
                return this;
            case 8:
                return e0(j6 - h0());
            case 9:
                int i11 = (int) j6;
                if (this.f18029b != i11) {
                    ChronoField.MINUTE_OF_HOUR.a0(i11);
                    return m7848C(this.f18028a, i11, this.f18030c, this.f18031d);
                }
                return this;
            case 10:
                return c0(j6 - ((this.f18028a * 60) + this.f18029b));
            case 11:
                return b0(j6 - (this.f18028a % 12));
            case 12:
                if (j6 == 12) {
                    j6 = 0;
                }
                return b0(j6 - (this.f18028a % 12));
            case 13:
                int i12 = (int) j6;
                if (this.f18028a != i12) {
                    ChronoField.HOUR_OF_DAY.a0(i12);
                    return m7848C(i12, this.f18029b, this.f18030c, this.f18031d);
                }
                return this;
            case 14:
                if (j6 == 24) {
                    j6 = 0;
                }
                int i13 = (int) j6;
                if (this.f18028a != i13) {
                    ChronoField.HOUR_OF_DAY.a0(i13);
                    return m7848C(i13, this.f18029b, this.f18030c, this.f18031d);
                }
                return this;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return b0((j6 - (this.f18028a / 12)) * 12);
            default:
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime j0(int i10) {
        if (this.f18031d == i10) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.a0(i10);
        return m7848C(this.f18028a, this.f18029b, this.f18030c, i10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalTime mo7820b(long j6, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AbstractC3459i.f18223b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return d0(j6);
                case 2:
                    return d0((j6 % 86400000000L) * 1000);
                case 3:
                    return d0((j6 % 86400000) * 1000000);
                case 4:
                    return e0(j6);
                case 5:
                    return c0(j6);
                case 6:
                    return b0(j6);
                case 7:
                    return b0((j6 % 2) * 12);
                default:
                    throw new C3484n("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.mo8009C(this, j6);
    }

    public final LocalTime b0(long j6) {
        return j6 == 0 ? this : m7848C(((((int) (j6 % 24)) + this.f18028a) + 24) % 24, this.f18029b, this.f18030c, this.f18031d);
    }

    public final LocalTime c0(long j6) {
        if (j6 != 0) {
            int i10 = (this.f18028a * 60) + this.f18029b;
            int i11 = ((((int) (j6 % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return m7848C(i11 / 60, i11 % 60, this.f18030c, this.f18031d);
            }
        }
        return this;
    }

    public final LocalTime e0(long j6) {
        if (j6 != 0) {
            int i10 = (this.f18029b * 60) + (this.f18028a * 3600) + this.f18030c;
            int i11 = ((((int) (j6 % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return m7848C(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f18031d);
            }
        }
        return this;
    }

    public final LocalTime d0(long j6) {
        if (j6 != 0) {
            long jG0 = g0();
            long j10 = (((j6 % 86400000000000L) + jG0) + 86400000000000L) % 86400000000000L;
            if (jG0 != j10) {
                return m7848C((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18278b || c3429e == AbstractC3483m.f18277a || c3429e == AbstractC3483m.f18281e || c3429e == AbstractC3483m.f18280d) {
            return null;
        }
        if (c3429e == AbstractC3483m.f18283g) {
            return this;
        }
        if (c3429e == AbstractC3483m.f18282f) {
            return null;
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.NANOS;
        }
        return c3429e.m7936l(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        return temporal.mo7819a(g0(), ChronoField.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeM7849I = m7849I(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jG0 = localTimeM7849I.g0() - g0();
            switch (AbstractC3459i.f18223b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jG0;
                case 2:
                    return jG0 / 1000;
                case 3:
                    return jG0 / 1000000;
                case 4:
                    return jG0 / 1000000000;
                case 5:
                    return jG0 / 60000000000L;
                case 6:
                    return jG0 / 3600000000000L;
                case 7:
                    return jG0 / 43200000000000L;
                default:
                    throw new C3484n("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.mo8010t(this, localTimeM7849I);
    }

    public final int h0() {
        return (this.f18029b * 60) + (this.f18028a * 3600) + this.f18030c;
    }

    public final long g0() {
        return (this.f18030c * 1000000000) + (this.f18029b * 60000000000L) + (this.f18028a * 3600000000000L) + this.f18031d;
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f18028a, localTime.f18028a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f18029b, localTime.f18029b)) == 0 && (iCompare = Integer.compare(this.f18030c, localTime.f18030c)) == 0) ? Integer.compare(this.f18031d, localTime.f18031d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f18028a == localTime.f18028a && this.f18029b == localTime.f18029b && this.f18030c == localTime.f18030c && this.f18031d == localTime.f18031d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jG0 = g0();
        return (int) (jG0 ^ (jG0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f18028a;
        byte b11 = this.f18029b;
        byte b12 = this.f18030c;
        int i10 = this.f18031d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + IMAPStore.RESPONSE).substring(1));
                } else if (i10 % IMAPStore.RESPONSE == 0) {
                    sb2.append(Integer.toString((i10 / IMAPStore.RESPONSE) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C3467q((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void k0(DataOutput dataOutput) throws IOException {
        if (this.f18031d == 0) {
            if (this.f18030c == 0) {
                if (this.f18029b == 0) {
                    dataOutput.writeByte(~this.f18028a);
                    return;
                } else {
                    dataOutput.writeByte(this.f18028a);
                    dataOutput.writeByte(~this.f18029b);
                    return;
                }
            }
            dataOutput.writeByte(this.f18028a);
            dataOutput.writeByte(this.f18029b);
            dataOutput.writeByte(~this.f18030c);
            return;
        }
        dataOutput.writeByte(this.f18028a);
        dataOutput.writeByte(this.f18029b);
        dataOutput.writeByte(this.f18030c);
        dataOutput.writeInt(this.f18031d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static LocalTime f0(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        byte b10 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
            i10 = 0;
        } else {
            byte b11 = dataInput.readByte();
            if (b11 < 0) {
                ?? r52 = ~b11;
                i10 = 0;
                b10 = r52;
                i11 = 0;
            } else {
                byte b12 = dataInput.readByte();
                if (b12 < 0) {
                    i11 = ~b12;
                    i10 = 0;
                    b10 = b11;
                } else {
                    i10 = dataInput.readInt();
                    b10 = b11;
                    i11 = b12;
                }
            }
        }
        return m7850Q(i12, b10, i11, i10);
    }
}
