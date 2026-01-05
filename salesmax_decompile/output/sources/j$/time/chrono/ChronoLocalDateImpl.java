package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import java.io.Serializable;

/* loaded from: classes9.dex */
abstract class ChronoLocalDateImpl implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    static ChronoLocalDate ensureValid(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.getId() + ", actual: " + chronoLocalDate.getChronology().getId());
    }
}
