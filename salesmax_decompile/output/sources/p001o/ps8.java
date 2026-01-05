package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ps8 extends qjh {

    /* renamed from: e */
    public static final C16177b f40499e = new C16177b(null);

    /* renamed from: d */
    public final String f40500d;

    /* renamed from: o.ps8$a */
    public static final class C16176a {

        /* renamed from: a */
        public String f40501a;

        /* renamed from: b */
        public String f40502b;

        /* renamed from: a */
        public final ps8 m44126a() {
            return new ps8(this, null);
        }

        /* renamed from: b */
        public final C16176a m44127b() {
            return this;
        }

        /* renamed from: c */
        public final String m44128c() {
            return this.f40501a;
        }

        /* renamed from: d */
        public final String m44129d() {
            return this.f40502b;
        }

        /* renamed from: e */
        public final void m44130e(String str) {
            this.f40501a = str;
        }

        /* renamed from: f */
        public final void m44131f(String str) {
            this.f40502b = str;
        }
    }

    /* renamed from: o.ps8$b */
    public static final class C16177b {
        public C16177b() {
        }

        public /* synthetic */ C16177b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ps8(C16176a c16176a, id5 id5Var) {
        this(c16176a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ps8.class != obj.getClass()) {
            return false;
        }
        ps8 ps8Var = (ps8) obj;
        return sq8.m48644c(this.f40500d, ps8Var.f40500d) && sq8.m48644c(getMessage(), ps8Var.getMessage());
    }

    public int hashCode() {
        String str = this.f40500d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidParameterException(");
        sb.append("code=" + this.f40500d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ps8(C16176a c16176a) {
        super(c16176a.m44129d());
        this.f40500d = c16176a.m44128c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
