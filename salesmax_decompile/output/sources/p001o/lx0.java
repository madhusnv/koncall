package p001o;

/* loaded from: classes3.dex */
public final class lx0 {

    /* renamed from: c */
    public static final C15175b f34484c = new C15175b(null);

    /* renamed from: a */
    public final String f34485a;

    /* renamed from: b */
    public final String f34486b;

    /* renamed from: o.lx0$a */
    public static final class C15174a {

        /* renamed from: a */
        public String f34487a;

        /* renamed from: b */
        public String f34488b;

        /* renamed from: a */
        public final lx0 m38087a() {
            return new lx0(this, null);
        }

        /* renamed from: b */
        public final C15174a m38088b() {
            if (this.f34487a == null) {
                this.f34487a = "";
            }
            return this;
        }

        /* renamed from: c */
        public final String m38089c() {
            return this.f34487a;
        }

        /* renamed from: d */
        public final String m38090d() {
            return this.f34488b;
        }

        /* renamed from: e */
        public final void m38091e(String str) {
            this.f34487a = str;
        }

        /* renamed from: f */
        public final void m38092f(String str) {
            this.f34488b = str;
        }
    }

    /* renamed from: o.lx0$b */
    public static final class C15175b {
        public C15175b() {
        }

        public /* synthetic */ C15175b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final lx0 m38093a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15174a c15174a = new C15174a();
            xk7Var.invoke(c15174a);
            return c15174a.m38087a();
        }
    }

    public /* synthetic */ lx0(C15174a c15174a, id5 id5Var) {
        this(c15174a);
    }

    /* renamed from: a */
    public final String m38085a() {
        return this.f34485a;
    }

    /* renamed from: b */
    public final String m38086b() {
        return this.f34486b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lx0.class != obj.getClass()) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return sq8.m48644c(this.f34485a, lx0Var.f34485a) && sq8.m48644c(this.f34486b, lx0Var.f34486b);
    }

    public int hashCode() {
        int iHashCode = this.f34485a.hashCode() * 31;
        String str = this.f34486b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeType(");
        sb.append("name=" + this.f34485a + ',');
        sb.append("value=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lx0(C15174a c15174a) {
        String strM38089c = c15174a.m38089c();
        if (strM38089c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for name".toString());
        }
        this.f34485a = strM38089c;
        this.f34486b = c15174a.m38090d();
    }
}
