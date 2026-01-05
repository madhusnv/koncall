package p001o;

/* loaded from: classes3.dex */
public final class og9 {

    /* renamed from: d */
    public static final C15798b f38331d = new C15798b(null);

    /* renamed from: a */
    public final qg9 f38332a;

    /* renamed from: b */
    public final Float f38333b;

    /* renamed from: c */
    public final Float f38334c;

    /* renamed from: o.og9$a */
    public static final class C15797a {

        /* renamed from: a */
        public qg9 f38335a;

        /* renamed from: b */
        public Float f38336b;

        /* renamed from: c */
        public Float f38337c;

        /* renamed from: a */
        public final og9 m42217a() {
            return new og9(this, null);
        }

        /* renamed from: b */
        public final C15797a m42218b() {
            return this;
        }

        /* renamed from: c */
        public final qg9 m42219c() {
            return this.f38335a;
        }

        /* renamed from: d */
        public final Float m42220d() {
            return this.f38336b;
        }

        /* renamed from: e */
        public final Float m42221e() {
            return this.f38337c;
        }

        /* renamed from: f */
        public final void m42222f(qg9 qg9Var) {
            this.f38335a = qg9Var;
        }

        /* renamed from: g */
        public final void m42223g(Float f) {
            this.f38336b = f;
        }

        /* renamed from: h */
        public final void m42224h(Float f) {
            this.f38337c = f;
        }
    }

    /* renamed from: o.og9$b */
    public static final class C15798b {
        public C15798b() {
        }

        public /* synthetic */ C15798b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ og9(C15797a c15797a, id5 id5Var) {
        this(c15797a);
    }

    /* renamed from: a */
    public final qg9 m42214a() {
        return this.f38332a;
    }

    /* renamed from: b */
    public final Float m42215b() {
        return this.f38333b;
    }

    /* renamed from: c */
    public final Float m42216c() {
        return this.f38334c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || og9.class != obj.getClass()) {
            return false;
        }
        og9 og9Var = (og9) obj;
        if (!sq8.m48644c(this.f38332a, og9Var.f38332a)) {
            return false;
        }
        Float f = this.f38333b;
        if (!(f != null ? f.equals(og9Var.f38333b) : og9Var.f38333b == null)) {
            return false;
        }
        Float f2 = this.f38334c;
        Float f3 = og9Var.f38334c;
        return f2 != null ? f2.equals(f3) : f3 == null;
    }

    public int hashCode() {
        qg9 qg9Var = this.f38332a;
        int iHashCode = (qg9Var != null ? qg9Var.hashCode() : 0) * 31;
        Float f = this.f38333b;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.f38334c;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Landmark(");
        sb.append("type=" + this.f38332a + ',');
        sb.append("x=" + this.f38333b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("y=");
        sb2.append(this.f38334c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public og9(C15797a c15797a) {
        this.f38332a = c15797a.m42219c();
        this.f38333b = c15797a.m42220d();
        this.f38334c = c15797a.m42221e();
    }
}
