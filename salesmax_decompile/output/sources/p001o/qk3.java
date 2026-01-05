package p001o;

/* loaded from: classes3.dex */
public final class qk3 {

    /* renamed from: c */
    public static final C16416b f42087c = new C16416b(null);

    /* renamed from: a */
    public final gl1 f42088a;

    /* renamed from: b */
    public final Float f42089b;

    /* renamed from: o.qk3$a */
    public static final class C16415a {

        /* renamed from: a */
        public gl1 f42090a;

        /* renamed from: b */
        public Float f42091b;

        /* renamed from: a */
        public final qk3 m45572a() {
            return new qk3(this, null);
        }

        /* renamed from: b */
        public final C16415a m45573b() {
            return this;
        }

        /* renamed from: c */
        public final gl1 m45574c() {
            return this.f42090a;
        }

        /* renamed from: d */
        public final Float m45575d() {
            return this.f42091b;
        }

        /* renamed from: e */
        public final void m45576e(gl1 gl1Var) {
            this.f42090a = gl1Var;
        }

        /* renamed from: f */
        public final void m45577f(Float f) {
            this.f42091b = f;
        }
    }

    /* renamed from: o.qk3$b */
    public static final class C16416b {
        public C16416b() {
        }

        public /* synthetic */ C16416b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qk3(C16415a c16415a, id5 id5Var) {
        this(c16415a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qk3.class != obj.getClass()) {
            return false;
        }
        qk3 qk3Var = (qk3) obj;
        if (!sq8.m48644c(this.f42088a, qk3Var.f42088a)) {
            return false;
        }
        Float f = this.f42089b;
        Float f2 = qk3Var.f42089b;
        return f != null ? f.equals(f2) : f2 == null;
    }

    public int hashCode() {
        gl1 gl1Var = this.f42088a;
        int iHashCode = (gl1Var != null ? gl1Var.hashCode() : 0) * 31;
        Float f = this.f42089b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComparedSourceImageFace(");
        sb.append("boundingBox=" + this.f42088a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("confidence=");
        sb2.append(this.f42089b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qk3(C16415a c16415a) {
        this.f42088a = c16415a.m45574c();
        this.f42089b = c16415a.m45575d();
    }
}
