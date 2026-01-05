package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class t2i extends f2g {

    /* renamed from: f */
    public static final C16981b f46271f = new C16981b(null);

    /* renamed from: d */
    public final String f46272d;

    /* renamed from: e */
    public final String f46273e;

    /* renamed from: o.t2i$a */
    public static final class C16980a {

        /* renamed from: a */
        public String f46274a;

        /* renamed from: b */
        public String f46275b;

        /* renamed from: a */
        public final t2i m49211a() {
            return new t2i(this, null);
        }

        /* renamed from: b */
        public final C16980a m49212b() {
            return this;
        }

        /* renamed from: c */
        public final String m49213c() {
            return this.f46274a;
        }

        /* renamed from: d */
        public final String m49214d() {
            return this.f46275b;
        }

        /* renamed from: e */
        public final void m49215e(String str) {
            this.f46274a = str;
        }

        /* renamed from: f */
        public final void m49216f(String str) {
            this.f46275b = str;
        }
    }

    /* renamed from: o.t2i$b */
    public static final class C16981b {
        public C16981b() {
        }

        public /* synthetic */ C16981b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ t2i(C16980a c16980a, id5 id5Var) {
        this(c16980a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t2i.class != obj.getClass()) {
            return false;
        }
        t2i t2iVar = (t2i) obj;
        return sq8.m48644c(this.f46272d, t2iVar.f46272d) && sq8.m48644c(this.f46273e, t2iVar.f46273e);
    }

    public int hashCode() {
        String str = this.f46272d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f46273e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnauthorizedClientException(");
        sb.append("error=" + this.f46272d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.f46273e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public t2i(C16980a c16980a) {
        this.f46272d = c16980a.m49213c();
        this.f46273e = c16980a.m49214d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
