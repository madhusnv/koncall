package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class qm5 {

    /* renamed from: c */
    public static final C16422b f42134c = new C16422b(null);

    /* renamed from: a */
    public final String f42135a;

    /* renamed from: b */
    public final List f42136b;

    /* renamed from: o.qm5$a */
    public static final class C16421a {

        /* renamed from: a */
        public String f42137a;

        /* renamed from: b */
        public List f42138b;

        /* renamed from: a */
        public final qm5 m45642a() {
            return new qm5(this, null);
        }

        /* renamed from: b */
        public final C16421a m45643b() {
            return this;
        }

        /* renamed from: c */
        public final String m45644c() {
            return this.f42137a;
        }

        /* renamed from: d */
        public final List m45645d() {
            return this.f42138b;
        }

        /* renamed from: e */
        public final void m45646e(String str) {
            this.f42137a = str;
        }

        /* renamed from: f */
        public final void m45647f(List list) {
            this.f42138b = list;
        }
    }

    /* renamed from: o.qm5$b */
    public static final class C16422b {
        public C16422b() {
        }

        public /* synthetic */ C16422b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qm5(C16421a c16421a, id5 id5Var) {
        this(c16421a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qm5.class != obj.getClass()) {
            return false;
        }
        qm5 qm5Var = (qm5) obj;
        return sq8.m48644c(this.f42135a, qm5Var.f42135a) && sq8.m48644c(this.f42136b, qm5Var.f42136b);
    }

    public int hashCode() {
        String str = this.f42135a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f42136b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DescribeVoicesResponse(");
        sb.append("nextToken=" + this.f42135a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voices=");
        sb2.append(this.f42136b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qm5(C16421a c16421a) {
        this.f42135a = c16421a.m45644c();
        this.f42136b = c16421a.m45645d();
    }
}
