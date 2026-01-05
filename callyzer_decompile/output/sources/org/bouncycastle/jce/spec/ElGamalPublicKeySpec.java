package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* renamed from: y */
    private BigInteger f27841y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f27841y = bigInteger;
    }

    public BigInteger getY() {
        return this.f27841y;
    }
}
