package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public class DHPublicKeyParameters extends DHKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: y */
    private BigInteger f27749y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f27749y = validate(bigInteger, dHParameters);
    }

    private static int legendre(BigInteger bigInteger, BigInteger bigInteger2) {
        int iBitLength = bigInteger2.bitLength();
        int[] iArrFromBigInteger = Nat.fromBigInteger(iBitLength, bigInteger);
        int[] iArrFromBigInteger2 = Nat.fromBigInteger(iBitLength, bigInteger2);
        int length = iArrFromBigInteger2.length;
        int i10 = 0;
        while (true) {
            int i11 = iArrFromBigInteger[0];
            if (i11 == 0) {
                Nat.shiftDownWord(length, iArrFromBigInteger, 0);
            } else {
                int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i11);
                if (iNumberOfTrailingZeros > 0) {
                    Nat.shiftDownBits(length, iArrFromBigInteger, iNumberOfTrailingZeros, 0);
                    int i12 = iArrFromBigInteger2[0];
                    i10 ^= (iNumberOfTrailingZeros << 1) & (i12 ^ (i12 >>> 1));
                }
                int iCompare = Nat.compare(length, iArrFromBigInteger, iArrFromBigInteger2);
                if (iCompare == 0) {
                    break;
                }
                if (iCompare < 0) {
                    i10 ^= iArrFromBigInteger[0] & iArrFromBigInteger2[0];
                    int[] iArr = iArrFromBigInteger2;
                    iArrFromBigInteger2 = iArrFromBigInteger;
                    iArrFromBigInteger = iArr;
                }
                while (true) {
                    int i13 = length - 1;
                    if (iArrFromBigInteger[i13] != 0) {
                        break;
                    }
                    length = i13;
                }
                Nat.sub(length, iArrFromBigInteger, iArrFromBigInteger2, iArrFromBigInteger);
            }
        }
        if (Nat.isOne(length, iArrFromBigInteger2)) {
            return 1 - (i10 & 2);
        }
        return 0;
    }

    private BigInteger validate(BigInteger bigInteger, DHParameters dHParameters) {
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        BigInteger p4 = dHParameters.getP();
        BigInteger bigInteger2 = TWO;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(p4.subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        BigInteger q10 = dHParameters.getQ();
        if (q10 != null && (!(p4.testBit(0) && p4.bitLength() - 1 == q10.bitLength() && p4.shiftRight(1).equals(q10)) ? ONE.equals(bigInteger.modPow(q10, p4)) : 1 == legendre(bigInteger, p4))) {
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
        return bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f27749y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f27749y;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f27749y.hashCode() ^ super.hashCode();
    }
}
