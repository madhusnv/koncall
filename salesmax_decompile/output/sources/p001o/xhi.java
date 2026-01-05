package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class xhi extends ng3 {

    /* renamed from: d */
    public static final C18162b f53796d = new C18162b(null);

    /* renamed from: o.xhi$a */
    public static final class C18161a {

        /* renamed from: a */
        public String f53797a;

        /* renamed from: a */
        public final xhi m56323a() {
            return new xhi(this, null);
        }

        /* renamed from: b */
        public final C18161a m56324b() {
            return this;
        }

        /* renamed from: c */
        public final String m56325c() {
            return this.f53797a;
        }

        /* renamed from: d */
        public final void m56326d(String str) {
            this.f53797a = str;
        }
    }

    /* renamed from: o.xhi$b */
    public static final class C18162b {
        public C18162b() {
        }

        public /* synthetic */ C18162b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xhi(C18161a c18161a, id5 id5Var) {
        this(c18161a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xhi.class == obj.getClass() && sq8.m48644c(getMessage(), ((xhi) obj).getMessage());
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
        sb.append("UserNotFoundException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xhi(C18161a c18161a) {
        super(c18161a.m56325c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
