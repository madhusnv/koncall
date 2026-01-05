package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class fpe extends ohe {

    /* renamed from: f */
    public static final C13526b f23906f = new C13526b(null);

    /* renamed from: d */
    public final String f23907d;

    /* renamed from: e */
    public final String f23908e;

    /* renamed from: o.fpe$a */
    public static final class C13525a {

        /* renamed from: a */
        public String f23909a;

        /* renamed from: b */
        public String f23910b;

        /* renamed from: c */
        public String f23911c;

        /* renamed from: a */
        public final fpe m27319a() {
            return new fpe(this, null);
        }

        /* renamed from: b */
        public final C13525a m27320b() {
            return this;
        }

        /* renamed from: c */
        public final String m27321c() {
            return this.f23909a;
        }

        /* renamed from: d */
        public final String m27322d() {
            return this.f23910b;
        }

        /* renamed from: e */
        public final String m27323e() {
            return this.f23911c;
        }

        /* renamed from: f */
        public final void m27324f(String str) {
            this.f23909a = str;
        }

        /* renamed from: g */
        public final void m27325g(String str) {
            this.f23910b = str;
        }

        /* renamed from: h */
        public final void m27326h(String str) {
            this.f23911c = str;
        }
    }

    /* renamed from: o.fpe$b */
    public static final class C13526b {
        public C13526b() {
        }

        public /* synthetic */ C13526b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fpe(C13525a c13525a, id5 id5Var) {
        this(c13525a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fpe.class != obj.getClass()) {
            return false;
        }
        fpe fpeVar = (fpe) obj;
        return sq8.m48644c(this.f23907d, fpeVar.f23907d) && sq8.m48644c(this.f23908e, fpeVar.f23908e) && sq8.m48644c(getMessage(), fpeVar.getMessage());
    }

    public int hashCode() {
        String str = this.f23907d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23908e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceNotReadyException(");
        sb.append("code=" + this.f23907d + ',');
        sb.append("logref=" + this.f23908e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fpe(C13525a c13525a) {
        super(c13525a.m27323e());
        this.f23907d = c13525a.m27321c();
        this.f23908e = c13525a.m27322d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
