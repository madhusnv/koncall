package p001o;

/* loaded from: classes3.dex */
public final class dg3 {

    /* renamed from: e */
    public static final C12900b f19767e = new C12900b(null);

    /* renamed from: a */
    public final String f19768a;

    /* renamed from: b */
    public final String f19769b;

    /* renamed from: c */
    public final Boolean f19770c;

    /* renamed from: d */
    public final Boolean f19771d;

    /* renamed from: o.dg3$a */
    public static final class C12899a {

        /* renamed from: a */
        public String f19772a;

        /* renamed from: b */
        public String f19773b;

        /* renamed from: c */
        public Boolean f19774c;

        /* renamed from: d */
        public Boolean f19775d;

        public C12899a() {
            Boolean bool = Boolean.FALSE;
            this.f19774c = bool;
            this.f19775d = bool;
        }

        /* renamed from: a */
        public final dg3 m23003a() {
            return new dg3(this, null);
        }

        /* renamed from: b */
        public final String m23004b() {
            return this.f19772a;
        }

        /* renamed from: c */
        public final String m23005c() {
            return this.f19773b;
        }

        /* renamed from: d */
        public final Boolean m23006d() {
            return this.f19774c;
        }

        /* renamed from: e */
        public final Boolean m23007e() {
            return this.f19775d;
        }

        /* renamed from: f */
        public final void m23008f(String str) {
            this.f19772a = str;
        }

        /* renamed from: g */
        public final void m23009g(String str) {
            this.f19773b = str;
        }

        /* renamed from: h */
        public final void m23010h(Boolean bool) {
            this.f19774c = bool;
        }

        /* renamed from: i */
        public final void m23011i(Boolean bool) {
            this.f19775d = bool;
        }
    }

    /* renamed from: o.dg3$b */
    public static final class C12900b {
        public C12900b() {
        }

        public /* synthetic */ C12900b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ dg3(C12899a c12899a, id5 id5Var) {
        this(c12899a);
    }

    /* renamed from: a */
    public final String m22999a() {
        return this.f19768a;
    }

    /* renamed from: b */
    public final String m23000b() {
        return this.f19769b;
    }

    /* renamed from: c */
    public final Boolean m23001c() {
        return this.f19770c;
    }

    /* renamed from: d */
    public final Boolean m23002d() {
        return this.f19771d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg3)) {
            return false;
        }
        dg3 dg3Var = (dg3) obj;
        return sq8.m48644c(this.f19768a, dg3Var.f19768a) && sq8.m48644c(this.f19769b, dg3Var.f19769b) && sq8.m48644c(this.f19770c, dg3Var.f19770c) && sq8.m48644c(this.f19771d, dg3Var.f19771d);
    }

    public int hashCode() {
        String str = this.f19768a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19769b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f19770c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f19771d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CognitoIdentityEndpointParameters(");
        sb.append("endpoint=" + this.f19768a + ',');
        sb.append("region=" + this.f19769b + ',');
        sb.append("useDualStack=" + this.f19770c + ',');
        sb.append("useFips=" + this.f19771d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public dg3(C12899a c12899a) {
        this.f19768a = c12899a.m23004b();
        this.f19769b = c12899a.m23005c();
        Boolean boolM23006d = c12899a.m23006d();
        if (boolM23006d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f19770c = boolM23006d;
        Boolean boolM23007e = c12899a.m23007e();
        if (boolM23007e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f19771d = boolM23007e;
    }
}
