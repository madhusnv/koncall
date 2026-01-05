package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class bw5 {

    /* renamed from: c */
    public static final C12515b f16917c = new C12515b(null);

    /* renamed from: a */
    public final List f16918a;

    /* renamed from: b */
    public final Integer f16919b;

    /* renamed from: o.bw5$a */
    public static final class C12514a {

        /* renamed from: a */
        public List f16920a;

        /* renamed from: b */
        public Integer f16921b;

        /* renamed from: a */
        public final bw5 m19897a() {
            return new bw5(this, null);
        }

        /* renamed from: b */
        public final C12514a m19898b() {
            return this;
        }

        /* renamed from: c */
        public final List m19899c() {
            return this.f16920a;
        }

        /* renamed from: d */
        public final Integer m19900d() {
            return this.f16921b;
        }

        /* renamed from: e */
        public final void m19901e(List list) {
            this.f16920a = list;
        }

        /* renamed from: f */
        public final void m19902f(Integer num) {
            this.f16921b = num;
        }
    }

    /* renamed from: o.bw5$b */
    public static final class C12515b {
        public C12515b() {
        }

        public /* synthetic */ C12515b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ bw5(C12514a c12514a, id5 id5Var) {
        this(c12514a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bw5.class != obj.getClass()) {
            return false;
        }
        bw5 bw5Var = (bw5) obj;
        return sq8.m48644c(this.f16918a, bw5Var.f16918a) && sq8.m48644c(this.f16919b, bw5Var.f16919b);
    }

    public int hashCode() {
        List list = this.f16918a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f16919b;
        return iHashCode + (num != null ? num.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentMetadata(");
        sb.append("extractedCharacters=" + this.f16918a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pages=");
        sb2.append(this.f16919b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public bw5(C12514a c12514a) {
        this.f16918a = c12514a.m19899c();
        this.f16919b = c12514a.m19900d();
    }
}
