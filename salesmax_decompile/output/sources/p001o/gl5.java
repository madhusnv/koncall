package p001o;

/* loaded from: classes3.dex */
public final class gl5 {

    /* renamed from: d */
    public static final C13774b f25406d = new C13774b(null);

    /* renamed from: a */
    public final Boolean f25407a;

    /* renamed from: b */
    public final ame f25408b;

    /* renamed from: c */
    public final String f25409c;

    /* renamed from: o.gl5$a */
    public static final class C13773a {

        /* renamed from: a */
        public Boolean f25410a;

        /* renamed from: b */
        public ame f25411b;

        /* renamed from: c */
        public String f25412c;

        /* renamed from: a */
        public final gl5 m28987a() {
            return new gl5(this, null);
        }

        /* renamed from: b */
        public final C13773a m28988b() {
            return this;
        }

        /* renamed from: c */
        public final Boolean m28989c() {
            return this.f25410a;
        }

        /* renamed from: d */
        public final ame m28990d() {
            return this.f25411b;
        }

        /* renamed from: e */
        public final String m28991e() {
            return this.f25412c;
        }

        /* renamed from: f */
        public final void m28992f(Boolean bool) {
            this.f25410a = bool;
        }

        /* renamed from: g */
        public final void m28993g(ame ameVar) {
            this.f25411b = ameVar;
        }

        /* renamed from: h */
        public final void m28994h(String str) {
            this.f25412c = str;
        }
    }

    /* renamed from: o.gl5$b */
    public static final class C13774b {
        public C13774b() {
        }

        public /* synthetic */ C13774b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gl5(C13773a c13773a, id5 id5Var) {
        this(c13773a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gl5.class != obj.getClass()) {
            return false;
        }
        gl5 gl5Var = (gl5) obj;
        return sq8.m48644c(this.f25407a, gl5Var.f25407a) && sq8.m48644c(this.f25408b, gl5Var.f25408b) && sq8.m48644c(this.f25409c, gl5Var.f25409c);
    }

    public int hashCode() {
        Boolean bool = this.f25407a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        ame ameVar = this.f25408b;
        int iHashCode2 = (iHashCode + (ameVar != null ? ameVar.hashCode() : 0)) * 31;
        String str = this.f25409c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeleteObjectResponse(");
        sb.append("deleteMarker=" + this.f25407a + ',');
        sb.append("requestCharged=" + this.f25408b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("versionId=");
        sb2.append(this.f25409c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gl5(C13773a c13773a) {
        this.f25407a = c13773a.m28989c();
        this.f25408b = c13773a.m28990d();
        this.f25409c = c13773a.m28991e();
    }
}
