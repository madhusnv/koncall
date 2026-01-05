package p001o;

/* loaded from: classes3.dex */
public final class lg3 {

    /* renamed from: e */
    public static final C15071b f33744e = new C15071b(null);

    /* renamed from: a */
    public final String f33745a;

    /* renamed from: b */
    public final String f33746b;

    /* renamed from: c */
    public final Boolean f33747c;

    /* renamed from: d */
    public final Boolean f33748d;

    /* renamed from: o.lg3$a */
    public static final class C15070a {

        /* renamed from: a */
        public String f33749a;

        /* renamed from: b */
        public String f33750b;

        /* renamed from: c */
        public Boolean f33751c;

        /* renamed from: d */
        public Boolean f33752d;

        public C15070a() {
            Boolean bool = Boolean.FALSE;
            this.f33751c = bool;
            this.f33752d = bool;
        }

        /* renamed from: a */
        public final lg3 m37143a() {
            return new lg3(this, null);
        }

        /* renamed from: b */
        public final String m37144b() {
            return this.f33749a;
        }

        /* renamed from: c */
        public final String m37145c() {
            return this.f33750b;
        }

        /* renamed from: d */
        public final Boolean m37146d() {
            return this.f33751c;
        }

        /* renamed from: e */
        public final Boolean m37147e() {
            return this.f33752d;
        }

        /* renamed from: f */
        public final void m37148f(String str) {
            this.f33749a = str;
        }

        /* renamed from: g */
        public final void m37149g(String str) {
            this.f33750b = str;
        }

        /* renamed from: h */
        public final void m37150h(Boolean bool) {
            this.f33751c = bool;
        }

        /* renamed from: i */
        public final void m37151i(Boolean bool) {
            this.f33752d = bool;
        }
    }

    /* renamed from: o.lg3$b */
    public static final class C15071b {
        public C15071b() {
        }

        public /* synthetic */ C15071b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lg3(C15070a c15070a, id5 id5Var) {
        this(c15070a);
    }

    /* renamed from: a */
    public final String m37139a() {
        return this.f33745a;
    }

    /* renamed from: b */
    public final String m37140b() {
        return this.f33746b;
    }

    /* renamed from: c */
    public final Boolean m37141c() {
        return this.f33747c;
    }

    /* renamed from: d */
    public final Boolean m37142d() {
        return this.f33748d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg3)) {
            return false;
        }
        lg3 lg3Var = (lg3) obj;
        return sq8.m48644c(this.f33745a, lg3Var.f33745a) && sq8.m48644c(this.f33746b, lg3Var.f33746b) && sq8.m48644c(this.f33747c, lg3Var.f33747c) && sq8.m48644c(this.f33748d, lg3Var.f33748d);
    }

    public int hashCode() {
        String str = this.f33745a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f33746b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f33747c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f33748d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CognitoIdentityProviderEndpointParameters(");
        sb.append("endpoint=" + this.f33745a + ',');
        sb.append("region=" + this.f33746b + ',');
        sb.append("useDualStack=" + this.f33747c + ',');
        sb.append("useFips=" + this.f33748d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lg3(C15070a c15070a) {
        this.f33745a = c15070a.m37144b();
        this.f33746b = c15070a.m37145c();
        Boolean boolM37146d = c15070a.m37146d();
        if (boolM37146d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f33747c = boolM37146d;
        Boolean boolM37147e = c15070a.m37147e();
        if (boolM37147e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f33748d = boolM37147e;
    }
}
