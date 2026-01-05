package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* renamed from: x */
    private BigInteger f27755x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f27755x = bigInteger;
    }

    public BigInteger getX() {
        return this.f27755x;
    }
}
