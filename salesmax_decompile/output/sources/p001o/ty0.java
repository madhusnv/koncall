package p001o;

/* loaded from: classes2.dex */
public final class ty0 {

    /* renamed from: d */
    public static final ty0 f48024d = new C17251b().m50773d();

    /* renamed from: a */
    public final boolean f48025a;

    /* renamed from: b */
    public final boolean f48026b;

    /* renamed from: c */
    public final boolean f48027c;

    /* renamed from: o.ty0$b */
    public static final class C17251b {

        /* renamed from: a */
        public boolean f48028a;

        /* renamed from: b */
        public boolean f48029b;

        /* renamed from: c */
        public boolean f48030c;

        /* renamed from: d */
        public ty0 m50773d() {
            if (this.f48028a || !(this.f48029b || this.f48030c)) {
                return new ty0(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        /* renamed from: e */
        public C17251b m50774e(boolean z) {
            this.f48028a = z;
            return this;
        }

        /* renamed from: f */
        public C17251b m50775f(boolean z) {
            this.f48029b = z;
            return this;
        }

        /* renamed from: g */
        public C17251b m50776g(boolean z) {
            this.f48030c = z;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ty0.class != obj.getClass()) {
            return false;
        }
        ty0 ty0Var = (ty0) obj;
        return this.f48025a == ty0Var.f48025a && this.f48026b == ty0Var.f48026b && this.f48027c == ty0Var.f48027c;
    }

    public int hashCode() {
        return ((this.f48025a ? 1 : 0) << 2) + ((this.f48026b ? 1 : 0) << 1) + (this.f48027c ? 1 : 0);
    }

    public ty0(C17251b c17251b) {
        this.f48025a = c17251b.f48028a;
        this.f48026b = c17251b.f48029b;
        this.f48027c = c17251b.f48030c;
    }
}
