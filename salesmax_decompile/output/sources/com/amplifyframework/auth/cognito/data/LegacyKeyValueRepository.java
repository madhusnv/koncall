package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import p001o.id5;
import p001o.sq8;
import p001o.vre;
import p001o.wre;

/* loaded from: classes5.dex */
public final class LegacyKeyValueRepository implements KeyValueRepository {
    private static final int AWS_KEY_VALUE_STORE_VERSION = 1;
    private static final String AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX = ".aesKeyStoreAlias";
    private static final String CHARSET_NAME = "UTF-8";
    private static final String CIPHER_AES_GCM_NOPADDING = "AES/GCM/NoPadding";
    private static final int CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES = 12;
    private static final int CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS = 128;
    public static final Companion Companion = new Companion(null);
    private static final String SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX = ".encrypted";
    private static final String SHARED_PREFERENCES_IV_SUFFIX = ".iv";
    private static final String SHARED_PREFERENCES_STORE_VERSION_SUFFIX = ".keyvaluestoreversion";
    private final Map<String, String> cache;
    private final Map<String, Map<String, String>> cacheFactory;
    private boolean isPersistenceEnabled;
    private final SecureRandom secureRandom;
    private SharedPreferences sharedPreferencesForData;
    private final String sharedPreferencesName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public LegacyKeyValueRepository(Context context, String str, boolean z) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "sharedPreferencesName");
        this.sharedPreferencesName = str;
        this.isPersistenceEnabled = z;
        this.secureRandom = new SecureRandom();
        this.cacheFactory = new LinkedHashMap();
        this.cache = getCacheForKey(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        sq8.m48648g(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferencesForData = sharedPreferences;
    }

    private final String decrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            sq8.m48648g(bArrDecode, "decode(...)");
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(2, key, algorithmParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArrDecode);
            sq8.m48646e(bArrDoFinal);
            Charset charsetForName = Charset.forName("UTF-8");
            sq8.m48648g(charsetForName, "forName(...)");
            return new String(bArrDoFinal, charsetForName);
        } catch (Exception unused) {
            return null;
        }
    }

    private final String encrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(1, key, algorithmParameterSpec);
            Charset charsetForName = Charset.forName("UTF-8");
            sq8.m48648g(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            sq8.m48648g(bytes, "getBytes(...)");
            return Base64.encodeToString(cipher.doFinal(bytes), 0);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: generateEncryptionKey-IoAF18A, reason: not valid java name */
    private final synchronized Object m68734generateEncryptionKeyIoAF18A(String str) {
        return LegacyKeyProvider.INSTANCE.m68732generateKeyIoAF18A(str);
    }

    private final byte[] generateInitializationVector() {
        byte[] bArr = new byte[12];
        this.secureRandom.nextBytes(bArr);
        return bArr;
    }

    private final Map<String, String> getCacheForKey(String str) {
        Map<String, Map<String, String>> map = this.cacheFactory;
        Map<String, String> linkedHashMap = map.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(str, linkedHashMap);
        }
        return linkedHashMap;
    }

    private final String getDataKeyUsedInPersistentStore(String str) {
        return str + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
    }

    private final String getEncryptionKeyAlias() {
        return this.sharedPreferencesName + AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX;
    }

    private final AlgorithmParameterSpec getInitializationVector(String str) throws Exception {
        String str2 = str + SHARED_PREFERENCES_IV_SUFFIX;
        if (!this.sharedPreferencesForData.contains(str2)) {
            throw new Exception("Initialization vector for " + str + " is missing from the SharedPreferences.");
        }
        String string = this.sharedPreferencesForData.getString(str2, null);
        if (string == null) {
            throw new Exception("Cannot read the initialization vector for " + str + " from SharedPreferences.");
        }
        byte[] bArrDecode = Base64.decode(string, 0);
        sq8.m48648g(bArrDecode, "decode(...)");
        if (!(bArrDecode.length == 0)) {
            return new GCMParameterSpec(128, bArrDecode);
        }
        throw new Exception("Cannot base64 decode the initialization vector for " + str + " read from SharedPreferences.");
    }

    /* renamed from: retrieveEncryptionKey-IoAF18A, reason: not valid java name */
    private final synchronized Object m68735retrieveEncryptionKeyIoAF18A(String str) {
        Object objM68733retrieveKeyIoAF18A;
        LegacyKeyProvider legacyKeyProvider = LegacyKeyProvider.INSTANCE;
        objM68733retrieveKeyIoAF18A = legacyKeyProvider.m68733retrieveKeyIoAF18A(str);
        if (vre.m53354e(objM68733retrieveKeyIoAF18A) != null) {
            legacyKeyProvider.deleteKey(str);
            vre.m53351b(wre.m54933a(new CredentialStoreError("Key cannot be retrieved. Deleting the encryption key identified by the keyAlias: " + str, null, 2, null)));
        }
        return objM68733retrieveKeyIoAF18A;
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public synchronized String get(String str) {
        Integer numValueOf;
        sq8.m48649h(str, "dataKey");
        if (!this.isPersistenceEnabled) {
            return this.cache.get(str);
        }
        String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
        Object objM68735retrieveEncryptionKeyIoAF18A = m68735retrieveEncryptionKeyIoAF18A(getEncryptionKeyAlias());
        String str2 = null;
        if (vre.m53354e(objM68735retrieveEncryptionKeyIoAF18A) != null) {
            return null;
        }
        if (!this.sharedPreferencesForData.contains(dataKeyUsedInPersistentStore)) {
            return null;
        }
        try {
            String string = this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, "-1");
            numValueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        } catch (Exception unused) {
            remove(str);
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            String string2 = this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore, null);
            wre.m54934b(objM68735retrieveEncryptionKeyIoAF18A);
            String strDecrypt = decrypt((Key) objM68735retrieveEncryptionKeyIoAF18A, getInitializationVector(dataKeyUsedInPersistentStore), string2);
            if (strDecrypt != null) {
                this.cache.put(str, strDecrypt);
                str2 = strDecrypt;
            }
            return str2;
        }
        return null;
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String str, String str2) throws Exception {
        sq8.m48649h(str, "dataKey");
        if (str2 != null) {
            this.cache.put(str, str2);
        }
        if (this.isPersistenceEnabled) {
            if (str2 == null) {
                remove(str);
                return;
            }
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            String encryptionKeyAlias = getEncryptionKeyAlias();
            Object objM68735retrieveEncryptionKeyIoAF18A = m68735retrieveEncryptionKeyIoAF18A(encryptionKeyAlias);
            if (vre.m53354e(objM68735retrieveEncryptionKeyIoAF18A) != null) {
                m68734generateEncryptionKeyIoAF18A(encryptionKeyAlias);
            }
            if (vre.m53354e(objM68735retrieveEncryptionKeyIoAF18A) != null) {
                return;
            }
            try {
                byte[] bArrGenerateInitializationVector = generateInitializationVector();
                wre.m54934b(objM68735retrieveEncryptionKeyIoAF18A);
                String strEncrypt = encrypt((Key) objM68735retrieveEncryptionKeyIoAF18A, new GCMParameterSpec(128, bArrGenerateInitializationVector), str2);
                String strEncodeToString = Base64.encodeToString(bArrGenerateInitializationVector, 0);
                if (strEncodeToString == null) {
                    throw new Exception("Error in Base64 encoding the IV for dataKey = " + str);
                }
                this.sharedPreferencesForData.edit().putString(dataKeyUsedInPersistentStore, strEncrypt).putString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX, strEncodeToString).putInt(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, 1).apply();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public synchronized void remove(String str) {
        sq8.m48649h(str, "dataKey");
        this.cache.remove(str);
        if (this.isPersistenceEnabled) {
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            this.sharedPreferencesForData.edit().remove(dataKeyUsedInPersistentStore).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX).apply();
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        KeyValueRepository.DefaultImpls.removeAll(this);
    }

    public /* synthetic */ LegacyKeyValueRepository(Context context, String str, boolean z, int i, id5 id5Var) {
        this(context, str, (i & 4) != 0 ? true : z);
    }
}
