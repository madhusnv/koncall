package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class q4j extends ng3 {

    /* renamed from: d */
    public static final C16296b f41304d = new C16296b(null);

    /* renamed from: o.q4j$a */
    public static final class C16295a {

        /* renamed from: a */
        public String f41305a;

        /* renamed from: a */
        public final q4j m44814a() {
            return new q4j(this, null);
        }

        /* renamed from: b */
        public final C16295a m44815b() {
            return this;
        }

        /* renamed from: c */
        public final String m44816c() {
            return this.f41305a;
        }

        /* renamed from: d */
        public final void m44817d(String str) {
            this.f41305a = str;
        }
    }

    /* renamed from: o.q4j$b */
    public static final class C16296b {
        public C16296b() {
        }

        public /* synthetic */ C16296b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ q4j(C16295a c16295a, id5 id5Var) {
        this(c16295a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && q4j.class == obj.getClass() && sq8.m48644c(getMessage(), ((q4j) obj).getMessage());
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
        sb.append("WebAuthnConfigurationMissingException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public q4j(C16295a c16295a) {
        super(c16295a.m44816c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
