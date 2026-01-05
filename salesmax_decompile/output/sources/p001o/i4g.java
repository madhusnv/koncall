package p001o;

/* loaded from: classes3.dex */
public final class i4g {

    /* renamed from: b */
    public static final C14184b f28080b = new C14184b(null);

    /* renamed from: a */
    public final vv5 f28081a;

    /* renamed from: o.i4g$a */
    public static final class C14183a {

        /* renamed from: a */
        public vv5 f28082a;

        /* renamed from: a */
        public final i4g m31564a() {
            return new i4g(this, null);
        }

        /* renamed from: b */
        public final C14183a m31565b() {
            return this;
        }

        /* renamed from: c */
        public final vv5 m31566c() {
            return this.f28082a;
        }

        /* renamed from: d */
        public final void m31567d(vv5 vv5Var) {
            this.f28082a = vv5Var;
        }
    }

    /* renamed from: o.i4g$b */
    public static final class C14184b {
        public C14184b() {
        }

        public /* synthetic */ C14184b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ i4g(C14183a c14183a, id5 id5Var) {
        this(c14183a);
    }

    /* renamed from: a */
    public final vv5 m31563a() {
        return this.f28081a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i4g.class == obj.getClass() && sq8.m48644c(this.f28081a, ((i4g) obj).f28081a);
    }

    public int hashCode() {
        vv5 vv5Var = this.f28081a;
        if (vv5Var != null) {
            return vv5Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StartWebAuthnRegistrationResponse(");
        sb.append("credentialCreationOptions=" + this.f28081a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public i4g(C14183a c14183a) {
        this.f28081a = c14183a.m31566c();
    }
}
