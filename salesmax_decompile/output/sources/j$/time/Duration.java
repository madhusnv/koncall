package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    private final int nanos;
    private final long seconds;
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(1000000000);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    private Duration(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long jUntil = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j2 = temporal2.getLong(chronoField) - temporal.getLong(chronoField);
                if (jUntil > 0 && j2 < 0) {
                    jUntil++;
                } else if (jUntil < 0 && j2 > 0) {
                    jUntil--;
                }
                j = j2;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(jUntil, j);
        }
    }

    private static Duration create(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return create(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return create(Math.multiplyExact(j, 60L), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return create(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return create(j, 0);
    }

    public static Duration ofSeconds(long j, long j2) {
        return create(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    @Override // j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        long j = this.seconds;
        if (j != 0) {
            temporal = temporal.plus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? temporal.plus(i, ChronoUnit.NANOS) : temporal;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.seconds, duration.seconds);
        return iCompare != 0 ? iCompare : this.nanos - duration.nanos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.seconds == duration.seconds && this.nanos == duration.nanos;
    }

    public int getNano() {
        return this.nanos;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public long toHours() {
        return this.seconds / 3600;
    }

    public long toMillis() {
        return Math.addExact(Math.multiplyExact(this.seconds, 1000L), this.nanos / 1000000);
    }

    public long toNanos() {
        return Math.addExact(Math.multiplyExact(this.seconds, 1000000000L), this.nanos);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.nanos);
            } else {
                sb.append(this.nanos + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
