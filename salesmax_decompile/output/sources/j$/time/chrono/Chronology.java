package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.ValueRange;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes9.dex */
public interface Chronology extends Comparable<Chronology> {
    static Chronology from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        return chronology != null ? chronology : IsoChronology.INSTANCE;
    }

    int compareTo(Chronology chronology);

    ChronoLocalDate date(int i, int i2, int i3);

    ChronoLocalDate date(TemporalAccessor temporalAccessor);

    ChronoLocalDate dateEpochDay(long j);

    ChronoLocalDate dateYearDay(int i, int i2);

    boolean equals(Object obj);

    String getId();

    boolean isLeapYear(long j);

    default ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        try {
            return date(temporalAccessor).atTime(LocalTime.from(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    ValueRange range(ChronoField chronoField);

    ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle);

    default ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.ofInstant(this, instant, zoneId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    default ChronoZonedDateTime zonedDateTime(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdFrom = ZoneId.from(temporalAccessor);
            try {
                temporalAccessor = zonedDateTime(Instant.from(temporalAccessor), zoneIdFrom);
                return temporalAccessor;
            } catch (DateTimeException unused) {
                return ChronoZonedDateTimeImpl.ofBest(ChronoLocalDateTimeImpl.ensureValid(this, localDateTime(temporalAccessor)), zoneIdFrom, null);
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }
}
