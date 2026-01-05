package p001o;

/* loaded from: classes3.dex */
public final class dp5 {

    /* renamed from: c */
    public static final C13011b f20371c = new C13011b(null);

    /* renamed from: a */
    public final sg9 f20372a;

    /* renamed from: b */
    public final String f20373b;

    /* renamed from: o.dp5$a */
    public static final class C13010a {

        /* renamed from: a */
        public sg9 f20374a;

        /* renamed from: b */
        public String f20375b;

        /* renamed from: a */
        public final dp5 m23657a() {
            return new dp5(this, null);
        }

        /* renamed from: b */
        public final sg9 m23658b() {
            return this.f20374a;
        }

        /* renamed from: c */
        public final String m23659c() {
            return this.f20375b;
        }

        /* renamed from: d */
        public final void m23660d(sg9 sg9Var) {
            this.f20374a = sg9Var;
        }

        /* renamed from: e */
        public final void m23661e(String str) {
            this.f20375b = str;
        }
    }

    /* renamed from: o.dp5$b */
    public static final class C13011b {
        public C13011b() {
        }

        public /* synthetic */ C13011b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ dp5(C13010a c13010a, id5 id5Var) {
        this(c13010a);
    }

    /* renamed from: a */
    public final sg9 m23655a() {
        return this.f20372a;
    }

    /* renamed from: b */
    public final String m23656b() {
        return this.f20373b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dp5.class != obj.getClass()) {
            return false;
        }
        dp5 dp5Var = (dp5) obj;
        return sq8.m48644c(this.f20372a, dp5Var.f20372a) && sq8.m48644c(this.f20373b, dp5Var.f20373b);
    }

    public int hashCode() {
        sg9 sg9Var = this.f20372a;
        int iHashCode = (sg9Var != null ? sg9Var.hashCode() : 0) * 31;
        String str = this.f20373b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectSentimentRequest(");
        sb.append("languageCode=" + this.f20372a + ',');
        sb.append("text=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public dp5(C13010a c13010a) {
        this.f20372a = c13010a.m23658b();
        this.f20373b = c13010a.m23659c();
    }
}
