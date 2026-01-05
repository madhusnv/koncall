package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneOffsetTransition;
import j$.time.zone.ZoneRules;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes9.dex */
final class ChronoZonedDateTimeImpl implements ChronoZonedDateTime, Serializable {
    private final transient ChronoLocalDateTimeImpl dateTime;
    private final transient ZoneOffset offset;
    private final transient ZoneId zone;

    /* renamed from: j$.time.chrono.ChronoZonedDateTimeImpl$1 */
    static /* synthetic */ class C119361 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl chronoLocalDateTimeImpl, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTimeImpl, "dateTime");
        this.dateTime = chronoLocalDateTimeImpl;
        Objects.requireNonNull(zoneOffset, "offset");
        this.offset = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.zone = zoneId;
    }

    private ChronoZonedDateTimeImpl create(Instant instant, ZoneId zoneId) {
        return ofInstant(getChronology(), instant, zoneId);
    }

    static ChronoZonedDateTimeImpl ensureValid(Chronology chronology, Temporal temporal) {
        ChronoZonedDateTimeImpl chronoZonedDateTimeImpl = (ChronoZonedDateTimeImpl) temporal;
        if (chronology.equals(chronoZonedDateTimeImpl.getChronology())) {
            return chronoZonedDateTimeImpl;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + chronoZonedDateTimeImpl.getChronology().getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static ChronoZonedDateTime ofBest(ChronoLocalDateTimeImpl chronoLocalDateTimeImpl, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(chronoLocalDateTimeImpl, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeFrom = LocalDateTime.from(chronoLocalDateTimeImpl);
        List validOffsets = rules.getValidOffsets(localDateTimeFrom);
        if (validOffsets.size() != 1) {
            if (validOffsets.size() == 0) {
                ZoneOffsetTransition transition = rules.getTransition(localDateTimeFrom);
                chronoLocalDateTimeImpl = chronoLocalDateTimeImpl.plusSeconds(transition.getDuration().getSeconds());
                zoneOffset = transition.getOffsetAfter();
            } else if (zoneOffset == null || !validOffsets.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) validOffsets.get(0);
            }
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, zoneOffset, zoneId);
    }

    static ChronoZonedDateTimeImpl ofInstant(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new ChronoZonedDateTimeImpl((ChronoLocalDateTimeImpl) chronology.localDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset)), offset, zoneId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo2((ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneOffset getOffset() {
        return this.offset;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.zone;
    }

    public int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.isSupportedBy(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public ChronoZonedDateTime plus(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? with((TemporalAdjuster) this.dateTime.plus(j, temporalUnit)) : ensureValid(getChronology(), temporalUnit.addTo(this, j));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ChronoLocalDateTime toLocalDateTime() {
        return this.dateTime;
    }

    public String toString() {
        String str = toLocalDateTime().toString() + getOffset().toString();
        if (getOffset() == getZone()) {
            return str;
        }
        return str + '[' + getZone().toString() + ']';
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeZonedDateTime = getChronology().zonedDateTime(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.dateTime.until(chronoZonedDateTimeZonedDateTime.withZoneSameInstant(this.offset).toLocalDateTime(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public ChronoZonedDateTime with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return ensureValid(getChronology(), temporalField.adjustInto(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = C119361.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            return plus(j - toEpochSecond(), (TemporalUnit) ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return ofBest(this.dateTime.with(temporalField, j), this.zone, this.offset);
        }
        return create(this.dateTime.toInstant(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))), this.zone);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ChronoZonedDateTime withZoneSameInstant(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : create(this.dateTime.toInstant(this.offset), zoneId);
    }
}
