package p001o;

/* loaded from: classes6.dex */
public abstract class cwe {
    /* renamed from: b */
    public static final xk3 m21893b(q74 q74Var, nl7 nl7Var) {
        if (q74Var.get(p69.f39399t) == null) {
            return m21895d(kt7.f32697a, q74Var, nl7Var);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + q74Var).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ xk3 m21894c(q74 q74Var, nl7 nl7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            q74Var = e66.f21035a;
        }
        return m21893b(q74Var, nl7Var);
    }

    /* renamed from: d */
    public static final xk3 m21895d(final h84 h84Var, final q74 q74Var, final nl7 nl7Var) {
        return xk3.m56389h(new nl3() { // from class: o.bwe
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) {
                cwe.m21896e(h84Var, q74Var, nl7Var, fl3Var);
            }
        });
    }

    /* renamed from: e */
    public static final void m21896e(h84 h84Var, q74 q74Var, nl7 nl7Var, fl3 fl3Var) {
        awe aweVar = new awe(u74.m51082k(h84Var, q74Var), fl3Var);
        fl3Var.mo17342b(new yve(aweVar));
        aweVar.V0(l84.DEFAULT, aweVar, nl7Var);
    }
}
