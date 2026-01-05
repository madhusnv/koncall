package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: pk, reason: collision with root package name */
    private CramerShoupPublicKeyParameters f44611pk;

    /* renamed from: x1, reason: collision with root package name */
    private BigInteger f44612x1;

    /* renamed from: x2, reason: collision with root package name */
    private BigInteger f44613x2;

    /* renamed from: y1, reason: collision with root package name */
    private BigInteger f44614y1;

    /* renamed from: y2, reason: collision with root package name */
    private BigInteger f44615y2;

    /* renamed from: z */
    private BigInteger f27738z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f44612x1 = bigInteger;
        this.f44613x2 = bigInteger2;
        this.f44614y1 = bigInteger3;
        this.f44615y2 = bigInteger4;
        this.f27738z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f44612x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f44613x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f44614y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f44615y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f27738z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f44611pk;
    }

    public BigInteger getX1() {
        return this.f44612x1;
    }

    public BigInteger getX2() {
        return this.f44613x2;
    }

    public BigInteger getY1() {
        return this.f44614y1;
    }

    public BigInteger getY2() {
        return this.f44615y2;
    }

    public BigInteger getZ() {
        return this.f27738z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f44612x1.hashCode() ^ this.f44613x2.hashCode()) ^ this.f44614y1.hashCode()) ^ this.f44615y2.hashCode()) ^ this.f27738z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f44611pk = cramerShoupPublicKeyParameters;
    }
}
