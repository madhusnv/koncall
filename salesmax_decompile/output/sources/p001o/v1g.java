package p001o;

/* loaded from: classes2.dex */
public final class v1g {

    /* renamed from: e */
    public static final C17499b f49765e = new C17499b(null);

    /* renamed from: a */
    public final String f49766a;

    /* renamed from: b */
    public final String f49767b;

    /* renamed from: c */
    public final Boolean f49768c;

    /* renamed from: d */
    public final Boolean f49769d;

    /* renamed from: o.v1g$a */
    public static final class C17498a {

        /* renamed from: a */
        public String f49770a;

        /* renamed from: b */
        public String f49771b;

        /* renamed from: c */
        public Boolean f49772c;

        /* renamed from: d */
        public Boolean f49773d;

        public C17498a() {
            Boolean bool = Boolean.FALSE;
            this.f49772c = bool;
            this.f49773d = bool;
        }

        /* renamed from: a */
        public final v1g m52269a() {
            return new v1g(this, null);
        }

        /* renamed from: b */
        public final String m52270b() {
            return this.f49770a;
        }

        /* renamed from: c */
        public final String m52271c() {
            return this.f49771b;
        }

        /* renamed from: d */
        public final Boolean m52272d() {
            return this.f49772c;
        }

        /* renamed from: e */
        public final Boolean m52273e() {
            return this.f49773d;
        }

        /* renamed from: f */
        public final void m52274f(String str) {
            this.f49770a = str;
        }

        /* renamed from: g */
        public final void m52275g(String str) {
            this.f49771b = str;
        }

        /* renamed from: h */
        public final void m52276h(Boolean bool) {
            this.f49772c = bool;
        }

        /* renamed from: i */
        public final void m52277i(Boolean bool) {
            this.f49773d = bool;
        }
    }

    /* renamed from: o.v1g$b */
    public static final class C17499b {
        public C17499b() {
        }

        public /* synthetic */ C17499b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ v1g(C17498a c17498a, id5 id5Var) {
        this(c17498a);
    }

    /* renamed from: a */
    public final String m52265a() {
        return this.f49766a;
    }

    /* renamed from: b */
    public final String m52266b() {
        return this.f49767b;
    }

    /* renamed from: c */
    public final Boolean m52267c() {
        return this.f49768c;
    }

    /* renamed from: d */
    public final Boolean m52268d() {
        return this.f49769d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1g)) {
            return false;
        }
        v1g v1gVar = (v1g) obj;
        return sq8.m48644c(this.f49766a, v1gVar.f49766a) && sq8.m48644c(this.f49767b, v1gVar.f49767b) && sq8.m48644c(this.f49768c, v1gVar.f49768c) && sq8.m48644c(this.f49769d, v1gVar.f49769d);
    }

    public int hashCode() {
        String str = this.f49766a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f49767b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f49768c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f49769d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SsoEndpointParameters(");
        sb.append("endpoint=" + this.f49766a + ',');
        sb.append("region=" + this.f49767b + ',');
        sb.append("useDualStack=" + this.f49768c + ',');
        sb.append("useFips=" + this.f49769d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public v1g(C17498a c17498a) {
        this.f49766a = c17498a.m52270b();
        this.f49767b = c17498a.m52271c();
        Boolean boolM52272d = c17498a.m52272d();
        if (boolM52272d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f49768c = boolM52272d;
        Boolean boolM52273e = c17498a.m52273e();
        if (boolM52273e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f49769d = boolM52273e;
    }
}
