package p001o;

/* loaded from: classes2.dex */
public abstract class evf {

    /* renamed from: a */
    public static final C13264a f22225a = new C13264a(null);

    /* renamed from: b */
    public static final long f22226b = jvf.m34585a(0.0f, 0.0f);

    /* renamed from: c */
    public static final long f22227c = jvf.m34585a(Float.NaN, Float.NaN);

    /* renamed from: o.evf$a */
    public static final class C13264a {
        public C13264a() {
        }

        public /* synthetic */ C13264a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m25660a() {
            return evf.f22227c;
        }

        /* renamed from: b */
        public final long m25661b() {
            return evf.f22226b;
        }
    }

    /* renamed from: c */
    public static long m25654c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final boolean m25655d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static final float m25656e(long j) {
        if (!(j != f22227c)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: f */
    public static final float m25657f(long j) {
        if (!(j != f22227c)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: g */
    public static int m25658g(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: h */
    public static String m25659h(long j) {
        if (!(j != f22225a.m25660a())) {
            return "Size.Unspecified";
        }
        return "Size(" + mo7.m39455a(m25657f(j), 1) + ", " + mo7.m39455a(m25656e(j), 1) + ')';
    }
}
