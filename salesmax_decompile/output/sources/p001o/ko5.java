package p001o;

/* loaded from: classes3.dex */
public final class ko5 {

    /* renamed from: d */
    public static final C14891b f32494d = new C14891b(null);

    /* renamed from: a */
    public final Float f32495a;

    /* renamed from: b */
    public final Float f32496b;

    /* renamed from: c */
    public final Float f32497c;

    /* renamed from: o.ko5$a */
    public static final class C14890a {

        /* renamed from: a */
        public Float f32498a;

        /* renamed from: b */
        public Float f32499b;

        /* renamed from: c */
        public Float f32500c;

        /* renamed from: a */
        public final ko5 m35971a() {
            return new ko5(this, null);
        }

        /* renamed from: b */
        public final C14890a m35972b() {
            return this;
        }

        /* renamed from: c */
        public final Float m35973c() {
            return this.f32498a;
        }

        /* renamed from: d */
        public final Float m35974d() {
            return this.f32499b;
        }

        /* renamed from: e */
        public final Float m35975e() {
            return this.f32500c;
        }

        /* renamed from: f */
        public final void m35976f(Float f) {
            this.f32498a = f;
        }

        /* renamed from: g */
        public final void m35977g(Float f) {
            this.f32499b = f;
        }

        /* renamed from: h */
        public final void m35978h(Float f) {
            this.f32500c = f;
        }
    }

    /* renamed from: o.ko5$b */
    public static final class C14891b {
        public C14891b() {
        }

        public /* synthetic */ C14891b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ko5(C14890a c14890a, id5 id5Var) {
        this(c14890a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ko5.class != obj.getClass()) {
            return false;
        }
        ko5 ko5Var = (ko5) obj;
        Float f = this.f32495a;
        if (!(f != null ? f.equals(ko5Var.f32495a) : ko5Var.f32495a == null)) {
            return false;
        }
        Float f2 = this.f32496b;
        if (!(f2 != null ? f2.equals(ko5Var.f32496b) : ko5Var.f32496b == null)) {
            return false;
        }
        Float f3 = this.f32497c;
        Float f4 = ko5Var.f32497c;
        return f3 != null ? f3.equals(f4) : f4 == null;
    }

    public int hashCode() {
        Float f = this.f32495a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f32496b;
        int iHashCode2 = (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f32497c;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectLabelsImageQuality(");
        sb.append("brightness=" + this.f32495a + ',');
        sb.append("contrast=" + this.f32496b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sharpness=");
        sb2.append(this.f32497c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ko5(C14890a c14890a) {
        this.f32495a = c14890a.m35973c();
        this.f32496b = c14890a.m35974d();
        this.f32497c = c14890a.m35975e();
    }
}
