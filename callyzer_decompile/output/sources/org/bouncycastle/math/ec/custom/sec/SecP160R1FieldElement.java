package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SecP160R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q */
    public static final BigInteger f27886Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: x */
    protected int[] f27887x;

    public SecP160R1FieldElement() {
        this.f27887x = Nat160.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.add(this.f27887x, ((SecP160R1FieldElement) eCFieldElement).f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.addOne(this.f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.inv(((SecP160R1FieldElement) eCFieldElement).f27887x, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, this.f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R1FieldElement) {
            return Nat160.eq(this.f27887x, ((SecP160R1FieldElement) obj).f27887x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R1Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f27886Q.bitLength();
    }

    public int hashCode() {
        return f27886Q.hashCode() ^ Arrays.hashCode(this.f27887x, 0, 5);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.inv(this.f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f27887x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f27887x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.multiply(this.f27887x, ((SecP160R1FieldElement) eCFieldElement).f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.negate(this.f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f27887x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.square(iArr, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat160.create();
        SecP160R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 4, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.squareN(iArrCreate, 8, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 16, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.squareN(iArrCreate, 32, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 64, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.square(iArrCreate, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 29, iArrCreate2);
        SecP160R1Field.square(iArrCreate2, iArrCreate);
        if (Nat160.eq(iArr, iArrCreate)) {
            return new SecP160R1FieldElement(iArrCreate2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.square(this.f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.subtract(this.f27887x, ((SecP160R1FieldElement) eCFieldElement).f27887x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f27887x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f27887x);
    }

    public SecP160R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f27886Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f27887x = SecP160R1Field.fromBigInteger(bigInteger);
    }

    public SecP160R1FieldElement(int[] iArr) {
        this.f27887x = iArr;
    }
}
