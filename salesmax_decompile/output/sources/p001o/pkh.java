package p001o;

/* loaded from: classes6.dex */
public final class pkh {

    /* renamed from: a */
    public static final pkh f40203a = new pkh();

    /* renamed from: b */
    public static final ThreadLocal f40204b = rkh.m46875a(new lgg("ThreadLocalEventLoop"));

    /* renamed from: a */
    public final ek6 m43812a() {
        return (ek6) f40204b.get();
    }

    /* renamed from: b */
    public final ek6 m43813b() {
        ThreadLocal threadLocal = f40204b;
        ek6 ek6Var = (ek6) threadLocal.get();
        if (ek6Var != null) {
            return ek6Var;
        }
        ek6 ek6VarM30680a = hk6.m30680a();
        threadLocal.set(ek6VarM30680a);
        return ek6VarM30680a;
    }

    /* renamed from: c */
    public final void m43814c() {
        f40204b.set(null);
    }

    /* renamed from: d */
    public final void m43815d(ek6 ek6Var) {
        f40204b.set(ek6Var);
    }
}
