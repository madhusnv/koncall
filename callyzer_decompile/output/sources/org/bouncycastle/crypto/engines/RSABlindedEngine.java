package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class RSABlindedEngine implements AsymmetricBlockCipher {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private RSACoreEngine core = new RSACoreEngine();
    private RSAKeyParameters key;
    private SecureRandom random;

    private BigInteger processInput(BigInteger bigInteger) {
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters;
        BigInteger publicExponent;
        RSAKeyParameters rSAKeyParameters = this.key;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) || (publicExponent = (rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters).getPublicExponent()) == null) {
            return this.core.processBlock(bigInteger);
        }
        BigInteger modulus = rSAPrivateCrtKeyParameters.getModulus();
        BigInteger bigInteger2 = ONE;
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger2, modulus.subtract(bigInteger2), this.random);
        return BigIntegers.modOddInverse(modulus, bigIntegerCreateRandomInRange).multiply(this.core.processBlock(bigIntegerCreateRandomInRange.modPow(publicExponent, modulus).multiply(bigInteger).mod(modulus))).mod(modulus);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.core.getInputBlockSize();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.core.getOutputBlockSize();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z6, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        this.core.init(z6, cipherParameters);
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) parametersWithRandom.getParameters();
            this.key = rSAKeyParameters;
            if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters)) {
                this.random = null;
                return;
            }
            secureRandom = parametersWithRandom.getRandom();
        } else {
            RSAKeyParameters rSAKeyParameters2 = (RSAKeyParameters) cipherParameters;
            this.key = rSAKeyParameters2;
            if (!(rSAKeyParameters2 instanceof RSAPrivateCrtKeyParameters)) {
                this.random = null;
                return;
            }
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        if (this.key == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        return this.core.convertOutput(processInput(this.core.convertInput(bArr, i10, i11)));
    }
}
