package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class b5j extends ng3 {

    /* renamed from: d */
    public static final C12284b f15570d = new C12284b(null);

    /* renamed from: o.b5j$a */
    public static final class C12283a {

        /* renamed from: a */
        public String f15571a;

        /* renamed from: a */
        public final b5j m18176a() {
            return new b5j(this, null);
        }

        /* renamed from: b */
        public final C12283a m18177b() {
            return this;
        }

        /* renamed from: c */
        public final String m18178c() {
            return this.f15571a;
        }

        /* renamed from: d */
        public final void m18179d(String str) {
            this.f15571a = str;
        }
    }

    /* renamed from: o.b5j$b */
    public static final class C12284b {
        public C12284b() {
        }

        public /* synthetic */ C12284b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ b5j(C12283a c12283a, id5 id5Var) {
        this(c12283a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b5j.class == obj.getClass() && sq8.m48644c(getMessage(), ((b5j) obj).getMessage());
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
        sb.append("WebAuthnOriginNotAllowedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public b5j(C12283a c12283a) {
        super(c12283a.m18178c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
