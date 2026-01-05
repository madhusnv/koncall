package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Utils {
    public static short bitrev(short s5, int i10) {
        short s10 = (short) (((s5 & 65280) >> 8) | ((s5 & 255) << 8));
        short s11 = (short) (((s10 & 61680) >> 4) | ((s10 & 3855) << 4));
        short s12 = (short) (((s11 & 52428) >> 2) | ((s11 & 13107) << 2));
        short s13 = (short) (((s12 & 43690) >> 1) | ((s12 & 21845) << 1));
        return (short) (i10 == 12 ? s13 >> 4 : s13 >> 3);
    }

    public static int load4(byte[] bArr, int i10) {
        return Pack.littleEndianToInt(bArr, i10);
    }

    public static long load8(byte[] bArr, int i10) {
        return Pack.littleEndianToLong(bArr, i10);
    }

    public static short load_gf(byte[] bArr, int i10, int i11) {
        return (short) (Pack.littleEndianToShort(bArr, i10) & i11);
    }

    public static void store8(byte[] bArr, int i10, long j6) {
        bArr[i10] = (byte) (j6 & 255);
        bArr[i10 + 1] = (byte) ((j6 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j6 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((j6 >> 24) & 255);
        bArr[i10 + 4] = (byte) ((j6 >> 32) & 255);
        bArr[i10 + 5] = (byte) ((j6 >> 40) & 255);
        bArr[i10 + 6] = (byte) ((j6 >> 48) & 255);
        bArr[i10 + 7] = (byte) ((j6 >> 56) & 255);
    }

    public static void store_gf(byte[] bArr, int i10, short s5) {
        bArr[i10] = (byte) (s5 & 255);
        bArr[i10 + 1] = (byte) (s5 >> 8);
    }
}
