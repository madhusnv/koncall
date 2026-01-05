package zy;

import g2.f0;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.SSHRuntimeException;
import og.of;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zy.h */
/* loaded from: classes3.dex */
public final class C9108h extends f0 {

    /* renamed from: e */
    public ECParameterSpec f43676e;

    @Override // g2.f0
    /* renamed from: a */
    public final void mo6138a(byte[] bArr) throws IllegalStateException, InvalidKeyException {
        KeyAgreement keyAgreement = (KeyAgreement) this.f11536b;
        KeyFactory keyFactoryM9950c = AbstractC5037q.m9950c("EC");
        EllipticCurve curve = this.f43676e.getCurve();
        int fieldSize = (curve.getField().getFieldSize() + 7) / 8;
        if (bArr.length != (fieldSize * 2) + 1 || bArr[0] != 4) {
            throw new SSHRuntimeException("Invalid 'f' for Elliptic Curve " + curve.toString());
        }
        byte[] bArr2 = new byte[fieldSize];
        byte[] bArr3 = new byte[fieldSize];
        System.arraycopy(bArr, 1, bArr2, 0, fieldSize);
        System.arraycopy(bArr, fieldSize + 1, bArr3, 0, fieldSize);
        keyAgreement.doPhase(keyFactoryM9950c.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3)), this.f43676e)), true);
        this.f11538d = new BigInteger(1, keyAgreement.generateSecret());
    }

    @Override // g2.f0
    /* renamed from: b */
    public final void mo6139b(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) this.f11535a;
        keyPairGenerator.initialize(algorithmParameterSpec);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ((KeyAgreement) this.f11536b).init(keyPairGenerateKeyPair.getPrivate());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        this.f43676e = eCPublicKey.getParams();
        this.f11537c = of.m10802a(eCPublicKey.getW(), this.f43676e.getCurve());
    }
}
