package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class ok3 {

    /* renamed from: h */
    public static final C15830b f38491h = new C15830b(null);

    /* renamed from: a */
    public final gl1 f38492a;

    /* renamed from: b */
    public final Float f38493b;

    /* renamed from: c */
    public final List f38494c;

    /* renamed from: d */
    public final List f38495d;

    /* renamed from: e */
    public final qed f38496e;

    /* renamed from: f */
    public final wd8 f38497f;

    /* renamed from: g */
    public final nwf f38498g;

    /* renamed from: o.ok3$a */
    public static final class C15829a {

        /* renamed from: a */
        public gl1 f38499a;

        /* renamed from: b */
        public Float f38500b;

        /* renamed from: c */
        public List f38501c;

        /* renamed from: d */
        public List f38502d;

        /* renamed from: e */
        public qed f38503e;

        /* renamed from: f */
        public wd8 f38504f;

        /* renamed from: g */
        public nwf f38505g;

        /* renamed from: a */
        public final ok3 m42352a() {
            return new ok3(this, null);
        }

        /* renamed from: b */
        public final C15829a m42353b() {
            return this;
        }

        /* renamed from: c */
        public final gl1 m42354c() {
            return this.f38499a;
        }

        /* renamed from: d */
        public final Float m42355d() {
            return this.f38500b;
        }

        /* renamed from: e */
        public final List m42356e() {
            return this.f38501c;
        }

        /* renamed from: f */
        public final List m42357f() {
            return this.f38502d;
        }

        /* renamed from: g */
        public final qed m42358g() {
            return this.f38503e;
        }

        /* renamed from: h */
        public final wd8 m42359h() {
            return this.f38504f;
        }

        /* renamed from: i */
        public final nwf m42360i() {
            return this.f38505g;
        }

        /* renamed from: j */
        public final void m42361j(gl1 gl1Var) {
            this.f38499a = gl1Var;
        }

        /* renamed from: k */
        public final void m42362k(Float f) {
            this.f38500b = f;
        }

        /* renamed from: l */
        public final void m42363l(List list) {
            this.f38501c = list;
        }

        /* renamed from: m */
        public final void m42364m(List list) {
            this.f38502d = list;
        }

        /* renamed from: n */
        public final void m42365n(qed qedVar) {
            this.f38503e = qedVar;
        }

        /* renamed from: o */
        public final void m42366o(wd8 wd8Var) {
            this.f38504f = wd8Var;
        }

        /* renamed from: p */
        public final void m42367p(nwf nwfVar) {
            this.f38505g = nwfVar;
        }
    }

    /* renamed from: o.ok3$b */
    public static final class C15830b {
        public C15830b() {
        }

        public /* synthetic */ C15830b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ok3(C15829a c15829a, id5 id5Var) {
        this(c15829a);
    }

    /* renamed from: a */
    public final gl1 m42349a() {
        return this.f38492a;
    }

    /* renamed from: b */
    public final List m42350b() {
        return this.f38495d;
    }

    /* renamed from: c */
    public final qed m42351c() {
        return this.f38496e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ok3.class != obj.getClass()) {
            return false;
        }
        ok3 ok3Var = (ok3) obj;
        if (!sq8.m48644c(this.f38492a, ok3Var.f38492a)) {
            return false;
        }
        Float f = this.f38493b;
        return (f != null ? f.equals(ok3Var.f38493b) : ok3Var.f38493b == null) && sq8.m48644c(this.f38494c, ok3Var.f38494c) && sq8.m48644c(this.f38495d, ok3Var.f38495d) && sq8.m48644c(this.f38496e, ok3Var.f38496e) && sq8.m48644c(this.f38497f, ok3Var.f38497f) && sq8.m48644c(this.f38498g, ok3Var.f38498g);
    }

    public int hashCode() {
        gl1 gl1Var = this.f38492a;
        int iHashCode = (gl1Var != null ? gl1Var.hashCode() : 0) * 31;
        Float f = this.f38493b;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 31;
        List list = this.f38494c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f38495d;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        qed qedVar = this.f38496e;
        int iHashCode5 = (iHashCode4 + (qedVar != null ? qedVar.hashCode() : 0)) * 31;
        wd8 wd8Var = this.f38497f;
        int iHashCode6 = (iHashCode5 + (wd8Var != null ? wd8Var.hashCode() : 0)) * 31;
        nwf nwfVar = this.f38498g;
        return iHashCode6 + (nwfVar != null ? nwfVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComparedFace(");
        sb.append("boundingBox=" + this.f38492a + ',');
        sb.append("confidence=" + this.f38493b + ',');
        sb.append("emotions=" + this.f38494c + ',');
        sb.append("landmarks=" + this.f38495d + ',');
        sb.append("pose=" + this.f38496e + ',');
        sb.append("quality=" + this.f38497f + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("smile=");
        sb2.append(this.f38498g);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ok3(C15829a c15829a) {
        this.f38492a = c15829a.m42354c();
        this.f38493b = c15829a.m42355d();
        this.f38494c = c15829a.m42356e();
        this.f38495d = c15829a.m42357f();
        this.f38496e = c15829a.m42358g();
        this.f38497f = c15829a.m42359h();
        this.f38498g = c15829a.m42360i();
    }
}
