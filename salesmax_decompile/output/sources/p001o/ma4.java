package p001o;

/* loaded from: classes3.dex */
public final class ma4 {

    /* renamed from: f */
    public static final C15259b f35039f = new C15259b(null);

    /* renamed from: a */
    public final String f35040a;

    /* renamed from: b */
    public final Boolean f35041b;

    /* renamed from: c */
    public final dgf f35042c;

    /* renamed from: d */
    public final String f35043d;

    /* renamed from: e */
    public final String f35044e;

    /* renamed from: o.ma4$a */
    public static final class C15258a {

        /* renamed from: a */
        public String f35045a;

        /* renamed from: b */
        public Boolean f35046b;

        /* renamed from: c */
        public dgf f35047c;

        /* renamed from: d */
        public String f35048d;

        /* renamed from: e */
        public String f35049e;

        /* renamed from: a */
        public final ma4 m38620a() {
            return new ma4(this, null);
        }

        /* renamed from: b */
        public final String m38621b() {
            return this.f35045a;
        }

        /* renamed from: c */
        public final Boolean m38622c() {
            return this.f35046b;
        }

        /* renamed from: d */
        public final dgf m38623d() {
            return this.f35047c;
        }

        /* renamed from: e */
        public final khf m38624e() {
            return null;
        }

        /* renamed from: f */
        public final String m38625f() {
            return this.f35048d;
        }

        /* renamed from: g */
        public final String m38626g() {
            return this.f35049e;
        }

        /* renamed from: h */
        public final void m38627h(String str) {
            this.f35045a = str;
        }
    }

    /* renamed from: o.ma4$b */
    public static final class C15259b {
        public C15259b() {
        }

        public /* synthetic */ C15259b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ma4(C15258a c15258a, id5 id5Var) {
        this(c15258a);
    }

    /* renamed from: a */
    public final String m38614a() {
        return this.f35040a;
    }

    /* renamed from: b */
    public final Boolean m38615b() {
        return this.f35041b;
    }

    /* renamed from: c */
    public final dgf m38616c() {
        return this.f35042c;
    }

    /* renamed from: d */
    public final khf m38617d() {
        return null;
    }

    /* renamed from: e */
    public final String m38618e() {
        return this.f35043d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ma4.class != obj.getClass()) {
            return false;
        }
        ma4 ma4Var = (ma4) obj;
        return sq8.m48644c(this.f35040a, ma4Var.f35040a) && sq8.m48644c(this.f35041b, ma4Var.f35041b) && sq8.m48644c(this.f35042c, ma4Var.f35042c) && sq8.m48644c(null, null) && sq8.m48644c(this.f35043d, ma4Var.f35043d) && sq8.m48644c(this.f35044e, ma4Var.f35044e);
    }

    /* renamed from: f */
    public final String m38619f() {
        return this.f35044e;
    }

    public int hashCode() {
        String str = this.f35040a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f35041b;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        dgf dgfVar = this.f35042c;
        int iHashCode3 = (((iHashCode2 + (dgfVar != null ? dgfVar.hashCode() : 0)) * 31) + 0) * 31;
        String str2 = this.f35043d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35044e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateSessionRequest(");
        sb.append("bucket=" + this.f35040a + ',');
        sb.append("bucketKeyEnabled=" + this.f35041b + ',');
        sb.append("serverSideEncryption=" + this.f35042c + ',');
        sb.append("sessionMode=" + ((Object) null) + ',');
        sb.append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,");
        sb.append("ssekmsKeyId=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ma4(C15258a c15258a) {
        this.f35040a = c15258a.m38621b();
        this.f35041b = c15258a.m38622c();
        this.f35042c = c15258a.m38623d();
        c15258a.m38624e();
        this.f35043d = c15258a.m38625f();
        this.f35044e = c15258a.m38626g();
    }
}
