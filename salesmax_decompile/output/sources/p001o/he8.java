package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class he8 extends ohe {

    /* renamed from: f */
    public static final C13926b f26735f = new C13926b(null);

    /* renamed from: d */
    public final String f26736d;

    /* renamed from: e */
    public final String f26737e;

    /* renamed from: o.he8$a */
    public static final class C13925a {

        /* renamed from: a */
        public String f26738a;

        /* renamed from: b */
        public String f26739b;

        /* renamed from: c */
        public String f26740c;

        /* renamed from: a */
        public final he8 m30295a() {
            return new he8(this, null);
        }

        /* renamed from: b */
        public final C13925a m30296b() {
            return this;
        }

        /* renamed from: c */
        public final String m30297c() {
            return this.f26738a;
        }

        /* renamed from: d */
        public final String m30298d() {
            return this.f26739b;
        }

        /* renamed from: e */
        public final String m30299e() {
            return this.f26740c;
        }

        /* renamed from: f */
        public final void m30300f(String str) {
            this.f26738a = str;
        }

        /* renamed from: g */
        public final void m30301g(String str) {
            this.f26739b = str;
        }

        /* renamed from: h */
        public final void m30302h(String str) {
            this.f26740c = str;
        }
    }

    /* renamed from: o.he8$b */
    public static final class C13926b {
        public C13926b() {
        }

        public /* synthetic */ C13926b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ he8(C13925a c13925a, id5 id5Var) {
        this(c13925a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || he8.class != obj.getClass()) {
            return false;
        }
        he8 he8Var = (he8) obj;
        return sq8.m48644c(this.f26736d, he8Var.f26736d) && sq8.m48644c(this.f26737e, he8Var.f26737e) && sq8.m48644c(getMessage(), he8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f26736d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26737e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImageTooLargeException(");
        sb.append("code=" + this.f26736d + ',');
        sb.append("logref=" + this.f26737e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public he8(C13925a c13925a) {
        super(c13925a.m30299e());
        this.f26736d = c13925a.m30297c();
        this.f26737e = c13925a.m30298d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
