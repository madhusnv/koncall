package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes3.dex */
public class DualECPoints {
    private final int cofactor;

    /* renamed from: p */
    private final ECPoint f27789p;

    /* renamed from: q */
    private final ECPoint f27790q;
    private final int securityStrength;

    public DualECPoints(int i10, ECPoint eCPoint, ECPoint eCPoint2, int i11) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i10;
        this.f27789p = eCPoint;
        this.f27790q = eCPoint2;
        this.cofactor = i11;
    }

    private static int log2(int i10) {
        int i11 = 0;
        while (true) {
            i10 >>= 1;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f27789p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f27789p;
    }

    public ECPoint getQ() {
        return this.f27790q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f27789p.getCurve().getFieldSize();
    }
}
