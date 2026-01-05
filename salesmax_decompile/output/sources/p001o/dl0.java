package p001o;

/* loaded from: classes5.dex */
public final class dl0 {

    /* renamed from: a */
    public static final dl0 f20160a = new dl0();

    /* renamed from: b */
    public static final String f20161b = dl0.class.getName();

    /* renamed from: a */
    public static final synchronized void m23384a(ua uaVar, ghf ghfVar) {
        if (a94.m16694d(dl0.class)) {
            return;
        }
        try {
            sq8.m48649h(uaVar, "accessTokenAppIdPair");
            sq8.m48649h(ghfVar, "appEvents");
            gl0.m28968b();
            m4d m4dVarM52895a = vk0.m52895a();
            m4dVarM52895a.m38352a(uaVar, ghfVar.m28721d());
            vk0.m52896b(m4dVarM52895a);
        } catch (Throwable th) {
            a94.m16692b(th, dl0.class);
        }
    }

    /* renamed from: b */
    public static final synchronized void m23385b(uk0 uk0Var) {
        if (a94.m16694d(dl0.class)) {
            return;
        }
        try {
            sq8.m48649h(uk0Var, "eventsToPersist");
            gl0.m28968b();
            m4d m4dVarM52895a = vk0.m52895a();
            for (ua uaVar : uk0Var.m51669f()) {
                ghf ghfVarM51666c = uk0Var.m51666c(uaVar);
                if (ghfVarM51666c == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                m4dVarM52895a.m38352a(uaVar, ghfVarM51666c.m28721d());
            }
            vk0.m52896b(m4dVarM52895a);
        } catch (Throwable th) {
            a94.m16692b(th, dl0.class);
        }
    }
}
