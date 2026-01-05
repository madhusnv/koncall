package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class mk3 {

    /* renamed from: f */
    public static final C15346b f35580f = new C15346b(null);

    /* renamed from: a */
    public final List f35581a;

    /* renamed from: b */
    public final qk3 f35582b;

    /* renamed from: c */
    public final nfc f35583c;

    /* renamed from: d */
    public final nfc f35584d;

    /* renamed from: e */
    public final List f35585e;

    /* renamed from: o.mk3$a */
    public static final class C15345a {

        /* renamed from: a */
        public List f35586a;

        /* renamed from: b */
        public qk3 f35587b;

        /* renamed from: c */
        public nfc f35588c;

        /* renamed from: d */
        public nfc f35589d;

        /* renamed from: e */
        public List f35590e;

        /* renamed from: a */
        public final mk3 m39257a() {
            return new mk3(this, null);
        }

        /* renamed from: b */
        public final C15345a m39258b() {
            return this;
        }

        /* renamed from: c */
        public final List m39259c() {
            return this.f35586a;
        }

        /* renamed from: d */
        public final qk3 m39260d() {
            return this.f35587b;
        }

        /* renamed from: e */
        public final nfc m39261e() {
            return this.f35588c;
        }

        /* renamed from: f */
        public final nfc m39262f() {
            return this.f35589d;
        }

        /* renamed from: g */
        public final List m39263g() {
            return this.f35590e;
        }

        /* renamed from: h */
        public final void m39264h(List list) {
            this.f35586a = list;
        }

        /* renamed from: i */
        public final void m39265i(qk3 qk3Var) {
            this.f35587b = qk3Var;
        }

        /* renamed from: j */
        public final void m39266j(nfc nfcVar) {
            this.f35588c = nfcVar;
        }

        /* renamed from: k */
        public final void m39267k(nfc nfcVar) {
            this.f35589d = nfcVar;
        }

        /* renamed from: l */
        public final void m39268l(List list) {
            this.f35590e = list;
        }
    }

    /* renamed from: o.mk3$b */
    public static final class C15346b {
        public C15346b() {
        }

        public /* synthetic */ C15346b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mk3(C15345a c15345a, id5 id5Var) {
        this(c15345a);
    }

    /* renamed from: a */
    public final List m39256a() {
        return this.f35581a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mk3.class != obj.getClass()) {
            return false;
        }
        mk3 mk3Var = (mk3) obj;
        return sq8.m48644c(this.f35581a, mk3Var.f35581a) && sq8.m48644c(this.f35582b, mk3Var.f35582b) && sq8.m48644c(this.f35583c, mk3Var.f35583c) && sq8.m48644c(this.f35584d, mk3Var.f35584d) && sq8.m48644c(this.f35585e, mk3Var.f35585e);
    }

    public int hashCode() {
        List list = this.f35581a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        qk3 qk3Var = this.f35582b;
        int iHashCode2 = (iHashCode + (qk3Var != null ? qk3Var.hashCode() : 0)) * 31;
        nfc nfcVar = this.f35583c;
        int iHashCode3 = (iHashCode2 + (nfcVar != null ? nfcVar.hashCode() : 0)) * 31;
        nfc nfcVar2 = this.f35584d;
        int iHashCode4 = (iHashCode3 + (nfcVar2 != null ? nfcVar2.hashCode() : 0)) * 31;
        List list2 = this.f35585e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompareFacesResponse(");
        sb.append("faceMatches=" + this.f35581a + ',');
        sb.append("sourceImageFace=" + this.f35582b + ',');
        sb.append("sourceImageOrientationCorrection=" + this.f35583c + ',');
        sb.append("targetImageOrientationCorrection=" + this.f35584d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unmatchedFaces=");
        sb2.append(this.f35585e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mk3(C15345a c15345a) {
        this.f35581a = c15345a.m39259c();
        this.f35582b = c15345a.m39260d();
        this.f35583c = c15345a.m39261e();
        this.f35584d = c15345a.m39262f();
        this.f35585e = c15345a.m39263g();
    }
}
