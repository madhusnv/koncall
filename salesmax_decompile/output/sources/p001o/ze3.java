package p001o;

/* loaded from: classes3.dex */
public final class ze3 {

    /* renamed from: d */
    public static final C18626b f57099d = new C18626b(null);

    /* renamed from: a */
    public final String f57100a;

    /* renamed from: b */
    public final xl5 f57101b;

    /* renamed from: c */
    public final String f57102c;

    /* renamed from: o.ze3$a */
    public static final class C18625a {

        /* renamed from: a */
        public String f57103a;

        /* renamed from: b */
        public xl5 f57104b;

        /* renamed from: c */
        public String f57105c;

        /* renamed from: a */
        public final ze3 m59326a() {
            return new ze3(this, null);
        }

        /* renamed from: b */
        public final C18625a m59327b() {
            return this;
        }

        /* renamed from: c */
        public final String m59328c() {
            return this.f57103a;
        }

        /* renamed from: d */
        public final xl5 m59329d() {
            return this.f57104b;
        }

        /* renamed from: e */
        public final String m59330e() {
            return this.f57105c;
        }

        /* renamed from: f */
        public final void m59331f(String str) {
            this.f57103a = str;
        }

        /* renamed from: g */
        public final void m59332g(xl5 xl5Var) {
            this.f57104b = xl5Var;
        }

        /* renamed from: h */
        public final void m59333h(String str) {
            this.f57105c = str;
        }
    }

    /* renamed from: o.ze3$b */
    public static final class C18626b {
        public C18626b() {
        }

        public /* synthetic */ C18626b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ze3(C18625a c18625a, id5 id5Var) {
        this(c18625a);
    }

    /* renamed from: a */
    public final String m59323a() {
        return this.f57100a;
    }

    /* renamed from: b */
    public final xl5 m59324b() {
        return this.f57101b;
    }

    /* renamed from: c */
    public final String m59325c() {
        return this.f57102c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ze3.class != obj.getClass()) {
            return false;
        }
        ze3 ze3Var = (ze3) obj;
        return sq8.m48644c(this.f57100a, ze3Var.f57100a) && sq8.m48644c(this.f57101b, ze3Var.f57101b) && sq8.m48644c(this.f57102c, ze3Var.f57102c);
    }

    public int hashCode() {
        String str = this.f57100a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        xl5 xl5Var = this.f57101b;
        int iHashCode2 = (iHashCode + (xl5Var != null ? xl5Var.hashCode() : 0)) * 31;
        String str2 = this.f57102c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CodeDeliveryDetailsType(");
        sb.append("attributeName=" + this.f57100a + ',');
        sb.append("deliveryMedium=" + this.f57101b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("destination=");
        sb2.append(this.f57102c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ze3(C18625a c18625a) {
        this.f57100a = c18625a.m59328c();
        this.f57101b = c18625a.m59329d();
        this.f57102c = c18625a.m59330e();
    }
}
