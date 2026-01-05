package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class bu3 {

    /* renamed from: b */
    public static final C12502a f16822b = new C12502a(null);

    /* renamed from: c */
    public static final int[] f16823c = {18, 20, 17, 15};

    /* renamed from: d */
    public static final int[] f16824d = {65535, 262143, 32767, 8191};

    /* renamed from: e */
    public static final int[] f16825e = {32767, 8191, 65535, 262143};

    /* renamed from: a */
    public final long f16826a;

    /* renamed from: o.bu3$a */
    public static final class C12502a {
        public C12502a() {
        }

        public /* synthetic */ C12502a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m19804a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        /* renamed from: b */
        public final long m19805b(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int iM19804a = m19804a(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int iM19804a2 = m19804a(i6);
            if (iM19804a + iM19804a2 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
            }
            if (iM19804a2 == 13) {
                j = 3;
            } else if (iM19804a2 == 18) {
                j = 1;
            } else if (iM19804a2 == 15) {
                j = 2;
            } else {
                if (iM19804a2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j = 0;
            }
            int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
            int i9 = bu3.f16823c[(int) j];
            return bu3.m19791c((i7 << 33) | j | (i << 2) | (i3 << i9) | (i8 << (i9 + 31)));
        }
    }

    public /* synthetic */ bu3(long j) {
        this.f16826a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ bu3 m19790b(long j) {
        return new bu3(j);
    }

    /* renamed from: c */
    public static long m19791c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m19792d(long j, Object obj) {
        return (obj instanceof bu3) && j == ((bu3) obj).m19803o();
    }

    /* renamed from: e */
    public static final boolean m19793e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final int m19794f(long j) {
        return (int) (j & 3);
    }

    /* renamed from: g */
    public static final boolean m19795g(long j) {
        return m19797i(j) == m19799k(j);
    }

    /* renamed from: h */
    public static final boolean m19796h(long j) {
        return m19798j(j) == m19800l(j);
    }

    /* renamed from: i */
    public static final int m19797i(long j) {
        int iM19794f = m19794f(j);
        int i = ((int) (j >> (f16823c[iM19794f] + 31))) & f16825e[iM19794f];
        return i == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i - 1;
    }

    /* renamed from: j */
    public static final int m19798j(long j) {
        int i = ((int) (j >> 33)) & f16824d[m19794f(j)];
        return i == 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i - 1;
    }

    /* renamed from: k */
    public static final int m19799k(long j) {
        int iM19794f = m19794f(j);
        return ((int) (j >> f16823c[iM19794f])) & f16825e[iM19794f];
    }

    /* renamed from: l */
    public static final int m19800l(long j) {
        return ((int) (j >> 2)) & f16824d[m19794f(j)];
    }

    /* renamed from: m */
    public static int m19801m(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: n */
    public static String m19802n(long j) {
        int iM19798j = m19798j(j);
        String strValueOf = iM19798j == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM19798j);
        int iM19797i = m19797i(j);
        return "Constraints(minWidth = " + m19800l(j) + ", maxWidth = " + strValueOf + ", minHeight = " + m19799k(j) + ", maxHeight = " + (iM19797i != Integer.MAX_VALUE ? String.valueOf(iM19797i) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m19792d(this.f16826a, obj);
    }

    public int hashCode() {
        return m19801m(this.f16826a);
    }

    /* renamed from: o */
    public final /* synthetic */ long m19803o() {
        return this.f16826a;
    }

    public String toString() {
        return m19802n(this.f16826a);
    }
}
