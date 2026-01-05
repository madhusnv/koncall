package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class hlh extends qjh {

    /* renamed from: e */
    public static final C13993b f27117e = new C13993b(null);

    /* renamed from: d */
    public final String f27118d;

    /* renamed from: o.hlh$a */
    public static final class C13992a {

        /* renamed from: a */
        public String f27119a;

        /* renamed from: b */
        public String f27120b;

        /* renamed from: a */
        public final hlh m30761a() {
            return new hlh(this, null);
        }

        /* renamed from: b */
        public final C13992a m30762b() {
            return this;
        }

        /* renamed from: c */
        public final String m30763c() {
            return this.f27119a;
        }

        /* renamed from: d */
        public final String m30764d() {
            return this.f27120b;
        }

        /* renamed from: e */
        public final void m30765e(String str) {
            this.f27119a = str;
        }

        /* renamed from: f */
        public final void m30766f(String str) {
            this.f27120b = str;
        }
    }

    /* renamed from: o.hlh$b */
    public static final class C13993b {
        public C13993b() {
        }

        public /* synthetic */ C13993b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hlh(C13992a c13992a, id5 id5Var) {
        this(c13992a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hlh.class != obj.getClass()) {
            return false;
        }
        hlh hlhVar = (hlh) obj;
        return sq8.m48644c(this.f27118d, hlhVar.f27118d) && sq8.m48644c(getMessage(), hlhVar.getMessage());
    }

    public int hashCode() {
        String str = this.f27118d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String message = getMessage();
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThrottlingException(");
        sb.append("code=" + this.f27118d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hlh(C13992a c13992a) {
        super(c13992a.m30764d());
        this.f27118d = c13992a.m30763c();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Server);
    }
}
