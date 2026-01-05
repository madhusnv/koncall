package p001o;

/* loaded from: classes3.dex */
public final class vw5 {

    /* renamed from: h */
    public static final C17683b f50938h = new C17683b(null);

    /* renamed from: a */
    public final Integer f50939a;

    /* renamed from: b */
    public final String f50940b;

    /* renamed from: c */
    public final Integer f50941c;

    /* renamed from: d */
    public final String f50942d;

    /* renamed from: e */
    public final Float f50943e;

    /* renamed from: f */
    public final Integer f50944f;

    /* renamed from: g */
    public final String f50945g;

    /* renamed from: o.vw5$a */
    public static final class C17682a {

        /* renamed from: a */
        public Integer f50946a;

        /* renamed from: b */
        public String f50947b;

        /* renamed from: c */
        public Integer f50948c;

        /* renamed from: d */
        public String f50949d;

        /* renamed from: e */
        public Float f50950e;

        /* renamed from: f */
        public Integer f50951f;

        /* renamed from: g */
        public String f50952g;

        /* renamed from: a */
        public final vw5 m53488a() {
            return new vw5(this, null);
        }

        /* renamed from: b */
        public final C17682a m53489b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m53490c() {
            return this.f50946a;
        }

        /* renamed from: d */
        public final String m53491d() {
            return this.f50947b;
        }

        /* renamed from: e */
        public final Integer m53492e() {
            return this.f50948c;
        }

        /* renamed from: f */
        public final String m53493f() {
            return this.f50949d;
        }

        /* renamed from: g */
        public final Float m53494g() {
            return this.f50950e;
        }

        /* renamed from: h */
        public final Integer m53495h() {
            return this.f50951f;
        }

        /* renamed from: i */
        public final String m53496i() {
            return this.f50952g;
        }

        /* renamed from: j */
        public final void m53497j(Integer num) {
            this.f50946a = num;
        }

        /* renamed from: k */
        public final void m53498k(String str) {
            this.f50947b = str;
        }

        /* renamed from: l */
        public final void m53499l(Integer num) {
            this.f50948c = num;
        }

        /* renamed from: m */
        public final void m53500m(String str) {
            this.f50949d = str;
        }

        /* renamed from: n */
        public final void m53501n(Float f) {
            this.f50950e = f;
        }

        /* renamed from: o */
        public final void m53502o(Integer num) {
            this.f50951f = num;
        }

        /* renamed from: p */
        public final void m53503p(String str) {
            this.f50952g = str;
        }
    }

    /* renamed from: o.vw5$b */
    public static final class C17683b {
        public C17683b() {
        }

        public /* synthetic */ C17683b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ vw5(C17682a c17682a, id5 id5Var) {
        this(c17682a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vw5.class != obj.getClass()) {
            return false;
        }
        vw5 vw5Var = (vw5) obj;
        if (!sq8.m48644c(this.f50939a, vw5Var.f50939a) || !sq8.m48644c(this.f50940b, vw5Var.f50940b) || !sq8.m48644c(this.f50941c, vw5Var.f50941c) || !sq8.m48644c(this.f50942d, vw5Var.f50942d)) {
            return false;
        }
        Float f = this.f50943e;
        return (f != null ? f.equals(vw5Var.f50943e) : vw5Var.f50943e == null) && sq8.m48644c(this.f50944f, vw5Var.f50944f) && sq8.m48644c(this.f50945g, vw5Var.f50945g);
    }

    public int hashCode() {
        Integer num = this.f50939a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.f50940b;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f50941c;
        int iIntValue2 = (iHashCode + (num2 != null ? num2.intValue() : 0)) * 31;
        String str2 = this.f50942d;
        int iHashCode2 = (iIntValue2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Float f = this.f50943e;
        int iHashCode3 = (iHashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        Integer num3 = this.f50944f;
        int iIntValue3 = (iHashCode3 + (num3 != null ? num3.intValue() : 0)) * 31;
        String str3 = this.f50945g;
        return iIntValue3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DominantColor(");
        sb.append("blue=" + this.f50939a + ',');
        sb.append("cssColor=" + this.f50940b + ',');
        sb.append("green=" + this.f50941c + ',');
        sb.append("hexCode=" + this.f50942d + ',');
        sb.append("pixelPercent=" + this.f50943e + ',');
        sb.append("red=" + this.f50944f + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("simplifiedColor=");
        sb2.append(this.f50945g);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public vw5(C17682a c17682a) {
        this.f50939a = c17682a.m53490c();
        this.f50940b = c17682a.m53491d();
        this.f50941c = c17682a.m53492e();
        this.f50942d = c17682a.m53493f();
        this.f50943e = c17682a.m53494g();
        this.f50944f = c17682a.m53495h();
        this.f50945g = c17682a.m53496i();
    }
}
