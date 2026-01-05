package x1;

import c3.C0848c;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a */
    public final g4.l0 f39668a;

    /* renamed from: b */
    public InterfaceC7033t f39669b = null;

    /* renamed from: c */
    public InterfaceC7033t f39670c;

    public r1(g4.l0 l0Var, InterfaceC7033t interfaceC7033t) {
        this.f39668a = l0Var;
        this.f39670c = interfaceC7033t;
    }

    /* renamed from: a */
    public final long m15465a(long j6) {
        C0848c c0848cMo13298S;
        InterfaceC7033t interfaceC7033t = this.f39669b;
        C0848c c0848c = C0848c.f5353e;
        if (interfaceC7033t != null) {
            if (interfaceC7033t.mo13305s()) {
                InterfaceC7033t interfaceC7033t2 = this.f39670c;
                c0848cMo13298S = interfaceC7033t2 != null ? interfaceC7033t2.mo13298S(interfaceC7033t, true) : null;
            } else {
                c0848cMo13298S = c0848c;
            }
            if (c0848cMo13298S != null) {
                c0848c = c0848cMo13298S;
            }
        }
        int i10 = (int) (j6 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = c0848c.f5354a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = c0848c.f5356c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j6 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = c0848c.f5355b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = c0848c.f5357d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L);
    }

    /* renamed from: b */
    public final int m15466b(boolean z6, long j6) {
        if (z6) {
            j6 = m15465a(j6);
        }
        return this.f39668a.f13671b.m6474g(m15468d(j6));
    }

    /* renamed from: c */
    public final boolean m15467c(long j6) {
        long jM15468d = m15468d(m15465a(j6));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM15468d));
        g4.l0 l0Var = this.f39668a;
        int iM6472e = l0Var.f13671b.m6472e(fIntBitsToFloat);
        int i10 = (int) (jM15468d >> 32);
        return Float.intBitsToFloat(i10) >= l0Var.m6447e(iM6472e) && Float.intBitsToFloat(i10) <= l0Var.m6448f(iM6472e);
    }

    /* renamed from: d */
    public final long m15468d(long j6) {
        InterfaceC7033t interfaceC7033t;
        InterfaceC7033t interfaceC7033t2 = this.f39669b;
        if (interfaceC7033t2 == null) {
            return j6;
        }
        if (!interfaceC7033t2.mo13305s()) {
            interfaceC7033t2 = null;
        }
        if (interfaceC7033t2 == null || (interfaceC7033t = this.f39670c) == null) {
            return j6;
        }
        InterfaceC7033t interfaceC7033t3 = interfaceC7033t.mo13305s() ? interfaceC7033t : null;
        return interfaceC7033t3 == null ? j6 : interfaceC7033t2.c0(interfaceC7033t3, j6);
    }

    /* renamed from: e */
    public final long m15469e(long j6) {
        InterfaceC7033t interfaceC7033t;
        InterfaceC7033t interfaceC7033t2 = this.f39669b;
        if (interfaceC7033t2 == null) {
            return j6;
        }
        if (!interfaceC7033t2.mo13305s()) {
            interfaceC7033t2 = null;
        }
        if (interfaceC7033t2 == null || (interfaceC7033t = this.f39670c) == null) {
            return j6;
        }
        InterfaceC7033t interfaceC7033t3 = interfaceC7033t.mo13305s() ? interfaceC7033t : null;
        return interfaceC7033t3 == null ? j6 : interfaceC7033t3.c0(interfaceC7033t2, j6);
    }
}
