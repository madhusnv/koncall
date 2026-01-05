package p001o;

/* loaded from: classes3.dex */
public final class yf1 {

    /* renamed from: c */
    public static final C18393b f55388c = new C18393b(null);

    /* renamed from: a */
    public final Float f55389a;

    /* renamed from: b */
    public final boolean f55390b;

    /* renamed from: o.yf1$a */
    public static final class C18392a {

        /* renamed from: a */
        public Float f55391a;

        /* renamed from: b */
        public boolean f55392b;

        /* renamed from: a */
        public final yf1 m57711a() {
            return new yf1(this, null);
        }

        /* renamed from: b */
        public final C18392a m57712b() {
            return this;
        }

        /* renamed from: c */
        public final Float m57713c() {
            return this.f55391a;
        }

        /* renamed from: d */
        public final boolean m57714d() {
            return this.f55392b;
        }

        /* renamed from: e */
        public final void m57715e(Float f) {
            this.f55391a = f;
        }

        /* renamed from: f */
        public final void m57716f(boolean z) {
            this.f55392b = z;
        }
    }

    /* renamed from: o.yf1$b */
    public static final class C18393b {
        public C18393b() {
        }

        public /* synthetic */ C18393b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yf1(C18392a c18392a, id5 id5Var) {
        this(c18392a);
    }

    /* renamed from: a */
    public final Float m57709a() {
        return this.f55389a;
    }

    /* renamed from: b */
    public final boolean m57710b() {
        return this.f55390b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yf1.class != obj.getClass()) {
            return false;
        }
        yf1 yf1Var = (yf1) obj;
        Float f = this.f55389a;
        return (f != null ? f.equals(yf1Var.f55389a) : yf1Var.f55389a == null) && this.f55390b == yf1Var.f55390b;
    }

    public int hashCode() {
        Float f = this.f55389a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f55390b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Beard(");
        sb.append("confidence=" + this.f55389a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f55390b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yf1(C18392a c18392a) {
        this.f55389a = c18392a.m57713c();
        this.f55390b = c18392a.m57714d();
    }
}
