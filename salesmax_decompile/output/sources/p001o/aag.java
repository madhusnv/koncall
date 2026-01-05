package p001o;

/* loaded from: classes2.dex */
public final class aag {

    /* renamed from: f */
    public static final C12123b f14394f = new C12123b(null);

    /* renamed from: a */
    public final String f14395a;

    /* renamed from: b */
    public final String f14396b;

    /* renamed from: c */
    public final Boolean f14397c;

    /* renamed from: d */
    public final Boolean f14398d;

    /* renamed from: e */
    public final Boolean f14399e;

    /* renamed from: o.aag$a */
    public static final class C12122a {

        /* renamed from: a */
        public String f14400a;

        /* renamed from: b */
        public String f14401b;

        /* renamed from: c */
        public Boolean f14402c;

        /* renamed from: d */
        public Boolean f14403d;

        /* renamed from: e */
        public Boolean f14404e;

        public C12122a() {
            Boolean bool = Boolean.FALSE;
            this.f14402c = bool;
            this.f14403d = bool;
            this.f14404e = bool;
        }

        /* renamed from: a */
        public final aag m16777a() {
            return new aag(this, null);
        }

        /* renamed from: b */
        public final String m16778b() {
            return this.f14400a;
        }

        /* renamed from: c */
        public final String m16779c() {
            return this.f14401b;
        }

        /* renamed from: d */
        public final Boolean m16780d() {
            return this.f14402c;
        }

        /* renamed from: e */
        public final Boolean m16781e() {
            return this.f14403d;
        }

        /* renamed from: f */
        public final Boolean m16782f() {
            return this.f14404e;
        }

        /* renamed from: g */
        public final void m16783g(String str) {
            this.f14400a = str;
        }

        /* renamed from: h */
        public final void m16784h(String str) {
            this.f14401b = str;
        }

        /* renamed from: i */
        public final void m16785i(Boolean bool) {
            this.f14402c = bool;
        }

        /* renamed from: j */
        public final void m16786j(Boolean bool) {
            this.f14403d = bool;
        }

        /* renamed from: k */
        public final void m16787k(Boolean bool) {
            this.f14404e = bool;
        }
    }

    /* renamed from: o.aag$b */
    public static final class C12123b {
        public C12123b() {
        }

        public /* synthetic */ C12123b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ aag(C12122a c12122a, id5 id5Var) {
        this(c12122a);
    }

    /* renamed from: a */
    public final String m16772a() {
        return this.f14395a;
    }

    /* renamed from: b */
    public final String m16773b() {
        return this.f14396b;
    }

    /* renamed from: c */
    public final Boolean m16774c() {
        return this.f14397c;
    }

    /* renamed from: d */
    public final Boolean m16775d() {
        return this.f14398d;
    }

    /* renamed from: e */
    public final Boolean m16776e() {
        return this.f14399e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aag)) {
            return false;
        }
        aag aagVar = (aag) obj;
        return sq8.m48644c(this.f14395a, aagVar.f14395a) && sq8.m48644c(this.f14396b, aagVar.f14396b) && sq8.m48644c(this.f14397c, aagVar.f14397c) && sq8.m48644c(this.f14398d, aagVar.f14398d) && sq8.m48644c(this.f14399e, aagVar.f14399e);
    }

    public int hashCode() {
        String str = this.f14395a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14396b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f14397c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f14398d;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f14399e;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StsEndpointParameters(");
        sb.append("endpoint=" + this.f14395a + ',');
        sb.append("region=" + this.f14396b + ',');
        sb.append("useDualStack=" + this.f14397c + ',');
        sb.append("useFips=" + this.f14398d + ',');
        sb.append("useGlobalEndpoint=" + this.f14399e + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public aag(C12122a c12122a) {
        this.f14395a = c12122a.m16778b();
        this.f14396b = c12122a.m16779c();
        Boolean boolM16780d = c12122a.m16780d();
        if (boolM16780d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f14397c = boolM16780d;
        Boolean boolM16781e = c12122a.m16781e();
        if (boolM16781e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f14398d = boolM16781e;
        Boolean boolM16782f = c12122a.m16782f();
        if (boolM16782f == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useGlobalEndpoint is required".toString());
        }
        this.f14399e = boolM16782f;
    }
}
