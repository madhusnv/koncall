package p001o;

/* loaded from: classes3.dex */
public final class yrf {

    /* renamed from: e */
    public static final C18473b f55851e = new C18473b(null);

    /* renamed from: a */
    public final ze3 f55852a;

    /* renamed from: b */
    public final String f55853b;

    /* renamed from: c */
    public final boolean f55854c;

    /* renamed from: d */
    public final String f55855d;

    /* renamed from: o.yrf$a */
    public static final class C18472a {

        /* renamed from: a */
        public ze3 f55856a;

        /* renamed from: b */
        public String f55857b;

        /* renamed from: c */
        public boolean f55858c;

        /* renamed from: d */
        public String f55859d;

        /* renamed from: a */
        public final yrf m58145a() {
            return new yrf(this, null);
        }

        /* renamed from: b */
        public final C18472a m58146b() {
            if (this.f55859d == null) {
                this.f55859d = "";
            }
            return this;
        }

        /* renamed from: c */
        public final ze3 m58147c() {
            return this.f55856a;
        }

        /* renamed from: d */
        public final String m58148d() {
            return this.f55857b;
        }

        /* renamed from: e */
        public final boolean m58149e() {
            return this.f55858c;
        }

        /* renamed from: f */
        public final String m58150f() {
            return this.f55859d;
        }

        /* renamed from: g */
        public final void m58151g(ze3 ze3Var) {
            this.f55856a = ze3Var;
        }

        /* renamed from: h */
        public final void m58152h(String str) {
            this.f55857b = str;
        }

        /* renamed from: i */
        public final void m58153i(boolean z) {
            this.f55858c = z;
        }

        /* renamed from: j */
        public final void m58154j(String str) {
            this.f55859d = str;
        }
    }

    /* renamed from: o.yrf$b */
    public static final class C18473b {
        public C18473b() {
        }

        public /* synthetic */ C18473b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yrf(C18472a c18472a, id5 id5Var) {
        this(c18472a);
    }

    /* renamed from: a */
    public final ze3 m58141a() {
        return this.f55852a;
    }

    /* renamed from: b */
    public final String m58142b() {
        return this.f55853b;
    }

    /* renamed from: c */
    public final boolean m58143c() {
        return this.f55854c;
    }

    /* renamed from: d */
    public final String m58144d() {
        return this.f55855d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yrf.class != obj.getClass()) {
            return false;
        }
        yrf yrfVar = (yrf) obj;
        return sq8.m48644c(this.f55852a, yrfVar.f55852a) && sq8.m48644c(this.f55853b, yrfVar.f55853b) && this.f55854c == yrfVar.f55854c && sq8.m48644c(this.f55855d, yrfVar.f55855d);
    }

    public int hashCode() {
        ze3 ze3Var = this.f55852a;
        int iHashCode = (ze3Var != null ? ze3Var.hashCode() : 0) * 31;
        String str = this.f55853b;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f55854c)) * 31) + this.f55855d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignUpResponse(");
        sb.append("codeDeliveryDetails=" + this.f55852a + ',');
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("userConfirmed=" + this.f55854c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("userSub=");
        sb2.append(this.f55855d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yrf(C18472a c18472a) {
        this.f55852a = c18472a.m58147c();
        this.f55853b = c18472a.m58148d();
        this.f55854c = c18472a.m58149e();
        String strM58150f = c18472a.m58150f();
        if (strM58150f == null) {
            throw new IllegalArgumentException("A non-null value must be provided for userSub".toString());
        }
        this.f55855d = strM58150f;
    }
}
