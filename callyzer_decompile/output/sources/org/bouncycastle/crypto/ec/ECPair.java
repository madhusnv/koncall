package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes3.dex */
public class ECPair {

    /* renamed from: x */
    private final ECPoint f27629x;

    /* renamed from: y */
    private final ECPoint f27630y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f27629x = eCPoint;
        this.f27630y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f27629x;
    }

    public ECPoint getY() {
        return this.f27630y;
    }

    public int hashCode() {
        return (this.f27630y.hashCode() * 37) + this.f27629x.hashCode();
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
