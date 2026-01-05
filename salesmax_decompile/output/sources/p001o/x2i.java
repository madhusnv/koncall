package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class x2i extends ng3 {

    /* renamed from: d */
    public static final C18043b f53125d = new C18043b(null);

    /* renamed from: o.x2i$a */
    public static final class C18042a {

        /* renamed from: a */
        public String f53126a;

        /* renamed from: a */
        public final x2i m55606a() {
            return new x2i(this, null);
        }

        /* renamed from: b */
        public final C18042a m55607b() {
            return this;
        }

        /* renamed from: c */
        public final String m55608c() {
            return this.f53126a;
        }

        /* renamed from: d */
        public final void m55609d(String str) {
            this.f53126a = str;
        }
    }

    /* renamed from: o.x2i$b */
    public static final class C18043b {
        public C18043b() {
        }

        public /* synthetic */ C18043b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ x2i(C18042a c18042a, id5 id5Var) {
        this(c18042a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x2i.class == obj.getClass() && sq8.m48644c(getMessage(), ((x2i) obj).getMessage());
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
        sb.append("UnauthorizedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public x2i(C18042a c18042a) {
        super(c18042a.m55608c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
