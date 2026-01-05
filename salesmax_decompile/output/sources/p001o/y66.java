package p001o;

/* loaded from: classes3.dex */
public final class y66 {

    /* renamed from: f */
    public static final C18343a f54989f = new C18343a(null);

    /* renamed from: g */
    public static final y66 f54990g = new y66("", "", m76.f34923a.m38479a());

    /* renamed from: a */
    public final String f54991a;

    /* renamed from: b */
    public final String f54992b;

    /* renamed from: c */
    public final m76 f54993c;

    /* renamed from: d */
    public final boolean f54994d;

    /* renamed from: e */
    public final boolean f54995e;

    /* renamed from: o.y66$a */
    public static final class C18343a {
        public C18343a() {
        }

        public /* synthetic */ C18343a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final y66 m57315a() {
            return y66.f54990g;
        }
    }

    public y66(String str, String str2, m76 m76Var) {
        sq8.m48649h(str, "decoded");
        sq8.m48649h(str2, "encoded");
        sq8.m48649h(m76Var, "encoding");
        this.f54991a = str;
        this.f54992b = str2;
        this.f54993c = m76Var;
        boolean z = false;
        if (str.length() == 0) {
            if (str2.length() == 0) {
                z = true;
            }
        }
        this.f54994d = z;
        this.f54995e = !z;
    }

    /* renamed from: b */
    public final String m57310b() {
        return this.f54991a;
    }

    /* renamed from: c */
    public final String m57311c() {
        return this.f54992b;
    }

    /* renamed from: d */
    public final boolean m57312d() {
        return this.f54994d;
    }

    /* renamed from: e */
    public final boolean m57313e() {
        return this.f54995e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y66)) {
            return false;
        }
        y66 y66Var = (y66) obj;
        return sq8.m48644c(this.f54991a, y66Var.f54991a) && sq8.m48644c(this.f54992b, y66Var.f54992b);
    }

    /* renamed from: f */
    public final y66 m57314f(m76 m76Var) {
        sq8.m48649h(m76Var, "newEncoding");
        return m76Var.mo24242b(this.f54991a);
    }

    public int hashCode() {
        return (this.f54991a.hashCode() * 31) + this.f54992b.hashCode();
    }

    public String toString() {
        String str = "Encodable(decoded=" + this.f54991a + ", encoded=" + this.f54992b + ", encoding=" + this.f54993c.getName() + ")";
        sq8.m48648g(str, "toString(...)");
        return str;
    }
}
