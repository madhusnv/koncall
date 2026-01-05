package p001o;

/* loaded from: classes3.dex */
public final class qp5 {

    /* renamed from: b */
    public static final C16439b f42262b = new C16439b(null);

    /* renamed from: a */
    public final fc8 f42263a;

    /* renamed from: o.qp5$a */
    public static final class C16438a {

        /* renamed from: a */
        public fc8 f42264a;

        /* renamed from: a */
        public final qp5 m45746a() {
            return new qp5(this, null);
        }

        /* renamed from: b */
        public final lp5 m45747b() {
            return null;
        }

        /* renamed from: c */
        public final fc8 m45748c() {
            return this.f42264a;
        }

        /* renamed from: d */
        public final void m45749d(fc8 fc8Var) {
            this.f42264a = fc8Var;
        }
    }

    /* renamed from: o.qp5$b */
    public static final class C16439b {
        public C16439b() {
        }

        public /* synthetic */ C16439b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qp5(C16438a c16438a, id5 id5Var) {
        this(c16438a);
    }

    /* renamed from: a */
    public final lp5 m45744a() {
        return null;
    }

    /* renamed from: b */
    public final fc8 m45745b() {
        return this.f42263a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qp5.class != obj.getClass()) {
            return false;
        }
        return sq8.m48644c(null, null) && sq8.m48644c(this.f42263a, ((qp5) obj).f42263a);
    }

    public int hashCode() {
        fc8 fc8Var = this.f42263a;
        return 0 + (fc8Var != null ? fc8Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectTextRequest(");
        sb.append("filters=" + ((Object) null) + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("image=");
        sb2.append(this.f42263a);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qp5(C16438a c16438a) {
        c16438a.m45747b();
        this.f42263a = c16438a.m45748c();
    }
}
