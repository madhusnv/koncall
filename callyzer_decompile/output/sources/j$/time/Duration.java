package j$.time;

import com.sun.mail.imap.IMAPStore;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.InterfaceC3482l;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements InterfaceC3482l, Comparable<Duration>, Serializable {

    /* renamed from: c */
    public static final Duration f18013c = new Duration(0, 0);

    /* renamed from: d */
    public static final BigInteger f18014d = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a */
    public final long f18015a;

    /* renamed from: b */
    public final int f18016b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f18015a, duration2.f18015a);
        return iCompare != 0 ? iCompare : this.f18016b - duration2.f18016b;
    }

    public static Duration ofSeconds(long j6, long j10) {
        return m7813C(Math.addExact(j6, Math.floorDiv(j10, 1000000000L)), (int) Math.floorMod(j10, 1000000000L));
    }

    /* renamed from: I */
    public static Duration m7814I(long j6) {
        long j10 = j6 / 1000000000;
        int i10 = (int) (j6 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (i10 + 1000000000);
            j10--;
        }
        return m7813C(j10, i10);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return m7814I(temporal.mo7823n(temporal2, ChronoUnit.NANOS));
        } catch (C3401c | ArithmeticException unused) {
            long jMo7823n = temporal.mo7823n(temporal2, ChronoUnit.SECONDS);
            long j6 = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j10 = temporal2.getLong(chronoField) - temporal.getLong(chronoField);
                if (jMo7823n > 0 && j10 < 0) {
                    jMo7823n++;
                } else if (jMo7823n < 0 && j10 > 0) {
                    jMo7823n--;
                }
                j6 = j10;
            } catch (C3401c unused2) {
            }
            return ofSeconds(jMo7823n, j6);
        }
    }

    /* renamed from: C */
    public static Duration m7813C(long j6, int i10) {
        if ((i10 | j6) == 0) {
            return f18013c;
        }
        return new Duration(j6, i10);
    }

    public Duration(long j6, int i10) {
        this.f18015a = j6;
        this.f18016b = i10;
    }

    public Duration abs() {
        long j6 = this.f18015a;
        if (j6 >= 0) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(j6).add(BigDecimal.valueOf(this.f18016b, 9)).multiply(BigDecimal.valueOf(-1L)).movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(f18014d);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
            throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
        }
        return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
    }

    public long getSeconds() {
        return this.f18015a;
    }

    @Override // j$.time.temporal.InterfaceC3482l
    /* renamed from: t */
    public final Temporal mo7815t(ChronoLocalDate chronoLocalDate) {
        long j6 = this.f18015a;
        Temporal temporalMo7820b = chronoLocalDate;
        if (j6 != 0) {
            temporalMo7820b = chronoLocalDate.mo7820b(j6, (TemporalUnit) ChronoUnit.SECONDS);
        }
        int i10 = this.f18016b;
        return i10 != 0 ? temporalMo7820b.mo7820b(i10, ChronoUnit.NANOS) : temporalMo7820b;
    }

    public long toDays() {
        return this.f18015a / 86400;
    }

    public long toHours() {
        return this.f18015a / 3600;
    }

    public long toMillis() {
        long j6 = this.f18015a;
        long j10 = this.f18016b;
        if (j6 < 0) {
            j6++;
            j10 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j6, IMAPStore.RESPONSE), j10 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f18015a == duration.f18015a && this.f18016b == duration.f18016b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f18015a;
        return (this.f18016b * 51) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        if (this == f18013c) {
            return "PT0S";
        }
        long j6 = this.f18015a;
        if (j6 < 0 && this.f18016b > 0) {
            j6++;
        }
        long j10 = j6 / 3600;
        int i10 = (int) ((j6 % 3600) / 60);
        int i11 = (int) (j6 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j10 != 0) {
            sb2.append(j10);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.f18016b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f18015a < 0 && this.f18016b > 0 && i11 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i11);
        }
        if (this.f18016b > 0) {
            int length = sb2.length();
            if (this.f18015a < 0) {
                sb2.append(2000000000 - this.f18016b);
            } else {
                sb2.append(this.f18016b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C3467q((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
