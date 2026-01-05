package p001o;

/* loaded from: classes3.dex */
public final class yvh {

    /* renamed from: e */
    public static final C18503b f56147e = new C18503b(null);

    /* renamed from: a */
    public final String f56148a;

    /* renamed from: b */
    public final String f56149b;

    /* renamed from: c */
    public final Boolean f56150c;

    /* renamed from: d */
    public final Boolean f56151d;

    /* renamed from: o.yvh$a */
    public static final class C18502a {

        /* renamed from: a */
        public String f56152a;

        /* renamed from: b */
        public String f56153b;

        /* renamed from: c */
        public Boolean f56154c;

        /* renamed from: d */
        public Boolean f56155d;

        public C18502a() {
            Boolean bool = Boolean.FALSE;
            this.f56154c = bool;
            this.f56155d = bool;
        }

        /* renamed from: a */
        public final yvh m58381a() {
            return new yvh(this, null);
        }

        /* renamed from: b */
        public final String m58382b() {
            return this.f56152a;
        }

        /* renamed from: c */
        public final String m58383c() {
            return this.f56153b;
        }

        /* renamed from: d */
        public final Boolean m58384d() {
            return this.f56154c;
        }

        /* renamed from: e */
        public final Boolean m58385e() {
            return this.f56155d;
        }

        /* renamed from: f */
        public final void m58386f(String str) {
            this.f56152a = str;
        }

        /* renamed from: g */
        public final void m58387g(String str) {
            this.f56153b = str;
        }

        /* renamed from: h */
        public final void m58388h(Boolean bool) {
            this.f56154c = bool;
        }

        /* renamed from: i */
        public final void m58389i(Boolean bool) {
            this.f56155d = bool;
        }
    }

    /* renamed from: o.yvh$b */
    public static final class C18503b {
        public C18503b() {
        }

        public /* synthetic */ C18503b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yvh(C18502a c18502a, id5 id5Var) {
        this(c18502a);
    }

    /* renamed from: a */
    public final String m58377a() {
        return this.f56148a;
    }

    /* renamed from: b */
    public final String m58378b() {
        return this.f56149b;
    }

    /* renamed from: c */
    public final Boolean m58379c() {
        return this.f56150c;
    }

    /* renamed from: d */
    public final Boolean m58380d() {
        return this.f56151d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvh)) {
            return false;
        }
        yvh yvhVar = (yvh) obj;
        return sq8.m48644c(this.f56148a, yvhVar.f56148a) && sq8.m48644c(this.f56149b, yvhVar.f56149b) && sq8.m48644c(this.f56150c, yvhVar.f56150c) && sq8.m48644c(this.f56151d, yvhVar.f56151d);
    }

    public int hashCode() {
        String str = this.f56148a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56149b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f56150c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f56151d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TranslateEndpointParameters(");
        sb.append("endpoint=" + this.f56148a + ',');
        sb.append("region=" + this.f56149b + ',');
        sb.append("useDualStack=" + this.f56150c + ',');
        sb.append("useFips=" + this.f56151d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yvh(C18502a c18502a) {
        this.f56148a = c18502a.m58382b();
        this.f56149b = c18502a.m58383c();
        Boolean boolM58384d = c18502a.m58384d();
        if (boolM58384d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f56150c = boolM58384d;
        Boolean boolM58385e = c18502a.m58385e();
        if (boolM58385e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f56151d = boolM58385e;
    }
}
