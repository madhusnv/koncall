package p001o;

/* loaded from: classes3.dex */
public final class t46 {

    /* renamed from: c */
    public static final C16988b f46344c = new C16988b(null);

    /* renamed from: a */
    public final boolean f46345a;

    /* renamed from: b */
    public final boolean f46346b;

    /* renamed from: o.t46$a */
    public static final class C16987a {

        /* renamed from: a */
        public boolean f46347a;

        /* renamed from: b */
        public boolean f46348b;

        /* renamed from: a */
        public final t46 m49274a() {
            return new t46(this, null);
        }

        /* renamed from: b */
        public final boolean m49275b() {
            return this.f46347a;
        }

        /* renamed from: c */
        public final boolean m49276c() {
            return this.f46348b;
        }

        /* renamed from: d */
        public final void m49277d(boolean z) {
            this.f46347a = z;
        }

        /* renamed from: e */
        public final void m49278e(boolean z) {
            this.f46348b = z;
        }
    }

    /* renamed from: o.t46$b */
    public static final class C16988b {
        public C16988b() {
        }

        public /* synthetic */ C16988b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final t46 m49279a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C16987a c16987a = new C16987a();
            xk7Var.invoke(c16987a);
            return c16987a.m49274a();
        }
    }

    public /* synthetic */ t46(C16987a c16987a, id5 id5Var) {
        this(c16987a);
    }

    /* renamed from: a */
    public final boolean m49272a() {
        return this.f46345a;
    }

    /* renamed from: b */
    public final boolean m49273b() {
        return this.f46346b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t46.class != obj.getClass()) {
            return false;
        }
        t46 t46Var = (t46) obj;
        return this.f46345a == t46Var.f46345a && this.f46346b == t46Var.f46346b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f46345a) * 31) + Boolean.hashCode(this.f46346b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmailMfaSettingsType(");
        sb.append("enabled=" + this.f46345a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("preferredMfa=");
        sb2.append(this.f46346b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public t46(C16987a c16987a) {
        this.f46345a = c16987a.m49275b();
        this.f46346b = c16987a.m49276c();
    }
}
