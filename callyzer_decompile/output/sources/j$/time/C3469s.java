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

/* renamed from: j$.time.s */
/* loaded from: classes2.dex */
public final class C3469s implements Temporal, TemporalAdjuster, Comparable, Serializable {

    /* renamed from: b */
    public static final /* synthetic */ int f18242b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a */
    public final int f18243a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18243a - ((C3469s) obj).f18243a;
    }

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    }

    /* renamed from: t */
    public static C3469s m8000t(int i10) {
        ChronoField.YEAR.a0(i10);
        return new C3469s(i10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n */
    public final long mo7823n(Temporal temporal, TemporalUnit temporalUnit) {
        C3469s c3469sM8000t;
        if (temporal instanceof C3469s) {
            c3469sM8000t = (C3469s) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!IsoChronology.INSTANCE.equals(Chronology.m7890s(temporal))) {
                    temporal = LocalDate.m7825I(temporal);
                }
                c3469sM8000t = m8000t(temporal.mo7810h(ChronoField.YEAR));
            } catch (C3401c e2) {
                throw new C3401c("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e2);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j6 = c3469sM8000t.f18243a - this.f18243a;
            int i10 = AbstractC3468r.f18241b[((ChronoUnit) temporalUnit).ordinal()];
            if (i10 == 1) {
                return j6;
            }
            if (i10 == 2) {
                return j6 / 10;
            }
            if (i10 == 3) {
                return j6 / 100;
            }
            if (i10 == 4) {
                return j6 / 1000;
            }
            if (i10 == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return c3469sM8000t.getLong(chronoField) - getLong(chronoField);
            }
            throw new C3484n("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.mo8010t(this, c3469sM8000t);
    }

    public C3469s(int i10) {
        this.f18243a = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return C3485o.m8013f(1L, this.f18243a <= 0 ? 1000000000L : 999999999L);
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
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo8006Q(this);
        }
        int i10 = AbstractC3468r.f18240a[((ChronoField) temporalField).ordinal()];
        if (i10 == 1) {
            int i11 = this.f18243a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f18243a;
        }
        if (i10 == 3) {
            return this.f18243a < 1 ? 0 : 1;
        }
        throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (C3469s) localDate.mo7809f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C3469s mo7819a(long j6, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (C3469s) temporalField.mo8007X(this, j6);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.a0(j6);
        int i10 = AbstractC3468r.f18240a[chronoField.ordinal()];
        if (i10 == 1) {
            if (this.f18243a < 1) {
                j6 = 1 - j6;
            }
            return m8000t((int) j6);
        }
        if (i10 == 2) {
            return m8000t((int) j6);
        }
        if (i10 == 3) {
            return getLong(ChronoField.ERA) == j6 ? this : m8000t(1 - this.f18243a);
        }
        throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C3469s mo7820b(long j6, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C3469s) temporalUnit.mo8009C(this, j6);
        }
        int i10 = AbstractC3468r.f18241b[((ChronoUnit) temporalUnit).ordinal()];
        if (i10 == 1) {
            return m8002I(j6);
        }
        if (i10 == 2) {
            return m8002I(Math.multiplyExact(j6, 10));
        }
        if (i10 == 3) {
            return m8002I(Math.multiplyExact(j6, 100));
        }
        if (i10 == 4) {
            return m8002I(Math.multiplyExact(j6, IMAPStore.RESPONSE));
        }
        if (i10 == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return mo7819a(Math.addExact(getLong(chronoField), j6), chronoField);
        }
        throw new C3484n("Unsupported unit: " + temporalUnit);
    }

    /* renamed from: I */
    public final C3469s m8002I(long j6) {
        if (j6 == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return m8000t(chronoField.f18248b.m8015a(this.f18243a + j6, chronoField));
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
            return ChronoUnit.YEARS;
        }
        return super.mo7808d(c3429e);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        if (!Chronology.m7890s(temporal).equals(IsoChronology.INSTANCE)) {
            throw new C3401c("Adjustment only supported on ISO date-time");
        }
        return temporal.mo7819a(this.f18243a, ChronoField.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3469s) && this.f18243a == ((C3469s) obj).f18243a;
    }

    public final int hashCode() {
        return this.f18243a;
    }

    public final String toString() {
        return Integer.toString(this.f18243a);
    }

    private Object writeReplace() {
        return new C3467q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
