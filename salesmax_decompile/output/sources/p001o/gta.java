package p001o;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes2.dex */
public abstract class gta {

    /* renamed from: a */
    public static final KeyGenParameterSpec f25785a = m29473a("_androidx_security_master_key_");

    /* renamed from: a */
    public static KeyGenParameterSpec m29473a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }

    /* renamed from: b */
    public static void m29474b(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpec);
        keyGenerator.generateKey();
    }

    /* renamed from: c */
    public static String m29475c(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        m29477e(keyGenParameterSpec);
        if (!m29476d(keyGenParameterSpec.getKeystoreAlias())) {
            m29474b(keyGenParameterSpec);
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* renamed from: d */
    public static boolean m29476d(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    /* renamed from: e */
    public static void m29477e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{CodePackage.GCM})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        } else {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
    }
}
