package p001o;

/* loaded from: classes2.dex */
public final class ur0 {

    /* renamed from: c */
    public static final C17434b f49390c = new C17434b(null);

    /* renamed from: a */
    public final String f49391a;

    /* renamed from: b */
    public final String f49392b;

    /* renamed from: o.ur0$a */
    public static final class C17433a {

        /* renamed from: a */
        public String f49393a;

        /* renamed from: b */
        public String f49394b;

        /* renamed from: a */
        public final ur0 m51943a() {
            return new ur0(this, null);
        }

        /* renamed from: b */
        public final C17433a m51944b() {
            if (this.f49393a == null) {
                this.f49393a = "";
            }
            if (this.f49394b == null) {
                this.f49394b = "";
            }
            return this;
        }

        /* renamed from: c */
        public final String m51945c() {
            return this.f49393a;
        }

        /* renamed from: d */
        public final String m51946d() {
            return this.f49394b;
        }

        /* renamed from: e */
        public final void m51947e(String str) {
            this.f49393a = str;
        }

        /* renamed from: f */
        public final void m51948f(String str) {
            this.f49394b = str;
        }
    }

    /* renamed from: o.ur0$b */
    public static final class C17434b {
        public C17434b() {
        }

        public /* synthetic */ C17434b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ur0(C17433a c17433a, id5 id5Var) {
        this(c17433a);
    }

    /* renamed from: a */
    public final String m51942a() {
        return this.f49391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ur0.class != obj.getClass()) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        return sq8.m48644c(this.f49391a, ur0Var.f49391a) && sq8.m48644c(this.f49392b, ur0Var.f49392b);
    }

    public int hashCode() {
        return (this.f49391a.hashCode() * 31) + this.f49392b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedRoleUser(");
        sb.append("arn=" + this.f49391a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("assumedRoleId=");
        sb2.append(this.f49392b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ur0(C17433a c17433a) {
        String strM51945c = c17433a.m51945c();
        if (strM51945c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for arn".toString());
        }
        this.f49391a = strM51945c;
        String strM51946d = c17433a.m51946d();
        if (strM51946d == null) {
            throw new IllegalArgumentException("A non-null value must be provided for assumedRoleId".toString());
        }
        this.f49392b = strM51946d;
    }
}
