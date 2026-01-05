package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class kr8 extends f2g {

    /* renamed from: f */
    public static final C14908b f32596f = new C14908b(null);

    /* renamed from: d */
    public final String f32597d;

    /* renamed from: e */
    public final String f32598e;

    /* renamed from: o.kr8$a */
    public static final class C14907a {

        /* renamed from: a */
        public String f32599a;

        /* renamed from: b */
        public String f32600b;

        /* renamed from: a */
        public final kr8 m36122a() {
            return new kr8(this, null);
        }

        /* renamed from: b */
        public final C14907a m36123b() {
            return this;
        }

        /* renamed from: c */
        public final String m36124c() {
            return this.f32599a;
        }

        /* renamed from: d */
        public final String m36125d() {
            return this.f32600b;
        }

        /* renamed from: e */
        public final void m36126e(String str) {
            this.f32599a = str;
        }

        /* renamed from: f */
        public final void m36127f(String str) {
            this.f32600b = str;
        }
    }

    /* renamed from: o.kr8$b */
    public static final class C14908b {
        public C14908b() {
        }

        public /* synthetic */ C14908b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kr8(C14907a c14907a, id5 id5Var) {
        this(c14907a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kr8.class != obj.getClass()) {
            return false;
        }
        kr8 kr8Var = (kr8) obj;
        return sq8.m48644c(this.f32597d, kr8Var.f32597d) && sq8.m48644c(this.f32598e, kr8Var.f32598e);
    }

    public int hashCode() {
        String str = this.f32597d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32598e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidGrantException(");
        sb.append("error=" + this.f32597d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f32598e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public kr8(C14907a c14907a) {
        this.f32597d = c14907a.m36124c();
        this.f32598e = c14907a.m36125d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
