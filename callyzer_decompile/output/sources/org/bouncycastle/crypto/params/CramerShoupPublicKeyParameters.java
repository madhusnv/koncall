package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c */
    private BigInteger f27739c;

    /* renamed from: d */
    private BigInteger f27740d;

    /* renamed from: h */
    private BigInteger f27741h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f27739c = bigInteger;
        this.f27740d = bigInteger2;
        this.f27741h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f27739c) && cramerShoupPublicKeyParameters.getD().equals(this.f27740d) && cramerShoupPublicKeyParameters.getH().equals(this.f27741h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f27739c;
    }

    public BigInteger getD() {
        return this.f27740d;
    }

    public BigInteger getH() {
        return this.f27741h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f27739c.hashCode() ^ this.f27740d.hashCode()) ^ this.f27741h.hashCode()) ^ super.hashCode();
    }
}
