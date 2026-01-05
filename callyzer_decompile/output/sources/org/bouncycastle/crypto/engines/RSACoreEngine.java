package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class RSACoreEngine {
    private boolean forEncryption;
    private RSAKeyParameters key;

    private CryptoServicePurpose getPurpose(boolean z6, boolean z10) {
        boolean z11 = false;
        boolean z12 = z6 && z10;
        boolean z13 = !z6 && z10;
        if (!z6 && !z10) {
            z11 = true;
        }
        return z12 ? CryptoServicePurpose.SIGNING : z13 ? CryptoServicePurpose.ENCRYPTION : z11 ? CryptoServicePurpose.VERIFYING : CryptoServicePurpose.DECRYPTION;
    }

    public BigInteger convertInput(byte[] bArr, int i10, int i11) {
        if (i11 > getInputBlockSize() + 1) {
            throw new DataLengthException("input too large for RSA cipher.");
        }
        if (i11 == getInputBlockSize() + 1 && !this.forEncryption) {
            throw new DataLengthException("input too large for RSA cipher.");
        }
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.key.getModulus()) < 0) {
            return bigInteger;
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public byte[] convertOutput(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.forEncryption) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            Arrays.fill(byteArray, (byte) 0);
            return bArr;
        }
        if (byteArray[0] == 0 && byteArray.length > getOutputBlockSize()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        }
        if (byteArray.length >= getOutputBlockSize()) {
            return byteArray;
        }
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr3 = new byte[outputBlockSize];
        System.arraycopy(byteArray, 0, bArr3, outputBlockSize - byteArray.length, byteArray.length);
        return bArr3;
    }

    public int getInputBlockSize() {
        int iBitLength = (this.key.getModulus().bitLength() + 7) / 8;
        return this.forEncryption ? iBitLength - 1 : iBitLength;
    }

    public int getOutputBlockSize() {
        int iBitLength = (this.key.getModulus().bitLength() + 7) / 8;
        return this.forEncryption ? iBitLength : iBitLength - 1;
    }

    public void init(boolean z6, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.key = (RSAKeyParameters) cipherParameters;
        this.forEncryption = z6;
        int iBitsOfSecurityFor = ConstraintUtils.bitsOfSecurityFor(this.key.getModulus());
        RSAKeyParameters rSAKeyParameters = this.key;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSA", iBitsOfSecurityFor, rSAKeyParameters, getPurpose(rSAKeyParameters.isPrivate(), z6)));
    }

    public BigInteger processBlock(BigInteger bigInteger) {
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters;
        BigInteger publicExponent;
        RSAKeyParameters rSAKeyParameters = this.key;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) || (publicExponent = (rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters).getPublicExponent()) == null) {
            return bigInteger.modPow(this.key.getExponent(), this.key.getModulus());
        }
        BigInteger p4 = rSAPrivateCrtKeyParameters.getP();
        BigInteger q10 = rSAPrivateCrtKeyParameters.getQ();
        BigInteger dp2 = rSAPrivateCrtKeyParameters.getDP();
        BigInteger dq2 = rSAPrivateCrtKeyParameters.getDQ();
        BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
        BigInteger bigIntegerModPow = bigInteger.remainder(p4).modPow(dp2, p4);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(q10).modPow(dq2, q10);
        BigInteger bigIntegerAdd = bigIntegerModPow.subtract(bigIntegerModPow2).multiply(qInv).mod(p4).multiply(q10).add(bigIntegerModPow2);
        if (bigIntegerAdd.modPow(publicExponent, rSAPrivateCrtKeyParameters.getModulus()).equals(bigInteger)) {
            return bigIntegerAdd;
        }
        throw new IllegalStateException("RSA engine faulty decryption/signing detected");
    }
}
