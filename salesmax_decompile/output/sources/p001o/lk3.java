package p001o;

/* loaded from: classes3.dex */
public final class lk3 {

    /* renamed from: d */
    public static final C15089b f33929d = new C15089b(null);

    /* renamed from: a */
    public final Float f33930a;

    /* renamed from: b */
    public final fc8 f33931b;

    /* renamed from: c */
    public final fc8 f33932c;

    /* renamed from: o.lk3$a */
    public static final class C15088a {

        /* renamed from: a */
        public Float f33933a;

        /* renamed from: b */
        public fc8 f33934b;

        /* renamed from: c */
        public fc8 f33935c;

        /* renamed from: a */
        public final lk3 m37358a() {
            return new lk3(this, null);
        }

        /* renamed from: b */
        public final a4e m37359b() {
            return null;
        }

        /* renamed from: c */
        public final Float m37360c() {
            return this.f33933a;
        }

        /* renamed from: d */
        public final fc8 m37361d() {
            return this.f33934b;
        }

        /* renamed from: e */
        public final fc8 m37362e() {
            return this.f33935c;
        }

        /* renamed from: f */
        public final void m37363f(Float f) {
            this.f33933a = f;
        }

        /* renamed from: g */
        public final void m37364g(fc8 fc8Var) {
            this.f33934b = fc8Var;
        }

        /* renamed from: h */
        public final void m37365h(fc8 fc8Var) {
            this.f33935c = fc8Var;
        }
    }

    /* renamed from: o.lk3$b */
    public static final class C15089b {
        public C15089b() {
        }

        public /* synthetic */ C15089b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final lk3 m37366a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15088a c15088a = new C15088a();
            xk7Var.invoke(c15088a);
            return c15088a.m37358a();
        }
    }

    public /* synthetic */ lk3(C15088a c15088a, id5 id5Var) {
        this(c15088a);
    }

    /* renamed from: a */
    public final a4e m37354a() {
        return null;
    }

    /* renamed from: b */
    public final Float m37355b() {
        return this.f33930a;
    }

    /* renamed from: c */
    public final fc8 m37356c() {
        return this.f33931b;
    }

    /* renamed from: d */
    public final fc8 m37357d() {
        return this.f33932c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lk3.class != obj.getClass()) {
            return false;
        }
        lk3 lk3Var = (lk3) obj;
        if (!sq8.m48644c(null, null)) {
            return false;
        }
        Float f = this.f33930a;
        return (f != null ? f.equals(lk3Var.f33930a) : lk3Var.f33930a == null) && sq8.m48644c(this.f33931b, lk3Var.f33931b) && sq8.m48644c(this.f33932c, lk3Var.f33932c);
    }

    public int hashCode() {
        Float f = this.f33930a;
        int iHashCode = ((f != null ? f.hashCode() : 0) + 0) * 31;
        fc8 fc8Var = this.f33931b;
        int iHashCode2 = (iHashCode + (fc8Var != null ? fc8Var.hashCode() : 0)) * 31;
        fc8 fc8Var2 = this.f33932c;
        return iHashCode2 + (fc8Var2 != null ? fc8Var2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompareFacesRequest(");
        sb.append("qualityFilter=" + ((Object) null) + ',');
        sb.append("similarityThreshold=" + this.f33930a + ',');
        sb.append("sourceImage=" + this.f33931b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("targetImage=");
        sb2.append(this.f33932c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lk3(C15088a c15088a) {
        c15088a.m37359b();
        this.f33930a = c15088a.m37360c();
        this.f33931b = c15088a.m37361d();
        this.f33932c = c15088a.m37362e();
    }
}
