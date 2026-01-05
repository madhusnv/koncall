package p001o;

/* loaded from: classes2.dex */
public final class n1g {

    /* renamed from: b */
    public static final C15472b f36239b = new C15472b(null);

    /* renamed from: a */
    public final String f36240a;

    /* renamed from: o.n1g$a */
    public static final class C15471a {

        /* renamed from: a */
        public String f36241a;

        /* renamed from: a */
        public final n1g m39996a() {
            return new n1g(this, null);
        }

        /* renamed from: b */
        public final String m39997b() {
            return this.f36241a;
        }

        /* renamed from: c */
        public final void m39998c(String str) {
            this.f36241a = str;
        }
    }

    /* renamed from: o.n1g$b */
    public static final class C15472b {
        public C15472b() {
        }

        public /* synthetic */ C15472b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ n1g(C15471a c15471a, id5 id5Var) {
        this(c15471a);
    }

    /* renamed from: a */
    public final String m39995a() {
        return this.f36240a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1g) && sq8.m48644c(this.f36240a, ((n1g) obj).f36240a);
    }

    public int hashCode() {
        String str = this.f36240a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SsoAuthSchemeParameters(");
        sb.append("operationName=" + this.f36240a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public n1g(C15471a c15471a) {
        String strM39997b = c15471a.m39997b();
        if (strM39997b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f36240a = strM39997b;
    }
}
