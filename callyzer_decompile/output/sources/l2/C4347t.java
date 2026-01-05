package l2;

import b2.C0558p;
import k2.AbstractC3967p;
import k2.C3952a;
import k2.InterfaceC3954c;
import k2.v1;
import k2.y1;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l2.t */
/* loaded from: classes.dex */
public final class C4347t extends i0 {

    /* renamed from: c */
    public static final C4347t f21840c = new C4347t(0, 3, 1);

    @Override // l2.i0
    /* renamed from: a */
    public final void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        v1 v1Var = (v1) c0558p.m1659g(1);
        C3952a c3952a = (C3952a) c0558p.m1659g(0);
        C4330c c4330c = (C4330c) c0558p.m1659g(2);
        y1 y1VarM8703q = v1Var.m8703q();
        try {
            if (!c4330c.f21805b.m9064e()) {
                AbstractC3967p.m8636c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            c4330c.f21804a.m9063d(interfaceC3954c, y1VarM8703q, c6739h);
            y1VarM8703q.m8736e(true);
            y1Var.m8735d();
            c3952a.getClass();
            y1Var.m8754y(v1Var, v1Var.m8700b(c3952a));
            y1Var.m8740j();
        } catch (Throwable th2) {
            y1VarM8703q.m8736e(false);
            throw th2;
        }
    }
}
