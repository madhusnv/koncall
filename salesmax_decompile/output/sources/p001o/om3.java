package p001o;

/* loaded from: classes3.dex */
public final class om3 {

    /* renamed from: g */
    public static final C15839b f38560g = new C15839b(null);

    /* renamed from: a */
    public final String f38561a;

    /* renamed from: b */
    public final String f38562b;

    /* renamed from: c */
    public final String f38563c;

    /* renamed from: d */
    public final String f38564d;

    /* renamed from: e */
    public final String f38565e;

    /* renamed from: f */
    public final Integer f38566f;

    /* renamed from: o.om3$a */
    public static final class C15838a {

        /* renamed from: a */
        public String f38567a;

        /* renamed from: b */
        public String f38568b;

        /* renamed from: c */
        public String f38569c;

        /* renamed from: d */
        public String f38570d;

        /* renamed from: e */
        public String f38571e;

        /* renamed from: f */
        public Integer f38572f;

        /* renamed from: a */
        public final om3 m42413a() {
            return new om3(this, null);
        }

        /* renamed from: b */
        public final String m42414b() {
            return this.f38567a;
        }

        /* renamed from: c */
        public final String m42415c() {
            return this.f38568b;
        }

        /* renamed from: d */
        public final String m42416d() {
            return this.f38569c;
        }

        /* renamed from: e */
        public final String m42417e() {
            return this.f38570d;
        }

        /* renamed from: f */
        public final String m42418f() {
            return this.f38571e;
        }

        /* renamed from: g */
        public final Integer m42419g() {
            return this.f38572f;
        }

        /* renamed from: h */
        public final void m42420h(String str) {
            this.f38571e = str;
        }

        /* renamed from: i */
        public final void m42421i(Integer num) {
            this.f38572f = num;
        }
    }

    /* renamed from: o.om3$b */
    public static final class C15839b {
        public C15839b() {
        }

        public /* synthetic */ C15839b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final om3 m42422a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15838a c15838a = new C15838a();
            xk7Var.invoke(c15838a);
            return c15838a.m42413a();
        }
    }

    public /* synthetic */ om3(C15838a c15838a, id5 id5Var) {
        this(c15838a);
    }

    /* renamed from: a */
    public final String m42407a() {
        return this.f38561a;
    }

    /* renamed from: b */
    public final String m42408b() {
        return this.f38562b;
    }

    /* renamed from: c */
    public final String m42409c() {
        return this.f38563c;
    }

    /* renamed from: d */
    public final String m42410d() {
        return this.f38564d;
    }

    /* renamed from: e */
    public final String m42411e() {
        return this.f38565e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || om3.class != obj.getClass()) {
            return false;
        }
        om3 om3Var = (om3) obj;
        return sq8.m48644c(this.f38561a, om3Var.f38561a) && sq8.m48644c(this.f38562b, om3Var.f38562b) && sq8.m48644c(this.f38563c, om3Var.f38563c) && sq8.m48644c(this.f38564d, om3Var.f38564d) && sq8.m48644c(this.f38565e, om3Var.f38565e) && sq8.m48644c(this.f38566f, om3Var.f38566f);
    }

    /* renamed from: f */
    public final Integer m42412f() {
        return this.f38566f;
    }

    public int hashCode() {
        String str = this.f38561a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f38562b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f38563c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f38564d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f38565e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f38566f;
        return iHashCode5 + (num != null ? num.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompletedPart(");
        sb.append("checksumCrc32=" + this.f38561a + ',');
        sb.append("checksumCrc32C=" + this.f38562b + ',');
        sb.append("checksumSha1=" + this.f38563c + ',');
        sb.append("checksumSha256=" + this.f38564d + ',');
        sb.append("eTag=" + this.f38565e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("partNumber=");
        sb2.append(this.f38566f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public om3(C15838a c15838a) {
        this.f38561a = c15838a.m42414b();
        this.f38562b = c15838a.m42415c();
        this.f38563c = c15838a.m42416d();
        this.f38564d = c15838a.m42417e();
        this.f38565e = c15838a.m42418f();
        this.f38566f = c15838a.m42419g();
    }
}
