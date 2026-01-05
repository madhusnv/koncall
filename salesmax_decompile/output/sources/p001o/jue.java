package p001o;

/* loaded from: classes2.dex */
public final class jue {

    /* renamed from: e */
    public static final C14665b f31105e = new C14665b(null);

    /* renamed from: a */
    public final String f31106a;

    /* renamed from: b */
    public final long f31107b;

    /* renamed from: c */
    public final String f31108c;

    /* renamed from: d */
    public final String f31109d;

    /* renamed from: o.jue$a */
    public static final class C14664a {

        /* renamed from: a */
        public String f31110a;

        /* renamed from: b */
        public long f31111b;

        /* renamed from: c */
        public String f31112c;

        /* renamed from: d */
        public String f31113d;

        /* renamed from: a */
        public final jue m34530a() {
            return new jue(this, null);
        }

        /* renamed from: b */
        public final C14664a m34531b() {
            return this;
        }

        /* renamed from: c */
        public final String m34532c() {
            return this.f31110a;
        }

        /* renamed from: d */
        public final long m34533d() {
            return this.f31111b;
        }

        /* renamed from: e */
        public final String m34534e() {
            return this.f31112c;
        }

        /* renamed from: f */
        public final String m34535f() {
            return this.f31113d;
        }

        /* renamed from: g */
        public final void m34536g(String str) {
            this.f31110a = str;
        }

        /* renamed from: h */
        public final void m34537h(long j) {
            this.f31111b = j;
        }

        /* renamed from: i */
        public final void m34538i(String str) {
            this.f31112c = str;
        }

        /* renamed from: j */
        public final void m34539j(String str) {
            this.f31113d = str;
        }
    }

    /* renamed from: o.jue$b */
    public static final class C14665b {
        public C14665b() {
        }

        public /* synthetic */ C14665b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jue(C14664a c14664a, id5 id5Var) {
        this(c14664a);
    }

    /* renamed from: a */
    public final String m34526a() {
        return this.f31106a;
    }

    /* renamed from: b */
    public final long m34527b() {
        return this.f31107b;
    }

    /* renamed from: c */
    public final String m34528c() {
        return this.f31108c;
    }

    /* renamed from: d */
    public final String m34529d() {
        return this.f31109d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jue.class != obj.getClass()) {
            return false;
        }
        jue jueVar = (jue) obj;
        return sq8.m48644c(this.f31106a, jueVar.f31106a) && this.f31107b == jueVar.f31107b && sq8.m48644c(this.f31108c, jueVar.f31108c) && sq8.m48644c(this.f31109d, jueVar.f31109d);
    }

    public int hashCode() {
        String str = this.f31106a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f31107b)) * 31;
        String str2 = this.f31108c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31109d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoleCredentials(");
        sb.append("accessKeyId=" + this.f31106a + ',');
        sb.append("expiration=" + this.f31107b + ',');
        sb.append("secretAccessKey=*** Sensitive Data Redacted ***,");
        sb.append("sessionToken=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jue(C14664a c14664a) {
        this.f31106a = c14664a.m34532c();
        this.f31107b = c14664a.m34533d();
        this.f31108c = c14664a.m34534e();
        this.f31109d = c14664a.m34535f();
    }
}
