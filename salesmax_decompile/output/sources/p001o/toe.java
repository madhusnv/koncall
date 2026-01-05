package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class toe extends ohe {

    /* renamed from: f */
    public static final C17169b f47495f = new C17169b(null);

    /* renamed from: d */
    public final String f47496d;

    /* renamed from: e */
    public final String f47497e;

    /* renamed from: o.toe$a */
    public static final class C17168a {

        /* renamed from: a */
        public String f47498a;

        /* renamed from: b */
        public String f47499b;

        /* renamed from: c */
        public String f47500c;

        /* renamed from: a */
        public final toe m50252a() {
            return new toe(this, null);
        }

        /* renamed from: b */
        public final C17168a m50253b() {
            return this;
        }

        /* renamed from: c */
        public final String m50254c() {
            return this.f47498a;
        }

        /* renamed from: d */
        public final String m50255d() {
            return this.f47499b;
        }

        /* renamed from: e */
        public final String m50256e() {
            return this.f47500c;
        }

        /* renamed from: f */
        public final void m50257f(String str) {
            this.f47498a = str;
        }

        /* renamed from: g */
        public final void m50258g(String str) {
            this.f47499b = str;
        }

        /* renamed from: h */
        public final void m50259h(String str) {
            this.f47500c = str;
        }
    }

    /* renamed from: o.toe$b */
    public static final class C17169b {
        public C17169b() {
        }

        public /* synthetic */ C17169b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ toe(C17168a c17168a, id5 id5Var) {
        this(c17168a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || toe.class != obj.getClass()) {
            return false;
        }
        toe toeVar = (toe) obj;
        return sq8.m48644c(this.f47496d, toeVar.f47496d) && sq8.m48644c(this.f47497e, toeVar.f47497e) && sq8.m48644c(getMessage(), toeVar.getMessage());
    }

    public int hashCode() {
        String str = this.f47496d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47497e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceNotFoundException(");
        sb.append("code=" + this.f47496d + ',');
        sb.append("logref=" + this.f47497e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public toe(C17168a c17168a) {
        super(c17168a.m50256e());
        this.f47496d = c17168a.m50254c();
        this.f47497e = c17168a.m50255d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
