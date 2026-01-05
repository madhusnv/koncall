package p001o;

/* loaded from: classes2.dex */
public final class nig implements qc4 {

    /* renamed from: a */
    public final xk7 f36895a;

    public nig(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "getProperty");
        this.f36895a = xk7Var;
    }

    /* renamed from: c */
    public static final String m40670c() {
        return "Attempting to load credentials from system properties " + oig.f38420a + '/' + oig.f38421b + '/' + oig.f38422c;
    }

    /* renamed from: b */
    public final String m40671b(String str) {
        String str2 = (String) this.f36895a.invoke(str);
        if (str2 != null) {
            if (!(!f9g.d0(str2))) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        throw new n2e("Missing value for system property `" + str + '`', null, 2, null);
    }

    @Override // p001o.qc4, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        q74 context = n64Var.getContext();
        uk7 uk7Var = new uk7() { // from class: o.mig
            @Override // p001o.uk7
            public final Object invoke() {
                return nig.m40670c();
            }
        };
        fja fjaVar = fja.Trace;
        String strMo26336c = kge.m35689b(nig.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
        return mc4.m38705a(m40671b(oig.f38420a), m40671b(oig.f38421b), (24 & 4) != 0 ? null : (String) this.f36895a.invoke(oig.f38422c), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : "SystemProperties", (24 & 32) != 0 ? null : (String) this.f36895a.invoke(oig.f38423d));
    }
}
