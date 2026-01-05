package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes3.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f27849a;

    /* renamed from: p */
    private BigInteger f27850p;

    /* renamed from: q */
    private BigInteger f27851q;

    /* renamed from: y */
    private BigInteger f27852y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f27852y = bigInteger;
        this.f27850p = bigInteger2;
        this.f27851q = bigInteger3;
        this.f27849a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f27849a;
    }

    public BigInteger getP() {
        return this.f27850p;
    }

    public BigInteger getQ() {
        return this.f27851q;
    }

    public BigInteger getY() {
        return this.f27852y;
    }
}
