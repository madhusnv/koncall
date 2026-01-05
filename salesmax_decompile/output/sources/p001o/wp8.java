package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class wp8 extends ohe {

    /* renamed from: f */
    public static final C17945b f52446f = new C17945b(null);

    /* renamed from: d */
    public final String f52447d;

    /* renamed from: e */
    public final String f52448e;

    /* renamed from: o.wp8$a */
    public static final class C17944a {

        /* renamed from: a */
        public String f52449a;

        /* renamed from: b */
        public String f52450b;

        /* renamed from: c */
        public String f52451c;

        /* renamed from: a */
        public final wp8 m54790a() {
            return new wp8(this, null);
        }

        /* renamed from: b */
        public final C17944a m54791b() {
            return this;
        }

        /* renamed from: c */
        public final String m54792c() {
            return this.f52449a;
        }

        /* renamed from: d */
        public final String m54793d() {
            return this.f52450b;
        }

        /* renamed from: e */
        public final String m54794e() {
            return this.f52451c;
        }

        /* renamed from: f */
        public final void m54795f(String str) {
            this.f52449a = str;
        }

        /* renamed from: g */
        public final void m54796g(String str) {
            this.f52450b = str;
        }

        /* renamed from: h */
        public final void m54797h(String str) {
            this.f52451c = str;
        }
    }

    /* renamed from: o.wp8$b */
    public static final class C17945b {
        public C17945b() {
        }

        public /* synthetic */ C17945b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wp8(C17944a c17944a, id5 id5Var) {
        this(c17944a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wp8.class != obj.getClass()) {
            return false;
        }
        wp8 wp8Var = (wp8) obj;
        return sq8.m48644c(this.f52447d, wp8Var.f52447d) && sq8.m48644c(this.f52448e, wp8Var.f52448e) && sq8.m48644c(getMessage(), wp8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f52447d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f52448e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InternalServerError(");
        sb.append("code=" + this.f52447d + ',');
        sb.append("logref=" + this.f52448e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wp8(C17944a c17944a) {
        super(c17944a.m54794e());
        this.f52447d = c17944a.m54792c();
        this.f52448e = c17944a.m54793d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
