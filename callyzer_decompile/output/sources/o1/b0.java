package o1;

import a2.C0037j;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public EnumC5267z f25700q;

    /* renamed from: r */
    public float f25701r;

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        int iM12920k;
        int iM12918i;
        int iM12917h;
        int iM12917h2;
        if (!C6745a.m12914e(j6) || this.f25700q == EnumC5267z.Vertical) {
            iM12920k = C6745a.m12920k(j6);
            iM12918i = C6745a.m12918i(j6);
        } else {
            int iRound = Math.round(C6745a.m12918i(j6) * this.f25701r);
            int iM12920k2 = C6745a.m12920k(j6);
            iM12920k = C6745a.m12918i(j6);
            if (iRound < iM12920k2) {
                iRound = iM12920k2;
            }
            if (iRound <= iM12920k) {
                iM12920k = iRound;
            }
            iM12918i = iM12920k;
        }
        if (!C6745a.m12913d(j6) || this.f25700q == EnumC5267z.Horizontal) {
            int iM12919j = C6745a.m12919j(j6);
            iM12917h = C6745a.m12917h(j6);
            iM12917h2 = iM12919j;
        } else {
            int iRound2 = Math.round(C6745a.m12917h(j6) * this.f25701r);
            int iM12919j2 = C6745a.m12919j(j6);
            iM12917h2 = C6745a.m12917h(j6);
            if (iRound2 < iM12919j2) {
                iRound2 = iM12919j2;
            }
            if (iRound2 <= iM12917h2) {
                iM12917h2 = iRound2;
            }
            iM12917h = iM12917h2;
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12923a(iM12920k, iM12918i, iM12917h2, iM12917h));
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 8));
    }
}
