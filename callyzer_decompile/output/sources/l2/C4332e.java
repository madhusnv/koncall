package l2;

import b2.C0558p;
import k2.AbstractC3967p;
import k2.C3952a;
import k2.InterfaceC3954c;
import k2.s1;
import k2.y1;
import m2.C4640e;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l2.e */
/* loaded from: classes.dex */
public final class C4332e extends i0 {

    /* renamed from: c */
    public static final C4332e f21809c = new C4332e(0, 2, 1);

    @Override // l2.i0
    /* renamed from: a */
    public final void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        C3952a c3952a = (C3952a) c0558p.m1659g(0);
        Object objM1659g = c0558p.m1659g(1);
        if (objM1659g instanceof s1) {
            ((C4640e) c6739h.f32182c).m9506b((s1) objM1659g);
        }
        if (y1Var.f20623n != 0) {
            AbstractC3967p.m8636c("Can only append a slot if not current inserting");
        }
        int i10 = y1Var.f20618i;
        int i11 = y1Var.f20619j;
        int iM8734c = y1Var.m8734c(c3952a);
        int iM8737f = y1Var.m8737f(y1Var.m8747q(iM8734c + 1), y1Var.f20611b);
        y1Var.f20618i = iM8737f;
        y1Var.f20619j = iM8737f;
        y1Var.m8752v(1, iM8734c);
        if (i10 >= iM8737f) {
            i10++;
            i11++;
        }
        y1Var.f20612c[iM8737f] = objM1659g;
        y1Var.f20618i = i10;
        y1Var.f20619j = i11;
    }
}
