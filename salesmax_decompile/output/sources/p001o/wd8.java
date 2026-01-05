package p001o;

/* loaded from: classes3.dex */
public final class wd8 {

    /* renamed from: c */
    public static final C17821b f51808c = new C17821b(null);

    /* renamed from: a */
    public final Float f51809a;

    /* renamed from: b */
    public final Float f51810b;

    /* renamed from: o.wd8$a */
    public static final class C17820a {

        /* renamed from: a */
        public Float f51811a;

        /* renamed from: b */
        public Float f51812b;

        /* renamed from: a */
        public final wd8 m54233a() {
            return new wd8(this, null);
        }

        /* renamed from: b */
        public final C17820a m54234b() {
            return this;
        }

        /* renamed from: c */
        public final Float m54235c() {
            return this.f51811a;
        }

        /* renamed from: d */
        public final Float m54236d() {
            return this.f51812b;
        }

        /* renamed from: e */
        public final void m54237e(Float f) {
            this.f51811a = f;
        }

        /* renamed from: f */
        public final void m54238f(Float f) {
            this.f51812b = f;
        }
    }

    /* renamed from: o.wd8$b */
    public static final class C17821b {
        public C17821b() {
        }

        public /* synthetic */ C17821b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wd8(C17820a c17820a, id5 id5Var) {
        this(c17820a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wd8.class != obj.getClass()) {
            return false;
        }
        wd8 wd8Var = (wd8) obj;
        Float f = this.f51809a;
        if (!(f != null ? f.equals(wd8Var.f51809a) : wd8Var.f51809a == null)) {
            return false;
        }
        Float f2 = this.f51810b;
        Float f3 = wd8Var.f51810b;
        return f2 != null ? f2.equals(f3) : f3 == null;
    }

    public int hashCode() {
        Float f = this.f51809a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f51810b;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImageQuality(");
        sb.append("brightness=" + this.f51809a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sharpness=");
        sb2.append(this.f51810b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wd8(C17820a c17820a) {
        this.f51809a = c17820a.m54235c();
        this.f51810b = c17820a.m54236d();
    }
}
