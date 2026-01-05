package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class rzc extends ng3 {

    /* renamed from: d */
    public static final C16693b f44338d = new C16693b(null);

    /* renamed from: o.rzc$a */
    public static final class C16692a {

        /* renamed from: a */
        public String f44339a;

        /* renamed from: a */
        public final rzc m47356a() {
            return new rzc(this, null);
        }

        /* renamed from: b */
        public final C16692a m47357b() {
            return this;
        }

        /* renamed from: c */
        public final String m47358c() {
            return this.f44339a;
        }

        /* renamed from: d */
        public final void m47359d(String str) {
            this.f44339a = str;
        }
    }

    /* renamed from: o.rzc$b */
    public static final class C16693b {
        public C16693b() {
        }

        public /* synthetic */ C16693b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rzc(C16692a c16692a, id5 id5Var) {
        this(c16692a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rzc.class == obj.getClass() && sq8.m48644c(getMessage(), ((rzc) obj).getMessage());
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
        sb.append("PasswordResetRequiredException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rzc(C16692a c16692a) {
        super(c16692a.m47358c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
