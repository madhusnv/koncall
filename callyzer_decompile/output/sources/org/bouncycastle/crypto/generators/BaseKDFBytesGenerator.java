package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;

    /* renamed from: iv, reason: collision with root package name */
    private byte[] f44578iv;
    private byte[] shared;

    public BaseKDFBytesGenerator(int i10, Digest digest) {
        this.counterStart = i10;
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 < i13) {
            throw new OutputLengthException("output buffer too small");
        }
        long j6 = i12;
        int digestSize = this.digest.getDigestSize();
        if (j6 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j10 = digestSize;
        int i14 = (int) (((j6 + j10) - 1) / j10);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Pack.intToBigEndian(this.counterStart, bArr3, 0);
        int i15 = this.counterStart & (-256);
        for (int i16 = 0; i16 < i14; i16++) {
            Digest digest = this.digest;
            byte[] bArr4 = this.shared;
            digest.update(bArr4, 0, bArr4.length);
            this.digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.f44578iv;
            if (bArr5 != null) {
                this.digest.update(bArr5, 0, bArr5.length);
            }
            this.digest.doFinal(bArr2, 0);
            if (i12 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                i13 += digestSize;
                i12 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i13, i12);
            }
            byte b10 = (byte) (bArr3[3] + 1);
            bArr3[3] = b10;
            if (b10 == 0) {
                i15 += 256;
                Pack.intToBigEndian(i15, bArr3, 0);
            }
        }
        this.digest.reset();
        return (int) j6;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f44578iv = kDFParameters.getIV();
        } else {
            if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                throw new IllegalArgumentException("KDF parameters required for generator");
            }
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.f44578iv = null;
        }
    }
}
