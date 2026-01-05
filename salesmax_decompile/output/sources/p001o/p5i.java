package p001o;

import p001o.hgf;

/* loaded from: classes3.dex */
public final class p5i extends awh {

    /* renamed from: f */
    public static final C15960b f39374f = new C15960b(null);

    /* renamed from: d */
    public final String f39375d;

    /* renamed from: e */
    public final String f39376e;

    /* renamed from: o.p5i$a */
    public static final class C15959a {

        /* renamed from: a */
        public String f39377a;

        /* renamed from: b */
        public String f39378b;

        /* renamed from: c */
        public String f39379c;

        /* renamed from: a */
        public final p5i m42983a() {
            return new p5i(this, null);
        }

        /* renamed from: b */
        public final C15959a m42984b() {
            return this;
        }

        /* renamed from: c */
        public final String m42985c() {
            return this.f39377a;
        }

        /* renamed from: d */
        public final String m42986d() {
            return this.f39378b;
        }

        /* renamed from: e */
        public final String m42987e() {
            return this.f39379c;
        }

        /* renamed from: f */
        public final void m42988f(String str) {
            this.f39377a = str;
        }

        /* renamed from: g */
        public final void m42989g(String str) {
            this.f39378b = str;
        }

        /* renamed from: h */
        public final void m42990h(String str) {
            this.f39379c = str;
        }
    }

    /* renamed from: o.p5i$b */
    public static final class C15960b {
        public C15960b() {
        }

        public /* synthetic */ C15960b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ p5i(C15959a c15959a, id5 id5Var) {
        this(c15959a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p5i.class != obj.getClass()) {
            return false;
        }
        p5i p5iVar = (p5i) obj;
        return sq8.m48644c(getMessage(), p5iVar.getMessage()) && sq8.m48644c(this.f39375d, p5iVar.f39375d) && sq8.m48644c(this.f39376e, p5iVar.f39376e);
    }

    public int hashCode() {
        String message = getMessage();
        int iHashCode = (message != null ? message.hashCode() : 0) * 31;
        String str = this.f39375d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39376e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnsupportedLanguagePairException(");
        sb.append("message=" + getMessage() + ',');
        sb.append("sourceLanguageCode=" + this.f39375d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("targetLanguageCode=");
        sb2.append(this.f39376e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public p5i(C15959a c15959a) {
        super(c15959a.m42985c());
        this.f39375d = c15959a.m42986d();
        this.f39376e = c15959a.m42987e();
        mo34658a().m35772c().mo34002p(ggf.f25107e.m28591c(), hgf.EnumC13938a.Client);
    }
}
