package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class tr8 extends ohe {

    /* renamed from: f */
    public static final C17194b f47652f = new C17194b(null);

    /* renamed from: d */
    public final String f47653d;

    /* renamed from: e */
    public final String f47654e;

    /* renamed from: o.tr8$a */
    public static final class C17193a {

        /* renamed from: a */
        public String f47655a;

        /* renamed from: b */
        public String f47656b;

        /* renamed from: c */
        public String f47657c;

        /* renamed from: a */
        public final tr8 m50413a() {
            return new tr8(this, null);
        }

        /* renamed from: b */
        public final C17193a m50414b() {
            return this;
        }

        /* renamed from: c */
        public final String m50415c() {
            return this.f47655a;
        }

        /* renamed from: d */
        public final String m50416d() {
            return this.f47656b;
        }

        /* renamed from: e */
        public final String m50417e() {
            return this.f47657c;
        }

        /* renamed from: f */
        public final void m50418f(String str) {
            this.f47655a = str;
        }

        /* renamed from: g */
        public final void m50419g(String str) {
            this.f47656b = str;
        }

        /* renamed from: h */
        public final void m50420h(String str) {
            this.f47657c = str;
        }
    }

    /* renamed from: o.tr8$b */
    public static final class C17194b {
        public C17194b() {
        }

        public /* synthetic */ C17194b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tr8(C17193a c17193a, id5 id5Var) {
        this(c17193a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tr8.class != obj.getClass()) {
            return false;
        }
        tr8 tr8Var = (tr8) obj;
        return sq8.m48644c(this.f47653d, tr8Var.f47653d) && sq8.m48644c(this.f47654e, tr8Var.f47654e) && sq8.m48644c(getMessage(), tr8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f47653d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47654e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidImageFormatException(");
        sb.append("code=" + this.f47653d + ',');
        sb.append("logref=" + this.f47654e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tr8(C17193a c17193a) {
        super(c17193a.m50417e());
        this.f47653d = c17193a.m50415c();
        this.f47654e = c17193a.m50416d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
