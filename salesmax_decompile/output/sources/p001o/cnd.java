package p001o;

/* loaded from: classes6.dex */
public abstract class cnd {
    /* renamed from: a */
    public static final int m21476a(int i, int i2, int i3) {
        return m21480e(m21480e(i, i3) - m21480e(i2, i3), i3);
    }

    /* renamed from: b */
    public static final long m21477b(long j, long j2, long j3) {
        return m21481f(m21481f(j, j3) - m21481f(j2, j3), j3);
    }

    /* renamed from: c */
    public static final int m21478c(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m21476a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m21476a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: d */
    public static final long m21479d(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - m21477b(j2, j, j3);
        }
        if (j3 < 0) {
            return j <= j2 ? j2 : j2 + m21477b(j, j2, -j3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: e */
    public static final int m21480e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: f */
    public static final long m21481f(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
