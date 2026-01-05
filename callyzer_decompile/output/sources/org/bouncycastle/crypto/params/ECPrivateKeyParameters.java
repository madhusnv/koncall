package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* renamed from: d */
    private final BigInteger f27760d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f27760d = eCDomainParameters.validatePrivateScalar(bigInteger);
    }

    public BigInteger getD() {
        return this.f27760d;
    }
}
