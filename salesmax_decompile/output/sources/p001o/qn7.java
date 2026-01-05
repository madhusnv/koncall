package p001o;

/* loaded from: classes3.dex */
public final class qn7 {

    /* renamed from: c */
    public static final C16429b f42203c = new C16429b(null);

    /* renamed from: a */
    public final Float f42204a;

    /* renamed from: b */
    public final sn7 f42205b;

    /* renamed from: o.qn7$a */
    public static final class C16428a {

        /* renamed from: a */
        public Float f42206a;

        /* renamed from: b */
        public sn7 f42207b;

        /* renamed from: a */
        public final qn7 m45696a() {
            return new qn7(this, null);
        }

        /* renamed from: b */
        public final C16428a m45697b() {
            return this;
        }

        /* renamed from: c */
        public final Float m45698c() {
            return this.f42206a;
        }

        /* renamed from: d */
        public final sn7 m45699d() {
            return this.f42207b;
        }

        /* renamed from: e */
        public final void m45700e(Float f) {
            this.f42206a = f;
        }

        /* renamed from: f */
        public final void m45701f(sn7 sn7Var) {
            this.f42207b = sn7Var;
        }
    }

    /* renamed from: o.qn7$b */
    public static final class C16429b {
        public C16429b() {
        }

        public /* synthetic */ C16429b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qn7(C16428a c16428a, id5 id5Var) {
        this(c16428a);
    }

    /* renamed from: a */
    public final Float m45694a() {
        return this.f42204a;
    }

    /* renamed from: b */
    public final sn7 m45695b() {
        return this.f42205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qn7.class != obj.getClass()) {
            return false;
        }
        qn7 qn7Var = (qn7) obj;
        Float f = this.f42204a;
        return (f != null ? f.equals(qn7Var.f42204a) : qn7Var.f42204a == null) && sq8.m48644c(this.f42205b, qn7Var.f42205b);
    }

    public int hashCode() {
        Float f = this.f42204a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        sn7 sn7Var = this.f42205b;
        return iHashCode + (sn7Var != null ? sn7Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gender(");
        sb.append("confidence=" + this.f42204a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f42205b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qn7(C16428a c16428a) {
        this.f42204a = c16428a.m45698c();
        this.f42205b = c16428a.m45699d();
    }
}
