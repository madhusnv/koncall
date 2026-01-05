package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* loaded from: classes3.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* renamed from: g */
    private BigInteger f27742g;

    /* renamed from: j */
    private BigInteger f27743j;

    /* renamed from: l */
    private int f27744l;

    /* renamed from: m */
    private int f27745m;

    /* renamed from: p */
    private BigInteger f27746p;

    /* renamed from: q */
    private BigInteger f27747q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int getDefaultMParam(int i10) {
        return (i10 != 0 && i10 < DEFAULT_MINIMUM_LENGTH) ? i10 : DEFAULT_MINIMUM_LENGTH;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f27746p) && dHParameters.getG().equals(this.f27742g);
    }

    public BigInteger getG() {
        return this.f27742g;
    }

    public BigInteger getJ() {
        return this.f27743j;
    }

    public int getL() {
        return this.f27744l;
    }

    public int getM() {
        return this.f27745m;
    }

    public BigInteger getP() {
        return this.f27746p;
    }

    public BigInteger getQ() {
        return this.f27747q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i10), i10, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, i10, i11, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i10 > bigInteger.bitLength() && !Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f27742g = bigInteger2;
        this.f27746p = bigInteger;
        this.f27747q = bigInteger3;
        this.f27745m = i10;
        this.f27744l = i11;
        this.f27743j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, DEFAULT_MINIMUM_LENGTH, 0, bigInteger4, dHValidationParameters);
    }
}
