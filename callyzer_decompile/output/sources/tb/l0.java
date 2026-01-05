package tb;

import ai.AbstractC0151h;
import ec.C2019q;
import ex.InterfaceC2137a;
import hc.C2878a;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import sd.AbstractC6812f;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 extends AbstractC0151h {

    /* renamed from: b */
    public final InterfaceC2137a f34275b;

    /* renamed from: c */
    public final C2019q f34276c;

    /* JADX WARN: Illegal instructions before constructor call */
    public l0() {
        k0 k0Var = k0.f34274a;
        super(EnumC7093d.SIGV4_ASYMMETRIC, k0Var);
        this.f34275b = k0Var;
        int i10 = C5770a.f28335d;
        this.f34276c = new C2019q(bb.m10551g(1, EnumC5772c.HOURS));
    }

    @Override // tb.o0
    /* renamed from: d */
    public final String mo13375d(String stringToSign, byte[] signingKey) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        AbstractC4154l.m8923f(signingKey, "signingKey");
        AbstractC4154l.m8923f(stringToSign, "stringToSign");
        byte[] bArrM10128j = AbstractC5185w.m10128j(stringToSign);
        C2878a c2878a = new C2878a(signingKey);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        PrivateKey privateKey = keyPairGenerator.generateKeyPair().getPrivate();
        AbstractC4154l.m8921d(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        ECParameterSpec params = ((ECPrivateKey) privateKey).getParams();
        byte[] byteArray = c2878a.f15905a.toByteArray();
        AbstractC4154l.m8922e(byteArray, "toByteArray(...)");
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), params));
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(bArrM10128j);
        byte[] bArrSign = signature.sign();
        AbstractC4154l.m8922e(bArrSign, "sign(...)");
        return AbstractC6812f.m12986a(bArrSign);
    }

    @Override // tb.o0
    /* renamed from: k */
    public final byte[] mo13376k(C7096g c7096g) {
        return (byte[]) tx.c0.m13468D(C7565i.f36440a, new ps.c0(this, c7096g, null, 25));
    }

    @Override // ai.AbstractC0151h
    /* renamed from: z */
    public final InterfaceC2137a mo346z() {
        return this.f34275b;
    }
}
