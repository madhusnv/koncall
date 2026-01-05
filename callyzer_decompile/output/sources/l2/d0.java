package l2;

import b2.C0558p;
import k2.AbstractC3967p;
import k2.C3952a;
import k2.InterfaceC3954c;
import k2.n1;
import k2.s1;
import k2.y1;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends i0 {

    /* renamed from: c */
    public static final d0 f21808c = new d0(1, 0, 2);

    @Override // l2.i0
    /* renamed from: a */
    public final void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        int iM8734c;
        int iM8745o;
        int iM1658f = c0558p.m1658f(0);
        int iM8745o2 = y1Var.m8745o();
        int i10 = y1Var.f20631v;
        int iM8723K = y1Var.m8723K(y1Var.m8747q(i10), y1Var.f20611b);
        int iM8737f = y1Var.m8737f(y1Var.m8747q(i10 + 1), y1Var.f20611b);
        for (int iMax = Math.max(iM8723K, iM8737f - iM1658f); iMax < iM8737f; iMax++) {
            Object obj = y1Var.f20612c[y1Var.m8738g(iMax)];
            if (obj instanceof s1) {
                int i11 = iM8745o2 - iMax;
                s1 s1Var = (s1) obj;
                C3952a c3952a = s1Var.f20550b;
                if (c3952a == null || !c3952a.m8486a()) {
                    iM8734c = -1;
                    iM8745o = -1;
                } else {
                    iM8734c = y1Var.m8734c(c3952a);
                    iM8745o = y1Var.m8745o() - y1Var.m8725M(iM8734c);
                }
                c6739h.m12898f(s1Var, i11, iM8734c, iM8745o);
            } else if (obj instanceof n1) {
                ((n1) obj).m8579d();
            }
        }
        if (iM1658f <= 0) {
            AbstractC3967p.m8636c("Check failed");
        }
        int i12 = y1Var.f20631v;
        int iM8723K2 = y1Var.m8723K(y1Var.m8747q(i12), y1Var.f20611b);
        int iM8737f2 = y1Var.m8737f(y1Var.m8747q(i12 + 1), y1Var.f20611b) - iM1658f;
        if (iM8737f2 < iM8723K2) {
            AbstractC3967p.m8636c("Check failed");
        }
        y1Var.m8720H(iM8737f2, iM1658f, i12);
        int i13 = y1Var.f20618i;
        if (i13 >= iM8723K2) {
            y1Var.f20618i = i13 - iM1658f;
        }
    }
}
