package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class p2e extends qjh {

    /* renamed from: e */
    public static final C15942b f39209e = new C15942b(null);

    /* renamed from: d */
    public final String f39210d;

    /* renamed from: o.p2e$a */
    public static final class C15941a {

        /* renamed from: a */
        public String f39211a;

        /* renamed from: b */
        public String f39212b;

        /* renamed from: a */
        public final p2e m42888a() {
            return new p2e(this, null);
        }

        /* renamed from: b */
        public final C15941a m42889b() {
            return this;
        }

        /* renamed from: c */
        public final String m42890c() {
            return this.f39211a;
        }

        /* renamed from: d */
        public final String m42891d() {
            return this.f39212b;
        }

        /* renamed from: e */
        public final void m42892e(String str) {
            this.f39211a = str;
        }

        /* renamed from: f */
        public final void m42893f(String str) {
            this.f39212b = str;
        }
    }

    /* renamed from: o.p2e$b */
    public static final class C15942b {
        public C15942b() {
        }

        public /* synthetic */ C15942b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ p2e(C15941a c15941a, id5 id5Var) {
        this(c15941a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p2e.class != obj.getClass()) {
            return false;
        }
        p2e p2eVar = (p2e) obj;
        return sq8.m48644c(this.f39210d, p2eVar.f39210d) && sq8.m48644c(getMessage(), p2eVar.getMessage());
    }

    public int hashCode() {
        String str = this.f39210d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProvisionedThroughputExceededException(");
        sb.append("code=" + this.f39210d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public p2e(C15941a c15941a) {
        super(c15941a.m42891d());
        this.f39210d = c15941a.m42890c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
