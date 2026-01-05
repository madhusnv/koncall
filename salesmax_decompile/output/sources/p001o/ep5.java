package p001o;

/* loaded from: classes3.dex */
public final class ep5 {

    /* renamed from: c */
    public static final C13244b f22013c = new C13244b(null);

    /* renamed from: a */
    public final gef f22014a;

    /* renamed from: b */
    public final eef f22015b;

    /* renamed from: o.ep5$a */
    public static final class C13243a {

        /* renamed from: a */
        public gef f22016a;

        /* renamed from: b */
        public eef f22017b;

        /* renamed from: a */
        public final ep5 m25408a() {
            return new ep5(this, null);
        }

        /* renamed from: b */
        public final C13243a m25409b() {
            return this;
        }

        /* renamed from: c */
        public final gef m25410c() {
            return this.f22016a;
        }

        /* renamed from: d */
        public final eef m25411d() {
            return this.f22017b;
        }

        /* renamed from: e */
        public final void m25412e(gef gefVar) {
            this.f22016a = gefVar;
        }

        /* renamed from: f */
        public final void m25413f(eef eefVar) {
            this.f22017b = eefVar;
        }
    }

    /* renamed from: o.ep5$b */
    public static final class C13244b {
        public C13244b() {
        }

        public /* synthetic */ C13244b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ep5(C13243a c13243a, id5 id5Var) {
        this(c13243a);
    }

    /* renamed from: a */
    public final gef m25406a() {
        return this.f22014a;
    }

    /* renamed from: b */
    public final eef m25407b() {
        return this.f22015b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ep5.class != obj.getClass()) {
            return false;
        }
        ep5 ep5Var = (ep5) obj;
        return sq8.m48644c(this.f22014a, ep5Var.f22014a) && sq8.m48644c(this.f22015b, ep5Var.f22015b);
    }

    public int hashCode() {
        gef gefVar = this.f22014a;
        int iHashCode = (gefVar != null ? gefVar.hashCode() : 0) * 31;
        eef eefVar = this.f22015b;
        return iHashCode + (eefVar != null ? eefVar.hashCode() : 0);
    }

    public String toString() {
        String str = "DetectSentimentResponse(*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public ep5(C13243a c13243a) {
        this.f22014a = c13243a.m25410c();
        this.f22015b = c13243a.m25411d();
    }
}
