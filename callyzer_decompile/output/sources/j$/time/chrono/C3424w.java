package j$.time.chrono;

import j$.time.AbstractC3400b;
import j$.time.C3401c;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: j$.time.chrono.w */
/* loaded from: classes2.dex */
public final class C3424w extends AbstractC3402a implements Serializable {

    /* renamed from: d */
    public static final C3424w f18104d = new C3424w();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.Chronology
    /* renamed from: r */
    public final String mo7904r() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: D */
    public final InterfaceC3411j mo7893D(int i10) {
        if (i10 == 0) {
            return EnumC3427z.BEFORE_ROC;
        }
        if (i10 == 1) {
            return EnumC3427z.ROC;
        }
        throw new C3401c("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: v */
    public final String mo7905v() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: R */
    public final ChronoLocalDate mo7899R(int i10, int i11, int i12) {
        return new C3426y(LocalDate.of(i10 + 1911, i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: x */
    public final ChronoLocalDate mo7907x(int i10, int i11) {
        return new C3426y(LocalDate.e0(i10 + 1911, i11));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: q */
    public final ChronoLocalDate mo7903q(long j6) {
        return new C3426y(LocalDate.d0(j6));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: N */
    public final ChronoLocalDate mo7897N() {
        return new C3426y(LocalDate.m7825I(LocalDate.c0(AbstractC3400b.m7885d())));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: J */
    public final ChronoLocalDate mo7896J(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C3426y) {
            return (C3426y) temporalAccessor;
        }
        return new C3426y(LocalDate.m7825I(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: Y */
    public final boolean mo7902Y(long j6) {
        return IsoChronology.INSTANCE.mo7902Y(j6 + 1911);
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: F */
    public final int mo7895F(InterfaceC3411j interfaceC3411j, int i10) {
        if (interfaceC3411j instanceof EnumC3427z) {
            return interfaceC3411j == EnumC3427z.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: B */
    public final List mo7892B() {
        return AbstractC3400b.m7884c(EnumC3427z.values());
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: A */
    public final C3485o mo7891A(ChronoField chronoField) {
        int i10 = AbstractC3423v.f18103a[chronoField.ordinal()];
        if (i10 == 1) {
            C3485o c3485o = ChronoField.PROLEPTIC_MONTH.f18248b;
            return C3485o.m8013f(c3485o.f18284a - 22932, c3485o.f18287d - 22932);
        }
        if (i10 == 2) {
            C3485o c3485o2 = ChronoField.YEAR.f18248b;
            return C3485o.m8014g(1L, c3485o2.f18287d - 1911, (-c3485o2.f18284a) + 1912);
        }
        if (i10 != 3) {
            return chronoField.f18248b;
        }
        C3485o c3485o3 = ChronoField.YEAR.f18248b;
        return C3485o.m8013f(c3485o3.f18284a - 1911, c3485o3.f18287d - 1911);
    }

    @Override // j$.time.chrono.AbstractC3402a, j$.time.chrono.Chronology
    /* renamed from: T */
    public final ChronoLocalDate mo7900T(Map map, j$.time.format.b0 b0Var) {
        return (C3426y) super.mo7900T(map, b0Var);
    }

    private C3424w() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    /* renamed from: U */
    public final ChronoZonedDateTime mo7901U(Instant instant, ZoneId zoneId) {
        return C3410i.m7927I(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new a0((byte) 1, this);
    }
}
