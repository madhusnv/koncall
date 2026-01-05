package p001o;

/* loaded from: classes3.dex */
public final class hc0 {

    /* renamed from: b */
    public static final C13909b f26603b = new C13909b(null);

    /* renamed from: a */
    public final String f26604a;

    /* renamed from: o.hc0$a */
    public static final class C13908a {

        /* renamed from: a */
        public String f26605a;

        /* renamed from: a */
        public final hc0 m30164a() {
            return new hc0(this, null);
        }

        /* renamed from: b */
        public final String m30165b() {
            return this.f26605a;
        }

        /* renamed from: c */
        public final void m30166c(String str) {
            this.f26605a = str;
        }
    }

    /* renamed from: o.hc0$b */
    public static final class C13909b {
        public C13909b() {
        }

        public /* synthetic */ C13909b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final hc0 m30167a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C13908a c13908a = new C13908a();
            xk7Var.invoke(c13908a);
            return c13908a.m30164a();
        }
    }

    public /* synthetic */ hc0(C13908a c13908a, id5 id5Var) {
        this(c13908a);
    }

    /* renamed from: a */
    public final String m30163a() {
        return this.f26604a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hc0.class == obj.getClass() && sq8.m48644c(this.f26604a, ((hc0) obj).f26604a);
    }

    public int hashCode() {
        String str = this.f26604a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnalyticsMetadataType(");
        sb.append("analyticsEndpointId=" + this.f26604a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hc0(C13908a c13908a) {
        this.f26604a = c13908a.m30165b();
    }
}
