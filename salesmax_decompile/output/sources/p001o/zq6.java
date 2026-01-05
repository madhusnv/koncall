package p001o;

/* loaded from: classes3.dex */
public final class zq6 {

    /* renamed from: d */
    public static final C18694b f57504d = new C18694b(null);

    /* renamed from: a */
    public final Float f57505a;

    /* renamed from: b */
    public final Float f57506b;

    /* renamed from: c */
    public final Float f57507c;

    /* renamed from: o.zq6$a */
    public static final class C18693a {

        /* renamed from: a */
        public Float f57508a;

        /* renamed from: b */
        public Float f57509b;

        /* renamed from: c */
        public Float f57510c;

        /* renamed from: a */
        public final zq6 m59715a() {
            return new zq6(this, null);
        }

        /* renamed from: b */
        public final C18693a m59716b() {
            return this;
        }

        /* renamed from: c */
        public final Float m59717c() {
            return this.f57508a;
        }

        /* renamed from: d */
        public final Float m59718d() {
            return this.f57509b;
        }

        /* renamed from: e */
        public final Float m59719e() {
            return this.f57510c;
        }

        /* renamed from: f */
        public final void m59720f(Float f) {
            this.f57508a = f;
        }

        /* renamed from: g */
        public final void m59721g(Float f) {
            this.f57509b = f;
        }

        /* renamed from: h */
        public final void m59722h(Float f) {
            this.f57510c = f;
        }
    }

    /* renamed from: o.zq6$b */
    public static final class C18694b {
        public C18694b() {
        }

        public /* synthetic */ C18694b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zq6(C18693a c18693a, id5 id5Var) {
        this(c18693a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zq6.class != obj.getClass()) {
            return false;
        }
        zq6 zq6Var = (zq6) obj;
        Float f = this.f57505a;
        if (!(f != null ? f.equals(zq6Var.f57505a) : zq6Var.f57505a == null)) {
            return false;
        }
        Float f2 = this.f57506b;
        if (!(f2 != null ? f2.equals(zq6Var.f57506b) : zq6Var.f57506b == null)) {
            return false;
        }
        Float f3 = this.f57507c;
        Float f4 = zq6Var.f57507c;
        return f3 != null ? f3.equals(f4) : f4 == null;
    }

    public int hashCode() {
        Float f = this.f57505a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f57506b;
        int iHashCode2 = (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f57507c;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EyeDirection(");
        sb.append("confidence=" + this.f57505a + ',');
        sb.append("pitch=" + this.f57506b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("yaw=");
        sb2.append(this.f57507c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zq6(C18693a c18693a) {
        this.f57505a = c18693a.m59717c();
        this.f57506b = c18693a.m59718d();
        this.f57507c = c18693a.m59719e();
    }
}
