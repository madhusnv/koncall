package j$.time;

import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class OffsetTime implements Temporal, TemporalAdjuster, Comparable<OffsetTime>, Serializable {
    private final ZoneOffset offset;
    private final LocalTime time;
    public static final OffsetTime MIN = LocalTime.MIN.atOffset(ZoneOffset.MAX);
    public static final OffsetTime MAX = LocalTime.MAX.atOffset(ZoneOffset.MIN);

    /* renamed from: j$.time.OffsetTime$1 */
    static /* synthetic */ class C119311 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, InfluenceConstants.TIME);
        this.time = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.offset = zoneOffset;
    }

    public static OffsetTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetTime) {
            return (OffsetTime) temporalAccessor;
        }
        try {
            return new OffsetTime(LocalTime.from(temporalAccessor), ZoneOffset.from(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static OffsetTime of(LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetTime(localTime, zoneOffset);
    }

    public static OffsetTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetTime) dateTimeFormatter.parse(charSequence, new TemporalQuery() { // from class: j$.time.OffsetTime$$ExternalSyntheticLambda0
            @Override // j$.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return OffsetTime.from(temporalAccessor);
            }
        });
    }

    private long toEpochNano() {
        return this.time.toNanoOfDay() - (this.offset.getTotalSeconds() * 1000000000);
    }

    private OffsetTime with(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.time == localTime && this.offset.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.NANO_OF_DAY, this.time.toNanoOfDay()).with(ChronoField.OFFSET_SECONDS, this.offset.getTotalSeconds());
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetTime offsetTime) {
        int iCompare;
        return (this.offset.equals(offsetTime.offset) || (iCompare = Long.compare(toEpochNano(), offsetTime.toEpochNano())) == 0) ? this.time.compareTo(offsetTime.time) : iCompare;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetTime)) {
            return false;
        }
        OffsetTime offsetTime = (OffsetTime) obj;
        return this.time.equals(offsetTime.time) && this.offset.equals(offsetTime.offset);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? this.offset.getTotalSeconds() : this.time.getLong(temporalField) : temporalField.getFrom(this);
    }

    public int hashCode() {
        return this.time.hashCode() ^ this.offset.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.isTimeBased() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.Temporal
    public OffsetTime plus(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? with(this.time.plus(j, temporalUnit), this.offset) : (OffsetTime) temporalUnit.addTo(this, j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.zone()) {
            return this.offset;
        }
        if (((temporalQuery == TemporalQueries.zoneId()) || (temporalQuery == TemporalQueries.chronology())) || temporalQuery == TemporalQueries.localDate()) {
            return null;
        }
        return temporalQuery == TemporalQueries.localTime() ? this.time : temporalQuery == TemporalQueries.precision() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? temporalField.range() : this.time.range(temporalField) : temporalField.rangeRefinedBy(this);
    }

    public String toString() {
        return this.time.toString() + this.offset.toString();
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        long j;
        OffsetTime offsetTimeFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, offsetTimeFrom);
        }
        long epochNano = offsetTimeFrom.toEpochNano() - toEpochNano();
        switch (C119311.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return epochNano;
            case 2:
                j = 1000;
                break;
            case 3:
                j = 1000000;
                break;
            case 4:
                j = 1000000000;
                break;
            case 5:
                j = 60000000000L;
                break;
            case 6:
                j = 3600000000000L;
                break;
            case 7:
                j = 43200000000000L;
                break;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
        return epochNano / j;
    }

    @Override // j$.time.temporal.Temporal
    public OffsetTime with(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalTime ? with((LocalTime) temporalAdjuster, this.offset) : temporalAdjuster instanceof ZoneOffset ? with(this.time, (ZoneOffset) temporalAdjuster) : temporalAdjuster instanceof OffsetTime ? (OffsetTime) temporalAdjuster : (OffsetTime) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public OffsetTime with(TemporalField temporalField, long j) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? with(this.time, ZoneOffset.ofTotalSeconds(((ChronoField) temporalField).checkValidIntValue(j))) : with(this.time.with(temporalField, j), this.offset) : (OffsetTime) temporalField.adjustInto(this, j);
    }

    public OffsetTime withOffsetSameInstant(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.offset)) {
            return this;
        }
        return new OffsetTime(this.time.plusSeconds(zoneOffset.getTotalSeconds() - this.offset.getTotalSeconds()), zoneOffset);
    }
}
