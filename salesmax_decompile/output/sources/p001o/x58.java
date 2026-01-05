package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class x58 extends ohe {

    /* renamed from: q */
    public static final C18057b f53224q = new C18057b(null);

    /* renamed from: d */
    public final String f53225d;

    /* renamed from: e */
    public final String f53226e;

    /* renamed from: f */
    public final String f53227f;

    /* renamed from: g */
    public final String f53228g;

    /* renamed from: h */
    public final String f53229h;

    /* renamed from: o.x58$a */
    public static final class C18056a {

        /* renamed from: a */
        public String f53230a;

        /* renamed from: b */
        public String f53231b;

        /* renamed from: c */
        public String f53232c;

        /* renamed from: d */
        public String f53233d;

        /* renamed from: e */
        public String f53234e;

        /* renamed from: f */
        public String f53235f;

        /* renamed from: a */
        public final x58 m55645a() {
            return new x58(this, null);
        }

        /* renamed from: b */
        public final C18056a m55646b() {
            return this;
        }

        /* renamed from: c */
        public final String m55647c() {
            return this.f53230a;
        }

        /* renamed from: d */
        public final String m55648d() {
            return this.f53231b;
        }

        /* renamed from: e */
        public final String m55649e() {
            return this.f53232c;
        }

        /* renamed from: f */
        public final String m55650f() {
            return this.f53233d;
        }

        /* renamed from: g */
        public final String m55651g() {
            return this.f53234e;
        }

        /* renamed from: h */
        public final String m55652h() {
            return this.f53235f;
        }

        /* renamed from: i */
        public final void m55653i(String str) {
            this.f53230a = str;
        }

        /* renamed from: j */
        public final void m55654j(String str) {
            this.f53231b = str;
        }

        /* renamed from: k */
        public final void m55655k(String str) {
            this.f53232c = str;
        }

        /* renamed from: l */
        public final void m55656l(String str) {
            this.f53233d = str;
        }

        /* renamed from: m */
        public final void m55657m(String str) {
            this.f53234e = str;
        }

        /* renamed from: n */
        public final void m55658n(String str) {
            this.f53235f = str;
        }
    }

    /* renamed from: o.x58$b */
    public static final class C18057b {
        public C18057b() {
        }

        public /* synthetic */ C18057b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ x58(C18056a c18056a, id5 id5Var) {
        this(c18056a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x58.class != obj.getClass()) {
            return false;
        }
        x58 x58Var = (x58) obj;
        return sq8.m48644c(this.f53225d, x58Var.f53225d) && sq8.m48644c(this.f53226e, x58Var.f53226e) && sq8.m48644c(getMessage(), x58Var.getMessage()) && sq8.m48644c(this.f53227f, x58Var.f53227f) && sq8.m48644c(this.f53228g, x58Var.f53228g) && sq8.m48644c(this.f53229h, x58Var.f53229h);
    }

    public int hashCode() {
        String str = this.f53225d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f53226e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        int iHashCode3 = (iHashCode2 + (message != null ? message.hashCode() : 0)) * 31;
        String str3 = this.f53227f;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f53228g;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f53229h;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumanLoopQuotaExceededException(");
        sb.append("code=" + this.f53225d + ',');
        sb.append("logref=" + this.f53226e + ',');
        sb.append("message=" + getMessage() + ',');
        sb.append("quotaCode=" + this.f53227f + ',');
        sb.append("resourceType=" + this.f53228g + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("serviceCode=");
        sb2.append(this.f53229h);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public x58(C18056a c18056a) {
        super(c18056a.m55649e());
        this.f53225d = c18056a.m55647c();
        this.f53226e = c18056a.m55648d();
        this.f53227f = c18056a.m55650f();
        this.f53228g = c18056a.m55651g();
        this.f53229h = c18056a.m55652h();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
