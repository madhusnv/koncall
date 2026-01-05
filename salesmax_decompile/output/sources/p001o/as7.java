package p001o;

/* loaded from: classes3.dex */
public final class as7 {

    /* renamed from: b */
    public static final C12244b f15199b = new C12244b(null);

    /* renamed from: a */
    public final String f15200a;

    /* renamed from: o.as7$a */
    public static final class C12243a {

        /* renamed from: a */
        public String f15201a;

        /* renamed from: a */
        public final as7 m17761a() {
            return new as7(this, null);
        }

        /* renamed from: b */
        public final String m17762b() {
            return this.f15201a;
        }

        /* renamed from: c */
        public final void m17763c(String str) {
            this.f15201a = str;
        }
    }

    /* renamed from: o.as7$b */
    public static final class C12244b {
        public C12244b() {
        }

        public /* synthetic */ C12244b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ as7(C12243a c12243a, id5 id5Var) {
        this(c12243a);
    }

    /* renamed from: a */
    public final String m17760a() {
        return this.f15200a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && as7.class == obj.getClass() && sq8.m48644c(this.f15200a, ((as7) obj).f15200a);
    }

    public int hashCode() {
        String str = this.f15200a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "GetUserRequest(accessToken=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public as7(C12243a c12243a) {
        this.f15200a = c12243a.m17762b();
    }
}
