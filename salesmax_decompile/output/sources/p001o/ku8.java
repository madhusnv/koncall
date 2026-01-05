package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class ku8 extends f2g {

    /* renamed from: f */
    public static final C14928b f32721f = new C14928b(null);

    /* renamed from: d */
    public final String f32722d;

    /* renamed from: e */
    public final String f32723e;

    /* renamed from: o.ku8$a */
    public static final class C14927a {

        /* renamed from: a */
        public String f32724a;

        /* renamed from: b */
        public String f32725b;

        /* renamed from: a */
        public final ku8 m36239a() {
            return new ku8(this, null);
        }

        /* renamed from: b */
        public final C14927a m36240b() {
            return this;
        }

        /* renamed from: c */
        public final String m36241c() {
            return this.f32724a;
        }

        /* renamed from: d */
        public final String m36242d() {
            return this.f32725b;
        }

        /* renamed from: e */
        public final void m36243e(String str) {
            this.f32724a = str;
        }

        /* renamed from: f */
        public final void m36244f(String str) {
            this.f32725b = str;
        }
    }

    /* renamed from: o.ku8$b */
    public static final class C14928b {
        public C14928b() {
        }

        public /* synthetic */ C14928b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ku8(C14927a c14927a, id5 id5Var) {
        this(c14927a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ku8.class != obj.getClass()) {
            return false;
        }
        ku8 ku8Var = (ku8) obj;
        return sq8.m48644c(this.f32722d, ku8Var.f32722d) && sq8.m48644c(this.f32723e, ku8Var.f32723e);
    }

    public int hashCode() {
        String str = this.f32722d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32723e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidScopeException(");
        sb.append("error=" + this.f32722d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f32723e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ku8(C14927a c14927a) {
        this.f32722d = c14927a.m36241c();
        this.f32723e = c14927a.m36242d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
