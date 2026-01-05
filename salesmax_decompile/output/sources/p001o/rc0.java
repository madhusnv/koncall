package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class rc0 {

    /* renamed from: e */
    public static final C16583b f43349e = new C16583b(null);

    /* renamed from: a */
    public final String f43350a;

    /* renamed from: b */
    public final List f43351b;

    /* renamed from: c */
    public final cw5 f43352c;

    /* renamed from: d */
    public final s58 f43353d;

    /* renamed from: o.rc0$a */
    public static final class C16582a {

        /* renamed from: a */
        public String f43354a;

        /* renamed from: b */
        public List f43355b;

        /* renamed from: c */
        public cw5 f43356c;

        /* renamed from: d */
        public s58 f43357d;

        /* renamed from: a */
        public final rc0 m46492a() {
            return new rc0(this, null);
        }

        /* renamed from: b */
        public final C16582a m46493b() {
            return this;
        }

        /* renamed from: c */
        public final String m46494c() {
            return this.f43354a;
        }

        /* renamed from: d */
        public final List m46495d() {
            return this.f43355b;
        }

        /* renamed from: e */
        public final cw5 m46496e() {
            return this.f43356c;
        }

        /* renamed from: f */
        public final s58 m46497f() {
            return this.f43357d;
        }

        /* renamed from: g */
        public final void m46498g(String str) {
            this.f43354a = str;
        }

        /* renamed from: h */
        public final void m46499h(List list) {
            this.f43355b = list;
        }

        /* renamed from: i */
        public final void m46500i(cw5 cw5Var) {
            this.f43356c = cw5Var;
        }

        /* renamed from: j */
        public final void m46501j(s58 s58Var) {
            this.f43357d = s58Var;
        }
    }

    /* renamed from: o.rc0$b */
    public static final class C16583b {
        public C16583b() {
        }

        public /* synthetic */ C16583b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rc0(C16582a c16582a, id5 id5Var) {
        this(c16582a);
    }

    /* renamed from: a */
    public final List m46491a() {
        return this.f43351b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rc0.class != obj.getClass()) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        return sq8.m48644c(this.f43350a, rc0Var.f43350a) && sq8.m48644c(this.f43351b, rc0Var.f43351b) && sq8.m48644c(this.f43352c, rc0Var.f43352c) && sq8.m48644c(this.f43353d, rc0Var.f43353d);
    }

    public int hashCode() {
        String str = this.f43350a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f43351b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        cw5 cw5Var = this.f43352c;
        int iHashCode3 = (iHashCode2 + (cw5Var != null ? cw5Var.hashCode() : 0)) * 31;
        s58 s58Var = this.f43353d;
        return iHashCode3 + (s58Var != null ? s58Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnalyzeDocumentResponse(");
        sb.append("analyzeDocumentModelVersion=" + this.f43350a + ',');
        sb.append("blocks=" + this.f43351b + ',');
        sb.append("documentMetadata=" + this.f43352c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("humanLoopActivationOutput=");
        sb2.append(this.f43353d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rc0(C16582a c16582a) {
        this.f43350a = c16582a.m46494c();
        this.f43351b = c16582a.m46495d();
        this.f43352c = c16582a.m46496e();
        this.f43353d = c16582a.m46497f();
    }
}
