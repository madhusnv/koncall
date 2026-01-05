package p001o;

/* loaded from: classes3.dex */
public final class yci {

    /* renamed from: c */
    public static final C18381b f55272c = new C18381b(null);

    /* renamed from: a */
    public final String f55273a;

    /* renamed from: b */
    public final String f55274b;

    /* renamed from: o.yci$a */
    public static final class C18380a {

        /* renamed from: a */
        public String f55275a;

        /* renamed from: b */
        public String f55276b;

        /* renamed from: a */
        public final yci m57609a() {
            return new yci(this, null);
        }

        /* renamed from: b */
        public final String m57610b() {
            return this.f55275a;
        }

        /* renamed from: c */
        public final String m57611c() {
            return this.f55276b;
        }

        /* renamed from: d */
        public final void m57612d(String str) {
            this.f55275a = str;
        }
    }

    /* renamed from: o.yci$b */
    public static final class C18381b {
        public C18381b() {
        }

        public /* synthetic */ C18381b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final yci m57613a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C18380a c18380a = new C18380a();
            xk7Var.invoke(c18380a);
            return c18380a.m57609a();
        }
    }

    public /* synthetic */ yci(C18380a c18380a, id5 id5Var) {
        this(c18380a);
    }

    /* renamed from: a */
    public final String m57607a() {
        return this.f55273a;
    }

    /* renamed from: b */
    public final String m57608b() {
        return this.f55274b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yci.class != obj.getClass()) {
            return false;
        }
        yci yciVar = (yci) obj;
        return sq8.m48644c(this.f55273a, yciVar.f55273a) && sq8.m48644c(this.f55274b, yciVar.f55274b);
    }

    public int hashCode() {
        String str = this.f55273a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f55274b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = "UserContextDataType(*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public yci(C18380a c18380a) {
        this.f55273a = c18380a.m57610b();
        this.f55274b = c18380a.m57611c();
    }
}
