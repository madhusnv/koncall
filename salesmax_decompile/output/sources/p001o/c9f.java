package p001o;

/* loaded from: classes3.dex */
public final class c9f {

    /* renamed from: e */
    public static final C12594b f17546e = new C12594b(null);

    /* renamed from: a */
    public final String f17547a;

    /* renamed from: b */
    public final Float f17548b;

    /* renamed from: c */
    public final fc8 f17549c;

    /* renamed from: d */
    public final Integer f17550d;

    /* renamed from: o.c9f$a */
    public static final class C12593a {

        /* renamed from: a */
        public String f17551a;

        /* renamed from: b */
        public Float f17552b;

        /* renamed from: c */
        public fc8 f17553c;

        /* renamed from: d */
        public Integer f17554d;

        /* renamed from: a */
        public final c9f m20519a() {
            return new c9f(this, null);
        }

        /* renamed from: b */
        public final String m20520b() {
            return this.f17551a;
        }

        /* renamed from: c */
        public final Float m20521c() {
            return this.f17552b;
        }

        /* renamed from: d */
        public final fc8 m20522d() {
            return this.f17553c;
        }

        /* renamed from: e */
        public final Integer m20523e() {
            return this.f17554d;
        }

        /* renamed from: f */
        public final a4e m20524f() {
            return null;
        }

        /* renamed from: g */
        public final void m20525g(String str) {
            this.f17551a = str;
        }

        /* renamed from: h */
        public final void m20526h(fc8 fc8Var) {
            this.f17553c = fc8Var;
        }

        /* renamed from: i */
        public final void m20527i(Integer num) {
            this.f17554d = num;
        }
    }

    /* renamed from: o.c9f$b */
    public static final class C12594b {
        public C12594b() {
        }

        public /* synthetic */ C12594b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ c9f(C12593a c12593a, id5 id5Var) {
        this(c12593a);
    }

    /* renamed from: a */
    public final String m20514a() {
        return this.f17547a;
    }

    /* renamed from: b */
    public final Float m20515b() {
        return this.f17548b;
    }

    /* renamed from: c */
    public final fc8 m20516c() {
        return this.f17549c;
    }

    /* renamed from: d */
    public final Integer m20517d() {
        return this.f17550d;
    }

    /* renamed from: e */
    public final a4e m20518e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c9f.class != obj.getClass()) {
            return false;
        }
        c9f c9fVar = (c9f) obj;
        if (!sq8.m48644c(this.f17547a, c9fVar.f17547a)) {
            return false;
        }
        Float f = this.f17548b;
        return (f != null ? f.equals(c9fVar.f17548b) : c9fVar.f17548b == null) && sq8.m48644c(this.f17549c, c9fVar.f17549c) && sq8.m48644c(this.f17550d, c9fVar.f17550d) && sq8.m48644c(null, null);
    }

    public int hashCode() {
        String str = this.f17547a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Float f = this.f17548b;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 31;
        fc8 fc8Var = this.f17549c;
        int iHashCode3 = (iHashCode2 + (fc8Var != null ? fc8Var.hashCode() : 0)) * 31;
        Integer num = this.f17550d;
        return ((iHashCode3 + (num != null ? num.intValue() : 0)) * 31) + 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchFacesByImageRequest(");
        sb.append("collectionId=" + this.f17547a + ',');
        sb.append("faceMatchThreshold=" + this.f17548b + ',');
        sb.append("image=" + this.f17549c + ',');
        sb.append("maxFaces=" + this.f17550d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("qualityFilter=");
        sb2.append((Object) null);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public c9f(C12593a c12593a) {
        this.f17547a = c12593a.m20520b();
        this.f17548b = c12593a.m20521c();
        this.f17549c = c12593a.m20522d();
        this.f17550d = c12593a.m20523e();
        c12593a.m20524f();
    }
}
