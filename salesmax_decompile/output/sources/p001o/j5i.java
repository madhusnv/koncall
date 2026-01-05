package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class j5i extends f2g {

    /* renamed from: f */
    public static final C14455b f29835f = new C14455b(null);

    /* renamed from: d */
    public final String f29836d;

    /* renamed from: e */
    public final String f29837e;

    /* renamed from: o.j5i$a */
    public static final class C14454a {

        /* renamed from: a */
        public String f29838a;

        /* renamed from: b */
        public String f29839b;

        /* renamed from: a */
        public final j5i m33280a() {
            return new j5i(this, null);
        }

        /* renamed from: b */
        public final C14454a m33281b() {
            return this;
        }

        /* renamed from: c */
        public final String m33282c() {
            return this.f29838a;
        }

        /* renamed from: d */
        public final String m33283d() {
            return this.f29839b;
        }

        /* renamed from: e */
        public final void m33284e(String str) {
            this.f29838a = str;
        }

        /* renamed from: f */
        public final void m33285f(String str) {
            this.f29839b = str;
        }
    }

    /* renamed from: o.j5i$b */
    public static final class C14455b {
        public C14455b() {
        }

        public /* synthetic */ C14455b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ j5i(C14454a c14454a, id5 id5Var) {
        this(c14454a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j5i.class != obj.getClass()) {
            return false;
        }
        j5i j5iVar = (j5i) obj;
        return sq8.m48644c(this.f29836d, j5iVar.f29836d) && sq8.m48644c(this.f29837e, j5iVar.f29837e);
    }

    public int hashCode() {
        String str = this.f29836d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f29837e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnsupportedGrantTypeException(");
        sb.append("error=" + this.f29836d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f29837e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public j5i(C14454a c14454a) {
        this.f29836d = c14454a.m33282c();
        this.f29837e = c14454a.m33283d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
