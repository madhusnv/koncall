package p001o;

/* loaded from: classes3.dex */
public final class ote {

    /* renamed from: d */
    public static final C15892b f38888d = new C15892b(null);

    /* renamed from: a */
    public final String f38889a;

    /* renamed from: b */
    public final String f38890b;

    /* renamed from: c */
    public final String f38891c;

    /* renamed from: o.ote$a */
    public static final class C15891a {

        /* renamed from: a */
        public String f38892a;

        /* renamed from: b */
        public String f38893b;

        /* renamed from: c */
        public String f38894c;

        /* renamed from: a */
        public final ote m42666a() {
            return new ote(this, null);
        }

        /* renamed from: b */
        public final String m42667b() {
            return this.f38892a;
        }

        /* renamed from: c */
        public final String m42668c() {
            return this.f38893b;
        }

        /* renamed from: d */
        public final String m42669d() {
            return this.f38894c;
        }

        /* renamed from: e */
        public final void m42670e(String str) {
            this.f38892a = str;
        }

        /* renamed from: f */
        public final void m42671f(String str) {
            this.f38893b = str;
        }

        /* renamed from: g */
        public final void m42672g(String str) {
            this.f38894c = str;
        }
    }

    /* renamed from: o.ote$b */
    public static final class C15892b {
        public C15892b() {
        }

        public /* synthetic */ C15892b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ote m42673a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15891a c15891a = new C15891a();
            xk7Var.invoke(c15891a);
            return c15891a.m42666a();
        }
    }

    public /* synthetic */ ote(C15891a c15891a, id5 id5Var) {
        this(c15891a);
    }

    /* renamed from: a */
    public final String m42663a() {
        return this.f38889a;
    }

    /* renamed from: b */
    public final String m42664b() {
        return this.f38890b;
    }

    /* renamed from: c */
    public final String m42665c() {
        return this.f38891c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ote.class != obj.getClass()) {
            return false;
        }
        ote oteVar = (ote) obj;
        return sq8.m48644c(this.f38889a, oteVar.f38889a) && sq8.m48644c(this.f38890b, oteVar.f38890b) && sq8.m48644c(this.f38891c, oteVar.f38891c);
    }

    public int hashCode() {
        String str = this.f38889a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f38890b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f38891c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = "RevokeTokenRequest(clientId=*** Sensitive Data Redacted ***,clientSecret=*** Sensitive Data Redacted ***,token=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public ote(C15891a c15891a) {
        this.f38889a = c15891a.m42667b();
        this.f38890b = c15891a.m42668c();
        this.f38891c = c15891a.m42669d();
    }
}
