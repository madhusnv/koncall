package p001o;

/* loaded from: classes2.dex */
public final class z1g {

    /* renamed from: b */
    public static final C18545b f56424b = new C18545b(null);

    /* renamed from: a */
    public final String f56425a;

    /* renamed from: o.z1g$a */
    public static final class C18544a {

        /* renamed from: a */
        public String f56426a;

        /* renamed from: a */
        public final z1g m58653a() {
            return new z1g(this, null);
        }

        /* renamed from: b */
        public final String m58654b() {
            return this.f56426a;
        }

        /* renamed from: c */
        public final void m58655c(String str) {
            this.f56426a = str;
        }
    }

    /* renamed from: o.z1g$b */
    public static final class C18545b {
        public C18545b() {
        }

        public /* synthetic */ C18545b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ z1g(C18544a c18544a, id5 id5Var) {
        this(c18544a);
    }

    /* renamed from: a */
    public final String m58652a() {
        return this.f56425a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1g) && sq8.m48644c(this.f56425a, ((z1g) obj).f56425a);
    }

    public int hashCode() {
        String str = this.f56425a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SsoOidcAuthSchemeParameters(");
        sb.append("operationName=" + this.f56425a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public z1g(C18544a c18544a) {
        String strM58654b = c18544a.m58654b();
        if (strM58654b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f56425a = strM58654b;
    }
}
