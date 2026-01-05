package p001o;

/* loaded from: classes3.dex */
public final class ndd {

    /* renamed from: e */
    public static final C15548b f36711e = new C15548b(null);

    /* renamed from: a */
    public final String f36712a;

    /* renamed from: b */
    public final String f36713b;

    /* renamed from: c */
    public final Boolean f36714c;

    /* renamed from: d */
    public final Boolean f36715d;

    /* renamed from: o.ndd$a */
    public static final class C15547a {

        /* renamed from: a */
        public String f36716a;

        /* renamed from: b */
        public String f36717b;

        /* renamed from: c */
        public Boolean f36718c;

        /* renamed from: d */
        public Boolean f36719d;

        public C15547a() {
            Boolean bool = Boolean.FALSE;
            this.f36718c = bool;
            this.f36719d = bool;
        }

        /* renamed from: a */
        public final ndd m40383a() {
            return new ndd(this, null);
        }

        /* renamed from: b */
        public final String m40384b() {
            return this.f36716a;
        }

        /* renamed from: c */
        public final String m40385c() {
            return this.f36717b;
        }

        /* renamed from: d */
        public final Boolean m40386d() {
            return this.f36718c;
        }

        /* renamed from: e */
        public final Boolean m40387e() {
            return this.f36719d;
        }

        /* renamed from: f */
        public final void m40388f(String str) {
            this.f36716a = str;
        }

        /* renamed from: g */
        public final void m40389g(String str) {
            this.f36717b = str;
        }

        /* renamed from: h */
        public final void m40390h(Boolean bool) {
            this.f36718c = bool;
        }

        /* renamed from: i */
        public final void m40391i(Boolean bool) {
            this.f36719d = bool;
        }
    }

    /* renamed from: o.ndd$b */
    public static final class C15548b {
        public C15548b() {
        }

        public /* synthetic */ C15548b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ndd(C15547a c15547a, id5 id5Var) {
        this(c15547a);
    }

    /* renamed from: a */
    public final String m40379a() {
        return this.f36712a;
    }

    /* renamed from: b */
    public final String m40380b() {
        return this.f36713b;
    }

    /* renamed from: c */
    public final Boolean m40381c() {
        return this.f36714c;
    }

    /* renamed from: d */
    public final Boolean m40382d() {
        return this.f36715d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndd)) {
            return false;
        }
        ndd nddVar = (ndd) obj;
        return sq8.m48644c(this.f36712a, nddVar.f36712a) && sq8.m48644c(this.f36713b, nddVar.f36713b) && sq8.m48644c(this.f36714c, nddVar.f36714c) && sq8.m48644c(this.f36715d, nddVar.f36715d);
    }

    public int hashCode() {
        String str = this.f36712a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36713b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f36714c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f36715d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PollyEndpointParameters(");
        sb.append("endpoint=" + this.f36712a + ',');
        sb.append("region=" + this.f36713b + ',');
        sb.append("useDualStack=" + this.f36714c + ',');
        sb.append("useFips=" + this.f36715d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ndd(C15547a c15547a) {
        this.f36712a = c15547a.m40384b();
        this.f36713b = c15547a.m40385c();
        Boolean boolM40386d = c15547a.m40386d();
        if (boolM40386d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f36714c = boolM40386d;
        Boolean boolM40387e = c15547a.m40387e();
        if (boolM40387e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f36715d = boolM40387e;
    }
}
