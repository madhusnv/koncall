package o1;

import a2.C0037j;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public float f25846q;

    /* renamed from: r */
    public float f25847r;

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        int iA0 = i0Var.a0(i10);
        int iE0 = !Float.isNaN(this.f25847r) ? n0Var.e0(this.f25847r) : 0;
        return iA0 < iE0 ? iE0 : iA0;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        int iMo13311b = i0Var.mo13311b(i10);
        int iE0 = !Float.isNaN(this.f25847r) ? n0Var.e0(this.f25847r) : 0;
        return iMo13311b < iE0 ? iE0 : iMo13311b;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        int iM12920k;
        int iM12919j;
        if (Float.isNaN(this.f25846q) || C6745a.m12920k(j6) != 0) {
            iM12920k = C6745a.m12920k(j6);
        } else {
            int iE0 = l0Var.e0(this.f25846q);
            iM12920k = C6745a.m12918i(j6);
            if (iE0 < 0) {
                iE0 = 0;
            }
            if (iE0 <= iM12920k) {
                iM12920k = iE0;
            }
        }
        int iM12918i = C6745a.m12918i(j6);
        if (Float.isNaN(this.f25847r) || C6745a.m12919j(j6) != 0) {
            iM12919j = C6745a.m12919j(j6);
        } else {
            int iE02 = l0Var.e0(this.f25847r);
            iM12919j = C6745a.m12917h(j6);
            int i10 = iE02 >= 0 ? iE02 : 0;
            if (i10 <= iM12919j) {
                iM12919j = i10;
            }
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12923a(iM12920k, iM12918i, iM12919j, C6745a.m12917h(j6)));
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 11));
    }

    @Override // v3.InterfaceC7652x
    public final int k0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        int iMo13313y = i0Var.mo13313y(i10);
        int iE0 = !Float.isNaN(this.f25846q) ? n0Var.e0(this.f25846q) : 0;
        return iMo13313y < iE0 ? iE0 : iMo13313y;
    }

    @Override // v3.InterfaceC7652x
    public final int x0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        int iMo13312x = i0Var.mo13312x(i10);
        int iE0 = !Float.isNaN(this.f25846q) ? n0Var.e0(this.f25846q) : 0;
        return iMo13312x < iE0 ? iE0 : iMo13312x;
    }
}
