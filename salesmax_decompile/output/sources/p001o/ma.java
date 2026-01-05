package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class ma extends qjh {

    /* renamed from: e */
    public static final C15257b f35031e = new C15257b(null);

    /* renamed from: d */
    public final String f35032d;

    /* renamed from: o.ma$a */
    public static final class C15256a {

        /* renamed from: a */
        public String f35033a;

        /* renamed from: b */
        public String f35034b;

        /* renamed from: a */
        public final ma m38606a() {
            return new ma(this, null);
        }

        /* renamed from: b */
        public final C15256a m38607b() {
            return this;
        }

        /* renamed from: c */
        public final String m38608c() {
            return this.f35033a;
        }

        /* renamed from: d */
        public final String m38609d() {
            return this.f35034b;
        }

        /* renamed from: e */
        public final void m38610e(String str) {
            this.f35033a = str;
        }

        /* renamed from: f */
        public final void m38611f(String str) {
            this.f35034b = str;
        }
    }

    /* renamed from: o.ma$b */
    public static final class C15257b {
        public C15257b() {
        }

        public /* synthetic */ C15257b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ma(C15256a c15256a, id5 id5Var) {
        this(c15256a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ma.class != obj.getClass()) {
            return false;
        }
        ma maVar = (ma) obj;
        return sq8.m48644c(this.f35032d, maVar.f35032d) && sq8.m48644c(getMessage(), maVar.getMessage());
    }

    public int hashCode() {
        String str = this.f35032d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessDeniedException(");
        sb.append("code=" + this.f35032d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ma(C15256a c15256a) {
        super(c15256a.m38609d());
        this.f35032d = c15256a.m38608c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
