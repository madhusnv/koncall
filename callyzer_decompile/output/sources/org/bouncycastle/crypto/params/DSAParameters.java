package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f27752g;

    /* renamed from: p */
    private BigInteger f27753p;

    /* renamed from: q */
    private BigInteger f27754q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27752g = bigInteger3;
        this.f27753p = bigInteger;
        this.f27754q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f27753p) && dSAParameters.getQ().equals(this.f27754q) && dSAParameters.getG().equals(this.f27752g);
    }

    public BigInteger getG() {
        return this.f27752g;
    }

    public BigInteger getP() {
        return this.f27753p;
    }

    public BigInteger getQ() {
        return this.f27754q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f27752g = bigInteger3;
        this.f27753p = bigInteger;
        this.f27754q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
