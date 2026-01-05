package org.bouncycastle.crypto.digests;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;

    /* renamed from: X */
    private int[] f27615X;
    private int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.f27615X;
        System.arraycopy(iArr, 0, this.f27615X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    /* renamed from: f */
    private int m11200f(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    /* renamed from: g */
    private int m11201g(int i10, int i11, int i12) {
        return (i10 & (i11 | i12)) | (i11 & i12);
    }

    /* renamed from: h */
    private int m11202h(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i10);
        Pack.intToBigEndian(this.H2, bArr, i10 + 4);
        Pack.intToBigEndian(this.H3, bArr, i10 + 8);
        Pack.intToBigEndian(this.H4, bArr, i10 + 12);
        Pack.intToBigEndian(this.H5, bArr, i10 + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int i10 = this.xOff * 4;
        byte[] bArr = new byte[i10 + 41];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i11 = 0; i11 != this.xOff; i11++) {
            Pack.intToBigEndian(this.f27615X[i11], bArr, (i11 * 4) + 40);
        }
        bArr[i10 + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i10 = 16; i10 < 80; i10++) {
            int[] iArr = this.f27615X;
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int iM9725C = this.H1;
        int iM9725C2 = this.H2;
        int i12 = this.H3;
        int i13 = this.H4;
        int i14 = this.H5;
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            int iM9725C3 = AbstractC4801l.m9725C(((iM9725C << 5) | (iM9725C >>> 27)) + m11200f(iM9725C2, i12, i13), this.f27615X[i15], Y1, i14);
            int i17 = (iM9725C2 >>> 2) | (iM9725C2 << 30);
            int iM9725C4 = AbstractC4801l.m9725C(((iM9725C3 << 5) | (iM9725C3 >>> 27)) + m11200f(iM9725C, i17, i12), this.f27615X[i15 + 1], Y1, i13);
            int i18 = (iM9725C >>> 2) | (iM9725C << 30);
            int iM9725C5 = AbstractC4801l.m9725C(((iM9725C4 << 5) | (iM9725C4 >>> 27)) + m11200f(iM9725C3, i18, i17), this.f27615X[i15 + 2], Y1, i12);
            i14 = (iM9725C3 >>> 2) | (iM9725C3 << 30);
            int i19 = i15 + 4;
            iM9725C2 = AbstractC4801l.m9725C(((iM9725C5 << 5) | (iM9725C5 >>> 27)) + m11200f(iM9725C4, i14, i18), this.f27615X[i15 + 3], Y1, i17);
            i13 = (iM9725C4 >>> 2) | (iM9725C4 << 30);
            i15 += 5;
            iM9725C = AbstractC4801l.m9725C(((iM9725C2 << 5) | (iM9725C2 >>> 27)) + m11200f(iM9725C5, i13, i14), this.f27615X[i19], Y1, i18);
            i12 = (iM9725C5 >>> 2) | (iM9725C5 << 30);
        }
        for (int i20 = 0; i20 < 4; i20++) {
            int iM9725C6 = AbstractC4801l.m9725C(((iM9725C << 5) | (iM9725C >>> 27)) + m11202h(iM9725C2, i12, i13), this.f27615X[i15], Y2, i14);
            int i21 = (iM9725C2 >>> 2) | (iM9725C2 << 30);
            int iM9725C7 = AbstractC4801l.m9725C(((iM9725C6 << 5) | (iM9725C6 >>> 27)) + m11202h(iM9725C, i21, i12), this.f27615X[i15 + 1], Y2, i13);
            int i22 = (iM9725C >>> 2) | (iM9725C << 30);
            int iM9725C8 = AbstractC4801l.m9725C(((iM9725C7 << 5) | (iM9725C7 >>> 27)) + m11202h(iM9725C6, i22, i21), this.f27615X[i15 + 2], Y2, i12);
            i14 = (iM9725C6 >>> 2) | (iM9725C6 << 30);
            int i23 = i15 + 4;
            iM9725C2 = AbstractC4801l.m9725C(((iM9725C8 << 5) | (iM9725C8 >>> 27)) + m11202h(iM9725C7, i14, i22), this.f27615X[i15 + 3], Y2, i21);
            i13 = (iM9725C7 >>> 2) | (iM9725C7 << 30);
            i15 += 5;
            iM9725C = AbstractC4801l.m9725C(((iM9725C2 << 5) | (iM9725C2 >>> 27)) + m11202h(iM9725C8, i13, i14), this.f27615X[i23], Y2, i22);
            i12 = (iM9725C8 >>> 2) | (iM9725C8 << 30);
        }
        for (int i24 = 0; i24 < 4; i24++) {
            int iM9725C9 = AbstractC4801l.m9725C(((iM9725C << 5) | (iM9725C >>> 27)) + m11201g(iM9725C2, i12, i13), this.f27615X[i15], Y3, i14);
            int i25 = (iM9725C2 >>> 2) | (iM9725C2 << 30);
            int iM9725C10 = AbstractC4801l.m9725C(((iM9725C9 << 5) | (iM9725C9 >>> 27)) + m11201g(iM9725C, i25, i12), this.f27615X[i15 + 1], Y3, i13);
            int i26 = (iM9725C >>> 2) | (iM9725C << 30);
            int iM9725C11 = AbstractC4801l.m9725C(((iM9725C10 << 5) | (iM9725C10 >>> 27)) + m11201g(iM9725C9, i26, i25), this.f27615X[i15 + 2], Y3, i12);
            i14 = (iM9725C9 >>> 2) | (iM9725C9 << 30);
            int i27 = i15 + 4;
            iM9725C2 = AbstractC4801l.m9725C(((iM9725C11 << 5) | (iM9725C11 >>> 27)) + m11201g(iM9725C10, i14, i26), this.f27615X[i15 + 3], Y3, i25);
            i13 = (iM9725C10 >>> 2) | (iM9725C10 << 30);
            i15 += 5;
            iM9725C = AbstractC4801l.m9725C(((iM9725C2 << 5) | (iM9725C2 >>> 27)) + m11201g(iM9725C11, i13, i14), this.f27615X[i27], Y3, i26);
            i12 = (iM9725C11 >>> 2) | (iM9725C11 << 30);
        }
        for (int i28 = 0; i28 <= 3; i28++) {
            int iM9725C12 = AbstractC4801l.m9725C(((iM9725C << 5) | (iM9725C >>> 27)) + m11202h(iM9725C2, i12, i13), this.f27615X[i15], Y4, i14);
            int i29 = (iM9725C2 >>> 2) | (iM9725C2 << 30);
            int iM9725C13 = AbstractC4801l.m9725C(((iM9725C12 << 5) | (iM9725C12 >>> 27)) + m11202h(iM9725C, i29, i12), this.f27615X[i15 + 1], Y4, i13);
            int i30 = (iM9725C >>> 2) | (iM9725C << 30);
            int iM9725C14 = AbstractC4801l.m9725C(((iM9725C13 << 5) | (iM9725C13 >>> 27)) + m11202h(iM9725C12, i30, i29), this.f27615X[i15 + 2], Y4, i12);
            i14 = (iM9725C12 >>> 2) | (iM9725C12 << 30);
            int i31 = i15 + 4;
            iM9725C2 = AbstractC4801l.m9725C(((iM9725C14 << 5) | (iM9725C14 >>> 27)) + m11202h(iM9725C13, i14, i30), this.f27615X[i15 + 3], Y4, i29);
            i13 = (iM9725C13 >>> 2) | (iM9725C13 << 30);
            i15 += 5;
            iM9725C = AbstractC4801l.m9725C(((iM9725C2 << 5) | (iM9725C2 >>> 27)) + m11202h(iM9725C14, i13, i14), this.f27615X[i31], Y4, i30);
            i12 = (iM9725C14 >>> 2) | (iM9725C14 << 30);
        }
        this.H1 += iM9725C;
        this.H2 += iM9725C2;
        this.H3 += i12;
        this.H4 += i13;
        this.H5 += i14;
        this.xOff = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            this.f27615X[i32] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j6) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f27615X;
        iArr[14] = (int) (j6 >>> 32);
        iArr[15] = (int) j6;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        this.f27615X[this.xOff] = Pack.bigEndianToInt(bArr, i10);
        int i11 = this.xOff + 1;
        this.xOff = i11;
        if (i11 == 16) {
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
        this.H5 = -1009589776;
        this.xOff = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f27615X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.f27615X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.f27615X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f27615X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i10 = 0; i10 != this.xOff; i10++) {
            this.f27615X[i10] = Pack.bigEndianToInt(bArr, (i10 * 4) + 40);
        }
    }
}
