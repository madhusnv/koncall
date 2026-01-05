package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Utils {
    public static long bitMask(long j6, long j10) {
        return (1 << ((int) (j6 % j10))) - 1;
    }

    public static void copyBytes(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        System.arraycopy(iArr, i10, iArr2, i11, i12 / 2);
    }

    public static void fromByte16ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i10 = 0; i10 != iArr.length; i10 += 4) {
            int i11 = i10 / 4;
            long j6 = iArr[i10] & 65535;
            jArr[i11] = j6;
            long j10 = j6 | (iArr[i10 + 1] << 16);
            jArr[i11] = j10;
            long j11 = j10 | (iArr[i10 + 2] << 32);
            jArr[i11] = j11;
            jArr[i11] = j11 | (iArr[i10 + 3] << 48);
        }
    }

    public static void fromByte32ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i10 = 0; i10 != iArr.length; i10 += 2) {
            int i11 = i10 / 2;
            long j6 = iArr[i10] & 4294967295L;
            jArr[i11] = j6;
            jArr[i11] = j6 | (iArr[i10 + 1] << 32);
        }
    }

    public static void fromByteArrayToByte16Array(int[] iArr, byte[] bArr) {
        if (bArr.length % 2 != 0) {
            byte[] bArr2 = new byte[((bArr.length + 1) / 2) * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = Pack.littleEndianToShort(bArr, i10) & HPKE.aead_EXPORT_ONLY;
            i10 += 2;
        }
    }

    public static void fromByteArrayToLongArray(long[] jArr, byte[] bArr) {
        if (bArr.length % 8 != 0) {
            byte[] bArr2 = new byte[((bArr.length + 7) / 8) * 8];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = Pack.littleEndianToLong(bArr, i10);
            i10 += 8;
        }
    }

    public static void fromLongArrayToByte32Array(int[] iArr, long[] jArr) {
        for (int i10 = 0; i10 != jArr.length; i10++) {
            int i11 = i10 * 2;
            long j6 = jArr[i10];
            iArr[i11] = (int) j6;
            iArr[i11 + 1] = (int) (j6 >> 32);
        }
    }

    public static void fromLongArrayToByteArray(byte[] bArr, long[] jArr) {
        int length = bArr.length / 8;
        int i10 = 0;
        for (int i11 = 0; i11 != length; i11++) {
            Pack.longToLittleEndian(jArr[i11], bArr, i11 * 8);
        }
        if (bArr.length % 8 != 0) {
            int i12 = length * 8;
            while (i12 < bArr.length) {
                bArr[i12] = (byte) (jArr[length] >>> (i10 * 8));
                i12++;
                i10++;
            }
        }
    }

    public static int getByte64SizeFromBitSize(int i10) {
        return (i10 + 63) / 64;
    }

    public static int getByteSizeFromBitSize(int i10) {
        return (i10 + 7) / 8;
    }

    public static void resizeArray(long[] jArr, int i10, long[] jArr2, int i11, int i12, int i13) {
        if (i10 >= i11) {
            System.arraycopy(jArr2, 0, jArr, 0, (i11 + 7) / 8);
            return;
        }
        int i14 = i10 % 64;
        int i15 = i14 != 0 ? 64 - i14 : 0;
        System.arraycopy(jArr2, 0, jArr, 0, i12);
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i13 - 1;
            jArr[i17] = jArr[i17] & (9223372036854775807 >> i16);
        }
    }

    public static int toUnsigned16Bits(int i10) {
        return i10 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public static int toUnsigned8bits(int i10) {
        return i10 & 255;
    }

    public static void xorLongToByte16Array(int[] iArr, long j6, int i10) {
        iArr[i10] = iArr[i10] ^ (((int) j6) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i11 = i10 + 1;
        iArr[i11] = iArr[i11] ^ (((int) (j6 >>> 16)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i12 = i10 + 2;
        iArr[i12] = iArr[i12] ^ (((int) (j6 >>> 32)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i13 = i10 + 3;
        iArr[i13] = (((int) (j6 >>> 48)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) ^ iArr[i13];
    }
}
