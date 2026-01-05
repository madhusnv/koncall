package p001o;

/* loaded from: classes2.dex */
public final class ta4 {

    /* renamed from: f */
    public static final C17041b f46700f = new C17041b(null);

    /* renamed from: a */
    public final String f46701a;

    /* renamed from: b */
    public final int f46702b;

    /* renamed from: c */
    public final String f46703c;

    /* renamed from: d */
    public final String f46704d;

    /* renamed from: e */
    public final String f46705e;

    /* renamed from: o.ta4$a */
    public static final class C17040a {

        /* renamed from: a */
        public String f46706a;

        /* renamed from: b */
        public int f46707b;

        /* renamed from: c */
        public String f46708c;

        /* renamed from: d */
        public String f46709d;

        /* renamed from: e */
        public String f46710e;

        /* renamed from: a */
        public final ta4 m49614a() {
            return new ta4(this, null);
        }

        /* renamed from: b */
        public final C17040a m49615b() {
            return this;
        }

        /* renamed from: c */
        public final String m49616c() {
            return this.f46706a;
        }

        /* renamed from: d */
        public final int m49617d() {
            return this.f46707b;
        }

        /* renamed from: e */
        public final String m49618e() {
            return this.f46708c;
        }

        /* renamed from: f */
        public final String m49619f() {
            return this.f46709d;
        }

        /* renamed from: g */
        public final String m49620g() {
            return this.f46710e;
        }

        /* renamed from: h */
        public final void m49621h(String str) {
            this.f46706a = str;
        }

        /* renamed from: i */
        public final void m49622i(int i) {
            this.f46707b = i;
        }

        /* renamed from: j */
        public final void m49623j(String str) {
            this.f46708c = str;
        }

        /* renamed from: k */
        public final void m49624k(String str) {
            this.f46709d = str;
        }

        /* renamed from: l */
        public final void m49625l(String str) {
            this.f46710e = str;
        }
    }

    /* renamed from: o.ta4$b */
    public static final class C17041b {
        public C17041b() {
        }

        public /* synthetic */ C17041b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ta4(C17040a c17040a, id5 id5Var) {
        this(c17040a);
    }

    /* renamed from: a */
    public final String m49611a() {
        return this.f46701a;
    }

    /* renamed from: b */
    public final int m49612b() {
        return this.f46702b;
    }

    /* renamed from: c */
    public final String m49613c() {
        return this.f46704d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta4.class != obj.getClass()) {
            return false;
        }
        ta4 ta4Var = (ta4) obj;
        return sq8.m48644c(this.f46701a, ta4Var.f46701a) && this.f46702b == ta4Var.f46702b && sq8.m48644c(this.f46703c, ta4Var.f46703c) && sq8.m48644c(this.f46704d, ta4Var.f46704d) && sq8.m48644c(this.f46705e, ta4Var.f46705e);
    }

    public int hashCode() {
        String str = this.f46701a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f46702b) * 31;
        String str2 = this.f46703c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46704d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f46705e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateTokenResponse(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("expiresIn=" + this.f46702b + ',');
        sb.append("idToken=*** Sensitive Data Redacted ***,");
        sb.append("refreshToken=*** Sensitive Data Redacted ***,");
        sb.append("tokenType=" + this.f46705e);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ta4(C17040a c17040a) {
        this.f46701a = c17040a.m49616c();
        this.f46702b = c17040a.m49617d();
        this.f46703c = c17040a.m49618e();
        this.f46704d = c17040a.m49619f();
        this.f46705e = c17040a.m49620g();
    }
}
