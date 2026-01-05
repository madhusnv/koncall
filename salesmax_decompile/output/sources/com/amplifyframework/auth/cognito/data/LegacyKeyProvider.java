package com.amplifyframework.auth.cognito.data;

import android.security.keystore.KeyGenParameterSpec;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.google.android.gms.stats.CodePackage;
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
import p001o.sq8;
import p001o.vre;
import p001o.wre;

/* loaded from: classes5.dex */
public final class LegacyKeyProvider {
    private static final String AES_KEY_ALGORITHM = "AES";
    private static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";
    private static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    public static final LegacyKeyProvider INSTANCE = new LegacyKeyProvider();

    private LegacyKeyProvider() {
    }

    public final void deleteKey(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        sq8.m48649h(str, "keyAlias");
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
        keyStore.load(null);
        try {
            keyStore.deleteEntry(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: generateKey-IoAF18A, reason: not valid java name */
    public final Object m68732generateKeyIoAF18A(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        sq8.m48649h(str, "keyAlias");
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
        keyStore.load(null);
        try {
            if (keyStore.containsAlias(str)) {
                vre.C17665a c17665a = vre.f50797b;
                return vre.m53351b(wre.m54933a(new CredentialStoreError("Key already exists for the keyAlias: " + str + " in AndroidKeyStore", null, 2, null)));
            }
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).build();
            sq8.m48648g(keyGenParameterSpecBuild, "build(...)");
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES_KEY_ALGORITHM, ANDROID_KEY_STORE_NAME);
            keyGenerator.init(keyGenParameterSpecBuild);
            vre.C17665a c17665a2 = vre.f50797b;
            return vre.m53351b(keyGenerator.generateKey());
        } catch (Exception unused) {
            vre.C17665a c17665a3 = vre.f50797b;
            return vre.m53351b(wre.m54933a(new CredentialStoreError("Failed to connect to KeyStore", null, 2, null)));
        }
    }

    /* renamed from: retrieveKey-IoAF18A, reason: not valid java name */
    public final Object m68733retrieveKeyIoAF18A(String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        sq8.m48649h(str, "keyAlias");
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE_NAME);
        keyStore.load(null);
        try {
            if (!keyStore.containsAlias(str)) {
                String str2 = "Key does not exists for the keyAlias: " + str + " in AndroidKeyStore";
                vre.C17665a c17665a = vre.f50797b;
                return vre.m53351b(wre.m54933a(new CredentialStoreError(str2, null, 2, null)));
            }
            Key key = keyStore.getKey(str, null);
            if (key != null) {
                return vre.m53351b(key);
            }
            String str3 = "Key is null even though the keyAlias: " + str + " is present in AndroidKeyStore";
            vre.C17665a c17665a2 = vre.f50797b;
            return vre.m53351b(wre.m54933a(new CredentialStoreError(str3, null, 2, null)));
        } catch (Exception unused) {
            vre.C17665a c17665a3 = vre.f50797b;
            return vre.m53351b(wre.m54933a(new CredentialStoreError("Failed to connect to KeyStore", null, 2, null)));
        }
    }
}
