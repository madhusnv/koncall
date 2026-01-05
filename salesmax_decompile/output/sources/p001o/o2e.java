package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class o2e extends ohe {

    /* renamed from: f */
    public static final C15700b f37662f = new C15700b(null);

    /* renamed from: d */
    public final String f37663d;

    /* renamed from: e */
    public final String f37664e;

    /* renamed from: o.o2e$a */
    public static final class C15699a {

        /* renamed from: a */
        public String f37665a;

        /* renamed from: b */
        public String f37666b;

        /* renamed from: c */
        public String f37667c;

        /* renamed from: a */
        public final o2e m41466a() {
            return new o2e(this, null);
        }

        /* renamed from: b */
        public final C15699a m41467b() {
            return this;
        }

        /* renamed from: c */
        public final String m41468c() {
            return this.f37665a;
        }

        /* renamed from: d */
        public final String m41469d() {
            return this.f37666b;
        }

        /* renamed from: e */
        public final String m41470e() {
            return this.f37667c;
        }

        /* renamed from: f */
        public final void m41471f(String str) {
            this.f37665a = str;
        }

        /* renamed from: g */
        public final void m41472g(String str) {
            this.f37666b = str;
        }

        /* renamed from: h */
        public final void m41473h(String str) {
            this.f37667c = str;
        }
    }

    /* renamed from: o.o2e$b */
    public static final class C15700b {
        public C15700b() {
        }

        public /* synthetic */ C15700b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ o2e(C15699a c15699a, id5 id5Var) {
        this(c15699a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o2e.class != obj.getClass()) {
            return false;
        }
        o2e o2eVar = (o2e) obj;
        return sq8.m48644c(this.f37663d, o2eVar.f37663d) && sq8.m48644c(this.f37664e, o2eVar.f37664e) && sq8.m48644c(getMessage(), o2eVar.getMessage());
    }

    public int hashCode() {
        String str = this.f37663d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37664e;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String message = getMessage();
        return iHashCode2 + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProvisionedThroughputExceededException(");
        sb.append("code=" + this.f37663d + ',');
        sb.append("logref=" + this.f37664e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public o2e(C15699a c15699a) {
        super(c15699a.m41470e());
        this.f37663d = c15699a.m41468c();
        this.f37664e = c15699a.m41469d();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
