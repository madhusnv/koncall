package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes4.dex */
public final class re0 implements p70 {

    /* renamed from: a */
    public final SecretKey f43427a;

    public re0(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f43427a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    /* renamed from: e */
    public static void m46573e() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // p001o.p70
    /* renamed from: a */
    public byte[] mo24514a(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return m46575d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            m46573e();
            return m46575d(bArr, bArr2);
        }
    }

    @Override // p001o.p70
    /* renamed from: b */
    public byte[] mo24515b(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return m46574c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            m46573e();
            return m46574c(bArr, bArr2);
        }
    }

    /* renamed from: c */
    public final byte[] m46574c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f43427a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    /* renamed from: d */
    public final byte[] m46575d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f43427a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
