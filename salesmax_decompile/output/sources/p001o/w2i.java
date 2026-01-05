package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class w2i extends x1g {

    /* renamed from: d */
    public static final C17769b f51358d = new C17769b(null);

    /* renamed from: o.w2i$a */
    public static final class C17768a {

        /* renamed from: a */
        public String f51359a;

        /* renamed from: a */
        public final w2i m53845a() {
            return new w2i(this, null);
        }

        /* renamed from: b */
        public final C17768a m53846b() {
            return this;
        }

        /* renamed from: c */
        public final String m53847c() {
            return this.f51359a;
        }

        /* renamed from: d */
        public final void m53848d(String str) {
            this.f51359a = str;
        }
    }

    /* renamed from: o.w2i$b */
    public static final class C17769b {
        public C17769b() {
        }

        public /* synthetic */ C17769b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ w2i(C17768a c17768a, id5 id5Var) {
        this(c17768a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w2i.class == obj.getClass() && sq8.m48644c(getMessage(), ((w2i) obj).getMessage());
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

    public w2i(C17768a c17768a) {
        super(c17768a.m53847c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
