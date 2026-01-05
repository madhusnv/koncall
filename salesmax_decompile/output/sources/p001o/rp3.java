package p001o;

/* loaded from: classes3.dex */
public final class rp3 {

    /* renamed from: b */
    public static final C16645b f43922b = new C16645b(null);

    /* renamed from: a */
    public final String f43923a;

    /* renamed from: o.rp3$a */
    public static final class C16644a {

        /* renamed from: a */
        public String f43924a;

        /* renamed from: a */
        public final rp3 m47044a() {
            return new rp3(this, null);
        }

        /* renamed from: b */
        public final String m47045b() {
            return this.f43924a;
        }

        /* renamed from: c */
        public final void m47046c(String str) {
            this.f43924a = str;
        }
    }

    /* renamed from: o.rp3$b */
    public static final class C16645b {
        public C16645b() {
        }

        public /* synthetic */ C16645b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rp3(C16644a c16644a, id5 id5Var) {
        this(c16644a);
    }

    /* renamed from: a */
    public final String m47043a() {
        return this.f43923a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp3) && sq8.m48644c(this.f43923a, ((rp3) obj).f43923a);
    }

    public int hashCode() {
        String str = this.f43923a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComprehendAuthSchemeParameters(");
        sb.append("operationName=" + this.f43923a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rp3(C16644a c16644a) {
        String strM47045b = c16644a.m47045b();
        if (strM47045b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f43923a = strM47045b;
    }
}
