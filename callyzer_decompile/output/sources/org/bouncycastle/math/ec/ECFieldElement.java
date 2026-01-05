package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public abstract class ECFieldElement implements ECConstants {

    public static abstract class AbstractF2m extends ECFieldElement {
        public ECFieldElement halfTrace() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) == 0) {
                throw new IllegalStateException("Half-trace only defined for odd m");
            }
            int i10 = (fieldSize + 1) >>> 1;
            int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(i10);
            ECFieldElement eCFieldElementAdd = this;
            int i11 = 1;
            while (iNumberOfLeadingZeros > 0) {
                eCFieldElementAdd = eCFieldElementAdd.squarePow(i11 << 1).add(eCFieldElementAdd);
                iNumberOfLeadingZeros--;
                i11 = i10 >>> iNumberOfLeadingZeros;
                if ((i11 & 1) != 0) {
                    eCFieldElementAdd = eCFieldElementAdd.squarePow(2).add(this);
                }
            }
            return eCFieldElementAdd;
        }

        public boolean hasFastTrace() {
            return false;
        }

        public int trace() {
            int fieldSize = getFieldSize();
            int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
            ECFieldElement eCFieldElementAdd = this;
            int i10 = 1;
            while (iNumberOfLeadingZeros > 0) {
                eCFieldElementAdd = eCFieldElementAdd.squarePow(i10).add(eCFieldElementAdd);
                iNumberOfLeadingZeros--;
                i10 = fieldSize >>> iNumberOfLeadingZeros;
                if ((i10 & 1) != 0) {
                    eCFieldElementAdd = eCFieldElementAdd.square().add(this);
                }
            }
            if (eCFieldElementAdd.isZero()) {
                return 0;
            }
            if (eCFieldElementAdd.isOne()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    public static abstract class AbstractFp extends ECFieldElement {
    }

    public static class Fp extends AbstractFp {

        /* renamed from: q */
        BigInteger f27860q;

        /* renamed from: r */
        BigInteger f27861r;

        /* renamed from: x */
        BigInteger f27862x;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.f27860q = bigInteger;
            this.f27861r = bigInteger2;
            this.f27862x = bigInteger3;
        }

        public static BigInteger calculateResidue(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return ECConstants.ONE.shiftLeft(iBitLength).subtract(bigInteger);
        }

        private ECFieldElement checkSqrt(ECFieldElement eCFieldElement) {
            if (eCFieldElement.square().equals(this)) {
                return eCFieldElement;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerModMult = ECConstants.ONE;
            BigInteger bigIntegerModReduce = bigInteger;
            BigInteger bigIntegerModMult2 = bigIntegerModMult;
            BigInteger bigIntegerModReduce2 = ECConstants.TWO;
            BigInteger bigIntegerModMult3 = bigIntegerModMult2;
            for (int i10 = iBitLength - 1; i10 >= lowestSetBit + 1; i10--) {
                bigIntegerModMult = modMult(bigIntegerModMult, bigIntegerModMult3);
                if (bigInteger3.testBit(i10)) {
                    bigIntegerModMult3 = modMult(bigIntegerModMult, bigInteger2);
                    bigIntegerModMult2 = modMult(bigIntegerModMult2, bigIntegerModReduce);
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce).subtract(bigIntegerModMult3.shiftLeft(1)));
                } else {
                    BigInteger bigIntegerModReduce3 = modReduce(bigIntegerModMult2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult));
                    BigInteger bigIntegerModReduce4 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult.shiftLeft(1)));
                    bigIntegerModReduce = bigIntegerModReduce4;
                    bigIntegerModMult2 = bigIntegerModReduce3;
                    bigIntegerModMult3 = bigIntegerModMult;
                }
            }
            BigInteger bigIntegerModMult4 = modMult(bigIntegerModMult, bigIntegerModMult3);
            BigInteger bigIntegerModMult5 = modMult(bigIntegerModMult4, bigInteger2);
            BigInteger bigIntegerModReduce5 = modReduce(bigIntegerModMult2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult4));
            BigInteger bigIntegerModReduce6 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult4)));
            BigInteger bigIntegerModMult6 = modMult(bigIntegerModMult4, bigIntegerModMult5);
            for (int i11 = 1; i11 <= lowestSetBit; i11++) {
                bigIntegerModReduce5 = modMult(bigIntegerModReduce5, bigIntegerModReduce6);
                bigIntegerModReduce6 = modReduce(bigIntegerModReduce6.multiply(bigIntegerModReduce6).subtract(bigIntegerModMult6.shiftLeft(1)));
                bigIntegerModMult6 = modMult(bigIntegerModMult6, bigIntegerModMult6);
            }
            return new BigInteger[]{bigIntegerModReduce5, bigIntegerModReduce6};
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new Fp(this.f27860q, this.f27861r, modAdd(this.f27862x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger bigIntegerAdd = this.f27862x.add(ECConstants.ONE);
            if (bigIntegerAdd.compareTo(this.f27860q) == 0) {
                bigIntegerAdd = ECConstants.ZERO;
            }
            return new Fp(this.f27860q, this.f27861r, bigIntegerAdd);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new Fp(this.f27860q, this.f27861r, modMult(this.f27862x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fp)) {
                return false;
            }
            Fp fp2 = (Fp) obj;
            return this.f27860q.equals(fp2.f27860q) && this.f27862x.equals(fp2.f27862x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f27860q.bitLength();
        }

        public BigInteger getQ() {
            return this.f27860q;
        }

        public int hashCode() {
            return this.f27860q.hashCode() ^ this.f27862x.hashCode();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            return new Fp(this.f27860q, this.f27861r, modInverse(this.f27862x));
        }

        public BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.f27860q) >= 0 ? bigIntegerAdd.subtract(this.f27860q) : bigIntegerAdd;
        }

        public BigInteger modDouble(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.f27860q) >= 0 ? bigIntegerShiftLeft.subtract(this.f27860q) : bigIntegerShiftLeft;
        }

        public BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f27860q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f27860q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger bigInteger) {
            return BigIntegers.modOddInverse(this.f27860q, bigInteger);
        }

        public BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        public BigInteger modReduce(BigInteger bigInteger) {
            if (this.f27861r == null) {
                return bigInteger.mod(this.f27860q);
            }
            boolean z6 = bigInteger.signum() < 0;
            if (z6) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.f27860q.bitLength();
            boolean zEquals = this.f27861r.equals(ECConstants.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f27861r);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.f27860q) >= 0) {
                bigInteger = bigInteger.subtract(this.f27860q);
            }
            return (!z6 || bigInteger.signum() == 0) ? bigInteger : this.f27860q.subtract(bigInteger);
        }

        public BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.f27860q) : bigIntegerSubtract;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new Fp(this.f27860q, this.f27861r, modMult(this.f27862x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f27862x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f27860q, this.f27861r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f27862x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new Fp(this.f27860q, this.f27861r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f27862x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f27860q;
            return new Fp(bigInteger, this.f27861r, bigInteger.subtract(this.f27862x));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f27860q.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f27860q.testBit(1)) {
                BigInteger bigIntegerAdd = this.f27860q.shiftRight(2).add(ECConstants.ONE);
                BigInteger bigInteger = this.f27860q;
                return checkSqrt(new Fp(bigInteger, this.f27861r, this.f27862x.modPow(bigIntegerAdd, bigInteger)));
            }
            if (this.f27860q.testBit(2)) {
                BigInteger bigIntegerModPow = this.f27862x.modPow(this.f27860q.shiftRight(3), this.f27860q);
                BigInteger bigIntegerModMult = modMult(bigIntegerModPow, this.f27862x);
                if (modMult(bigIntegerModMult, bigIntegerModPow).equals(ECConstants.ONE)) {
                    return checkSqrt(new Fp(this.f27860q, this.f27861r, bigIntegerModMult));
                }
                return checkSqrt(new Fp(this.f27860q, this.f27861r, modMult(bigIntegerModMult, ECConstants.TWO.modPow(this.f27860q.shiftRight(2), this.f27860q))));
            }
            BigInteger bigIntegerShiftRight = this.f27860q.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.f27862x.modPow(bigIntegerShiftRight, this.f27860q);
            BigInteger bigInteger2 = ECConstants.ONE;
            if (!bigIntegerModPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.f27862x;
            BigInteger bigIntegerModDouble = modDouble(modDouble(bigInteger3));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger2);
            BigInteger bigIntegerSubtract = this.f27860q.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.f27860q.bitLength(), random);
                if (bigInteger4.compareTo(this.f27860q) < 0 && modReduce(bigInteger4.multiply(bigInteger4).subtract(bigIntegerModDouble)).modPow(bigIntegerShiftRight, this.f27860q).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrLucasSequence = lucasSequence(bigInteger4, bigInteger3, bigIntegerAdd2);
                    BigInteger bigInteger5 = bigIntegerArrLucasSequence[0];
                    BigInteger bigInteger6 = bigIntegerArrLucasSequence[1];
                    if (modMult(bigInteger6, bigInteger6).equals(bigIntegerModDouble)) {
                        return new Fp(this.f27860q, this.f27861r, modHalfAbs(bigInteger6));
                    }
                    if (!bigInteger5.equals(ECConstants.ONE) && !bigInteger5.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f27860q;
            BigInteger bigInteger2 = this.f27861r;
            BigInteger bigInteger3 = this.f27862x;
            return new Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f27862x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f27860q, this.f27861r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f27862x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new Fp(this.f27860q, this.f27861r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new Fp(this.f27860q, this.f27861r, modSubtract(this.f27862x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f27862x;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i10) {
        ECFieldElement eCFieldElementSquare = this;
        for (int i11 = 0; i11 < i10; i11++) {
            eCFieldElementSquare = eCFieldElementSquare.square();
        }
        return eCFieldElementSquare;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }

    public static class F2m extends AbstractF2m {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* renamed from: ks, reason: collision with root package name */
        private int[] f44645ks;

        /* renamed from: m */
        private int f27858m;
        private int representation;

        /* renamed from: x */
        LongArray f27859x;

        public F2m(int i10, int[] iArr, LongArray longArray) {
            this.f27858m = i10;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.f44645ks = iArr;
            this.f27859x = longArray;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f27859x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f27859x, 0);
            return new F2m(this.f27858m, this.f44645ks, longArray);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f27858m, this.f44645ks, this.f27859x.addOne());
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.f27859x.degree();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F2m)) {
                return false;
            }
            F2m f2m = (F2m) obj;
            return this.f27858m == f2m.f27858m && this.representation == f2m.representation && Arrays.areEqual(this.f44645ks, f2m.f44645ks) && this.f27859x.equals(f2m.f27859x);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f27858m;
        }

        public int getK1() {
            return this.f44645ks[0];
        }

        public int getK2() {
            int[] iArr = this.f44645ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f44645ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f27858m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return (this.f27859x.hashCode() ^ this.f27858m) ^ Arrays.hashCode(this.f44645ks);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            int i10 = this.f27858m;
            int[] iArr = this.f44645ks;
            return new F2m(i10, iArr, this.f27859x.modInverse(i10, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.f27859x.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isZero() {
            return this.f27859x.isZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i10 = this.f27858m;
            int[] iArr = this.f44645ks;
            return new F2m(i10, iArr, this.f27859x.modMultiply(((F2m) eCFieldElement).f27859x, i10, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f27859x;
            LongArray longArray2 = ((F2m) eCFieldElement).f27859x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f27859x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f27859x;
            LongArray longArrayMultiply = longArray.multiply(longArray2, this.f27858m, this.f44645ks);
            LongArray longArrayMultiply2 = longArray3.multiply(longArray4, this.f27858m, this.f44645ks);
            if (longArrayMultiply == longArray || longArrayMultiply == longArray2) {
                longArrayMultiply = (LongArray) longArrayMultiply.clone();
            }
            longArrayMultiply.addShiftedByWords(longArrayMultiply2, 0);
            longArrayMultiply.reduce(this.f27858m, this.f44645ks);
            return new F2m(this.f27858m, this.f44645ks, longArrayMultiply);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f27859x.isZero() || this.f27859x.isOne()) ? this : squarePow(this.f27858m - 1);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            int i10 = this.f27858m;
            int[] iArr = this.f44645ks;
            return new F2m(i10, iArr, this.f27859x.modSquare(i10, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f27859x;
            LongArray longArray2 = ((F2m) eCFieldElement).f27859x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f27859x;
            LongArray longArraySquare = longArray.square(this.f27858m, this.f44645ks);
            LongArray longArrayMultiply = longArray2.multiply(longArray3, this.f27858m, this.f44645ks);
            if (longArraySquare == longArray) {
                longArraySquare = (LongArray) longArraySquare.clone();
            }
            longArraySquare.addShiftedByWords(longArrayMultiply, 0);
            longArraySquare.reduce(this.f27858m, this.f44645ks);
            return new F2m(this.f27858m, this.f44645ks, longArraySquare);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePow(int i10) {
            if (i10 < 1) {
                return this;
            }
            int i11 = this.f27858m;
            int[] iArr = this.f44645ks;
            return new F2m(i11, iArr, this.f27859x.modSquareN(i10, i11, iArr));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            return this.f27859x.testBitZero();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f27859x.toBigInteger();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }
    }
}
