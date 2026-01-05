package p001o;

/* loaded from: classes3.dex */
public final class czf {

    /* renamed from: c */
    public static final C12774b f18881c = new C12774b(null);

    /* renamed from: a */
    public final boolean f18882a;

    /* renamed from: b */
    public final boolean f18883b;

    /* renamed from: o.czf$a */
    public static final class C12773a {

        /* renamed from: a */
        public boolean f18884a;

        /* renamed from: b */
        public boolean f18885b;

        /* renamed from: a */
        public final czf m22133a() {
            return new czf(this, null);
        }

        /* renamed from: b */
        public final boolean m22134b() {
            return this.f18884a;
        }

        /* renamed from: c */
        public final boolean m22135c() {
            return this.f18885b;
        }

        /* renamed from: d */
        public final void m22136d(boolean z) {
            this.f18884a = z;
        }

        /* renamed from: e */
        public final void m22137e(boolean z) {
            this.f18885b = z;
        }
    }

    /* renamed from: o.czf$b */
    public static final class C12774b {
        public C12774b() {
        }

        public /* synthetic */ C12774b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final czf m22138a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C12773a c12773a = new C12773a();
            xk7Var.invoke(c12773a);
            return c12773a.m22133a();
        }
    }

    public /* synthetic */ czf(C12773a c12773a, id5 id5Var) {
        this(c12773a);
    }

    /* renamed from: a */
    public final boolean m22131a() {
        return this.f18882a;
    }

    /* renamed from: b */
    public final boolean m22132b() {
        return this.f18883b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || czf.class != obj.getClass()) {
            return false;
        }
        czf czfVar = (czf) obj;
        return this.f18882a == czfVar.f18882a && this.f18883b == czfVar.f18883b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f18882a) * 31) + Boolean.hashCode(this.f18883b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SoftwareTokenMfaSettingsType(");
        sb.append("enabled=" + this.f18882a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("preferredMfa=");
        sb2.append(this.f18883b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public czf(C12773a c12773a) {
        this.f18882a = c12773a.m22134b();
        this.f18883b = c12773a.m22135c();
    }
}
