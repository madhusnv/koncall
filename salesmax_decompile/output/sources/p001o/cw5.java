package p001o;

/* loaded from: classes3.dex */
public final class cw5 {

    /* renamed from: b */
    public static final C12760b f18730b = new C12760b(null);

    /* renamed from: a */
    public final Integer f18731a;

    /* renamed from: o.cw5$a */
    public static final class C12759a {

        /* renamed from: a */
        public Integer f18732a;

        /* renamed from: a */
        public final cw5 m21887a() {
            return new cw5(this, null);
        }

        /* renamed from: b */
        public final C12759a m21888b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m21889c() {
            return this.f18732a;
        }

        /* renamed from: d */
        public final void m21890d(Integer num) {
            this.f18732a = num;
        }
    }

    /* renamed from: o.cw5$b */
    public static final class C12760b {
        public C12760b() {
        }

        public /* synthetic */ C12760b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cw5(C12759a c12759a, id5 id5Var) {
        this(c12759a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cw5.class == obj.getClass() && sq8.m48644c(this.f18731a, ((cw5) obj).f18731a);
    }

    public int hashCode() {
        Integer num = this.f18731a;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentMetadata(");
        sb.append("pages=" + this.f18731a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cw5(C12759a c12759a) {
        this.f18731a = c12759a.m21889c();
    }
}
