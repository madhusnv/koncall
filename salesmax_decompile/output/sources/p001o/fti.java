package p001o;

/* loaded from: classes3.dex */
public final class fti {

    /* renamed from: e */
    public static final C13555b f24066e = new C13555b(null);

    /* renamed from: a */
    public final String f24067a;

    /* renamed from: b */
    public final String f24068b;

    /* renamed from: c */
    public final String f24069c;

    /* renamed from: d */
    public final String f24070d;

    /* renamed from: o.fti$a */
    public static final class C13554a {

        /* renamed from: a */
        public String f24071a;

        /* renamed from: b */
        public String f24072b;

        /* renamed from: c */
        public String f24073c;

        /* renamed from: d */
        public String f24074d;

        /* renamed from: a */
        public final fti m27477a() {
            return new fti(this, null);
        }

        /* renamed from: b */
        public final String m27478b() {
            return this.f24071a;
        }

        /* renamed from: c */
        public final String m27479c() {
            return this.f24072b;
        }

        /* renamed from: d */
        public final String m27480d() {
            return this.f24073c;
        }

        /* renamed from: e */
        public final String m27481e() {
            return this.f24074d;
        }

        /* renamed from: f */
        public final void m27482f(String str) {
            this.f24071a = str;
        }

        /* renamed from: g */
        public final void m27483g(String str) {
            this.f24072b = str;
        }

        /* renamed from: h */
        public final void m27484h(String str) {
            this.f24073c = str;
        }

        /* renamed from: i */
        public final void m27485i(String str) {
            this.f24074d = str;
        }
    }

    /* renamed from: o.fti$b */
    public static final class C13555b {
        public C13555b() {
        }

        public /* synthetic */ C13555b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fti(C13554a c13554a, id5 id5Var) {
        this(c13554a);
    }

    /* renamed from: a */
    public final String m27473a() {
        return this.f24067a;
    }

    /* renamed from: b */
    public final String m27474b() {
        return this.f24068b;
    }

    /* renamed from: c */
    public final String m27475c() {
        return this.f24069c;
    }

    /* renamed from: d */
    public final String m27476d() {
        return this.f24070d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fti.class != obj.getClass()) {
            return false;
        }
        fti ftiVar = (fti) obj;
        return sq8.m48644c(this.f24067a, ftiVar.f24067a) && sq8.m48644c(this.f24068b, ftiVar.f24068b) && sq8.m48644c(this.f24069c, ftiVar.f24069c) && sq8.m48644c(this.f24070d, ftiVar.f24070d);
    }

    public int hashCode() {
        String str = this.f24067a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24068b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24069c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f24070d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifySoftwareTokenRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("friendlyDeviceName=" + this.f24068b + ',');
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("userCode=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fti(C13554a c13554a) {
        this.f24067a = c13554a.m27478b();
        this.f24068b = c13554a.m27479c();
        this.f24069c = c13554a.m27480d();
        this.f24070d = c13554a.m27481e();
    }
}
