package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class ef2 {

    /* renamed from: g */
    public static final C13174b f21522g = new C13174b(null);

    /* renamed from: a */
    public final ok3 f21523a;

    /* renamed from: b */
    public final String f21524b;

    /* renamed from: c */
    public final me9 f21525c;

    /* renamed from: d */
    public final Float f21526d;

    /* renamed from: e */
    public final String f21527e;

    /* renamed from: f */
    public final List f21528f;

    /* renamed from: o.ef2$a */
    public static final class C13173a {

        /* renamed from: a */
        public ok3 f21529a;

        /* renamed from: b */
        public String f21530b;

        /* renamed from: c */
        public me9 f21531c;

        /* renamed from: d */
        public Float f21532d;

        /* renamed from: e */
        public String f21533e;

        /* renamed from: f */
        public List f21534f;

        /* renamed from: a */
        public final ef2 m24897a() {
            return new ef2(this, null);
        }

        /* renamed from: b */
        public final C13173a m24898b() {
            return this;
        }

        /* renamed from: c */
        public final ok3 m24899c() {
            return this.f21529a;
        }

        /* renamed from: d */
        public final String m24900d() {
            return this.f21530b;
        }

        /* renamed from: e */
        public final me9 m24901e() {
            return this.f21531c;
        }

        /* renamed from: f */
        public final Float m24902f() {
            return this.f21532d;
        }

        /* renamed from: g */
        public final String m24903g() {
            return this.f21533e;
        }

        /* renamed from: h */
        public final List m24904h() {
            return this.f21534f;
        }

        /* renamed from: i */
        public final void m24905i(ok3 ok3Var) {
            this.f21529a = ok3Var;
        }

        /* renamed from: j */
        public final void m24906j(String str) {
            this.f21530b = str;
        }

        /* renamed from: k */
        public final void m24907k(me9 me9Var) {
            this.f21531c = me9Var;
        }

        /* renamed from: l */
        public final void m24908l(Float f) {
            this.f21532d = f;
        }

        /* renamed from: m */
        public final void m24909m(String str) {
            this.f21533e = str;
        }

        /* renamed from: n */
        public final void m24910n(List list) {
            this.f21534f = list;
        }
    }

    /* renamed from: o.ef2$b */
    public static final class C13174b {
        public C13174b() {
        }

        public /* synthetic */ C13174b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ef2(C13173a c13173a, id5 id5Var) {
        this(c13173a);
    }

    /* renamed from: a */
    public final ok3 m24892a() {
        return this.f21523a;
    }

    /* renamed from: b */
    public final String m24893b() {
        return this.f21524b;
    }

    /* renamed from: c */
    public final Float m24894c() {
        return this.f21526d;
    }

    /* renamed from: d */
    public final String m24895d() {
        return this.f21527e;
    }

    /* renamed from: e */
    public final List m24896e() {
        return this.f21528f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef2.class != obj.getClass()) {
            return false;
        }
        ef2 ef2Var = (ef2) obj;
        if (!sq8.m48644c(this.f21523a, ef2Var.f21523a) || !sq8.m48644c(this.f21524b, ef2Var.f21524b) || !sq8.m48644c(this.f21525c, ef2Var.f21525c)) {
            return false;
        }
        Float f = this.f21526d;
        return (f != null ? f.equals(ef2Var.f21526d) : ef2Var.f21526d == null) && sq8.m48644c(this.f21527e, ef2Var.f21527e) && sq8.m48644c(this.f21528f, ef2Var.f21528f);
    }

    public int hashCode() {
        ok3 ok3Var = this.f21523a;
        int iHashCode = (ok3Var != null ? ok3Var.hashCode() : 0) * 31;
        String str = this.f21524b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        me9 me9Var = this.f21525c;
        int iHashCode3 = (iHashCode2 + (me9Var != null ? me9Var.hashCode() : 0)) * 31;
        Float f = this.f21526d;
        int iHashCode4 = (iHashCode3 + (f != null ? f.hashCode() : 0)) * 31;
        String str2 = this.f21527e;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f21528f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Celebrity(");
        sb.append("face=" + this.f21523a + ',');
        sb.append("id=" + this.f21524b + ',');
        sb.append("knownGender=" + this.f21525c + ',');
        sb.append("matchConfidence=" + this.f21526d + ',');
        sb.append("name=" + this.f21527e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("urls=");
        sb2.append(this.f21528f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ef2(C13173a c13173a) {
        this.f21523a = c13173a.m24899c();
        this.f21524b = c13173a.m24900d();
        this.f21525c = c13173a.m24901e();
        this.f21526d = c13173a.m24902f();
        this.f21527e = c13173a.m24903g();
        this.f21528f = c13173a.m24904h();
    }
}
