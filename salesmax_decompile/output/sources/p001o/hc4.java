package p001o;

/* loaded from: classes3.dex */
public final class hc4 {

    /* renamed from: e */
    public static final C13914b f26639e = new C13914b(null);

    /* renamed from: a */
    public final String f26640a;

    /* renamed from: b */
    public final gk8 f26641b;

    /* renamed from: c */
    public final String f26642c;

    /* renamed from: d */
    public final String f26643d;

    /* renamed from: o.hc4$a */
    public static final class C13913a {

        /* renamed from: a */
        public String f26644a;

        /* renamed from: b */
        public gk8 f26645b;

        /* renamed from: c */
        public String f26646c;

        /* renamed from: d */
        public String f26647d;

        /* renamed from: a */
        public final hc4 m30206a() {
            return new hc4(this, null);
        }

        /* renamed from: b */
        public final C13913a m30207b() {
            return this;
        }

        /* renamed from: c */
        public final String m30208c() {
            return this.f26644a;
        }

        /* renamed from: d */
        public final gk8 m30209d() {
            return this.f26645b;
        }

        /* renamed from: e */
        public final String m30210e() {
            return this.f26646c;
        }

        /* renamed from: f */
        public final String m30211f() {
            return this.f26647d;
        }

        /* renamed from: g */
        public final void m30212g(String str) {
            this.f26644a = str;
        }

        /* renamed from: h */
        public final void m30213h(gk8 gk8Var) {
            this.f26645b = gk8Var;
        }

        /* renamed from: i */
        public final void m30214i(String str) {
            this.f26646c = str;
        }

        /* renamed from: j */
        public final void m30215j(String str) {
            this.f26647d = str;
        }
    }

    /* renamed from: o.hc4$b */
    public static final class C13914b {
        public C13914b() {
        }

        public /* synthetic */ C13914b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hc4(C13913a c13913a, id5 id5Var) {
        this(c13913a);
    }

    /* renamed from: a */
    public final String m30202a() {
        return this.f26640a;
    }

    /* renamed from: b */
    public final gk8 m30203b() {
        return this.f26641b;
    }

    /* renamed from: c */
    public final String m30204c() {
        return this.f26642c;
    }

    /* renamed from: d */
    public final String m30205d() {
        return this.f26643d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hc4.class != obj.getClass()) {
            return false;
        }
        hc4 hc4Var = (hc4) obj;
        return sq8.m48644c(this.f26640a, hc4Var.f26640a) && sq8.m48644c(this.f26641b, hc4Var.f26641b) && sq8.m48644c(this.f26642c, hc4Var.f26642c) && sq8.m48644c(this.f26643d, hc4Var.f26643d);
    }

    public int hashCode() {
        String str = this.f26640a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        gk8 gk8Var = this.f26641b;
        int iHashCode2 = (iHashCode + (gk8Var != null ? gk8Var.hashCode() : 0)) * 31;
        String str2 = this.f26642c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26643d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Credentials(");
        sb.append("accessKeyId=" + this.f26640a + ',');
        sb.append("expiration=" + this.f26641b + ',');
        sb.append("secretKey=*** Sensitive Data Redacted ***,");
        sb.append("sessionToken=" + this.f26643d);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hc4(C13913a c13913a) {
        this.f26640a = c13913a.m30208c();
        this.f26641b = c13913a.m30209d();
        this.f26642c = c13913a.m30210e();
        this.f26643d = c13913a.m30211f();
    }
}
