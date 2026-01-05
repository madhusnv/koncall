package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class no6 extends ng3 {

    /* renamed from: d */
    public static final C15619b f37097d = new C15619b(null);

    /* renamed from: o.no6$a */
    public static final class C15618a {

        /* renamed from: a */
        public String f37098a;

        /* renamed from: a */
        public final no6 m40861a() {
            return new no6(this, null);
        }

        /* renamed from: b */
        public final C15618a m40862b() {
            return this;
        }

        /* renamed from: c */
        public final String m40863c() {
            return this.f37098a;
        }

        /* renamed from: d */
        public final void m40864d(String str) {
            this.f37098a = str;
        }
    }

    /* renamed from: o.no6$b */
    public static final class C15619b {
        public C15619b() {
        }

        public /* synthetic */ C15619b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ no6(C15618a c15618a, id5 id5Var) {
        this(c15618a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && no6.class == obj.getClass() && sq8.m48644c(getMessage(), ((no6) obj).getMessage());
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
        sb.append("ExpiredCodeException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public no6(C15618a c15618a) {
        super(c15618a.m40863c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
