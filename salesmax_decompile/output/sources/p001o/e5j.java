package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class e5j extends ng3 {

    /* renamed from: d */
    public static final C13108b f21013d = new C13108b(null);

    /* renamed from: o.e5j$a */
    public static final class C13107a {

        /* renamed from: a */
        public String f21014a;

        /* renamed from: a */
        public final e5j m24348a() {
            return new e5j(this, null);
        }

        /* renamed from: b */
        public final C13107a m24349b() {
            return this;
        }

        /* renamed from: c */
        public final String m24350c() {
            return this.f21014a;
        }

        /* renamed from: d */
        public final void m24351d(String str) {
            this.f21014a = str;
        }
    }

    /* renamed from: o.e5j$b */
    public static final class C13108b {
        public C13108b() {
        }

        public /* synthetic */ C13108b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ e5j(C13107a c13107a, id5 id5Var) {
        this(c13107a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e5j.class == obj.getClass() && sq8.m48644c(getMessage(), ((e5j) obj).getMessage());
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
        sb.append("WebAuthnRelyingPartyMismatchException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public e5j(C13107a c13107a) {
        super(c13107a.m24350c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
