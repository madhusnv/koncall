package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class ka extends f2g {

    /* renamed from: f */
    public static final C14754b f31720f = new C14754b(null);

    /* renamed from: d */
    public final String f31721d;

    /* renamed from: e */
    public final String f31722e;

    /* renamed from: o.ka$a */
    public static final class C14753a {

        /* renamed from: a */
        public String f31723a;

        /* renamed from: b */
        public String f31724b;

        /* renamed from: a */
        public final ka m35210a() {
            return new ka(this, null);
        }

        /* renamed from: b */
        public final C14753a m35211b() {
            return this;
        }

        /* renamed from: c */
        public final String m35212c() {
            return this.f31723a;
        }

        /* renamed from: d */
        public final String m35213d() {
            return this.f31724b;
        }

        /* renamed from: e */
        public final void m35214e(String str) {
            this.f31723a = str;
        }

        /* renamed from: f */
        public final void m35215f(String str) {
            this.f31724b = str;
        }
    }

    /* renamed from: o.ka$b */
    public static final class C14754b {
        public C14754b() {
        }

        public /* synthetic */ C14754b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ka(C14753a c14753a, id5 id5Var) {
        this(c14753a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ka.class != obj.getClass()) {
            return false;
        }
        ka kaVar = (ka) obj;
        return sq8.m48644c(this.f31721d, kaVar.f31721d) && sq8.m48644c(this.f31722e, kaVar.f31722e);
    }

    public int hashCode() {
        String str = this.f31721d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31722e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessDeniedException(");
        sb.append("error=" + this.f31721d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f31722e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ka(C14753a c14753a) {
        this.f31721d = c14753a.m35212c();
        this.f31722e = c14753a.m35213d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
