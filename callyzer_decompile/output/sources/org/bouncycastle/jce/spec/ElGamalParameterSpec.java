package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes3.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g */
    private BigInteger f27838g;

    /* renamed from: p */
    private BigInteger f27839p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f27839p = bigInteger;
        this.f27838g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f27838g;
    }

    public BigInteger getP() {
        return this.f27839p;
    }
}
