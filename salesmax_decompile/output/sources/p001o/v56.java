package p001o;

/* loaded from: classes3.dex */
public final class v56 {

    /* renamed from: c */
    public static final C17510b f49889c = new C17510b(null);

    /* renamed from: a */
    public final Float f49890a;

    /* renamed from: b */
    public final y56 f49891b;

    /* renamed from: o.v56$a */
    public static final class C17509a {

        /* renamed from: a */
        public Float f49892a;

        /* renamed from: b */
        public y56 f49893b;

        /* renamed from: a */
        public final v56 m52335a() {
            return new v56(this, null);
        }

        /* renamed from: b */
        public final C17509a m52336b() {
            return this;
        }

        /* renamed from: c */
        public final Float m52337c() {
            return this.f49892a;
        }

        /* renamed from: d */
        public final y56 m52338d() {
            return this.f49893b;
        }

        /* renamed from: e */
        public final void m52339e(Float f) {
            this.f49892a = f;
        }

        /* renamed from: f */
        public final void m52340f(y56 y56Var) {
            this.f49893b = y56Var;
        }
    }

    /* renamed from: o.v56$b */
    public static final class C17510b {
        public C17510b() {
        }

        public /* synthetic */ C17510b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ v56(C17509a c17509a, id5 id5Var) {
        this(c17509a);
    }

    /* renamed from: a */
    public final Float m52333a() {
        return this.f49890a;
    }

    /* renamed from: b */
    public final y56 m52334b() {
        return this.f49891b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v56.class != obj.getClass()) {
            return false;
        }
        v56 v56Var = (v56) obj;
        Float f = this.f49890a;
        return (f != null ? f.equals(v56Var.f49890a) : v56Var.f49890a == null) && sq8.m48644c(this.f49891b, v56Var.f49891b);
    }

    public int hashCode() {
        Float f = this.f49890a;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        y56 y56Var = this.f49891b;
        return iHashCode + (y56Var != null ? y56Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Emotion(");
        sb.append("confidence=" + this.f49890a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type=");
        sb2.append(this.f49891b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public v56(C17509a c17509a) {
        this.f49890a = c17509a.m52337c();
        this.f49891b = c17509a.m52338d();
    }
}
