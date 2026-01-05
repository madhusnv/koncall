package j$.time.chrono;

import j$.time.AbstractC3428d;
import j$.time.C3401c;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.InterfaceC3482l;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: j$.time.chrono.t */
/* loaded from: classes2.dex */
public final class C3421t extends AbstractC3404c {

    /* renamed from: d */
    public static final LocalDate f18094d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a */
    public final transient LocalDate f18095a;

    /* renamed from: b */
    public final transient C3422u f18096b;

    /* renamed from: c */
    public final transient int f18097c;

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: M */
    public final ChronoLocalDateTime mo7827M(LocalTime localTime) {
        return new C3406e(this, localTime);
    }

    public C3421t(LocalDate localDate) {
        if (localDate.isBefore(f18094d)) {
            throw new C3401c("JapaneseDate before Meiji 6 is not supported");
        }
        C3422u c3422uM7931q = C3422u.m7931q(localDate);
        this.f18096b = c3422uM7931q;
        this.f18097c = (localDate.getYear() - c3422uM7931q.f18101b.getYear()) + 1;
        this.f18095a = localDate;
    }

    public C3421t(C3422u c3422u, int i10, LocalDate localDate) {
        if (localDate.isBefore(f18094d)) {
            throw new C3401c("JapaneseDate before Meiji 6 is not supported");
        }
        this.f18096b = c3422u;
        this.f18097c = i10;
        this.f18095a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: g */
    public final Chronology mo7834g() {
        return C3419r.f18092d;
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C3419r.f18092d.getClass();
        return this.f18095a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: P */
    public final InterfaceC3411j mo7828P() {
        return this.f18096b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: V */
    public final int mo7831V() {
        int iMo7831V;
        C3422u c3422uM7933r = this.f18096b.m7933r();
        if (c3422uM7933r != null && c3422uM7933r.f18101b.getYear() == this.f18095a.getYear()) {
            iMo7831V = c3422uM7933r.f18101b.m7829Q() - 1;
        } else {
            iMo7831V = this.f18095a.mo7831V();
        }
        return this.f18097c == 1 ? iMo7831V - (this.f18096b.f18101b.m7829Q() - 1) : iMo7831V;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    public final boolean mo7811i(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo8004C(this);
        }
        if (!mo7811i(temporalField)) {
            throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i10 = AbstractC3420s.f18093a[chronoField.ordinal()];
        if (i10 == 1) {
            return C3485o.m8013f(1L, this.f18095a.lengthOfMonth());
        }
        if (i10 == 2) {
            return C3485o.m8013f(1L, mo7831V());
        }
        if (i10 != 3) {
            return C3419r.f18092d.mo7891A(chronoField);
        }
        int year = this.f18096b.f18101b.getYear();
        return this.f18096b.m7933r() != null ? C3485o.m8013f(1L, (r0.f18101b.getYear() - year) + 1) : C3485o.m8013f(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo8006Q(this);
        }
        switch (AbstractC3420s.f18093a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.f18097c == 1 ? (this.f18095a.m7829Q() - this.f18096b.f18101b.m7829Q()) + 1 : this.f18095a.m7829Q();
            case 3:
                return this.f18097c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
            case 8:
                return this.f18096b.f18100a;
            default:
                return this.f18095a.getLong(temporalField);
        }
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C3421t mo7819a(long j6, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (getLong(chronoField) == j6) {
                return this;
            }
            int[] iArr = AbstractC3420s.f18093a;
            int i10 = iArr[chronoField.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                C3419r c3419r = C3419r.f18092d;
                int iM8015a = c3419r.mo7891A(chronoField).m8015a(j6, chronoField);
                int i11 = iArr[chronoField.ordinal()];
                if (i11 == 3) {
                    return b0(this.f18095a.k0(c3419r.mo7895F(this.f18096b, iM8015a)));
                }
                if (i11 == 8) {
                    return b0(this.f18095a.k0(c3419r.mo7895F(C3422u.m7932s(iM8015a), this.f18097c)));
                }
                if (i11 == 9) {
                    return b0(this.f18095a.k0(iM8015a));
                }
            }
            return b0(this.f18095a.mo7819a(j6, temporalField));
        }
        return (C3421t) super.mo7819a(j6, temporalField);
    }

    public final C3421t c0(TemporalAdjuster temporalAdjuster) {
        return (C3421t) super.mo7835j(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (C3421t) super.mo7835j(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: j */
    public final ChronoLocalDate mo7835j(TemporalAdjuster temporalAdjuster) {
        return (C3421t) super.mo7835j(temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: S */
    public final ChronoLocalDate mo7830S(InterfaceC3482l interfaceC3482l) {
        return (C3421t) super.mo7830S(interfaceC3482l);
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: Q */
    public final ChronoLocalDate mo7918Q(long j6) {
        return b0(this.f18095a.h0(j6));
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: K */
    public final ChronoLocalDate mo7917K(long j6) {
        return b0(this.f18095a.plusMonths(j6));
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: I */
    public final ChronoLocalDate mo7916I(long j6) {
        return b0(this.f18095a.plusDays(j6));
    }

    /* renamed from: X */
    public final C3421t m7930X(long j6, ChronoUnit chronoUnit) {
        return (C3421t) super.mo7820b(j6, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: b */
    public final ChronoLocalDate mo7820b(long j6, TemporalUnit temporalUnit) {
        return (C3421t) super.mo7820b(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: b */
    public final Temporal mo7820b(long j6, TemporalUnit temporalUnit) {
        return (C3421t) super.mo7820b(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: c */
    public final ChronoLocalDate mo7821c(long j6, TemporalUnit temporalUnit) {
        return (C3421t) super.mo7821c(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return (C3421t) super.mo7821c(j6, temporalUnit);
    }

    public final C3421t b0(LocalDate localDate) {
        return localDate.equals(this.f18095a) ? this : new C3421t(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f18095a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3421t) {
            return this.f18095a.equals(((C3421t) obj).f18095a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 4, this);
    }
}
