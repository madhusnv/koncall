package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class qu8 extends ng3 {

    /* renamed from: d */
    public static final C16464b f42449d = new C16464b(null);

    /* renamed from: o.qu8$a */
    public static final class C16463a {

        /* renamed from: a */
        public String f42450a;

        /* renamed from: a */
        public final qu8 m45853a() {
            return new qu8(this, null);
        }

        /* renamed from: b */
        public final C16463a m45854b() {
            return this;
        }

        /* renamed from: c */
        public final String m45855c() {
            return this.f42450a;
        }

        /* renamed from: d */
        public final void m45856d(String str) {
            this.f42450a = str;
        }
    }

    /* renamed from: o.qu8$b */
    public static final class C16464b {
        public C16464b() {
        }

        public /* synthetic */ C16464b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qu8(C16463a c16463a, id5 id5Var) {
        this(c16463a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qu8.class == obj.getClass() && sq8.m48644c(getMessage(), ((qu8) obj).getMessage());
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
        sb.append("InvalidSmsRoleTrustRelationshipException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qu8(C16463a c16463a) {
        super(c16463a.m45855c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
