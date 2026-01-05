package p001o;

/* loaded from: classes3.dex */
public final class hg2 {

    /* renamed from: d */
    public static final C13935b f26826d = new C13935b(null);

    /* renamed from: a */
    public final String f26827a;

    /* renamed from: b */
    public final String f26828b;

    /* renamed from: c */
    public final String f26829c;

    /* renamed from: o.hg2$a */
    public static final class C13934a {

        /* renamed from: a */
        public String f26830a;

        /* renamed from: b */
        public String f26831b;

        /* renamed from: c */
        public String f26832c;

        /* renamed from: a */
        public final hg2 m30407a() {
            return new hg2(this, null);
        }

        /* renamed from: b */
        public final String m30408b() {
            return this.f26830a;
        }

        /* renamed from: c */
        public final String m30409c() {
            return this.f26831b;
        }

        /* renamed from: d */
        public final String m30410d() {
            return this.f26832c;
        }

        /* renamed from: e */
        public final void m30411e(String str) {
            this.f26830a = str;
        }

        /* renamed from: f */
        public final void m30412f(String str) {
            this.f26831b = str;
        }

        /* renamed from: g */
        public final void m30413g(String str) {
            this.f26832c = str;
        }
    }

    /* renamed from: o.hg2$b */
    public static final class C13935b {
        public C13935b() {
        }

        public /* synthetic */ C13935b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final hg2 m30414a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C13934a c13934a = new C13934a();
            xk7Var.invoke(c13934a);
            return c13934a.m30407a();
        }
    }

    public /* synthetic */ hg2(C13934a c13934a, id5 id5Var) {
        this(c13934a);
    }

    /* renamed from: a */
    public final String m30404a() {
        return this.f26827a;
    }

    /* renamed from: b */
    public final String m30405b() {
        return this.f26828b;
    }

    /* renamed from: c */
    public final String m30406c() {
        return this.f26829c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hg2.class != obj.getClass()) {
            return false;
        }
        hg2 hg2Var = (hg2) obj;
        return sq8.m48644c(this.f26827a, hg2Var.f26827a) && sq8.m48644c(this.f26828b, hg2Var.f26828b) && sq8.m48644c(this.f26829c, hg2Var.f26829c);
    }

    public int hashCode() {
        String str = this.f26827a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26828b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26829c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = "ChangePasswordRequest(accessToken=*** Sensitive Data Redacted ***,previousPassword=*** Sensitive Data Redacted ***,proposedPassword=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public hg2(C13934a c13934a) {
        this.f26827a = c13934a.m30408b();
        this.f26828b = c13934a.m30409c();
        this.f26829c = c13934a.m30410d();
    }
}
