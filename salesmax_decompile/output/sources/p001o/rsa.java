package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class rsa extends pdd {

    /* renamed from: d */
    public static final C16660b f44025d = new C16660b(null);

    /* renamed from: o.rsa$a */
    public static final class C16659a {

        /* renamed from: a */
        public String f44026a;

        /* renamed from: a */
        public final rsa m47137a() {
            return new rsa(this, null);
        }

        /* renamed from: b */
        public final C16659a m47138b() {
            return this;
        }

        /* renamed from: c */
        public final String m47139c() {
            return this.f44026a;
        }

        /* renamed from: d */
        public final void m47140d(String str) {
            this.f44026a = str;
        }
    }

    /* renamed from: o.rsa$b */
    public static final class C16660b {
        public C16660b() {
        }

        public /* synthetic */ C16660b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rsa(C16659a c16659a, id5 id5Var) {
        this(c16659a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rsa.class == obj.getClass() && sq8.m48644c(getMessage(), ((rsa) obj).getMessage());
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
        sb.append("MarksNotSupportedForFormatException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rsa(C16659a c16659a) {
        super(c16659a.m47139c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
