package ei;

import android.security.keystore.KeyGenParameterSpec;
import bi.C0663b;
import ii.AbstractC3274p;
import ii.AbstractC3275q;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ei.a */
/* loaded from: classes.dex */
public final class C2055a {

    /* renamed from: a */
    public KeyStore f9640a;

    public C2055a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f9640a = keyStore;
        } catch (IOException | GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: a */
    public static void m5778a(String str) {
        if (new C2055a().m5780c(str)) {
            throw new IllegalArgumentException(AbstractC5601a.m11238i("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
        }
        String strM7626b = AbstractC3275q.m7626b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strM7626b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* renamed from: b */
    public final synchronized C0663b m5779b(String str) {
        C0663b c0663b;
        c0663b = new C0663b(AbstractC3275q.m7626b(str), this.f9640a);
        byte[] bArrM7624a = AbstractC3274p.m7624a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrM7624a, c0663b.mo309b(c0663b.mo308a(bArrM7624a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c0663b;
    }

    /* renamed from: c */
    public final synchronized boolean m5780c(String str) {
        String strM7626b;
        strM7626b = AbstractC3275q.m7626b(str);
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f9640a = keyStore;
                keyStore.load(null);
            } catch (IOException e2) {
                throw new GeneralSecurityException(e2);
            } catch (InterruptedException unused2) {
            }
            return this.f9640a.containsAlias(strM7626b);
        }
        return this.f9640a.containsAlias(strM7626b);
    }
}
