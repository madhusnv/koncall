package j$.time.chrono;

import j$.time.AbstractC3428d;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.C3484n;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.InterfaceC3482l;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e0 extends AbstractC3404c {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a */
    public final transient LocalDate f18061a;

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: M */
    public final ChronoLocalDateTime mo7827M(LocalTime localTime) {
        return new C3406e(this, localTime);
    }

    public e0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f18061a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: g */
    public final Chronology mo7834g() {
        return c0.f18056d;
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        c0.f18056d.getClass();
        return this.f18061a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: P */
    public final InterfaceC3411j mo7828P() {
        return m7925X() >= 1 ? f0.BE : f0.BEFORE_BE;
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
        int i10 = d0.f18058a[chronoField.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f18061a.mo7812l(temporalField);
        }
        if (i10 != 4) {
            return c0.f18056d.mo7891A(chronoField);
        }
        C3485o c3485o = ChronoField.YEAR.f18248b;
        return C3485o.m8013f(1L, m7925X() <= 0 ? (-(c3485o.f18284a + 543)) + 1 : 543 + c3485o.f18287d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = d0.f18058a[((ChronoField) temporalField).ordinal()];
            if (i10 == 4) {
                int iM7925X = m7925X();
                if (iM7925X < 1) {
                    iM7925X = 1 - iM7925X;
                }
                return iM7925X;
            }
            if (i10 == 5) {
                return ((m7925X() * 12) + this.f18061a.getMonthValue()) - 1;
            }
            if (i10 == 6) {
                return m7925X();
            }
            if (i10 != 7) {
                return this.f18061a.getLong(temporalField);
            }
            return m7925X() < 1 ? 0 : 1;
        }
        return temporalField.mo8006Q(this);
    }

    /* renamed from: X */
    public final int m7925X() {
        return this.f18061a.getYear() + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.e0 mo7819a(long r8, j$.time.temporal.TemporalField r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto La3
            r0 = r10
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r7.getLong(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.d0.f18058a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L4d
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L4d
            if (r2 == r3) goto L4d
            goto L63
        L25:
            j$.time.chrono.c0 r10 = j$.time.chrono.c0.f18056d
            j$.time.temporal.o r10 = r10.mo7891A(r0)
            r10.m8016b(r8, r0)
            int r10 = r7.m7925X()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.LocalDate r10 = r7.f18061a
            int r10 = r10.getMonthValue()
            long r2 = (long) r10
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.LocalDate r10 = r7.f18061a
            j$.time.LocalDate r8 = r10.plusMonths(r8)
            j$.time.chrono.e0 r8 = r7.b0(r8)
            return r8
        L4d:
            j$.time.chrono.c0 r2 = j$.time.chrono.c0.f18056d
            j$.time.temporal.o r2 = r2.mo7891A(r0)
            int r2 = r2.m8015a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L8c
            if (r0 == r4) goto L7f
            if (r0 == r3) goto L6e
        L63:
            j$.time.LocalDate r0 = r7.f18061a
            j$.time.LocalDate r8 = r0.mo7819a(r8, r10)
            j$.time.chrono.e0 r8 = r7.b0(r8)
            return r8
        L6e:
            j$.time.LocalDate r8 = r7.f18061a
            int r9 = r7.m7925X()
            int r9 = (-542) - r9
            j$.time.LocalDate r8 = r8.k0(r9)
            j$.time.chrono.e0 r8 = r7.b0(r8)
            return r8
        L7f:
            j$.time.LocalDate r8 = r7.f18061a
            int r2 = r2 + (-543)
            j$.time.LocalDate r8 = r8.k0(r2)
            j$.time.chrono.e0 r8 = r7.b0(r8)
            return r8
        L8c:
            j$.time.LocalDate r8 = r7.f18061a
            int r9 = r7.m7925X()
            r10 = 1
            if (r9 < r10) goto L96
            goto L98
        L96:
            int r2 = 1 - r2
        L98:
            int r2 = r2 + (-543)
            j$.time.LocalDate r8 = r8.k0(r2)
            j$.time.chrono.e0 r8 = r7.b0(r8)
            return r8
        La3:
            j$.time.chrono.ChronoLocalDate r8 = super.mo7819a(r8, r10)
            j$.time.chrono.e0 r8 = (j$.time.chrono.e0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.e0.mo7819a(long, j$.time.temporal.TemporalField):j$.time.chrono.e0");
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (e0) super.mo7835j(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: j */
    public final ChronoLocalDate mo7835j(TemporalAdjuster temporalAdjuster) {
        return (e0) super.mo7835j(temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: S */
    public final ChronoLocalDate mo7830S(InterfaceC3482l interfaceC3482l) {
        return (e0) super.mo7830S(interfaceC3482l);
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: Q */
    public final ChronoLocalDate mo7918Q(long j6) {
        return b0(this.f18061a.h0(j6));
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: K */
    public final ChronoLocalDate mo7917K(long j6) {
        return b0(this.f18061a.plusMonths(j6));
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: I */
    public final ChronoLocalDate mo7916I(long j6) {
        return b0(this.f18061a.plusDays(j6));
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: b */
    public final ChronoLocalDate mo7820b(long j6, TemporalUnit temporalUnit) {
        return (e0) super.mo7820b(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: b */
    public final Temporal mo7820b(long j6, TemporalUnit temporalUnit) {
        return (e0) super.mo7820b(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: c */
    public final ChronoLocalDate mo7821c(long j6, TemporalUnit temporalUnit) {
        return (e0) super.mo7821c(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return (e0) super.mo7821c(j6, temporalUnit);
    }

    public final e0 b0(LocalDate localDate) {
        return localDate.equals(this.f18061a) ? this : new e0(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f18061a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f18061a.equals(((e0) obj).f18061a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 8, this);
    }
}
