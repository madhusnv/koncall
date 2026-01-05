package p001o;

/* loaded from: classes3.dex */
public final class dd7 {

    /* renamed from: b */
    public static final C12875b f19606b = new C12875b(null);

    /* renamed from: a */
    public final ze3 f19607a;

    /* renamed from: o.dd7$a */
    public static final class C12874a {

        /* renamed from: a */
        public ze3 f19608a;

        /* renamed from: a */
        public final dd7 m22812a() {
            return new dd7(this, null);
        }

        /* renamed from: b */
        public final C12874a m22813b() {
            return this;
        }

        /* renamed from: c */
        public final ze3 m22814c() {
            return this.f19608a;
        }

        /* renamed from: d */
        public final void m22815d(ze3 ze3Var) {
            this.f19608a = ze3Var;
        }
    }

    /* renamed from: o.dd7$b */
    public static final class C12875b {
        public C12875b() {
        }

        public /* synthetic */ C12875b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ dd7(C12874a c12874a, id5 id5Var) {
        this(c12874a);
    }

    /* renamed from: a */
    public final ze3 m22811a() {
        return this.f19607a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dd7.class == obj.getClass() && sq8.m48644c(this.f19607a, ((dd7) obj).f19607a);
    }

    public int hashCode() {
        ze3 ze3Var = this.f19607a;
        if (ze3Var != null) {
            return ze3Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForgotPasswordResponse(");
        sb.append("codeDeliveryDetails=" + this.f19607a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public dd7(C12874a c12874a) {
        this.f19607a = c12874a.m22814c();
    }
}
