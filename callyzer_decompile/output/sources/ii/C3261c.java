package ii;

import ai.InterfaceC0144a;
import ci.C0973a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.c */
/* loaded from: classes.dex */
public final class C3261c implements InterfaceC0144a {

    /* renamed from: b */
    public static final C0973a f17445b = new C0973a(5);

    /* renamed from: a */
    public final SecretKeySpec f17446a;

    public C3261c(byte[] bArr) throws InvalidAlgorithmParameterException {
        AbstractC3275q.m7625a(bArr.length);
        this.f17446a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    public static AlgorithmParameterSpec m7607c(int i10, byte[] bArr) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        int i11;
        try {
            Class.forName("android.app.Application", false, null);
            try {
                i11 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                i11 = -1;
            }
            if (i11 <= 19) {
                return new IvParameterSpec(bArr, 0, i10);
            }
        } catch (Exception unused2) {
        }
        return new GCMParameterSpec(128, bArr, 0, i10);
    }

    @Override // ai.InterfaceC0144a
    /* renamed from: a */
    public final byte[] mo308a(byte[] bArr, byte[] bArr2) throws IllegalAccessException, GeneralSecurityException, ClassNotFoundException, IllegalArgumentException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrM7624a = AbstractC3274p.m7624a(12);
        System.arraycopy(bArrM7624a, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecM7607c = m7607c(bArrM7624a.length, bArrM7624a);
        C0973a c0973a = f17445b;
        ((Cipher) c0973a.get()).init(1, this.f17446a, algorithmParameterSpecM7607c);
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
    public final byte[] mo309b(byte[] bArr, byte[] bArr2) throws IllegalAccessException, GeneralSecurityException, ClassNotFoundException, IllegalArgumentException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecM7607c = m7607c(12, bArr);
        C0973a c0973a = f17445b;
        ((Cipher) c0973a.get()).init(2, this.f17446a, algorithmParameterSpecM7607c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c0973a.get()).updateAAD(bArr2);
        }
        return ((Cipher) c0973a.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
