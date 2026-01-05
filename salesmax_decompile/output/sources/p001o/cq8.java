package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class cq8 extends f2g {

    /* renamed from: f */
    public static final C12725b f18502f = new C12725b(null);

    /* renamed from: d */
    public final String f18503d;

    /* renamed from: e */
    public final String f18504e;

    /* renamed from: o.cq8$a */
    public static final class C12724a {

        /* renamed from: a */
        public String f18505a;

        /* renamed from: b */
        public String f18506b;

        /* renamed from: a */
        public final cq8 m21585a() {
            return new cq8(this, null);
        }

        /* renamed from: b */
        public final C12724a m21586b() {
            return this;
        }

        /* renamed from: c */
        public final String m21587c() {
            return this.f18505a;
        }

        /* renamed from: d */
        public final String m21588d() {
            return this.f18506b;
        }

        /* renamed from: e */
        public final void m21589e(String str) {
            this.f18505a = str;
        }

        /* renamed from: f */
        public final void m21590f(String str) {
            this.f18506b = str;
        }
    }

    /* renamed from: o.cq8$b */
    public static final class C12725b {
        public C12725b() {
        }

        public /* synthetic */ C12725b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cq8(C12724a c12724a, id5 id5Var) {
        this(c12724a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cq8.class != obj.getClass()) {
            return false;
        }
        cq8 cq8Var = (cq8) obj;
        return sq8.m48644c(this.f18503d, cq8Var.f18503d) && sq8.m48644c(this.f18504e, cq8Var.f18504e);
    }

    public int hashCode() {
        String str = this.f18503d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f18504e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InternalServerException(");
        sb.append("error=" + this.f18503d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f18504e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cq8(C12724a c12724a) {
        this.f18503d = c12724a.m21587c();
        this.f18504e = c12724a.m21588d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
