package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class yr8 extends ng3 {

    /* renamed from: d */
    public static final C18471b f55842d = new C18471b(null);

    /* renamed from: o.yr8$a */
    public static final class C18470a {

        /* renamed from: a */
        public String f55843a;

        /* renamed from: a */
        public final yr8 m58134a() {
            return new yr8(this, null);
        }

        /* renamed from: b */
        public final C18470a m58135b() {
            return this;
        }

        /* renamed from: c */
        public final String m58136c() {
            return this.f55843a;
        }

        /* renamed from: d */
        public final void m58137d(String str) {
            this.f55843a = str;
        }
    }

    /* renamed from: o.yr8$b */
    public static final class C18471b {
        public C18471b() {
        }

        public /* synthetic */ C18471b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yr8(C18470a c18470a, id5 id5Var) {
        this(c18470a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yr8.class == obj.getClass() && sq8.m48644c(getMessage(), ((yr8) obj).getMessage());
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
        sb.append("InvalidLambdaResponseException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yr8(C18470a c18470a) {
        super(c18470a.m58136c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
