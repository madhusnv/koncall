package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes3.dex */
public class SecP256K1Point extends ECPoint.AbstractFp {
    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        char c2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP256K1FieldElement secP256K1FieldElement = (SecP256K1FieldElement) this.f27863x;
        SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement) this.f27864y;
        SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement) eCPoint.getXCoord();
        SecP256K1FieldElement secP256K1FieldElement4 = (SecP256K1FieldElement) eCPoint.getYCoord();
        SecP256K1FieldElement secP256K1FieldElement5 = (SecP256K1FieldElement) this.f44646zs[0];
        SecP256K1FieldElement secP256K1FieldElement6 = (SecP256K1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreateExt2 = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        int[] iArrCreate3 = Nat256.create();
        boolean zIsOne = secP256K1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP256K1FieldElement3.f27913x;
            iArr2 = secP256K1FieldElement4.f27913x;
        } else {
            SecP256K1Field.square(secP256K1FieldElement5.f27913x, iArrCreate2, iArrCreateExt);
            SecP256K1Field.multiply(iArrCreate2, secP256K1FieldElement3.f27913x, iArrCreate, iArrCreateExt);
            SecP256K1Field.multiply(iArrCreate2, secP256K1FieldElement5.f27913x, iArrCreate2, iArrCreateExt);
            SecP256K1Field.multiply(iArrCreate2, secP256K1FieldElement4.f27913x, iArrCreate2, iArrCreateExt);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = secP256K1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP256K1FieldElement.f27913x;
            iArr4 = secP256K1FieldElement2.f27913x;
            c2 = 0;
        } else {
            c2 = 0;
            SecP256K1Field.square(secP256K1FieldElement6.f27913x, iArrCreate3, iArrCreateExt);
            SecP256K1Field.multiply(iArrCreate3, secP256K1FieldElement.f27913x, iArrCreateExt2, iArrCreateExt);
            SecP256K1Field.multiply(iArrCreate3, secP256K1FieldElement6.f27913x, iArrCreate3, iArrCreateExt);
            SecP256K1Field.multiply(iArrCreate3, secP256K1FieldElement2.f27913x, iArrCreate3, iArrCreateExt);
            iArr3 = iArrCreateExt2;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat256.create();
        SecP256K1Field.subtract(iArr3, iArr, iArrCreate4);
        SecP256K1Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat256.isZero(iArrCreate4)) {
            return Nat256.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SecP256K1Field.square(iArrCreate4, iArrCreate2, iArrCreateExt);
        int[] iArrCreate5 = Nat256.create();
        SecP256K1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5, iArrCreateExt);
        SecP256K1Field.multiply(iArrCreate2, iArr3, iArrCreate2, iArrCreateExt);
        SecP256K1Field.negate(iArrCreate5, iArrCreate5);
        Nat256.mul(iArr4, iArrCreate5, iArrCreateExt2);
        SecP256K1Field.reduce32(Nat256.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SecP256K1FieldElement secP256K1FieldElement7 = new SecP256K1FieldElement(iArrCreate3);
        SecP256K1Field.square(iArrCreate, secP256K1FieldElement7.f27913x, iArrCreateExt);
        int[] iArr5 = secP256K1FieldElement7.f27913x;
        SecP256K1Field.subtract(iArr5, iArrCreate5, iArr5);
        SecP256K1FieldElement secP256K1FieldElement8 = new SecP256K1FieldElement(iArrCreate5);
        SecP256K1Field.subtract(iArrCreate2, secP256K1FieldElement7.f27913x, secP256K1FieldElement8.f27913x);
        SecP256K1Field.multiplyAddToExt(secP256K1FieldElement8.f27913x, iArrCreate, iArrCreateExt2);
        SecP256K1Field.reduce(iArrCreateExt2, secP256K1FieldElement8.f27913x);
        SecP256K1FieldElement secP256K1FieldElement9 = new SecP256K1FieldElement(iArrCreate4);
        if (!zIsOne) {
            int[] iArr6 = secP256K1FieldElement9.f27913x;
            SecP256K1Field.multiply(iArr6, secP256K1FieldElement5.f27913x, iArr6, iArrCreateExt);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP256K1FieldElement9.f27913x;
            SecP256K1Field.multiply(iArr7, secP256K1FieldElement6.f27913x, iArr7, iArrCreateExt);
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[1];
        eCFieldElementArr[c2] = secP256K1FieldElement9;
        return new SecP256K1Point(curve, secP256K1FieldElement7, secP256K1FieldElement8, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SecP256K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP256K1Point(this.curve, this.f27863x, this.f27864y.negate(), this.f44646zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f27864y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP256K1FieldElement secP256K1FieldElement = (SecP256K1FieldElement) this.f27864y;
        if (secP256K1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement) this.f27863x;
        SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement) this.f44646zs[0];
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.square(secP256K1FieldElement.f27913x, iArrCreate, iArrCreateExt);
        int[] iArrCreate2 = Nat256.create();
        SecP256K1Field.square(iArrCreate, iArrCreate2, iArrCreateExt);
        int[] iArrCreate3 = Nat256.create();
        SecP256K1Field.square(secP256K1FieldElement2.f27913x, iArrCreate3, iArrCreateExt);
        SecP256K1Field.reduce32(Nat256.addBothTo(iArrCreate3, iArrCreate3, iArrCreate3), iArrCreate3);
        SecP256K1Field.multiply(iArrCreate, secP256K1FieldElement2.f27913x, iArrCreate, iArrCreateExt);
        SecP256K1Field.reduce32(Nat.shiftUpBits(8, iArrCreate, 2, 0), iArrCreate);
        int[] iArrCreate4 = Nat256.create();
        SecP256K1Field.reduce32(Nat.shiftUpBits(8, iArrCreate2, 3, 0, iArrCreate4), iArrCreate4);
        SecP256K1FieldElement secP256K1FieldElement4 = new SecP256K1FieldElement(iArrCreate2);
        SecP256K1Field.square(iArrCreate3, secP256K1FieldElement4.f27913x, iArrCreateExt);
        int[] iArr = secP256K1FieldElement4.f27913x;
        SecP256K1Field.subtract(iArr, iArrCreate, iArr);
        int[] iArr2 = secP256K1FieldElement4.f27913x;
        SecP256K1Field.subtract(iArr2, iArrCreate, iArr2);
        SecP256K1FieldElement secP256K1FieldElement5 = new SecP256K1FieldElement(iArrCreate);
        SecP256K1Field.subtract(iArrCreate, secP256K1FieldElement4.f27913x, secP256K1FieldElement5.f27913x);
        int[] iArr3 = secP256K1FieldElement5.f27913x;
        SecP256K1Field.multiply(iArr3, iArrCreate3, iArr3, iArrCreateExt);
        int[] iArr4 = secP256K1FieldElement5.f27913x;
        SecP256K1Field.subtract(iArr4, iArrCreate4, iArr4);
        SecP256K1FieldElement secP256K1FieldElement6 = new SecP256K1FieldElement(iArrCreate3);
        SecP256K1Field.twice(secP256K1FieldElement.f27913x, secP256K1FieldElement6.f27913x);
        if (!secP256K1FieldElement3.isOne()) {
            int[] iArr5 = secP256K1FieldElement6.f27913x;
            SecP256K1Field.multiply(iArr5, secP256K1FieldElement3.f27913x, iArr5, iArrCreateExt);
        }
        return new SecP256K1Point(curve, secP256K1FieldElement4, secP256K1FieldElement5, new ECFieldElement[]{secP256K1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f27864y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
