package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class rrh extends ng3 {

    /* renamed from: d */
    public static final C16654b f43989d = new C16654b(null);

    /* renamed from: o.rrh$a */
    public static final class C16653a {

        /* renamed from: a */
        public String f43990a;

        /* renamed from: a */
        public final rrh m47102a() {
            return new rrh(this, null);
        }

        /* renamed from: b */
        public final C16653a m47103b() {
            return this;
        }

        /* renamed from: c */
        public final String m47104c() {
            return this.f43990a;
        }

        /* renamed from: d */
        public final void m47105d(String str) {
            this.f43990a = str;
        }
    }

    /* renamed from: o.rrh$b */
    public static final class C16654b {
        public C16654b() {
        }

        public /* synthetic */ C16654b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rrh(C16653a c16653a, id5 id5Var) {
        this(c16653a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rrh.class == obj.getClass() && sq8.m48644c(getMessage(), ((rrh) obj).getMessage());
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
        sb.append("TooManyRequestsException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rrh(C16653a c16653a) {
        super(c16653a.m47104c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
