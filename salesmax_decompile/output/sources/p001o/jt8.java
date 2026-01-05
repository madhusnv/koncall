package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class jt8 extends f2g {

    /* renamed from: f */
    public static final C14653b f31063f = new C14653b(null);

    /* renamed from: d */
    public final String f31064d;

    /* renamed from: e */
    public final String f31065e;

    /* renamed from: o.jt8$a */
    public static final class C14652a {

        /* renamed from: a */
        public String f31066a;

        /* renamed from: b */
        public String f31067b;

        /* renamed from: a */
        public final jt8 m34486a() {
            return new jt8(this, null);
        }

        /* renamed from: b */
        public final C14652a m34487b() {
            return this;
        }

        /* renamed from: c */
        public final String m34488c() {
            return this.f31066a;
        }

        /* renamed from: d */
        public final String m34489d() {
            return this.f31067b;
        }

        /* renamed from: e */
        public final void m34490e(String str) {
            this.f31066a = str;
        }

        /* renamed from: f */
        public final void m34491f(String str) {
            this.f31067b = str;
        }
    }

    /* renamed from: o.jt8$b */
    public static final class C14653b {
        public C14653b() {
        }

        public /* synthetic */ C14653b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jt8(C14652a c14652a, id5 id5Var) {
        this(c14652a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jt8.class != obj.getClass()) {
            return false;
        }
        jt8 jt8Var = (jt8) obj;
        return sq8.m48644c(this.f31064d, jt8Var.f31064d) && sq8.m48644c(this.f31065e, jt8Var.f31065e);
    }

    public int hashCode() {
        String str = this.f31064d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31065e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidRequestException(");
        sb.append("error=" + this.f31064d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f31065e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jt8(C14652a c14652a) {
        this.f31064d = c14652a.m34488c();
        this.f31065e = c14652a.m34489d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
