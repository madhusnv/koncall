package p001o;

/* loaded from: classes3.dex */
public final class e6 {

    /* renamed from: g */
    public static final C13110b f21015g = new C13110b(null);

    /* renamed from: a */
    public final String f21016a;

    /* renamed from: b */
    public final String f21017b;

    /* renamed from: c */
    public final gk8 f21018c;

    /* renamed from: d */
    public final String f21019d;

    /* renamed from: e */
    public final sme f21020e;

    /* renamed from: f */
    public final String f21021f;

    /* renamed from: o.e6$a */
    public static final class C13109a {

        /* renamed from: a */
        public String f21022a;

        /* renamed from: b */
        public String f21023b;

        /* renamed from: c */
        public gk8 f21024c;

        /* renamed from: d */
        public String f21025d;

        /* renamed from: e */
        public sme f21026e;

        /* renamed from: f */
        public String f21027f;

        /* renamed from: a */
        public final e6 m24358a() {
            return new e6(this, null);
        }

        /* renamed from: b */
        public final String m24359b() {
            return this.f21022a;
        }

        /* renamed from: c */
        public final String m24360c() {
            return this.f21023b;
        }

        /* renamed from: d */
        public final gk8 m24361d() {
            return this.f21024c;
        }

        /* renamed from: e */
        public final String m24362e() {
            return this.f21025d;
        }

        /* renamed from: f */
        public final sme m24363f() {
            return this.f21026e;
        }

        /* renamed from: g */
        public final String m24364g() {
            return this.f21027f;
        }

        /* renamed from: h */
        public final void m24365h(String str) {
            this.f21022a = str;
        }

        /* renamed from: i */
        public final void m24366i(String str) {
            this.f21025d = str;
        }

        /* renamed from: j */
        public final void m24367j(String str) {
            this.f21027f = str;
        }
    }

    /* renamed from: o.e6$b */
    public static final class C13110b {
        public C13110b() {
        }

        public /* synthetic */ C13110b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ e6(C13109a c13109a, id5 id5Var) {
        this(c13109a);
    }

    /* renamed from: a */
    public final String m24352a() {
        return this.f21016a;
    }

    /* renamed from: b */
    public final String m24353b() {
        return this.f21017b;
    }

    /* renamed from: c */
    public final gk8 m24354c() {
        return this.f21018c;
    }

    /* renamed from: d */
    public final String m24355d() {
        return this.f21019d;
    }

    /* renamed from: e */
    public final sme m24356e() {
        return this.f21020e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e6.class != obj.getClass()) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return sq8.m48644c(this.f21016a, e6Var.f21016a) && sq8.m48644c(this.f21017b, e6Var.f21017b) && sq8.m48644c(this.f21018c, e6Var.f21018c) && sq8.m48644c(this.f21019d, e6Var.f21019d) && sq8.m48644c(this.f21020e, e6Var.f21020e) && sq8.m48644c(this.f21021f, e6Var.f21021f);
    }

    /* renamed from: f */
    public final String m24357f() {
        return this.f21021f;
    }

    public int hashCode() {
        String str = this.f21016a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f21017b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        gk8 gk8Var = this.f21018c;
        int iHashCode3 = (iHashCode2 + (gk8Var != null ? gk8Var.hashCode() : 0)) * 31;
        String str3 = this.f21019d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        sme smeVar = this.f21020e;
        int iHashCode5 = (iHashCode4 + (smeVar != null ? smeVar.hashCode() : 0)) * 31;
        String str4 = this.f21021f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbortMultipartUploadRequest(");
        sb.append("bucket=" + this.f21016a + ',');
        sb.append("expectedBucketOwner=" + this.f21017b + ',');
        sb.append("ifMatchInitiatedTime=" + this.f21018c + ',');
        sb.append("key=" + this.f21019d + ',');
        sb.append("requestPayer=" + this.f21020e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("uploadId=");
        sb2.append(this.f21021f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public e6(C13109a c13109a) {
        this.f21016a = c13109a.m24359b();
        this.f21017b = c13109a.m24360c();
        this.f21018c = c13109a.m24361d();
        this.f21019d = c13109a.m24362e();
        this.f21020e = c13109a.m24363f();
        this.f21021f = c13109a.m24364g();
    }
}
