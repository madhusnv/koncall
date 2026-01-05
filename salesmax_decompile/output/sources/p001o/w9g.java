package p001o;

/* loaded from: classes2.dex */
public final class w9g {

    /* renamed from: b */
    public static final C17804b f51662b = new C17804b(null);

    /* renamed from: a */
    public final String f51663a;

    /* renamed from: o.w9g$a */
    public static final class C17803a {

        /* renamed from: a */
        public String f51664a;

        /* renamed from: a */
        public final w9g m54123a() {
            return new w9g(this, null);
        }

        /* renamed from: b */
        public final String m54124b() {
            return this.f51664a;
        }

        /* renamed from: c */
        public final void m54125c(String str) {
            this.f51664a = str;
        }
    }

    /* renamed from: o.w9g$b */
    public static final class C17804b {
        public C17804b() {
        }

        public /* synthetic */ C17804b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ w9g(C17803a c17803a, id5 id5Var) {
        this(c17803a);
    }

    /* renamed from: a */
    public final String m54122a() {
        return this.f51663a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9g) && sq8.m48644c(this.f51663a, ((w9g) obj).f51663a);
    }

    public int hashCode() {
        String str = this.f51663a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StsAuthSchemeParameters(");
        sb.append("operationName=" + this.f51663a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public w9g(C17803a c17803a) {
        String strM54124b = c17803a.m54124b();
        if (strM54124b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f51663a = strM54124b;
    }
}
