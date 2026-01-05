package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class xn5 {

    /* renamed from: c */
    public static final C18192b f53950c = new C18192b(null);

    /* renamed from: a */
    public final List f53951a;

    /* renamed from: b */
    public final nfc f53952b;

    /* renamed from: o.xn5$a */
    public static final class C18191a {

        /* renamed from: a */
        public List f53953a;

        /* renamed from: b */
        public nfc f53954b;

        /* renamed from: a */
        public final xn5 m56493a() {
            return new xn5(this, null);
        }

        /* renamed from: b */
        public final C18191a m56494b() {
            return this;
        }

        /* renamed from: c */
        public final List m56495c() {
            return this.f53953a;
        }

        /* renamed from: d */
        public final nfc m56496d() {
            return this.f53954b;
        }

        /* renamed from: e */
        public final void m56497e(List list) {
            this.f53953a = list;
        }

        /* renamed from: f */
        public final void m56498f(nfc nfcVar) {
            this.f53954b = nfcVar;
        }
    }

    /* renamed from: o.xn5$b */
    public static final class C18192b {
        public C18192b() {
        }

        public /* synthetic */ C18192b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xn5(C18191a c18191a, id5 id5Var) {
        this(c18191a);
    }

    /* renamed from: a */
    public final List m56492a() {
        return this.f53951a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xn5.class != obj.getClass()) {
            return false;
        }
        xn5 xn5Var = (xn5) obj;
        return sq8.m48644c(this.f53951a, xn5Var.f53951a) && sq8.m48644c(this.f53952b, xn5Var.f53952b);
    }

    public int hashCode() {
        List list = this.f53951a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        nfc nfcVar = this.f53952b;
        return iHashCode + (nfcVar != null ? nfcVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectFacesResponse(");
        sb.append("faceDetails=" + this.f53951a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("orientationCorrection=");
        sb2.append(this.f53952b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xn5(C18191a c18191a) {
        this.f53951a = c18191a.m56495c();
        this.f53952b = c18191a.m56496d();
    }
}
