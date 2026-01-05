package p001o;

/* loaded from: classes3.dex */
public final class co5 {

    /* renamed from: c */
    public static final C12718b f18449c = new C12718b(null);

    /* renamed from: a */
    public final sg9 f18450a;

    /* renamed from: b */
    public final String f18451b;

    /* renamed from: o.co5$a */
    public static final class C12717a {

        /* renamed from: a */
        public sg9 f18452a;

        /* renamed from: b */
        public String f18453b;

        /* renamed from: a */
        public final co5 m21546a() {
            return new co5(this, null);
        }

        /* renamed from: b */
        public final sg9 m21547b() {
            return this.f18452a;
        }

        /* renamed from: c */
        public final String m21548c() {
            return this.f18453b;
        }

        /* renamed from: d */
        public final void m21549d(sg9 sg9Var) {
            this.f18452a = sg9Var;
        }

        /* renamed from: e */
        public final void m21550e(String str) {
            this.f18453b = str;
        }
    }

    /* renamed from: o.co5$b */
    public static final class C12718b {
        public C12718b() {
        }

        public /* synthetic */ C12718b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ co5(C12717a c12717a, id5 id5Var) {
        this(c12717a);
    }

    /* renamed from: a */
    public final sg9 m21544a() {
        return this.f18450a;
    }

    /* renamed from: b */
    public final String m21545b() {
        return this.f18451b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || co5.class != obj.getClass()) {
            return false;
        }
        co5 co5Var = (co5) obj;
        return sq8.m48644c(this.f18450a, co5Var.f18450a) && sq8.m48644c(this.f18451b, co5Var.f18451b);
    }

    public int hashCode() {
        sg9 sg9Var = this.f18450a;
        int iHashCode = (sg9Var != null ? sg9Var.hashCode() : 0) * 31;
        String str = this.f18451b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectKeyPhrasesRequest(");
        sb.append("languageCode=" + this.f18450a + ',');
        sb.append("text=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public co5(C12717a c12717a) {
        this.f18450a = c12717a.m21547b();
        this.f18451b = c12717a.m21548c();
    }
}
