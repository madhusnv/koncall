package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine;

/* loaded from: classes3.dex */
public class SPHINCSPlusKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SPHINCSPlusParameters parameters;
    private SecureRandom random;

    private byte[] sec_rand(int i10) {
        byte[] bArr = new byte[i10];
        this.random.nextBytes(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        SK sk2;
        byte[] bArrSec_rand;
        SPHINCSPlusEngine engine = this.parameters.getEngine();
        if (engine instanceof SPHINCSPlusEngine.HarakaSEngine) {
            byte[] bArrSec_rand2 = sec_rand(engine.f28102N * 3);
            int i10 = engine.f28102N;
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[i10];
            bArrSec_rand = new byte[i10];
            System.arraycopy(bArrSec_rand2, 0, bArr, 0, i10);
            int i11 = engine.f28102N;
            System.arraycopy(bArrSec_rand2, i11, bArr2, 0, i11);
            int i12 = engine.f28102N;
            System.arraycopy(bArrSec_rand2, i12 << 1, bArrSec_rand, 0, i12);
            sk2 = new SK(bArr, bArr2);
        } else {
            sk2 = new SK(sec_rand(engine.f28102N), sec_rand(engine.f28102N));
            bArrSec_rand = sec_rand(engine.f28102N);
        }
        engine.init(bArrSec_rand);
        PK pk2 = new PK(bArrSec_rand, new HT(engine, sk2.seed, bArrSec_rand).htPubKey);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SPHINCSPlusPublicKeyParameters(this.parameters, pk2), (AsymmetricKeyParameter) new SPHINCSPlusPrivateKeyParameters(this.parameters, sk2, pk2));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.parameters = ((SPHINCSPlusKeyGenerationParameters) keyGenerationParameters).getParameters();
    }
}
