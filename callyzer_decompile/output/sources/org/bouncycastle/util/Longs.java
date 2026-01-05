package org.bouncycastle.util;

/* loaded from: classes3.dex */
public class Longs {
    public static final int BYTES = 8;
    public static final int SIZE = 64;

    public static long highestOneBit(long j6) {
        return Long.highestOneBit(j6);
    }

    public static long lowestOneBit(long j6) {
        return Long.lowestOneBit(j6);
    }

    public static int numberOfLeadingZeros(long j6) {
        return Long.numberOfLeadingZeros(j6);
    }

    public static int numberOfTrailingZeros(long j6) {
        return Long.numberOfTrailingZeros(j6);
    }

    public static long reverse(long j6) {
        return Long.reverse(j6);
    }

    public static long reverseBytes(long j6) {
        return Long.reverseBytes(j6);
    }

    public static long rotateLeft(long j6, int i10) {
        return Long.rotateLeft(j6, i10);
    }

    public static long rotateRight(long j6, int i10) {
        return Long.rotateRight(j6, i10);
    }

    public static Long valueOf(long j6) {
        return Long.valueOf(j6);
    }
}
