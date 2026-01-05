package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class ECDSASigner implements ECConstants, DSAExt {
    private final DSAKCalculator kCalculator;
    private ECKeyParameters key;
    private SecureRandom random;

    public ECDSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n6 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n6, bArr);
        BigInteger d2 = ((ECPrivateKeyParameters) this.key).getD();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(n6, d2, bArr);
        } else {
            this.kCalculator.init(n6, this.random);
        }
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.kCalculator.nextK();
            BigInteger bigIntegerMod = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger().mod(n6);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger)) {
                BigInteger bigIntegerMod2 = BigIntegers.modOddInverse(n6, bigIntegerNextK).multiply(bigIntegerCalculateE.add(d2.multiply(bigIntegerMod))).mod(n6);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    public ECFieldElement getDenominator(int i10, ECPoint eCPoint) {
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i10 != 6 && i10 != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getN();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // org.bouncycastle.crypto.DSA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r3, org.bouncycastle.crypto.CipherParameters r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L1a
            boolean r0 = r4 instanceof org.bouncycastle.crypto.params.ParametersWithRandom
            if (r0 == 0) goto L15
            org.bouncycastle.crypto.params.ParametersWithRandom r4 = (org.bouncycastle.crypto.params.ParametersWithRandom) r4
            org.bouncycastle.crypto.CipherParameters r0 = r4.getParameters()
            org.bouncycastle.crypto.params.ECPrivateKeyParameters r0 = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) r0
            r2.key = r0
            java.security.SecureRandom r4 = r4.getRandom()
            goto L1e
        L15:
            org.bouncycastle.crypto.params.ECPrivateKeyParameters r4 = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) r4
        L17:
            r2.key = r4
            goto L1d
        L1a:
            org.bouncycastle.crypto.params.ECPublicKeyParameters r4 = (org.bouncycastle.crypto.params.ECPublicKeyParameters) r4
            goto L17
        L1d:
            r4 = 0
        L1e:
            java.lang.String r0 = "ECDSA"
            org.bouncycastle.crypto.params.ECKeyParameters r1 = r2.key
            org.bouncycastle.crypto.CryptoServiceProperties r0 = org.bouncycastle.crypto.signers.Utils.getDefaultProperties(r0, r1, r3)
            org.bouncycastle.crypto.CryptoServicesRegistrar.checkConstraints(r0)
            if (r3 == 0) goto L35
            org.bouncycastle.crypto.signers.DSAKCalculator r3 = r2.kCalculator
            boolean r3 = r3.isDeterministic()
            if (r3 != 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            java.security.SecureRandom r3 = r2.initSecureRandom(r3, r4)
            r2.random = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.ECDSASigner.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    public SecureRandom initSecureRandom(boolean z6, SecureRandom secureRandom) {
        if (z6) {
            return CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger cofactor;
        ECFieldElement denominator;
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n6 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n6, bArr);
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n6) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n6) >= 0) {
            return false;
        }
        BigInteger bigIntegerModOddInverseVar = BigIntegers.modOddInverseVar(n6, bigInteger2);
        ECPoint eCPointSumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigIntegerCalculateE.multiply(bigIntegerModOddInverseVar).mod(n6), ((ECPublicKeyParameters) this.key).getQ(), bigInteger.multiply(bigIntegerModOddInverseVar).mod(n6));
        if (eCPointSumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        ECCurve curve = eCPointSumOfTwoMultiplies.getCurve();
        if (curve == null || (cofactor = curve.getCofactor()) == null || cofactor.compareTo(ECConstants.EIGHT) > 0 || (denominator = getDenominator(curve.getCoordinateSystem(), eCPointSumOfTwoMultiplies)) == null || denominator.isZero()) {
            return eCPointSumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n6).equals(bigInteger);
        }
        ECFieldElement xCoord = eCPointSumOfTwoMultiplies.getXCoord();
        while (curve.isValidFieldElement(bigInteger)) {
            if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                return true;
            }
            bigInteger = bigInteger.add(n6);
        }
        return false;
    }

    public ECDSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
