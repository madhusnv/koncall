package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class js8 extends jxe {

    /* renamed from: g */
    public static final C14649b f31040g = new C14649b(null);

    /* renamed from: e */
    public final rn8 f31041e;

    /* renamed from: f */
    public final h6g f31042f;

    /* renamed from: o.js8$a */
    public static final class C14648a {

        /* renamed from: a */
        public rn8 f31043a;

        /* renamed from: b */
        public h6g f31044b;

        /* renamed from: a */
        public final js8 m34470a() {
            return new js8(this, null);
        }

        /* renamed from: b */
        public final C14648a m34471b() {
            return this;
        }

        /* renamed from: c */
        public final rn8 m34472c() {
            return this.f31043a;
        }

        /* renamed from: d */
        public final h6g m34473d() {
            return this.f31044b;
        }

        /* renamed from: e */
        public final void m34474e(rn8 rn8Var) {
            this.f31043a = rn8Var;
        }

        /* renamed from: f */
        public final void m34475f(h6g h6gVar) {
            this.f31044b = h6gVar;
        }
    }

    /* renamed from: o.js8$b */
    public static final class C14649b {
        public C14649b() {
        }

        public /* synthetic */ C14649b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ js8(C14648a c14648a, id5 id5Var) {
        this(c14648a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || js8.class != obj.getClass()) {
            return false;
        }
        js8 js8Var = (js8) obj;
        return sq8.m48644c(this.f31041e, js8Var.f31041e) && sq8.m48644c(this.f31042f, js8Var.f31042f);
    }

    public int hashCode() {
        rn8 rn8Var = this.f31041e;
        int iHashCode = (rn8Var != null ? rn8Var.hashCode() : 0) * 31;
        h6g h6gVar = this.f31042f;
        return iHashCode + (h6gVar != null ? h6gVar.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidObjectState(");
        sb.append("accessTier=" + this.f31041e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("storageClass=");
        sb2.append(this.f31042f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public js8(C14648a c14648a) {
        this.f31041e = c14648a.m34472c();
        this.f31042f = c14648a.m34473d();
        mo30426c().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
