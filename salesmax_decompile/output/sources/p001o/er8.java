package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class er8 extends f2g {

    /* renamed from: f */
    public static final C13252b f22080f = new C13252b(null);

    /* renamed from: d */
    public final String f22081d;

    /* renamed from: e */
    public final String f22082e;

    /* renamed from: o.er8$a */
    public static final class C13251a {

        /* renamed from: a */
        public String f22083a;

        /* renamed from: b */
        public String f22084b;

        /* renamed from: a */
        public final er8 m25514a() {
            return new er8(this, null);
        }

        /* renamed from: b */
        public final C13251a m25515b() {
            return this;
        }

        /* renamed from: c */
        public final String m25516c() {
            return this.f22083a;
        }

        /* renamed from: d */
        public final String m25517d() {
            return this.f22084b;
        }

        /* renamed from: e */
        public final void m25518e(String str) {
            this.f22083a = str;
        }

        /* renamed from: f */
        public final void m25519f(String str) {
            this.f22084b = str;
        }
    }

    /* renamed from: o.er8$b */
    public static final class C13252b {
        public C13252b() {
        }

        public /* synthetic */ C13252b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ er8(C13251a c13251a, id5 id5Var) {
        this(c13251a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er8.class != obj.getClass()) {
            return false;
        }
        er8 er8Var = (er8) obj;
        return sq8.m48644c(this.f22081d, er8Var.f22081d) && sq8.m48644c(this.f22082e, er8Var.f22082e);
    }

    public int hashCode() {
        String str = this.f22081d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22082e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidClientException(");
        sb.append("error=" + this.f22081d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f22082e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public er8(C13251a c13251a) {
        this.f22081d = c13251a.m25516c();
        this.f22082e = c13251a.m25517d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
