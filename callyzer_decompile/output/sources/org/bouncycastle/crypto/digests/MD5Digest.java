package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class MD5Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 7;
    private static final int S12 = 12;
    private static final int S13 = 17;
    private static final int S14 = 22;
    private static final int S21 = 5;
    private static final int S22 = 9;
    private static final int S23 = 14;
    private static final int S24 = 20;
    private static final int S31 = 4;
    private static final int S32 = 11;
    private static final int S33 = 16;
    private static final int S34 = 23;
    private static final int S41 = 6;
    private static final int S42 = 10;
    private static final int S43 = 15;
    private static final int S44 = 21;
    private int H1;
    private int H2;
    private int H3;
    private int H4;

    /* renamed from: X */
    private int[] f27607X;
    private int xOff;

    public MD5Digest() {
        this(CryptoServicePurpose.ANY);
    }

    /* renamed from: F */
    private int m11196F(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    /* renamed from: G */
    private int m11197G(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    /* renamed from: H */
    private int m11198H(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    /* renamed from: K */
    private int m11199K(int i10, int i11, int i12) {
        return (i10 | (~i12)) ^ i11;
    }

    private void copyIn(MD5Digest mD5Digest) {
        super.copyIn((GeneralDigest) mD5Digest);
        this.H1 = mD5Digest.H1;
        this.H2 = mD5Digest.H2;
        this.H3 = mD5Digest.H3;
        this.H4 = mD5Digest.H4;
        int[] iArr = mD5Digest.f27607X;
        System.arraycopy(iArr, 0, this.f27607X, 0, iArr.length);
        this.xOff = mD5Digest.xOff;
    }

    private int rotateLeft(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD5Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToLittleEndian(this.H1, bArr, i10);
        Pack.intToLittleEndian(this.H2, bArr, i10 + 4);
        Pack.intToLittleEndian(this.H3, bArr, i10 + 8);
        Pack.intToLittleEndian(this.H4, bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int i10 = this.xOff * 4;
        byte[] bArr = new byte[i10 + 37];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.xOff, bArr, 32);
        for (int i11 = 0; i11 != this.xOff; i11++) {
            Pack.intToBigEndian(this.f27607X[i11], bArr, (i11 * 4) + 36);
        }
        bArr[i10 + 36] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.H1;
        int i11 = this.H2;
        int i12 = this.H3;
        int i13 = this.H4;
        int iRotateLeft = rotateLeft(((i10 + m11196F(i11, i12, i13)) + this.f27607X[0]) - 680876936, 7) + i11;
        int iRotateLeft2 = rotateLeft(((i13 + m11196F(iRotateLeft, i11, i12)) + this.f27607X[1]) - 389564586, 12) + iRotateLeft;
        int iRotateLeft3 = rotateLeft(i12 + m11196F(iRotateLeft2, iRotateLeft, i11) + this.f27607X[2] + 606105819, 17) + iRotateLeft2;
        int iRotateLeft4 = rotateLeft(((i11 + m11196F(iRotateLeft3, iRotateLeft2, iRotateLeft)) + this.f27607X[3]) - 1044525330, 22) + iRotateLeft3;
        int iRotateLeft5 = rotateLeft(((iRotateLeft + m11196F(iRotateLeft4, iRotateLeft3, iRotateLeft2)) + this.f27607X[4]) - 176418897, 7) + iRotateLeft4;
        int iRotateLeft6 = rotateLeft(iRotateLeft2 + m11196F(iRotateLeft5, iRotateLeft4, iRotateLeft3) + this.f27607X[5] + 1200080426, 12) + iRotateLeft5;
        int iRotateLeft7 = rotateLeft(((iRotateLeft3 + m11196F(iRotateLeft6, iRotateLeft5, iRotateLeft4)) + this.f27607X[6]) - 1473231341, 17) + iRotateLeft6;
        int iRotateLeft8 = rotateLeft(((iRotateLeft4 + m11196F(iRotateLeft7, iRotateLeft6, iRotateLeft5)) + this.f27607X[7]) - 45705983, 22) + iRotateLeft7;
        int iRotateLeft9 = rotateLeft(iRotateLeft5 + m11196F(iRotateLeft8, iRotateLeft7, iRotateLeft6) + this.f27607X[8] + 1770035416, 7) + iRotateLeft8;
        int iRotateLeft10 = rotateLeft(((iRotateLeft6 + m11196F(iRotateLeft9, iRotateLeft8, iRotateLeft7)) + this.f27607X[9]) - 1958414417, 12) + iRotateLeft9;
        int iRotateLeft11 = rotateLeft(((iRotateLeft7 + m11196F(iRotateLeft10, iRotateLeft9, iRotateLeft8)) + this.f27607X[10]) - 42063, 17) + iRotateLeft10;
        int iRotateLeft12 = rotateLeft(((iRotateLeft8 + m11196F(iRotateLeft11, iRotateLeft10, iRotateLeft9)) + this.f27607X[11]) - 1990404162, 22) + iRotateLeft11;
        int iRotateLeft13 = rotateLeft(iRotateLeft9 + m11196F(iRotateLeft12, iRotateLeft11, iRotateLeft10) + this.f27607X[12] + 1804603682, 7) + iRotateLeft12;
        int iRotateLeft14 = rotateLeft(((iRotateLeft10 + m11196F(iRotateLeft13, iRotateLeft12, iRotateLeft11)) + this.f27607X[13]) - 40341101, 12) + iRotateLeft13;
        int iRotateLeft15 = rotateLeft(((iRotateLeft11 + m11196F(iRotateLeft14, iRotateLeft13, iRotateLeft12)) + this.f27607X[14]) - 1502002290, 17) + iRotateLeft14;
        int iRotateLeft16 = rotateLeft(iRotateLeft12 + m11196F(iRotateLeft15, iRotateLeft14, iRotateLeft13) + this.f27607X[15] + 1236535329, 22) + iRotateLeft15;
        int iRotateLeft17 = rotateLeft(((iRotateLeft13 + m11197G(iRotateLeft16, iRotateLeft15, iRotateLeft14)) + this.f27607X[1]) - 165796510, 5) + iRotateLeft16;
        int iRotateLeft18 = rotateLeft(((iRotateLeft14 + m11197G(iRotateLeft17, iRotateLeft16, iRotateLeft15)) + this.f27607X[6]) - 1069501632, 9) + iRotateLeft17;
        int iRotateLeft19 = rotateLeft(iRotateLeft15 + m11197G(iRotateLeft18, iRotateLeft17, iRotateLeft16) + this.f27607X[11] + 643717713, 14) + iRotateLeft18;
        int iRotateLeft20 = rotateLeft(((iRotateLeft16 + m11197G(iRotateLeft19, iRotateLeft18, iRotateLeft17)) + this.f27607X[0]) - 373897302, 20) + iRotateLeft19;
        int iRotateLeft21 = rotateLeft(((iRotateLeft17 + m11197G(iRotateLeft20, iRotateLeft19, iRotateLeft18)) + this.f27607X[5]) - 701558691, 5) + iRotateLeft20;
        int iRotateLeft22 = rotateLeft(iRotateLeft18 + m11197G(iRotateLeft21, iRotateLeft20, iRotateLeft19) + this.f27607X[10] + 38016083, 9) + iRotateLeft21;
        int iRotateLeft23 = rotateLeft(((iRotateLeft19 + m11197G(iRotateLeft22, iRotateLeft21, iRotateLeft20)) + this.f27607X[15]) - 660478335, 14) + iRotateLeft22;
        int iRotateLeft24 = rotateLeft(((iRotateLeft20 + m11197G(iRotateLeft23, iRotateLeft22, iRotateLeft21)) + this.f27607X[4]) - 405537848, 20) + iRotateLeft23;
        int iRotateLeft25 = rotateLeft(iRotateLeft21 + m11197G(iRotateLeft24, iRotateLeft23, iRotateLeft22) + this.f27607X[9] + 568446438, 5) + iRotateLeft24;
        int iRotateLeft26 = rotateLeft(((iRotateLeft22 + m11197G(iRotateLeft25, iRotateLeft24, iRotateLeft23)) + this.f27607X[14]) - 1019803690, 9) + iRotateLeft25;
        int iRotateLeft27 = rotateLeft(((iRotateLeft23 + m11197G(iRotateLeft26, iRotateLeft25, iRotateLeft24)) + this.f27607X[3]) - 187363961, 14) + iRotateLeft26;
        int iRotateLeft28 = rotateLeft(iRotateLeft24 + m11197G(iRotateLeft27, iRotateLeft26, iRotateLeft25) + this.f27607X[8] + 1163531501, 20) + iRotateLeft27;
        int iRotateLeft29 = rotateLeft(((iRotateLeft25 + m11197G(iRotateLeft28, iRotateLeft27, iRotateLeft26)) + this.f27607X[13]) - 1444681467, 5) + iRotateLeft28;
        int iRotateLeft30 = rotateLeft(((iRotateLeft26 + m11197G(iRotateLeft29, iRotateLeft28, iRotateLeft27)) + this.f27607X[2]) - 51403784, 9) + iRotateLeft29;
        int iRotateLeft31 = rotateLeft(iRotateLeft27 + m11197G(iRotateLeft30, iRotateLeft29, iRotateLeft28) + this.f27607X[7] + 1735328473, 14) + iRotateLeft30;
        int iRotateLeft32 = rotateLeft(((iRotateLeft28 + m11197G(iRotateLeft31, iRotateLeft30, iRotateLeft29)) + this.f27607X[12]) - 1926607734, 20) + iRotateLeft31;
        int iRotateLeft33 = rotateLeft(((iRotateLeft29 + m11198H(iRotateLeft32, iRotateLeft31, iRotateLeft30)) + this.f27607X[5]) - 378558, 4) + iRotateLeft32;
        int iRotateLeft34 = rotateLeft(((iRotateLeft30 + m11198H(iRotateLeft33, iRotateLeft32, iRotateLeft31)) + this.f27607X[8]) - 2022574463, 11) + iRotateLeft33;
        int iRotateLeft35 = rotateLeft(iRotateLeft31 + m11198H(iRotateLeft34, iRotateLeft33, iRotateLeft32) + this.f27607X[11] + 1839030562, 16) + iRotateLeft34;
        int iRotateLeft36 = rotateLeft(((iRotateLeft32 + m11198H(iRotateLeft35, iRotateLeft34, iRotateLeft33)) + this.f27607X[14]) - 35309556, 23) + iRotateLeft35;
        int iRotateLeft37 = rotateLeft(((iRotateLeft33 + m11198H(iRotateLeft36, iRotateLeft35, iRotateLeft34)) + this.f27607X[1]) - 1530992060, 4) + iRotateLeft36;
        int iRotateLeft38 = rotateLeft(iRotateLeft34 + m11198H(iRotateLeft37, iRotateLeft36, iRotateLeft35) + this.f27607X[4] + 1272893353, 11) + iRotateLeft37;
        int iRotateLeft39 = rotateLeft(((iRotateLeft35 + m11198H(iRotateLeft38, iRotateLeft37, iRotateLeft36)) + this.f27607X[7]) - 155497632, 16) + iRotateLeft38;
        int iRotateLeft40 = rotateLeft(((iRotateLeft36 + m11198H(iRotateLeft39, iRotateLeft38, iRotateLeft37)) + this.f27607X[10]) - 1094730640, 23) + iRotateLeft39;
        int iRotateLeft41 = rotateLeft(iRotateLeft37 + m11198H(iRotateLeft40, iRotateLeft39, iRotateLeft38) + this.f27607X[13] + 681279174, 4) + iRotateLeft40;
        int iRotateLeft42 = rotateLeft(((iRotateLeft38 + m11198H(iRotateLeft41, iRotateLeft40, iRotateLeft39)) + this.f27607X[0]) - 358537222, 11) + iRotateLeft41;
        int iRotateLeft43 = rotateLeft(((iRotateLeft39 + m11198H(iRotateLeft42, iRotateLeft41, iRotateLeft40)) + this.f27607X[3]) - 722521979, 16) + iRotateLeft42;
        int iRotateLeft44 = rotateLeft(iRotateLeft40 + m11198H(iRotateLeft43, iRotateLeft42, iRotateLeft41) + this.f27607X[6] + 76029189, 23) + iRotateLeft43;
        int iRotateLeft45 = rotateLeft(((iRotateLeft41 + m11198H(iRotateLeft44, iRotateLeft43, iRotateLeft42)) + this.f27607X[9]) - 640364487, 4) + iRotateLeft44;
        int iRotateLeft46 = rotateLeft(((iRotateLeft42 + m11198H(iRotateLeft45, iRotateLeft44, iRotateLeft43)) + this.f27607X[12]) - 421815835, 11) + iRotateLeft45;
        int iRotateLeft47 = rotateLeft(iRotateLeft43 + m11198H(iRotateLeft46, iRotateLeft45, iRotateLeft44) + this.f27607X[15] + 530742520, 16) + iRotateLeft46;
        int iRotateLeft48 = rotateLeft(((iRotateLeft44 + m11198H(iRotateLeft47, iRotateLeft46, iRotateLeft45)) + this.f27607X[2]) - 995338651, 23) + iRotateLeft47;
        int iRotateLeft49 = rotateLeft(((iRotateLeft45 + m11199K(iRotateLeft48, iRotateLeft47, iRotateLeft46)) + this.f27607X[0]) - 198630844, 6) + iRotateLeft48;
        int iRotateLeft50 = rotateLeft(iRotateLeft46 + m11199K(iRotateLeft49, iRotateLeft48, iRotateLeft47) + this.f27607X[7] + 1126891415, 10) + iRotateLeft49;
        int iRotateLeft51 = rotateLeft(((iRotateLeft47 + m11199K(iRotateLeft50, iRotateLeft49, iRotateLeft48)) + this.f27607X[14]) - 1416354905, 15) + iRotateLeft50;
        int iRotateLeft52 = rotateLeft(((iRotateLeft48 + m11199K(iRotateLeft51, iRotateLeft50, iRotateLeft49)) + this.f27607X[5]) - 57434055, 21) + iRotateLeft51;
        int iRotateLeft53 = rotateLeft(iRotateLeft49 + m11199K(iRotateLeft52, iRotateLeft51, iRotateLeft50) + this.f27607X[12] + 1700485571, 6) + iRotateLeft52;
        int iRotateLeft54 = rotateLeft(((iRotateLeft50 + m11199K(iRotateLeft53, iRotateLeft52, iRotateLeft51)) + this.f27607X[3]) - 1894986606, 10) + iRotateLeft53;
        int iRotateLeft55 = rotateLeft(((iRotateLeft51 + m11199K(iRotateLeft54, iRotateLeft53, iRotateLeft52)) + this.f27607X[10]) - 1051523, 15) + iRotateLeft54;
        int iRotateLeft56 = rotateLeft(((iRotateLeft52 + m11199K(iRotateLeft55, iRotateLeft54, iRotateLeft53)) + this.f27607X[1]) - 2054922799, 21) + iRotateLeft55;
        int iRotateLeft57 = rotateLeft(iRotateLeft53 + m11199K(iRotateLeft56, iRotateLeft55, iRotateLeft54) + this.f27607X[8] + 1873313359, 6) + iRotateLeft56;
        int iRotateLeft58 = rotateLeft(((iRotateLeft54 + m11199K(iRotateLeft57, iRotateLeft56, iRotateLeft55)) + this.f27607X[15]) - 30611744, 10) + iRotateLeft57;
        int iRotateLeft59 = rotateLeft(((iRotateLeft55 + m11199K(iRotateLeft58, iRotateLeft57, iRotateLeft56)) + this.f27607X[6]) - 1560198380, 15) + iRotateLeft58;
        int iRotateLeft60 = rotateLeft(iRotateLeft56 + m11199K(iRotateLeft59, iRotateLeft58, iRotateLeft57) + this.f27607X[13] + 1309151649, 21) + iRotateLeft59;
        int iRotateLeft61 = rotateLeft(((iRotateLeft57 + m11199K(iRotateLeft60, iRotateLeft59, iRotateLeft58)) + this.f27607X[4]) - 145523070, 6) + iRotateLeft60;
        int iRotateLeft62 = rotateLeft(((iRotateLeft58 + m11199K(iRotateLeft61, iRotateLeft60, iRotateLeft59)) + this.f27607X[11]) - 1120210379, 10) + iRotateLeft61;
        int iRotateLeft63 = rotateLeft(iRotateLeft59 + m11199K(iRotateLeft62, iRotateLeft61, iRotateLeft60) + this.f27607X[2] + 718787259, 15) + iRotateLeft62;
        int iRotateLeft64 = rotateLeft(((iRotateLeft60 + m11199K(iRotateLeft63, iRotateLeft62, iRotateLeft61)) + this.f27607X[9]) - 343485551, 21) + iRotateLeft63;
        this.H1 += iRotateLeft61;
        this.H2 += iRotateLeft64;
        this.H3 += iRotateLeft63;
        this.H4 += iRotateLeft62;
        this.xOff = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f27607X;
            if (i14 == iArr.length) {
                return;
            }
            iArr[i14] = 0;
            i14++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j6) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f27607X;
        iArr[14] = (int) j6;
        iArr[15] = (int) (j6 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int[] iArr = this.f27607X;
        int i11 = this.xOff;
        this.xOff = i11 + 1;
        iArr[i11] = Pack.littleEndianToInt(bArr, i10);
        if (this.xOff == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.xOff = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f27607X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public MD5Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f27607X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, cryptoServicePurpose));
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD5Digest) memoable);
    }

    public MD5Digest(MD5Digest mD5Digest) {
        super(mD5Digest);
        this.f27607X = new int[16];
        copyIn(mD5Digest);
    }

    public MD5Digest(byte[] bArr) {
        super(bArr);
        this.f27607X = new int[16];
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.xOff = Pack.bigEndianToInt(bArr, 32);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            this.f27607X[i10] = Pack.bigEndianToInt(bArr, (i10 * 4) + 36);
        }
    }
}
