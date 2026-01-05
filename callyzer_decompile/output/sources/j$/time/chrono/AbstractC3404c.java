package j$.time.chrono;

import com.sun.mail.imap.IMAPStore;
import j$.time.LocalDate;
import j$.time.temporal.C3484n;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: j$.time.chrono.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3404c implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* renamed from: I */
    public abstract ChronoLocalDate mo7916I(long j6);

    /* renamed from: K */
    public abstract ChronoLocalDate mo7917K(long j6);

    /* renamed from: Q */
    public abstract ChronoLocalDate mo7918Q(long j6);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Temporal mo7819a(long j6, TemporalField temporalField) {
        return mo7819a(j6, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return mo7821c(j6, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public /* bridge */ /* synthetic */ Temporal mo7835j(LocalDate localDate) {
        return mo7835j(localDate);
    }

    /* renamed from: t */
    public static ChronoLocalDate m7914t(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.mo7834g())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.mo7904r() + ", actual: " + chronoLocalDate.mo7834g().mo7904r());
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: b */
    public ChronoLocalDate mo7820b(long j6, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.mo7820b(j6, temporalUnit);
        }
        switch (AbstractC3403b.f18054a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo7916I(j6);
            case 2:
                return mo7916I(Math.multiplyExact(j6, 7));
            case 3:
                return mo7917K(j6);
            case 4:
                return mo7918Q(j6);
            case 5:
                return mo7918Q(Math.multiplyExact(j6, 10));
            case 6:
                return mo7918Q(Math.multiplyExact(j6, 100));
            case 7:
                return mo7918Q(Math.multiplyExact(j6, IMAPStore.RESPONSE));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return mo7819a(Math.addExact(getLong(chronoField), j6), (TemporalField) chronoField);
            default:
                throw new C3484n("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateMo7896J = mo7834g().mo7896J(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.mo8010t(this, chronoLocalDateMo7896J);
        }
        switch (AbstractC3403b.f18054a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateMo7896J.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateMo7896J.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return m7915C(chronoLocalDateMo7896J);
            case 4:
                return m7915C(chronoLocalDateMo7896J) / 12;
            case 5:
                return m7915C(chronoLocalDateMo7896J) / 120;
            case 6:
                return m7915C(chronoLocalDateMo7896J) / 1200;
            case 7:
                return m7915C(chronoLocalDateMo7896J) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return chronoLocalDateMo7896J.getLong(chronoField) - getLong(chronoField);
            default:
                throw new C3484n("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: C */
    public final long m7915C(ChronoLocalDate chronoLocalDate) {
        if (mo7834g().mo7891A(ChronoField.MONTH_OF_YEAR).f18287d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j6 = getLong(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.getLong(chronoField) * 32) + chronoLocalDate.mo7810h(chronoField2)) - (j6 + mo7810h(chronoField2))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ mo7834g().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long j6 = getLong(ChronoField.YEAR_OF_ERA);
        long j10 = getLong(ChronoField.MONTH_OF_YEAR);
        long j11 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(mo7834g().toString());
        sb2.append(" ");
        sb2.append(mo7828P());
        sb2.append(" ");
        sb2.append(j6);
        sb2.append(j10 < 10 ? "-0" : "-");
        sb2.append(j10);
        sb2.append(j11 < 10 ? "-0" : "-");
        sb2.append(j11);
        return sb2.toString();
    }
}
