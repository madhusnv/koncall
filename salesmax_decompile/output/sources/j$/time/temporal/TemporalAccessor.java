package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* loaded from: classes9.dex */
public interface TemporalAccessor {
    default int get(TemporalField temporalField) {
        ValueRange valueRangeRange = range(temporalField);
        if (!valueRangeRange.isIntValue()) {
            throw new UnsupportedTemporalTypeException("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long j = getLong(temporalField);
        if (valueRangeRange.isValidValue(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + valueRangeRange + "): " + j);
    }

    long getLong(TemporalField temporalField);

    boolean isSupported(TemporalField temporalField);

    default Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.precision()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    default ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.rangeRefinedBy(this);
        }
        if (isSupported(temporalField)) {
            return temporalField.range();
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
    }
}
