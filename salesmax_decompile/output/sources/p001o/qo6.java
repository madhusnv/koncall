package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class qo6 extends f2g {

    /* renamed from: f */
    public static final C16433b f42235f = new C16433b(null);

    /* renamed from: d */
    public final String f42236d;

    /* renamed from: e */
    public final String f42237e;

    /* renamed from: o.qo6$a */
    public static final class C16432a {

        /* renamed from: a */
        public String f42238a;

        /* renamed from: b */
        public String f42239b;

        /* renamed from: a */
        public final qo6 m45720a() {
            return new qo6(this, null);
        }

        /* renamed from: b */
        public final C16432a m45721b() {
            return this;
        }

        /* renamed from: c */
        public final String m45722c() {
            return this.f42238a;
        }

        /* renamed from: d */
        public final String m45723d() {
            return this.f42239b;
        }

        /* renamed from: e */
        public final void m45724e(String str) {
            this.f42238a = str;
        }

        /* renamed from: f */
        public final void m45725f(String str) {
            this.f42239b = str;
        }
    }

    /* renamed from: o.qo6$b */
    public static final class C16433b {
        public C16433b() {
        }

        public /* synthetic */ C16433b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qo6(C16432a c16432a, id5 id5Var) {
        this(c16432a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qo6.class != obj.getClass()) {
            return false;
        }
        qo6 qo6Var = (qo6) obj;
        return sq8.m48644c(this.f42236d, qo6Var.f42236d) && sq8.m48644c(this.f42237e, qo6Var.f42237e);
    }

    public int hashCode() {
        String str = this.f42236d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f42237e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExpiredTokenException(");
        sb.append("error=" + this.f42236d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f42237e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qo6(C16432a c16432a) {
        this.f42236d = c16432a.m45722c();
        this.f42237e = c16432a.m45723d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
