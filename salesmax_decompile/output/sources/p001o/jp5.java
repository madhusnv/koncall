package p001o;

/* loaded from: classes3.dex */
public final class jp5 {

    /* renamed from: c */
    public static final C14626b f30895c = new C14626b(null);

    /* renamed from: a */
    public final ohg f30896a;

    /* renamed from: b */
    public final String f30897b;

    /* renamed from: o.jp5$a */
    public static final class C14625a {

        /* renamed from: a */
        public ohg f30898a;

        /* renamed from: b */
        public String f30899b;

        /* renamed from: a */
        public final jp5 m34199a() {
            return new jp5(this, null);
        }

        /* renamed from: b */
        public final ohg m34200b() {
            return this.f30898a;
        }

        /* renamed from: c */
        public final String m34201c() {
            return this.f30899b;
        }

        /* renamed from: d */
        public final void m34202d(ohg ohgVar) {
            this.f30898a = ohgVar;
        }

        /* renamed from: e */
        public final void m34203e(String str) {
            this.f30899b = str;
        }
    }

    /* renamed from: o.jp5$b */
    public static final class C14626b {
        public C14626b() {
        }

        public /* synthetic */ C14626b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jp5(C14625a c14625a, id5 id5Var) {
        this(c14625a);
    }

    /* renamed from: a */
    public final ohg m34197a() {
        return this.f30896a;
    }

    /* renamed from: b */
    public final String m34198b() {
        return this.f30897b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jp5.class != obj.getClass()) {
            return false;
        }
        jp5 jp5Var = (jp5) obj;
        return sq8.m48644c(this.f30896a, jp5Var.f30896a) && sq8.m48644c(this.f30897b, jp5Var.f30897b);
    }

    public int hashCode() {
        ohg ohgVar = this.f30896a;
        int iHashCode = (ohgVar != null ? ohgVar.hashCode() : 0) * 31;
        String str = this.f30897b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectSyntaxRequest(");
        sb.append("languageCode=" + this.f30896a + ',');
        sb.append("text=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jp5(C14625a c14625a) {
        this.f30896a = c14625a.m34200b();
        this.f30897b = c14625a.m34201c();
    }
}
