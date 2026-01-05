package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes3.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 32;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;

    /* renamed from: L */
    private static final int[] f27957L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, f27957L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    public static void getOrderWnafVar(int i10, byte[] bArr) {
        Wnaf.getSignedVar(f27957L, i10, bArr);
    }

    public static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(f27957L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    public static byte[] reduce384(byte[] bArr) {
        long jDecode32 = Codec.decode32(bArr, 0) & M32L;
        long jDecode24 = (Codec.decode24(bArr, 4) << 4) & M32L;
        long jDecode322 = Codec.decode32(bArr, 7) & M32L;
        long jDecode242 = (Codec.decode24(bArr, 11) << 4) & M32L;
        long jDecode323 = Codec.decode32(bArr, 14) & M32L;
        long jDecode243 = (Codec.decode24(bArr, 18) << 4) & M32L;
        long jDecode324 = Codec.decode32(bArr, 21) & M32L;
        long jDecode244 = (Codec.decode24(bArr, 25) << 4) & M32L;
        long jDecode325 = Codec.decode32(bArr, 28) & M32L;
        long jDecode245 = Codec.decode24(bArr, 32) << 4;
        long j6 = jDecode245 & M32L;
        long jDecode326 = Codec.decode32(bArr, 35);
        long j10 = jDecode326 & M32L;
        long jDecode246 = Codec.decode24(bArr, 39) << 4;
        long j11 = jDecode246 & M32L;
        long jDecode327 = Codec.decode32(bArr, 42);
        long jDecode16 = ((Codec.decode16(bArr, 46) << 4) & M32L) + ((jDecode327 & M32L) >> 28);
        long j12 = jDecode325 - (jDecode16 * 5343);
        long j13 = (jDecode327 & M28L) + (j11 >> 28);
        long j14 = (jDecode323 - (jDecode16 * (-50998291))) - (j13 * 19280294);
        long j15 = (jDecode243 - (jDecode16 * 19280294)) - (j13 * 127719000);
        long j16 = (jDecode324 - (jDecode16 * 127719000)) - (j13 * (-6428113));
        long j17 = (jDecode244 - (jDecode16 * (-6428113))) - (j13 * 5343);
        long j18 = (jDecode246 & M28L) + (j10 >> 28);
        long j19 = jDecode322 - (j18 * (-50998291));
        long j20 = (jDecode242 - (j13 * (-50998291))) - (j18 * 19280294);
        long j21 = j14 - (j18 * 127719000);
        long j22 = j15 - (j18 * (-6428113));
        long j23 = j16 - (j18 * 5343);
        long j24 = (jDecode326 & M28L) + (j6 >> 28);
        long j25 = jDecode245 & M28L;
        long j26 = jDecode24 - (j24 * (-50998291));
        long j27 = j19 - (j24 * 19280294);
        long j28 = j20 - (j24 * 127719000);
        long j29 = j21 - (j24 * (-6428113));
        long j30 = j22 - (j24 * 5343);
        long j31 = j12 + (j17 >> 28);
        long j32 = j17 & M28L;
        long j33 = j25 + (j31 >> 28);
        long j34 = j31 & M28L;
        long j35 = j34 >>> 27;
        long j36 = j33 + j35;
        long j37 = jDecode32 - (j36 * (-50998291));
        long j38 = j27 - (j36 * 127719000);
        long j39 = j28 - (j36 * (-6428113));
        long j40 = j29 - (j36 * 5343);
        long j41 = (j26 - (j36 * 19280294)) + (j37 >> 28);
        long j42 = j37 & M28L;
        long j43 = j38 + (j41 >> 28);
        long j44 = j41 & M28L;
        long j45 = j39 + (j43 >> 28);
        long j46 = j43 & M28L;
        long j47 = j40 + (j45 >> 28);
        long j48 = j45 & M28L;
        long j49 = j30 + (j47 >> 28);
        long j50 = j47 & M28L;
        long j51 = j23 + (j49 >> 28);
        long j52 = j49 & M28L;
        long j53 = j32 + (j51 >> 28);
        long j54 = j51 & M28L;
        long j55 = j34 + (j53 >> 28);
        long j56 = j53 & M28L;
        long j57 = j55 >> 28;
        long j58 = j55 & M28L;
        long j59 = j57 - j35;
        long j60 = j42 + (j59 & (-50998291));
        long j61 = j44 + (j59 & 19280294) + (j60 >> 28);
        long j62 = j60 & M28L;
        long j63 = j46 + (j59 & 127719000) + (j61 >> 28);
        long j64 = j61 & M28L;
        long j65 = j48 + (j59 & (-6428113)) + (j63 >> 28);
        long j66 = j63 & M28L;
        long j67 = j50 + (j59 & 5343) + (j65 >> 28);
        long j68 = j65 & M28L;
        long j69 = j52 + (j67 >> 28);
        long j70 = j67 & M28L;
        long j71 = j54 + (j69 >> 28);
        long j72 = j69 & M28L;
        long j73 = j56 + (j71 >> 28);
        long j74 = j71 & M28L;
        long j75 = j58 + (j73 >> 28);
        long j76 = M28L & j73;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j62 | (j64 << 28), bArr2, 0);
        Codec.encode56(j66 | (j68 << 28), bArr2, 7);
        Codec.encode56((j72 << 28) | j70, bArr2, 14);
        Codec.encode56((j76 << 28) | j74, bArr2, 21);
        Codec.encode32((int) j75, bArr2, 28);
        return bArr2;
    }

    public static byte[] reduce512(byte[] bArr) {
        long jDecode32 = Codec.decode32(bArr, 0) & M32L;
        long jDecode24 = (Codec.decode24(bArr, 4) << 4) & M32L;
        long jDecode322 = Codec.decode32(bArr, 7) & M32L;
        long jDecode242 = (Codec.decode24(bArr, 11) << 4) & M32L;
        long jDecode323 = Codec.decode32(bArr, 14) & M32L;
        long jDecode243 = (Codec.decode24(bArr, 18) << 4) & M32L;
        long jDecode324 = Codec.decode32(bArr, 21) & M32L;
        long jDecode244 = (Codec.decode24(bArr, 25) << 4) & M32L;
        long jDecode325 = Codec.decode32(bArr, 28) & M32L;
        long jDecode245 = (Codec.decode24(bArr, 32) << 4) & M32L;
        long jDecode326 = Codec.decode32(bArr, 35) & M32L;
        long jDecode246 = (Codec.decode24(bArr, 39) << 4) & M32L;
        long jDecode327 = Codec.decode32(bArr, 42) & M32L;
        long jDecode247 = (Codec.decode24(bArr, 46) << 4) & M32L;
        long jDecode328 = Codec.decode32(bArr, 49);
        long j6 = jDecode328 & M32L;
        long jDecode248 = (Codec.decode24(bArr, 53) << 4) & M32L;
        long jDecode329 = Codec.decode32(bArr, 56);
        long j10 = jDecode329 & M32L;
        long jDecode249 = (Codec.decode24(bArr, 60) << 4) & M32L;
        long j11 = bArr[63] & M08L;
        long j12 = jDecode249 + (j10 >> 28);
        long j13 = jDecode329 & M28L;
        long j14 = (jDecode327 - (j11 * (-6428113))) - (j12 * 5343);
        long j15 = (jDecode325 - (j12 * (-50998291))) - (j13 * 19280294);
        long j16 = ((jDecode245 - (j11 * (-50998291))) - (j12 * 19280294)) - (j13 * 127719000);
        long j17 = ((jDecode326 - (j11 * 19280294)) - (j12 * 127719000)) - (j13 * (-6428113));
        long j18 = ((jDecode246 - (j11 * 127719000)) - (j12 * (-6428113))) - (j13 * 5343);
        long j19 = jDecode248 + (j6 >> 28);
        long j20 = jDecode328 & M28L;
        long j21 = j17 - (j19 * 5343);
        long j22 = (j16 - (j19 * (-6428113))) - (j20 * 5343);
        long j23 = (jDecode247 - (j11 * 5343)) + (j14 >> 28);
        long j24 = ((jDecode324 - (j19 * (-50998291))) - (j20 * 19280294)) - (j23 * 127719000);
        long j25 = (((jDecode244 - (j13 * (-50998291))) - (j19 * 19280294)) - (j20 * 127719000)) - (j23 * (-6428113));
        long j26 = ((j15 - (j19 * 127719000)) - (j20 * (-6428113))) - (j23 * 5343);
        long j27 = (j14 & M28L) + (j18 >> 28);
        long j28 = (jDecode323 - (j23 * (-50998291))) - (j27 * 19280294);
        long j29 = ((jDecode243 - (j20 * (-50998291))) - (j23 * 19280294)) - (j27 * 127719000);
        long j30 = j25 - (j27 * 5343);
        long j31 = (j18 & M28L) + (j21 >> 28);
        long j32 = jDecode322 - (j31 * (-50998291));
        long j33 = (jDecode242 - (j27 * (-50998291))) - (j31 * 19280294);
        long j34 = j28 - (j31 * 127719000);
        long j35 = j29 - (j31 * (-6428113));
        long j36 = (j24 - (j27 * (-6428113))) - (j31 * 5343);
        long j37 = (j21 & M28L) + (j22 >> 28);
        long j38 = j22 & M28L;
        long j39 = jDecode24 - (j37 * (-50998291));
        long j40 = j32 - (j37 * 19280294);
        long j41 = j33 - (j37 * 127719000);
        long j42 = j34 - (j37 * (-6428113));
        long j43 = j35 - (j37 * 5343);
        long j44 = j26 + (j30 >> 28);
        long j45 = j30 & M28L;
        long j46 = j38 + (j44 >> 28);
        long j47 = j44 & M28L;
        long j48 = j47 >>> 27;
        long j49 = j46 + j48;
        long j50 = jDecode32 - (j49 * (-50998291));
        long j51 = j40 - (j49 * 127719000);
        long j52 = j41 - (j49 * (-6428113));
        long j53 = j42 - (j49 * 5343);
        long j54 = (j39 - (j49 * 19280294)) + (j50 >> 28);
        long j55 = j50 & M28L;
        long j56 = j51 + (j54 >> 28);
        long j57 = j54 & M28L;
        long j58 = j52 + (j56 >> 28);
        long j59 = j56 & M28L;
        long j60 = j53 + (j58 >> 28);
        long j61 = j58 & M28L;
        long j62 = j43 + (j60 >> 28);
        long j63 = j60 & M28L;
        long j64 = j36 + (j62 >> 28);
        long j65 = j62 & M28L;
        long j66 = j45 + (j64 >> 28);
        long j67 = j64 & M28L;
        long j68 = j47 + (j66 >> 28);
        long j69 = j66 & M28L;
        long j70 = j68 >> 28;
        long j71 = j68 & M28L;
        long j72 = j70 - j48;
        long j73 = j55 + (j72 & (-50998291));
        long j74 = j57 + (j72 & 19280294) + (j73 >> 28);
        long j75 = j73 & M28L;
        long j76 = j59 + (j72 & 127719000) + (j74 >> 28);
        long j77 = j74 & M28L;
        long j78 = j61 + (j72 & (-6428113)) + (j76 >> 28);
        long j79 = j76 & M28L;
        long j80 = j63 + (j72 & 5343) + (j78 >> 28);
        long j81 = j78 & M28L;
        long j82 = j65 + (j80 >> 28);
        long j83 = j80 & M28L;
        long j84 = j67 + (j82 >> 28);
        long j85 = j82 & M28L;
        long j86 = j69 + (j84 >> 28);
        long j87 = j84 & M28L;
        long j88 = j71 + (j86 >> 28);
        long j89 = j86 & M28L;
        byte[] bArr2 = new byte[32];
        Codec.encode56(j75 | (j77 << 28), bArr2, 0);
        Codec.encode56(j79 | (j81 << 28), bArr2, 7);
        Codec.encode56((j85 << 28) | j83, bArr2, 14);
        Codec.encode56((j89 << 28) | j87, bArr2, 21);
        Codec.encode32((int) j88, bArr2, 28);
        return bArr2;
    }

    public static void reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = f27957L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[4];
        System.arraycopy(iArr7, 0, iArr8, 0, 4);
        int[] iArr9 = new int[4];
        System.arraycopy(iArr, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        iArr10[0] = 1;
        int i10 = 15;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int[] iArr11 = iArr10;
        int[] iArr12 = new int[4];
        int[] iArr13 = iArr8;
        int[] iArr14 = iArr9;
        while (bitLengthPositive > TARGET_LENGTH) {
            int bitLength = ScalarUtil.getBitLength(i10, iArr6) - bitLengthPositive;
            int i11 = bitLength & (~(bitLength >> 31));
            if (iArr6[i10] < 0) {
                ScalarUtil.addShifted_NP(i10, i11, iArr4, iArr5, iArr6);
                ScalarUtil.addShifted_UV(3, i11, iArr13, iArr12, iArr14, iArr11);
            } else {
                ScalarUtil.subShifted_NP(i10, i11, iArr4, iArr5, iArr6);
                ScalarUtil.subShifted_UV(3, i11, iArr13, iArr12, iArr14, iArr11);
            }
            int[] iArr15 = iArr11;
            if (ScalarUtil.lessThan(i10, iArr4, iArr5)) {
                int i12 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i12, iArr4);
                int[] iArr16 = iArr5;
                iArr5 = iArr4;
                iArr4 = iArr16;
                int[] iArr17 = iArr14;
                iArr14 = iArr13;
                iArr13 = iArr17;
                bitLengthPositive = bitLengthPositive2;
                iArr11 = iArr12;
                iArr12 = iArr15;
                i10 = i12;
            } else {
                iArr11 = iArr15;
            }
        }
        System.arraycopy(iArr14, 0, iArr2, 0, 4);
        System.arraycopy(iArr11, 0, iArr3, 0, 4);
    }

    public static void toSignedDigits(int i10, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, f27957L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
