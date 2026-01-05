package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class pee {

    /* renamed from: d */
    public static final C16094b f39963d = new C16094b(null);

    /* renamed from: a */
    public final List f39964a;

    /* renamed from: b */
    public final nfc f39965b;

    /* renamed from: c */
    public final List f39966c;

    /* renamed from: o.pee$a */
    public static final class C16093a {

        /* renamed from: a */
        public List f39967a;

        /* renamed from: b */
        public nfc f39968b;

        /* renamed from: c */
        public List f39969c;

        /* renamed from: a */
        public final pee m43535a() {
            return new pee(this, null);
        }

        /* renamed from: b */
        public final C16093a m43536b() {
            return this;
        }

        /* renamed from: c */
        public final List m43537c() {
            return this.f39967a;
        }

        /* renamed from: d */
        public final nfc m43538d() {
            return this.f39968b;
        }

        /* renamed from: e */
        public final List m43539e() {
            return this.f39969c;
        }

        /* renamed from: f */
        public final void m43540f(List list) {
            this.f39967a = list;
        }

        /* renamed from: g */
        public final void m43541g(nfc nfcVar) {
            this.f39968b = nfcVar;
        }

        /* renamed from: h */
        public final void m43542h(List list) {
            this.f39969c = list;
        }
    }

    /* renamed from: o.pee$b */
    public static final class C16094b {
        public C16094b() {
        }

        public /* synthetic */ C16094b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ pee(C16093a c16093a, id5 id5Var) {
        this(c16093a);
    }

    /* renamed from: a */
    public final List m43534a() {
        return this.f39964a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pee.class != obj.getClass()) {
            return false;
        }
        pee peeVar = (pee) obj;
        return sq8.m48644c(this.f39964a, peeVar.f39964a) && sq8.m48644c(this.f39965b, peeVar.f39965b) && sq8.m48644c(this.f39966c, peeVar.f39966c);
    }

    public int hashCode() {
        List list = this.f39964a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        nfc nfcVar = this.f39965b;
        int iHashCode2 = (iHashCode + (nfcVar != null ? nfcVar.hashCode() : 0)) * 31;
        List list2 = this.f39966c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecognizeCelebritiesResponse(");
        sb.append("celebrityFaces=" + this.f39964a + ',');
        sb.append("orientationCorrection=" + this.f39965b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unrecognizedFaces=");
        sb2.append(this.f39966c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public pee(C16093a c16093a) {
        this.f39964a = c16093a.m43537c();
        this.f39965b = c16093a.m43538d();
        this.f39966c = c16093a.m43539e();
    }
}
