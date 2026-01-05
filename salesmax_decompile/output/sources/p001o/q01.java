package p001o;

/* loaded from: classes3.dex */
public final class q01 {

    /* renamed from: g */
    public static final C16264b f41015g = new C16264b(null);

    /* renamed from: a */
    public final String f41016a;

    /* renamed from: b */
    public final int f41017b;

    /* renamed from: c */
    public final String f41018c;

    /* renamed from: d */
    public final jub f41019d;

    /* renamed from: e */
    public final String f41020e;

    /* renamed from: f */
    public final String f41021f;

    /* renamed from: o.q01$a */
    public static final class C16263a {

        /* renamed from: a */
        public String f41022a;

        /* renamed from: b */
        public int f41023b;

        /* renamed from: c */
        public String f41024c;

        /* renamed from: d */
        public jub f41025d;

        /* renamed from: e */
        public String f41026e;

        /* renamed from: f */
        public String f41027f;

        /* renamed from: a */
        public final q01 m44578a() {
            return new q01(this, null);
        }

        /* renamed from: b */
        public final C16263a m44579b() {
            return this;
        }

        /* renamed from: c */
        public final String m44580c() {
            return this.f41022a;
        }

        /* renamed from: d */
        public final int m44581d() {
            return this.f41023b;
        }

        /* renamed from: e */
        public final String m44582e() {
            return this.f41024c;
        }

        /* renamed from: f */
        public final jub m44583f() {
            return this.f41025d;
        }

        /* renamed from: g */
        public final String m44584g() {
            return this.f41026e;
        }

        /* renamed from: h */
        public final String m44585h() {
            return this.f41027f;
        }

        /* renamed from: i */
        public final void m44586i(String str) {
            this.f41022a = str;
        }

        /* renamed from: j */
        public final void m44587j(int i) {
            this.f41023b = i;
        }

        /* renamed from: k */
        public final void m44588k(String str) {
            this.f41024c = str;
        }

        /* renamed from: l */
        public final void m44589l(jub jubVar) {
            this.f41025d = jubVar;
        }

        /* renamed from: m */
        public final void m44590m(String str) {
            this.f41026e = str;
        }

        /* renamed from: n */
        public final void m44591n(String str) {
            this.f41027f = str;
        }
    }

    /* renamed from: o.q01$b */
    public static final class C16264b {
        public C16264b() {
        }

        public /* synthetic */ C16264b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ q01(C16263a c16263a, id5 id5Var) {
        this(c16263a);
    }

    /* renamed from: a */
    public final String m44573a() {
        return this.f41016a;
    }

    /* renamed from: b */
    public final int m44574b() {
        return this.f41017b;
    }

    /* renamed from: c */
    public final String m44575c() {
        return this.f41018c;
    }

    /* renamed from: d */
    public final jub m44576d() {
        return this.f41019d;
    }

    /* renamed from: e */
    public final String m44577e() {
        return this.f41020e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q01.class != obj.getClass()) {
            return false;
        }
        q01 q01Var = (q01) obj;
        return sq8.m48644c(this.f41016a, q01Var.f41016a) && this.f41017b == q01Var.f41017b && sq8.m48644c(this.f41018c, q01Var.f41018c) && sq8.m48644c(this.f41019d, q01Var.f41019d) && sq8.m48644c(this.f41020e, q01Var.f41020e) && sq8.m48644c(this.f41021f, q01Var.f41021f);
    }

    public int hashCode() {
        String str = this.f41016a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f41017b) * 31;
        String str2 = this.f41018c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        jub jubVar = this.f41019d;
        int iHashCode3 = (iHashCode2 + (jubVar != null ? jubVar.hashCode() : 0)) * 31;
        String str3 = this.f41020e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f41021f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AuthenticationResultType(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("expiresIn=" + this.f41017b + ',');
        sb.append("idToken=*** Sensitive Data Redacted ***,");
        sb.append("newDeviceMetadata=" + this.f41019d + ',');
        sb.append("refreshToken=*** Sensitive Data Redacted ***,");
        sb.append("tokenType=" + this.f41021f);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public q01(C16263a c16263a) {
        this.f41016a = c16263a.m44580c();
        this.f41017b = c16263a.m44581d();
        this.f41018c = c16263a.m44582e();
        this.f41019d = c16263a.m44583f();
        this.f41020e = c16263a.m44584g();
        this.f41021f = c16263a.m44585h();
    }
}
