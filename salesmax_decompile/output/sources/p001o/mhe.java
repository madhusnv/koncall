package p001o;

/* loaded from: classes3.dex */
public final class mhe {

    /* renamed from: e */
    public static final C15327b f35485e = new C15327b(null);

    /* renamed from: a */
    public final String f35486a;

    /* renamed from: b */
    public final String f35487b;

    /* renamed from: c */
    public final Boolean f35488c;

    /* renamed from: d */
    public final Boolean f35489d;

    /* renamed from: o.mhe$a */
    public static final class C15326a {

        /* renamed from: a */
        public String f35490a;

        /* renamed from: b */
        public String f35491b;

        /* renamed from: c */
        public Boolean f35492c;

        /* renamed from: d */
        public Boolean f35493d;

        public C15326a() {
            Boolean bool = Boolean.FALSE;
            this.f35492c = bool;
            this.f35493d = bool;
        }

        /* renamed from: a */
        public final mhe m39075a() {
            return new mhe(this, null);
        }

        /* renamed from: b */
        public final String m39076b() {
            return this.f35490a;
        }

        /* renamed from: c */
        public final String m39077c() {
            return this.f35491b;
        }

        /* renamed from: d */
        public final Boolean m39078d() {
            return this.f35492c;
        }

        /* renamed from: e */
        public final Boolean m39079e() {
            return this.f35493d;
        }

        /* renamed from: f */
        public final void m39080f(String str) {
            this.f35490a = str;
        }

        /* renamed from: g */
        public final void m39081g(String str) {
            this.f35491b = str;
        }

        /* renamed from: h */
        public final void m39082h(Boolean bool) {
            this.f35492c = bool;
        }

        /* renamed from: i */
        public final void m39083i(Boolean bool) {
            this.f35493d = bool;
        }
    }

    /* renamed from: o.mhe$b */
    public static final class C15327b {
        public C15327b() {
        }

        public /* synthetic */ C15327b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mhe(C15326a c15326a, id5 id5Var) {
        this(c15326a);
    }

    /* renamed from: a */
    public final String m39071a() {
        return this.f35486a;
    }

    /* renamed from: b */
    public final String m39072b() {
        return this.f35487b;
    }

    /* renamed from: c */
    public final Boolean m39073c() {
        return this.f35488c;
    }

    /* renamed from: d */
    public final Boolean m39074d() {
        return this.f35489d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhe)) {
            return false;
        }
        mhe mheVar = (mhe) obj;
        return sq8.m48644c(this.f35486a, mheVar.f35486a) && sq8.m48644c(this.f35487b, mheVar.f35487b) && sq8.m48644c(this.f35488c, mheVar.f35488c) && sq8.m48644c(this.f35489d, mheVar.f35489d);
    }

    public int hashCode() {
        String str = this.f35486a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35487b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f35488c;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f35489d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RekognitionEndpointParameters(");
        sb.append("endpoint=" + this.f35486a + ',');
        sb.append("region=" + this.f35487b + ',');
        sb.append("useDualStack=" + this.f35488c + ',');
        sb.append("useFips=" + this.f35489d + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mhe(C15326a c15326a) {
        this.f35486a = c15326a.m39076b();
        this.f35487b = c15326a.m39077c();
        Boolean boolM39078d = c15326a.m39078d();
        if (boolM39078d == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.f35488c = boolM39078d;
        Boolean boolM39079e = c15326a.m39079e();
        if (boolM39079e == null) {
            throw new IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.f35489d = boolM39079e;
    }
}
