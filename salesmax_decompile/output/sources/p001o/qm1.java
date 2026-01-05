package p001o;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class qm1 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m45640a(q74 q74Var, nl7 nl7Var) {
        ek6 ek6VarM43812a;
        q74 q74VarM51082k;
        Thread threadCurrentThread = Thread.currentThread();
        p64 p64Var = (p64) q74Var.get(p64.f39391p);
        if (p64Var == null) {
            ek6VarM43812a = pkh.f40203a.m43813b();
            q74VarM51082k = u74.m51082k(kt7.f32697a, q74Var.plus(ek6VarM43812a));
        } else {
            ek6 ek6Var = p64Var instanceof ek6 ? (ek6) p64Var : null;
            if (ek6Var == null) {
                ek6VarM43812a = pkh.f40203a.m43812a();
                q74VarM51082k = u74.m51082k(kt7.f32697a, q74Var);
            } else {
                ek6 ek6Var2 = ek6Var.K0() ? ek6Var : null;
                if (ek6Var2 != null) {
                    ek6VarM43812a = ek6Var2;
                }
                q74VarM51082k = u74.m51082k(kt7.f32697a, q74Var);
            }
        }
        oj1 oj1Var = new oj1(q74VarM51082k, threadCurrentThread, ek6VarM43812a);
        oj1Var.V0(l84.DEFAULT, oj1Var, nl7Var);
        return oj1Var.W0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m45641b(q74 q74Var, nl7 nl7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            q74Var = e66.f21035a;
        }
        return pm1.m43865e(q74Var, nl7Var);
    }
}
