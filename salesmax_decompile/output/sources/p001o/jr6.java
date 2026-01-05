package p001o;

/* loaded from: classes3.dex */
public final class jr6 {

    /* renamed from: c */
    public static final C14640b f30995c = new C14640b(null);

    /* renamed from: a */
    public final fr6 f30996a;

    /* renamed from: b */
    public final Float f30997b;

    /* renamed from: o.jr6$a */
    public static final class C14639a {

        /* renamed from: a */
        public fr6 f30998a;

        /* renamed from: b */
        public Float f30999b;

        /* renamed from: a */
        public final jr6 m34383a() {
            return new jr6(this, null);
        }

        /* renamed from: b */
        public final C14639a m34384b() {
            return this;
        }

        /* renamed from: c */
        public final fr6 m34385c() {
            return this.f30998a;
        }

        /* renamed from: d */
        public final Float m34386d() {
            return this.f30999b;
        }

        /* renamed from: e */
        public final void m34387e(fr6 fr6Var) {
            this.f30998a = fr6Var;
        }

        /* renamed from: f */
        public final void m34388f(Float f) {
            this.f30999b = f;
        }
    }

    /* renamed from: o.jr6$b */
    public static final class C14640b {
        public C14640b() {
        }

        public /* synthetic */ C14640b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jr6(C14639a c14639a, id5 id5Var) {
        this(c14639a);
    }

    /* renamed from: a */
    public final fr6 m34381a() {
        return this.f30996a;
    }

    /* renamed from: b */
    public final Float m34382b() {
        return this.f30997b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jr6.class != obj.getClass()) {
            return false;
        }
        jr6 jr6Var = (jr6) obj;
        if (!sq8.m48644c(this.f30996a, jr6Var.f30996a)) {
            return false;
        }
        Float f = this.f30997b;
        Float f2 = jr6Var.f30997b;
        return f != null ? f.equals(f2) : f2 == null;
    }

    public int hashCode() {
        fr6 fr6Var = this.f30996a;
        int iHashCode = (fr6Var != null ? fr6Var.hashCode() : 0) * 31;
        Float f = this.f30997b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FaceMatch(");
        sb.append("face=" + this.f30996a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("similarity=");
        sb2.append(this.f30997b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jr6(C14639a c14639a) {
        this.f30996a = c14639a.m34385c();
        this.f30997b = c14639a.m34386d();
    }
}
