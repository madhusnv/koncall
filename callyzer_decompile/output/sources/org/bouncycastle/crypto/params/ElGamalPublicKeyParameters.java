package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* renamed from: y */
    private BigInteger f27766y;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f27766y = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj).getY().equals(this.f27766y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f27766y;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return this.f27766y.hashCode() ^ super.hashCode();
    }
}
