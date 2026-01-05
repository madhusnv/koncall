package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class GOST3410PrivateKeyParameters extends GOST3410KeyParameters {

    /* renamed from: x */
    private BigInteger f27770x;

    public GOST3410PrivateKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(true, gOST3410Parameters);
        this.f27770x = bigInteger;
    }

    public BigInteger getX() {
        return this.f27770x;
    }
}
