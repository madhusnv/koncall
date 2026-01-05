package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
class LMOtsPrivateKey {

    /* renamed from: I */
    private final byte[] f28061I;
    private final byte[] masterSecret;
    private final LMOtsParameters parameter;

    /* renamed from: q */
    private final int f28062q;

    public LMOtsPrivateKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i10, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.f28061I = bArr;
        this.f28062q = i10;
        this.masterSecret = bArr2;
    }

    public SeedDerive getDerivationFunction() {
        SeedDerive seedDerive = new SeedDerive(this.f28061I, this.masterSecret, DigestUtil.getDigest(this.parameter));
        seedDerive.setQ(this.f28062q);
        return seedDerive;
    }

    public byte[] getI() {
        return this.f28061I;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f28062q;
    }

    public LMSContext getSignatureContext(LMSigParameters lMSigParameters, byte[][] bArr) {
        byte[] bArr2 = new byte[this.parameter.getN()];
        SeedDerive derivationFunction = getDerivationFunction();
        derivationFunction.setJ(-3);
        derivationFunction.deriveSeed(bArr2, false);
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(getI(), digest);
        LmsUtils.u32str(getQ(), digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(bArr2, digest);
        return new LMSContext(this, lMSigParameters, digest, bArr2, bArr);
    }
}
