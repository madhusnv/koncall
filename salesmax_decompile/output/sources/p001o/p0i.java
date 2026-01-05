package p001o;

/* loaded from: classes6.dex */
public final class p0i implements Comparable {

    /* renamed from: b */
    public static final C15936a f39160b = new C15936a(null);

    /* renamed from: a */
    public final long f39161a;

    /* renamed from: o.p0i$a */
    public static final class C15936a {
        public C15936a() {
        }

        public /* synthetic */ C15936a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ p0i(long j) {
        this.f39161a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ p0i m42840a(long j) {
        return new p0i(j);
    }

    /* renamed from: c */
    public static long m42841c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m42842d(long j, Object obj) {
        return (obj instanceof p0i) && j == ((p0i) obj).m42846j();
    }

    /* renamed from: e */
    public static final boolean m42843e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: g */
    public static int m42844g(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: h */
    public static String m42845h(long j) {
        return c5i.m20313d(j, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return c5i.m20311b(m42846j(), ((p0i) obj).m42846j());
    }

    public boolean equals(Object obj) {
        return m42842d(this.f39161a, obj);
    }

    public int hashCode() {
        return m42844g(this.f39161a);
    }

    /* renamed from: j */
    public final /* synthetic */ long m42846j() {
        return this.f39161a;
    }

    public String toString() {
        return m42845h(this.f39161a);
    }
}
