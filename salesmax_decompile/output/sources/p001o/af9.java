package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class af9 {

    /* renamed from: g */
    public static final C12153b f14599g = new C12153b(null);

    /* renamed from: a */
    public final List f14600a;

    /* renamed from: b */
    public final List f14601b;

    /* renamed from: c */
    public final Float f14602c;

    /* renamed from: d */
    public final List f14603d;

    /* renamed from: e */
    public final String f14604e;

    /* renamed from: f */
    public final List f14605f;

    /* renamed from: o.af9$a */
    public static final class C12152a {

        /* renamed from: a */
        public List f14606a;

        /* renamed from: b */
        public List f14607b;

        /* renamed from: c */
        public Float f14608c;

        /* renamed from: d */
        public List f14609d;

        /* renamed from: e */
        public String f14610e;

        /* renamed from: f */
        public List f14611f;

        /* renamed from: a */
        public final af9 m16995a() {
            return new af9(this, null);
        }

        /* renamed from: b */
        public final C12152a m16996b() {
            return this;
        }

        /* renamed from: c */
        public final List m16997c() {
            return this.f14606a;
        }

        /* renamed from: d */
        public final List m16998d() {
            return this.f14607b;
        }

        /* renamed from: e */
        public final Float m16999e() {
            return this.f14608c;
        }

        /* renamed from: f */
        public final List m17000f() {
            return this.f14609d;
        }

        /* renamed from: g */
        public final String m17001g() {
            return this.f14610e;
        }

        /* renamed from: h */
        public final List m17002h() {
            return this.f14611f;
        }

        /* renamed from: i */
        public final void m17003i(List list) {
            this.f14606a = list;
        }

        /* renamed from: j */
        public final void m17004j(List list) {
            this.f14607b = list;
        }

        /* renamed from: k */
        public final void m17005k(Float f) {
            this.f14608c = f;
        }

        /* renamed from: l */
        public final void m17006l(List list) {
            this.f14609d = list;
        }

        /* renamed from: m */
        public final void m17007m(String str) {
            this.f14610e = str;
        }

        /* renamed from: n */
        public final void m17008n(List list) {
            this.f14611f = list;
        }
    }

    /* renamed from: o.af9$b */
    public static final class C12153b {
        public C12153b() {
        }

        public /* synthetic */ C12153b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ af9(C12152a c12152a, id5 id5Var) {
        this(c12152a);
    }

    /* renamed from: a */
    public final Float m16991a() {
        return this.f14602c;
    }

    /* renamed from: b */
    public final List m16992b() {
        return this.f14603d;
    }

    /* renamed from: c */
    public final String m16993c() {
        return this.f14604e;
    }

    /* renamed from: d */
    public final List m16994d() {
        return this.f14605f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || af9.class != obj.getClass()) {
            return false;
        }
        af9 af9Var = (af9) obj;
        if (!sq8.m48644c(this.f14600a, af9Var.f14600a) || !sq8.m48644c(this.f14601b, af9Var.f14601b)) {
            return false;
        }
        Float f = this.f14602c;
        return (f != null ? f.equals(af9Var.f14602c) : af9Var.f14602c == null) && sq8.m48644c(this.f14603d, af9Var.f14603d) && sq8.m48644c(this.f14604e, af9Var.f14604e) && sq8.m48644c(this.f14605f, af9Var.f14605f);
    }

    public int hashCode() {
        List list = this.f14600a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.f14601b;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Float f = this.f14602c;
        int iHashCode3 = (iHashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        List list3 = this.f14603d;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str = this.f14604e;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        List list4 = this.f14605f;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Label(");
        sb.append("aliases=" + this.f14600a + ',');
        sb.append("categories=" + this.f14601b + ',');
        sb.append("confidence=" + this.f14602c + ',');
        sb.append("instances=" + this.f14603d + ',');
        sb.append("name=" + this.f14604e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("parents=");
        sb2.append(this.f14605f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public af9(C12152a c12152a) {
        this.f14600a = c12152a.m16997c();
        this.f14601b = c12152a.m16998d();
        this.f14602c = c12152a.m16999e();
        this.f14603d = c12152a.m17000f();
        this.f14604e = c12152a.m17001g();
        this.f14605f = c12152a.m17002h();
    }
}
