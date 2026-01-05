package p001o;

/* loaded from: classes3.dex */
public final class lr6 {

    /* renamed from: c */
    public static final C15142b f34299c = new C15142b(null);

    /* renamed from: a */
    public final Float f34300a;

    /* renamed from: b */
    public final boolean f34301b;

    /* renamed from: o.lr6$a */
    public static final class C15141a {

        /* renamed from: a */
        public Float f34302a;

        /* renamed from: b */
        public boolean f34303b;

        /* renamed from: a */
        public final lr6 m37817a() {
            return new lr6(this, null);
        }

        /* renamed from: b */
        public final C15141a m37818b() {
            return this;
        }

        /* renamed from: c */
        public final Float m37819c() {
            return this.f34302a;
        }

        /* renamed from: d */
        public final boolean m37820d() {
            return this.f34303b;
        }

        /* renamed from: e */
        public final void m37821e(Float f) {
            this.f34302a = f;
        }

        /* renamed from: f */
        public final void m37822f(boolean z) {
            this.f34303b = z;
        }
    }

    /* renamed from: o.lr6$b */
    public static final class C15142b {
        public C15142b() {
        }

        public /* synthetic */ C15142b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ lr6(C15141a c15141a, id5 id5Var) {
        this(c15141a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lr6.class != obj.getClass()) {
            return false;
        }
        lr6 lr6Var = (lr6) obj;
        Float f = this.f34300a;
        return (f != null ? f.equals(lr6Var.f34300a) : lr6Var.f34300a == null) && this.f34301b == lr6Var.f34301b;
    }

    public int hashCode() {
        Float f = this.f34300a;
        return ((f != null ? f.hashCode() : 0) * 31) + Boolean.hashCode(this.f34301b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FaceOccluded(");
        sb.append("confidence=" + this.f34300a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("value=");
        sb2.append(this.f34301b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public lr6(C15141a c15141a) {
        this.f34300a = c15141a.m37819c();
        this.f34301b = c15141a.m37820d();
    }
}
