package j$.time.chrono;

import com.onesignal.session.internal.session.impl.SessionListener;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;

/* loaded from: classes9.dex */
public interface ChronoLocalDateTime extends Temporal, TemporalAdjuster, Comparable {
    @Override // j$.time.temporal.TemporalAdjuster
    default Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay());
    }

    ChronoZonedDateTime atZone(ZoneId zoneId);

    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = toLocalDate().compareTo(chronoLocalDateTime.toLocalDate());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime());
        return iCompareTo2 == 0 ? getChronology().compareTo(chronoLocalDateTime.getChronology()) : iCompareTo2;
    }

    default Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    int hashCode();

    default boolean isAfter(ChronoLocalDateTime chronoLocalDateTime) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() > chronoLocalDateTime.toLocalTime().toNanoOfDay());
    }

    default boolean isBefore(ChronoLocalDateTime chronoLocalDateTime) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() < chronoLocalDateTime.toLocalTime().toNanoOfDay());
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset()) {
            return null;
        }
        return temporalQuery == TemporalQueries.localTime() ? toLocalTime() : temporalQuery == TemporalQueries.chronology() ? getChronology() : temporalQuery == TemporalQueries.precision() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().toEpochDay() * SessionListener.SECONDS_IN_A_DAY) + toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
    }

    default Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().getNano());
    }

    ChronoLocalDate toLocalDate();

    LocalTime toLocalTime();

    String toString();
}
