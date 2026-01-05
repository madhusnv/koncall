package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class y58 extends qjh {

    /* renamed from: h */
    public static final C18337b f54934h = new C18337b(null);

    /* renamed from: d */
    public final String f54935d;

    /* renamed from: e */
    public final String f54936e;

    /* renamed from: f */
    public final String f54937f;

    /* renamed from: g */
    public final String f54938g;

    /* renamed from: o.y58$a */
    public static final class C18336a {

        /* renamed from: a */
        public String f54939a;

        /* renamed from: b */
        public String f54940b;

        /* renamed from: c */
        public String f54941c;

        /* renamed from: d */
        public String f54942d;

        /* renamed from: e */
        public String f54943e;

        /* renamed from: a */
        public final y58 m57229a() {
            return new y58(this, null);
        }

        /* renamed from: b */
        public final C18336a m57230b() {
            return this;
        }

        /* renamed from: c */
        public final String m57231c() {
            return this.f54939a;
        }

        /* renamed from: d */
        public final String m57232d() {
            return this.f54940b;
        }

        /* renamed from: e */
        public final String m57233e() {
            return this.f54941c;
        }

        /* renamed from: f */
        public final String m57234f() {
            return this.f54942d;
        }

        /* renamed from: g */
        public final String m57235g() {
            return this.f54943e;
        }

        /* renamed from: h */
        public final void m57236h(String str) {
            this.f54939a = str;
        }

        /* renamed from: i */
        public final void m57237i(String str) {
            this.f54940b = str;
        }

        /* renamed from: j */
        public final void m57238j(String str) {
            this.f54941c = str;
        }

        /* renamed from: k */
        public final void m57239k(String str) {
            this.f54942d = str;
        }

        /* renamed from: l */
        public final void m57240l(String str) {
            this.f54943e = str;
        }
    }

    /* renamed from: o.y58$b */
    public static final class C18337b {
        public C18337b() {
        }

        public /* synthetic */ C18337b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ y58(C18336a c18336a, id5 id5Var) {
        this(c18336a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y58.class != obj.getClass()) {
            return false;
        }
        y58 y58Var = (y58) obj;
        return sq8.m48644c(this.f54935d, y58Var.f54935d) && sq8.m48644c(getMessage(), y58Var.getMessage()) && sq8.m48644c(this.f54936e, y58Var.f54936e) && sq8.m48644c(this.f54937f, y58Var.f54937f) && sq8.m48644c(this.f54938g, y58Var.f54938g);
    }

    public int hashCode() {
        String str = this.f54935d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        int iHashCode2 = (iHashCode + (message != null ? message.hashCode() : 0)) * 31;
        String str2 = this.f54936e;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f54937f;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f54938g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumanLoopQuotaExceededException(");
        sb.append("code=" + this.f54935d + ',');
        sb.append("message=" + getMessage() + ',');
        sb.append("quotaCode=" + this.f54936e + ',');
        sb.append("resourceType=" + this.f54937f + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("serviceCode=");
        sb2.append(this.f54938g);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public y58(C18336a c18336a) {
        super(c18336a.m57232d());
        this.f54935d = c18336a.m57231c();
        this.f54936e = c18336a.m57233e();
        this.f54937f = c18336a.m57234f();
        this.f54938g = c18336a.m57235g();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
