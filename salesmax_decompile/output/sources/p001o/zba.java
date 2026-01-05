package p001o;

/* loaded from: classes3.dex */
public final class zba {

    /* renamed from: c */
    public static final C18609b f56900c = new C18609b(null);

    /* renamed from: a */
    public final String f56901a;

    /* renamed from: b */
    public final String f56902b;

    /* renamed from: o.zba$a */
    public static final class C18608a {

        /* renamed from: a */
        public String f56903a;

        /* renamed from: b */
        public String f56904b;

        /* renamed from: a */
        public final zba m59148a() {
            return new zba(this, null);
        }

        /* renamed from: b */
        public final C18608a m59149b() {
            return this;
        }

        /* renamed from: c */
        public final String m59150c() {
            return this.f56903a;
        }

        /* renamed from: d */
        public final String m59151d() {
            return this.f56904b;
        }

        /* renamed from: e */
        public final void m59152e(String str) {
            this.f56903a = str;
        }

        /* renamed from: f */
        public final void m59153f(String str) {
            this.f56904b = str;
        }
    }

    /* renamed from: o.zba$b */
    public static final class C18609b {
        public C18609b() {
        }

        public /* synthetic */ C18609b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zba(C18608a c18608a, id5 id5Var) {
        this(c18608a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zba.class != obj.getClass()) {
            return false;
        }
        zba zbaVar = (zba) obj;
        return sq8.m48644c(this.f56901a, zbaVar.f56901a) && sq8.m48644c(this.f56902b, zbaVar.f56902b);
    }

    public int hashCode() {
        String str = this.f56901a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56902b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lexicon(");
        sb.append("content=*** Sensitive Data Redacted ***,");
        sb.append("name=" + this.f56902b);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zba(C18608a c18608a) {
        this.f56901a = c18608a.m59150c();
        this.f56902b = c18608a.m59151d();
    }
}
