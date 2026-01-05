package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ns8 extends ng3 {

    /* renamed from: e */
    public static final C15652b f37234e = new C15652b(null);

    /* renamed from: d */
    public final String f37235d;

    /* renamed from: o.ns8$a */
    public static final class C15651a {

        /* renamed from: a */
        public String f37236a;

        /* renamed from: b */
        public String f37237b;

        /* renamed from: a */
        public final ns8 m41025a() {
            return new ns8(this, null);
        }

        /* renamed from: b */
        public final C15651a m41026b() {
            return this;
        }

        /* renamed from: c */
        public final String m41027c() {
            return this.f37236a;
        }

        /* renamed from: d */
        public final String m41028d() {
            return this.f37237b;
        }

        /* renamed from: e */
        public final void m41029e(String str) {
            this.f37236a = str;
        }

        /* renamed from: f */
        public final void m41030f(String str) {
            this.f37237b = str;
        }
    }

    /* renamed from: o.ns8$b */
    public static final class C15652b {
        public C15652b() {
        }

        public /* synthetic */ C15652b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ns8(C15651a c15651a, id5 id5Var) {
        this(c15651a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ns8.class != obj.getClass()) {
            return false;
        }
        ns8 ns8Var = (ns8) obj;
        return sq8.m48644c(getMessage(), ns8Var.getMessage()) && sq8.m48644c(this.f37235d, ns8Var.f37235d);
    }

    public int hashCode() {
        String message = getMessage();
        int iHashCode = (message != null ? message.hashCode() : 0) * 31;
        String str = this.f37235d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidParameterException(");
        sb.append("message=" + getMessage() + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("reasonCode=");
        sb2.append(this.f37235d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ns8(C15651a c15651a) {
        super(c15651a.m41027c());
        this.f37235d = c15651a.m41028d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
