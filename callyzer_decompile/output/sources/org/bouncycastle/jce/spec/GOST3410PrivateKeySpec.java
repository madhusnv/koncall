package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes3.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f27842a;

    /* renamed from: p */
    private BigInteger f27843p;

    /* renamed from: q */
    private BigInteger f27844q;

    /* renamed from: x */
    private BigInteger f27845x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f27845x = bigInteger;
        this.f27843p = bigInteger2;
        this.f27844q = bigInteger3;
        this.f27842a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f27842a;
    }

    public BigInteger getP() {
        return this.f27843p;
    }

    public BigInteger getQ() {
        return this.f27844q;
    }

    public BigInteger getX() {
        return this.f27845x;
    }
}
