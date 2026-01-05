package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
    private BigInteger dP;
    private BigInteger dQ;

    /* renamed from: e */
    private BigInteger f27778e;

    /* renamed from: p */
    private BigInteger f27779p;

    /* renamed from: q */
    private BigInteger f27780q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, false);
    }

    public BigInteger getDP() {
        return this.dP;
    }

    public BigInteger getDQ() {
        return this.dQ;
    }

    public BigInteger getP() {
        return this.f27779p;
    }

    public BigInteger getPublicExponent() {
        return this.f27778e;
    }

    public BigInteger getQ() {
        return this.f27780q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, boolean z6) {
        super(true, bigInteger, bigInteger3, z6);
        this.f27778e = bigInteger2;
        this.f27779p = bigInteger4;
        this.f27780q = bigInteger5;
        this.dP = bigInteger6;
        this.dQ = bigInteger7;
        this.qInv = bigInteger8;
    }
}
