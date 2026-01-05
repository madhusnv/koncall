package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class hr8 extends ng3 {

    /* renamed from: d */
    public static final C14047b f27391d = new C14047b(null);

    /* renamed from: o.hr8$a */
    public static final class C14046a {

        /* renamed from: a */
        public String f27392a;

        /* renamed from: a */
        public final hr8 m31010a() {
            return new hr8(this, null);
        }

        /* renamed from: b */
        public final C14046a m31011b() {
            return this;
        }

        /* renamed from: c */
        public final String m31012c() {
            return this.f27392a;
        }

        /* renamed from: d */
        public final void m31013d(String str) {
            this.f27392a = str;
        }
    }

    /* renamed from: o.hr8$b */
    public static final class C14047b {
        public C14047b() {
        }

        public /* synthetic */ C14047b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hr8(C14046a c14046a, id5 id5Var) {
        this(c14046a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hr8.class == obj.getClass() && sq8.m48644c(getMessage(), ((hr8) obj).getMessage());
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
        sb.append("InvalidEmailRoleAccessPolicyException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hr8(C14046a c14046a) {
        super(c14046a.m31012c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
