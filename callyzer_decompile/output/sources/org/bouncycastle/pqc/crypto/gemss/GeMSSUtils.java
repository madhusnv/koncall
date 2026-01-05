package org.bouncycastle.pqc.crypto.gemss;

/* loaded from: classes3.dex */
public class GeMSSUtils {
    public static long CMP_LT_UINT(long j6, long j10) {
        long j11 = j6 >>> 63;
        long j12 = j10 >>> 63;
        long j13 = j11 ^ j12;
        return ((((j6 & Long.MAX_VALUE) - (j10 & Long.MAX_VALUE)) >>> 63) & (1 ^ j13)) ^ (((j11 - j12) >>> 63) & j13);
    }

    public static int Highest_One(int i10) {
        int i11 = i10 | (i10 >>> 1);
        int i12 = i11 | (i11 >>> 2);
        int i13 = i12 | (i12 >>> 4);
        int i14 = i13 | (i13 >>> 8);
        int i15 = i14 | (i14 >>> 16);
        return i15 ^ (i15 >>> 1);
    }

    public static long NORBITS_UINT(long j6) {
        return (((j6 | (j6 << 32)) >>> 32) - 1) >>> 63;
    }

    public static long ORBITS_UINT(long j6) {
        return (((j6 | (j6 << 32)) >>> 32) + 4294967295L) >>> 32;
    }

    public static long XORBITS_UINT(long j6) {
        long j10 = j6 ^ (j6 << 1);
        return (((j10 ^ (j10 << 2)) & (-8608480567731124088L)) * 1229782938247303441L) >>> 63;
    }

    public static long maskUINT(int i10) {
        if (i10 != 0) {
            return (1 << i10) - 1;
        }
        return -1L;
    }
}
