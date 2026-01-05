package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class nr8 extends fg3 {

    /* renamed from: d */
    public static final C15644b f37199d = new C15644b(null);

    /* renamed from: o.nr8$a */
    public static final class C15643a {

        /* renamed from: a */
        public String f37200a;

        /* renamed from: a */
        public final nr8 m41000a() {
            return new nr8(this, null);
        }

        /* renamed from: b */
        public final C15643a m41001b() {
            return this;
        }

        /* renamed from: c */
        public final String m41002c() {
            return this.f37200a;
        }

        /* renamed from: d */
        public final void m41003d(String str) {
            this.f37200a = str;
        }
    }

    /* renamed from: o.nr8$b */
    public static final class C15644b {
        public C15644b() {
        }

        public /* synthetic */ C15644b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ nr8(C15643a c15643a, id5 id5Var) {
        this(c15643a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nr8.class == obj.getClass() && sq8.m48644c(getMessage(), ((nr8) obj).getMessage());
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
        sb.append("InvalidIdentityPoolConfigurationException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public nr8(C15643a c15643a) {
        super(c15643a.m41002c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
