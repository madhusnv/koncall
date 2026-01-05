package p001o;

/* loaded from: classes3.dex */
public final class me9 {

    /* renamed from: b */
    public static final C15294b f35264b = new C15294b(null);

    /* renamed from: a */
    public final oe9 f35265a;

    /* renamed from: o.me9$a */
    public static final class C15293a {

        /* renamed from: a */
        public oe9 f35266a;

        /* renamed from: a */
        public final me9 m38818a() {
            return new me9(this, null);
        }

        /* renamed from: b */
        public final C15293a m38819b() {
            return this;
        }

        /* renamed from: c */
        public final oe9 m38820c() {
            return this.f35266a;
        }

        /* renamed from: d */
        public final void m38821d(oe9 oe9Var) {
            this.f35266a = oe9Var;
        }
    }

    /* renamed from: o.me9$b */
    public static final class C15294b {
        public C15294b() {
        }

        public /* synthetic */ C15294b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ me9(C15293a c15293a, id5 id5Var) {
        this(c15293a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && me9.class == obj.getClass() && sq8.m48644c(this.f35265a, ((me9) obj).f35265a);
    }

    public int hashCode() {
        oe9 oe9Var = this.f35265a;
        if (oe9Var != null) {
            return oe9Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KnownGender(");
        sb.append("type=" + this.f35265a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public me9(C15293a c15293a) {
        this.f35265a = c15293a.m38820c();
    }
}
