package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class k4j extends ng3 {

    /* renamed from: d */
    public static final C14712b f31468d = new C14712b(null);

    /* renamed from: o.k4j$a */
    public static final class C14711a {

        /* renamed from: a */
        public String f31469a;

        /* renamed from: a */
        public final k4j m34991a() {
            return new k4j(this, null);
        }

        /* renamed from: b */
        public final C14711a m34992b() {
            return this;
        }

        /* renamed from: c */
        public final String m34993c() {
            return this.f31469a;
        }

        /* renamed from: d */
        public final void m34994d(String str) {
            this.f31469a = str;
        }
    }

    /* renamed from: o.k4j$b */
    public static final class C14712b {
        public C14712b() {
        }

        public /* synthetic */ C14712b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ k4j(C14711a c14711a, id5 id5Var) {
        this(c14711a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k4j.class == obj.getClass() && sq8.m48644c(getMessage(), ((k4j) obj).getMessage());
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
        sb.append("WebAuthnChallengeNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public k4j(C14711a c14711a) {
        super(c14711a.m34993c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
