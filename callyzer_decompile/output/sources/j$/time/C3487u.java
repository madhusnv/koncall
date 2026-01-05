package j$.time;

import com.sun.mail.imap.IMAPStore;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: j$.time.u */
/* loaded from: classes2.dex */
public final class C3487u implements Temporal, TemporalAdjuster, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f18297c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a */
    public final int f18298a;

    /* renamed from: b */
    public final int f18299b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3487u c3487u = (C3487u) obj;
        int i10 = this.f18298a - c3487u.f18298a;
        return i10 == 0 ? this.f18299b - c3487u.f18299b : i10;
    }

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        C3487u c3487u;
        if (temporal instanceof C3487u) {
            c3487u = (C3487u) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!IsoChronology.INSTANCE.equals(Chronology.m7890s(temporal))) {
                    temporal = LocalDate.m7825I(temporal);
                }
                ChronoField chronoField = ChronoField.YEAR;
                int iMo7810h = temporal.mo7810h(chronoField);
                ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
                int iMo7810h2 = temporal.mo7810h(chronoField2);
                chronoField.a0(iMo7810h);
                chronoField2.a0(iMo7810h2);
                c3487u = new C3487u(iMo7810h, iMo7810h2);
            } catch (C3401c e2) {
                throw new C3401c("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jM8033t = c3487u.m8033t() - m8033t();
            switch (AbstractC3470t.f18245b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM8033t;
                case 2:
                    return jM8033t / 12;
                case 3:
                    return jM8033t / 120;
                case 4:
                    return jM8033t / 1200;
                case 5:
                    return jM8033t / 12000;
                case 6:
                    ChronoField chronoField3 = ChronoField.ERA;
                    return c3487u.getLong(chronoField3) - getLong(chronoField3);
                default:
                    throw new C3484n("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.mo8010t(this, c3487u);
    }

    public C3487u(int i10, int i11) {
        this.f18298a = i10;
        this.f18299b = i11;
    }

    /* renamed from: Q */
    public final C3487u m8031Q(int i10, int i11) {
        return (this.f18298a == i10 && this.f18299b == i11) ? this : new C3487u(i10, i11);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return C3485o.m8013f(1L, this.f18298a <= 0 ? 1000000000L : 999999999L);
        }
        return super.mo7812l(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    public final int mo7810h(TemporalField temporalField) {
        return mo7812l(temporalField).m8015a(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        int i10;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo8006Q(this);
        }
        int i11 = AbstractC3470t.f18244a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f18299b;
        } else {
            if (i11 == 2) {
                return m8033t();
            }
            if (i11 == 3) {
                int i12 = this.f18298a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f18298a < 1 ? 0 : 1;
                }
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
            }
            i10 = this.f18298a;
        }
        return i10;
    }

    /* renamed from: t */
    public final long m8033t() {
        return ((this.f18298a * 12) + this.f18299b) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (C3487u) localDate.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C3487u mo7819a(long j6, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (C3487u) temporalField.mo8007X(this, j6);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.a0(j6);
        int i10 = AbstractC3470t.f18244a[chronoField.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j6;
            ChronoField.MONTH_OF_YEAR.a0(i11);
            return m8031Q(this.f18298a, i11);
        }
        if (i10 == 2) {
            return m8029I(j6 - m8033t());
        }
        if (i10 == 3) {
            if (this.f18298a < 1) {
                j6 = 1 - j6;
            }
            int i12 = (int) j6;
            ChronoField.YEAR.a0(i12);
            return m8031Q(i12, this.f18299b);
        }
        if (i10 == 4) {
            int i13 = (int) j6;
            ChronoField.YEAR.a0(i13);
            return m8031Q(i13, this.f18299b);
        }
        if (i10 != 5) {
            throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
        if (getLong(ChronoField.ERA) == j6) {
            return this;
        }
        int i14 = 1 - this.f18298a;
        ChronoField.YEAR.a0(i14);
        return m8031Q(i14, this.f18299b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C3487u mo7820b(long j6, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C3487u) temporalUnit.mo8009C(this, j6);
        }
        switch (AbstractC3470t.f18245b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m8029I(j6);
            case 2:
                return m8030K(j6);
            case 3:
                return m8030K(Math.multiplyExact(j6, 10));
            case 4:
                return m8030K(Math.multiplyExact(j6, 100));
            case 5:
                return m8030K(Math.multiplyExact(j6, IMAPStore.RESPONSE));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return mo7819a(Math.addExact(getLong(chronoField), j6), chronoField);
            default:
                throw new C3484n("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: K */
    public final C3487u m8030K(long j6) {
        if (j6 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return m8031Q(chronoField.f18248b.m8015a(this.f18298a + j6, chronoField), this.f18299b);
    }

    /* renamed from: I */
    public final C3487u m8029I(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (this.f18298a * 12) + (this.f18299b - 1) + j6;
        ChronoField chronoField = ChronoField.YEAR;
        long j11 = 12;
        return m8031Q(chronoField.f18248b.m8015a(Math.floorDiv(j10, j11), chronoField), ((int) Math.floorMod(j10, j11)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
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
        return temporal.mo7819a(m8033t(), ChronoField.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3487u) {
            C3487u c3487u = (C3487u) obj;
            if (this.f18298a == c3487u.f18298a && this.f18299b == c3487u.f18299b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18298a ^ (this.f18299b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f18298a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i10 = this.f18298a;
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f18298a);
        }
        sb2.append(this.f18299b < 10 ? "-0" : "-");
        sb2.append(this.f18299b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C3467q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
