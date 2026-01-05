package p001o;

/* loaded from: classes3.dex */
public final class hg3 {

    /* renamed from: b */
    public static final C13937b f26833b = new C13937b(null);

    /* renamed from: a */
    public final String f26834a;

    /* renamed from: o.hg3$a */
    public static final class C13936a {

        /* renamed from: a */
        public String f26835a;

        /* renamed from: a */
        public final hg3 m30416a() {
            return new hg3(this, null);
        }

        /* renamed from: b */
        public final String m30417b() {
            return this.f26835a;
        }

        /* renamed from: c */
        public final void m30418c(String str) {
            this.f26835a = str;
        }
    }

    /* renamed from: o.hg3$b */
    public static final class C13937b {
        public C13937b() {
        }

        public /* synthetic */ C13937b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hg3(C13936a c13936a, id5 id5Var) {
        this(c13936a);
    }

    /* renamed from: a */
    public final String m30415a() {
        return this.f26834a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg3) && sq8.m48644c(this.f26834a, ((hg3) obj).f26834a);
    }

    public int hashCode() {
        String str = this.f26834a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CognitoIdentityProviderAuthSchemeParameters(");
        sb.append("operationName=" + this.f26834a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hg3(C13936a c13936a) {
        String strM30417b = c13936a.m30417b();
        if (strM30417b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f26834a = strM30417b;
    }
}
