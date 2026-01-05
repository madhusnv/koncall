package zy;

import g2.f0;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.SSHRuntimeException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zy.e */
/* loaded from: classes3.dex */
public final class C9105e extends f0 {

    /* renamed from: e */
    public BigInteger f43667e;

    /* renamed from: f */
    public BigInteger f43668f;

    public C9105e() {
        super("DH", "DH");
    }

    @Override // g2.f0
    /* renamed from: a */
    public final void mo6138a(byte[] bArr) throws IllegalStateException, InvalidKeySpecException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic = AbstractC5037q.m9950c("DH").generatePublic(new DHPublicKeySpec(new BigInteger(bArr), this.f43667e, this.f43668f));
        KeyAgreement keyAgreement = (KeyAgreement) this.f11536b;
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        this.f11538d = new BigInteger(1, keyAgreement.generateSecret());
    }

    @Override // g2.f0
    /* renamed from: b */
    public final void mo6139b(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) this.f11535a;
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new SSHRuntimeException("Wrong algorithm parameters for Diffie Hellman");
        }
        DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
        this.f43667e = dHParameterSpec.getP();
        this.f43668f = dHParameterSpec.getG();
        keyPairGenerator.initialize(algorithmParameterSpec);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ((KeyAgreement) this.f11536b).init(keyPairGenerateKeyPair.getPrivate());
        this.f11537c = ((DHPublicKey) keyPairGenerateKeyPair.getPublic()).getY().toByteArray();
    }
}
