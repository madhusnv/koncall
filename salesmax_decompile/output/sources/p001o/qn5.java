package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qn5 {

    /* renamed from: e */
    public static final C16427b f42193e = new C16427b(null);

    /* renamed from: a */
    public final byte[] f42194a;

    /* renamed from: b */
    public final String f42195b;

    /* renamed from: c */
    public final sg9 f42196c;

    /* renamed from: d */
    public final String f42197d;

    /* renamed from: o.qn5$a */
    public static final class C16426a {

        /* renamed from: a */
        public byte[] f42198a;

        /* renamed from: b */
        public String f42199b;

        /* renamed from: c */
        public sg9 f42200c;

        /* renamed from: d */
        public String f42201d;

        /* renamed from: a */
        public final qn5 m45686a() {
            return new qn5(this, null);
        }

        /* renamed from: b */
        public final byte[] m45687b() {
            return this.f42198a;
        }

        /* renamed from: c */
        public final fw5 m45688c() {
            return null;
        }

        /* renamed from: d */
        public final String m45689d() {
            return this.f42199b;
        }

        /* renamed from: e */
        public final sg9 m45690e() {
            return this.f42200c;
        }

        /* renamed from: f */
        public final String m45691f() {
            return this.f42201d;
        }

        /* renamed from: g */
        public final void m45692g(sg9 sg9Var) {
            this.f42200c = sg9Var;
        }

        /* renamed from: h */
        public final void m45693h(String str) {
            this.f42201d = str;
        }
    }

    /* renamed from: o.qn5$b */
    public static final class C16427b {
        public C16427b() {
        }

        public /* synthetic */ C16427b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qn5(C16426a c16426a, id5 id5Var) {
        this(c16426a);
    }

    /* renamed from: a */
    public final byte[] m45681a() {
        return this.f42194a;
    }

    /* renamed from: b */
    public final fw5 m45682b() {
        return null;
    }

    /* renamed from: c */
    public final String m45683c() {
        return this.f42195b;
    }

    /* renamed from: d */
    public final sg9 m45684d() {
        return this.f42196c;
    }

    /* renamed from: e */
    public final String m45685e() {
        return this.f42197d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qn5.class != obj.getClass()) {
            return false;
        }
        qn5 qn5Var = (qn5) obj;
        byte[] bArr = this.f42194a;
        if (bArr != null) {
            byte[] bArr2 = qn5Var.f42194a;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (qn5Var.f42194a != null) {
            return false;
        }
        return sq8.m48644c(null, null) && sq8.m48644c(this.f42195b, qn5Var.f42195b) && sq8.m48644c(this.f42196c, qn5Var.f42196c) && sq8.m48644c(this.f42197d, qn5Var.f42197d);
    }

    public int hashCode() {
        byte[] bArr = this.f42194a;
        int iHashCode = (((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + 0) * 31;
        String str = this.f42195b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        sg9 sg9Var = this.f42196c;
        int iHashCode3 = (iHashCode2 + (sg9Var != null ? sg9Var.hashCode() : 0)) * 31;
        String str2 = this.f42197d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectEntitiesRequest(");
        sb.append("bytes=" + this.f42194a + ',');
        sb.append("documentReaderConfig=" + ((Object) null) + ',');
        sb.append("endpointArn=" + this.f42195b + ',');
        sb.append("languageCode=" + this.f42196c + ',');
        sb.append("text=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qn5(C16426a c16426a) {
        this.f42194a = c16426a.m45687b();
        c16426a.m45688c();
        this.f42195b = c16426a.m45689d();
        this.f42196c = c16426a.m45690e();
        this.f42197d = c16426a.m45691f();
    }
}
