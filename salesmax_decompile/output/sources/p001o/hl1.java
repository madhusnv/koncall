package p001o;

/* loaded from: classes3.dex */
public final class hl1 {

    /* renamed from: e */
    public static final C13989b f27091e = new C13989b(null);

    /* renamed from: a */
    public final float f27092a;

    /* renamed from: b */
    public final float f27093b;

    /* renamed from: c */
    public final float f27094c;

    /* renamed from: d */
    public final float f27095d;

    /* renamed from: o.hl1$a */
    public static final class C13988a {

        /* renamed from: a */
        public float f27096a;

        /* renamed from: b */
        public float f27097b;

        /* renamed from: c */
        public float f27098c;

        /* renamed from: d */
        public float f27099d;

        /* renamed from: a */
        public final hl1 m30746a() {
            return new hl1(this, null);
        }

        /* renamed from: b */
        public final C13988a m30747b() {
            return this;
        }

        /* renamed from: c */
        public final float m30748c() {
            return this.f27096a;
        }

        /* renamed from: d */
        public final float m30749d() {
            return this.f27097b;
        }

        /* renamed from: e */
        public final float m30750e() {
            return this.f27098c;
        }

        /* renamed from: f */
        public final float m30751f() {
            return this.f27099d;
        }

        /* renamed from: g */
        public final void m30752g(float f) {
            this.f27096a = f;
        }

        /* renamed from: h */
        public final void m30753h(float f) {
            this.f27097b = f;
        }

        /* renamed from: i */
        public final void m30754i(float f) {
            this.f27098c = f;
        }

        /* renamed from: j */
        public final void m30755j(float f) {
            this.f27099d = f;
        }
    }

    /* renamed from: o.hl1$b */
    public static final class C13989b {
        public C13989b() {
        }

        public /* synthetic */ C13989b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hl1(C13988a c13988a, id5 id5Var) {
        this(c13988a);
    }

    /* renamed from: a */
    public final float m30742a() {
        return this.f27092a;
    }

    /* renamed from: b */
    public final float m30743b() {
        return this.f27093b;
    }

    /* renamed from: c */
    public final float m30744c() {
        return this.f27094c;
    }

    /* renamed from: d */
    public final float m30745d() {
        return this.f27095d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hl1.class != obj.getClass()) {
            return false;
        }
        hl1 hl1Var = (hl1) obj;
        return Float.valueOf(this.f27092a).equals(Float.valueOf(hl1Var.f27092a)) && Float.valueOf(this.f27093b).equals(Float.valueOf(hl1Var.f27093b)) && Float.valueOf(this.f27094c).equals(Float.valueOf(hl1Var.f27094c)) && Float.valueOf(this.f27095d).equals(Float.valueOf(hl1Var.f27095d));
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f27092a) * 31) + Float.hashCode(this.f27093b)) * 31) + Float.hashCode(this.f27094c)) * 31) + Float.hashCode(this.f27095d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BoundingBox(");
        sb.append("height=" + this.f27092a + ',');
        sb.append("left=" + this.f27093b + ',');
        sb.append("top=" + this.f27094c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("width=");
        sb2.append(this.f27095d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hl1(C13988a c13988a) {
        this.f27092a = c13988a.m30748c();
        this.f27093b = c13988a.m30749d();
        this.f27094c = c13988a.m30750e();
        this.f27095d = c13988a.m30751f();
    }
}
