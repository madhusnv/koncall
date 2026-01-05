package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class go7 {

    /* renamed from: c */
    public static final C13805b f25612c = new C13805b(null);

    /* renamed from: a */
    public final fl1 f25613a;

    /* renamed from: b */
    public final List f25614b;

    /* renamed from: o.go7$a */
    public static final class C13804a {

        /* renamed from: a */
        public fl1 f25615a;

        /* renamed from: b */
        public List f25616b;

        /* renamed from: a */
        public final go7 m29238a() {
            return new go7(this, null);
        }

        /* renamed from: b */
        public final C13804a m29239b() {
            return this;
        }

        /* renamed from: c */
        public final fl1 m29240c() {
            return this.f25615a;
        }

        /* renamed from: d */
        public final List m29241d() {
            return this.f25616b;
        }

        /* renamed from: e */
        public final void m29242e(fl1 fl1Var) {
            this.f25615a = fl1Var;
        }

        /* renamed from: f */
        public final void m29243f(List list) {
            this.f25616b = list;
        }
    }

    /* renamed from: o.go7$b */
    public static final class C13805b {
        public C13805b() {
        }

        public /* synthetic */ C13805b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ go7(C13804a c13804a, id5 id5Var) {
        this(c13804a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || go7.class != obj.getClass()) {
            return false;
        }
        go7 go7Var = (go7) obj;
        return sq8.m48644c(this.f25613a, go7Var.f25613a) && sq8.m48644c(this.f25614b, go7Var.f25614b);
    }

    public int hashCode() {
        fl1 fl1Var = this.f25613a;
        int iHashCode = (fl1Var != null ? fl1Var.hashCode() : 0) * 31;
        List list = this.f25614b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Geometry(");
        sb.append("boundingBox=" + this.f25613a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("polygon=");
        sb2.append(this.f25614b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public go7(C13804a c13804a) {
        this.f25613a = c13804a.m29240c();
        this.f25614b = c13804a.m29241d();
    }
}
