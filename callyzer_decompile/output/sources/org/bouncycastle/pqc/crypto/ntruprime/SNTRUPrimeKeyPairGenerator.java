package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class SNTRUPrimeKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SNTRUPrimeKeyGenerationParameters params;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int p4 = this.params.getSntrupParams().getP();
        int q10 = this.params.getSntrupParams().getQ();
        int w5 = this.params.getSntrupParams().getW();
        byte[] bArr = new byte[p4];
        byte[] bArr2 = new byte[p4];
        do {
            Utils.getRandomSmallPolynomial(this.params.getRandom(), bArr);
        } while (!Utils.isInvertiblePolynomialInR3(bArr, bArr2, p4));
        byte[] bArr3 = new byte[p4];
        Utils.getRandomShortPolynomial(this.params.getRandom(), bArr3, p4, w5);
        short[] sArr = new short[p4];
        Utils.getOneThirdInverseInRQ(sArr, bArr3, p4, q10);
        short[] sArr2 = new short[p4];
        Utils.multiplicationInRQ(sArr2, sArr, bArr, p4, q10);
        byte[] bArr4 = new byte[this.params.getSntrupParams().getPublicKeyBytes()];
        Utils.getEncodedPolynomial(bArr4, sArr2, p4, q10);
        SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = new SNTRUPrimePublicKeyParameters(this.params.getSntrupParams(), bArr4);
        int i10 = (p4 + 3) / 4;
        byte[] bArr5 = new byte[i10];
        Utils.getEncodedSmallPolynomial(bArr5, bArr3, p4);
        byte[] bArr6 = new byte[i10];
        Utils.getEncodedSmallPolynomial(bArr6, bArr2, p4);
        byte[] bArr7 = new byte[i10];
        this.params.getRandom().nextBytes(bArr7);
        byte[] hashWithPrefix = Utils.getHashWithPrefix(new byte[]{4}, bArr4);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) sNTRUPrimePublicKeyParameters, (AsymmetricKeyParameter) new SNTRUPrimePrivateKeyParameters(this.params.getSntrupParams(), bArr5, bArr6, bArr4, bArr7, Arrays.copyOfRange(hashWithPrefix, 0, hashWithPrefix.length / 2)));
    }

    public SNTRUPrimeKeyGenerationParameters getParams() {
        return this.params;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (SNTRUPrimeKeyGenerationParameters) keyGenerationParameters;
    }
}
