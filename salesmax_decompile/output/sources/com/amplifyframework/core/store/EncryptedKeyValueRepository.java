package com.amplifyframework.core.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.google.android.gms.stats.CodePackage;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.UUID;
import p001o.e9g;
import p001o.f9g;
import p001o.gi9;
import p001o.gta;
import p001o.id5;
import p001o.kf9;
import p001o.kge;
import p001o.nl7;
import p001o.si9;
import p001o.sq8;
import p001o.t76;
import p001o.xk7;
import p001o.yz6;

/* loaded from: classes5.dex */
public final class EncryptedKeyValueRepository implements KeyValueRepository {
    public static final Companion Companion = new Companion(null);
    public static final String amplifyIdentifierPrefix = "__amplify__";
    private static final Logger logger;
    private final KeyGenParameterSpec amplifyMasterKeySpec;
    private final Context context;
    private final KeyGenParameterSpec defaultMasterKeySpec;
    private final nl7 fileFactory;
    private final gi9 sharedPreferences$delegate;
    private final String sharedPreferencesName;

    /* renamed from: com.amplifyframework.core.store.EncryptedKeyValueRepository$1 */
    public static final class C105541 extends kf9 implements nl7 {
        public static final C105541 INSTANCE = new C105541();

        public C105541() {
            super(2);
        }

        @Override // p001o.nl7
        public final File invoke(File file, String str) {
            sq8.m48649h(file, "dir");
            sq8.m48649h(str, "fileName");
            return new File(file, str);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* renamed from: getAmplifyIdentifierPrefix$com_amplifyframework_core_release$annotations */
        public static /* synthetic */ void m12101x3c84c713() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyGenParameterSpec getAmplifyMasterKeySpec() {
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("amplify_master_key", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
            sq8.m48648g(keyGenParameterSpecBuild, "build(...)");
            return keyGenParameterSpecBuild;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyGenParameterSpec getDefaultMasterKeySpec() {
            KeyGenParameterSpec keyGenParameterSpec = gta.f25785a;
            sq8.m48648g(keyGenParameterSpec, "AES256_GCM_SPEC");
            return keyGenParameterSpec;
        }
    }

    static {
        LoggingCategory loggingCategory = Amplify.Logging;
        String strMo26337d = kge.m35689b(EncryptedKeyValueRepository.class).mo26337d();
        sq8.m48646e(strMo26337d);
        Logger loggerForNamespace = loggingCategory.forNamespace(strMo26337d);
        sq8.m48648g(loggerForNamespace, "forNamespace(...)");
        logger = loggerForNamespace;
    }

    public EncryptedKeyValueRepository(Context context, String str, KeyGenParameterSpec keyGenParameterSpec, KeyGenParameterSpec keyGenParameterSpec2, nl7 nl7Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "sharedPreferencesName");
        sq8.m48649h(keyGenParameterSpec, "defaultMasterKeySpec");
        sq8.m48649h(keyGenParameterSpec2, "amplifyMasterKeySpec");
        sq8.m48649h(nl7Var, "fileFactory");
        this.context = context;
        this.sharedPreferencesName = str;
        this.defaultMasterKeySpec = keyGenParameterSpec;
        this.amplifyMasterKeySpec = keyGenParameterSpec2;
        this.fileFactory = nl7Var;
        this.sharedPreferences$delegate = si9.m48360a(new EncryptedKeyValueRepository$sharedPreferences$2(this));
    }

    private final String createInstallationIdentifier(File file) {
        String str = amplifyIdentifierPrefix + UUID.randomUUID();
        writeInstallationIdentifier(file, str);
        return str;
    }

    private final void deleteAmplifyMasterKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.amplifyMasterKeySpec.getKeystoreAlias());
    }

    private final boolean deleteSharedPreferences(String str) {
        return this.context.deleteSharedPreferences(str);
    }

    private final void edit(xk7 xk7Var) {
        SharedPreferences.Editor editorEdit = getSharedPreferences$com_amplifyframework_core_release().edit();
        sq8.m48646e(editorEdit);
        xk7Var.invoke(editorEdit);
        editorEdit.apply();
    }

    private final String getExistingInstallationIdentifier(File file) {
        if (!file.exists()) {
            return null;
        }
        String strM58555e = yz6.m58555e(file, null, 1, null);
        if (f9g.d0(strM58555e)) {
            return null;
        }
        return strM58555e;
    }

    private final File getInstallationFile() {
        nl7 nl7Var = this.fileFactory;
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        sq8.m48648g(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return (File) nl7Var.invoke(noBackupFilesDir, this.sharedPreferencesName + ".installationIdentifier");
    }

    private final synchronized String getInstallationIdentifier() {
        String existingInstallationIdentifier;
        File installationFile = getInstallationFile();
        existingInstallationIdentifier = getExistingInstallationIdentifier(installationFile);
        if (existingInstallationIdentifier == null) {
            existingInstallationIdentifier = createInstallationIdentifier(installationFile);
        }
        return existingInstallationIdentifier;
    }

    private final String getMasterKeyOrNull(KeyGenParameterSpec keyGenParameterSpec) {
        int i = 0;
        while (i < 3) {
            try {
                return getMasterKeyOrThrow(keyGenParameterSpec);
            } catch (Exception e) {
                i++;
                logger.warn("Unable to retrieve master key, attempt " + i + " / 3", e);
            }
        }
        return null;
    }

    private final String getMasterKeyOrThrow(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strM29475c = gta.m29475c(keyGenParameterSpec);
        sq8.m48648g(strM29475c, "getOrCreate(...)");
        return strM29475c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getOrCreateSharedPreferences() {
        String installationIdentifier = getInstallationIdentifier();
        return e9g.m24597K(installationIdentifier, amplifyIdentifierPrefix, false, 2, null) ? openKeystoreWithAmplifyMasterKey(installationIdentifier) : openKeystoreWithDefaultMasterKey(installationIdentifier);
    }

    private final SharedPreferences getSharedPreferencesOrNull(String str, String str2) {
        try {
            return getSharedPreferencesOrThrow(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    private final SharedPreferences getSharedPreferencesOrThrow(String str, String str2) {
        SharedPreferences sharedPreferencesM49526a = t76.m49526a(str, str2, this.context, t76.EnumC17014d.AES256_SIV, t76.EnumC17015e.AES256_GCM);
        sq8.m48648g(sharedPreferencesM49526a, "create(...)");
        return sharedPreferencesM49526a;
    }

    private final String getSharedPrefsFileName(String str) {
        return this.sharedPreferencesName + "." + str;
    }

    private final SharedPreferences openKeystoreWithAmplifyMasterKey(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String masterKeyOrNull = getMasterKeyOrNull(this.amplifyMasterKeySpec);
        if (masterKeyOrNull == null) {
            logger.warn("Unable to retrieve Amplify master key. Deleting invalid master key and creating new one");
            deleteAmplifyMasterKey();
            masterKeyOrNull = getMasterKeyOrThrow(this.amplifyMasterKeySpec);
        }
        String sharedPrefsFileName = getSharedPrefsFileName(str);
        SharedPreferences sharedPreferencesOrNull = getSharedPreferencesOrNull(sharedPrefsFileName, masterKeyOrNull);
        if (sharedPreferencesOrNull != null) {
            return sharedPreferencesOrNull;
        }
        logger.warn("Cannot retrieve preferences encrypted with amplify master key. Deleting and recreating.");
        deleteSharedPreferences(sharedPrefsFileName);
        return getSharedPreferencesOrThrow(sharedPrefsFileName, masterKeyOrNull);
    }

    private final SharedPreferences openKeystoreWithDefaultMasterKey(String str) {
        SharedPreferences sharedPreferencesOrNull;
        String masterKeyOrNull = getMasterKeyOrNull(this.defaultMasterKeySpec);
        if (masterKeyOrNull != null && (sharedPreferencesOrNull = getSharedPreferencesOrNull(getSharedPrefsFileName(str), masterKeyOrNull)) != null) {
            return sharedPreferencesOrNull;
        }
        logger.warn("Cannot retrieve preferences encrypted with default master key. Deleting and recreating.");
        deleteSharedPreferences(getSharedPrefsFileName(str));
        return openKeystoreWithAmplifyMasterKey(createInstallationIdentifier(getInstallationFile()));
    }

    private final void writeInstallationIdentifier(File file, String str) {
        try {
            yz6.m58558h(file, str, null, 2, null);
        } catch (Exception unused) {
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(String str) {
        sq8.m48649h(str, "dataKey");
        return getSharedPreferences$com_amplifyframework_core_release().getString(str, null);
    }

    public final SharedPreferences getSharedPreferences$com_amplifyframework_core_release() {
        return (SharedPreferences) this.sharedPreferences$delegate.getValue();
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String str, String str2) {
        sq8.m48649h(str, "dataKey");
        SharedPreferences.Editor editorEdit = getSharedPreferences$com_amplifyframework_core_release().edit();
        sq8.m48646e(editorEdit);
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(String str) {
        sq8.m48649h(str, "dataKey");
        SharedPreferences.Editor editorEdit = getSharedPreferences$com_amplifyframework_core_release().edit();
        sq8.m48646e(editorEdit);
        editorEdit.remove(str);
        editorEdit.apply();
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        SharedPreferences.Editor editorEdit = getSharedPreferences$com_amplifyframework_core_release().edit();
        sq8.m48646e(editorEdit);
        editorEdit.clear();
        editorEdit.apply();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EncryptedKeyValueRepository(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "sharedPreferencesName");
        Companion companion = Companion;
        this(context, str, companion.getDefaultMasterKeySpec(), companion.getAmplifyMasterKeySpec(), C105541.INSTANCE);
    }
}
