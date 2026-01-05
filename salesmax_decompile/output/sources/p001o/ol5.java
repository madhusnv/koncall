package p001o;

/* loaded from: classes3.dex */
public final class ol5 {

    /* renamed from: b */
    public static final C15834b f38534b = new C15834b(null);

    /* renamed from: a */
    public final String f38535a;

    /* renamed from: o.ol5$a */
    public static final class C15833a {

        /* renamed from: a */
        public String f38536a;

        /* renamed from: a */
        public final ol5 m42373a() {
            return new ol5(this, null);
        }

        /* renamed from: b */
        public final String m42374b() {
            return this.f38536a;
        }

        /* renamed from: c */
        public final void m42375c(String str) {
            this.f38536a = str;
        }
    }

    /* renamed from: o.ol5$b */
    public static final class C15834b {
        public C15834b() {
        }

        public /* synthetic */ C15834b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ol5 m42376a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15833a c15833a = new C15833a();
            xk7Var.invoke(c15833a);
            return c15833a.m42373a();
        }
    }

    public /* synthetic */ ol5(C15833a c15833a, id5 id5Var) {
        this(c15833a);
    }

    /* renamed from: a */
    public final String m42372a() {
        return this.f38535a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ol5.class == obj.getClass() && sq8.m48644c(this.f38535a, ((ol5) obj).f38535a);
    }

    public int hashCode() {
        String str = this.f38535a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "DeleteUserRequest(accessToken=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public ol5(C15833a c15833a) {
        this.f38535a = c15833a.m42374b();
    }
}
