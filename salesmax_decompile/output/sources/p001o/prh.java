package p001o;

import p001o.hgf;

/* loaded from: classes2.dex */
public final class prh extends x1g {

    /* renamed from: d */
    public static final C16168b f40453d = new C16168b(null);

    /* renamed from: o.prh$a */
    public static final class C16167a {

        /* renamed from: a */
        public String f40454a;

        /* renamed from: a */
        public final prh m44087a() {
            return new prh(this, null);
        }

        /* renamed from: b */
        public final C16167a m44088b() {
            return this;
        }

        /* renamed from: c */
        public final String m44089c() {
            return this.f40454a;
        }

        /* renamed from: d */
        public final void m44090d(String str) {
            this.f40454a = str;
        }
    }

    /* renamed from: o.prh$b */
    public static final class C16168b {
        public C16168b() {
        }

        public /* synthetic */ C16168b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ prh(C16167a c16167a, id5 id5Var) {
        this(c16167a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && prh.class == obj.getClass() && sq8.m48644c(getMessage(), ((prh) obj).getMessage());
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
        sb.append("TooManyRequestsException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public prh(C16167a c16167a) {
        super(c16167a.m44089c());
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
