package c3;

import og.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c3.e */
/* loaded from: classes.dex */
public final class C0850e {

    /* renamed from: a */
    public final long f5366a;

    /* renamed from: a */
    public static final boolean m2290a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static final float m2291b(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: c */
    public static final float m2292c(long j6) {
        return Math.min(Float.intBitsToFloat((int) ((j6 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j6 & 2147483647L)));
    }

    /* renamed from: d */
    public static final float m2293d(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: e */
    public static final boolean m2294e(long j6) {
        long j10 = (~((((-9223372034707292160L) & j6) >>> 31) * (-1))) & j6;
        return (((j10 & 4294967295L) & (j10 >>> 32)) == 0) | (j6 == 9205357640488583168L);
    }

    /* renamed from: f */
    public static String m2295f(long j6) {
        if (j6 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + z1.m11079a(Float.intBitsToFloat((int) (j6 >> 32))) + ", " + z1.m11079a(Float.intBitsToFloat((int) (j6 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0850e) {
            return this.f5366a == ((C0850e) obj).f5366a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5366a);
    }

    public final String toString() {
        return m2295f(this.f5366a);
    }
}
