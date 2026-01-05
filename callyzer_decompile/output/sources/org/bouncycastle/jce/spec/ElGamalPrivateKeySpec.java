package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* renamed from: x */
    private BigInteger f27840x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f27840x = bigInteger;
    }

    public BigInteger getX() {
        return this.f27840x;
    }
}
