package p001o;

/* loaded from: classes2.dex */
public final class tr0 {

    /* renamed from: h */
    public static final C17191b f47628h = new C17191b(null);

    /* renamed from: a */
    public final ur0 f47629a;

    /* renamed from: b */
    public final String f47630b;

    /* renamed from: c */
    public final gc4 f47631c;

    /* renamed from: d */
    public final Integer f47632d;

    /* renamed from: e */
    public final String f47633e;

    /* renamed from: f */
    public final String f47634f;

    /* renamed from: g */
    public final String f47635g;

    /* renamed from: o.tr0$a */
    public static final class C17190a {

        /* renamed from: a */
        public ur0 f47636a;

        /* renamed from: b */
        public String f47637b;

        /* renamed from: c */
        public gc4 f47638c;

        /* renamed from: d */
        public Integer f47639d;

        /* renamed from: e */
        public String f47640e;

        /* renamed from: f */
        public String f47641f;

        /* renamed from: g */
        public String f47642g;

        /* renamed from: a */
        public final tr0 m50394a() {
            return new tr0(this, null);
        }

        /* renamed from: b */
        public final C17190a m50395b() {
            return this;
        }

        /* renamed from: c */
        public final ur0 m50396c() {
            return this.f47636a;
        }

        /* renamed from: d */
        public final String m50397d() {
            return this.f47637b;
        }

        /* renamed from: e */
        public final gc4 m50398e() {
            return this.f47638c;
        }

        /* renamed from: f */
        public final Integer m50399f() {
            return this.f47639d;
        }

        /* renamed from: g */
        public final String m50400g() {
            return this.f47640e;
        }

        /* renamed from: h */
        public final String m50401h() {
            return this.f47641f;
        }

        /* renamed from: i */
        public final String m50402i() {
            return this.f47642g;
        }

        /* renamed from: j */
        public final void m50403j(ur0 ur0Var) {
            this.f47636a = ur0Var;
        }

        /* renamed from: k */
        public final void m50404k(String str) {
            this.f47637b = str;
        }

        /* renamed from: l */
        public final void m50405l(gc4 gc4Var) {
            this.f47638c = gc4Var;
        }

        /* renamed from: m */
        public final void m50406m(Integer num) {
            this.f47639d = num;
        }

        /* renamed from: n */
        public final void m50407n(String str) {
            this.f47640e = str;
        }

        /* renamed from: o */
        public final void m50408o(String str) {
            this.f47641f = str;
        }

        /* renamed from: p */
        public final void m50409p(String str) {
            this.f47642g = str;
        }
    }

    /* renamed from: o.tr0$b */
    public static final class C17191b {
        public C17191b() {
        }

        public /* synthetic */ C17191b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tr0(C17190a c17190a, id5 id5Var) {
        this(c17190a);
    }

    /* renamed from: a */
    public final ur0 m50392a() {
        return this.f47629a;
    }

    /* renamed from: b */
    public final gc4 m50393b() {
        return this.f47631c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tr0.class != obj.getClass()) {
            return false;
        }
        tr0 tr0Var = (tr0) obj;
        return sq8.m48644c(this.f47629a, tr0Var.f47629a) && sq8.m48644c(this.f47630b, tr0Var.f47630b) && sq8.m48644c(this.f47631c, tr0Var.f47631c) && sq8.m48644c(this.f47632d, tr0Var.f47632d) && sq8.m48644c(this.f47633e, tr0Var.f47633e) && sq8.m48644c(this.f47634f, tr0Var.f47634f) && sq8.m48644c(this.f47635g, tr0Var.f47635g);
    }

    public int hashCode() {
        ur0 ur0Var = this.f47629a;
        int iHashCode = (ur0Var != null ? ur0Var.hashCode() : 0) * 31;
        String str = this.f47630b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        gc4 gc4Var = this.f47631c;
        int iHashCode3 = (iHashCode2 + (gc4Var != null ? gc4Var.hashCode() : 0)) * 31;
        Integer num = this.f47632d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.f47633e;
        int iHashCode4 = (iIntValue + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f47634f;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f47635g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumeRoleWithWebIdentityResponse(");
        sb.append("assumedRoleUser=" + this.f47629a + ',');
        sb.append("audience=" + this.f47630b + ',');
        sb.append("credentials=" + this.f47631c + ',');
        sb.append("packedPolicySize=" + this.f47632d + ',');
        sb.append("provider=" + this.f47633e + ',');
        sb.append("sourceIdentity=" + this.f47634f + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("subjectFromWebIdentityToken=");
        sb2.append(this.f47635g);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tr0(C17190a c17190a) {
        this.f47629a = c17190a.m50396c();
        this.f47630b = c17190a.m50397d();
        this.f47631c = c17190a.m50398e();
        this.f47632d = c17190a.m50399f();
        this.f47633e = c17190a.m50400g();
        this.f47634f = c17190a.m50401h();
        this.f47635g = c17190a.m50402i();
    }
}
