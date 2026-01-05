package p001o;

/* loaded from: classes3.dex */
public final class ojh {

    /* renamed from: e */
    public static final C15823b f38457e = new C15823b(null);

    /* renamed from: a */
    public final String f38458a;

    /* renamed from: b */
    public final String f38459b;

    /* renamed from: c */
    public final Boolean f38460c;

    /* renamed from: d */
    public final Boolean f38461d;

    /* renamed from: o.ojh$a */
    public static final class C15822a {

        /* renamed from: a */
        public String f38462a;

        /* renamed from: b */
        public String f38463b;

        /* renamed from: c */
        public Boolean f38464c;

        /* renamed from: d */
        public Boolean f38465d;

        public C15822a() {
            Boolean bool = Boolean.FALSE;
            this.f38464c = bool;
            this.f38465d = bool;
        }

        /* renamed from: a */
        public final ojh m42303a() {
            return new ojh(this, null);
        }

        /* renamed from: b */
        public final String m42304b() {
            return this.f38462a;
        }

        /* renamed from: c */
        public final String m42305c() {
            return this.f38463b;
        }

        /* renamed from: d */
        public final Boolean m42306d() {
            return this.f38464c;
        }

        /* renamed from: e */
        public final Boolean m42307e() {
            return this.f38465d;
        }

        /* renamed from: f */
        public final void m42308f(String str) {
            this.f38462a = str;
        }

        /* renamed from: g */
        public final void m42309g(String str) {
            this.f38463b = str;
        }

        /* renamed from: h */
        public final void m42310h(Boolean bool) {
            this.f38464c = bool;
        }

        /* renamed from: i */
        public final void m42311i(Boolean bool) {
            this.f38465d = bool;
        }
    }

    /* renamed from: o.ojh$b */
    public static final class C15823b {
        public C15823b() {
        }

        public /* synthetic */ C15823b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ojh(C15822a c15822a, id5 id5Var) {
        this(c15822a);
    }

    /* renamed from: a */
    public final String m42299a() {
        return this.f38458a;
    }

    /* renamed from: b */
    public final String m42300b() {
        return this.f38459b;
    }

    /* renamed from: c */
    public final Boolean m42301c() {
        return this.f38460c;
    }

    /* renamed from: d */
    public final Boolean m42302d() {
        return this.f38461d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojh)) {
            return false;
        }
        ojh ojhVar = (ojh) obj;
        return sq8.m48644c(this.f38458a, ojhVar.f38458a) && sq8.m48644c(this.f38459b, ojhVar.f38459b) && sq8.m48644c(this.f38460c, ojhVar.f38460c) && sq8.m48644c(this.f38461d, ojhVar.f38461d);
    }

    public int hashCode() {
        String str = this.f38458a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f38459b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f38460c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f38461d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextractEndpointParameters(");
        sb.append("endpoint=" + this.f38458a + ',');
        sb.append("region=" + this.f38459b + ',');
        sb.append("useDualStack=" + this.f38460c + ',');
        sb.append("useFips=" + this.f38461d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ojh(C15822a c15822a) {
        this.f38458a = c15822a.m42304b();
        this.f38459b = c15822a.m42305c();
        Boolean boolM42306d = c15822a.m42306d();
        if (boolM42306d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f38460c = boolM42306d;
        Boolean boolM42307e = c15822a.m42307e();
        if (boolM42307e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f38461d = boolM42307e;
    }
}
