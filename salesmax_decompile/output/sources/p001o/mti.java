package p001o;

/* loaded from: classes3.dex */
public final class mti {

    /* renamed from: d */
    public static final C15432b f35990d = new C15432b(null);

    /* renamed from: a */
    public final String f35991a;

    /* renamed from: b */
    public final String f35992b;

    /* renamed from: c */
    public final String f35993c;

    /* renamed from: o.mti$a */
    public static final class C15431a {

        /* renamed from: a */
        public String f35994a;

        /* renamed from: b */
        public String f35995b;

        /* renamed from: c */
        public String f35996c;

        /* renamed from: a */
        public final mti m39683a() {
            return new mti(this, null);
        }

        /* renamed from: b */
        public final String m39684b() {
            return this.f35994a;
        }

        /* renamed from: c */
        public final String m39685c() {
            return this.f35995b;
        }

        /* renamed from: d */
        public final String m39686d() {
            return this.f35996c;
        }

        /* renamed from: e */
        public final void m39687e(String str) {
            this.f35994a = str;
        }

        /* renamed from: f */
        public final void m39688f(String str) {
            this.f35995b = str;
        }

        /* renamed from: g */
        public final void m39689g(String str) {
            this.f35996c = str;
        }
    }

    /* renamed from: o.mti$b */
    public static final class C15432b {
        public C15432b() {
        }

        public /* synthetic */ C15432b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mti(C15431a c15431a, id5 id5Var) {
        this(c15431a);
    }

    /* renamed from: a */
    public final String m39680a() {
        return this.f35991a;
    }

    /* renamed from: b */
    public final String m39681b() {
        return this.f35992b;
    }

    /* renamed from: c */
    public final String m39682c() {
        return this.f35993c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mti.class != obj.getClass()) {
            return false;
        }
        mti mtiVar = (mti) obj;
        return sq8.m48644c(this.f35991a, mtiVar.f35991a) && sq8.m48644c(this.f35992b, mtiVar.f35992b) && sq8.m48644c(this.f35993c, mtiVar.f35993c);
    }

    public int hashCode() {
        String str = this.f35991a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35992b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35993c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyUserAttributeRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("attributeName=" + this.f35992b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("code=");
        sb2.append(this.f35993c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mti(C15431a c15431a) {
        this.f35991a = c15431a.m39684b();
        this.f35992b = c15431a.m39685c();
        this.f35993c = c15431a.m39686d();
    }
}
