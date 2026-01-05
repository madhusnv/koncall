package com.amplifyframework.core.store;

import ai.AbstractC0159p;
import ai.InterfaceC0144a;
import ai.InterfaceC0147d;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import aw.C0465e;
import bi.AbstractC0662a;
import bi.C0665d;
import bi.C0667f;
import bx.AbstractC0801k;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import di.AbstractC1725a;
import di.C1727c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import hi.o0;
import hq.C3012q;
import i0.m0;
import j8.AbstractC3605g;
import j8.EnumC3602d;
import j8.EnumC3603e;
import j8.SharedPreferencesC3604f;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.KeyGenerator;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import nf.C5047i;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.nd;
import p020v.x0;
import qw.InterfaceC6357g;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class EncryptedKeyValueRepository implements KeyValueRepository {
    public static final String AMPLIFY_IDENTIFIER_PREFIX = "__amplify__";
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final KeyGenParameterSpec amplifyMasterKeySpec;
    private final Context context;
    private final KeyGenParameterSpec defaultMasterKeySpec;
    private final InterfaceC2141e fileFactory;
    private final InterfaceC6357g sharedPreferences$delegate;
    private final String sharedPreferencesName;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyGenParameterSpec getAmplifyMasterKeySpec() {
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("amplify_master_key", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
            AbstractC4154l.m8922e(keyGenParameterSpecBuild, "build(...)");
            return keyGenParameterSpecBuild;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyGenParameterSpec getDefaultMasterKeySpec() {
            KeyGenParameterSpec AES256_GCM_SPEC = AbstractC3605g.f19234a;
            AbstractC4154l.m8922e(AES256_GCM_SPEC, "AES256_GCM_SPEC");
            return AES256_GCM_SPEC;
        }

        private Companion() {
        }

        public static /* synthetic */ void getAMPLIFY_IDENTIFIER_PREFIX$core_release$annotations() {
        }
    }

    static {
        LoggingCategory loggingCategory = Amplify.Logging;
        String strM8914c = a0.m8901a(EncryptedKeyValueRepository.class).m8914c();
        AbstractC4154l.m8920c(strM8914c);
        Logger loggerForNamespace = loggingCategory.forNamespace(strM8914c);
        AbstractC4154l.m8922e(loggerForNamespace, "forNamespace(...)");
        logger = loggerForNamespace;
    }

    public EncryptedKeyValueRepository(Context context, String sharedPreferencesName, KeyGenParameterSpec defaultMasterKeySpec, KeyGenParameterSpec amplifyMasterKeySpec, InterfaceC2141e fileFactory) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(sharedPreferencesName, "sharedPreferencesName");
        AbstractC4154l.m8923f(defaultMasterKeySpec, "defaultMasterKeySpec");
        AbstractC4154l.m8923f(amplifyMasterKeySpec, "amplifyMasterKeySpec");
        AbstractC4154l.m8923f(fileFactory, "fileFactory");
        this.context = context;
        this.sharedPreferencesName = sharedPreferencesName;
        this.defaultMasterKeySpec = defaultMasterKeySpec;
        this.amplifyMasterKeySpec = amplifyMasterKeySpec;
        this.fileFactory = fileFactory;
        this.sharedPreferences$delegate = nd.m10782c(new C0465e(27, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File _init_$lambda$0(File dir, String fileName) {
        AbstractC4154l.m8923f(dir, "dir");
        AbstractC4154l.m8923f(fileName, "fileName");
        return new File(dir, fileName);
    }

    private final String createInstallationIdentifier(File file) {
        String str = AMPLIFY_IDENTIFIER_PREFIX + UUID.randomUUID();
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

    private final void edit(InterfaceC2139c interfaceC2139c) {
        SharedPreferences.Editor editorEdit = getSharedPreferences$core_release().edit();
        AbstractC4154l.m8920c(editorEdit);
        interfaceC2139c.invoke(editorEdit);
        editorEdit.apply();
    }

    private final String getExistingInstallationIdentifier(File file) {
        if (!file.exists()) {
            return null;
        }
        String strM2129d = AbstractC0801k.m2129d(file);
        if (AbstractC5178p.m10101L(strM2129d)) {
            return null;
        }
        return strM2129d;
    }

    private final File getInstallationFile() {
        InterfaceC2141e interfaceC2141e = this.fileFactory;
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        AbstractC4154l.m8922e(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return (File) interfaceC2141e.invoke(noBackupFilesDir, this.sharedPreferencesName + ".installationIdentifier");
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
        int i10 = 0;
        while (i10 < 3) {
            try {
                return getMasterKeyOrThrow(keyGenParameterSpec);
            } catch (Exception e2) {
                i10++;
                logger.warn("Unable to retrieve master key, attempt " + i10 + " / 3", e2);
            }
        }
        return null;
    }

    private final String getMasterKeyOrThrow(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenParameterSpec keyGenParameterSpec2 = AbstractC3605g.f19234a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias(keystoreAlias)) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        }
        String keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
        AbstractC4154l.m8922e(keystoreAlias2, "getOrCreate(...)");
        return keystoreAlias2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getOrCreateSharedPreferences() {
        String installationIdentifier = getInstallationIdentifier();
        return AbstractC5185w.m10138t(installationIdentifier, AMPLIFY_IDENTIFIER_PREFIX, false) ? openKeystoreWithAmplifyMasterKey(installationIdentifier) : openKeystoreWithDefaultMasterKey(installationIdentifier);
    }

    private final SharedPreferences getSharedPreferencesOrNull(String str, String str2) {
        try {
            return getSharedPreferencesOrThrow(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    private final SharedPreferences getSharedPreferencesOrThrow(String str, String str2) {
        C5047i c5047iM16461e;
        C5047i c5047iM16461e2;
        Context context = this.context;
        EnumC3602d enumC3602d = EnumC3602d.AES256_SIV;
        EnumC3603e enumC3603e = EnumC3603e.AES256_GCM;
        int i10 = AbstractC1725a.f8369a;
        AbstractC0159p.m369f(new C0667f(o0.class, new C0665d[]{new C0665d(InterfaceC0147d.class, 9)}, 8), true);
        AbstractC0159p.m370g(new C1727c());
        AbstractC0662a.m1933a();
        x0 x0Var = new x0(3);
        x0Var.f36758f = enumC3602d.getKeyTemplate();
        x0Var.m14481R(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        String str3 = "android-keystore://" + str2;
        if (!str3.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        x0Var.f36756d = str3;
        C8986c c8986cM14482j = x0Var.m14482j();
        synchronized (c8986cM14482j) {
            c5047iM16461e = ((C8986c) c8986cM14482j.f43336b).m16461e();
        }
        x0 x0Var2 = new x0(3);
        x0Var2.f36758f = enumC3603e.getKeyTemplate();
        x0Var2.m14481R(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        String str4 = "android-keystore://" + str2;
        if (!str4.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        x0Var2.f36756d = str4;
        C8986c c8986cM14482j2 = x0Var2.m14482j();
        synchronized (c8986cM14482j2) {
            c5047iM16461e2 = ((C8986c) c8986cM14482j2.f43336b).m16461e();
        }
        return new SharedPreferencesC3604f(str, context.getSharedPreferences(str, 0), (InterfaceC0144a) c5047iM16461e2.m9977H(InterfaceC0144a.class), (InterfaceC0147d) c5047iM16461e.m9977H(InterfaceC0147d.class));
    }

    private final String getSharedPrefsFileName(String str) {
        return m0.m7379l(this.sharedPreferencesName, ".", str);
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
            AbstractC0801k.m2131f(file, str);
        } catch (Exception unused) {
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(String dataKey) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        return getSharedPreferences$core_release().getString(dataKey, null);
    }

    public final SharedPreferences getSharedPreferences$core_release() {
        return (SharedPreferences) this.sharedPreferences$delegate.getValue();
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(String dataKey, String str) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        SharedPreferences.Editor editorEdit = getSharedPreferences$core_release().edit();
        AbstractC4154l.m8920c(editorEdit);
        editorEdit.putString(dataKey, str);
        editorEdit.apply();
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(String dataKey) {
        AbstractC4154l.m8923f(dataKey, "dataKey");
        SharedPreferences.Editor editorEdit = getSharedPreferences$core_release().edit();
        AbstractC4154l.m8920c(editorEdit);
        editorEdit.remove(dataKey);
        editorEdit.apply();
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        SharedPreferences.Editor editorEdit = getSharedPreferences$core_release().edit();
        AbstractC4154l.m8920c(editorEdit);
        editorEdit.clear();
        editorEdit.apply();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EncryptedKeyValueRepository(Context context, String sharedPreferencesName) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(sharedPreferencesName, "sharedPreferencesName");
        Companion companion = Companion;
        this(context, sharedPreferencesName, companion.getDefaultMasterKeySpec(), companion.getAmplifyMasterKeySpec(), new C3012q(14));
    }
}
