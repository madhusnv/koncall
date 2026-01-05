package p001o;

/* loaded from: classes3.dex */
public final class jr5 {

    /* renamed from: c */
    public static final C14638b f30990c = new C14638b(null);

    /* renamed from: a */
    public final String f30991a;

    /* renamed from: b */
    public final String f30992b;

    /* renamed from: o.jr5$a */
    public static final class C14637a {

        /* renamed from: a */
        public String f30993a;

        /* renamed from: b */
        public String f30994b;

        /* renamed from: a */
        public final jr5 m34375a() {
            return new jr5(this, null);
        }

        /* renamed from: b */
        public final String m34376b() {
            return this.f30993a;
        }

        /* renamed from: c */
        public final String m34377c() {
            return this.f30994b;
        }

        /* renamed from: d */
        public final void m34378d(String str) {
            this.f30993a = str;
        }

        /* renamed from: e */
        public final void m34379e(String str) {
            this.f30994b = str;
        }
    }

    /* renamed from: o.jr5$b */
    public static final class C14638b {
        public C14638b() {
        }

        public /* synthetic */ C14638b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final jr5 m34380a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C14637a c14637a = new C14637a();
            xk7Var.invoke(c14637a);
            return c14637a.m34375a();
        }
    }

    public /* synthetic */ jr5(C14637a c14637a, id5 id5Var) {
        this(c14637a);
    }

    /* renamed from: a */
    public final String m34373a() {
        return this.f30991a;
    }

    /* renamed from: b */
    public final String m34374b() {
        return this.f30992b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jr5.class != obj.getClass()) {
            return false;
        }
        jr5 jr5Var = (jr5) obj;
        return sq8.m48644c(this.f30991a, jr5Var.f30991a) && sq8.m48644c(this.f30992b, jr5Var.f30992b);
    }

    public int hashCode() {
        String str = this.f30991a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30992b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceSecretVerifierConfigType(");
        sb.append("passwordVerifier=" + this.f30991a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("salt=");
        sb2.append(this.f30992b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jr5(C14637a c14637a) {
        this.f30991a = c14637a.m34376b();
        this.f30992b = c14637a.m34377c();
    }
}
