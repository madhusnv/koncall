package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class DSASigner implements DSAExt {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger getRandomizer(BigInteger bigInteger, SecureRandom secureRandom) {
        return BigIntegers.createRandomBigInteger(7, CryptoServicesRegistrar.getSecureRandom(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q10, bArr);
        BigInteger x3 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(q10, x3, bArr);
        } else {
            this.kCalculator.init(q10, this.random);
        }
        BigInteger bigIntegerNextK = this.kCalculator.nextK();
        BigInteger bigIntegerMod = parameters.getG().modPow(bigIntegerNextK.add(getRandomizer(q10, this.random)), parameters.getP()).mod(q10);
        return new BigInteger[]{bigIntegerMod, BigIntegers.modOddInverse(q10, bigIntegerNextK).multiply(bigIntegerCalculateE.add(x3.multiply(bigIntegerMod))).mod(q10)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getQ();
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
            org.bouncycastle.crypto.params.DSAPrivateKeyParameters r0 = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) r0
            r2.key = r0
            java.security.SecureRandom r4 = r4.getRandom()
            goto L1e
        L15:
            org.bouncycastle.crypto.params.DSAPrivateKeyParameters r4 = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) r4
        L17:
            r2.key = r4
            goto L1d
        L1a:
            org.bouncycastle.crypto.params.DSAPublicKeyParameters r4 = (org.bouncycastle.crypto.params.DSAPublicKeyParameters) r4
            goto L17
        L1d:
            r4 = 0
        L1e:
            java.lang.String r0 = "DSA"
            org.bouncycastle.crypto.params.DSAKeyParameters r1 = r2.key
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.DSASigner.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    public SecureRandom initSecureRandom(boolean z6, SecureRandom secureRandom) {
        if (z6) {
            return CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q10, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q10.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q10.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModOddInverseVar = BigIntegers.modOddInverseVar(q10, bigInteger2);
        BigInteger bigIntegerMod = bigIntegerCalculateE.multiply(bigIntegerModOddInverseVar).mod(q10);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModOddInverseVar).mod(q10);
        BigInteger p4 = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p4).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigIntegerMod2, p4)).mod(p4).mod(q10).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
