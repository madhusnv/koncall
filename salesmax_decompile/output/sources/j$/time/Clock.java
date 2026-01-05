package j$.time;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes9.dex */
public abstract class Clock {

    static final class SystemClock extends Clock implements Serializable {
        private final ZoneId zone;

        SystemClock(ZoneId zoneId) {
            this.zone = zoneId;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SystemClock) {
                return this.zone.equals(((SystemClock) obj).zone);
            }
            return false;
        }

        @Override // j$.time.Clock
        public ZoneId getZone() {
            return this.zone;
        }

        public int hashCode() {
            return this.zone.hashCode() + 1;
        }

        @Override // j$.time.Clock
        public Instant instant() {
            return Instant.ofEpochMilli(millis());
        }

        @Override // j$.time.Clock
        public long millis() {
            return System.currentTimeMillis();
        }

        public String toString() {
            return "SystemClock[" + this.zone + "]";
        }
    }

    protected Clock() {
    }

    public static Clock system(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return new SystemClock(zoneId);
    }

    public static Clock systemDefaultZone() {
        return new SystemClock(ZoneId.systemDefault());
    }

    public static Clock systemUTC() {
        return new SystemClock(ZoneOffset.UTC);
    }

    public abstract ZoneId getZone();

    public abstract Instant instant();

    public abstract long millis();
}
