package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class qr8 extends cag {

    /* renamed from: d */
    public static final C16450b f42335d = new C16450b(null);

    /* renamed from: o.qr8$a */
    public static final class C16449a {

        /* renamed from: a */
        public String f42336a;

        /* renamed from: a */
        public final qr8 m45802a() {
            return new qr8(this, null);
        }

        /* renamed from: b */
        public final C16449a m45803b() {
            return this;
        }

        /* renamed from: c */
        public final String m45804c() {
            return this.f42336a;
        }

        /* renamed from: d */
        public final void m45805d(String str) {
            this.f42336a = str;
        }
    }

    /* renamed from: o.qr8$b */
    public static final class C16450b {
        public C16450b() {
        }

        public /* synthetic */ C16450b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qr8(C16449a c16449a, id5 id5Var) {
        this(c16449a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qr8.class == obj.getClass() && sq8.m48644c(getMessage(), ((qr8) obj).getMessage());
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
        sb.append("InvalidIdentityTokenException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qr8(C16449a c16449a) {
        super(c16449a.m45804c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
