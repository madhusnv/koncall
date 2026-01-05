package com.amplifyframework.auth.cognito.data;

import android.security.keystore.KeyGenParameterSpec;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class LegacyKeyProvider {
    private static final String AES_KEY_ALGORITHM = "AES";
    private static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";
    private static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    public static final LegacyKeyProvider INSTANCE = new LegacyKeyProvider();

    private LegacyKeyProvider() {
    }

    public final void deleteKey(String keyAlias) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        AbstractC4154l.m8923f(keyAlias, "keyAlias");
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
        keyStore.load(null);
        try {
            keyStore.deleteEntry(keyAlias);
        } catch (Exception unused) {
        }
    }

    /* renamed from: generateKey-IoAF18A, reason: not valid java name */
    public final Object m16561generateKeyIoAF18A(String keyAlias) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AbstractC4154l.m8923f(keyAlias, "keyAlias");
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
        keyStore.load(null);
        try {
            if (keyStore.containsAlias(keyAlias)) {
                return od.m10796a(new CredentialStoreError("Key already exists for the keyAlias: " + keyAlias + " in AndroidKeyStore", null, 2, null));
            }
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(keyAlias, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).build();
            AbstractC4154l.m8922e(keyGenParameterSpecBuild, "build(...)");
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES_KEY_ALGORITHM, ANDROID_KEY_STORE_NAME);
            keyGenerator.init(keyGenParameterSpecBuild);
            return keyGenerator.generateKey();
        } catch (Exception unused) {
            return od.m10796a(new CredentialStoreError("Failed to connect to KeyStore", null, 2, null));
        }
    }

    /* renamed from: retrieveKey-IoAF18A, reason: not valid java name */
    public final Object m16562retrieveKeyIoAF18A(String keyAlias) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        AbstractC4154l.m8923f(keyAlias, "keyAlias");
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
        keyStore.load(null);
        try {
            if (keyStore.containsAlias(keyAlias)) {
                Key key = keyStore.getKey(keyAlias, null);
                return key != null ? key : od.m10796a(new CredentialStoreError(AbstractC5601a.m11238i("Key is null even though the keyAlias: ", keyAlias, " is present in AndroidKeyStore"), null, 2, null));
            }
            return od.m10796a(new CredentialStoreError("Key does not exists for the keyAlias: " + keyAlias + " in AndroidKeyStore", null, 2, null));
        } catch (Exception unused) {
            return od.m10796a(new CredentialStoreError("Failed to connect to KeyStore", null, 2, null));
        }
    }
}
