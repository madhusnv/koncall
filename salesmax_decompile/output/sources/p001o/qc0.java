package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class qc0 {

    /* renamed from: c */
    public static final C16332b f41604c = new C16332b(null);

    /* renamed from: a */
    public final tv5 f41605a;

    /* renamed from: b */
    public final List f41606b;

    /* renamed from: o.qc0$a */
    public static final class C16331a {

        /* renamed from: a */
        public tv5 f41607a;

        /* renamed from: b */
        public List f41608b;

        /* renamed from: a */
        public final qc0 m45075a() {
            return new qc0(this, null);
        }

        /* renamed from: b */
        public final vv m45076b() {
            return null;
        }

        /* renamed from: c */
        public final tv5 m45077c() {
            return this.f41607a;
        }

        /* renamed from: d */
        public final List m45078d() {
            return this.f41608b;
        }

        /* renamed from: e */
        public final v58 m45079e() {
            return null;
        }

        /* renamed from: f */
        public final g4e m45080f() {
            return null;
        }

        /* renamed from: g */
        public final void m45081g(tv5 tv5Var) {
            this.f41607a = tv5Var;
        }

        /* renamed from: h */
        public final void m45082h(List list) {
            this.f41608b = list;
        }
    }

    /* renamed from: o.qc0$b */
    public static final class C16332b {
        public C16332b() {
        }

        public /* synthetic */ C16332b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qc0(C16331a c16331a, id5 id5Var) {
        this(c16331a);
    }

    /* renamed from: a */
    public final vv m45070a() {
        return null;
    }

    /* renamed from: b */
    public final tv5 m45071b() {
        return this.f41605a;
    }

    /* renamed from: c */
    public final List m45072c() {
        return this.f41606b;
    }

    /* renamed from: d */
    public final v58 m45073d() {
        return null;
    }

    /* renamed from: e */
    public final g4e m45074e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qc0.class != obj.getClass()) {
            return false;
        }
        qc0 qc0Var = (qc0) obj;
        return sq8.m48644c(null, null) && sq8.m48644c(this.f41605a, qc0Var.f41605a) && sq8.m48644c(this.f41606b, qc0Var.f41606b) && sq8.m48644c(null, null) && sq8.m48644c(null, null);
    }

    public int hashCode() {
        tv5 tv5Var = this.f41605a;
        int iHashCode = ((tv5Var != null ? tv5Var.hashCode() : 0) + 0) * 31;
        List list = this.f41606b;
        return ((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + 0) * 31) + 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnalyzeDocumentRequest(");
        sb.append("adaptersConfig=" + ((Object) null) + ',');
        sb.append("document=" + this.f41605a + ',');
        sb.append("featureTypes=" + this.f41606b + ',');
        sb.append("humanLoopConfig=" + ((Object) null) + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("queriesConfig=");
        sb2.append((Object) null);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qc0(C16331a c16331a) {
        c16331a.m45076b();
        this.f41605a = c16331a.m45077c();
        this.f41606b = c16331a.m45078d();
        c16331a.m45079e();
        c16331a.m45080f();
    }
}
