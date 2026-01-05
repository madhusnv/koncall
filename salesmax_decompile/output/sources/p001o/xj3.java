package p001o;

/* loaded from: classes3.dex */
public final class xj3 {

    /* renamed from: b */
    public static final C18171b f53842b = new C18171b(null);

    /* renamed from: a */
    public final String f53843a;

    /* renamed from: o.xj3$a */
    public static final class C18170a {

        /* renamed from: a */
        public String f53844a;

        /* renamed from: a */
        public final xj3 m56372a() {
            return new xj3(this, null);
        }

        /* renamed from: b */
        public final C18170a m56373b() {
            return this;
        }

        /* renamed from: c */
        public final String m56374c() {
            return this.f53844a;
        }

        /* renamed from: d */
        public final void m56375d(String str) {
            this.f53844a = str;
        }
    }

    /* renamed from: o.xj3$b */
    public static final class C18171b {
        public C18171b() {
        }

        public /* synthetic */ C18171b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xj3(C18170a c18170a, id5 id5Var) {
        this(c18170a);
    }

    /* renamed from: a */
    public final String m56371a() {
        return this.f53843a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xj3.class == obj.getClass() && sq8.m48644c(this.f53843a, ((xj3) obj).f53843a);
    }

    public int hashCode() {
        String str = this.f53843a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommonPrefix(");
        sb.append("prefix=" + this.f53843a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xj3(C18170a c18170a) {
        this.f53843a = c18170a.m56374c();
    }
}
