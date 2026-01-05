package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class go5 {

    /* renamed from: c */
    public static final C13803b f25606c = new C13803b(null);

    /* renamed from: a */
    public final List f25607a;

    /* renamed from: b */
    public final ko5 f25608b;

    /* renamed from: o.go5$a */
    public static final class C13802a {

        /* renamed from: a */
        public List f25609a;

        /* renamed from: b */
        public ko5 f25610b;

        /* renamed from: a */
        public final go5 m29232a() {
            return new go5(this, null);
        }

        /* renamed from: b */
        public final C13802a m29233b() {
            return this;
        }

        /* renamed from: c */
        public final List m29234c() {
            return this.f25609a;
        }

        /* renamed from: d */
        public final ko5 m29235d() {
            return this.f25610b;
        }

        /* renamed from: e */
        public final void m29236e(List list) {
            this.f25609a = list;
        }

        /* renamed from: f */
        public final void m29237f(ko5 ko5Var) {
            this.f25610b = ko5Var;
        }
    }

    /* renamed from: o.go5$b */
    public static final class C13803b {
        public C13803b() {
        }

        public /* synthetic */ C13803b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ go5(C13802a c13802a, id5 id5Var) {
        this(c13802a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || go5.class != obj.getClass()) {
            return false;
        }
        go5 go5Var = (go5) obj;
        return sq8.m48644c(this.f25607a, go5Var.f25607a) && sq8.m48644c(this.f25608b, go5Var.f25608b);
    }

    public int hashCode() {
        List list = this.f25607a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        ko5 ko5Var = this.f25608b;
        return iHashCode + (ko5Var != null ? ko5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectLabelsImageForeground(");
        sb.append("dominantColors=" + this.f25607a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("quality=");
        sb2.append(this.f25608b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public go5(C13802a c13802a) {
        this.f25607a = c13802a.m29234c();
        this.f25608b = c13802a.m29235d();
    }
}
