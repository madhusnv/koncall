package p001o;

/* loaded from: classes3.dex */
public final class ihe {

    /* renamed from: b */
    public static final C14297b f28684b = new C14297b(null);

    /* renamed from: a */
    public final String f28685a;

    /* renamed from: o.ihe$a */
    public static final class C14296a {

        /* renamed from: a */
        public String f28686a;

        /* renamed from: a */
        public final ihe m32150a() {
            return new ihe(this, null);
        }

        /* renamed from: b */
        public final String m32151b() {
            return this.f28686a;
        }

        /* renamed from: c */
        public final void m32152c(String str) {
            this.f28686a = str;
        }
    }

    /* renamed from: o.ihe$b */
    public static final class C14297b {
        public C14297b() {
        }

        public /* synthetic */ C14297b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ihe(C14296a c14296a, id5 id5Var) {
        this(c14296a);
    }

    /* renamed from: a */
    public final String m32149a() {
        return this.f28685a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihe) && sq8.m48644c(this.f28685a, ((ihe) obj).f28685a);
    }

    public int hashCode() {
        String str = this.f28685a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RekognitionAuthSchemeParameters(");
        sb.append("operationName=" + this.f28685a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ihe(C14296a c14296a) {
        String strM32151b = c14296a.m32151b();
        if (strM32151b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f28685a = strM32151b;
    }
}
