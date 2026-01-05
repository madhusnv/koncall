package p001o;

/* loaded from: classes3.dex */
public final class kjh {

    /* renamed from: b */
    public static final C14849b f32316b = new C14849b(null);

    /* renamed from: a */
    public final String f32317a;

    /* renamed from: o.kjh$a */
    public static final class C14848a {

        /* renamed from: a */
        public String f32318a;

        /* renamed from: a */
        public final kjh m35788a() {
            return new kjh(this, null);
        }

        /* renamed from: b */
        public final String m35789b() {
            return this.f32318a;
        }

        /* renamed from: c */
        public final void m35790c(String str) {
            this.f32318a = str;
        }
    }

    /* renamed from: o.kjh$b */
    public static final class C14849b {
        public C14849b() {
        }

        public /* synthetic */ C14849b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kjh(C14848a c14848a, id5 id5Var) {
        this(c14848a);
    }

    /* renamed from: a */
    public final String m35787a() {
        return this.f32317a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjh) && sq8.m48644c(this.f32317a, ((kjh) obj).f32317a);
    }

    public int hashCode() {
        String str = this.f32317a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextractAuthSchemeParameters(");
        sb.append("operationName=" + this.f32317a + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public kjh(C14848a c14848a) {
        String strM35789b = c14848a.m35789b();
        if (strM35789b == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f32317a = strM35789b;
    }
}
