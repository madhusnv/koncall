package p001o;

/* loaded from: classes2.dex */
public final class lr0 {

    /* renamed from: e */
    public static final C15136b f34273e = new C15136b(null);

    /* renamed from: a */
    public final ur0 f34274a;

    /* renamed from: b */
    public final gc4 f34275b;

    /* renamed from: c */
    public final Integer f34276c;

    /* renamed from: d */
    public final String f34277d;

    /* renamed from: o.lr0$a */
    public static final class C15135a {

        /* renamed from: a */
        public ur0 f34278a;

        /* renamed from: b */
        public gc4 f34279b;

        /* renamed from: c */
        public Integer f34280c;

        /* renamed from: d */
        public String f34281d;

        /* renamed from: a */
        public final lr0 m37791a() {
            return new lr0(this, null);
        }

        /* renamed from: b */
        public final C15135a m37792b() {
            return this;
        }

        /* renamed from: c */
        public final ur0 m37793c() {
            return this.f34278a;
        }

        /* renamed from: d */
        public final gc4 m37794d() {
            return this.f34279b;
        }

        /* renamed from: e */
        public final Integer m37795e() {
            return this.f34280c;
        }

        /* renamed from: f */
        public final String m37796f() {
            return this.f34281d;
        }

        /* renamed from: g */
        public final void m37797g(ur0 ur0Var) {
            this.f34278a = ur0Var;
        }

        /* renamed from: h */
        public final void m37798h(gc4 gc4Var) {
            this.f34279b = gc4Var;
        }

        /* renamed from: i */
        public final void m37799i(Integer num) {
            this.f34280c = num;
        }

        /* renamed from: j */
        public final void m37800j(String str) {
            this.f34281d = str;
        }
    }

    /* renamed from: o.lr0$b */
    public static final class C15136b {
        public C15136b() {
        }

        public /* synthetic */ C15136b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lr0(C15135a c15135a, id5 id5Var) {
        this(c15135a);
    }

    /* renamed from: a */
    public final ur0 m37789a() {
        return this.f34274a;
    }

    /* renamed from: b */
    public final gc4 m37790b() {
        return this.f34275b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lr0.class != obj.getClass()) {
            return false;
        }
        lr0 lr0Var = (lr0) obj;
        return sq8.m48644c(this.f34274a, lr0Var.f34274a) && sq8.m48644c(this.f34275b, lr0Var.f34275b) && sq8.m48644c(this.f34276c, lr0Var.f34276c) && sq8.m48644c(this.f34277d, lr0Var.f34277d);
    }

    public int hashCode() {
        ur0 ur0Var = this.f34274a;
        int iHashCode = (ur0Var != null ? ur0Var.hashCode() : 0) * 31;
        gc4 gc4Var = this.f34275b;
        int iHashCode2 = (iHashCode + (gc4Var != null ? gc4Var.hashCode() : 0)) * 31;
        Integer num = this.f34276c;
        int iIntValue = (iHashCode2 + (num != null ? num.intValue() : 0)) * 31;
        String str = this.f34277d;
        return iIntValue + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumeRoleResponse(");
        sb.append("assumedRoleUser=" + this.f34274a + ',');
        sb.append("credentials=" + this.f34275b + ',');
        sb.append("packedPolicySize=" + this.f34276c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sourceIdentity=");
        sb2.append(this.f34277d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lr0(C15135a c15135a) {
        this.f34274a = c15135a.m37793c();
        this.f34275b = c15135a.m37794d();
        this.f34276c = c15135a.m37795e();
        this.f34277d = c15135a.m37796f();
    }
}
