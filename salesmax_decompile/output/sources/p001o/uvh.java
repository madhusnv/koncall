package p001o;

/* loaded from: classes3.dex */
public final class uvh {

    /* renamed from: b */
    public static final C17458b f49559b = new C17458b(null);

    /* renamed from: a */
    public final String f49560a;

    /* renamed from: o.uvh$a */
    public static final class C17457a {

        /* renamed from: a */
        public String f49561a;

        /* renamed from: a */
        public final uvh m52057a() {
            return new uvh(this, null);
        }

        /* renamed from: b */
        public final String m52058b() {
            return this.f49561a;
        }

        /* renamed from: c */
        public final void m52059c(String str) {
            this.f49561a = str;
        }
    }

    /* renamed from: o.uvh$b */
    public static final class C17458b {
        public C17458b() {
        }

        public /* synthetic */ C17458b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ uvh(C17457a c17457a, id5 id5Var) {
        this(c17457a);
    }

    /* renamed from: a */
    public final String m52056a() {
        return this.f49560a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvh) && sq8.m48644c(this.f49560a, ((uvh) obj).f49560a);
    }

    public int hashCode() {
        String str = this.f49560a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TranslateAuthSchemeParameters(");
        sb.append("operationName=" + this.f49560a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public uvh(C17457a c17457a) {
        String strM52058b = c17457a.m52058b();
        if (strM52058b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f49560a = strM52058b;
    }
}
