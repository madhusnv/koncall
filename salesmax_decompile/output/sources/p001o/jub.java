package p001o;

/* loaded from: classes3.dex */
public final class jub {

    /* renamed from: c */
    public static final C14663b f31099c = new C14663b(null);

    /* renamed from: a */
    public final String f31100a;

    /* renamed from: b */
    public final String f31101b;

    /* renamed from: o.jub$a */
    public static final class C14662a {

        /* renamed from: a */
        public String f31102a;

        /* renamed from: b */
        public String f31103b;

        /* renamed from: a */
        public final jub m34520a() {
            return new jub(this, null);
        }

        /* renamed from: b */
        public final C14662a m34521b() {
            return this;
        }

        /* renamed from: c */
        public final String m34522c() {
            return this.f31102a;
        }

        /* renamed from: d */
        public final String m34523d() {
            return this.f31103b;
        }

        /* renamed from: e */
        public final void m34524e(String str) {
            this.f31102a = str;
        }

        /* renamed from: f */
        public final void m34525f(String str) {
            this.f31103b = str;
        }
    }

    /* renamed from: o.jub$b */
    public static final class C14663b {
        public C14663b() {
        }

        public /* synthetic */ C14663b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jub(C14662a c14662a, id5 id5Var) {
        this(c14662a);
    }

    /* renamed from: a */
    public final String m34518a() {
        return this.f31100a;
    }

    /* renamed from: b */
    public final String m34519b() {
        return this.f31101b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jub.class != obj.getClass()) {
            return false;
        }
        jub jubVar = (jub) obj;
        return sq8.m48644c(this.f31100a, jubVar.f31100a) && sq8.m48644c(this.f31101b, jubVar.f31101b);
    }

    public int hashCode() {
        String str = this.f31100a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31101b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NewDeviceMetadataType(");
        sb.append("deviceGroupKey=" + this.f31100a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deviceKey=");
        sb2.append(this.f31101b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jub(C14662a c14662a) {
        this.f31100a = c14662a.m34522c();
        this.f31101b = c14662a.m34523d();
    }
}
