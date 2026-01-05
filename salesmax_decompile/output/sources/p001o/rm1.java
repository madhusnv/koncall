package p001o;

import p001o.p64;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class rm1 {
    /* renamed from: a */
    public static final ck5 m46949a(h84 h84Var, q74 q74Var, l84 l84Var, nl7 nl7Var) {
        q74 q74VarM51082k = u74.m51082k(h84Var, q74Var);
        dk5 mi9Var = l84Var.isLazy() ? new mi9(q74VarM51082k, nl7Var) : new dk5(q74VarM51082k, true);
        mi9Var.V0(l84Var, mi9Var, nl7Var);
        return mi9Var;
    }

    /* renamed from: b */
    public static /* synthetic */ ck5 m46950b(h84 h84Var, q74 q74Var, l84 l84Var, nl7 nl7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            q74Var = e66.f21035a;
        }
        if ((i & 2) != 0) {
            l84Var = l84.DEFAULT;
        }
        return pm1.m43861a(h84Var, q74Var, l84Var, nl7Var);
    }

    /* renamed from: c */
    public static final p69 m46951c(h84 h84Var, q74 q74Var, l84 l84Var, nl7 nl7Var) {
        q74 q74VarM51082k = u74.m51082k(h84Var, q74Var);
        b3g vi9Var = l84Var.isLazy() ? new vi9(q74VarM51082k, nl7Var) : new b3g(q74VarM51082k, true);
        vi9Var.V0(l84Var, vi9Var, nl7Var);
        return vi9Var;
    }

    /* renamed from: d */
    public static /* synthetic */ p69 m46952d(h84 h84Var, q74 q74Var, l84 l84Var, nl7 nl7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            q74Var = e66.f21035a;
        }
        if ((i & 2) != 0) {
            l84Var = l84.DEFAULT;
        }
        return pm1.m43863c(h84Var, q74Var, l84Var, nl7Var);
    }

    /* renamed from: e */
    public static final Object m46953e(q74 q74Var, nl7 nl7Var, n64 n64Var) {
        Object objW0;
        q74 context = n64Var.getContext();
        q74 q74VarM51081j = u74.m51081j(context, q74Var);
        z69.m58844i(q74VarM51081j);
        if (q74VarM51081j == context) {
            f6f f6fVar = new f6f(q74VarM51081j, n64Var);
            objW0 = i3i.m31474b(f6fVar, f6fVar, nl7Var);
        } else {
            p64.C15962b c15962b = p64.f39391p;
            if (sq8.m48644c(q74VarM51081j.get(c15962b), context.get(c15962b))) {
                h3i h3iVar = new h3i(q74VarM51081j, n64Var);
                q74 context2 = h3iVar.getContext();
                Object objM35820i = kkh.m35820i(context2, null);
                try {
                    Object objM31474b = i3i.m31474b(h3iVar, h3iVar, nl7Var);
                    kkh.m35817f(context2, objM35820i);
                    objW0 = objM31474b;
                } catch (Throwable th) {
                    kkh.m35817f(context2, objM35820i);
                    throw th;
                }
            } else {
                au5 au5Var = new au5(q74VarM51081j, n64Var);
                dc2.m22769c(nl7Var, au5Var, au5Var);
                objW0 = au5Var.W0();
            }
        }
        if (objW0 == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objW0;
    }
}
