package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class pa1 extends qjh {

    /* renamed from: e */
    public static final C16042b f39692e = new C16042b(null);

    /* renamed from: d */
    public final String f39693d;

    /* renamed from: o.pa1$a */
    public static final class C16041a {

        /* renamed from: a */
        public String f39694a;

        /* renamed from: b */
        public String f39695b;

        /* renamed from: a */
        public final pa1 m43255a() {
            return new pa1(this, null);
        }

        /* renamed from: b */
        public final C16041a m43256b() {
            return this;
        }

        /* renamed from: c */
        public final String m43257c() {
            return this.f39694a;
        }

        /* renamed from: d */
        public final String m43258d() {
            return this.f39695b;
        }

        /* renamed from: e */
        public final void m43259e(String str) {
            this.f39694a = str;
        }

        /* renamed from: f */
        public final void m43260f(String str) {
            this.f39695b = str;
        }
    }

    /* renamed from: o.pa1$b */
    public static final class C16042b {
        public C16042b() {
        }

        public /* synthetic */ C16042b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ pa1(C16041a c16041a, id5 id5Var) {
        this(c16041a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pa1.class != obj.getClass()) {
            return false;
        }
        pa1 pa1Var = (pa1) obj;
        return sq8.m48644c(this.f39693d, pa1Var.f39693d) && sq8.m48644c(getMessage(), pa1Var.getMessage());
    }

    public int hashCode() {
        String str = this.f39693d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BadDocumentException(");
        sb.append("code=" + this.f39693d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public pa1(C16041a c16041a) {
        super(c16041a.m43258d());
        this.f39693d = c16041a.m43257c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
