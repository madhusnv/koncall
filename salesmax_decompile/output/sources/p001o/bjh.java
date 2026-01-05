package p001o;

import p001o.djh;

/* loaded from: classes2.dex */
public final class bjh {

    /* renamed from: b */
    public static final C12444a f16444b = new C12444a(null);

    /* renamed from: c */
    public static final djh[] f16445c;

    /* renamed from: d */
    public static final long f16446d;

    /* renamed from: a */
    public final long f16447a;

    /* renamed from: o.bjh$a */
    public static final class C12444a {
        public C12444a() {
        }

        public /* synthetic */ C12444a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m19261a() {
            return bjh.f16446d;
        }
    }

    static {
        djh.C12976a c12976a = djh.f20128b;
        f16445c = new djh[]{djh.m23331d(c12976a.m23340c()), djh.m23331d(c12976a.m23339b()), djh.m23331d(c12976a.m23338a())};
        f16446d = cjh.m21326c(0L, Float.NaN);
    }

    public /* synthetic */ bjh(long j) {
        this.f16447a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ bjh m19251b(long j) {
        return new bjh(j);
    }

    /* renamed from: c */
    public static long m19252c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m19253d(long j, Object obj) {
        return (obj instanceof bjh) && j == ((bjh) obj).m19260k();
    }

    /* renamed from: e */
    public static final boolean m19254e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final long m19255f(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: g */
    public static final long m19256g(long j) {
        return f16445c[(int) (m19255f(j) >>> 32)].m23337j();
    }

    /* renamed from: h */
    public static final float m19257h(long j) {
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: i */
    public static int m19258i(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: j */
    public static String m19259j(long j) {
        long jM19256g = m19256g(j);
        djh.C12976a c12976a = djh.f20128b;
        if (djh.m23334g(jM19256g, c12976a.m23340c())) {
            return "Unspecified";
        }
        if (djh.m23334g(jM19256g, c12976a.m23339b())) {
            return m19257h(j) + ".sp";
        }
        if (!djh.m23334g(jM19256g, c12976a.m23338a())) {
            return "Invalid";
        }
        return m19257h(j) + ".em";
    }

    public boolean equals(Object obj) {
        return m19253d(this.f16447a, obj);
    }

    public int hashCode() {
        return m19258i(this.f16447a);
    }

    /* renamed from: k */
    public final /* synthetic */ long m19260k() {
        return this.f16447a;
    }

    public String toString() {
        return m19259j(this.f16447a);
    }
}
