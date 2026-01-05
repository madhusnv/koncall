package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class u01 extends f2g {

    /* renamed from: f */
    public static final C17276b f48130f = new C17276b(null);

    /* renamed from: d */
    public final String f48131d;

    /* renamed from: e */
    public final String f48132e;

    /* renamed from: o.u01$a */
    public static final class C17275a {

        /* renamed from: a */
        public String f48133a;

        /* renamed from: b */
        public String f48134b;

        /* renamed from: a */
        public final u01 m50820a() {
            return new u01(this, null);
        }

        /* renamed from: b */
        public final C17275a m50821b() {
            return this;
        }

        /* renamed from: c */
        public final String m50822c() {
            return this.f48133a;
        }

        /* renamed from: d */
        public final String m50823d() {
            return this.f48134b;
        }

        /* renamed from: e */
        public final void m50824e(String str) {
            this.f48133a = str;
        }

        /* renamed from: f */
        public final void m50825f(String str) {
            this.f48134b = str;
        }
    }

    /* renamed from: o.u01$b */
    public static final class C17276b {
        public C17276b() {
        }

        public /* synthetic */ C17276b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ u01(C17275a c17275a, id5 id5Var) {
        this(c17275a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u01.class != obj.getClass()) {
            return false;
        }
        u01 u01Var = (u01) obj;
        return sq8.m48644c(this.f48131d, u01Var.f48131d) && sq8.m48644c(this.f48132e, u01Var.f48132e);
    }

    public int hashCode() {
        String str = this.f48131d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f48132e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AuthorizationPendingException(");
        sb.append("error=" + this.f48131d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f48132e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public u01(C17275a c17275a) {
        this.f48131d = c17275a.m50822c();
        this.f48132e = c17275a.m50823d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
