package zy;

import g2.f0;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.KeyAgreement;
import net.schmizz.sshj.common.AbstractC5037q;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zy.c */
/* loaded from: classes3.dex */
public final class C9103c extends f0 {

    /* renamed from: e */
    public int f43664e;

    /* renamed from: f */
    public int f43665f;

    /* renamed from: g */
    public byte[] f43666g;

    @Override // g2.f0
    /* renamed from: a */
    public final void mo6138a(byte[] bArr) throws IllegalStateException, InvalidKeySpecException, InvalidKeyException {
        KeyFactory keyFactoryM9950c = AbstractC5037q.m9950c(XDHParameterSpec.X25519);
        byte[] bArr2 = new byte[this.f43664e];
        System.arraycopy(this.f43666g, 0, bArr2, 0, this.f43665f);
        System.arraycopy(bArr, 0, bArr2, this.f43665f, 32);
        PublicKey publicKeyGeneratePublic = keyFactoryM9950c.generatePublic(new X509EncodedKeySpec(bArr2));
        KeyAgreement keyAgreement = (KeyAgreement) this.f11536b;
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        this.f11538d = new BigInteger(BigInteger.ONE.signum(), keyAgreement.generateSecret());
    }

    @Override // g2.f0
    /* renamed from: b */
    public final void mo6139b(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        KeyPair keyPairGenerateKeyPair = ((KeyPairGenerator) this.f11535a).generateKeyPair();
        ((KeyAgreement) this.f11536b).init(keyPairGenerateKeyPair.getPrivate());
        byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
        int length = encoded.length;
        this.f43664e = length;
        int i10 = length - 32;
        this.f43665f = i10;
        this.f43666g = new byte[i10];
        byte[] bArr = new byte[32];
        System.arraycopy(encoded, i10, bArr, 0, 32);
        this.f11537c = bArr;
        System.arraycopy(encoded, 0, this.f43666g, 0, this.f43665f);
    }
}
