package com.sun.mail.auth;

import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MD4 {
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;
    private static final int blockSize = 64;
    private static final byte[] padding;
    private int bufOfs;
    private long bytesProcessed;
    private final byte[] buffer = new byte[64];
    private final int[] state = new int[4];

    /* renamed from: x */
    private final int[] f7244x = new int[16];

    static {
        byte[] bArr = new byte[136];
        padding = bArr;
        bArr[0] = -128;
    }

    public MD4() {
        implReset();
    }

    private static int FF(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = (((~i11) & i13) | (i12 & i11)) + i14 + i10;
        return (i16 << i15) | (i16 >>> (32 - i15));
    }

    private static int GG(int i10, int i11, int i12, int i13, int i14, int i15) {
        int iM9725C = AbstractC4801l.m9725C((i11 & (i12 | i13)) | (i12 & i13), i14, 1518500249, i10);
        return (iM9725C >>> (32 - i15)) | (iM9725C << i15);
    }

    private static int HH(int i10, int i11, int i12, int i13, int i14, int i15) {
        int iM9725C = AbstractC4801l.m9725C((i11 ^ i12) ^ i13, i14, 1859775393, i10);
        return (iM9725C >>> (32 - i15)) | (iM9725C << i15);
    }

    private void engineUpdate(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        if (i10 < 0 || i11 < 0 || i10 > bArr.length - i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.bytesProcessed < 0) {
            implReset();
        }
        this.bytesProcessed += i11;
        int i12 = this.bufOfs;
        if (i12 != 0) {
            int iMin = Math.min(i11, 64 - i12);
            System.arraycopy(bArr, i10, this.buffer, this.bufOfs, iMin);
            int i13 = this.bufOfs + iMin;
            this.bufOfs = i13;
            i10 += iMin;
            i11 -= iMin;
            if (i13 >= 64) {
                implCompress(this.buffer, 0);
                this.bufOfs = 0;
            }
        }
        while (i11 >= 64) {
            implCompress(bArr, i10);
            i11 -= 64;
            i10 += 64;
        }
        if (i11 > 0) {
            System.arraycopy(bArr, i10, this.buffer, 0, i11);
            this.bufOfs = i11;
        }
    }

    private void implCompress(byte[] bArr, int i10) {
        int i11 = i10;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f7244x;
            if (i12 >= iArr.length) {
                int[] iArr2 = this.state;
                int i13 = iArr2[0];
                int i14 = iArr2[1];
                int i15 = iArr2[2];
                int i16 = iArr2[3];
                int iFF = FF(i13, i14, i15, i16, iArr[0], 3);
                int iFF2 = FF(i16, iFF, i14, i15, this.f7244x[1], 7);
                int iFF3 = FF(i15, iFF2, iFF, i14, this.f7244x[2], 11);
                int iFF4 = FF(i14, iFF3, iFF2, iFF, this.f7244x[3], 19);
                int iFF5 = FF(iFF, iFF4, iFF3, iFF2, this.f7244x[4], 3);
                int iFF6 = FF(iFF2, iFF5, iFF4, iFF3, this.f7244x[5], 7);
                int iFF7 = FF(iFF3, iFF6, iFF5, iFF4, this.f7244x[6], 11);
                int iFF8 = FF(iFF4, iFF7, iFF6, iFF5, this.f7244x[7], 19);
                int iFF9 = FF(iFF5, iFF8, iFF7, iFF6, this.f7244x[8], 3);
                int iFF10 = FF(iFF6, iFF9, iFF8, iFF7, this.f7244x[9], 7);
                int iFF11 = FF(iFF7, iFF10, iFF9, iFF8, this.f7244x[10], 11);
                int iFF12 = FF(iFF8, iFF11, iFF10, iFF9, this.f7244x[11], 19);
                int iFF13 = FF(iFF9, iFF12, iFF11, iFF10, this.f7244x[12], 3);
                int iFF14 = FF(iFF10, iFF13, iFF12, iFF11, this.f7244x[13], 7);
                int iFF15 = FF(iFF11, iFF14, iFF13, iFF12, this.f7244x[14], 11);
                int iFF16 = FF(iFF12, iFF15, iFF14, iFF13, this.f7244x[15], 19);
                int iGG = GG(iFF13, iFF16, iFF15, iFF14, this.f7244x[0], 3);
                int iGG2 = GG(iFF14, iGG, iFF16, iFF15, this.f7244x[4], 5);
                int iGG3 = GG(iFF15, iGG2, iGG, iFF16, this.f7244x[8], 9);
                int iGG4 = GG(iFF16, iGG3, iGG2, iGG, this.f7244x[12], 13);
                int iGG5 = GG(iGG, iGG4, iGG3, iGG2, this.f7244x[1], 3);
                int iGG6 = GG(iGG2, iGG5, iGG4, iGG3, this.f7244x[5], 5);
                int iGG7 = GG(iGG3, iGG6, iGG5, iGG4, this.f7244x[9], 9);
                int iGG8 = GG(iGG4, iGG7, iGG6, iGG5, this.f7244x[13], 13);
                int iGG9 = GG(iGG5, iGG8, iGG7, iGG6, this.f7244x[2], 3);
                int iGG10 = GG(iGG6, iGG9, iGG8, iGG7, this.f7244x[6], 5);
                int iGG11 = GG(iGG7, iGG10, iGG9, iGG8, this.f7244x[10], 9);
                int iGG12 = GG(iGG8, iGG11, iGG10, iGG9, this.f7244x[14], 13);
                int iGG13 = GG(iGG9, iGG12, iGG11, iGG10, this.f7244x[3], 3);
                int iGG14 = GG(iGG10, iGG13, iGG12, iGG11, this.f7244x[7], 5);
                int iGG15 = GG(iGG11, iGG14, iGG13, iGG12, this.f7244x[11], 9);
                int iGG16 = GG(iGG12, iGG15, iGG14, iGG13, this.f7244x[15], 13);
                int iHH = HH(iGG13, iGG16, iGG15, iGG14, this.f7244x[0], 3);
                int iHH2 = HH(iGG14, iHH, iGG16, iGG15, this.f7244x[8], 9);
                int iHH3 = HH(iGG15, iHH2, iHH, iGG16, this.f7244x[4], 11);
                int iHH4 = HH(iGG16, iHH3, iHH2, iHH, this.f7244x[12], 15);
                int iHH5 = HH(iHH, iHH4, iHH3, iHH2, this.f7244x[2], 3);
                int iHH6 = HH(iHH2, iHH5, iHH4, iHH3, this.f7244x[10], 9);
                int iHH7 = HH(iHH3, iHH6, iHH5, iHH4, this.f7244x[6], 11);
                int iHH8 = HH(iHH4, iHH7, iHH6, iHH5, this.f7244x[14], 15);
                int iHH9 = HH(iHH5, iHH8, iHH7, iHH6, this.f7244x[1], 3);
                int iHH10 = HH(iHH6, iHH9, iHH8, iHH7, this.f7244x[9], 9);
                int iHH11 = HH(iHH7, iHH10, iHH9, iHH8, this.f7244x[5], 11);
                int iHH12 = HH(iHH8, iHH11, iHH10, iHH9, this.f7244x[13], 15);
                int iHH13 = HH(iHH9, iHH12, iHH11, iHH10, this.f7244x[3], 3);
                int iHH14 = HH(iHH10, iHH13, iHH12, iHH11, this.f7244x[11], 9);
                int iHH15 = HH(iHH11, iHH14, iHH13, iHH12, this.f7244x[7], 11);
                int iHH16 = HH(iHH12, iHH15, iHH14, iHH13, this.f7244x[15], 15);
                int[] iArr3 = this.state;
                iArr3[0] = iArr3[0] + iHH13;
                iArr3[1] = iArr3[1] + iHH16;
                iArr3[2] = iArr3[2] + iHH15;
                iArr3[3] = iArr3[3] + iHH14;
                return;
            }
            iArr[i12] = (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24);
            i11 += 4;
            i12++;
        }
    }

    private void implDigest(byte[] bArr, int i10) {
        long j6 = this.bytesProcessed;
        long j10 = j6 << 3;
        int i11 = ((int) j6) & 63;
        int i12 = 0;
        engineUpdate(padding, 0, i11 < 56 ? 56 - i11 : 120 - i11);
        byte[] bArr2 = this.buffer;
        bArr2[56] = (byte) j10;
        bArr2[57] = (byte) (j10 >> 8);
        bArr2[58] = (byte) (j10 >> 16);
        bArr2[59] = (byte) (j10 >> 24);
        bArr2[60] = (byte) (j10 >> 32);
        bArr2[61] = (byte) (j10 >> 40);
        bArr2[62] = (byte) (j10 >> 48);
        bArr2[63] = (byte) (j10 >> 56);
        implCompress(bArr2, 0);
        while (true) {
            int[] iArr = this.state;
            if (i12 >= iArr.length) {
                return;
            }
            int i13 = iArr[i12];
            bArr[i10] = (byte) i13;
            bArr[i10 + 1] = (byte) (i13 >> 8);
            int i14 = i10 + 3;
            bArr[i10 + 2] = (byte) (i13 >> 16);
            i10 += 4;
            bArr[i14] = (byte) (i13 >> 24);
            i12++;
        }
    }

    private void implReset() {
        int[] iArr = this.state;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        this.bufOfs = 0;
        this.bytesProcessed = 0L;
    }

    public byte[] digest(byte[] bArr) {
        implReset();
        engineUpdate(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[16];
        implDigest(bArr2, 0);
        return bArr2;
    }
}
