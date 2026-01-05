package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* renamed from: d */
    private BigInteger f27836d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f27836d = bigInteger;
    }

    public BigInteger getD() {
        return this.f27836d;
    }
}
