package j$.time;

import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import com.onesignal.session.internal.session.impl.SessionListener;
import j$.time.chrono.ChronoLocalDateTime;
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
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime, Serializable {
    private final LocalDate date;
    private final LocalTime time;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);

    /* renamed from: j$.time.LocalDateTime$1 */
    static /* synthetic */ class C119271 {
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

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.date = localDate;
        this.time = localTime;
    }

    private int compareTo0(LocalDateTime localDateTime) {
        int iCompareTo0 = this.date.compareTo0(localDateTime.toLocalDate());
        return iCompareTo0 == 0 ? this.time.compareTo(localDateTime.toLocalTime()) : iCompareTo0;
    }

    public static LocalDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).toLocalDateTime();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.from(temporalAccessor), LocalTime.from(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5));
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6, i7));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, InfluenceConstants.TIME);
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofEpochSecond(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.checkValidValue(j2);
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(j + zoneOffset.getTotalSeconds(), SessionListener.SECONDS_IN_A_DAY)), LocalTime.ofNanoOfDay((((int) Math.floorMod(r5, SessionListener.SECONDS_IN_A_DAY)) * 1000000000) + j2));
    }

    private LocalDateTime plusWithOverflow(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        LocalTime localTimeOfNanoOfDay;
        LocalDate localDatePlusDays = localDate;
        if ((j | j2 | j3 | j4) == 0) {
            localTimeOfNanoOfDay = this.time;
        } else {
            long j5 = (j4 / 86400000000000L) + (j3 / SessionListener.SECONDS_IN_A_DAY) + (j2 / 1440) + (j / 24);
            long j6 = i;
            long j7 = (j4 % 86400000000000L) + ((j3 % SessionListener.SECONDS_IN_A_DAY) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L);
            long nanoOfDay = this.time.toNanoOfDay();
            long j8 = (j7 * j6) + nanoOfDay;
            long jFloorDiv = (j5 * j6) + Math.floorDiv(j8, 86400000000000L);
            long jFloorMod = Math.floorMod(j8, 86400000000000L);
            localTimeOfNanoOfDay = jFloorMod == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(jFloorMod);
            localDatePlusDays = localDatePlusDays.plusDays(jFloorDiv);
        }
        return with(localDatePlusDays, localTimeOfNanoOfDay);
    }

    private LocalDateTime with(LocalDate localDate, LocalTime localTime) {
        return (this.date == localDate && this.time == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return super.adjustInto(temporal);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.of(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    public int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? compareTo0((LocalDateTime) chronoLocalDateTime) : super.compareTo(chronoLocalDateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.date.equals(localDateTime.date) && this.time.equals(localDateTime.time);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.get(temporalField) : this.date.get(temporalField) : super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.getLong(temporalField) : this.date.getLong(temporalField) : temporalField.getFrom(this);
    }

    public int getNano() {
        return this.time.getNano();
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public int getYear() {
        return this.date.getYear();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public boolean isAfter(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? compareTo0((LocalDateTime) chronoLocalDateTime) > 0 : super.isAfter(chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public boolean isBefore(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? compareTo0((LocalDateTime) chronoLocalDateTime) < 0 : super.isBefore(chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.isTimeBased();
    }

    @Override // j$.time.temporal.Temporal
    public LocalDateTime plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.addTo(this, j);
        }
        switch (C119271.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plusDays(j / 86400000000L).plusNanos((j % 86400000000L) * 1000);
            case 3:
                return plusDays(j / 86400000).plusNanos((j % 86400000) * 1000000);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusMinutes(j);
            case 6:
                return plusHours(j);
            case 7:
                return plusDays(j / 256).plusHours((j % 256) * 12);
            default:
                return with(this.date.plus(j, temporalUnit), this.time);
        }
    }

    public LocalDateTime plusDays(long j) {
        return with(this.date.plusDays(j), this.time);
    }

    public LocalDateTime plusHours(long j) {
        return plusWithOverflow(this.date, j, 0L, 0L, 0L, 1);
    }

    public LocalDateTime plusMinutes(long j) {
        return plusWithOverflow(this.date, 0L, j, 0L, 0L, 1);
    }

    public LocalDateTime plusNanos(long j) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j, 1);
    }

    public LocalDateTime plusSeconds(long j) {
        return plusWithOverflow(this.date, 0L, 0L, j, 0L, 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        return temporalQuery == TemporalQueries.localDate() ? this.date : super.query(temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? this.time.range(temporalField) : this.date.range(temporalField) : temporalField.rangeRefinedBy(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalDate toLocalDate() {
        return this.date;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.time;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public String toString() {
        return this.date.toString() + 'T' + this.time.toString();
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j;
        long j2;
        LocalDateTime localDateTimeFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeFrom);
        }
        if (!temporalUnit.isTimeBased()) {
            LocalDate localDatePlusDays = localDateTimeFrom.date;
            if (localDatePlusDays.isAfter(this.date) && localDateTimeFrom.time.isBefore(this.time)) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.date) && localDateTimeFrom.time.isAfter(this.time)) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.date.until(localDatePlusDays, temporalUnit);
        }
        long jDaysUntil = this.date.daysUntil(localDateTimeFrom.date);
        if (jDaysUntil == 0) {
            return this.time.until(localDateTimeFrom.time, temporalUnit);
        }
        long nanoOfDay = localDateTimeFrom.time.toNanoOfDay() - this.time.toNanoOfDay();
        if (jDaysUntil > 0) {
            jMultiplyExact = jDaysUntil - 1;
            j = nanoOfDay + 86400000000000L;
        } else {
            jMultiplyExact = jDaysUntil + 1;
            j = nanoOfDay - 86400000000000L;
        }
        switch (C119271.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j2 = 1000;
                j /= j2;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j2 = 1000000;
                j /= j2;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, SessionListener.SECONDS_IN_A_DAY);
                j2 = 1000000000;
                j /= j2;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440L);
                j2 = 60000000000L;
                j /= j2;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24L);
                j2 = 3600000000000L;
                j /= j2;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2L);
                j2 = 43200000000000L;
                j /= j2;
                break;
        }
        return Math.addExact(jMultiplyExact, j);
    }

    @Override // j$.time.temporal.Temporal
    public LocalDateTime with(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? with((LocalDate) temporalAdjuster, this.time) : temporalAdjuster instanceof LocalTime ? with(this.date, (LocalTime) temporalAdjuster) : temporalAdjuster instanceof LocalDateTime ? (LocalDateTime) temporalAdjuster : (LocalDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public LocalDateTime with(TemporalField temporalField, long j) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isTimeBased() ? with(this.date, this.time.with(temporalField, j)) : with(this.date.with(temporalField, j), this.time) : (LocalDateTime) temporalField.adjustInto(this, j);
    }
}
