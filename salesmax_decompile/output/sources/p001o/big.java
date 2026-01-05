package p001o;

/* loaded from: classes3.dex */
public final class big {

    /* renamed from: d */
    public static final C12438b f16402d = new C12438b(null);

    /* renamed from: a */
    public final oq1 f16403a;

    /* renamed from: b */
    public final String f16404b;

    /* renamed from: c */
    public final int f16405c;

    /* renamed from: o.big$a */
    public static final class C12437a {

        /* renamed from: a */
        public oq1 f16406a;

        /* renamed from: b */
        public String f16407b;

        /* renamed from: c */
        public int f16408c;

        /* renamed from: a */
        public final big m19207a() {
            return new big(this, null);
        }

        /* renamed from: b */
        public final C12437a m19208b() {
            return this;
        }

        /* renamed from: c */
        public final oq1 m19209c() {
            return this.f16406a;
        }

        /* renamed from: d */
        public final String m19210d() {
            return this.f16407b;
        }

        /* renamed from: e */
        public final int m19211e() {
            return this.f16408c;
        }

        /* renamed from: f */
        public final void m19212f(oq1 oq1Var) {
            this.f16406a = oq1Var;
        }

        /* renamed from: g */
        public final void m19213g(String str) {
            this.f16407b = str;
        }

        /* renamed from: h */
        public final void m19214h(int i) {
            this.f16408c = i;
        }
    }

    /* renamed from: o.big$b */
    public static final class C12438b {
        public C12438b() {
        }

        public /* synthetic */ C12438b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ big(C12437a c12437a, id5 id5Var) {
        this(c12437a);
    }

    /* renamed from: a */
    public final oq1 m19206a() {
        return this.f16403a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || big.class != obj.getClass()) {
            return false;
        }
        big bigVar = (big) obj;
        return sq8.m48644c(this.f16403a, bigVar.f16403a) && sq8.m48644c(this.f16404b, bigVar.f16404b) && this.f16405c == bigVar.f16405c;
    }

    public int hashCode() {
        oq1 oq1Var = this.f16403a;
        int iHashCode = (oq1Var != null ? oq1Var.hashCode() : 0) * 31;
        String str = this.f16404b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f16405c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SynthesizeSpeechResponse(");
        sb.append("audioStream=" + this.f16403a + ',');
        sb.append("contentType=" + this.f16404b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("requestCharacters=");
        sb2.append(this.f16405c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public big(C12437a c12437a) {
        this.f16403a = c12437a.m19209c();
        this.f16404b = c12437a.m19210d();
        this.f16405c = c12437a.m19211e();
    }
}
