package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* renamed from: x */
    private BigInteger f27748x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f27748x = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f27748x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f27748x;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f27748x.hashCode() ^ super.hashCode();
    }
}
