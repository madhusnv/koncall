package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class v4j extends ng3 {

    /* renamed from: d */
    public static final C17508b f49876d = new C17508b(null);

    /* renamed from: o.v4j$a */
    public static final class C17507a {

        /* renamed from: a */
        public String f49877a;

        /* renamed from: a */
        public final v4j m52329a() {
            return new v4j(this, null);
        }

        /* renamed from: b */
        public final C17507a m52330b() {
            return this;
        }

        /* renamed from: c */
        public final String m52331c() {
            return this.f49877a;
        }

        /* renamed from: d */
        public final void m52332d(String str) {
            this.f49877a = str;
        }
    }

    /* renamed from: o.v4j$b */
    public static final class C17508b {
        public C17508b() {
        }

        public /* synthetic */ C17508b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ v4j(C17507a c17507a, id5 id5Var) {
        this(c17507a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v4j.class == obj.getClass() && sq8.m48644c(getMessage(), ((v4j) obj).getMessage());
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
        sb.append("WebAuthnCredentialNotSupportedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public v4j(C17507a c17507a) {
        super(c17507a.m52331c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
