package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes3.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N */
    protected BigInteger f27578N;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f27579g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f27579g.modPow(SRP6Util.calculateX(this.digest, this.f27578N, bArr, bArr2, bArr3), this.f27578N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f27578N = bigInteger;
        this.f27579g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f27578N = sRP6GroupParameters.getN();
        this.f27579g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
