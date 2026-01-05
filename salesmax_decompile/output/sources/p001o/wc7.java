package p001o;

/* loaded from: classes3.dex */
public final class wc7 {

    /* renamed from: c */
    public static final C17818b f51780c = new C17818b(null);

    /* renamed from: a */
    public final String f51781a;

    /* renamed from: b */
    public final String f51782b;

    /* renamed from: o.wc7$a */
    public static final class C17817a {

        /* renamed from: a */
        public String f51783a;

        /* renamed from: b */
        public String f51784b;

        /* renamed from: a */
        public final wc7 m54205a() {
            return new wc7(this, null);
        }

        /* renamed from: b */
        public final String m54206b() {
            return this.f51783a;
        }

        /* renamed from: c */
        public final String m54207c() {
            return this.f51784b;
        }

        /* renamed from: d */
        public final void m54208d(String str) {
            this.f51783a = str;
        }

        /* renamed from: e */
        public final void m54209e(String str) {
            this.f51784b = str;
        }
    }

    /* renamed from: o.wc7$b */
    public static final class C17818b {
        public C17818b() {
        }

        public /* synthetic */ C17818b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wc7(C17817a c17817a, id5 id5Var) {
        this(c17817a);
    }

    /* renamed from: a */
    public final String m54203a() {
        return this.f51781a;
    }

    /* renamed from: b */
    public final String m54204b() {
        return this.f51782b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wc7.class != obj.getClass()) {
            return false;
        }
        wc7 wc7Var = (wc7) obj;
        return sq8.m48644c(this.f51781a, wc7Var.f51781a) && sq8.m48644c(this.f51782b, wc7Var.f51782b);
    }

    public int hashCode() {
        String str = this.f51781a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f51782b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForgetDeviceRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("deviceKey=" + this.f51782b);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wc7(C17817a c17817a) {
        this.f51781a = c17817a.m54206b();
        this.f51782b = c17817a.m54207c();
    }
}
