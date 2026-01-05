package p001o;

/* loaded from: classes3.dex */
public final class ul5 {

    /* renamed from: c */
    public static final C17393b f49060c = new C17393b(null);

    /* renamed from: a */
    public final String f49061a;

    /* renamed from: b */
    public final String f49062b;

    /* renamed from: o.ul5$a */
    public static final class C17392a {

        /* renamed from: a */
        public String f49063a;

        /* renamed from: b */
        public String f49064b;

        /* renamed from: a */
        public final ul5 m51702a() {
            return new ul5(this, null);
        }

        /* renamed from: b */
        public final String m51703b() {
            return this.f49063a;
        }

        /* renamed from: c */
        public final String m51704c() {
            return this.f49064b;
        }

        /* renamed from: d */
        public final void m51705d(String str) {
            this.f49063a = str;
        }

        /* renamed from: e */
        public final void m51706e(String str) {
            this.f49064b = str;
        }
    }

    /* renamed from: o.ul5$b */
    public static final class C17393b {
        public C17393b() {
        }

        public /* synthetic */ C17393b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ul5(C17392a c17392a, id5 id5Var) {
        this(c17392a);
    }

    /* renamed from: a */
    public final String m51700a() {
        return this.f49061a;
    }

    /* renamed from: b */
    public final String m51701b() {
        return this.f49062b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ul5.class != obj.getClass()) {
            return false;
        }
        ul5 ul5Var = (ul5) obj;
        return sq8.m48644c(this.f49061a, ul5Var.f49061a) && sq8.m48644c(this.f49062b, ul5Var.f49062b);
    }

    public int hashCode() {
        String str = this.f49061a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f49062b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeleteWebAuthnCredentialRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("credentialId=" + this.f49062b);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ul5(C17392a c17392a) {
        this.f49061a = c17392a.m51703b();
        this.f49062b = c17392a.m51704c();
    }
}
