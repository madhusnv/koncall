package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class ro6 extends cag {

    /* renamed from: d */
    public static final C16640b f43896d = new C16640b(null);

    /* renamed from: o.ro6$a */
    public static final class C16639a {

        /* renamed from: a */
        public String f43897a;

        /* renamed from: a */
        public final ro6 m47025a() {
            return new ro6(this, null);
        }

        /* renamed from: b */
        public final C16639a m47026b() {
            return this;
        }

        /* renamed from: c */
        public final String m47027c() {
            return this.f43897a;
        }

        /* renamed from: d */
        public final void m47028d(String str) {
            this.f43897a = str;
        }
    }

    /* renamed from: o.ro6$b */
    public static final class C16640b {
        public C16640b() {
        }

        public /* synthetic */ C16640b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ro6(C16639a c16639a, id5 id5Var) {
        this(c16639a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ro6.class == obj.getClass() && sq8.m48644c(getMessage(), ((ro6) obj).getMessage());
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExpiredTokenException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ro6(C16639a c16639a) {
        super(c16639a.m47027c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
