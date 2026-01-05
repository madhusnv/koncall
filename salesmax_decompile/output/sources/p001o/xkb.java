package p001o;

/* loaded from: classes3.dex */
public final class xkb {

    /* renamed from: e */
    public static final C18176b f53867e = new C18176b(null);

    /* renamed from: a */
    public final Float f53868a;

    /* renamed from: b */
    public final String f53869b;

    /* renamed from: c */
    public final String f53870c;

    /* renamed from: d */
    public final Integer f53871d;

    /* renamed from: o.xkb$a */
    public static final class C18175a {

        /* renamed from: a */
        public Float f53872a;

        /* renamed from: b */
        public String f53873b;

        /* renamed from: c */
        public String f53874c;

        /* renamed from: d */
        public Integer f53875d;

        /* renamed from: a */
        public final xkb m56425a() {
            return new xkb(this, null);
        }

        /* renamed from: b */
        public final C18175a m56426b() {
            return this;
        }

        /* renamed from: c */
        public final Float m56427c() {
            return this.f53872a;
        }

        /* renamed from: d */
        public final String m56428d() {
            return this.f53873b;
        }

        /* renamed from: e */
        public final String m56429e() {
            return this.f53874c;
        }

        /* renamed from: f */
        public final Integer m56430f() {
            return this.f53875d;
        }

        /* renamed from: g */
        public final void m56431g(Float f) {
            this.f53872a = f;
        }

        /* renamed from: h */
        public final void m56432h(String str) {
            this.f53873b = str;
        }

        /* renamed from: i */
        public final void m56433i(String str) {
            this.f53874c = str;
        }

        /* renamed from: j */
        public final void m56434j(Integer num) {
            this.f53875d = num;
        }
    }

    /* renamed from: o.xkb$b */
    public static final class C18176b {
        public C18176b() {
        }

        public /* synthetic */ C18176b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xkb(C18175a c18175a, id5 id5Var) {
        this(c18175a);
    }

    /* renamed from: a */
    public final Float m56422a() {
        return this.f53868a;
    }

    /* renamed from: b */
    public final String m56423b() {
        return this.f53869b;
    }

    /* renamed from: c */
    public final String m56424c() {
        return this.f53870c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xkb.class != obj.getClass()) {
            return false;
        }
        xkb xkbVar = (xkb) obj;
        Float f = this.f53868a;
        return (f != null ? f.equals(xkbVar.f53868a) : xkbVar.f53868a == null) && sq8.m48644c(this.f53869b, xkbVar.f53869b) && sq8.m48644c(this.f53870c, xkbVar.f53870c) && sq8.m48644c(this.f53871d, xkbVar.f53871d);
    }

    public int hashCode() {
        Float f = this.f53868a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        String str = this.f53869b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f53870c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f53871d;
        return iHashCode3 + (num != null ? num.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModerationLabel(");
        sb.append("confidence=" + this.f53868a + ',');
        sb.append("name=" + this.f53869b + ',');
        sb.append("parentName=" + this.f53870c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("taxonomyLevel=");
        sb2.append(this.f53871d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xkb(C18175a c18175a) {
        this.f53868a = c18175a.m56427c();
        this.f53869b = c18175a.m56428d();
        this.f53870c = c18175a.m56429e();
        this.f53871d = c18175a.m56430f();
    }
}
