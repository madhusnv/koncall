package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes3.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* renamed from: q */
    private ECPoint f27837q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f27837q = eCPoint.normalize();
        } else {
            this.f27837q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f27837q;
    }
}
