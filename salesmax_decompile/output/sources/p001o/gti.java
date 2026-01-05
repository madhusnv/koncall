package p001o;

/* loaded from: classes3.dex */
public final class gti {

    /* renamed from: c */
    public static final C13823b f25790c = new C13823b(null);

    /* renamed from: a */
    public final String f25791a;

    /* renamed from: b */
    public final hti f25792b;

    /* renamed from: o.gti$a */
    public static final class C13822a {

        /* renamed from: a */
        public String f25793a;

        /* renamed from: b */
        public hti f25794b;

        /* renamed from: a */
        public final gti m29484a() {
            return new gti(this, null);
        }

        /* renamed from: b */
        public final C13822a m29485b() {
            return this;
        }

        /* renamed from: c */
        public final String m29486c() {
            return this.f25793a;
        }

        /* renamed from: d */
        public final hti m29487d() {
            return this.f25794b;
        }

        /* renamed from: e */
        public final void m29488e(String str) {
            this.f25793a = str;
        }

        /* renamed from: f */
        public final void m29489f(hti htiVar) {
            this.f25794b = htiVar;
        }
    }

    /* renamed from: o.gti$b */
    public static final class C13823b {
        public C13823b() {
        }

        public /* synthetic */ C13823b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gti(C13822a c13822a, id5 id5Var) {
        this(c13822a);
    }

    /* renamed from: a */
    public final String m29482a() {
        return this.f25791a;
    }

    /* renamed from: b */
    public final hti m29483b() {
        return this.f25792b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gti.class != obj.getClass()) {
            return false;
        }
        gti gtiVar = (gti) obj;
        return sq8.m48644c(this.f25791a, gtiVar.f25791a) && sq8.m48644c(this.f25792b, gtiVar.f25792b);
    }

    public int hashCode() {
        String str = this.f25791a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        hti htiVar = this.f25792b;
        return iHashCode + (htiVar != null ? htiVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifySoftwareTokenResponse(");
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("status=" + this.f25792b);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gti(C13822a c13822a) {
        this.f25791a = c13822a.m29486c();
        this.f25792b = c13822a.m29487d();
    }
}
