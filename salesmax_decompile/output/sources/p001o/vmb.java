package p001o;

/* loaded from: classes3.dex */
public final class vmb {

    /* renamed from: c */
    public static final C17618b f50555c = new C17618b(null);

    /* renamed from: a */
    public final Float f50556a;

    /* renamed from: b */
    public final boolean f50557b;

    /* renamed from: o.vmb$a */
    public static final class C17617a {

        /* renamed from: a */
        public Float f50558a;

        /* renamed from: b */
        public boolean f50559b;

        /* renamed from: a */
        public final vmb m52977a() {
            return new vmb(this, null);
        }

        /* renamed from: b */
        public final C17617a m52978b() {
            return this;
        }

        /* renamed from: c */
        public final Float m52979c() {
            return this.f50558a;
        }

        /* renamed from: d */
        public final boolean m52980d() {
            return this.f50559b;
        }

        /* renamed from: e */
        public final void m52981e(Float f) {
            this.f50558a = f;
        }

        /* renamed from: f */
        public final void m52982f(boolean z) {
            this.f50559b = z;
        }
    }

    /* renamed from: o.vmb$b */
    public static final class C17618b {
        public C17618b() {
        }

        public /* synthetic */ C17618b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ vmb(C17617a c17617a, id5 id5Var) {
        this(c17617a);
    }

    /* renamed from: a */
    public final Float m52975a() {
        return this.f50556a;
    }

    /* renamed from: b */
    public final boolean m52976b() {
        return this.f50557b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vmb.class != obj.getClass()) {
            return false;
        }
        vmb vmbVar = (vmb) obj;
        Float f = this.f50556a;
        return (f != null ? f.equals(vmbVar.f50556a) : vmbVar.f50556a == null) && this.f50557b == vmbVar.f50557b;
    }

    public int hashCode() {
        Float f = this.f50556a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f50557b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MouthOpen(");
        sb.append("confidence=" + this.f50556a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f50557b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public vmb(C17617a c17617a) {
        this.f50556a = c17617a.m52979c();
        this.f50557b = c17617a.m52980d();
    }
}
