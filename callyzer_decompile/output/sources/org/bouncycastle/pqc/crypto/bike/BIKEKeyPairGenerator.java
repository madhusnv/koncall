package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class BIKEKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private int L_BYTE;
    private int R_BYTE;
    private BIKEKeyGenerationParameters bikeKeyGenerationParameters;

    /* renamed from: l */
    private int f27998l;

    /* renamed from: r */
    private int f27999r;
    private SecureRandom random;

    private AsymmetricCipherKeyPair genKeyPair() {
        BIKEEngine engine = this.bikeKeyGenerationParameters.getParameters().getEngine();
        int i10 = this.R_BYTE;
        byte[] bArr = new byte[i10];
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[i10];
        byte[] bArr4 = new byte[this.L_BYTE];
        engine.genKeyPair(bArr, bArr2, bArr4, bArr3, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new BIKEPublicKeyParameters(this.bikeKeyGenerationParameters.getParameters(), bArr3), (AsymmetricKeyParameter) new BIKEPrivateKeyParameters(this.bikeKeyGenerationParameters.getParameters(), bArr, bArr2, bArr4));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.bikeKeyGenerationParameters = (BIKEKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f27999r = this.bikeKeyGenerationParameters.getParameters().getR();
        int l9 = this.bikeKeyGenerationParameters.getParameters().getL();
        this.f27998l = l9;
        this.L_BYTE = l9 / 8;
        this.R_BYTE = (this.f27999r + 7) / 8;
    }
}
