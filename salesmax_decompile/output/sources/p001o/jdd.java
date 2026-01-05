package p001o;

/* loaded from: classes3.dex */
public final class jdd {

    /* renamed from: b */
    public static final C14506b f30227b = new C14506b(null);

    /* renamed from: a */
    public final String f30228a;

    /* renamed from: o.jdd$a */
    public static final class C14505a {

        /* renamed from: a */
        public String f30229a;

        /* renamed from: a */
        public final jdd m33604a() {
            return new jdd(this, null);
        }

        /* renamed from: b */
        public final String m33605b() {
            return this.f30229a;
        }

        /* renamed from: c */
        public final void m33606c(String str) {
            this.f30229a = str;
        }
    }

    /* renamed from: o.jdd$b */
    public static final class C14506b {
        public C14506b() {
        }

        public /* synthetic */ C14506b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jdd(C14505a c14505a, id5 id5Var) {
        this(c14505a);
    }

    /* renamed from: a */
    public final String m33603a() {
        return this.f30228a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdd) && sq8.m48644c(this.f30228a, ((jdd) obj).f30228a);
    }

    public int hashCode() {
        String str = this.f30228a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PollyAuthSchemeParameters(");
        sb.append("operationName=" + this.f30228a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jdd(C14505a c14505a) {
        String strM33605b = c14505a.m33605b();
        if (strM33605b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f30228a = strM33605b;
    }
}
