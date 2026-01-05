package p001o;

/* loaded from: classes2.dex */
public abstract class th3 {

    /* renamed from: a */
    public static final C17111a f47123a = new C17111a(null);

    /* renamed from: b */
    public static final long f47124b;

    /* renamed from: c */
    public static final long f47125c;

    /* renamed from: d */
    public static final long f47126d;

    /* renamed from: e */
    public static final long f47127e;

    /* renamed from: o.th3$a */
    public static final class C17111a {
        public C17111a() {
        }

        public /* synthetic */ C17111a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m49877a() {
            return th3.f47126d;
        }

        /* renamed from: b */
        public final long m49878b() {
            return th3.f47124b;
        }

        /* renamed from: c */
        public final long m49879c() {
            return th3.f47125c;
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f47124b = m49872d((0 & 4294967295L) | j2);
        f47125c = m49872d((1 & 4294967295L) | j2);
        f47126d = m49872d(j2 | (2 & 4294967295L));
        f47127e = m49872d((j & 4294967295L) | (4 << 32));
    }

    /* renamed from: d */
    public static long m49872d(long j) {
        return j;
    }

    /* renamed from: e */
    public static final boolean m49873e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final int m49874f(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: g */
    public static int m49875g(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: h */
    public static String m49876h(long j) {
        return m49873e(j, f47124b) ? "Rgb" : m49873e(j, f47125c) ? "Xyz" : m49873e(j, f47126d) ? "Lab" : m49873e(j, f47127e) ? "Cmyk" : "Unknown";
    }
}
