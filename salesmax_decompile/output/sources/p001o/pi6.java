package p001o;

/* loaded from: classes2.dex */
public final class pi6 implements qc4 {

    /* renamed from: a */
    public final xk7 f40142a;

    public pi6(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "getEnv");
        this.f40142a = xk7Var;
    }

    /* renamed from: c */
    public static final String m43726c() {
        return "Attempting to load credentials from env vars " + qi6.f42026a + '/' + qi6.f42027b + '/' + qi6.f42028c;
    }

    /* renamed from: b */
    public final String m43727b(String str) {
        String str2 = (String) this.f40142a.invoke(str);
        if (str2 != null) {
            if (!(!f9g.d0(str2))) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        throw new n2e("Missing value for environment variable `" + str + '`', null, 2, null);
    }

    @Override // p001o.qc4, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        q74 context = n64Var.getContext();
        uk7 uk7Var = new uk7() { // from class: o.oi6
            @Override // p001o.uk7
            public final Object invoke() {
                return pi6.m43726c();
            }
        };
        fja fjaVar = fja.Trace;
        String strMo26336c = kge.m35689b(pi6.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
        return mc4.m38705a(m43727b(qi6.f42026a), m43727b(qi6.f42027b), (24 & 4) != 0 ? null : (String) this.f40142a.invoke(qi6.f42028c), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : "Environment", (24 & 32) != 0 ? null : (String) this.f40142a.invoke(qi6.f42029d));
    }
}
