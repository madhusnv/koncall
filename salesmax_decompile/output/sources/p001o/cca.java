package p001o;

/* loaded from: classes3.dex */
public final class cca {

    /* renamed from: c */
    public static final C12635b f17829c = new C12635b(null);

    /* renamed from: a */
    public final aca f17830a;

    /* renamed from: b */
    public final String f17831b;

    /* renamed from: o.cca$a */
    public static final class C12634a {

        /* renamed from: a */
        public aca f17832a;

        /* renamed from: b */
        public String f17833b;

        /* renamed from: a */
        public final cca m20842a() {
            return new cca(this, null);
        }

        /* renamed from: b */
        public final C12634a m20843b() {
            return this;
        }

        /* renamed from: c */
        public final aca m20844c() {
            return this.f17832a;
        }

        /* renamed from: d */
        public final String m20845d() {
            return this.f17833b;
        }

        /* renamed from: e */
        public final void m20846e(aca acaVar) {
            this.f17832a = acaVar;
        }

        /* renamed from: f */
        public final void m20847f(String str) {
            this.f17833b = str;
        }
    }

    /* renamed from: o.cca$b */
    public static final class C12635b {
        public C12635b() {
        }

        public /* synthetic */ C12635b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cca(C12634a c12634a, id5 id5Var) {
        this(c12634a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cca.class != obj.getClass()) {
            return false;
        }
        cca ccaVar = (cca) obj;
        return sq8.m48644c(this.f17830a, ccaVar.f17830a) && sq8.m48644c(this.f17831b, ccaVar.f17831b);
    }

    public int hashCode() {
        aca acaVar = this.f17830a;
        int iHashCode = (acaVar != null ? acaVar.hashCode() : 0) * 31;
        String str = this.f17831b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LexiconDescription(");
        sb.append("attributes=" + this.f17830a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("name=");
        sb2.append(this.f17831b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cca(C12634a c12634a) {
        this.f17830a = c12634a.m20844c();
        this.f17831b = c12634a.m20845d();
    }
}
