package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class lw5 extends qjh {

    /* renamed from: e */
    public static final C15160b f34439e = new C15160b(null);

    /* renamed from: d */
    public final String f34440d;

    /* renamed from: o.lw5$a */
    public static final class C15159a {

        /* renamed from: a */
        public String f34441a;

        /* renamed from: b */
        public String f34442b;

        /* renamed from: a */
        public final lw5 m37988a() {
            return new lw5(this, null);
        }

        /* renamed from: b */
        public final C15159a m37989b() {
            return this;
        }

        /* renamed from: c */
        public final String m37990c() {
            return this.f34441a;
        }

        /* renamed from: d */
        public final String m37991d() {
            return this.f34442b;
        }

        /* renamed from: e */
        public final void m37992e(String str) {
            this.f34441a = str;
        }

        /* renamed from: f */
        public final void m37993f(String str) {
            this.f34442b = str;
        }
    }

    /* renamed from: o.lw5$b */
    public static final class C15160b {
        public C15160b() {
        }

        public /* synthetic */ C15160b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lw5(C15159a c15159a, id5 id5Var) {
        this(c15159a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lw5.class != obj.getClass()) {
            return false;
        }
        lw5 lw5Var = (lw5) obj;
        return sq8.m48644c(this.f34440d, lw5Var.f34440d) && sq8.m48644c(getMessage(), lw5Var.getMessage());
    }

    public int hashCode() {
        String str = this.f34440d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentTooLargeException(");
        sb.append("code=" + this.f34440d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lw5(C15159a c15159a) {
        super(c15159a.m37991d());
        this.f34440d = c15159a.m37990c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
