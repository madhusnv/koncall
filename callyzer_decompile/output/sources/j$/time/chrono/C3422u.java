package j$.time.chrono;

import j$.time.C3401c;
import j$.time.LocalDate;
import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.u */
/* loaded from: classes2.dex */
public final class C3422u implements InterfaceC3411j, Serializable {

    /* renamed from: d */
    public static final C3422u f18098d;

    /* renamed from: e */
    public static final C3422u[] f18099e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a */
    public final transient int f18100a;

    /* renamed from: b */
    public final transient LocalDate f18101b;

    /* renamed from: c */
    public final transient String f18102c;

    static {
        C3422u c3422u = new C3422u(-1, LocalDate.of(1868, 1, 1), "Meiji");
        f18098d = c3422u;
        f18099e = new C3422u[]{c3422u, new C3422u(0, LocalDate.of(1912, 7, 30), "Taisho"), new C3422u(1, LocalDate.of(1926, 12, 25), "Showa"), new C3422u(2, LocalDate.of(1989, 1, 8), "Heisei"), new C3422u(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    /* renamed from: r */
    public final C3422u m7933r() {
        if (this == f18099e[r0.length - 1]) {
            return null;
        }
        return m7932s(this.f18100a + 1);
    }

    public C3422u(int i10, LocalDate localDate, String str) {
        this.f18100a = i10;
        this.f18101b = localDate;
        this.f18102c = str;
    }

    /* renamed from: s */
    public static C3422u m7932s(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            C3422u[] c3422uArr = f18099e;
            if (i11 < c3422uArr.length) {
                return c3422uArr[i11];
            }
        }
        throw new C3401c("Invalid era: " + i10);
    }

    /* renamed from: q */
    public static C3422u m7931q(LocalDate localDate) {
        if (localDate.isBefore(C3421t.f18094d)) {
            throw new C3401c("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f18099e.length - 1; length >= 0; length--) {
            C3422u c3422u = f18099e[length];
            if (localDate.compareTo(c3422u.f18101b) >= 0) {
                return c3422u;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.InterfaceC3411j
    public final int getValue() {
        return this.f18100a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return C3419r.f18092d.mo7891A(chronoField);
        }
        return super.mo7812l(temporalField);
    }

    public final String toString() {
        return this.f18102c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 5, this);
    }
}
