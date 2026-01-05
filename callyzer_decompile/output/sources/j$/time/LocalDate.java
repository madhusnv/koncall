package j$.time;

import com.sun.mail.imap.IMAPStore;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.EnumC3417p;
import j$.time.chrono.InterfaceC3411j;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.InterfaceC3482l;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.C3491b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a */
    public final int f18020a;

    /* renamed from: b */
    public final short f18021b;

    /* renamed from: c */
    public final short f18022c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        return c0(AbstractC3400b.m7885d());
    }

    public static LocalDate of(int i10, int i11, int i12) {
        ChronoField.YEAR.a0(i10);
        ChronoField.MONTH_OF_YEAR.a0(i11);
        ChronoField.DAY_OF_MONTH.a0(i12);
        return m7824C(i10, i11, i12);
    }

    public static LocalDate e0(int i10, int i11) {
        long j6 = i10;
        ChronoField.YEAR.a0(j6);
        ChronoField.DAY_OF_YEAR.a0(i11);
        boolean zMo7902Y = IsoChronology.INSTANCE.mo7902Y(j6);
        if (i11 == 366 && !zMo7902Y) {
            throw new C3401c("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        Month monthM7854K = Month.m7854K(((i11 - 1) / 31) + 1);
        if (i11 > (monthM7854K.m7855C(zMo7902Y) + monthM7854K.m7857t(zMo7902Y)) - 1) {
            monthM7854K = Month.f18032a[((((int) 1) + 12) + monthM7854K.ordinal()) % 12];
        }
        return new LocalDate(i10, monthM7854K.getValue(), (i11 - monthM7854K.m7857t(zMo7902Y)) + 1);
    }

    public static LocalDate d0(long j6) {
        long j10;
        ChronoField.EPOCH_DAY.a0(j6);
        long j11 = 719468 + j6;
        if (j11 < 0) {
            long j12 = ((j6 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i10 = (int) j14;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j15 = j13 + j10 + (i11 / 10);
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.f18248b.m8015a(j15, chronoField), i12, i13);
    }

    /* renamed from: I */
    public static LocalDate m7825I(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.mo7808d(AbstractC3483m.f18282f);
        if (localDate != null) {
            return localDate;
        }
        throw new C3401c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.m7937a(charSequence, new C3429e(1));
    }

    /* renamed from: C */
    public static LocalDate m7824C(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else if (IsoChronology.INSTANCE.mo7902Y(i10)) {
                i13 = 29;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new C3401c("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new C3401c("Invalid date '" + Month.m7854K(i11).name() + " " + i12 + "'");
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate i0(int i10, int i11, int i12) {
        if (i11 == 2) {
            i12 = Math.min(i12, IsoChronology.INSTANCE.mo7902Y((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new LocalDate(i10, i11, i12);
    }

    public LocalDate(int i10, int i11, int i12) {
        this.f18020a = i10;
        this.f18021b = (short) i11;
        this.f18022c = (short) i12;
    }

    public static LocalDate c0(C3399a c3399a) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = c3399a.f18048a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return d0(Math.floorDiv(instantOfEpochMilli.getEpochSecond() + zoneId.mo7865C().m8045d(instantOfEpochMilli).f18042b, 86400));
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo8004C(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
        int i10 = AbstractC3457g.f18219a[chronoField.ordinal()];
        if (i10 == 1) {
            return C3485o.m8013f(1L, lengthOfMonth());
        }
        if (i10 == 2) {
            return C3485o.m8013f(1L, mo7831V());
        }
        if (i10 != 3) {
            return i10 != 4 ? chronoField.f18248b : getYear() <= 0 ? C3485o.m8013f(1L, 1000000000L) : C3485o.m8013f(1L, 999999999L);
        }
        return C3485o.m8013f(1L, (getMonth() != Month.FEBRUARY || mo7837z()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return m7826K(temporalField);
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return toEpochDay();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return m7833X();
            }
            return m7826K(temporalField);
        }
        return temporalField.mo8006Q(this);
    }

    /* renamed from: K */
    public final int m7826K(TemporalField temporalField) {
        switch (AbstractC3457g.f18219a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f18022c;
            case 2:
                return m7829Q();
            case 3:
                return ((this.f18022c - 1) / 7) + 1;
            case 4:
                int i10 = this.f18020a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f18022c - 1) % 7) + 1;
            case 7:
                return ((m7829Q() - 1) % 7) + 1;
            case 8:
                throw new C3484n("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((m7829Q() - 1) / 7) + 1;
            case 10:
                return this.f18021b;
            case 11:
                throw new C3484n("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f18020a;
            case 13:
                return this.f18020a >= 1 ? 1 : 0;
            default:
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
    }

    /* renamed from: X */
    public final long m7833X() {
        return ((this.f18020a * 12) + this.f18021b) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: g */
    public final Chronology mo7834g() {
        return IsoChronology.INSTANCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: P */
    public final InterfaceC3411j mo7828P() {
        return getYear() >= 1 ? EnumC3417p.CE : EnumC3417p.BCE;
    }

    public int getYear() {
        return this.f18020a;
    }

    public int getMonthValue() {
        return this.f18021b;
    }

    public Month getMonth() {
        return Month.m7854K(this.f18021b);
    }

    public int getDayOfMonth() {
        return this.f18022c;
    }

    /* renamed from: Q */
    public final int m7829Q() {
        return (getMonth().m7857t(mo7837z()) + this.f18022c) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(((int) Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: z */
    public final boolean mo7837z() {
        return IsoChronology.INSTANCE.mo7902Y(this.f18020a);
    }

    public int lengthOfMonth() {
        short s5 = this.f18021b;
        return s5 != 2 ? (s5 == 4 || s5 == 6 || s5 == 9 || s5 == 11) ? 30 : 31 : mo7837z() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: V */
    public final int mo7831V() {
        return mo7837z() ? 366 : 365;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: with, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocalDate mo7835j(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return (LocalDate) temporalAdjuster;
        }
        return (LocalDate) temporalAdjuster.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final LocalDate mo7819a(long j6, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.mo8007X(this, j6);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.a0(j6);
        switch (AbstractC3457g.f18219a[chronoField.ordinal()]) {
            case 1:
                int i10 = (int) j6;
                if (this.f18022c != i10) {
                    return of(this.f18020a, this.f18021b, i10);
                }
                return this;
            case 2:
                int i11 = (int) j6;
                if (m7829Q() != i11) {
                    return e0(this.f18020a, i11);
                }
                return this;
            case 3:
                return g0(j6 - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f18020a < 1) {
                    j6 = 1 - j6;
                }
                return k0((int) j6);
            case 5:
                return plusDays(j6 - getDayOfWeek().getValue());
            case 6:
                return plusDays(j6 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j6 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return d0(j6);
            case 9:
                return g0(j6 - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j6;
                if (this.f18021b != i12) {
                    ChronoField.MONTH_OF_YEAR.a0(i12);
                    return i0(this.f18020a, i12, this.f18022c);
                }
                return this;
            case 11:
                return plusMonths(j6 - m7833X());
            case 12:
                return k0((int) j6);
            case 13:
                if (getLong(ChronoField.ERA) != j6) {
                    return k0(1 - this.f18020a);
                }
                return this;
            default:
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
    }

    public final LocalDate k0(int i10) {
        if (this.f18020a == i10) {
            return this;
        }
        ChronoField.YEAR.a0(i10);
        return i0(i10, this.f18021b, this.f18022c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: S */
    public final ChronoLocalDate mo7830S(InterfaceC3482l interfaceC3482l) {
        if (interfaceC3482l != null) {
            C3466p c3466p = (C3466p) interfaceC3482l;
            return plusMonths((c3466p.f18235a * 12) + c3466p.f18236b).plusDays(c3466p.f18237c);
        }
        Objects.requireNonNull(interfaceC3482l, "amountToAdd");
        return (LocalDate) ((C3466p) interfaceC3482l).mo7815t(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalDate mo7820b(long j6, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.mo8009C(this, j6);
        }
        switch (AbstractC3457g.f18220b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j6);
            case 2:
                return g0(j6);
            case 3:
                return plusMonths(j6);
            case 4:
                return h0(j6);
            case 5:
                return h0(Math.multiplyExact(j6, 10));
            case 6:
                return h0(Math.multiplyExact(j6, 100));
            case 7:
                return h0(Math.multiplyExact(j6, IMAPStore.RESPONSE));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return mo7819a(Math.addExact(getLong(chronoField), j6), chronoField);
            default:
                throw new C3484n("Unsupported unit: " + temporalUnit);
        }
    }

    public final LocalDate h0(long j6) {
        if (j6 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return i0(chronoField.f18248b.m8015a(this.f18020a + j6, chronoField), this.f18021b, this.f18022c);
    }

    public LocalDate plusMonths(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (this.f18020a * 12) + (this.f18021b - 1) + j6;
        ChronoField chronoField = ChronoField.YEAR;
        long j11 = 12;
        return i0(chronoField.f18248b.m8015a(Math.floorDiv(j10, j11), chronoField), ((int) Math.floorMod(j10, j11)) + 1, this.f18022c);
    }

    public final LocalDate g0(long j6) {
        return plusDays(Math.multiplyExact(j6, 7));
    }

    public LocalDate plusDays(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = this.f18022c + j6;
        if (j10 > 0) {
            if (j10 <= 28) {
                return new LocalDate(this.f18020a, this.f18021b, (int) j10);
            }
            if (j10 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j10 <= jLengthOfMonth) {
                    return new LocalDate(this.f18020a, this.f18021b, (int) j10);
                }
                short s5 = this.f18021b;
                if (s5 < 12) {
                    return new LocalDate(this.f18020a, s5 + 1, (int) (j10 - jLengthOfMonth));
                }
                ChronoField.YEAR.a0(this.f18020a + 1);
                return new LocalDate(this.f18020a + 1, 1, (int) (j10 - jLengthOfMonth));
            }
        }
        return d0(Math.addExact(toEpochDay(), j6));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDate mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }

    public LocalDate minusYears(long j6) {
        return j6 == Long.MIN_VALUE ? h0(Long.MAX_VALUE).h0(1L) : h0(-j6);
    }

    public LocalDate minusMonths(long j6) {
        return j6 == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j6);
    }

    public LocalDate minusDays(long j6) {
        return j6 == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j6);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        return c3429e == AbstractC3483m.f18282f ? this : super.mo7808d(c3429e);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateM7825I = m7825I(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo8010t(this, localDateM7825I);
        }
        switch (AbstractC3457g.f18220b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateM7825I.toEpochDay() - toEpochDay();
            case 2:
                return (localDateM7825I.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return b0(localDateM7825I);
            case 4:
                return b0(localDateM7825I) / 12;
            case 5:
                return b0(localDateM7825I) / 120;
            case 6:
                return b0(localDateM7825I) / 1200;
            case 7:
                return b0(localDateM7825I) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateM7825I.getLong(chronoField) - getLong(chronoField);
            default:
                throw new C3484n("Unsupported unit: " + temporalUnit);
        }
    }

    public final long b0(LocalDate localDate) {
        return (((localDate.m7833X() * 32) + localDate.getDayOfMonth()) - ((m7833X() * 32) + getDayOfMonth())) / 32;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime mo7827M(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.of(this, LocalTime.MIDNIGHT);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeMo7827M = mo7827M(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objM8046e = zoneId.mo7865C().m8046e(localDateTimeMo7827M);
            C3491b c3491b = objM8046e instanceof C3491b ? (C3491b) objM8046e : null;
            if (c3491b != null && c3491b.m8038t()) {
                localDateTimeMo7827M = c3491b.f18308b.plusSeconds(c3491b.f18310d.f18042b - c3491b.f18309c.f18042b);
            }
        }
        return ZonedDateTime.of(localDateTimeMo7827M, zoneId);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j6 = this.f18020a;
        long j10 = this.f18021b;
        long j11 = 365 * j6;
        long j12 = (((367 * j10) - 362) / 12) + (j6 >= 0 ? ((j6 + 399) / 400) + (((3 + j6) / 4) - ((99 + j6) / 100)) + j11 : j11 - ((j6 / (-400)) + ((j6 / (-4)) - (j6 / (-100))))) + (this.f18022c - 1);
        if (j10 > 2) {
            j12 = !mo7837z() ? j12 - 2 : j12 - 1;
        }
        return j12 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return m7836t((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    /* renamed from: t */
    public final int m7836t(LocalDate localDate) {
        int i10 = this.f18020a - localDate.f18020a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f18021b - localDate.f18021b;
        return i11 == 0 ? this.f18022c - localDate.f18022c : i11;
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? m7836t((LocalDate) chronoLocalDate) > 0 : toEpochDay() > chronoLocalDate.toEpochDay();
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? m7836t((LocalDate) chronoLocalDate) < 0 : toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && m7836t((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i10 = this.f18020a;
        return (((i10 << 11) + (this.f18021b << 6)) + this.f18022c) ^ (i10 & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i10 = this.f18020a;
        short s5 = this.f18021b;
        short s10 = this.f18022c;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s5 < 10 ? "-0" : "-");
        sb2.append((int) s5);
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C3467q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
