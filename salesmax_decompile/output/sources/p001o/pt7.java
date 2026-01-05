package p001o;

/* loaded from: classes3.dex */
public final class pt7 {

    /* renamed from: b */
    public static final C16185b f40533b = new C16185b(null);

    /* renamed from: a */
    public final String f40534a;

    /* renamed from: o.pt7$a */
    public static final class C16184a {

        /* renamed from: a */
        public String f40535a;

        /* renamed from: a */
        public final pt7 m44141a() {
            return new pt7(this, null);
        }

        /* renamed from: b */
        public final String m44142b() {
            return this.f40535a;
        }

        /* renamed from: c */
        public final void m44143c(String str) {
            this.f40535a = str;
        }
    }

    /* renamed from: o.pt7$b */
    public static final class C16185b {
        public C16185b() {
        }

        public /* synthetic */ C16185b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final pt7 m44144a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C16184a c16184a = new C16184a();
            xk7Var.invoke(c16184a);
            return c16184a.m44141a();
        }
    }

    public /* synthetic */ pt7(C16184a c16184a, id5 id5Var) {
        this(c16184a);
    }

    /* renamed from: a */
    public final String m44140a() {
        return this.f40534a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && pt7.class == obj.getClass() && sq8.m48644c(this.f40534a, ((pt7) obj).f40534a);
    }

    public int hashCode() {
        String str = this.f40534a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "GlobalSignOutRequest(accessToken=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public pt7(C16184a c16184a) {
        this.f40534a = c16184a.m44142b();
    }
}
