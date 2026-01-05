package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class m0c extends ng3 {

    /* renamed from: d */
    public static final C15191b f34593d = new C15191b(null);

    /* renamed from: o.m0c$a */
    public static final class C15190a {

        /* renamed from: a */
        public String f34594a;

        /* renamed from: a */
        public final m0c m38133a() {
            return new m0c(this, null);
        }

        /* renamed from: b */
        public final C15190a m38134b() {
            return this;
        }

        /* renamed from: c */
        public final String m38135c() {
            return this.f34594a;
        }

        /* renamed from: d */
        public final void m38136d(String str) {
            this.f34594a = str;
        }
    }

    /* renamed from: o.m0c$b */
    public static final class C15191b {
        public C15191b() {
        }

        public /* synthetic */ C15191b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ m0c(C15190a c15190a, id5 id5Var) {
        this(c15190a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m0c.class == obj.getClass() && sq8.m48644c(getMessage(), ((m0c) obj).getMessage());
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
        sb.append("NotAuthorizedException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public m0c(C15190a c15190a) {
        super(c15190a.m38135c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
