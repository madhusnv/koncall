package p001o;

/* loaded from: classes3.dex */
public final class gm3 {

    /* renamed from: c */
    public static final C13779b f25435c = new C13779b(null);

    /* renamed from: a */
    public final String f25436a;

    /* renamed from: b */
    public final vv5 f25437b;

    /* renamed from: o.gm3$a */
    public static final class C13778a {

        /* renamed from: a */
        public String f25438a;

        /* renamed from: b */
        public vv5 f25439b;

        /* renamed from: a */
        public final gm3 m29028a() {
            return new gm3(this, null);
        }

        /* renamed from: b */
        public final String m29029b() {
            return this.f25438a;
        }

        /* renamed from: c */
        public final vv5 m29030c() {
            return this.f25439b;
        }

        /* renamed from: d */
        public final void m29031d(String str) {
            this.f25438a = str;
        }

        /* renamed from: e */
        public final void m29032e(vv5 vv5Var) {
            this.f25439b = vv5Var;
        }
    }

    /* renamed from: o.gm3$b */
    public static final class C13779b {
        public C13779b() {
        }

        public /* synthetic */ C13779b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gm3(C13778a c13778a, id5 id5Var) {
        this(c13778a);
    }

    /* renamed from: a */
    public final String m29026a() {
        return this.f25436a;
    }

    /* renamed from: b */
    public final vv5 m29027b() {
        return this.f25437b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gm3.class != obj.getClass()) {
            return false;
        }
        gm3 gm3Var = (gm3) obj;
        return sq8.m48644c(this.f25436a, gm3Var.f25436a) && sq8.m48644c(this.f25437b, gm3Var.f25437b);
    }

    public int hashCode() {
        String str = this.f25436a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        vv5 vv5Var = this.f25437b;
        return iHashCode + (vv5Var != null ? vv5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompleteWebAuthnRegistrationRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("credential=" + this.f25437b);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gm3(C13778a c13778a) {
        this.f25436a = c13778a.m29029b();
        this.f25437b = c13778a.m29030c();
    }
}
