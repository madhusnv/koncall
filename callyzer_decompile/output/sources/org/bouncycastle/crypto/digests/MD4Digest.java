package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class MD4Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;
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
    private int H1;
    private int H2;
    private int H3;
    private int H4;

    /* renamed from: X */
    private int[] f27606X;
    private int xOff;

    public MD4Digest() {
        this(CryptoServicePurpose.ANY);
    }

    /* renamed from: F */
    private int m11193F(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    /* renamed from: G */
    private int m11194G(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    /* renamed from: H */
    private int m11195H(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private void copyIn(MD4Digest mD4Digest) {
        super.copyIn((GeneralDigest) mD4Digest);
        this.H1 = mD4Digest.H1;
        this.H2 = mD4Digest.H2;
        this.H3 = mD4Digest.H3;
        this.H4 = mD4Digest.H4;
        int[] iArr = mD4Digest.f27606X;
        System.arraycopy(iArr, 0, this.f27606X, 0, iArr.length);
        this.xOff = mD4Digest.xOff;
    }

    private int rotateLeft(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD4Digest(this);
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
        return "MD4";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.H1;
        int i11 = this.H2;
        int i12 = this.H3;
        int i13 = this.H4;
        int iRotateLeft = rotateLeft(i10 + m11193F(i11, i12, i13) + this.f27606X[0], 3);
        int iRotateLeft2 = rotateLeft(i13 + m11193F(iRotateLeft, i11, i12) + this.f27606X[1], 7);
        int iRotateLeft3 = rotateLeft(i12 + m11193F(iRotateLeft2, iRotateLeft, i11) + this.f27606X[2], 11);
        int iRotateLeft4 = rotateLeft(i11 + m11193F(iRotateLeft3, iRotateLeft2, iRotateLeft) + this.f27606X[3], 19);
        int iRotateLeft5 = rotateLeft(iRotateLeft + m11193F(iRotateLeft4, iRotateLeft3, iRotateLeft2) + this.f27606X[4], 3);
        int iRotateLeft6 = rotateLeft(iRotateLeft2 + m11193F(iRotateLeft5, iRotateLeft4, iRotateLeft3) + this.f27606X[5], 7);
        int iRotateLeft7 = rotateLeft(iRotateLeft3 + m11193F(iRotateLeft6, iRotateLeft5, iRotateLeft4) + this.f27606X[6], 11);
        int iRotateLeft8 = rotateLeft(iRotateLeft4 + m11193F(iRotateLeft7, iRotateLeft6, iRotateLeft5) + this.f27606X[7], 19);
        int iRotateLeft9 = rotateLeft(iRotateLeft5 + m11193F(iRotateLeft8, iRotateLeft7, iRotateLeft6) + this.f27606X[8], 3);
        int iRotateLeft10 = rotateLeft(iRotateLeft6 + m11193F(iRotateLeft9, iRotateLeft8, iRotateLeft7) + this.f27606X[9], 7);
        int iRotateLeft11 = rotateLeft(iRotateLeft7 + m11193F(iRotateLeft10, iRotateLeft9, iRotateLeft8) + this.f27606X[10], 11);
        int iRotateLeft12 = rotateLeft(iRotateLeft8 + m11193F(iRotateLeft11, iRotateLeft10, iRotateLeft9) + this.f27606X[11], 19);
        int iRotateLeft13 = rotateLeft(iRotateLeft9 + m11193F(iRotateLeft12, iRotateLeft11, iRotateLeft10) + this.f27606X[12], 3);
        int iRotateLeft14 = rotateLeft(iRotateLeft10 + m11193F(iRotateLeft13, iRotateLeft12, iRotateLeft11) + this.f27606X[13], 7);
        int iRotateLeft15 = rotateLeft(iRotateLeft11 + m11193F(iRotateLeft14, iRotateLeft13, iRotateLeft12) + this.f27606X[14], 11);
        int iRotateLeft16 = rotateLeft(iRotateLeft12 + m11193F(iRotateLeft15, iRotateLeft14, iRotateLeft13) + this.f27606X[15], 19);
        int iRotateLeft17 = rotateLeft(iRotateLeft13 + m11194G(iRotateLeft16, iRotateLeft15, iRotateLeft14) + this.f27606X[0] + 1518500249, 3);
        int iRotateLeft18 = rotateLeft(iRotateLeft14 + m11194G(iRotateLeft17, iRotateLeft16, iRotateLeft15) + this.f27606X[4] + 1518500249, 5);
        int iRotateLeft19 = rotateLeft(iRotateLeft15 + m11194G(iRotateLeft18, iRotateLeft17, iRotateLeft16) + this.f27606X[8] + 1518500249, 9);
        int iRotateLeft20 = rotateLeft(iRotateLeft16 + m11194G(iRotateLeft19, iRotateLeft18, iRotateLeft17) + this.f27606X[12] + 1518500249, 13);
        int iRotateLeft21 = rotateLeft(iRotateLeft17 + m11194G(iRotateLeft20, iRotateLeft19, iRotateLeft18) + this.f27606X[1] + 1518500249, 3);
        int iRotateLeft22 = rotateLeft(iRotateLeft18 + m11194G(iRotateLeft21, iRotateLeft20, iRotateLeft19) + this.f27606X[5] + 1518500249, 5);
        int iRotateLeft23 = rotateLeft(iRotateLeft19 + m11194G(iRotateLeft22, iRotateLeft21, iRotateLeft20) + this.f27606X[9] + 1518500249, 9);
        int iRotateLeft24 = rotateLeft(iRotateLeft20 + m11194G(iRotateLeft23, iRotateLeft22, iRotateLeft21) + this.f27606X[13] + 1518500249, 13);
        int iRotateLeft25 = rotateLeft(iRotateLeft21 + m11194G(iRotateLeft24, iRotateLeft23, iRotateLeft22) + this.f27606X[2] + 1518500249, 3);
        int iRotateLeft26 = rotateLeft(iRotateLeft22 + m11194G(iRotateLeft25, iRotateLeft24, iRotateLeft23) + this.f27606X[6] + 1518500249, 5);
        int iRotateLeft27 = rotateLeft(iRotateLeft23 + m11194G(iRotateLeft26, iRotateLeft25, iRotateLeft24) + this.f27606X[10] + 1518500249, 9);
        int iRotateLeft28 = rotateLeft(iRotateLeft24 + m11194G(iRotateLeft27, iRotateLeft26, iRotateLeft25) + this.f27606X[14] + 1518500249, 13);
        int iRotateLeft29 = rotateLeft(iRotateLeft25 + m11194G(iRotateLeft28, iRotateLeft27, iRotateLeft26) + this.f27606X[3] + 1518500249, 3);
        int iRotateLeft30 = rotateLeft(iRotateLeft26 + m11194G(iRotateLeft29, iRotateLeft28, iRotateLeft27) + this.f27606X[7] + 1518500249, 5);
        int iRotateLeft31 = rotateLeft(iRotateLeft27 + m11194G(iRotateLeft30, iRotateLeft29, iRotateLeft28) + this.f27606X[11] + 1518500249, 9);
        int iRotateLeft32 = rotateLeft(iRotateLeft28 + m11194G(iRotateLeft31, iRotateLeft30, iRotateLeft29) + this.f27606X[15] + 1518500249, 13);
        int iRotateLeft33 = rotateLeft(iRotateLeft29 + m11195H(iRotateLeft32, iRotateLeft31, iRotateLeft30) + this.f27606X[0] + 1859775393, 3);
        int iRotateLeft34 = rotateLeft(iRotateLeft30 + m11195H(iRotateLeft33, iRotateLeft32, iRotateLeft31) + this.f27606X[8] + 1859775393, 9);
        int iRotateLeft35 = rotateLeft(iRotateLeft31 + m11195H(iRotateLeft34, iRotateLeft33, iRotateLeft32) + this.f27606X[4] + 1859775393, 11);
        int iRotateLeft36 = rotateLeft(iRotateLeft32 + m11195H(iRotateLeft35, iRotateLeft34, iRotateLeft33) + this.f27606X[12] + 1859775393, 15);
        int iRotateLeft37 = rotateLeft(iRotateLeft33 + m11195H(iRotateLeft36, iRotateLeft35, iRotateLeft34) + this.f27606X[2] + 1859775393, 3);
        int iRotateLeft38 = rotateLeft(iRotateLeft34 + m11195H(iRotateLeft37, iRotateLeft36, iRotateLeft35) + this.f27606X[10] + 1859775393, 9);
        int iRotateLeft39 = rotateLeft(iRotateLeft35 + m11195H(iRotateLeft38, iRotateLeft37, iRotateLeft36) + this.f27606X[6] + 1859775393, 11);
        int iRotateLeft40 = rotateLeft(iRotateLeft36 + m11195H(iRotateLeft39, iRotateLeft38, iRotateLeft37) + this.f27606X[14] + 1859775393, 15);
        int iRotateLeft41 = rotateLeft(iRotateLeft37 + m11195H(iRotateLeft40, iRotateLeft39, iRotateLeft38) + this.f27606X[1] + 1859775393, 3);
        int iRotateLeft42 = rotateLeft(iRotateLeft38 + m11195H(iRotateLeft41, iRotateLeft40, iRotateLeft39) + this.f27606X[9] + 1859775393, 9);
        int iRotateLeft43 = rotateLeft(iRotateLeft39 + m11195H(iRotateLeft42, iRotateLeft41, iRotateLeft40) + this.f27606X[5] + 1859775393, 11);
        int iRotateLeft44 = rotateLeft(iRotateLeft40 + m11195H(iRotateLeft43, iRotateLeft42, iRotateLeft41) + this.f27606X[13] + 1859775393, 15);
        int iRotateLeft45 = rotateLeft(iRotateLeft41 + m11195H(iRotateLeft44, iRotateLeft43, iRotateLeft42) + this.f27606X[3] + 1859775393, 3);
        int iRotateLeft46 = rotateLeft(iRotateLeft42 + m11195H(iRotateLeft45, iRotateLeft44, iRotateLeft43) + this.f27606X[11] + 1859775393, 9);
        int iRotateLeft47 = rotateLeft(iRotateLeft43 + m11195H(iRotateLeft46, iRotateLeft45, iRotateLeft44) + this.f27606X[7] + 1859775393, 11);
        int iRotateLeft48 = rotateLeft(iRotateLeft44 + m11195H(iRotateLeft47, iRotateLeft46, iRotateLeft45) + this.f27606X[15] + 1859775393, 15);
        this.H1 += iRotateLeft45;
        this.H2 += iRotateLeft48;
        this.H3 += iRotateLeft47;
        this.H4 += iRotateLeft46;
        this.xOff = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f27606X;
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
        int[] iArr = this.f27606X;
        iArr[14] = (int) j6;
        iArr[15] = (int) (j6 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int[] iArr = this.f27606X;
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
            int[] iArr = this.f27606X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public MD4Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f27606X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, cryptoServicePurpose));
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD4Digest) memoable);
    }

    public MD4Digest(MD4Digest mD4Digest) {
        super(mD4Digest.purpose);
        this.f27606X = new int[16];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, this.purpose));
        copyIn(mD4Digest);
    }
}
