package p001o;

/* loaded from: classes2.dex */
public final class jhh {

    /* renamed from: c */
    public static final C14545a f30461c = new C14545a(null);

    /* renamed from: d */
    public static final jhh f30462d = new jhh(0, 0, 3, null);

    /* renamed from: a */
    public final long f30463a;

    /* renamed from: b */
    public final long f30464b;

    /* renamed from: o.jhh$a */
    public static final class C14545a {
        public C14545a() {
        }

        public /* synthetic */ C14545a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jhh(long j, long j2, id5 id5Var) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long m33842a() {
        return this.f30463a;
    }

    /* renamed from: b */
    public final long m33843b() {
        return this.f30464b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhh)) {
            return false;
        }
        jhh jhhVar = (jhh) obj;
        return bjh.m19254e(this.f30463a, jhhVar.f30463a) && bjh.m19254e(this.f30464b, jhhVar.f30464b);
    }

    public int hashCode() {
        return (bjh.m19258i(this.f30463a) * 31) + bjh.m19258i(this.f30464b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) bjh.m19259j(this.f30463a)) + ", restLine=" + ((Object) bjh.m19259j(this.f30464b)) + ')';
    }

    public jhh(long j, long j2) {
        this.f30463a = j;
        this.f30464b = j2;
    }

    public /* synthetic */ jhh(long j, long j2, int i, id5 id5Var) {
        this((i & 1) != 0 ? cjh.m21325b(0) : j, (i & 2) != 0 ? cjh.m21325b(0) : j2, null);
    }
}
