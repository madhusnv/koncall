package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class ro5 {

    /* renamed from: e */
    public static final C16638b f43887e = new C16638b(null);

    /* renamed from: a */
    public final io5 f43888a;

    /* renamed from: b */
    public final String f43889b;

    /* renamed from: c */
    public final List f43890c;

    /* renamed from: d */
    public final nfc f43891d;

    /* renamed from: o.ro5$a */
    public static final class C16637a {

        /* renamed from: a */
        public io5 f43892a;

        /* renamed from: b */
        public String f43893b;

        /* renamed from: c */
        public List f43894c;

        /* renamed from: d */
        public nfc f43895d;

        /* renamed from: a */
        public final ro5 m47015a() {
            return new ro5(this, null);
        }

        /* renamed from: b */
        public final C16637a m47016b() {
            return this;
        }

        /* renamed from: c */
        public final io5 m47017c() {
            return this.f43892a;
        }

        /* renamed from: d */
        public final String m47018d() {
            return this.f43893b;
        }

        /* renamed from: e */
        public final List m47019e() {
            return this.f43894c;
        }

        /* renamed from: f */
        public final nfc m47020f() {
            return this.f43895d;
        }

        /* renamed from: g */
        public final void m47021g(io5 io5Var) {
            this.f43892a = io5Var;
        }

        /* renamed from: h */
        public final void m47022h(String str) {
            this.f43893b = str;
        }

        /* renamed from: i */
        public final void m47023i(List list) {
            this.f43894c = list;
        }

        /* renamed from: j */
        public final void m47024j(nfc nfcVar) {
            this.f43895d = nfcVar;
        }
    }

    /* renamed from: o.ro5$b */
    public static final class C16638b {
        public C16638b() {
        }

        public /* synthetic */ C16638b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ro5(C16637a c16637a, id5 id5Var) {
        this(c16637a);
    }

    /* renamed from: a */
    public final List m47014a() {
        return this.f43890c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ro5.class != obj.getClass()) {
            return false;
        }
        ro5 ro5Var = (ro5) obj;
        return sq8.m48644c(this.f43888a, ro5Var.f43888a) && sq8.m48644c(this.f43889b, ro5Var.f43889b) && sq8.m48644c(this.f43890c, ro5Var.f43890c) && sq8.m48644c(this.f43891d, ro5Var.f43891d);
    }

    public int hashCode() {
        io5 io5Var = this.f43888a;
        int iHashCode = (io5Var != null ? io5Var.hashCode() : 0) * 31;
        String str = this.f43889b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f43890c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        nfc nfcVar = this.f43891d;
        return iHashCode3 + (nfcVar != null ? nfcVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectLabelsResponse(");
        sb.append("imageProperties=" + this.f43888a + ',');
        sb.append("labelModelVersion=" + this.f43889b + ',');
        sb.append("labels=" + this.f43890c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("orientationCorrection=");
        sb2.append(this.f43891d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ro5(C16637a c16637a) {
        this.f43888a = c16637a.m47017c();
        this.f43889b = c16637a.m47018d();
        this.f43890c = c16637a.m47019e();
        this.f43891d = c16637a.m47020f();
    }
}
