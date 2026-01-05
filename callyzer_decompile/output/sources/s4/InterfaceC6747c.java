package s4;

import og.af;
import og.ve;
import t4.AbstractC7041b;
import t4.InterfaceC7040a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.c */
/* loaded from: classes.dex */
public interface InterfaceC6747c {
    /* renamed from: A */
    default long mo8432A(float f6) {
        return mo8441l(mo8434J(f6));
    }

    /* renamed from: F */
    default float mo8433F(int i10) {
        return i10 / mo155a();
    }

    /* renamed from: J */
    default float mo8434J(float f6) {
        return f6 / mo155a();
    }

    /* renamed from: O */
    float mo154O();

    /* renamed from: T */
    default float mo8435T(float f6) {
        return mo155a() * f6;
    }

    /* renamed from: Z */
    default int mo8436Z(long j6) {
        return Math.round(n0(j6));
    }

    /* renamed from: a */
    float mo155a();

    default int e0(float f6) {
        float fMo8435T = mo8435T(f6);
        if (Float.isInfinite(fMo8435T)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo8435T);
    }

    /* renamed from: l */
    default long mo8441l(float f6) {
        float[] fArr = AbstractC7041b.f34055a;
        if (mo154O() < 1.03f) {
            return af.m10535d(f6 / mo154O(), 4294967296L);
        }
        InterfaceC7040a interfaceC7040aM13326a = AbstractC7041b.m13326a(mo154O());
        return af.m10535d(interfaceC7040aM13326a != null ? interfaceC7040aM13326a.mo12950a(f6) : f6 / mo154O(), 4294967296L);
    }

    default long l0(long j6) {
        if (j6 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo8435T = mo8435T(Float.intBitsToFloat((int) (j6 >> 32)));
        float fMo8435T2 = mo8435T(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        return (Float.floatToRawIntBits(fMo8435T2) & 4294967295L) | (Float.floatToRawIntBits(fMo8435T) << 32);
    }

    /* renamed from: m */
    default long mo8442m(long j6) {
        if (j6 != 9205357640488583168L) {
            return ve.m11019a(mo8434J(Float.intBitsToFloat((int) (j6 >> 32))), mo8434J(Float.intBitsToFloat((int) (j6 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float n0(long j6) {
        if (!C6760p.m12956a(C6759o.m12953b(j6), 4294967296L)) {
            AbstractC6753i.m12939b("Only Sp can convert to Px");
        }
        return mo8435T(mo8443p(j6));
    }

    /* renamed from: p */
    default float mo8443p(long j6) {
        float fM12954c;
        float fMo154O;
        if (!C6760p.m12956a(C6759o.m12953b(j6), 4294967296L)) {
            AbstractC6753i.m12939b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC7041b.f34055a;
        if (mo154O() >= 1.03f) {
            InterfaceC7040a interfaceC7040aM13326a = AbstractC7041b.m13326a(mo154O());
            fM12954c = C6759o.m12954c(j6);
            if (interfaceC7040aM13326a != null) {
                return interfaceC7040aM13326a.mo12951b(fM12954c);
            }
            fMo154O = mo154O();
        } else {
            fM12954c = C6759o.m12954c(j6);
            fMo154O = mo154O();
        }
        return fMo154O * fM12954c;
    }
}
