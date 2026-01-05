package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class glh extends ohe {

    /* renamed from: f */
    public static final C13777b f25426f = new C13777b(null);

    /* renamed from: d */
    public final String f25427d;

    /* renamed from: e */
    public final String f25428e;

    /* renamed from: o.glh$a */
    public static final class C13776a {

        /* renamed from: a */
        public String f25429a;

        /* renamed from: b */
        public String f25430b;

        /* renamed from: c */
        public String f25431c;

        /* renamed from: a */
        public final glh m29014a() {
            return new glh(this, null);
        }

        /* renamed from: b */
        public final C13776a m29015b() {
            return this;
        }

        /* renamed from: c */
        public final String m29016c() {
            return this.f25429a;
        }

        /* renamed from: d */
        public final String m29017d() {
            return this.f25430b;
        }

        /* renamed from: e */
        public final String m29018e() {
            return this.f25431c;
        }

        /* renamed from: f */
        public final void m29019f(String str) {
            this.f25429a = str;
        }

        /* renamed from: g */
        public final void m29020g(String str) {
            this.f25430b = str;
        }

        /* renamed from: h */
        public final void m29021h(String str) {
            this.f25431c = str;
        }
    }

    /* renamed from: o.glh$b */
    public static final class C13777b {
        public C13777b() {
        }

        public /* synthetic */ C13777b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ glh(C13776a c13776a, id5 id5Var) {
        this(c13776a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || glh.class != obj.getClass()) {
            return false;
        }
        glh glhVar = (glh) obj;
        return sq8.m48644c(this.f25427d, glhVar.f25427d) && sq8.m48644c(this.f25428e, glhVar.f25428e) && sq8.m48644c(getMessage(), glhVar.getMessage());
    }

    public int hashCode() {
        String str = this.f25427d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25428e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThrottlingException(");
        sb.append("code=" + this.f25427d + ',');
        sb.append("logref=" + this.f25428e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public glh(C13776a c13776a) {
        super(c13776a.m29018e());
        this.f25427d = c13776a.m29016c();
        this.f25428e = c13776a.m29017d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
