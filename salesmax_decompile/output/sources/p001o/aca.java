package p001o;

/* loaded from: classes3.dex */
public final class aca {

    /* renamed from: g */
    public static final C12139b f14489g = new C12139b(null);

    /* renamed from: a */
    public final String f14490a;

    /* renamed from: b */
    public final tg9 f14491b;

    /* renamed from: c */
    public final gk8 f14492c;

    /* renamed from: d */
    public final int f14493d;

    /* renamed from: e */
    public final String f14494e;

    /* renamed from: f */
    public final int f14495f;

    /* renamed from: o.aca$a */
    public static final class C12138a {

        /* renamed from: a */
        public String f14496a;

        /* renamed from: b */
        public tg9 f14497b;

        /* renamed from: c */
        public gk8 f14498c;

        /* renamed from: d */
        public int f14499d;

        /* renamed from: e */
        public String f14500e;

        /* renamed from: f */
        public int f14501f;

        /* renamed from: a */
        public final aca m16856a() {
            return new aca(this, null);
        }

        /* renamed from: b */
        public final C12138a m16857b() {
            return this;
        }

        /* renamed from: c */
        public final String m16858c() {
            return this.f14496a;
        }

        /* renamed from: d */
        public final tg9 m16859d() {
            return this.f14497b;
        }

        /* renamed from: e */
        public final gk8 m16860e() {
            return this.f14498c;
        }

        /* renamed from: f */
        public final int m16861f() {
            return this.f14499d;
        }

        /* renamed from: g */
        public final String m16862g() {
            return this.f14500e;
        }

        /* renamed from: h */
        public final int m16863h() {
            return this.f14501f;
        }

        /* renamed from: i */
        public final void m16864i(String str) {
            this.f14496a = str;
        }

        /* renamed from: j */
        public final void m16865j(tg9 tg9Var) {
            this.f14497b = tg9Var;
        }

        /* renamed from: k */
        public final void m16866k(gk8 gk8Var) {
            this.f14498c = gk8Var;
        }

        /* renamed from: l */
        public final void m16867l(int i) {
            this.f14499d = i;
        }

        /* renamed from: m */
        public final void m16868m(String str) {
            this.f14500e = str;
        }

        /* renamed from: n */
        public final void m16869n(int i) {
            this.f14501f = i;
        }
    }

    /* renamed from: o.aca$b */
    public static final class C12139b {
        public C12139b() {
        }

        public /* synthetic */ C12139b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ aca(C12138a c12138a, id5 id5Var) {
        this(c12138a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aca.class != obj.getClass()) {
            return false;
        }
        aca acaVar = (aca) obj;
        return sq8.m48644c(this.f14490a, acaVar.f14490a) && sq8.m48644c(this.f14491b, acaVar.f14491b) && sq8.m48644c(this.f14492c, acaVar.f14492c) && this.f14493d == acaVar.f14493d && sq8.m48644c(this.f14494e, acaVar.f14494e) && this.f14495f == acaVar.f14495f;
    }

    public int hashCode() {
        String str = this.f14490a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        tg9 tg9Var = this.f14491b;
        int iHashCode2 = (iHashCode + (tg9Var != null ? tg9Var.hashCode() : 0)) * 31;
        gk8 gk8Var = this.f14492c;
        int iHashCode3 = (((iHashCode2 + (gk8Var != null ? gk8Var.hashCode() : 0)) * 31) + this.f14493d) * 31;
        String str2 = this.f14494e;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f14495f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LexiconAttributes(");
        sb.append("alphabet=" + this.f14490a + ',');
        sb.append("languageCode=" + this.f14491b + ',');
        sb.append("lastModified=" + this.f14492c + ',');
        sb.append("lexemesCount=" + this.f14493d + ',');
        sb.append("lexiconArn=" + this.f14494e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("size=");
        sb2.append(this.f14495f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public aca(C12138a c12138a) {
        this.f14490a = c12138a.m16858c();
        this.f14491b = c12138a.m16859d();
        this.f14492c = c12138a.m16860e();
        this.f14493d = c12138a.m16861f();
        this.f14494e = c12138a.m16862g();
        this.f14495f = c12138a.m16863h();
    }
}
