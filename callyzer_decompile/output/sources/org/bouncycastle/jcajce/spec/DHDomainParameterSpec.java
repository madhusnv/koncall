package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;

/* loaded from: classes3.dex */
public class DHDomainParameterSpec extends DHParameterSpec {

    /* renamed from: j */
    private final BigInteger f27816j;

    /* renamed from: m */
    private final int f27817m;

    /* renamed from: q */
    private final BigInteger f27818q;
    private DHValidationParameters validationParameters;

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }

    public DHParameters getDomainParameters() {
        return new DHParameters(getP(), getG(), this.f27818q, this.f27817m, getL(), this.f27816j, this.validationParameters);
    }

    public BigInteger getJ() {
        return this.f27816j;
    }

    public int getM() {
        return this.f27817m;
    }

    public BigInteger getQ() {
        return this.f27818q;
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, null, i10);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i10);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, int i11) {
        super(bigInteger, bigInteger3, i11);
        this.f27818q = bigInteger2;
        this.f27816j = bigInteger4;
        this.f27817m = i10;
    }

    public DHDomainParameterSpec(DHParameters dHParameters) {
        this(dHParameters.getP(), dHParameters.getQ(), dHParameters.getG(), dHParameters.getJ(), dHParameters.getM(), dHParameters.getL());
        this.validationParameters = dHParameters.getValidationParameters();
    }
}
