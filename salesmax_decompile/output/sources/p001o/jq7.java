package p001o;

/* loaded from: classes3.dex */
public final class jq7 {

    /* renamed from: b */
    public static final C14628b f30953b = new C14628b(null);

    /* renamed from: a */
    public final String f30954a;

    /* renamed from: o.jq7$a */
    public static final class C14627a {

        /* renamed from: a */
        public String f30955a;

        /* renamed from: a */
        public final jq7 m34274a() {
            return new jq7(this, null);
        }

        /* renamed from: b */
        public final C14627a m34275b() {
            return this;
        }

        /* renamed from: c */
        public final String m34276c() {
            return this.f30955a;
        }

        /* renamed from: d */
        public final void m34277d(String str) {
            this.f30955a = str;
        }
    }

    /* renamed from: o.jq7$b */
    public static final class C14628b {
        public C14628b() {
        }

        public /* synthetic */ C14628b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jq7(C14627a c14627a, id5 id5Var) {
        this(c14627a);
    }

    /* renamed from: a */
    public final String m34273a() {
        return this.f30954a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jq7.class == obj.getClass() && sq8.m48644c(this.f30954a, ((jq7) obj).f30954a);
    }

    public int hashCode() {
        String str = this.f30954a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetIdResponse(");
        sb.append("identityId=" + this.f30954a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jq7(C14627a c14627a) {
        this.f30954a = c14627a.m34276c();
    }
}
