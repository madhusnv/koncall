package p001o;

/* loaded from: classes3.dex */
public final class xo5 {

    /* renamed from: d */
    public static final C18205b f53994d = new C18205b(null);

    /* renamed from: a */
    public final fc8 f53995a;

    /* renamed from: b */
    public final Float f53996b;

    /* renamed from: c */
    public final String f53997c;

    /* renamed from: o.xo5$a */
    public static final class C18204a {

        /* renamed from: a */
        public fc8 f53998a;

        /* renamed from: b */
        public Float f53999b;

        /* renamed from: c */
        public String f54000c;

        /* renamed from: a */
        public final xo5 m56525a() {
            return new xo5(this, null);
        }

        /* renamed from: b */
        public final w58 m56526b() {
            return null;
        }

        /* renamed from: c */
        public final fc8 m56527c() {
            return this.f53998a;
        }

        /* renamed from: d */
        public final Float m56528d() {
            return this.f53999b;
        }

        /* renamed from: e */
        public final String m56529e() {
            return this.f54000c;
        }

        /* renamed from: f */
        public final void m56530f(fc8 fc8Var) {
            this.f53998a = fc8Var;
        }
    }

    /* renamed from: o.xo5$b */
    public static final class C18205b {
        public C18205b() {
        }

        public /* synthetic */ C18205b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xo5(C18204a c18204a, id5 id5Var) {
        this(c18204a);
    }

    /* renamed from: a */
    public final w58 m56521a() {
        return null;
    }

    /* renamed from: b */
    public final fc8 m56522b() {
        return this.f53995a;
    }

    /* renamed from: c */
    public final Float m56523c() {
        return this.f53996b;
    }

    /* renamed from: d */
    public final String m56524d() {
        return this.f53997c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xo5.class != obj.getClass()) {
            return false;
        }
        xo5 xo5Var = (xo5) obj;
        if (!sq8.m48644c(null, null) || !sq8.m48644c(this.f53995a, xo5Var.f53995a)) {
            return false;
        }
        Float f = this.f53996b;
        return (f != null ? f.equals(xo5Var.f53996b) : xo5Var.f53996b == null) && sq8.m48644c(this.f53997c, xo5Var.f53997c);
    }

    public int hashCode() {
        fc8 fc8Var = this.f53995a;
        int iHashCode = ((fc8Var != null ? fc8Var.hashCode() : 0) + 0) * 31;
        Float f = this.f53996b;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 31;
        String str = this.f53997c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectModerationLabelsRequest(");
        sb.append("humanLoopConfig=" + ((Object) null) + ',');
        sb.append("image=" + this.f53995a + ',');
        sb.append("minConfidence=" + this.f53996b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("projectVersion=");
        sb2.append(this.f53997c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xo5(C18204a c18204a) {
        c18204a.m56526b();
        this.f53995a = c18204a.m56527c();
        this.f53996b = c18204a.m56528d();
        this.f53997c = c18204a.m56529e();
    }
}
