package j$.time;

import com.sun.mail.imap.IMAPStore;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f18023c = of(LocalDate.MIN, LocalTime.MIN);

    /* renamed from: d */
    public static final LocalDateTime f18024d = of(LocalDate.MAX, LocalTime.MAX);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a */
    public final LocalDate f18025a;

    /* renamed from: b */
    public final LocalTime f18026b;

    public static LocalDateTime now() {
        C3399a c3399aM7885d = AbstractC3400b.m7885d();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return m7839I(instantOfEpochMilli.getEpochSecond(), instantOfEpochMilli.getNano(), c3399aM7885d.f18048a.mo7865C().m8045d(instantOfEpochMilli));
    }

    public static LocalDateTime now(ZoneId zoneId) {
        C3399a c3399a;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            c3399a = C3399a.f18047b;
        } else {
            c3399a = new C3399a(zoneId);
        }
        Objects.requireNonNull(c3399a, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return m7839I(instantOfEpochMilli.getEpochSecond(), instantOfEpochMilli.getNano(), c3399a.f18048a.mo7865C().m8045d(instantOfEpochMilli));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return new OffsetDateTime(this, zoneOffset);
    }

    public static LocalDateTime of(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), LocalTime.m7850Q(i13, i14, i15, i16));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, IMAPStore.ID_DATE);
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m7839I(instant.getEpochSecond(), instant.getNano(), zoneId.mo7865C().m8045d(instant));
    }

    /* renamed from: I */
    public static LocalDateTime m7839I(long j6, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j10 = i10;
        ChronoField.NANO_OF_SECOND.a0(j10);
        return new LocalDateTime(LocalDate.d0(Math.floorDiv(j6 + zoneOffset.f18042b, 86400)), LocalTime.m7851X((((int) Math.floorMod(r5, r7)) * 1000000000) + j10));
    }

    /* renamed from: C */
    public static LocalDateTime m7838C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).mo7881y();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.m7825I(temporalAccessor), LocalTime.m7849I(temporalAccessor));
        } catch (C3401c e2) {
            throw new C3401c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.m7937a(charSequence, new C3429e(2));
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f18025a = localDate;
        this.f18026b = localTime;
    }

    public final LocalDateTime a0(LocalDate localDate, LocalTime localTime) {
        return (this.f18025a == localDate && this.f18026b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.mo8008t(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.b0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).b0() ? this.f18026b.mo7812l(temporalField) : this.f18025a.mo7812l(temporalField);
        }
        return temporalField.mo8004C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).b0() ? this.f18026b.mo7810h(temporalField) : this.f18025a.mo7810h(temporalField);
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).b0() ? this.f18026b.getLong(temporalField) : this.f18025a.getLong(temporalField);
        }
        return temporalField.mo8006Q(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate mo7846m() {
        return this.f18025a;
    }

    public int getYear() {
        return this.f18025a.getYear();
    }

    public int getMonthValue() {
        return this.f18025a.getMonthValue();
    }

    public Month getMonth() {
        return this.f18025a.getMonth();
    }

    public int getDayOfMonth() {
        return this.f18025a.getDayOfMonth();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: k */
    public final LocalTime mo7845k() {
        return this.f18026b;
    }

    public int getHour() {
        return this.f18026b.f18028a;
    }

    public int getMinute() {
        return this.f18026b.f18029b;
    }

    public int getSecond() {
        return this.f18026b.f18030c;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: b0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDateTime mo7835j(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return a0((LocalDate) temporalAdjuster, this.f18026b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return a0(this.f18025a, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return (LocalDateTime) temporalAdjuster;
        }
        return (LocalDateTime) temporalAdjuster.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).b0()) {
                return a0(this.f18025a, this.f18026b.mo7819a(j6, temporalField));
            }
            return a0(this.f18025a.mo7819a(j6, temporalField), this.f18026b);
        }
        return (LocalDateTime) temporalField.mo8007X(this, j6);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo7820b(long j6, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.mo8009C(this, j6);
        }
        switch (AbstractC3458h.f18221a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m7842Q(this.f18025a, 0L, 0L, 0L, j6, 1);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j6 / 86400000000L);
                return localDateTimePlusDays.m7842Q(localDateTimePlusDays.f18025a, 0L, 0L, 0L, (j6 % 86400000000L) * 1000, 1);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j6 / 86400000);
                return localDateTimePlusDays2.m7842Q(localDateTimePlusDays2.f18025a, 0L, 0L, 0L, (j6 % 86400000) * 1000000, 1);
            case 4:
                return plusSeconds(j6);
            case 5:
                return m7842Q(this.f18025a, 0L, j6, 0L, 0L, 1);
            case 6:
                return m7842Q(this.f18025a, j6, 0L, 0L, 0L, 1);
            case 7:
                LocalDateTime localDateTimePlusDays3 = plusDays(j6 / 256);
                return localDateTimePlusDays3.m7842Q(localDateTimePlusDays3.f18025a, (j6 % 256) * 12, 0L, 0L, 0L, 1);
            default:
                return a0(this.f18025a.mo7820b(j6, temporalUnit), this.f18026b);
        }
    }

    public LocalDateTime plusDays(long j6) {
        return a0(this.f18025a.plusDays(j6), this.f18026b);
    }

    public LocalDateTime plusSeconds(long j6) {
        return m7842Q(this.f18025a, 0L, 0L, j6, 0L, 1);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final ChronoLocalDateTime mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    public LocalDateTime minusDays(long j6) {
        return j6 == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j6);
    }

    public LocalDateTime minusHours(long j6) {
        return m7842Q(this.f18025a, j6, 0L, 0L, 0L, -1);
    }

    /* renamed from: Q */
    public final LocalDateTime m7842Q(LocalDate localDate, long j6, long j10, long j11, long j12, int i10) {
        if ((j6 | j10 | j11 | j12) == 0) {
            return a0(localDate, this.f18026b);
        }
        long j13 = i10;
        long jG0 = this.f18026b.g0();
        long j14 = ((((j6 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L)) * j13) + jG0;
        long jFloorDiv = Math.floorDiv(j14, 86400000000000L) + (((j6 / 24) + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L)) * j13);
        long jFloorMod = Math.floorMod(j14, 86400000000000L);
        return a0(localDate.plusDays(jFloorDiv), jFloorMod == jG0 ? this.f18026b : LocalTime.m7851X(jFloorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18282f) {
            return this.f18025a;
        }
        return super.mo7808d(c3429e);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j6;
        LocalDateTime localDateTimeM7838C = m7838C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo8010t(this, localDateTimeM7838C);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDatePlusDays = localDateTimeM7838C.f18025a;
            if (localDatePlusDays.isAfter(this.f18025a) && localDateTimeM7838C.f18026b.compareTo(this.f18026b) < 0) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.f18025a) && localDateTimeM7838C.f18026b.compareTo(this.f18026b) > 0) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.f18025a.mo7823n(localDatePlusDays, temporalUnit);
        }
        LocalDate localDate = this.f18025a;
        LocalDate localDate2 = localDateTimeM7838C.f18025a;
        localDate.getClass();
        long epochDay = localDate2.toEpochDay() - localDate.toEpochDay();
        if (epochDay == 0) {
            return this.f18026b.mo7823n(localDateTimeM7838C.f18026b, temporalUnit);
        }
        long jG0 = localDateTimeM7838C.f18026b.g0() - this.f18026b.g0();
        if (epochDay > 0) {
            jMultiplyExact = epochDay - 1;
            j6 = jG0 + 86400000000000L;
        } else {
            jMultiplyExact = epochDay + 1;
            j6 = jG0 - 86400000000000L;
        }
        switch (AbstractC3458h.f18221a[chronoUnit.ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j6 /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j6 /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400);
                j6 /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                j6 /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                j6 /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                j6 /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j6);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime mo7840H(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m7847t((LocalDateTime) chronoLocalDateTime);
        }
        return super.compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    /* renamed from: t */
    public final int m7847t(LocalDateTime localDateTime) {
        int iM7836t = this.f18025a.m7836t(localDateTime.mo7846m());
        return iM7836t == 0 ? this.f18026b.compareTo(localDateTime.f18026b) : iM7836t;
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m7847t((LocalDateTime) chronoLocalDateTime) > 0;
        }
        long epochDay = mo7846m().toEpochDay();
        long epochDay2 = chronoLocalDateTime.mo7846m().toEpochDay();
        if (epochDay <= epochDay2) {
            return epochDay == epochDay2 && this.f18026b.g0() > chronoLocalDateTime.mo7845k().g0();
        }
        return true;
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m7847t((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = mo7846m().toEpochDay();
        long epochDay2 = chronoLocalDateTime.mo7846m().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.f18026b.g0() < chronoLocalDateTime.mo7845k().g0();
        }
        return true;
    }

    public boolean isEqual(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? m7847t((LocalDateTime) chronoLocalDateTime) == 0 : this.f18026b.g0() == chronoLocalDateTime.mo7845k().g0() && mo7846m().toEpochDay() == chronoLocalDateTime.mo7846m().toEpochDay();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f18025a.equals(localDateTime.f18025a) && this.f18026b.equals(localDateTime.f18026b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f18025a.hashCode() ^ this.f18026b.hashCode();
    }

    public final String toString() {
        return this.f18025a.toString() + "T" + this.f18026b.toString();
    }

    private Object writeReplace() {
        return new C3467q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
