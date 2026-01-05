package org.bouncycastle.pqc.crypto.cmce;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* loaded from: classes3.dex */
public class CMCEKEMGenerator implements EncapsulatedSecretGenerator {

    /* renamed from: sr, reason: collision with root package name */
    private final SecureRandom f44666sr;

    public CMCEKEMGenerator(SecureRandom secureRandom) {
        this.f44666sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        return generateEncapsulated(asymmetricKeyParameter, ((CMCEPublicKeyParameters) asymmetricKeyParameter).getParameters().getEngine().getDefaultSessionKeySize());
    }

    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter, int i10) {
        CMCEPublicKeyParameters cMCEPublicKeyParameters = (CMCEPublicKeyParameters) asymmetricKeyParameter;
        CMCEEngine engine = cMCEPublicKeyParameters.getParameters().getEngine();
        byte[] bArr = new byte[engine.getCipherTextSize()];
        byte[] bArr2 = new byte[i10 / 8];
        engine.kem_enc(bArr, bArr2, cMCEPublicKeyParameters.getPublicKey(), this.f44666sr);
        return new SecretWithEncapsulationImpl(bArr2, bArr);
    }
}
