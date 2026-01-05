package ci;

import ai.InterfaceC0144a;
import ii.AbstractC3274p;
import ii.AbstractC3275q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ci.b */
/* loaded from: classes.dex */
public final class C0974b implements InterfaceC0144a {

    /* renamed from: b */
    public static final C0973a f5787b = new C0973a(0);

    /* renamed from: a */
    public final SecretKeySpec f5788a;

    public C0974b(byte[] bArr) throws InvalidAlgorithmParameterException {
        AbstractC3275q.m7625a(bArr.length);
        this.f5788a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m2754c(int i10, byte[] bArr) throws GeneralSecurityException, ClassNotFoundException {
        try {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                return new GCMParameterSpec(128, bArr, 0, i10);
            } catch (Exception unused) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("android.app.Application", false, null);
            return new IvParameterSpec(bArr, 0, i10);
        }
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: a */
    public final byte[] mo308a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrM7624a = AbstractC3274p.m7624a(12);
        System.arraycopy(bArrM7624a, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecM2754c = m2754c(bArrM7624a.length, bArrM7624a);
        C0973a c0973a = f5787b;
        ((Cipher) c0973a.get()).init(1, this.f5788a, algorithmParameterSpecM2754c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c0973a.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) c0973a.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(AbstractC5601a.m11232c(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: b */
    public final byte[] mo309b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecM2754c = m2754c(12, bArr);
        C0973a c0973a = f5787b;
        ((Cipher) c0973a.get()).init(2, this.f5788a, algorithmParameterSpecM2754c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c0973a.get()).updateAAD(bArr2);
        }
        return ((Cipher) c0973a.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
