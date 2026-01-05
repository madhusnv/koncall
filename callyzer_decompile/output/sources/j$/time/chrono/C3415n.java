package j$.time.chrono;

import j$.time.AbstractC3428d;
import j$.time.C3401c;
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
import java.util.Arrays;

/* renamed from: j$.time.chrono.n */
/* loaded from: classes2.dex */
public final class C3415n extends AbstractC3404c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a */
    public final transient C3413l f18085a;

    /* renamed from: b */
    public final transient int f18086b;

    /* renamed from: c */
    public final transient int f18087c;

    /* renamed from: d */
    public final transient int f18088d;

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: M */
    public final ChronoLocalDateTime mo7827M(LocalTime localTime) {
        return new C3406e(this, localTime);
    }

    public C3415n(C3413l c3413l, int i10, int i11, int i12) {
        c3413l.e0(i10, i11, i12);
        this.f18085a = c3413l;
        this.f18086b = i10;
        this.f18087c = i11;
        this.f18088d = i12;
    }

    public C3415n(C3413l c3413l, long j6) {
        int i10 = (int) j6;
        c3413l.b0();
        if (i10 < c3413l.f18077f || i10 >= c3413l.f18078g) {
            throw new C3401c("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(c3413l.f18076e, i10);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {c3413l.d0(iBinarySearch), ((c3413l.f18079h + iBinarySearch) % 12) + 1, (i10 - c3413l.f18076e[iBinarySearch]) + 1};
        this.f18085a = c3413l;
        this.f18086b = iArr[0];
        this.f18087c = iArr[1];
        this.f18088d = iArr[2];
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: g */
    public final Chronology mo7834g() {
        return this.f18085a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: P */
    public final InterfaceC3411j mo7828P() {
        return EnumC3416o.AH;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: V */
    public final int mo7831V() {
        return this.f18085a.h0(this.f18086b, 12);
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
        int i10 = AbstractC3414m.f18084a[chronoField.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f18085a.mo7891A(chronoField) : C3485o.m8013f(1L, 5L) : C3485o.m8013f(1L, mo7831V()) : C3485o.m8013f(1L, this.f18085a.f0(this.f18086b, this.f18087c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.mo8006Q(this);
        }
        switch (AbstractC3414m.f18084a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f18088d;
            case 2:
                return m7929X();
            case 3:
                return ((this.f18088d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((this.f18088d - 1) % 7) + 1;
            case 6:
                return ((m7929X() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((m7929X() - 1) / 7) + 1;
            case 9:
                return this.f18087c;
            case 10:
                return ((this.f18086b * 12) + this.f18087c) - 1;
            case 11:
                return this.f18086b;
            case 12:
                return this.f18086b;
            case 13:
                return this.f18086b <= 1 ? 0 : 1;
            default:
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final C3415n mo7819a(long j6, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (C3415n) super.mo7819a(j6, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.f18085a.mo7891A(chronoField).m8016b(j6, chronoField);
        int i10 = (int) j6;
        switch (AbstractC3414m.f18084a[chronoField.ordinal()]) {
            case 1:
                return c0(this.f18086b, this.f18087c, i10);
            case 2:
                return mo7916I(Math.min(i10, mo7831V()) - m7929X());
            case 3:
                return mo7916I((j6 - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return mo7916I(j6 - (((int) Math.floorMod(toEpochDay() + 3, 7)) + 1));
            case 5:
                return mo7916I(j6 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return mo7916I(j6 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C3415n(this.f18085a, j6);
            case 8:
                return mo7916I((j6 - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return c0(this.f18086b, i10, this.f18088d);
            case 10:
                return mo7917K(j6 - (((this.f18086b * 12) + this.f18087c) - 1));
            case 11:
                if (this.f18086b < 1) {
                    i10 = 1 - i10;
                }
                return c0(i10, this.f18087c, this.f18088d);
            case 12:
                return c0(i10, this.f18087c, this.f18088d);
            case 13:
                return c0(1 - this.f18086b, this.f18087c, this.f18088d);
            default:
                throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
    }

    public final C3415n c0(int i10, int i11, int i12) {
        int iF0 = this.f18085a.f0(i10, i11);
        if (i12 > iF0) {
            i12 = iF0;
        }
        return new C3415n(this.f18085a, i10, i11, i12);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo7835j(LocalDate localDate) {
        return (C3415n) super.mo7835j(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: j */
    public final ChronoLocalDate mo7835j(TemporalAdjuster temporalAdjuster) {
        return (C3415n) super.mo7835j(temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: S */
    public final ChronoLocalDate mo7830S(InterfaceC3482l interfaceC3482l) {
        return (C3415n) super.mo7830S(interfaceC3482l);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f18085a.e0(this.f18086b, this.f18087c, this.f18088d);
    }

    /* renamed from: X */
    public final int m7929X() {
        return this.f18085a.h0(this.f18086b, this.f18087c - 1) + this.f18088d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: z */
    public final boolean mo7837z() {
        return this.f18085a.mo7902Y(this.f18086b);
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: Q */
    public final ChronoLocalDate mo7918Q(long j6) {
        return j6 == 0 ? this : c0(Math.addExact(this.f18086b, (int) j6), this.f18087c, this.f18088d);
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C3415n mo7917K(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (this.f18086b * 12) + (this.f18087c - 1) + j6;
        C3413l c3413l = this.f18085a;
        long jFloorDiv = Math.floorDiv(j10, 12L);
        if (jFloorDiv >= c3413l.d0(0) && jFloorDiv <= c3413l.d0(c3413l.f18076e.length - 1) - 1) {
            return c0((int) jFloorDiv, ((int) Math.floorMod(j10, 12L)) + 1, this.f18088d);
        }
        throw new C3401c("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.AbstractC3404c
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C3415n mo7916I(long j6) {
        return new C3415n(this.f18085a, toEpochDay() + j6);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: b */
    public final ChronoLocalDate mo7820b(long j6, TemporalUnit temporalUnit) {
        return (C3415n) super.mo7820b(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: b */
    public final Temporal mo7820b(long j6, TemporalUnit temporalUnit) {
        return (C3415n) super.mo7820b(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: c */
    public final ChronoLocalDate mo7821c(long j6, TemporalUnit temporalUnit) {
        return (C3415n) super.mo7821c(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: c */
    public final Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return (C3415n) super.mo7821c(j6, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3415n) {
            C3415n c3415n = (C3415n) obj;
            if (this.f18086b == c3415n.f18086b && this.f18087c == c3415n.f18087c && this.f18088d == c3415n.f18088d && this.f18085a.equals(c3415n.f18085a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC3404c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i10 = this.f18086b;
        int i11 = this.f18087c;
        int i12 = this.f18088d;
        this.f18085a.getClass();
        return (((i10 << 11) + (i11 << 6)) + i12) ^ ((i10 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 6, this);
    }
}
