package j$.time;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
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
public final class YearMonth implements Temporal, TemporalAdjuster, Comparable<YearMonth>, Serializable {
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private final int month;
    private final int year;

    /* renamed from: j$.time.YearMonth$1 */
    static /* synthetic */ class C119321 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private YearMonth(int i, int i2) {
        this.year = i;
        this.month = i2;
    }

    public static YearMonth from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.from(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    private long getProlepticMonth() {
        return ((this.year * 12) + this.month) - 1;
    }

    public static YearMonth now() {
        return now(Clock.systemDefaultZone());
    }

    public static YearMonth now(Clock clock) {
        LocalDate localDateNow = LocalDate.now(clock);
        return of(localDateNow.getYear(), localDateNow.getMonth());
    }

    public static YearMonth of(int i, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth of(int i, Month month) {
        Objects.requireNonNull(month, "month");
        return of(i, month.getValue());
    }

    private YearMonth with(int i, int i2) {
        return (this.year == i && this.month == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        if (Chronology.from(temporal).equals(IsoChronology.INSTANCE)) {
            return temporal.with(ChronoField.PROLEPTIC_MONTH, getProlepticMonth());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public LocalDate atDay(int i) {
        return LocalDate.of(this.year, this.month, i);
    }

    public LocalDate atEndOfMonth() {
        return LocalDate.of(this.year, this.month, lengthOfMonth());
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        int i = this.year - yearMonth.year;
        return i == 0 ? this.month - yearMonth.month : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.year == yearMonth.year && this.month == yearMonth.month;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        int i2 = C119321.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.month;
        } else {
            if (i2 == 2) {
                return getProlepticMonth();
            }
            if (i2 == 3) {
                int i3 = this.year;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.year < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
            i = this.year;
        }
        return i;
    }

    public Month getMonth() {
        return Month.of(this.month);
    }

    public int getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.year ^ (this.month << 27);
    }

    public boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    public int lengthOfMonth() {
        return getMonth().length(isLeapYear());
    }

    public YearMonth minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (YearMonth) temporalUnit.addTo(this, j);
        }
        switch (C119321.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusMonths(j);
            case 2:
                return plusYears(j);
            case 3:
                return plusYears(Math.multiplyExact(j, 10L));
            case 4:
                return plusYears(Math.multiplyExact(j, 100L));
            case 5:
                return plusYears(Math.multiplyExact(j, 1000L));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return with((TemporalField) chronoField, Math.addExact(getLong(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    public YearMonth plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.year * 12) + (this.month - 1) + j;
        return with(ChronoField.YEAR.checkValidIntValue(Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1);
    }

    public YearMonth plusYears(long j) {
        return j == 0 ? this : with(ChronoField.YEAR.checkValidIntValue(this.year + j), this.month);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        return temporalQuery == TemporalQueries.chronology() ? IsoChronology.INSTANCE : temporalQuery == TemporalQueries.precision() ? ChronoUnit.MONTHS : super.query(temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.of(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(temporalField);
    }

    public String toString() {
        int i;
        int iAbs = Math.abs(this.year);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i2 = this.year;
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + TransferRecord.MAXIMUM_UPLOAD_PARTS);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            sb.append(this.year);
        }
        sb.append(this.month < 10 ? "-0" : "-");
        sb.append(this.month);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth yearMonthFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, yearMonthFrom);
        }
        long prolepticMonth = yearMonthFrom.getProlepticMonth() - getProlepticMonth();
        switch (C119321.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return prolepticMonth;
            case 2:
                return prolepticMonth / 12;
            case 3:
                return prolepticMonth / 120;
            case 4:
                return prolepticMonth / 1200;
            case 5:
                return prolepticMonth / 12000;
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return yearMonthFrom.getLong(chronoField) - getLong(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth with(TemporalAdjuster temporalAdjuster) {
        return (YearMonth) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.checkValidValue(j);
        int i = C119321.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            return withMonth((int) j);
        }
        if (i == 2) {
            return plusMonths(j - getProlepticMonth());
        }
        if (i == 3) {
            if (this.year < 1) {
                j = 1 - j;
            }
            return withYear((int) j);
        }
        if (i == 4) {
            return withYear((int) j);
        }
        if (i == 5) {
            return getLong(ChronoField.ERA) == j ? this : withYear(1 - this.year);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
    }

    public YearMonth withMonth(int i) {
        ChronoField.MONTH_OF_YEAR.checkValidValue(i);
        return with(this.year, i);
    }

    public YearMonth withYear(int i) {
        ChronoField.YEAR.checkValidValue(i);
        return with(i, this.month);
    }
}
