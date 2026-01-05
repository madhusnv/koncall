package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a */
    private BigInteger f27767a;

    /* renamed from: p */
    private BigInteger f27768p;

    /* renamed from: q */
    private BigInteger f27769q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27768p = bigInteger;
        this.f27769q = bigInteger2;
        this.f27767a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f27768p) && gOST3410Parameters.getQ().equals(this.f27769q) && gOST3410Parameters.getA().equals(this.f27767a);
    }

    public BigInteger getA() {
        return this.f27767a;
    }

    public BigInteger getP() {
        return this.f27768p;
    }

    public BigInteger getQ() {
        return this.f27769q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f27768p.hashCode() ^ this.f27769q.hashCode()) ^ this.f27767a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f27767a = bigInteger3;
        this.f27768p = bigInteger;
        this.f27769q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
