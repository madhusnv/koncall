package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class n4j extends ng3 {

    /* renamed from: d */
    public static final C15500b f36382d = new C15500b(null);

    /* renamed from: o.n4j$a */
    public static final class C15499a {

        /* renamed from: a */
        public String f36383a;

        /* renamed from: a */
        public final n4j m40108a() {
            return new n4j(this, null);
        }

        /* renamed from: b */
        public final C15499a m40109b() {
            return this;
        }

        /* renamed from: c */
        public final String m40110c() {
            return this.f36383a;
        }

        /* renamed from: d */
        public final void m40111d(String str) {
            this.f36383a = str;
        }
    }

    /* renamed from: o.n4j$b */
    public static final class C15500b {
        public C15500b() {
        }

        public /* synthetic */ C15500b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ n4j(C15499a c15499a, id5 id5Var) {
        this(c15499a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n4j.class == obj.getClass() && sq8.m48644c(getMessage(), ((n4j) obj).getMessage());
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
        sb.append("WebAuthnClientMismatchException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public n4j(C15499a c15499a) {
        super(c15499a.m40110c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
