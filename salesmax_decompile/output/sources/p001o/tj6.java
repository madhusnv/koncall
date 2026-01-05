package p001o;

/* loaded from: classes3.dex */
public final class tj6 {

    /* renamed from: d */
    public static final C17130b f47225d = new C17130b(null);

    /* renamed from: a */
    public final oic f47226a;

    /* renamed from: b */
    public final String f47227b;

    /* renamed from: c */
    public final Integer f47228c;

    /* renamed from: o.tj6$a */
    public static final class C17129a {

        /* renamed from: a */
        public oic f47229a;

        /* renamed from: b */
        public String f47230b;

        /* renamed from: c */
        public Integer f47231c;

        /* renamed from: a */
        public final tj6 m49966a() {
            return new tj6(this, null);
        }

        /* renamed from: b */
        public final C17129a m49967b() {
            return this;
        }

        /* renamed from: c */
        public final oic m49968c() {
            return this.f47229a;
        }

        /* renamed from: d */
        public final String m49969d() {
            return this.f47230b;
        }

        /* renamed from: e */
        public final Integer m49970e() {
            return this.f47231c;
        }

        /* renamed from: f */
        public final void m49971f(oic oicVar) {
            this.f47229a = oicVar;
        }

        /* renamed from: g */
        public final void m49972g(String str) {
            this.f47230b = str;
        }

        /* renamed from: h */
        public final void m49973h(Integer num) {
            this.f47231c = num;
        }
    }

    /* renamed from: o.tj6$b */
    public static final class C17130b {
        public C17130b() {
        }

        public /* synthetic */ C17130b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tj6(C17129a c17129a, id5 id5Var) {
        this(c17129a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tj6.class != obj.getClass()) {
            return false;
        }
        tj6 tj6Var = (tj6) obj;
        return sq8.m48644c(this.f47226a, tj6Var.f47226a) && sq8.m48644c(this.f47227b, tj6Var.f47227b) && sq8.m48644c(this.f47228c, tj6Var.f47228c);
    }

    public int hashCode() {
        oic oicVar = this.f47226a;
        int iHashCode = (oicVar != null ? oicVar.hashCode() : 0) * 31;
        String str = this.f47227b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f47228c;
        return iHashCode2 + (num != null ? num.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorsListItem(");
        sb.append("errorCode=" + this.f47226a + ',');
        sb.append("errorMessage=" + this.f47227b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("page=");
        sb2.append(this.f47228c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tj6(C17129a c17129a) {
        this.f47226a = c17129a.m49968c();
        this.f47227b = c17129a.m49969d();
        this.f47228c = c17129a.m49970e();
    }
}
