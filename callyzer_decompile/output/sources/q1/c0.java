package q1;

import a2.C0037j;
import k2.b1;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.i0;
import t3.k0;
import t3.l0;
import t3.w0;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public float f29641q;

    /* renamed from: r */
    public b1 f29642r;

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final k0 mo148b(l0 l0Var, i0 i0Var, long j6) {
        b1 b1Var = this.f29642r;
        int iRound = (b1Var == null || ((Number) b1Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) b1Var.getValue()).floatValue() * this.f29641q);
        int iM12920k = iRound != Integer.MAX_VALUE ? iRound : C6745a.m12920k(j6);
        int iM12919j = C6745a.m12919j(j6);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C6745a.m12918i(j6);
        }
        w0 w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12923a(iM12920k, iRound, iM12919j, C6745a.m12917h(j6)));
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 12));
    }
}
