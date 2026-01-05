package p001o;

/* loaded from: classes3.dex */
public final class eef {

    /* renamed from: e */
    public static final C13169b f21497e = new C13169b(null);

    /* renamed from: a */
    public final Float f21498a;

    /* renamed from: b */
    public final Float f21499b;

    /* renamed from: c */
    public final Float f21500c;

    /* renamed from: d */
    public final Float f21501d;

    /* renamed from: o.eef$a */
    public static final class C13168a {

        /* renamed from: a */
        public Float f21502a;

        /* renamed from: b */
        public Float f21503b;

        /* renamed from: c */
        public Float f21504c;

        /* renamed from: d */
        public Float f21505d;

        /* renamed from: a */
        public final eef m24873a() {
            return new eef(this, null);
        }

        /* renamed from: b */
        public final C13168a m24874b() {
            return this;
        }

        /* renamed from: c */
        public final Float m24875c() {
            return this.f21502a;
        }

        /* renamed from: d */
        public final Float m24876d() {
            return this.f21503b;
        }

        /* renamed from: e */
        public final Float m24877e() {
            return this.f21504c;
        }

        /* renamed from: f */
        public final Float m24878f() {
            return this.f21505d;
        }

        /* renamed from: g */
        public final void m24879g(Float f) {
            this.f21502a = f;
        }

        /* renamed from: h */
        public final void m24880h(Float f) {
            this.f21503b = f;
        }

        /* renamed from: i */
        public final void m24881i(Float f) {
            this.f21504c = f;
        }

        /* renamed from: j */
        public final void m24882j(Float f) {
            this.f21505d = f;
        }
    }

    /* renamed from: o.eef$b */
    public static final class C13169b {
        public C13169b() {
        }

        public /* synthetic */ C13169b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ eef(C13168a c13168a, id5 id5Var) {
        this(c13168a);
    }

    /* renamed from: a */
    public final Float m24869a() {
        return this.f21498a;
    }

    /* renamed from: b */
    public final Float m24870b() {
        return this.f21499b;
    }

    /* renamed from: c */
    public final Float m24871c() {
        return this.f21500c;
    }

    /* renamed from: d */
    public final Float m24872d() {
        return this.f21501d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eef.class != obj.getClass()) {
            return false;
        }
        eef eefVar = (eef) obj;
        Float f = this.f21498a;
        if (!(f != null ? f.equals(eefVar.f21498a) : eefVar.f21498a == null)) {
            return false;
        }
        Float f2 = this.f21499b;
        if (!(f2 != null ? f2.equals(eefVar.f21499b) : eefVar.f21499b == null)) {
            return false;
        }
        Float f3 = this.f21500c;
        if (!(f3 != null ? f3.equals(eefVar.f21500c) : eefVar.f21500c == null)) {
            return false;
        }
        Float f4 = this.f21501d;
        Float f5 = eefVar.f21501d;
        return f4 != null ? f4.equals(f5) : f5 == null;
    }

    public int hashCode() {
        Float f = this.f21498a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f21499b;
        int iHashCode2 = (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f21500c;
        int iHashCode3 = (iHashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.f21501d;
        return iHashCode3 + (f4 != null ? f4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SentimentScore(");
        sb.append("mixed=" + this.f21498a + ',');
        sb.append("negative=" + this.f21499b + ',');
        sb.append("neutral=" + this.f21500c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("positive=");
        sb2.append(this.f21501d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public eef(C13168a c13168a) {
        this.f21498a = c13168a.m24875c();
        this.f21499b = c13168a.m24876d();
        this.f21500c = c13168a.m24877e();
        this.f21501d = c13168a.m24878f();
    }
}
