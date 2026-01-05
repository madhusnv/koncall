package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class d9f {

    /* renamed from: e */
    public static final C12846b f19433e = new C12846b(null);

    /* renamed from: a */
    public final List f19434a;

    /* renamed from: b */
    public final String f19435b;

    /* renamed from: c */
    public final gl1 f19436c;

    /* renamed from: d */
    public final Float f19437d;

    /* renamed from: o.d9f$a */
    public static final class C12845a {

        /* renamed from: a */
        public List f19438a;

        /* renamed from: b */
        public String f19439b;

        /* renamed from: c */
        public gl1 f19440c;

        /* renamed from: d */
        public Float f19441d;

        /* renamed from: a */
        public final d9f m22627a() {
            return new d9f(this, null);
        }

        /* renamed from: b */
        public final C12845a m22628b() {
            return this;
        }

        /* renamed from: c */
        public final List m22629c() {
            return this.f19438a;
        }

        /* renamed from: d */
        public final String m22630d() {
            return this.f19439b;
        }

        /* renamed from: e */
        public final gl1 m22631e() {
            return this.f19440c;
        }

        /* renamed from: f */
        public final Float m22632f() {
            return this.f19441d;
        }

        /* renamed from: g */
        public final void m22633g(List list) {
            this.f19438a = list;
        }

        /* renamed from: h */
        public final void m22634h(String str) {
            this.f19439b = str;
        }

        /* renamed from: i */
        public final void m22635i(gl1 gl1Var) {
            this.f19440c = gl1Var;
        }

        /* renamed from: j */
        public final void m22636j(Float f) {
            this.f19441d = f;
        }
    }

    /* renamed from: o.d9f$b */
    public static final class C12846b {
        public C12846b() {
        }

        public /* synthetic */ C12846b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ d9f(C12845a c12845a, id5 id5Var) {
        this(c12845a);
    }

    /* renamed from: a */
    public final List m22626a() {
        return this.f19434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d9f.class != obj.getClass()) {
            return false;
        }
        d9f d9fVar = (d9f) obj;
        if (!sq8.m48644c(this.f19434a, d9fVar.f19434a) || !sq8.m48644c(this.f19435b, d9fVar.f19435b) || !sq8.m48644c(this.f19436c, d9fVar.f19436c)) {
            return false;
        }
        Float f = this.f19437d;
        Float f2 = d9fVar.f19437d;
        return f != null ? f.equals(f2) : f2 == null;
    }

    public int hashCode() {
        List list = this.f19434a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f19435b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        gl1 gl1Var = this.f19436c;
        int iHashCode3 = (iHashCode2 + (gl1Var != null ? gl1Var.hashCode() : 0)) * 31;
        Float f = this.f19437d;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchFacesByImageResponse(");
        sb.append("faceMatches=" + this.f19434a + ',');
        sb.append("faceModelVersion=" + this.f19435b + ',');
        sb.append("searchedFaceBoundingBox=" + this.f19436c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("searchedFaceConfidence=");
        sb2.append(this.f19437d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public d9f(C12845a c12845a) {
        this.f19434a = c12845a.m22629c();
        this.f19435b = c12845a.m22630d();
        this.f19436c = c12845a.m22631e();
        this.f19437d = c12845a.m22632f();
    }
}
