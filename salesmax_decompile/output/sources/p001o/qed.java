package p001o;

/* loaded from: classes3.dex */
public final class qed {

    /* renamed from: d */
    public static final C16367b f41794d = new C16367b(null);

    /* renamed from: a */
    public final Float f41795a;

    /* renamed from: b */
    public final Float f41796b;

    /* renamed from: c */
    public final Float f41797c;

    /* renamed from: o.qed$a */
    public static final class C16366a {

        /* renamed from: a */
        public Float f41798a;

        /* renamed from: b */
        public Float f41799b;

        /* renamed from: c */
        public Float f41800c;

        /* renamed from: a */
        public final qed m45294a() {
            return new qed(this, null);
        }

        /* renamed from: b */
        public final C16366a m45295b() {
            return this;
        }

        /* renamed from: c */
        public final Float m45296c() {
            return this.f41798a;
        }

        /* renamed from: d */
        public final Float m45297d() {
            return this.f41799b;
        }

        /* renamed from: e */
        public final Float m45298e() {
            return this.f41800c;
        }

        /* renamed from: f */
        public final void m45299f(Float f) {
            this.f41798a = f;
        }

        /* renamed from: g */
        public final void m45300g(Float f) {
            this.f41799b = f;
        }

        /* renamed from: h */
        public final void m45301h(Float f) {
            this.f41800c = f;
        }
    }

    /* renamed from: o.qed$b */
    public static final class C16367b {
        public C16367b() {
        }

        public /* synthetic */ C16367b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qed(C16366a c16366a, id5 id5Var) {
        this(c16366a);
    }

    /* renamed from: a */
    public final Float m45291a() {
        return this.f41795a;
    }

    /* renamed from: b */
    public final Float m45292b() {
        return this.f41796b;
    }

    /* renamed from: c */
    public final Float m45293c() {
        return this.f41797c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qed.class != obj.getClass()) {
            return false;
        }
        qed qedVar = (qed) obj;
        Float f = this.f41795a;
        if (!(f != null ? f.equals(qedVar.f41795a) : qedVar.f41795a == null)) {
            return false;
        }
        Float f2 = this.f41796b;
        if (!(f2 != null ? f2.equals(qedVar.f41796b) : qedVar.f41796b == null)) {
            return false;
        }
        Float f3 = this.f41797c;
        Float f4 = qedVar.f41797c;
        return f3 != null ? f3.equals(f4) : f4 == null;
    }

    public int hashCode() {
        Float f = this.f41795a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f41796b;
        int iHashCode2 = (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f41797c;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pose(");
        sb.append("pitch=" + this.f41795a + ',');
        sb.append("roll=" + this.f41796b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("yaw=");
        sb2.append(this.f41797c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qed(C16366a c16366a) {
        this.f41795a = c16366a.m45296c();
        this.f41796b = c16366a.m45297d();
        this.f41797c = c16366a.m45298e();
    }
}
