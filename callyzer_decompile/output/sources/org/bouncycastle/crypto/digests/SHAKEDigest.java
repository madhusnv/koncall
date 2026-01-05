package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest() {
        this(128);
    }

    private static int checkBitLength(int i10) {
        if (i10 == 128 || i10 == 256) {
            return i10;
        }
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "'bitStrength' ", " not supported for SHAKE"));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        return doFinal(bArr, i10, getDigestSize());
    }

    public int doOutput(byte[] bArr, int i10, int i11) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i10, i11 * 8);
        return i11;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    public SHAKEDigest(int i10) {
        super(checkBitLength(i10), CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i10, byte b10, int i11) {
        return doFinal(bArr, i10, getDigestSize(), b10, i11);
    }

    public SHAKEDigest(int i10, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i10), cryptoServicePurpose);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i10, int i11) {
        int iDoOutput = doOutput(bArr, i10, i11);
        reset();
        return iDoOutput;
    }

    public SHAKEDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(128, cryptoServicePurpose);
    }

    public int doFinal(byte[] bArr, int i10, int i11, byte b10, int i12) {
        if (i12 < 0 || i12 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i13 = (b10 & ((1 << i12) - 1)) | (15 << i12);
        int i14 = i12 + 4;
        if (i14 >= 8) {
            absorb((byte) i13);
            i14 = i12 - 4;
            i13 >>>= 8;
        }
        if (i14 > 0) {
            absorbBits(i13, i14);
        }
        squeeze(bArr, i10, i11 * 8);
        reset();
        return i11;
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }
}
