package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class k3i extends ng3 {

    /* renamed from: d */
    public static final C14709b f31445d = new C14709b(null);

    /* renamed from: o.k3i$a */
    public static final class C14708a {

        /* renamed from: a */
        public String f31446a;

        /* renamed from: a */
        public final k3i m34960a() {
            return new k3i(this, null);
        }

        /* renamed from: b */
        public final C14708a m34961b() {
            return this;
        }

        /* renamed from: c */
        public final String m34962c() {
            return this.f31446a;
        }

        /* renamed from: d */
        public final void m34963d(String str) {
            this.f31446a = str;
        }
    }

    /* renamed from: o.k3i$b */
    public static final class C14709b {
        public C14709b() {
        }

        public /* synthetic */ C14709b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ k3i(C14708a c14708a, id5 id5Var) {
        this(c14708a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k3i.class == obj.getClass() && sq8.m48644c(getMessage(), ((k3i) obj).getMessage());
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
        sb.append("UnexpectedLambdaException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public k3i(C14708a c14708a) {
        super(c14708a.m34962c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
