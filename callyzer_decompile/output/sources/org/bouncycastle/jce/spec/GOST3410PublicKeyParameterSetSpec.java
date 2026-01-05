package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a */
    private BigInteger f27846a;

    /* renamed from: p */
    private BigInteger f27847p;

    /* renamed from: q */
    private BigInteger f27848q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27847p = bigInteger;
        this.f27848q = bigInteger2;
        this.f27846a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f27846a.equals(gOST3410PublicKeyParameterSetSpec.f27846a) && this.f27847p.equals(gOST3410PublicKeyParameterSetSpec.f27847p) && this.f27848q.equals(gOST3410PublicKeyParameterSetSpec.f27848q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f27846a;
    }

    public BigInteger getP() {
        return this.f27847p;
    }

    public BigInteger getQ() {
        return this.f27848q;
    }

    public int hashCode() {
        return (this.f27846a.hashCode() ^ this.f27847p.hashCode()) ^ this.f27848q.hashCode();
    }
}
