package p001o;

/* loaded from: classes3.dex */
public final class nwf {

    /* renamed from: c */
    public static final C15677b f37363c = new C15677b(null);

    /* renamed from: a */
    public final Float f37364a;

    /* renamed from: b */
    public final boolean f37365b;

    /* renamed from: o.nwf$a */
    public static final class C15676a {

        /* renamed from: a */
        public Float f37366a;

        /* renamed from: b */
        public boolean f37367b;

        /* renamed from: a */
        public final nwf m41190a() {
            return new nwf(this, null);
        }

        /* renamed from: b */
        public final C15676a m41191b() {
            return this;
        }

        /* renamed from: c */
        public final Float m41192c() {
            return this.f37366a;
        }

        /* renamed from: d */
        public final boolean m41193d() {
            return this.f37367b;
        }

        /* renamed from: e */
        public final void m41194e(Float f) {
            this.f37366a = f;
        }

        /* renamed from: f */
        public final void m41195f(boolean z) {
            this.f37367b = z;
        }
    }

    /* renamed from: o.nwf$b */
    public static final class C15677b {
        public C15677b() {
        }

        public /* synthetic */ C15677b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ nwf(C15676a c15676a, id5 id5Var) {
        this(c15676a);
    }

    /* renamed from: a */
    public final Float m41188a() {
        return this.f37364a;
    }

    /* renamed from: b */
    public final boolean m41189b() {
        return this.f37365b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nwf.class != obj.getClass()) {
            return false;
        }
        nwf nwfVar = (nwf) obj;
        Float f = this.f37364a;
        return (f != null ? f.equals(nwfVar.f37364a) : nwfVar.f37364a == null) && this.f37365b == nwfVar.f37365b;
    }

    public int hashCode() {
        Float f = this.f37364a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f37365b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Smile(");
        sb.append("confidence=" + this.f37364a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f37365b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public nwf(C15676a c15676a) {
        this.f37364a = c15676a.m41192c();
        this.f37365b = c15676a.m41193d();
    }
}
