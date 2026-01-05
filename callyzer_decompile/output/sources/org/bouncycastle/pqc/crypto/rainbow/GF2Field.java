package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class GF2Field {
    public static final int MASK = 255;
    static final byte[][] gfMulTable = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);
    static final byte[] gfInvTable = new byte[256];

    static {
        long j6;
        int i10 = 1;
        long j10 = 72340172838076673L;
        while (true) {
            j6 = 506097522914230528L;
            if (i10 > 255) {
                break;
            }
            for (int i11 = 0; i11 < 256; i11 += 8) {
                Pack.longToLittleEndian(gf256Mul_64(j10, j6), gfMulTable[i10], i11);
                j6 += 578721382704613384L;
            }
            j10 += 72340172838076673L;
            i10++;
        }
        for (int i12 = 0; i12 < 256; i12 += 8) {
            Pack.longToLittleEndian(gf256Inv_64(j6), gfInvTable, i12);
            j6 += 578721382704613384L;
        }
    }

    public static short addElem(short s5, short s10) {
        return (short) (s5 ^ s10);
    }

    public static long addElem_64(long j6, long j10) {
        return j6 ^ j10;
    }

    private static short gf16Mul(short s5, short s10) {
        short s11 = (short) (s5 & 3);
        short s12 = (short) ((s5 >>> 2) & 255);
        short s13 = (short) (s10 & 3);
        short s14 = (short) ((s10 >>> 2) & 255);
        short sGf4Mul = gf4Mul(s11, s13);
        short sGf4Mul2 = gf4Mul(s12, s14);
        return (short) ((((((short) (gf4Mul((short) (s12 ^ s11), (short) (s14 ^ s13)) ^ sGf4Mul)) << 2) ^ sGf4Mul) ^ gf4Mul2(sGf4Mul2)) & 255);
    }

    private static short gf16Mul8(short s5) {
        short s10 = (short) (s5 & 3);
        short s11 = (short) ((s5 >>> 2) & 255);
        return (short) ((gf4Mul3(s11) | (gf4Mul2((short) (s10 ^ s11)) << 2)) & 255);
    }

    private static long gf16Mul8_64(long j6) {
        long j10 = 3689348814741910323L & j6;
        long j11 = j6 & (-3689348814741910324L);
        long j12 = (j10 << 2) ^ j11;
        long j13 = j11 >>> 2;
        return j13 ^ gf4Mul2_64(j12 ^ j13);
    }

    private static long gf16Mul_64(long j6, long j10) {
        long jGf4Mul_64 = gf4Mul_64(j6, j10);
        long j11 = 3689348814741910323L & jGf4Mul_64;
        return (gf4Mul_64(((j6 ^ (j6 << 2)) & (-3689348814741910324L)) ^ ((jGf4Mul_64 & (-3689348814741910324L)) >>> 2), ((j10 ^ (j10 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L) ^ (j11 << 2)) ^ j11;
    }

    private static short gf16Squ(short s5) {
        short s10 = (short) (s5 & 3);
        short sGf4Squ = gf4Squ((short) ((s5 >>> 2) & 255));
        return (short) ((((sGf4Squ << 2) ^ gf4Mul2(sGf4Squ)) ^ gf4Squ(s10)) & 255);
    }

    private static long gf16Squ_64(long j6) {
        long jGf4Squ_64 = gf4Squ_64(j6);
        return jGf4Squ_64 ^ (gf4Mul2_64((-3689348814741910324L) & jGf4Squ_64) >>> 2);
    }

    private static short gf256Inv(short s5) {
        short sGf256Squ = gf256Squ(s5);
        short sGf256Squ2 = gf256Squ(sGf256Squ);
        short sGf256Mul = gf256Mul(gf256Mul(sGf256Squ2, sGf256Squ), gf256Squ(sGf256Squ2));
        return gf256Mul(sGf256Squ, gf256Squ(gf256Mul(gf256Squ(gf256Squ(gf256Squ(sGf256Mul))), sGf256Mul)));
    }

    private static long gf256Inv_64(long j6) {
        long jGf256Squ_64 = gf256Squ_64(j6);
        long jGf256Squ_642 = gf256Squ_64(jGf256Squ_64);
        long jGf256Mul_64 = gf256Mul_64(gf256Mul_64(jGf256Squ_642, jGf256Squ_64), gf256Squ_64(jGf256Squ_642));
        return gf256Mul_64(jGf256Squ_64, gf256Squ_64(gf256Mul_64(gf256Squ_64(gf256Squ_64(gf256Squ_64(jGf256Mul_64))), jGf256Mul_64)));
    }

    private static short gf256Mul(short s5, short s10) {
        short s11 = (short) (s5 & 15);
        short s12 = (short) ((s5 >>> 4) & 255);
        short s13 = (short) (s10 & 15);
        short s14 = (short) ((s10 >>> 4) & 255);
        short sGf16Mul = gf16Mul(s11, s13);
        short sGf16Mul2 = gf16Mul(s12, s14);
        return (short) ((((((short) (gf16Mul((short) (s12 ^ s11), (short) (s14 ^ s13)) ^ sGf16Mul)) << 4) ^ sGf16Mul) ^ gf16Mul8(sGf16Mul2)) & 255);
    }

    private static long gf256Mul_64(long j6, long j10) {
        long jGf16Mul_64 = gf16Mul_64(j6, j10);
        long j11 = 1085102592571150095L & jGf16Mul_64;
        return (gf16Mul_64(((j6 ^ (j6 << 4)) & (-1085102592571150096L)) ^ ((jGf16Mul_64 & (-1085102592571150096L)) >>> 4), ((j10 ^ (j10 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j11 << 4)) ^ j11;
    }

    private static short gf256Squ(short s5) {
        short s10 = (short) (s5 & 15);
        short sGf16Squ = gf16Squ((short) ((s5 >>> 4) & 255));
        return (short) ((((sGf16Squ << 4) ^ gf16Mul8(sGf16Squ)) ^ gf16Squ(s10)) & 255);
    }

    private static long gf256Squ_64(long j6) {
        long jGf16Squ_64 = gf16Squ_64(j6);
        return jGf16Squ_64 ^ (gf16Mul8_64((-1085102592571150096L) & jGf16Squ_64) >>> 4);
    }

    private static short gf4Mul(short s5, short s10) {
        return (short) (((gf4Mul2(s5) * (s10 >>> 1)) ^ ((s10 & 1) * s5)) & 255);
    }

    private static short gf4Mul2(short s5) {
        return (short) ((((s5 >>> 1) * 7) ^ (s5 << 1)) & 255);
    }

    private static long gf4Mul2_64(long j6) {
        long j10 = 6148914691236517205L & j6;
        long j11 = j6 & (-6148914691236517206L);
        return (j11 >>> 1) ^ ((j10 << 1) ^ j11);
    }

    private static short gf4Mul3(short s5) {
        int i10 = (s5 - 2) >>> 1;
        return (short) ((((s5 - 1) & (~i10)) | ((s5 * 3) & i10)) & 255);
    }

    private static long gf4Mul_64(long j6, long j10) {
        long j11 = (((j6 << 1) & j10) ^ ((j10 << 1) & j6)) & (-6148914691236517206L);
        long j12 = j6 & j10;
        return ((j12 & (-6148914691236517206L)) >>> 1) ^ (j12 ^ j11);
    }

    private static short gf4Squ(short s5) {
        return (short) ((s5 ^ (s5 >>> 1)) & 255);
    }

    private static long gf4Squ_64(long j6) {
        return j6 ^ (((-6148914691236517206L) & j6) >>> 1);
    }

    public static short invElem(short s5) {
        return (short) (gfInvTable[s5] & 255);
    }

    public static long invElem_64(long j6) {
        return gf256Inv_64(j6);
    }

    public static short multElem(short s5, short s10) {
        return (short) (gfMulTable[s5][s10] & 255);
    }

    public static long multElem_64(long j6, long j10) {
        return gf256Mul_64(j6, j10);
    }
}
