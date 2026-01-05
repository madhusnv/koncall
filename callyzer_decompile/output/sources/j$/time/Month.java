package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Month implements TemporalAccessor, TemporalAdjuster {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;

    /* renamed from: a */
    public static final Month[] f18032a;

    /* renamed from: b */
    public static final /* synthetic */ Month[] f18033b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f18033b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        f18033b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f18032a = values();
    }

    /* renamed from: K */
    public static Month m7854K(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new C3401c("Invalid value for MonthOfYear: " + i10);
        }
        return f18032a[i10 - 1];
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.mo8005K();
        }
        return super.mo7812l(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
        return temporalField.mo8006Q(this);
    }

    /* renamed from: C */
    public final int m7855C(boolean z6) {
        int i10 = AbstractC3460j.f18224a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z6 ? 29 : 28;
    }

    /* renamed from: I */
    public final int m7856I() {
        int i10 = AbstractC3460j.f18224a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    /* renamed from: t */
    public final int m7857t(boolean z6) {
        switch (AbstractC3460j.f18224a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z6 ? 1 : 0) + 91;
            case 3:
                return (z6 ? 1 : 0) + 152;
            case 4:
                return (z6 ? 1 : 0) + 244;
            case 5:
                return (z6 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z6 ? 1 : 0) + 60;
            case 8:
                return (z6 ? 1 : 0) + 121;
            case 9:
                return (z6 ? 1 : 0) + 182;
            case 10:
                return (z6 ? 1 : 0) + 213;
            case 11:
                return (z6 ? 1 : 0) + 274;
            default:
                return (z6 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18278b) {
            return IsoChronology.INSTANCE;
        }
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.MONTHS;
        }
        return super.mo7808d(c3429e);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        if (!Chronology.m7890s(temporal).equals(IsoChronology.INSTANCE)) {
            throw new C3401c("Adjustment only supported on ISO date-time");
        }
        return temporal.mo7819a(getValue(), ChronoField.MONTH_OF_YEAR);
    }
}
