package p001o;

/* loaded from: classes3.dex */
public final class dr6 {

    /* renamed from: c */
    public static final C13020b f20443c = new C13020b(null);

    /* renamed from: a */
    public final Float f20444a;

    /* renamed from: b */
    public final boolean f20445b;

    /* renamed from: o.dr6$a */
    public static final class C13019a {

        /* renamed from: a */
        public Float f20446a;

        /* renamed from: b */
        public boolean f20447b;

        /* renamed from: a */
        public final dr6 m23697a() {
            return new dr6(this, null);
        }

        /* renamed from: b */
        public final C13019a m23698b() {
            return this;
        }

        /* renamed from: c */
        public final Float m23699c() {
            return this.f20446a;
        }

        /* renamed from: d */
        public final boolean m23700d() {
            return this.f20447b;
        }

        /* renamed from: e */
        public final void m23701e(Float f) {
            this.f20446a = f;
        }

        /* renamed from: f */
        public final void m23702f(boolean z) {
            this.f20447b = z;
        }
    }

    /* renamed from: o.dr6$b */
    public static final class C13020b {
        public C13020b() {
        }

        public /* synthetic */ C13020b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ dr6(C13019a c13019a, id5 id5Var) {
        this(c13019a);
    }

    /* renamed from: a */
    public final Float m23695a() {
        return this.f20444a;
    }

    /* renamed from: b */
    public final boolean m23696b() {
        return this.f20445b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dr6.class != obj.getClass()) {
            return false;
        }
        dr6 dr6Var = (dr6) obj;
        Float f = this.f20444a;
        return (f != null ? f.equals(dr6Var.f20444a) : dr6Var.f20444a == null) && this.f20445b == dr6Var.f20445b;
    }

    public int hashCode() {
        Float f = this.f20444a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f20445b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Eyeglasses(");
        sb.append("confidence=" + this.f20444a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f20445b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public dr6(C13019a c13019a) {
        this.f20444a = c13019a.m23699c();
        this.f20445b = c13019a.m23700d();
    }
}
