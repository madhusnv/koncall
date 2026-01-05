package p001o;

/* loaded from: classes3.dex */
public final class rxe {

    /* renamed from: d */
    public static final C16678b f44235d = new C16678b(null);

    /* renamed from: a */
    public final String f44236a;

    /* renamed from: b */
    public final String f44237b;

    /* renamed from: c */
    public final String f44238c;

    /* renamed from: o.rxe$a */
    public static final class C16677a {

        /* renamed from: a */
        public String f44239a;

        /* renamed from: b */
        public String f44240b;

        /* renamed from: c */
        public String f44241c;

        /* renamed from: a */
        public final rxe m47274a() {
            return new rxe(this, null);
        }

        /* renamed from: b */
        public final String m47275b() {
            return this.f44239a;
        }

        /* renamed from: c */
        public final String m47276c() {
            return this.f44240b;
        }

        /* renamed from: d */
        public final String m47277d() {
            return this.f44241c;
        }

        /* renamed from: e */
        public final void m47278e(String str) {
            this.f44239a = str;
        }

        /* renamed from: f */
        public final void m47279f(String str) {
            this.f44240b = str;
        }
    }

    /* renamed from: o.rxe$b */
    public static final class C16678b {
        public C16678b() {
        }

        public /* synthetic */ C16678b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final rxe m47280a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C16677a c16677a = new C16677a();
            xk7Var.invoke(c16677a);
            return c16677a.m47274a();
        }
    }

    public /* synthetic */ rxe(C16677a c16677a, id5 id5Var) {
        this(c16677a);
    }

    /* renamed from: a */
    public final String m47271a() {
        return this.f44236a;
    }

    /* renamed from: b */
    public final String m47272b() {
        return this.f44237b;
    }

    /* renamed from: c */
    public final String m47273c() {
        return this.f44238c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rxe.class != obj.getClass()) {
            return false;
        }
        rxe rxeVar = (rxe) obj;
        return sq8.m48644c(this.f44236a, rxeVar.f44236a) && sq8.m48644c(this.f44237b, rxeVar.f44237b) && sq8.m48644c(this.f44238c, rxeVar.f44238c);
    }

    public int hashCode() {
        String str = this.f44236a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f44237b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f44238c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("S3Object(");
        sb.append("bucket=" + this.f44236a + ',');
        sb.append("name=" + this.f44237b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("version=");
        sb2.append(this.f44238c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rxe(C16677a c16677a) {
        this.f44236a = c16677a.m47275b();
        this.f44237b = c16677a.m47276c();
        this.f44238c = c16677a.m47277d();
    }
}
