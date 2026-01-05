package p001o;

/* loaded from: classes3.dex */
public final class cp7 {

    /* renamed from: c */
    public static final C12720b f18478c = new C12720b(null);

    /* renamed from: a */
    public final hc4 f18479a;

    /* renamed from: b */
    public final String f18480b;

    /* renamed from: o.cp7$a */
    public static final class C12719a {

        /* renamed from: a */
        public hc4 f18481a;

        /* renamed from: b */
        public String f18482b;

        /* renamed from: a */
        public final cp7 m21567a() {
            return new cp7(this, null);
        }

        /* renamed from: b */
        public final C12719a m21568b() {
            return this;
        }

        /* renamed from: c */
        public final hc4 m21569c() {
            return this.f18481a;
        }

        /* renamed from: d */
        public final String m21570d() {
            return this.f18482b;
        }

        /* renamed from: e */
        public final void m21571e(hc4 hc4Var) {
            this.f18481a = hc4Var;
        }

        /* renamed from: f */
        public final void m21572f(String str) {
            this.f18482b = str;
        }
    }

    /* renamed from: o.cp7$b */
    public static final class C12720b {
        public C12720b() {
        }

        public /* synthetic */ C12720b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cp7(C12719a c12719a, id5 id5Var) {
        this(c12719a);
    }

    /* renamed from: a */
    public final hc4 m21565a() {
        return this.f18479a;
    }

    /* renamed from: b */
    public final String m21566b() {
        return this.f18480b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cp7.class != obj.getClass()) {
            return false;
        }
        cp7 cp7Var = (cp7) obj;
        return sq8.m48644c(this.f18479a, cp7Var.f18479a) && sq8.m48644c(this.f18480b, cp7Var.f18480b);
    }

    public int hashCode() {
        hc4 hc4Var = this.f18479a;
        int iHashCode = (hc4Var != null ? hc4Var.hashCode() : 0) * 31;
        String str = this.f18480b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetCredentialsForIdentityResponse(");
        sb.append("credentials=" + this.f18479a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("identityId=");
        sb2.append(this.f18480b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cp7(C12719a c12719a) {
        this.f18479a = c12719a.m21569c();
        this.f18480b = c12719a.m21570d();
    }
}
