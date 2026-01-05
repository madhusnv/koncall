package p001o;

import android.util.Size;
import p001o.bhf;

/* loaded from: classes2.dex */
public final class e72 implements bhf.InterfaceC12405e {

    /* renamed from: a */
    public static final e72 f21088a = new e72();

    @Override // p001o.bhf.InterfaceC12405e
    /* renamed from: a */
    public void mo19064a(Size size, c9i c9iVar, bhf.C12402b c12402b) {
        bhf bhfVarM20537s = c9iVar.m20537s(null);
        mq3 mq3VarM49791X = tec.m49791X();
        int iM19036o = bhf.m19023b().m19036o();
        if (bhfVarM20537s != null) {
            iM19036o = bhfVarM20537s.m19036o();
            c12402b.m19039b(bhfVarM20537s.m19025c());
            c12402b.m19041d(bhfVarM20537s.m19032k());
            c12402b.m19040c(bhfVarM20537s.m19030i());
            mq3VarM49791X = bhfVarM20537s.m19027f();
        }
        c12402b.m19056t(mq3VarM49791X);
        if (c9iVar instanceof bhd) {
            chd.m21262b(size, c12402b);
        }
        d72 d72Var = new d72(c9iVar);
        c12402b.m19060x(d72Var.m22390Y(iM19036o));
        c12402b.m19043f(d72Var.m22391Z(l92.m36810b()));
        c12402b.m19048k(d72Var.c0(o82.m41758b()));
        c12402b.m19042e(ad2.m16892e(d72Var.b0(n52.m40114c())));
        c12402b.m19061y(c9iVar.m20538t());
        c12402b.m19059w(c9iVar.m20530B());
        qpb qpbVarA0 = qpb.a0();
        qpbVarA0.mo45760N(d72.f19170O, d72Var.a0(null));
        qpbVarA0.mo45760N(d72.f19165J, Long.valueOf(d72Var.d0(-1L)));
        c12402b.m19044g(qpbVarA0);
        c12402b.m19044g(d72Var.m22389X());
    }
}
