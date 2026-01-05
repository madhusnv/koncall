package p001o;

/* loaded from: classes2.dex */
public final class hr7 {

    /* renamed from: b */
    public static final C14045b f27388b = new C14045b(null);

    /* renamed from: a */
    public final jue f27389a;

    /* renamed from: o.hr7$a */
    public static final class C14044a {

        /* renamed from: a */
        public jue f27390a;

        /* renamed from: a */
        public final hr7 m31006a() {
            return new hr7(this, null);
        }

        /* renamed from: b */
        public final C14044a m31007b() {
            return this;
        }

        /* renamed from: c */
        public final jue m31008c() {
            return this.f27390a;
        }

        /* renamed from: d */
        public final void m31009d(jue jueVar) {
            this.f27390a = jueVar;
        }
    }

    /* renamed from: o.hr7$b */
    public static final class C14045b {
        public C14045b() {
        }

        public /* synthetic */ C14045b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hr7(C14044a c14044a, id5 id5Var) {
        this(c14044a);
    }

    /* renamed from: a */
    public final jue m31005a() {
        return this.f27389a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hr7.class == obj.getClass() && sq8.m48644c(this.f27389a, ((hr7) obj).f27389a);
    }

    public int hashCode() {
        jue jueVar = this.f27389a;
        if (jueVar != null) {
            return jueVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetRoleCredentialsResponse(");
        sb.append("roleCredentials=" + this.f27389a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hr7(C14044a c14044a) {
        this.f27389a = c14044a.m31008c();
    }
}
