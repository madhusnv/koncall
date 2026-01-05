package p001o;

/* loaded from: classes2.dex */
public final class fdd {

    /* renamed from: b */
    public static final C13404b f23157b = new C13404b(null);

    /* renamed from: a */
    public final String f23158a;

    /* renamed from: o.fdd$a */
    public static final class C13403a {

        /* renamed from: a */
        public String f23159a;

        /* renamed from: a */
        public final fdd m26467a() {
            return new fdd(this, null);
        }

        /* renamed from: b */
        public final String m26468b() {
            return this.f23159a;
        }

        /* renamed from: c */
        public final void m26469c(String str) {
            this.f23159a = str;
        }
    }

    /* renamed from: o.fdd$b */
    public static final class C13404b {
        public C13404b() {
        }

        public /* synthetic */ C13404b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final fdd m26470a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C13403a c13403a = new C13403a();
            xk7Var.invoke(c13403a);
            return c13403a.m26467a();
        }
    }

    public /* synthetic */ fdd(C13403a c13403a, id5 id5Var) {
        this(c13403a);
    }

    /* renamed from: a */
    public final String m26466a() {
        return this.f23158a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fdd.class == obj.getClass() && sq8.m48644c(this.f23158a, ((fdd) obj).f23158a);
    }

    public int hashCode() {
        String str = this.f23158a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PolicyDescriptorType(");
        sb.append("arn=" + this.f23158a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public fdd(C13403a c13403a) {
        this.f23158a = c13403a.m26468b();
    }
}
