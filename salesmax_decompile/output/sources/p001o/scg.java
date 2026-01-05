package p001o;

/* loaded from: classes3.dex */
public final class scg {

    /* renamed from: c */
    public static final C16811b f45224c = new C16811b(null);

    /* renamed from: a */
    public final Float f45225a;

    /* renamed from: b */
    public final boolean f45226b;

    /* renamed from: o.scg$a */
    public static final class C16810a {

        /* renamed from: a */
        public Float f45227a;

        /* renamed from: b */
        public boolean f45228b;

        /* renamed from: a */
        public final scg m48209a() {
            return new scg(this, null);
        }

        /* renamed from: b */
        public final C16810a m48210b() {
            return this;
        }

        /* renamed from: c */
        public final Float m48211c() {
            return this.f45227a;
        }

        /* renamed from: d */
        public final boolean m48212d() {
            return this.f45228b;
        }

        /* renamed from: e */
        public final void m48213e(Float f) {
            this.f45227a = f;
        }

        /* renamed from: f */
        public final void m48214f(boolean z) {
            this.f45228b = z;
        }
    }

    /* renamed from: o.scg$b */
    public static final class C16811b {
        public C16811b() {
        }

        public /* synthetic */ C16811b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ scg(C16810a c16810a, id5 id5Var) {
        this(c16810a);
    }

    /* renamed from: a */
    public final Float m48207a() {
        return this.f45225a;
    }

    /* renamed from: b */
    public final boolean m48208b() {
        return this.f45226b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || scg.class != obj.getClass()) {
            return false;
        }
        scg scgVar = (scg) obj;
        Float f = this.f45225a;
        return (f != null ? f.equals(scgVar.f45225a) : scgVar.f45225a == null) && this.f45226b == scgVar.f45226b;
    }

    public int hashCode() {
        Float f = this.f45225a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f45226b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sunglasses(");
        sb.append("confidence=" + this.f45225a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f45226b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public scg(C16810a c16810a) {
        this.f45225a = c16810a.m48211c();
        this.f45226b = c16810a.m48212d();
    }
}
