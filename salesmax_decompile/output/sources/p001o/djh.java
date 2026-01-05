package p001o;

/* loaded from: classes2.dex */
public final class djh {

    /* renamed from: b */
    public static final C12976a f20128b = new C12976a(null);

    /* renamed from: c */
    public static final long f20129c = m23332e(0);

    /* renamed from: d */
    public static final long f20130d = m23332e(4294967296L);

    /* renamed from: e */
    public static final long f20131e = m23332e(8589934592L);

    /* renamed from: a */
    public final long f20132a;

    /* renamed from: o.djh$a */
    public static final class C12976a {
        public C12976a() {
        }

        public /* synthetic */ C12976a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m23338a() {
            return djh.f20131e;
        }

        /* renamed from: b */
        public final long m23339b() {
            return djh.f20130d;
        }

        /* renamed from: c */
        public final long m23340c() {
            return djh.f20129c;
        }
    }

    public /* synthetic */ djh(long j) {
        this.f20132a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ djh m23331d(long j) {
        return new djh(j);
    }

    /* renamed from: e */
    public static long m23332e(long j) {
        return j;
    }

    /* renamed from: f */
    public static boolean m23333f(long j, Object obj) {
        return (obj instanceof djh) && j == ((djh) obj).m23337j();
    }

    /* renamed from: g */
    public static final boolean m23334g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static int m23335h(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: i */
    public static String m23336i(long j) {
        return m23334g(j, f20129c) ? "Unspecified" : m23334g(j, f20130d) ? "Sp" : m23334g(j, f20131e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m23333f(this.f20132a, obj);
    }

    public int hashCode() {
        return m23335h(this.f20132a);
    }

    /* renamed from: j */
    public final /* synthetic */ long m23337j() {
        return this.f20132a;
    }

    public String toString() {
        return m23336i(this.f20132a);
    }
}
