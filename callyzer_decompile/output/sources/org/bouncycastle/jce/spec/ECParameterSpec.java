package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes3.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: G */
    private ECPoint f27833G;
    private ECCurve curve;

    /* renamed from: h */
    private BigInteger f27834h;

    /* renamed from: n */
    private BigInteger f27835n;
    private byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f27833G = eCPoint.normalize();
        this.f27835n = bigInteger;
        this.f27834h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ECParameterSpec)) {
            return false;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f27833G;
    }

    public BigInteger getH() {
        return this.f27834h;
    }

    public BigInteger getN() {
        return this.f27835n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f27833G = eCPoint.normalize();
        this.f27835n = bigInteger;
        this.f27834h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f27833G = eCPoint.normalize();
        this.f27835n = bigInteger;
        this.f27834h = bigInteger2;
        this.seed = bArr;
    }
}
