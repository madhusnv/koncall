package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.l */
/* loaded from: classes2.dex */
public final class C3462l implements TemporalAccessor, TemporalAdjuster, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f18226c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a */
    public final int f18227a;

    /* renamed from: b */
    public final int f18228b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3462l c3462l = (C3462l) obj;
        int i10 = this.f18227a - c3462l.f18227a;
        return i10 == 0 ? this.f18228b - c3462l.f18228b : i10;
    }

    static {
        new DateTimeFormatterBuilder().appendLiteral("--").appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();
    }

    public C3462l(int i10, int i11) {
        this.f18227a = i10;
        this.f18228b = i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.mo8005K();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return super.mo7812l(temporalField);
        }
        Month monthM7854K = Month.m7854K(this.f18227a);
        monthM7854K.getClass();
        int i10 = AbstractC3460j.f18224a[monthM7854K.ordinal()];
        return C3485o.m8014g(1L, i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28, Month.m7854K(this.f18227a).m7856I());
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
        int i11 = AbstractC3461k.f18225a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f18228b;
        } else {
            if (i11 != 2) {
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
            }
            i10 = this.f18227a;
        }
        return i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    public final Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18278b) {
            return IsoChronology.INSTANCE;
        }
        return super.mo7808d(c3429e);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        if (!Chronology.m7890s(temporal).equals(IsoChronology.INSTANCE)) {
            throw new C3401c("Adjustment only supported on ISO date-time");
        }
        Temporal temporalMo7819a = temporal.mo7819a(this.f18227a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalMo7819a.mo7819a(Math.min(temporalMo7819a.mo7812l(chronoField).f18287d, this.f18228b), chronoField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3462l) {
            C3462l c3462l = (C3462l) obj;
            if (this.f18227a == c3462l.f18227a && this.f18228b == c3462l.f18228b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18227a << 6) + this.f18228b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f18227a < 10 ? "0" : "");
        sb2.append(this.f18227a);
        sb2.append(this.f18228b < 10 ? "-0" : "-");
        sb2.append(this.f18228b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C3467q((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
