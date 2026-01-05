package s4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.q */
/* loaded from: classes.dex */
public final class C6761q {

    /* renamed from: a */
    public final long f32216a;

    /* renamed from: a */
    public static long m12958a(long j6, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = Float.intBitsToFloat((int) (j6 >> 32));
        }
        if ((i10 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    /* renamed from: b */
    public static final float m12959b(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: c */
    public static final float m12960c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: d */
    public static final long m12961d(long j6, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    /* renamed from: e */
    public static final long m12962e(long j6, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* renamed from: f */
    public static String m12963f(long j6) {
        return "(" + m12959b(j6) + ", " + m12960c(j6) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6761q) {
            return this.f32216a == ((C6761q) obj).f32216a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32216a);
    }

    public final String toString() {
        return m12963f(this.f32216a);
    }
}
