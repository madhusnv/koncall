package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class qo5 {

    /* renamed from: e */
    public static final C16431b f42226e = new C16431b(null);

    /* renamed from: a */
    public final List f42227a;

    /* renamed from: b */
    public final fc8 f42228b;

    /* renamed from: c */
    public final Integer f42229c;

    /* renamed from: d */
    public final Float f42230d;

    /* renamed from: o.qo5$a */
    public static final class C16430a {

        /* renamed from: a */
        public List f42231a;

        /* renamed from: b */
        public fc8 f42232b;

        /* renamed from: c */
        public Integer f42233c;

        /* renamed from: d */
        public Float f42234d;

        /* renamed from: a */
        public final qo5 m45713a() {
            return new qo5(this, null);
        }

        /* renamed from: b */
        public final List m45714b() {
            return this.f42231a;
        }

        /* renamed from: c */
        public final fc8 m45715c() {
            return this.f42232b;
        }

        /* renamed from: d */
        public final Integer m45716d() {
            return this.f42233c;
        }

        /* renamed from: e */
        public final Float m45717e() {
            return this.f42234d;
        }

        /* renamed from: f */
        public final so5 m45718f() {
            return null;
        }

        /* renamed from: g */
        public final void m45719g(fc8 fc8Var) {
            this.f42232b = fc8Var;
        }
    }

    /* renamed from: o.qo5$b */
    public static final class C16431b {
        public C16431b() {
        }

        public /* synthetic */ C16431b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qo5(C16430a c16430a, id5 id5Var) {
        this(c16430a);
    }

    /* renamed from: a */
    public final List m45708a() {
        return this.f42227a;
    }

    /* renamed from: b */
    public final fc8 m45709b() {
        return this.f42228b;
    }

    /* renamed from: c */
    public final Integer m45710c() {
        return this.f42229c;
    }

    /* renamed from: d */
    public final Float m45711d() {
        return this.f42230d;
    }

    /* renamed from: e */
    public final so5 m45712e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qo5.class != obj.getClass()) {
            return false;
        }
        qo5 qo5Var = (qo5) obj;
        if (!sq8.m48644c(this.f42227a, qo5Var.f42227a) || !sq8.m48644c(this.f42228b, qo5Var.f42228b) || !sq8.m48644c(this.f42229c, qo5Var.f42229c)) {
            return false;
        }
        Float f = this.f42230d;
        Float f2 = qo5Var.f42230d;
        return (f != null ? f.equals(f2) : f2 == null) && sq8.m48644c(null, null);
    }

    public int hashCode() {
        List list = this.f42227a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        fc8 fc8Var = this.f42228b;
        int iHashCode2 = (iHashCode + (fc8Var != null ? fc8Var.hashCode() : 0)) * 31;
        Integer num = this.f42229c;
        int iIntValue = (iHashCode2 + (num != null ? num.intValue() : 0)) * 31;
        Float f = this.f42230d;
        return ((iIntValue + (f != null ? f.hashCode() : 0)) * 31) + 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectLabelsRequest(");
        sb.append("features=" + this.f42227a + ',');
        sb.append("image=" + this.f42228b + ',');
        sb.append("maxLabels=" + this.f42229c + ',');
        sb.append("minConfidence=" + this.f42230d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("settings=");
        sb2.append((Object) null);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qo5(C16430a c16430a) {
        this.f42227a = c16430a.m45714b();
        this.f42228b = c16430a.m45715c();
        this.f42229c = c16430a.m45716d();
        this.f42230d = c16430a.m45717e();
        c16430a.m45718f();
    }
}
