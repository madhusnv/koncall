package p001o;

/* loaded from: classes3.dex */
public final class na4 {

    /* renamed from: f */
    public static final C15532b f36610f = new C15532b(null);

    /* renamed from: a */
    public final Boolean f36611a;

    /* renamed from: b */
    public final ehf f36612b;

    /* renamed from: c */
    public final dgf f36613c;

    /* renamed from: d */
    public final String f36614d;

    /* renamed from: e */
    public final String f36615e;

    /* renamed from: o.na4$a */
    public static final class C15531a {

        /* renamed from: a */
        public Boolean f36616a;

        /* renamed from: b */
        public ehf f36617b;

        /* renamed from: c */
        public dgf f36618c;

        /* renamed from: d */
        public String f36619d;

        /* renamed from: e */
        public String f36620e;

        /* renamed from: a */
        public final na4 m40266a() {
            return new na4(this, null);
        }

        /* renamed from: b */
        public final C15531a m40267b() {
            return this;
        }

        /* renamed from: c */
        public final Boolean m40268c() {
            return this.f36616a;
        }

        /* renamed from: d */
        public final ehf m40269d() {
            return this.f36617b;
        }

        /* renamed from: e */
        public final dgf m40270e() {
            return this.f36618c;
        }

        /* renamed from: f */
        public final String m40271f() {
            return this.f36619d;
        }

        /* renamed from: g */
        public final String m40272g() {
            return this.f36620e;
        }

        /* renamed from: h */
        public final void m40273h(Boolean bool) {
            this.f36616a = bool;
        }

        /* renamed from: i */
        public final void m40274i(ehf ehfVar) {
            this.f36617b = ehfVar;
        }

        /* renamed from: j */
        public final void m40275j(dgf dgfVar) {
            this.f36618c = dgfVar;
        }

        /* renamed from: k */
        public final void m40276k(String str) {
            this.f36619d = str;
        }

        /* renamed from: l */
        public final void m40277l(String str) {
            this.f36620e = str;
        }
    }

    /* renamed from: o.na4$b */
    public static final class C15532b {
        public C15532b() {
        }

        public /* synthetic */ C15532b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ na4(C15531a c15531a, id5 id5Var) {
        this(c15531a);
    }

    /* renamed from: a */
    public final ehf m40265a() {
        return this.f36612b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || na4.class != obj.getClass()) {
            return false;
        }
        na4 na4Var = (na4) obj;
        return sq8.m48644c(this.f36611a, na4Var.f36611a) && sq8.m48644c(this.f36612b, na4Var.f36612b) && sq8.m48644c(this.f36613c, na4Var.f36613c) && sq8.m48644c(this.f36614d, na4Var.f36614d) && sq8.m48644c(this.f36615e, na4Var.f36615e);
    }

    public int hashCode() {
        Boolean bool = this.f36611a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        ehf ehfVar = this.f36612b;
        int iHashCode2 = (iHashCode + (ehfVar != null ? ehfVar.hashCode() : 0)) * 31;
        dgf dgfVar = this.f36613c;
        int iHashCode3 = (iHashCode2 + (dgfVar != null ? dgfVar.hashCode() : 0)) * 31;
        String str = this.f36614d;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36615e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateSessionResponse(");
        sb.append("bucketKeyEnabled=" + this.f36611a + ',');
        sb.append("credentials=" + this.f36612b + ',');
        sb.append("serverSideEncryption=" + this.f36613c + ',');
        sb.append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,");
        sb.append("ssekmsKeyId=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public na4(C15531a c15531a) {
        this.f36611a = c15531a.m40268c();
        this.f36612b = c15531a.m40269d();
        this.f36613c = c15531a.m40270e();
        this.f36614d = c15531a.m40271f();
        this.f36615e = c15531a.m40272g();
    }
}
