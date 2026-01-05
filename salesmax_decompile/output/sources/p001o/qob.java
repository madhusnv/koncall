package p001o;

/* loaded from: classes3.dex */
public final class qob {

    /* renamed from: c */
    public static final C16435b f42246c = new C16435b(null);

    /* renamed from: a */
    public final Float f42247a;

    /* renamed from: b */
    public final boolean f42248b;

    /* renamed from: o.qob$a */
    public static final class C16434a {

        /* renamed from: a */
        public Float f42249a;

        /* renamed from: b */
        public boolean f42250b;

        /* renamed from: a */
        public final qob m45728a() {
            return new qob(this, null);
        }

        /* renamed from: b */
        public final C16434a m45729b() {
            return this;
        }

        /* renamed from: c */
        public final Float m45730c() {
            return this.f42249a;
        }

        /* renamed from: d */
        public final boolean m45731d() {
            return this.f42250b;
        }

        /* renamed from: e */
        public final void m45732e(Float f) {
            this.f42249a = f;
        }

        /* renamed from: f */
        public final void m45733f(boolean z) {
            this.f42250b = z;
        }
    }

    /* renamed from: o.qob$b */
    public static final class C16435b {
        public C16435b() {
        }

        public /* synthetic */ C16435b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qob(C16434a c16434a, id5 id5Var) {
        this(c16434a);
    }

    /* renamed from: a */
    public final Float m45726a() {
        return this.f42247a;
    }

    /* renamed from: b */
    public final boolean m45727b() {
        return this.f42248b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qob.class != obj.getClass()) {
            return false;
        }
        qob qobVar = (qob) obj;
        Float f = this.f42247a;
        return (f != null ? f.equals(qobVar.f42247a) : qobVar.f42247a == null) && this.f42248b == qobVar.f42248b;
    }

    public int hashCode() {
        Float f = this.f42247a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f42248b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mustache(");
        sb.append("confidence=" + this.f42247a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f42248b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qob(C16434a c16434a) {
        this.f42247a = c16434a.m45730c();
        this.f42248b = c16434a.m45731d();
    }
}
