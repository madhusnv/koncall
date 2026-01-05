package p001o;

/* loaded from: classes3.dex */
public final class fr6 {

    /* renamed from: h */
    public static final C13537b f23965h = new C13537b(null);

    /* renamed from: a */
    public final gl1 f23966a;

    /* renamed from: b */
    public final Float f23967b;

    /* renamed from: c */
    public final String f23968c;

    /* renamed from: d */
    public final String f23969d;

    /* renamed from: e */
    public final String f23970e;

    /* renamed from: f */
    public final String f23971f;

    /* renamed from: g */
    public final String f23972g;

    /* renamed from: o.fr6$a */
    public static final class C13536a {

        /* renamed from: a */
        public gl1 f23973a;

        /* renamed from: b */
        public Float f23974b;

        /* renamed from: c */
        public String f23975c;

        /* renamed from: d */
        public String f23976d;

        /* renamed from: e */
        public String f23977e;

        /* renamed from: f */
        public String f23978f;

        /* renamed from: g */
        public String f23979g;

        /* renamed from: a */
        public final fr6 m27381a() {
            return new fr6(this, null);
        }

        /* renamed from: b */
        public final C13536a m27382b() {
            return this;
        }

        /* renamed from: c */
        public final gl1 m27383c() {
            return this.f23973a;
        }

        /* renamed from: d */
        public final Float m27384d() {
            return this.f23974b;
        }

        /* renamed from: e */
        public final String m27385e() {
            return this.f23975c;
        }

        /* renamed from: f */
        public final String m27386f() {
            return this.f23976d;
        }

        /* renamed from: g */
        public final String m27387g() {
            return this.f23977e;
        }

        /* renamed from: h */
        public final String m27388h() {
            return this.f23978f;
        }

        /* renamed from: i */
        public final String m27389i() {
            return this.f23979g;
        }

        /* renamed from: j */
        public final void m27390j(gl1 gl1Var) {
            this.f23973a = gl1Var;
        }

        /* renamed from: k */
        public final void m27391k(Float f) {
            this.f23974b = f;
        }

        /* renamed from: l */
        public final void m27392l(String str) {
            this.f23975c = str;
        }

        /* renamed from: m */
        public final void m27393m(String str) {
            this.f23976d = str;
        }

        /* renamed from: n */
        public final void m27394n(String str) {
            this.f23977e = str;
        }

        /* renamed from: o */
        public final void m27395o(String str) {
            this.f23978f = str;
        }

        /* renamed from: p */
        public final void m27396p(String str) {
            this.f23979g = str;
        }
    }

    /* renamed from: o.fr6$b */
    public static final class C13537b {
        public C13537b() {
        }

        public /* synthetic */ C13537b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ fr6(C13536a c13536a, id5 id5Var) {
        this(c13536a);
    }

    /* renamed from: a */
    public final gl1 m27379a() {
        return this.f23966a;
    }

    /* renamed from: b */
    public final String m27380b() {
        return this.f23968c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fr6.class != obj.getClass()) {
            return false;
        }
        fr6 fr6Var = (fr6) obj;
        if (!sq8.m48644c(this.f23966a, fr6Var.f23966a)) {
            return false;
        }
        Float f = this.f23967b;
        return (f != null ? f.equals(fr6Var.f23967b) : fr6Var.f23967b == null) && sq8.m48644c(this.f23968c, fr6Var.f23968c) && sq8.m48644c(this.f23969d, fr6Var.f23969d) && sq8.m48644c(this.f23970e, fr6Var.f23970e) && sq8.m48644c(this.f23971f, fr6Var.f23971f) && sq8.m48644c(this.f23972g, fr6Var.f23972g);
    }

    public int hashCode() {
        gl1 gl1Var = this.f23966a;
        int iHashCode = (gl1Var != null ? gl1Var.hashCode() : 0) * 31;
        Float f = this.f23967b;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 31;
        String str = this.f23968c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23969d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23970e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f23971f;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23972g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Face(");
        sb.append("boundingBox=" + this.f23966a + ',');
        sb.append("confidence=" + this.f23967b + ',');
        sb.append("externalImageId=" + this.f23968c + ',');
        sb.append("faceId=" + this.f23969d + ',');
        sb.append("imageId=" + this.f23970e + ',');
        sb.append("indexFacesModelVersion=" + this.f23971f + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("userId=");
        sb2.append(this.f23972g);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fr6(C13536a c13536a) {
        this.f23966a = c13536a.m27383c();
        this.f23967b = c13536a.m27384d();
        this.f23968c = c13536a.m27385e();
        this.f23969d = c13536a.m27386f();
        this.f23970e = c13536a.m27387g();
        this.f23971f = c13536a.m27388h();
        this.f23972g = c13536a.m27389i();
    }
}
