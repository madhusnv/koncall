package p001o;

/* loaded from: classes3.dex */
public final class gl1 {

    /* renamed from: e */
    public static final C13772b f25395e = new C13772b(null);

    /* renamed from: a */
    public final Float f25396a;

    /* renamed from: b */
    public final Float f25397b;

    /* renamed from: c */
    public final Float f25398c;

    /* renamed from: d */
    public final Float f25399d;

    /* renamed from: o.gl1$a */
    public static final class C13771a {

        /* renamed from: a */
        public Float f25400a;

        /* renamed from: b */
        public Float f25401b;

        /* renamed from: c */
        public Float f25402c;

        /* renamed from: d */
        public Float f25403d;

        /* renamed from: a */
        public final gl1 m28977a() {
            return new gl1(this, null);
        }

        /* renamed from: b */
        public final C13771a m28978b() {
            return this;
        }

        /* renamed from: c */
        public final Float m28979c() {
            return this.f25400a;
        }

        /* renamed from: d */
        public final Float m28980d() {
            return this.f25401b;
        }

        /* renamed from: e */
        public final Float m28981e() {
            return this.f25402c;
        }

        /* renamed from: f */
        public final Float m28982f() {
            return this.f25403d;
        }

        /* renamed from: g */
        public final void m28983g(Float f) {
            this.f25400a = f;
        }

        /* renamed from: h */
        public final void m28984h(Float f) {
            this.f25401b = f;
        }

        /* renamed from: i */
        public final void m28985i(Float f) {
            this.f25402c = f;
        }

        /* renamed from: j */
        public final void m28986j(Float f) {
            this.f25403d = f;
        }
    }

    /* renamed from: o.gl1$b */
    public static final class C13772b {
        public C13772b() {
        }

        public /* synthetic */ C13772b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gl1(C13771a c13771a, id5 id5Var) {
        this(c13771a);
    }

    /* renamed from: a */
    public final Float m28973a() {
        return this.f25396a;
    }

    /* renamed from: b */
    public final Float m28974b() {
        return this.f25397b;
    }

    /* renamed from: c */
    public final Float m28975c() {
        return this.f25398c;
    }

    /* renamed from: d */
    public final Float m28976d() {
        return this.f25399d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gl1.class != obj.getClass()) {
            return false;
        }
        gl1 gl1Var = (gl1) obj;
        Float f = this.f25396a;
        if (!(f != null ? f.equals(gl1Var.f25396a) : gl1Var.f25396a == null)) {
            return false;
        }
        Float f2 = this.f25397b;
        if (!(f2 != null ? f2.equals(gl1Var.f25397b) : gl1Var.f25397b == null)) {
            return false;
        }
        Float f3 = this.f25398c;
        if (!(f3 != null ? f3.equals(gl1Var.f25398c) : gl1Var.f25398c == null)) {
            return false;
        }
        Float f4 = this.f25399d;
        Float f5 = gl1Var.f25399d;
        return f4 != null ? f4.equals(f5) : f5 == null;
    }

    public int hashCode() {
        Float f = this.f25396a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f25397b;
        int iHashCode2 = (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f25398c;
        int iHashCode3 = (iHashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.f25399d;
        return iHashCode3 + (f4 != null ? f4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BoundingBox(");
        sb.append("height=" + this.f25396a + ',');
        sb.append("left=" + this.f25397b + ',');
        sb.append("top=" + this.f25398c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("width=");
        sb2.append(this.f25399d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gl1(C13771a c13771a) {
        this.f25396a = c13771a.m28979c();
        this.f25397b = c13771a.m28980d();
        this.f25398c = c13771a.m28981e();
        this.f25399d = c13771a.m28982f();
    }
}
