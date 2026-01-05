package p001o;

/* loaded from: classes3.dex */
public final class br0 {

    /* renamed from: c */
    public static final C12478b f16716c = new C12478b(null);

    /* renamed from: a */
    public final String f16717a;

    /* renamed from: b */
    public final String f16718b;

    /* renamed from: o.br0$a */
    public static final class C12477a {

        /* renamed from: a */
        public String f16719a;

        /* renamed from: b */
        public String f16720b;

        /* renamed from: a */
        public final br0 m19612a() {
            return new br0(this, null);
        }

        /* renamed from: b */
        public final String m19613b() {
            return this.f16719a;
        }

        /* renamed from: c */
        public final String m19614c() {
            return this.f16720b;
        }

        /* renamed from: d */
        public final void m19615d(String str) {
            this.f16719a = str;
        }

        /* renamed from: e */
        public final void m19616e(String str) {
            this.f16720b = str;
        }
    }

    /* renamed from: o.br0$b */
    public static final class C12478b {
        public C12478b() {
        }

        public /* synthetic */ C12478b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ br0(C12477a c12477a, id5 id5Var) {
        this(c12477a);
    }

    /* renamed from: a */
    public final String m19610a() {
        return this.f16717a;
    }

    /* renamed from: b */
    public final String m19611b() {
        return this.f16718b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || br0.class != obj.getClass()) {
            return false;
        }
        br0 br0Var = (br0) obj;
        return sq8.m48644c(this.f16717a, br0Var.f16717a) && sq8.m48644c(this.f16718b, br0Var.f16718b);
    }

    public int hashCode() {
        String str = this.f16717a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16718b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = "AssociateSoftwareTokenRequest(accessToken=*** Sensitive Data Redacted ***,session=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public br0(C12477a c12477a) {
        this.f16717a = c12477a.m19613b();
        this.f16718b = c12477a.m19614c();
    }
}
