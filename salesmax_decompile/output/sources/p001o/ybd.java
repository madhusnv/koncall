package p001o;

/* loaded from: classes3.dex */
public final class ybd {

    /* renamed from: c */
    public static final C18373b f55189c = new C18373b(null);

    /* renamed from: a */
    public final Float f55190a;

    /* renamed from: b */
    public final Float f55191b;

    /* renamed from: o.ybd$a */
    public static final class C18372a {

        /* renamed from: a */
        public Float f55192a;

        /* renamed from: b */
        public Float f55193b;

        /* renamed from: a */
        public final ybd m57465a() {
            return new ybd(this, null);
        }

        /* renamed from: b */
        public final C18372a m57466b() {
            return this;
        }

        /* renamed from: c */
        public final Float m57467c() {
            return this.f55192a;
        }

        /* renamed from: d */
        public final Float m57468d() {
            return this.f55193b;
        }

        /* renamed from: e */
        public final void m57469e(Float f) {
            this.f55192a = f;
        }

        /* renamed from: f */
        public final void m57470f(Float f) {
            this.f55193b = f;
        }
    }

    /* renamed from: o.ybd$b */
    public static final class C18373b {
        public C18373b() {
        }

        public /* synthetic */ C18373b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ybd(C18372a c18372a, id5 id5Var) {
        this(c18372a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ybd.class != obj.getClass()) {
            return false;
        }
        ybd ybdVar = (ybd) obj;
        Float f = this.f55190a;
        if (!(f != null ? f.equals(ybdVar.f55190a) : ybdVar.f55190a == null)) {
            return false;
        }
        Float f2 = this.f55191b;
        Float f3 = ybdVar.f55191b;
        return f2 != null ? f2.equals(f3) : f3 == null;
    }

    public int hashCode() {
        Float f = this.f55190a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f55191b;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point(");
        sb.append("x=" + this.f55190a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("y=");
        sb2.append(this.f55191b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ybd(C18372a c18372a) {
        this.f55190a = c18372a.m57467c();
        this.f55191b = c18372a.m57468d();
    }
}
