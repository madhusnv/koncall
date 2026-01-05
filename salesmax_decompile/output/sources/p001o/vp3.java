package p001o;

/* loaded from: classes3.dex */
public final class vp3 {

    /* renamed from: e */
    public static final C17643b f50679e = new C17643b(null);

    /* renamed from: a */
    public final String f50680a;

    /* renamed from: b */
    public final String f50681b;

    /* renamed from: c */
    public final Boolean f50682c;

    /* renamed from: d */
    public final Boolean f50683d;

    /* renamed from: o.vp3$a */
    public static final class C17642a {

        /* renamed from: a */
        public String f50684a;

        /* renamed from: b */
        public String f50685b;

        /* renamed from: c */
        public Boolean f50686c;

        /* renamed from: d */
        public Boolean f50687d;

        public C17642a() {
            Boolean bool = Boolean.FALSE;
            this.f50686c = bool;
            this.f50687d = bool;
        }

        /* renamed from: a */
        public final vp3 m53164a() {
            return new vp3(this, null);
        }

        /* renamed from: b */
        public final String m53165b() {
            return this.f50684a;
        }

        /* renamed from: c */
        public final String m53166c() {
            return this.f50685b;
        }

        /* renamed from: d */
        public final Boolean m53167d() {
            return this.f50686c;
        }

        /* renamed from: e */
        public final Boolean m53168e() {
            return this.f50687d;
        }

        /* renamed from: f */
        public final void m53169f(String str) {
            this.f50684a = str;
        }

        /* renamed from: g */
        public final void m53170g(String str) {
            this.f50685b = str;
        }

        /* renamed from: h */
        public final void m53171h(Boolean bool) {
            this.f50686c = bool;
        }

        /* renamed from: i */
        public final void m53172i(Boolean bool) {
            this.f50687d = bool;
        }
    }

    /* renamed from: o.vp3$b */
    public static final class C17643b {
        public C17643b() {
        }

        public /* synthetic */ C17643b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ vp3(C17642a c17642a, id5 id5Var) {
        this(c17642a);
    }

    /* renamed from: a */
    public final String m53160a() {
        return this.f50680a;
    }

    /* renamed from: b */
    public final String m53161b() {
        return this.f50681b;
    }

    /* renamed from: c */
    public final Boolean m53162c() {
        return this.f50682c;
    }

    /* renamed from: d */
    public final Boolean m53163d() {
        return this.f50683d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp3)) {
            return false;
        }
        vp3 vp3Var = (vp3) obj;
        return sq8.m48644c(this.f50680a, vp3Var.f50680a) && sq8.m48644c(this.f50681b, vp3Var.f50681b) && sq8.m48644c(this.f50682c, vp3Var.f50682c) && sq8.m48644c(this.f50683d, vp3Var.f50683d);
    }

    public int hashCode() {
        String str = this.f50680a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50681b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f50682c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f50683d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComprehendEndpointParameters(");
        sb.append("endpoint=" + this.f50680a + ',');
        sb.append("region=" + this.f50681b + ',');
        sb.append("useDualStack=" + this.f50682c + ',');
        sb.append("useFips=" + this.f50683d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public vp3(C17642a c17642a) {
        this.f50680a = c17642a.m53165b();
        this.f50681b = c17642a.m53166c();
        Boolean boolM53167d = c17642a.m53167d();
        if (boolM53167d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f50682c = boolM53167d;
        Boolean boolM53168e = c17642a.m53168e();
        if (boolM53168e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f50683d = boolM53168e;
    }
}
