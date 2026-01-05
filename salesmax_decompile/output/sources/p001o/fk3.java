package p001o;

/* loaded from: classes3.dex */
public final class fk3 {

    /* renamed from: c */
    public static final C13470b f23544c = new C13470b(null);

    /* renamed from: a */
    public final ok3 f23545a;

    /* renamed from: b */
    public final Float f23546b;

    /* renamed from: o.fk3$a */
    public static final class C13469a {

        /* renamed from: a */
        public ok3 f23547a;

        /* renamed from: b */
        public Float f23548b;

        /* renamed from: a */
        public final fk3 m26951a() {
            return new fk3(this, null);
        }

        /* renamed from: b */
        public final C13469a m26952b() {
            return this;
        }

        /* renamed from: c */
        public final ok3 m26953c() {
            return this.f23547a;
        }

        /* renamed from: d */
        public final Float m26954d() {
            return this.f23548b;
        }

        /* renamed from: e */
        public final void m26955e(ok3 ok3Var) {
            this.f23547a = ok3Var;
        }

        /* renamed from: f */
        public final void m26956f(Float f) {
            this.f23548b = f;
        }
    }

    /* renamed from: o.fk3$b */
    public static final class C13470b {
        public C13470b() {
        }

        public /* synthetic */ C13470b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fk3(C13469a c13469a, id5 id5Var) {
        this(c13469a);
    }

    /* renamed from: a */
    public final Float m26950a() {
        return this.f23546b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fk3.class != obj.getClass()) {
            return false;
        }
        fk3 fk3Var = (fk3) obj;
        if (!sq8.m48644c(this.f23545a, fk3Var.f23545a)) {
            return false;
        }
        Float f = this.f23546b;
        Float f2 = fk3Var.f23546b;
        return f != null ? f.equals(f2) : f2 == null;
    }

    public int hashCode() {
        ok3 ok3Var = this.f23545a;
        int iHashCode = (ok3Var != null ? ok3Var.hashCode() : 0) * 31;
        Float f = this.f23546b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompareFacesMatch(");
        sb.append("face=" + this.f23545a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("similarity=");
        sb2.append(this.f23546b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fk3(C13469a c13469a) {
        this.f23545a = c13469a.m26953c();
        this.f23546b = c13469a.m26954d();
    }
}
