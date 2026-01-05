package c3;

import com.skydoves.balloon.internals.DefinitionKt;
import og.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c3.b */
/* loaded from: classes.dex */
public final class C0847b {

    /* renamed from: a */
    public final long f5352a;

    /* renamed from: a */
    public static long m2270a(float f6, int i10, long j6) {
        float fIntBitsToFloat = (i10 & 1) != 0 ? Float.intBitsToFloat((int) (j6 >> 32)) : DefinitionKt.NO_Float_VALUE;
        if ((i10 & 2) != 0) {
            f6 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
    }

    /* renamed from: b */
    public static final boolean m2271b(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: c */
    public static final float m2272c(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    /* renamed from: d */
    public static final float m2273d(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: e */
    public static final float m2274e(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: f */
    public static final long m2275f(long j6, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    /* renamed from: g */
    public static final long m2276g(long j6, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* renamed from: h */
    public static final long m2277h(float f6, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * f6;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * f6;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* renamed from: i */
    public static String m2278i(long j6) {
        if ((9223372034707292159L & j6) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + z1.m11079a(Float.intBitsToFloat((int) (j6 >> 32))) + ", " + z1.m11079a(Float.intBitsToFloat((int) (j6 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0847b) {
            return this.f5352a == ((C0847b) obj).f5352a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5352a);
    }

    public final String toString() {
        return m2278i(this.f5352a);
    }
}
