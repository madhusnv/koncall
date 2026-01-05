package p001o;

import java.util.concurrent.CancellationException;
import p001o.p69;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a79 {

    /* renamed from: o.a79$a */
    public /* synthetic */ class C12103a extends dm7 implements xk7 {
        public C12103a(Object obj) {
            super(1, obj, b79.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void m16557b(Throwable th) {
            ((b79) this.receiver).mo18251w(th);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m16557b((Throwable) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final kl3 m16543a(p69 p69Var) {
        return new s69(p69Var);
    }

    /* renamed from: b */
    public static /* synthetic */ kl3 m16544b(p69 p69Var, int i, Object obj) {
        if ((i & 1) != 0) {
            p69Var = null;
        }
        return z69.m58836a(p69Var);
    }

    /* renamed from: c */
    public static final void m16545c(q74 q74Var, CancellationException cancellationException) {
        p69 p69Var = (p69) q74Var.get(p69.f39399t);
        if (p69Var != null) {
            p69Var.mo22429f(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m16546d(p69 p69Var, String str, Throwable th) {
        p69Var.mo22429f(al6.m17345a(str, th));
    }

    /* renamed from: e */
    public static /* synthetic */ void m16547e(q74 q74Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        z69.m58838c(q74Var, cancellationException);
    }

    /* renamed from: f */
    public static /* synthetic */ void m16548f(p69 p69Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        z69.m58839d(p69Var, str, th);
    }

    /* renamed from: g */
    public static final Object m16549g(p69 p69Var, n64 n64Var) {
        p69.C15966a.m42999a(p69Var, null, 1, null);
        Object objD0 = p69Var.d0(n64Var);
        return objD0 == uq8.m51918f() ? objD0 : y3i.f54824a;
    }

    /* renamed from: h */
    public static final yu5 m16550h(p69 p69Var, yu5 yu5Var) {
        return m16555m(p69Var, false, new fv5(yu5Var), 1, null);
    }

    /* renamed from: i */
    public static final void m16551i(q74 q74Var) {
        p69 p69Var = (p69) q74Var.get(p69.f39399t);
        if (p69Var != null) {
            z69.m58845j(p69Var);
        }
    }

    /* renamed from: j */
    public static final void m16552j(p69 p69Var) {
        if (!p69Var.mo22428a()) {
            throw p69Var.mo22431r();
        }
    }

    /* renamed from: k */
    public static final p69 m16553k(q74 q74Var) {
        p69 p69Var = (p69) q74Var.get(p69.f39399t);
        if (p69Var != null) {
            return p69Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + q74Var).toString());
    }

    /* renamed from: l */
    public static final yu5 m16554l(p69 p69Var, boolean z, b79 b79Var) {
        return p69Var instanceof d79 ? ((d79) p69Var).p0(z, b79Var) : p69Var.mo22422T(b79Var.mo18250v(), z, new C12103a(b79Var));
    }

    /* renamed from: m */
    public static /* synthetic */ yu5 m16555m(p69 p69Var, boolean z, b79 b79Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return z69.m58847l(p69Var, z, b79Var);
    }

    /* renamed from: n */
    public static final boolean m16556n(q74 q74Var) {
        p69 p69Var = (p69) q74Var.get(p69.f39399t);
        if (p69Var != null) {
            return p69Var.mo22428a();
        }
        return true;
    }
}
