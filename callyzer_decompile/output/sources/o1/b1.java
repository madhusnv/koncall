package o1;

import a2.C0037j;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.AbstractC6753i;
import s4.C6745a;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public a1 f25702q;

    /* renamed from: r */
    public boolean f25703r;

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return i0Var.a0(i10);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return i0Var.mo13311b(i10);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        int iMo13312x = this.f25702q == a1.Min ? i0Var.mo13312x(C6745a.m12917h(j6)) : i0Var.mo13313y(C6745a.m12917h(j6));
        if (iMo13312x < 0) {
            iMo13312x = 0;
        }
        if (iMo13312x < 0) {
            AbstractC6753i.m12938a("width must be >= 0");
        }
        long jM12930h = AbstractC6746b.m12930h(iMo13312x, iMo13312x, 0, Integer.MAX_VALUE);
        if (this.f25703r) {
            jM12930h = AbstractC6746b.m12927e(j6, jM12930h);
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(jM12930h);
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 9));
    }

    @Override // v3.InterfaceC7652x
    public final int k0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return this.f25702q == a1.Min ? i0Var.mo13312x(i10) : i0Var.mo13313y(i10);
    }

    @Override // v3.InterfaceC7652x
    public final int x0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return this.f25702q == a1.Min ? i0Var.mo13312x(i10) : i0Var.mo13313y(i10);
    }
}
