package p001o;

/* loaded from: classes3.dex */
public final class br6 {

    /* renamed from: c */
    public static final C12480b f16725c = new C12480b(null);

    /* renamed from: a */
    public final Float f16726a;

    /* renamed from: b */
    public final boolean f16727b;

    /* renamed from: o.br6$a */
    public static final class C12479a {

        /* renamed from: a */
        public Float f16728a;

        /* renamed from: b */
        public boolean f16729b;

        /* renamed from: a */
        public final br6 m19628a() {
            return new br6(this, null);
        }

        /* renamed from: b */
        public final C12479a m19629b() {
            return this;
        }

        /* renamed from: c */
        public final Float m19630c() {
            return this.f16728a;
        }

        /* renamed from: d */
        public final boolean m19631d() {
            return this.f16729b;
        }

        /* renamed from: e */
        public final void m19632e(Float f) {
            this.f16728a = f;
        }

        /* renamed from: f */
        public final void m19633f(boolean z) {
            this.f16729b = z;
        }
    }

    /* renamed from: o.br6$b */
    public static final class C12480b {
        public C12480b() {
        }

        public /* synthetic */ C12480b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ br6(C12479a c12479a, id5 id5Var) {
        this(c12479a);
    }

    /* renamed from: a */
    public final Float m19626a() {
        return this.f16726a;
    }

    /* renamed from: b */
    public final boolean m19627b() {
        return this.f16727b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || br6.class != obj.getClass()) {
            return false;
        }
        br6 br6Var = (br6) obj;
        Float f = this.f16726a;
        return (f != null ? f.equals(br6Var.f16726a) : br6Var.f16726a == null) && this.f16727b == br6Var.f16727b;
    }

    public int hashCode() {
        Float f = this.f16726a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f16727b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EyeOpen(");
        sb.append("confidence=" + this.f16726a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f16727b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public br6(C12479a c12479a) {
        this.f16726a = c12479a.m19630c();
        this.f16727b = c12479a.m19631d();
    }
}
