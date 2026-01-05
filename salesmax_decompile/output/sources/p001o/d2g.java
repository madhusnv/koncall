package p001o;

/* loaded from: classes2.dex */
public final class d2g {

    /* renamed from: e */
    public static final C12788b f19037e = new C12788b(null);

    /* renamed from: a */
    public final String f19038a;

    /* renamed from: b */
    public final String f19039b;

    /* renamed from: c */
    public final Boolean f19040c;

    /* renamed from: d */
    public final Boolean f19041d;

    /* renamed from: o.d2g$a */
    public static final class C12787a {

        /* renamed from: a */
        public String f19042a;

        /* renamed from: b */
        public String f19043b;

        /* renamed from: c */
        public Boolean f19044c;

        /* renamed from: d */
        public Boolean f19045d;

        public C12787a() {
            Boolean bool = Boolean.FALSE;
            this.f19044c = bool;
            this.f19045d = bool;
        }

        /* renamed from: a */
        public final d2g m22281a() {
            return new d2g(this, null);
        }

        /* renamed from: b */
        public final String m22282b() {
            return this.f19042a;
        }

        /* renamed from: c */
        public final String m22283c() {
            return this.f19043b;
        }

        /* renamed from: d */
        public final Boolean m22284d() {
            return this.f19044c;
        }

        /* renamed from: e */
        public final Boolean m22285e() {
            return this.f19045d;
        }

        /* renamed from: f */
        public final void m22286f(String str) {
            this.f19042a = str;
        }

        /* renamed from: g */
        public final void m22287g(String str) {
            this.f19043b = str;
        }

        /* renamed from: h */
        public final void m22288h(Boolean bool) {
            this.f19044c = bool;
        }

        /* renamed from: i */
        public final void m22289i(Boolean bool) {
            this.f19045d = bool;
        }
    }

    /* renamed from: o.d2g$b */
    public static final class C12788b {
        public C12788b() {
        }

        public /* synthetic */ C12788b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ d2g(C12787a c12787a, id5 id5Var) {
        this(c12787a);
    }

    /* renamed from: a */
    public final String m22277a() {
        return this.f19038a;
    }

    /* renamed from: b */
    public final String m22278b() {
        return this.f19039b;
    }

    /* renamed from: c */
    public final Boolean m22279c() {
        return this.f19040c;
    }

    /* renamed from: d */
    public final Boolean m22280d() {
        return this.f19041d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2g)) {
            return false;
        }
        d2g d2gVar = (d2g) obj;
        return sq8.m48644c(this.f19038a, d2gVar.f19038a) && sq8.m48644c(this.f19039b, d2gVar.f19039b) && sq8.m48644c(this.f19040c, d2gVar.f19040c) && sq8.m48644c(this.f19041d, d2gVar.f19041d);
    }

    public int hashCode() {
        String str = this.f19038a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19039b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f19040c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f19041d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SsoOidcEndpointParameters(");
        sb.append("endpoint=" + this.f19038a + ',');
        sb.append("region=" + this.f19039b + ',');
        sb.append("useDualStack=" + this.f19040c + ',');
        sb.append("useFips=" + this.f19041d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public d2g(C12787a c12787a) {
        this.f19038a = c12787a.m22282b();
        this.f19039b = c12787a.m22283c();
        Boolean boolM22284d = c12787a.m22284d();
        if (boolM22284d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f19040c = boolM22284d;
        Boolean boolM22285e = c12787a.m22285e();
        if (boolM22285e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f19041d = boolM22285e;
    }
}
