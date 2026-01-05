package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class hwf extends f2g {

    /* renamed from: f */
    public static final C14110b f27705f = new C14110b(null);

    /* renamed from: d */
    public final String f27706d;

    /* renamed from: e */
    public final String f27707e;

    /* renamed from: o.hwf$a */
    public static final class C14109a {

        /* renamed from: a */
        public String f27708a;

        /* renamed from: b */
        public String f27709b;

        /* renamed from: a */
        public final hwf m31231a() {
            return new hwf(this, null);
        }

        /* renamed from: b */
        public final C14109a m31232b() {
            return this;
        }

        /* renamed from: c */
        public final String m31233c() {
            return this.f27708a;
        }

        /* renamed from: d */
        public final String m31234d() {
            return this.f27709b;
        }

        /* renamed from: e */
        public final void m31235e(String str) {
            this.f27708a = str;
        }

        /* renamed from: f */
        public final void m31236f(String str) {
            this.f27709b = str;
        }
    }

    /* renamed from: o.hwf$b */
    public static final class C14110b {
        public C14110b() {
        }

        public /* synthetic */ C14110b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hwf(C14109a c14109a, id5 id5Var) {
        this(c14109a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hwf.class != obj.getClass()) {
            return false;
        }
        hwf hwfVar = (hwf) obj;
        return sq8.m48644c(this.f27706d, hwfVar.f27706d) && sq8.m48644c(this.f27707e, hwfVar.f27707e);
    }

    public int hashCode() {
        String str = this.f27706d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27707e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SlowDownException(");
        sb.append("error=" + this.f27706d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f27707e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hwf(C14109a c14109a) {
        this.f27706d = c14109a.m31233c();
        this.f27707e = c14109a.m31234d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
