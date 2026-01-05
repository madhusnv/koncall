package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ms8 extends fg3 {

    /* renamed from: d */
    public static final C15421b f35910d = new C15421b(null);

    /* renamed from: o.ms8$a */
    public static final class C15420a {

        /* renamed from: a */
        public String f35911a;

        /* renamed from: a */
        public final ms8 m39609a() {
            return new ms8(this, null);
        }

        /* renamed from: b */
        public final C15420a m39610b() {
            return this;
        }

        /* renamed from: c */
        public final String m39611c() {
            return this.f35911a;
        }

        /* renamed from: d */
        public final void m39612d(String str) {
            this.f35911a = str;
        }
    }

    /* renamed from: o.ms8$b */
    public static final class C15421b {
        public C15421b() {
        }

        public /* synthetic */ C15421b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ms8(C15420a c15420a, id5 id5Var) {
        this(c15420a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ms8.class == obj.getClass() && sq8.m48644c(getMessage(), ((ms8) obj).getMessage());
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
        sb.append("InvalidParameterException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ms8(C15420a c15420a) {
        super(c15420a.m39611c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
