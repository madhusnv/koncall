package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class d6i extends ng3 {

    /* renamed from: d */
    public static final C12800b f19156d = new C12800b(null);

    /* renamed from: o.d6i$a */
    public static final class C12799a {

        /* renamed from: a */
        public String f19157a;

        /* renamed from: a */
        public final d6i m22366a() {
            return new d6i(this, null);
        }

        /* renamed from: b */
        public final C12799a m22367b() {
            return this;
        }

        /* renamed from: c */
        public final String m22368c() {
            return this.f19157a;
        }

        /* renamed from: d */
        public final void m22369d(String str) {
            this.f19157a = str;
        }
    }

    /* renamed from: o.d6i$b */
    public static final class C12800b {
        public C12800b() {
        }

        public /* synthetic */ C12800b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ d6i(C12799a c12799a, id5 id5Var) {
        this(c12799a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d6i.class == obj.getClass() && sq8.m48644c(getMessage(), ((d6i) obj).getMessage());
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
        sb.append("UnsupportedTokenTypeException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public d6i(C12799a c12799a) {
        super(c12799a.m22368c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
