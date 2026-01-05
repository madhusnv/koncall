package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* renamed from: g */
    private BigInteger f27776g;
    int lowerSigmaBound;

    /* renamed from: n */
    private BigInteger f27777n;

    public NaccacheSternKeyParameters(boolean z6, BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        super(z6);
        this.f27776g = bigInteger;
        this.f27777n = bigInteger2;
        this.lowerSigmaBound = i10;
    }

    public BigInteger getG() {
        return this.f27776g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f27777n;
    }
}
