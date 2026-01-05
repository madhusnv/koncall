package p001o;

/* loaded from: classes3.dex */
public final class n6i {

    /* renamed from: d */
    public static final C15518b f36455d = new C15518b(null);

    /* renamed from: a */
    public final String f36456a;

    /* renamed from: b */
    public final String f36457b;

    /* renamed from: c */
    public final gr5 f36458c;

    /* renamed from: o.n6i$a */
    public static final class C15517a {

        /* renamed from: a */
        public String f36459a;

        /* renamed from: b */
        public String f36460b;

        /* renamed from: c */
        public gr5 f36461c;

        /* renamed from: a */
        public final n6i m40166a() {
            return new n6i(this, null);
        }

        /* renamed from: b */
        public final String m40167b() {
            return this.f36459a;
        }

        /* renamed from: c */
        public final String m40168c() {
            return this.f36460b;
        }

        /* renamed from: d */
        public final gr5 m40169d() {
            return this.f36461c;
        }

        /* renamed from: e */
        public final void m40170e(String str) {
            this.f36459a = str;
        }

        /* renamed from: f */
        public final void m40171f(String str) {
            this.f36460b = str;
        }

        /* renamed from: g */
        public final void m40172g(gr5 gr5Var) {
            this.f36461c = gr5Var;
        }
    }

    /* renamed from: o.n6i$b */
    public static final class C15518b {
        public C15518b() {
        }

        public /* synthetic */ C15518b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ n6i(C15517a c15517a, id5 id5Var) {
        this(c15517a);
    }

    /* renamed from: a */
    public final String m40163a() {
        return this.f36456a;
    }

    /* renamed from: b */
    public final String m40164b() {
        return this.f36457b;
    }

    /* renamed from: c */
    public final gr5 m40165c() {
        return this.f36458c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n6i.class != obj.getClass()) {
            return false;
        }
        n6i n6iVar = (n6i) obj;
        return sq8.m48644c(this.f36456a, n6iVar.f36456a) && sq8.m48644c(this.f36457b, n6iVar.f36457b) && sq8.m48644c(this.f36458c, n6iVar.f36458c);
    }

    public int hashCode() {
        String str = this.f36456a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36457b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        gr5 gr5Var = this.f36458c;
        return iHashCode2 + (gr5Var != null ? gr5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateDeviceStatusRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("deviceKey=" + this.f36457b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deviceRememberedStatus=");
        sb2.append(this.f36458c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public n6i(C15517a c15517a) {
        this.f36456a = c15517a.m40167b();
        this.f36457b = c15517a.m40168c();
        this.f36458c = c15517a.m40169d();
    }
}
