package p001o;

/* loaded from: classes3.dex */
public final class r54 {

    /* renamed from: c */
    public static final C16539b f43007c = new C16539b(null);

    /* renamed from: a */
    public final Float f43008a;

    /* renamed from: b */
    public final String f43009b;

    /* renamed from: o.r54$a */
    public static final class C16538a {

        /* renamed from: a */
        public Float f43010a;

        /* renamed from: b */
        public String f43011b;

        /* renamed from: a */
        public final r54 m46230a() {
            return new r54(this, null);
        }

        /* renamed from: b */
        public final C16538a m46231b() {
            return this;
        }

        /* renamed from: c */
        public final Float m46232c() {
            return this.f43010a;
        }

        /* renamed from: d */
        public final String m46233d() {
            return this.f43011b;
        }

        /* renamed from: e */
        public final void m46234e(Float f) {
            this.f43010a = f;
        }

        /* renamed from: f */
        public final void m46235f(String str) {
            this.f43011b = str;
        }
    }

    /* renamed from: o.r54$b */
    public static final class C16539b {
        public C16539b() {
        }

        public /* synthetic */ C16539b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ r54(C16538a c16538a, id5 id5Var) {
        this(c16538a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r54.class != obj.getClass()) {
            return false;
        }
        r54 r54Var = (r54) obj;
        Float f = this.f43008a;
        return (f != null ? f.equals(r54Var.f43008a) : r54Var.f43008a == null) && sq8.m48644c(this.f43009b, r54Var.f43009b);
    }

    public int hashCode() {
        Float f = this.f43008a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        String str = this.f43009b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentType(");
        sb.append("confidence=" + this.f43008a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("name=");
        sb2.append(this.f43009b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public r54(C16538a c16538a) {
        this.f43008a = c16538a.m46232c();
        this.f43009b = c16538a.m46233d();
    }
}
