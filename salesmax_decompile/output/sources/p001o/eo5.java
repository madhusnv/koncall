package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class eo5 {

    /* renamed from: c */
    public static final C13237b f21979c = new C13237b(null);

    /* renamed from: a */
    public final List f21980a;

    /* renamed from: b */
    public final ko5 f21981b;

    /* renamed from: o.eo5$a */
    public static final class C13236a {

        /* renamed from: a */
        public List f21982a;

        /* renamed from: b */
        public ko5 f21983b;

        /* renamed from: a */
        public final eo5 m25366a() {
            return new eo5(this, null);
        }

        /* renamed from: b */
        public final C13236a m25367b() {
            return this;
        }

        /* renamed from: c */
        public final List m25368c() {
            return this.f21982a;
        }

        /* renamed from: d */
        public final ko5 m25369d() {
            return this.f21983b;
        }

        /* renamed from: e */
        public final void m25370e(List list) {
            this.f21982a = list;
        }

        /* renamed from: f */
        public final void m25371f(ko5 ko5Var) {
            this.f21983b = ko5Var;
        }
    }

    /* renamed from: o.eo5$b */
    public static final class C13237b {
        public C13237b() {
        }

        public /* synthetic */ C13237b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ eo5(C13236a c13236a, id5 id5Var) {
        this(c13236a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eo5.class != obj.getClass()) {
            return false;
        }
        eo5 eo5Var = (eo5) obj;
        return sq8.m48644c(this.f21980a, eo5Var.f21980a) && sq8.m48644c(this.f21981b, eo5Var.f21981b);
    }

    public int hashCode() {
        List list = this.f21980a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        ko5 ko5Var = this.f21981b;
        return iHashCode + (ko5Var != null ? ko5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectLabelsImageBackground(");
        sb.append("dominantColors=" + this.f21980a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("quality=");
        sb2.append(this.f21981b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public eo5(C13236a c13236a) {
        this.f21980a = c13236a.m25368c();
        this.f21981b = c13236a.m25369d();
    }
}
