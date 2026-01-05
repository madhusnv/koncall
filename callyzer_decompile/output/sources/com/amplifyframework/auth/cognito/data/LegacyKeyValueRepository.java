package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.sun.mail.util.AbstractC1452a;
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
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.C6364n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public LegacyKeyValueRepository(Context context, String sharedPreferencesName, boolean z6) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(sharedPreferencesName, "sharedPreferencesName");
        this.sharedPreferencesName = sharedPreferencesName;
        this.isPersistenceEnabled = z6;
        this.secureRandom = new SecureRandom();
        this.cacheFactory = new LinkedHashMap();
        this.cache = getCacheForKey(sharedPreferencesName);
        SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
        AbstractC4154l.m8922e(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferencesForData = sharedPreferences;
    }

    private final String decrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            AbstractC4154l.m8922e(bArrDecode, "decode(...)");
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(2, key, algorithmParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArrDecode);
            AbstractC4154l.m8920c(bArrDoFinal);
            Charset charsetForName = Charset.forName(CHARSET_NAME);
            AbstractC4154l.m8922e(charsetForName, "forName(...)");
            return new String(bArrDoFinal, charsetForName);
        } catch (Exception unused) {
            return null;
        }
    }

    private final String encrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(1, key, algorithmParameterSpec);
            Charset charsetForName = Charset.forName(CHARSET_NAME);
            AbstractC4154l.m8922e(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            AbstractC4154l.m8922e(bytes, "getBytes(...)");
            return Base64.encodeToString(cipher.doFinal(bytes), 0);
        } catch (Exception e2) {
            e2.toString();
            return null;
        }
    }

    /* renamed from: generateEncryptionKey-IoAF18A, reason: not valid java name */
    private final synchronized Object m16563generateEncryptionKeyIoAF18A(String str) {
        return LegacyKeyProvider.INSTANCE.m16561generateKeyIoAF18A(str);
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
        return AbstractC1452a.m4561h(str, SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX);
    }

    private final String getEncryptionKeyAlias() {
        return AbstractC1452a.m4561h(this.sharedPreferencesName, AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX);
    }

    private final AlgorithmParameterSpec getInitializationVector(String str) throws Exception {
        String strM4561h = AbstractC1452a.m4561h(str, SHARED_PREFERENCES_IV_SUFFIX);
        if (!this.sharedPreferencesForData.contains(strM4561h)) {
            throw new Exception(AbstractC5601a.m11238i("Initialization vector for ", str, " is missing from the SharedPreferences."));
        }
        String string = this.sharedPreferencesForData.getString(strM4561h, null);
        if (string == null) {
            throw new Exception(AbstractC5601a.m11238i("Cannot read the initialization vector for ", str, " from SharedPreferences."));
        }
        byte[] bArrDecode = Base64.decode(string, 0);
        AbstractC4154l.m8922e(bArrDecode, "decode(...)");
        if (bArrDecode.length != 0) {
            return new GCMParameterSpec(128, bArrDecode);
        }
        throw new Exception(AbstractC5601a.m11238i("Cannot base64 decode the initialization vector for ", str, " read from SharedPreferences."));
    }

    /* renamed from: retrieveEncryptionKey-IoAF18A, reason: not valid java name */
    private final synchronized Object m16564retrieveEncryptionKeyIoAF18A(String str) {
        Object objM16562retrieveKeyIoAF18A;
        LegacyKeyProvider legacyKeyProvider = LegacyKeyProvider.INSTANCE;
        objM16562retrieveKeyIoAF18A = legacyKeyProvider.m16562retrieveKeyIoAF18A(str);
        if (C6364n.m12363a(objM16562retrieveKeyIoAF18A) != null) {
            legacyKeyProvider.deleteKey(str);
            od.m10796a(new CredentialStoreError("Key cannot be retrieved. Deleting the encryption key identified by the keyAlias: " + str, null, 2, null));
        }
        return objM16562retrieveKeyIoAF18A;
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public synchronized String get(String dataKey) {
        Integer numValueOf;
        AbstractC4154l.m8923f(dataKey, "dataKey");
        if (!this.isPersistenceEnabled) {
            return this.cache.get(dataKey);
        }
        String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(dataKey);
        Object objM16564retrieveEncryptionKeyIoAF18A = m16564retrieveEncryptionKeyIoAF18A(getEncryptionKeyAlias());
        String str = null;
        if (C6364n.m12363a(objM16564retrieveEncryptionKeyIoAF18A) != null) {
            return null;
        }
        if (!this.sharedPreferencesForData.contains(dataKeyUsedInPersistentStore)) {
            return null;
        }
        try {
            String string = this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, "-1");
            numValueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        } catch (Exception unused) {
            remove(dataKey);
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            String string2 = this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore, null);
            od.m10798c(objM16564retrieveEncryptionKeyIoAF18A);
            String strDecrypt = decrypt((Key) objM16564retrieveEncryptionKeyIoAF18A, getInitializationVector(dataKeyUsedInPersistentStore), string2);
            if (strDecrypt != null) {
                this.cache.put(dataKey, strDecrypt);
                str = strDecrypt;
            }
            return str;
        }
        return null;
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String dataKey, String str) throws Exception {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        if (str != null) {
            this.cache.put(dataKey, str);
        }
        if (this.isPersistenceEnabled) {
            if (str == null) {
                remove(dataKey);
                return;
            }
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(dataKey);
            String encryptionKeyAlias = getEncryptionKeyAlias();
            Object objM16564retrieveEncryptionKeyIoAF18A = m16564retrieveEncryptionKeyIoAF18A(encryptionKeyAlias);
            if (C6364n.m12363a(objM16564retrieveEncryptionKeyIoAF18A) != null) {
                m16563generateEncryptionKeyIoAF18A(encryptionKeyAlias);
            }
            if (C6364n.m12363a(objM16564retrieveEncryptionKeyIoAF18A) != null) {
                return;
            }
            try {
                byte[] bArrGenerateInitializationVector = generateInitializationVector();
                od.m10798c(objM16564retrieveEncryptionKeyIoAF18A);
                String strEncrypt = encrypt((Key) objM16564retrieveEncryptionKeyIoAF18A, new GCMParameterSpec(128, bArrGenerateInitializationVector), str);
                String strEncodeToString = Base64.encodeToString(bArrGenerateInitializationVector, 0);
                if (strEncodeToString == null) {
                    throw new Exception("Error in Base64 encoding the IV for dataKey = ".concat(dataKey));
                }
                SharedPreferences.Editor editor = this.sharedPreferencesForData.edit();
                AbstractC4154l.m8919b(editor, "editor");
                editor.putString(dataKeyUsedInPersistentStore, strEncrypt).putString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX, strEncodeToString).putInt(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, 1);
                editor.apply();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public synchronized void remove(String dataKey) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        this.cache.remove(dataKey);
        if (this.isPersistenceEnabled) {
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(dataKey);
            SharedPreferences.Editor editor = this.sharedPreferencesForData.edit();
            AbstractC4154l.m8919b(editor, "editor");
            editor.remove(dataKeyUsedInPersistentStore).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX);
            editor.apply();
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        super.removeAll();
    }

    public /* synthetic */ LegacyKeyValueRepository(Context context, String str, boolean z6, int i10, AbstractC4148f abstractC4148f) {
        this(context, str, (i10 & 4) != 0 ? true : z6);
    }
}
