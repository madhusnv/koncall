package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import android.content.SharedPreferences;
import cj.C0978d;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthCredentialStore;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.sun.mail.imap.IMAPStore;
import ex.InterfaceC2137a;
import i0.m0;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.nd;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.C6361k;
import qw.InterfaceC6357g;
import rw.AbstractC6674x;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoLegacyCredentialStore implements AuthCredentialStore {
    private static final String AK_KEY = "accessKey";
    public static final String APP_DEVICE_INFO_CACHE = "CognitoIdentityProviderDeviceCache";
    private static final String APP_LAST_AUTH_USER = "LastAuthUser";
    private static final String APP_LOCAL_CACHE_KEY_PREFIX = "CognitoIdentityProvider";
    public static final String APP_TOKENS_INFO_CACHE = "CognitoIdentityProviderCache";
    public static final String AWS_KEY_VALUE_STORE_NAMESPACE_IDENTIFIER = "com.amazonaws.android.auth";
    public static final String AWS_MOBILE_CLIENT_PROVIDER = "com.amazonaws.mobile.client";
    public static final Companion Companion = new Companion(null);
    private static final String DEVICE_GROUP_KEY = "DeviceGroupKey";
    private static final String DEVICE_KEY = "DeviceKey";
    private static final String DEVICE_SECRET_KEY = "DeviceSecret";
    private static final String EXP_KEY = "expirationDate";
    private static final String ID_KEY = "identityId";
    private static final String LOCAL_STORAGE_DEVICE_ID_KEY = "CognitoDeviceId";
    public static final String LOCAL_STORAGE_PATH = "AWS.Cognito.ContextData";
    public static final String PROVIDER_KEY = "provider";
    public static final String SIGN_IN_MODE_KEY = "signInMode";
    private static final String SK_KEY = "secretKey";
    private static final String ST_KEY = "sessionToken";
    private static final String TOKEN_EXPIRATION = "tokenExpiration";
    public static final String TOKEN_KEY = "token";
    private static final String TOKEN_TYPE_ACCESS = "accessToken";
    private static final String TOKEN_TYPE_ID = "idToken";
    private static final String TOKEN_TYPE_REFRESH = "refreshToken";
    private final AuthConfiguration authConfiguration;
    private final Context context;
    private KeyValueRepository deviceKeyValue;
    private final InterfaceC6357g idAndCredentialsKeyValue$delegate;
    private final KeyValueRepositoryFactory keyValueRepoFactory;
    private final InterfaceC6357g mobileClientKeyValue$delegate;
    private final InterfaceC6357g tokensKeyValue$delegate;
    private final String userDeviceDetailsCacheKey;
    private final String userDeviceDetailsCacheKeyPrefix;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public AWSCognitoLegacyCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepoFactory) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(authConfiguration, "authConfiguration");
        AbstractC4154l.m8923f(keyValueRepoFactory, "keyValueRepoFactory");
        this.context = context;
        this.authConfiguration = authConfiguration;
        this.keyValueRepoFactory = keyValueRepoFactory;
        UserPoolConfiguration userPool = authConfiguration.getUserPool();
        this.userDeviceDetailsCacheKeyPrefix = AbstractC5601a.m11238i("CognitoIdentityProviderDeviceCache.", userPool != null ? userPool.getPoolId() : null, ".");
        UserPoolConfiguration userPool2 = authConfiguration.getUserPool();
        this.userDeviceDetailsCacheKey = AbstractC5601a.m11238i("CognitoIdentityProviderDeviceCache.", userPool2 != null ? userPool2.getPoolId() : null, ".%s");
        final int i10 = 0;
        this.idAndCredentialsKeyValue$delegate = nd.m10782c(new InterfaceC2137a(this) { // from class: ne.a

            /* renamed from: b */
            public final /* synthetic */ AWSCognitoLegacyCredentialStore f24771b;

            {
                this.f24771b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return AWSCognitoLegacyCredentialStore.idAndCredentialsKeyValue_delegate$lambda$0(this.f24771b);
                    case 1:
                        return AWSCognitoLegacyCredentialStore.mobileClientKeyValue_delegate$lambda$1(this.f24771b);
                    default:
                        return AWSCognitoLegacyCredentialStore.tokensKeyValue_delegate$lambda$2(this.f24771b);
                }
            }
        });
        final int i11 = 1;
        this.mobileClientKeyValue$delegate = nd.m10782c(new InterfaceC2137a(this) { // from class: ne.a

            /* renamed from: b */
            public final /* synthetic */ AWSCognitoLegacyCredentialStore f24771b;

            {
                this.f24771b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return AWSCognitoLegacyCredentialStore.idAndCredentialsKeyValue_delegate$lambda$0(this.f24771b);
                    case 1:
                        return AWSCognitoLegacyCredentialStore.mobileClientKeyValue_delegate$lambda$1(this.f24771b);
                    default:
                        return AWSCognitoLegacyCredentialStore.tokensKeyValue_delegate$lambda$2(this.f24771b);
                }
            }
        });
        final int i12 = 2;
        this.tokensKeyValue$delegate = nd.m10782c(new InterfaceC2137a(this) { // from class: ne.a

            /* renamed from: b */
            public final /* synthetic */ AWSCognitoLegacyCredentialStore f24771b;

            {
                this.f24771b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return AWSCognitoLegacyCredentialStore.idAndCredentialsKeyValue_delegate$lambda$0(this.f24771b);
                    case 1:
                        return AWSCognitoLegacyCredentialStore.mobileClientKeyValue_delegate$lambda$1(this.f24771b);
                    default:
                        return AWSCognitoLegacyCredentialStore.tokensKeyValue_delegate$lambda$2(this.f24771b);
                }
            }
        });
    }

    private final void deleteAWSCredentials() {
        KeyValueRepository idAndCredentialsKeyValue = getIdAndCredentialsKeyValue();
        idAndCredentialsKeyValue.remove(namespace(AK_KEY));
        idAndCredentialsKeyValue.remove(namespace(SK_KEY));
        idAndCredentialsKeyValue.remove(namespace(ST_KEY));
        idAndCredentialsKeyValue.remove(namespace(EXP_KEY));
    }

    private final void deleteCognitoUserPoolTokens() {
        Map<String, String> tokenKeys = getTokenKeys();
        String str = tokenKeys.get(TOKEN_TYPE_ID);
        if (str != null) {
            getTokensKeyValue().remove(str);
        }
        String str2 = tokenKeys.get(TOKEN_TYPE_ACCESS);
        if (str2 != null) {
            getTokensKeyValue().remove(str2);
        }
        String str3 = tokenKeys.get(TOKEN_TYPE_REFRESH);
        if (str3 != null) {
            getTokensKeyValue().remove(str3);
        }
        String str4 = tokenKeys.get(TOKEN_EXPIRATION);
        if (str4 != null) {
            getTokensKeyValue().remove(str4);
        }
    }

    private final void deleteIdentityId() {
        getIdAndCredentialsKeyValue().remove(namespace(ID_KEY));
    }

    private final KeyValueRepository getIdAndCredentialsKeyValue() {
        return (KeyValueRepository) this.idAndCredentialsKeyValue$delegate.getValue();
    }

    private final String getIdentityPoolId() {
        IdentityPoolConfiguration identityPool = this.authConfiguration.getIdentityPool();
        if (identityPool != null) {
            return identityPool.getPoolId();
        }
        return null;
    }

    private final KeyValueRepository getMobileClientKeyValue() {
        return (KeyValueRepository) this.mobileClientKeyValue$delegate.getValue();
    }

    private final Map<String, String> getTokenKeys() {
        UserPoolConfiguration userPool = this.authConfiguration.getUserPool();
        String appClient = userPool != null ? userPool.getAppClient() : null;
        Locale locale = Locale.US;
        String str = String.format(locale, "%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, APP_LAST_AUTH_USER}, 3));
        String str2 = getTokensKeyValue().get(str);
        return AbstractC6674x.m12778f(new C6361k(APP_LAST_AUTH_USER, str), new C6361k(TOKEN_TYPE_ID, String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_ID}, 4))), new C6361k(TOKEN_TYPE_ACCESS, String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_ACCESS}, 4))), new C6361k(TOKEN_TYPE_REFRESH, String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_REFRESH}, 4))), new C6361k(TOKEN_EXPIRATION, String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_EXPIRATION}, 4))));
    }

    private final KeyValueRepository getTokensKeyValue() {
        return (KeyValueRepository) this.tokensKeyValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyValueRepository idAndCredentialsKeyValue_delegate$lambda$0(AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore) {
        return aWSCognitoLegacyCredentialStore.keyValueRepoFactory.create(aWSCognitoLegacyCredentialStore.context, AWS_KEY_VALUE_STORE_NAMESPACE_IDENTIFIER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyValueRepository mobileClientKeyValue_delegate$lambda$1(AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore) {
        return aWSCognitoLegacyCredentialStore.keyValueRepoFactory.create(aWSCognitoLegacyCredentialStore.context, AWS_MOBILE_CLIENT_PROVIDER);
    }

    private final String namespace(String str) {
        return m0.m7379l(getIdentityPoolId(), ".", str);
    }

    private final AWSCredentials retrieveAWSCredentials() {
        Long lValueOf;
        Long lM10141w;
        String str = getIdAndCredentialsKeyValue().get(namespace(AK_KEY));
        String str2 = getIdAndCredentialsKeyValue().get(namespace(SK_KEY));
        String str3 = getIdAndCredentialsKeyValue().get(namespace(ST_KEY));
        String str4 = getIdAndCredentialsKeyValue().get(namespace(EXP_KEY));
        if (str4 == null || (lM10141w = AbstractC5185w.m10141w(str4)) == null) {
            lValueOf = null;
        } else {
            long jLongValue = lM10141w.longValue();
            if (Instant.ofEpochSecond(jLongValue).isAfter(Instant.now().mo7820b(365L, ChronoUnit.DAYS))) {
                jLongValue /= IMAPStore.RESPONSE;
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (str == null && str2 == null && str3 == null) {
            return null;
        }
        return new AWSCredentials(str, str2, str3, lValueOf);
    }

    private final CognitoUserPoolTokens retrieveCognitoUserPoolTokens(Map<String, String> map) {
        String str;
        String str2 = map.get(TOKEN_TYPE_ID);
        String str3 = str2 != null ? getTokensKeyValue().get(str2) : null;
        String str4 = map.get(TOKEN_TYPE_ACCESS);
        String str5 = str4 != null ? getTokensKeyValue().get(str4) : null;
        String str6 = map.get(TOKEN_TYPE_REFRESH);
        String str7 = str6 != null ? getTokensKeyValue().get(str6) : null;
        String str8 = map.get(TOKEN_EXPIRATION);
        Long lM10141w = (str8 == null || (str = getTokensKeyValue().get(str8)) == null) ? null : AbstractC5185w.m10141w(str);
        if (str3 == null && str5 == null && str7 == null) {
            return null;
        }
        return new CognitoUserPoolTokens(str3, str5, str7, lM10141w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retrieveDeviceMetadataUsernameList$lambda$15(AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore, String str, File file, String str2) {
        AbstractC4154l.m8920c(str2);
        return AbstractC5185w.m10138t(str2, aWSCognitoLegacyCredentialStore.userDeviceDetailsCacheKeyPrefix, false) && AbstractC5185w.m10129k(str2, str, false);
    }

    private final FederatedToken retrieveFederateToIdentityPoolToken() {
        String str;
        String str2 = getMobileClientKeyValue().get(PROVIDER_KEY);
        if (str2 == null || (str = getMobileClientKeyValue().get(TOKEN_KEY)) == null) {
            return null;
        }
        AuthProvider authProviderAmazon = AuthProvider.amazon();
        AbstractC4154l.m8922e(authProviderAmazon, "amazon(...)");
        String identityProviderName = CodegenExtensionsKt.getIdentityProviderName(authProviderAmazon);
        AuthProvider authProviderFacebook = AuthProvider.facebook();
        AbstractC4154l.m8922e(authProviderFacebook, "facebook(...)");
        String identityProviderName2 = CodegenExtensionsKt.getIdentityProviderName(authProviderFacebook);
        AuthProvider authProviderApple = AuthProvider.apple();
        AbstractC4154l.m8922e(authProviderApple, "apple(...)");
        String identityProviderName3 = CodegenExtensionsKt.getIdentityProviderName(authProviderApple);
        AuthProvider authProviderGoogle = AuthProvider.google();
        AbstractC4154l.m8922e(authProviderGoogle, "google(...)");
        if (pe.m10834i(identityProviderName, identityProviderName2, identityProviderName3, CodegenExtensionsKt.getIdentityProviderName(authProviderGoogle)).contains(str2)) {
            return new FederatedToken(str2, str);
        }
        return null;
    }

    private final String retrieveIdentityId() {
        return getIdAndCredentialsKeyValue().get(namespace(ID_KEY));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.amplifyframework.statemachine.codegen.data.SignedInData retrieveSignedInData() {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.util.Map r1 = r8.getTokenKeys()
            com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens r7 = r8.retrieveCognitoUserPoolTokens(r1)
            r1 = 0
            if (r7 != 0) goto Le
            return r1
        Le:
            com.amplifyframework.statemachine.codegen.data.SignInMethod r6 = r8.retrieveUserPoolSignInMethod()
            if (r6 != 0) goto L15
            return r1
        L15:
            java.lang.String r1 = r7.getAccessToken()     // Catch: java.lang.Exception -> L26
            if (r1 == 0) goto L23
            com.amplifyframework.auth.cognito.helpers.SessionHelper r2 = com.amplifyframework.auth.cognito.helpers.SessionHelper.INSTANCE     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = r2.getUserSub(r1)     // Catch: java.lang.Exception -> L26
            if (r1 != 0) goto L24
        L23:
            r1 = r0
        L24:
            r3 = r1
            goto L27
        L26:
            r3 = r0
        L27:
            java.lang.String r1 = r7.getAccessToken()     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L37
            com.amplifyframework.auth.cognito.helpers.SessionHelper r2 = com.amplifyframework.auth.cognito.helpers.SessionHelper.INSTANCE     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = r2.getUsername(r1)     // Catch: java.lang.Exception -> L37
            if (r1 != 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            r4 = r0
            com.amplifyframework.statemachine.codegen.data.SignedInData r2 = new com.amplifyframework.statemachine.codegen.data.SignedInData
            java.util.Date r5 = new java.util.Date
            r0 = 0
            r5.<init>(r0)
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore.retrieveSignedInData():com.amplifyframework.statemachine.codegen.data.SignedInData");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final SignInMethod retrieveUserPoolSignInMethod() {
        String str = getMobileClientKeyValue().get(SIGN_IN_MODE_KEY);
        if (str != null) {
            String str2 = null;
            Object[] objArr = 0;
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        if (retrieveFederateToIdentityPoolToken() != null) {
                            return null;
                        }
                        return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN);
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return new SignInMethod.HostedUI(str2, 1, (AbstractC4148f) (objArr == true ? 1 : 0));
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return null;
                    }
                    break;
            }
        }
        return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyValueRepository tokensKeyValue_delegate$lambda$2(AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore) {
        return aWSCognitoLegacyCredentialStore.keyValueRepoFactory.create(aWSCognitoLegacyCredentialStore.context, APP_TOKENS_INFO_CACHE);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteASFDevice() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(LOCAL_STORAGE_PATH, 0);
        AbstractC4154l.m8920c(sharedPreferences);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        AbstractC4154l.m8919b(editor, "editor");
        editor.remove(LOCAL_STORAGE_DEVICE_ID_KEY);
        editor.apply();
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteCredential() {
        deleteAWSCredentials();
        deleteIdentityId();
        deleteCognitoUserPoolTokens();
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteDeviceKeyCredential(String username) {
        AbstractC4154l.m8923f(username, "username");
        String str = getTokenKeys().get(APP_LAST_AUTH_USER);
        if (str != null) {
            getTokensKeyValue().remove(str);
        }
        KeyValueRepository keyValueRepository = this.deviceKeyValue;
        if (keyValueRepository == null) {
            AbstractC4154l.m8928k("deviceKeyValue");
            throw null;
        }
        keyValueRepository.remove(DEVICE_KEY);
        keyValueRepository.remove(DEVICE_GROUP_KEY);
        keyValueRepository.remove(DEVICE_SECRET_KEY);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public synchronized AmplifyCredential.ASFDevice retrieveASFDevice() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.context.getSharedPreferences(LOCAL_STORAGE_PATH, 0);
        } catch (Throwable th2) {
            throw th2;
        }
        return new AmplifyCredential.ASFDevice(sharedPreferences != null ? sharedPreferences.getString(LOCAL_STORAGE_DEVICE_ID_KEY, null) : null);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public synchronized AmplifyCredential retrieveCredential() {
        AmplifyCredential userPool;
        try {
            SignedInData signedInDataRetrieveSignedInData = retrieveSignedInData();
            AWSCredentials aWSCredentialsRetrieveAWSCredentials = retrieveAWSCredentials();
            String strRetrieveIdentityId = retrieveIdentityId();
            if (aWSCredentialsRetrieveAWSCredentials == null || strRetrieveIdentityId == null) {
                userPool = signedInDataRetrieveSignedInData != null ? new AmplifyCredential.UserPool(signedInDataRetrieveSignedInData) : AmplifyCredential.Empty.INSTANCE;
            } else {
                FederatedToken federatedTokenRetrieveFederateToIdentityPoolToken = retrieveFederateToIdentityPoolToken();
                userPool = signedInDataRetrieveSignedInData != null ? new AmplifyCredential.UserAndIdentityPool(signedInDataRetrieveSignedInData, strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials) : federatedTokenRetrieveFederateToIdentityPoolToken != null ? new AmplifyCredential.IdentityPoolFederated(federatedTokenRetrieveFederateToIdentityPoolToken, strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials) : new AmplifyCredential.IdentityPool(strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return userPool;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:5:0x0022, B:7:0x002c, B:9:0x0036, B:11:0x003e, B:20:0x0050, B:25:0x005a, B:17:0x0049, B:26:0x005e, B:29:0x0062, B:30:0x0067, B:31:0x0068, B:32:0x006d, B:33:0x006e, B:34:0x0073), top: B:37:0x0001 }] */
    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.amplifyframework.statemachine.codegen.data.DeviceMetadata retrieveDeviceMetadata(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "username"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r4, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r3.userDeviceDetailsCacheKey     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L45
            r1 = 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = java.lang.String.format(r0, r4)     // Catch: java.lang.Throwable -> L45
            com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory r0 = r3.keyValueRepoFactory     // Catch: java.lang.Throwable -> L45
            android.content.Context r1 = r3.context     // Catch: java.lang.Throwable -> L45
            com.amplifyframework.core.store.KeyValueRepository r4 = r0.create(r1, r4)     // Catch: java.lang.Throwable -> L45
            r3.deviceKeyValue = r4     // Catch: java.lang.Throwable -> L45
            r0 = 0
            if (r4 == 0) goto L6e
            java.lang.String r1 = "DeviceKey"
            java.lang.String r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L45
            com.amplifyframework.core.store.KeyValueRepository r1 = r3.deviceKeyValue     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L68
            java.lang.String r2 = "DeviceGroupKey"
            java.lang.String r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L45
            com.amplifyframework.core.store.KeyValueRepository r2 = r3.deviceKeyValue     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L62
            java.lang.String r0 = "DeviceSecret"
            java.lang.String r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L47
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L50
            goto L47
        L45:
            r4 = move-exception
            goto L74
        L47:
            if (r1 == 0) goto L5e
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L50
            goto L5e
        L50:
            com.amplifyframework.statemachine.codegen.data.DeviceMetadata$Metadata r2 = new com.amplifyframework.statemachine.codegen.data.DeviceMetadata$Metadata     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L56
            java.lang.String r4 = ""
        L56:
            if (r1 != 0) goto L5a
            java.lang.String r1 = ""
        L5a:
            r2.<init>(r4, r1, r0)     // Catch: java.lang.Throwable -> L45
            goto L60
        L5e:
            com.amplifyframework.statemachine.codegen.data.DeviceMetadata$Empty r2 = com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Empty.INSTANCE     // Catch: java.lang.Throwable -> L45
        L60:
            monitor-exit(r3)
            return r2
        L62:
            java.lang.String r4 = "deviceKeyValue"
            kotlin.jvm.internal.AbstractC4154l.m8928k(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L68:
            java.lang.String r4 = "deviceKeyValue"
            kotlin.jvm.internal.AbstractC4154l.m8928k(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L6e:
            java.lang.String r4 = "deviceKeyValue"
            kotlin.jvm.internal.AbstractC4154l.m8928k(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L74:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L45
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore.retrieveDeviceMetadata(java.lang.String):com.amplifyframework.statemachine.codegen.data.DeviceMetadata");
    }

    public final List<String> retrieveDeviceMetadataUsernameList() {
        try {
            File[] fileArrListFiles = new File(this.context.getDataDir(), "shared_prefs").listFiles(new C0978d(1, this));
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                int i10 = 0;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    AbstractC4154l.m8922e(name, "getName(...)");
                    String strA0 = AbstractC5178p.a0(name, this.userDeviceDetailsCacheKeyPrefix);
                    arrayList.add(AbstractC5178p.c0(strA0, ".xml", strA0));
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (!AbstractC5178p.m10101L((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        } catch (Exception unused) {
        }
        return C6668r.f31943a;
    }

    public final synchronized String retrieveLastAuthUserId() {
        String str;
        str = getTokenKeys().get(APP_LAST_AUTH_USER);
        return str != null ? getTokensKeyValue().get(str) : null;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveASFDevice(AmplifyCredential.ASFDevice device) {
        AbstractC4154l.m8923f(device, "device");
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveCredential(AmplifyCredential credential) {
        AbstractC4154l.m8923f(credential, "credential");
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveDeviceMetadata(String username, DeviceMetadata deviceMetadata) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
    }

    public /* synthetic */ AWSCognitoLegacyCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepositoryFactory, int i10, AbstractC4148f abstractC4148f) {
        this(context, authConfiguration, (i10 & 4) != 0 ? new KeyValueRepositoryFactory() : keyValueRepositoryFactory);
    }
}
