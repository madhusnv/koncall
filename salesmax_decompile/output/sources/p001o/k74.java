package p001o;

/* loaded from: classes2.dex */
public abstract class k74 {

    /* renamed from: a */
    public static final C14724a f31568a = new C14724a(null);

    /* renamed from: b */
    public static final long f31569b = l74.m36646b(0.0f, 0.0f, 2, null);

    /* renamed from: o.k74$a */
    public static final class C14724a {
        public C14724a() {
        }

        public /* synthetic */ C14724a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m35101a() {
            return k74.f31569b;
        }
    }

    /* renamed from: b */
    public static long m35095b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final boolean m35096c(long j, long j2) {
        return j == j2;
    }

    /* renamed from: d */
    public static final float m35097d(long j) {
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: e */
    public static final float m35098e(long j) {
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: f */
    public static int m35099f(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: g */
    public static String m35100g(long j) {
        if (m35097d(j) == m35098e(j)) {
            return "CornerRadius.circular(" + mo7.m39455a(m35097d(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + mo7.m39455a(m35097d(j), 1) + ", " + mo7.m39455a(m35098e(j), 1) + ')';
    }
}
