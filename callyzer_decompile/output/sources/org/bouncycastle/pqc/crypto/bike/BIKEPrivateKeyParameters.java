package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BIKEPrivateKeyParameters extends BIKEKeyParameters {

    /* renamed from: h0, reason: collision with root package name */
    private byte[] f44663h0;

    /* renamed from: h1, reason: collision with root package name */
    private byte[] f44664h1;
    private byte[] sigma;

    public BIKEPrivateKeyParameters(BIKEParameters bIKEParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, bIKEParameters);
        this.f44663h0 = Arrays.clone(bArr);
        this.f44664h1 = Arrays.clone(bArr2);
        this.sigma = Arrays.clone(bArr3);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f44663h0, this.f44664h1, this.sigma);
    }

    public byte[] getH0() {
        return this.f44663h0;
    }

    public byte[] getH1() {
        return this.f44664h1;
    }

    public byte[] getSigma() {
        return this.sigma;
    }
}
