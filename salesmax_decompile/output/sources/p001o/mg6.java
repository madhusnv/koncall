package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class mg6 {

    /* renamed from: g */
    public static final C15314b f35383g = new C15314b(null);

    /* renamed from: a */
    public final Integer f35384a;

    /* renamed from: b */
    public final List f35385b;

    /* renamed from: c */
    public final Integer f35386c;

    /* renamed from: d */
    public final Float f35387d;

    /* renamed from: e */
    public final String f35388e;

    /* renamed from: f */
    public final ai6 f35389f;

    /* renamed from: o.mg6$a */
    public static final class C15313a {

        /* renamed from: a */
        public Integer f35390a;

        /* renamed from: b */
        public List f35391b;

        /* renamed from: c */
        public Integer f35392c;

        /* renamed from: d */
        public Float f35393d;

        /* renamed from: e */
        public String f35394e;

        /* renamed from: f */
        public ai6 f35395f;

        /* renamed from: a */
        public final mg6 m38972a() {
            return new mg6(this, null);
        }

        /* renamed from: b */
        public final C15313a m38973b() {
            return this;
        }

        /* renamed from: c */
        public final Integer m38974c() {
            return this.f35390a;
        }

        /* renamed from: d */
        public final List m38975d() {
            return this.f35391b;
        }

        /* renamed from: e */
        public final Integer m38976e() {
            return this.f35392c;
        }

        /* renamed from: f */
        public final Float m38977f() {
            return this.f35393d;
        }

        /* renamed from: g */
        public final String m38978g() {
            return this.f35394e;
        }

        /* renamed from: h */
        public final ai6 m38979h() {
            return this.f35395f;
        }

        /* renamed from: i */
        public final void m38980i(Integer num) {
            this.f35390a = num;
        }

        /* renamed from: j */
        public final void m38981j(List list) {
            this.f35391b = list;
        }

        /* renamed from: k */
        public final void m38982k(Integer num) {
            this.f35392c = num;
        }

        /* renamed from: l */
        public final void m38983l(Float f) {
            this.f35393d = f;
        }

        /* renamed from: m */
        public final void m38984m(String str) {
            this.f35394e = str;
        }

        /* renamed from: n */
        public final void m38985n(ai6 ai6Var) {
            this.f35395f = ai6Var;
        }
    }

    /* renamed from: o.mg6$b */
    public static final class C15314b {
        public C15314b() {
        }

        public /* synthetic */ C15314b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mg6(C15313a c15313a, id5 id5Var) {
        this(c15313a);
    }

    /* renamed from: a */
    public final Integer m38968a() {
        return this.f35384a;
    }

    /* renamed from: b */
    public final Float m38969b() {
        return this.f35387d;
    }

    /* renamed from: c */
    public final String m38970c() {
        return this.f35388e;
    }

    /* renamed from: d */
    public final ai6 m38971d() {
        return this.f35389f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mg6.class != obj.getClass()) {
            return false;
        }
        mg6 mg6Var = (mg6) obj;
        if (!sq8.m48644c(this.f35384a, mg6Var.f35384a) || !sq8.m48644c(this.f35385b, mg6Var.f35385b) || !sq8.m48644c(this.f35386c, mg6Var.f35386c)) {
            return false;
        }
        Float f = this.f35387d;
        return (f != null ? f.equals(mg6Var.f35387d) : mg6Var.f35387d == null) && sq8.m48644c(this.f35388e, mg6Var.f35388e) && sq8.m48644c(this.f35389f, mg6Var.f35389f);
    }

    public int hashCode() {
        Integer num = this.f35384a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        List list = this.f35385b;
        int iHashCode = (iIntValue + (list != null ? list.hashCode() : 0)) * 31;
        Integer num2 = this.f35386c;
        int iIntValue2 = (iHashCode + (num2 != null ? num2.intValue() : 0)) * 31;
        Float f = this.f35387d;
        int iHashCode2 = (iIntValue2 + (f != null ? f.hashCode() : 0)) * 31;
        String str = this.f35388e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        ai6 ai6Var = this.f35389f;
        return iHashCode3 + (ai6Var != null ? ai6Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entity(");
        sb.append("beginOffset=" + this.f35384a + ',');
        sb.append("blockReferences=" + this.f35385b + ',');
        sb.append("endOffset=" + this.f35386c + ',');
        sb.append("score=" + this.f35387d + ',');
        sb.append("text=" + this.f35388e + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type=");
        sb2.append(this.f35389f);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mg6(C15313a c15313a) {
        this.f35384a = c15313a.m38974c();
        this.f35385b = c15313a.m38975d();
        this.f35386c = c15313a.m38976e();
        this.f35387d = c15313a.m38977f();
        this.f35388e = c15313a.m38978g();
        this.f35389f = c15313a.m38979h();
    }
}
