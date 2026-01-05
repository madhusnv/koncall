package org.bouncycastle.pqc.crypto.saber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* loaded from: classes3.dex */
public class SABERKEMGenerator implements EncapsulatedSecretGenerator {

    /* renamed from: sr, reason: collision with root package name */
    private final SecureRandom f44734sr;

    public SABERKEMGenerator(SecureRandom secureRandom) {
        this.f44734sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        SABERPublicKeyParameters sABERPublicKeyParameters = (SABERPublicKeyParameters) asymmetricKeyParameter;
        SABEREngine engine = sABERPublicKeyParameters.getParameters().getEngine();
        byte[] bArr = new byte[engine.getCipherTextSize()];
        byte[] bArr2 = new byte[engine.getSessionKeySize()];
        engine.crypto_kem_enc(bArr, bArr2, sABERPublicKeyParameters.getPublicKey(), this.f44734sr);
        return new SecretWithEncapsulationImpl(bArr2, bArr);
    }
}
