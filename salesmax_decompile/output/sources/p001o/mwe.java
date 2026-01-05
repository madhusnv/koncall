package p001o;

/* loaded from: classes6.dex */
public abstract class mwe {
    /* renamed from: b */
    public static final wtf m39737b(q74 q74Var, nl7 nl7Var) {
        if (q74Var.get(p69.f39399t) == null) {
            return m39738c(kt7.f32697a, q74Var, nl7Var);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + q74Var).toString());
    }

    /* renamed from: c */
    public static final wtf m39738c(final h84 h84Var, final q74 q74Var, final nl7 nl7Var) {
        return wtf.m55005e(new muf() { // from class: o.lwe
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                mwe.m39739d(h84Var, q74Var, nl7Var, aufVar);
            }
        });
    }

    /* renamed from: d */
    public static final void m39739d(h84 h84Var, q74 q74Var, nl7 nl7Var, auf aufVar) {
        kwe kweVar = new kwe(u74.m51082k(h84Var, q74Var), aufVar);
        aufVar.mo17848b(new yve(kweVar));
        kweVar.V0(l84.DEFAULT, kweVar, nl7Var);
    }
}
