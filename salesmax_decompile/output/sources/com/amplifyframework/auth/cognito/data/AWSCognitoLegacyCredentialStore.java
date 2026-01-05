package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
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
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p001o.ch3;
import p001o.d9g;
import p001o.e9g;
import p001o.f9g;
import p001o.gi9;
import p001o.h8g;
import p001o.id5;
import p001o.isa;
import p001o.si9;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes5.dex */
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
    private final gi9 idAndCredentialsKeyValue$delegate;
    private final KeyValueRepositoryFactory keyValueRepoFactory;
    private final gi9 mobileClientKeyValue$delegate;
    private final gi9 tokensKeyValue$delegate;
    private final String userDeviceDetailsCacheKey;
    private final String userDeviceDetailsCacheKeyPrefix;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public AWSCognitoLegacyCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepositoryFactory) {
        sq8.m48649h(context, "context");
        sq8.m48649h(authConfiguration, "authConfiguration");
        sq8.m48649h(keyValueRepositoryFactory, "keyValueRepoFactory");
        this.context = context;
        this.authConfiguration = authConfiguration;
        this.keyValueRepoFactory = keyValueRepositoryFactory;
        UserPoolConfiguration userPool = authConfiguration.getUserPool();
        this.userDeviceDetailsCacheKeyPrefix = "CognitoIdentityProviderDeviceCache." + (userPool != null ? userPool.getPoolId() : null) + ".";
        UserPoolConfiguration userPool2 = authConfiguration.getUserPool();
        this.userDeviceDetailsCacheKey = "CognitoIdentityProviderDeviceCache." + (userPool2 != null ? userPool2.getPoolId() : null) + ".%s";
        this.idAndCredentialsKeyValue$delegate = si9.m48360a(new AWSCognitoLegacyCredentialStore$idAndCredentialsKeyValue$2(this));
        this.mobileClientKeyValue$delegate = si9.m48360a(new AWSCognitoLegacyCredentialStore$mobileClientKeyValue$2(this));
        this.tokensKeyValue$delegate = si9.m48360a(new AWSCognitoLegacyCredentialStore$tokensKeyValue$2(this));
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
        h8g h8gVar = h8g.f26398a;
        Locale locale = Locale.US;
        String str = String.format(locale, "%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, APP_LAST_AUTH_USER}, 3));
        sq8.m48648g(str, "format(...)");
        String str2 = getTokensKeyValue().get(str);
        String str3 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_ID}, 4));
        sq8.m48648g(str3, "format(...)");
        String str4 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_ACCESS}, 4));
        sq8.m48648g(str4, "format(...)");
        String str5 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_REFRESH}, 4));
        sq8.m48648g(str5, "format(...)");
        String str6 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_EXPIRATION}, 4));
        sq8.m48648g(str6, "format(...)");
        return isa.m32684k(vyh.m53620a(APP_LAST_AUTH_USER, str), vyh.m53620a(TOKEN_TYPE_ID, str3), vyh.m53620a(TOKEN_TYPE_ACCESS, str4), vyh.m53620a(TOKEN_TYPE_REFRESH, str5), vyh.m53620a(TOKEN_EXPIRATION, str6));
    }

    private final KeyValueRepository getTokensKeyValue() {
        return (KeyValueRepository) this.tokensKeyValue$delegate.getValue();
    }

    private final String namespace(String str) {
        return getIdentityPoolId() + "." + str;
    }

    private final AWSCredentials retrieveAWSCredentials() {
        Long lValueOf;
        Long lM22640n;
        String str = getIdAndCredentialsKeyValue().get(namespace(AK_KEY));
        String str2 = getIdAndCredentialsKeyValue().get(namespace(SK_KEY));
        String str3 = getIdAndCredentialsKeyValue().get(namespace(ST_KEY));
        String str4 = getIdAndCredentialsKeyValue().get(namespace(EXP_KEY));
        if (str4 == null || (lM22640n = d9g.m22640n(str4)) == null) {
            lValueOf = null;
        } else {
            long jLongValue = lM22640n.longValue();
            if (Instant.ofEpochSecond(jLongValue).isAfter(Instant.now().plus(365L, (TemporalUnit) ChronoUnit.DAYS))) {
                jLongValue /= 1000;
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
        Long lM22640n = (str8 == null || (str = getTokensKeyValue().get(str8)) == null) ? null : d9g.m22640n(str);
        if (str3 == null && str5 == null && str7 == null) {
            return null;
        }
        return new CognitoUserPoolTokens(str3, str5, str7, lM22640n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retrieveDeviceMetadataUsernameList$lambda$11(AWSCognitoLegacyCredentialStore aWSCognitoLegacyCredentialStore, String str, File file, String str2) {
        sq8.m48649h(aWSCognitoLegacyCredentialStore, "this$0");
        sq8.m48649h(str, "$sharedPrefsSuffix");
        sq8.m48646e(str2);
        return e9g.m24597K(str2, aWSCognitoLegacyCredentialStore.userDeviceDetailsCacheKeyPrefix, false, 2, null) && e9g.m24605w(str2, str, false, 2, null);
    }

    private final FederatedToken retrieveFederateToIdentityPoolToken() {
        String str;
        String str2 = getMobileClientKeyValue().get(PROVIDER_KEY);
        if (str2 == null || (str = getMobileClientKeyValue().get(TOKEN_KEY)) == null) {
            return null;
        }
        AuthProvider authProviderAmazon = AuthProvider.amazon();
        sq8.m48648g(authProviderAmazon, "amazon(...)");
        String identityProviderName = CodegenExtensionsKt.getIdentityProviderName(authProviderAmazon);
        AuthProvider authProviderFacebook = AuthProvider.facebook();
        sq8.m48648g(authProviderFacebook, "facebook(...)");
        String identityProviderName2 = CodegenExtensionsKt.getIdentityProviderName(authProviderFacebook);
        AuthProvider authProviderApple = AuthProvider.apple();
        sq8.m48648g(authProviderApple, "apple(...)");
        String identityProviderName3 = CodegenExtensionsKt.getIdentityProviderName(authProviderApple);
        AuthProvider authProviderGoogle = AuthProvider.google();
        sq8.m48648g(authProviderGoogle, "google(...)");
        if (ch3.m21249n(identityProviderName, identityProviderName2, identityProviderName3, CodegenExtensionsKt.getIdentityProviderName(authProviderGoogle)).contains(str2)) {
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
    */
    private final SignedInData retrieveSignedInData() {
        SignInMethod signInMethodRetrieveUserPoolSignInMethod;
        String str;
        String str2 = "";
        CognitoUserPoolTokens cognitoUserPoolTokensRetrieveCognitoUserPoolTokens = retrieveCognitoUserPoolTokens(getTokenKeys());
        if (cognitoUserPoolTokensRetrieveCognitoUserPoolTokens == null || (signInMethodRetrieveUserPoolSignInMethod = retrieveUserPoolSignInMethod()) == null) {
            return null;
        }
        try {
            String accessToken = cognitoUserPoolTokensRetrieveCognitoUserPoolTokens.getAccessToken();
            if (accessToken != null) {
                String userSub = SessionHelper.INSTANCE.getUserSub(accessToken);
                if (userSub == null) {
                    userSub = "";
                }
                str = userSub;
            }
        } catch (Exception unused) {
            str = "";
        }
        try {
            String accessToken2 = cognitoUserPoolTokensRetrieveCognitoUserPoolTokens.getAccessToken();
            if (accessToken2 != null) {
                String username = SessionHelper.INSTANCE.getUsername(accessToken2);
                if (username != null) {
                    str2 = username;
                }
            }
        } catch (Exception unused2) {
        }
        return new SignedInData(str, str2, new Date(0L), signInMethodRetrieveUserPoolSignInMethod, cognitoUserPoolTokensRetrieveCognitoUserPoolTokens);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SignInMethod retrieveUserPoolSignInMethod() {
        SignInMethod apiBased;
        String str = getMobileClientKeyValue().get(SIGN_IN_MODE_KEY);
        if (str != null) {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        if (retrieveFederateToIdentityPoolToken() == null) {
                            apiBased = new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN);
                            break;
                        } else {
                            return null;
                        }
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        apiBased = new SignInMethod.HostedUI((String) null, 1, (id5) null);
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return null;
                    }
                    break;
            }
            return apiBased;
        }
        return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteASFDevice() {
        this.context.getSharedPreferences(LOCAL_STORAGE_PATH, 0).edit().remove(LOCAL_STORAGE_DEVICE_ID_KEY).apply();
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteCredential() {
        deleteAWSCredentials();
        deleteIdentityId();
        deleteCognitoUserPoolTokens();
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteDeviceKeyCredential(String str) {
        sq8.m48649h(str, "username");
        String str2 = getTokenKeys().get(APP_LAST_AUTH_USER);
        if (str2 != null) {
            getTokensKeyValue().remove(str2);
        }
        KeyValueRepository keyValueRepository = this.deviceKeyValue;
        if (keyValueRepository == null) {
            sq8.m48667z("deviceKeyValue");
            keyValueRepository = null;
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
        sharedPreferences = this.context.getSharedPreferences(LOCAL_STORAGE_PATH, 0);
        return new AmplifyCredential.ASFDevice(sharedPreferences != null ? sharedPreferences.getString(LOCAL_STORAGE_DEVICE_ID_KEY, null) : null);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public synchronized AmplifyCredential retrieveCredential() {
        AmplifyCredential userPool;
        SignedInData signedInDataRetrieveSignedInData = retrieveSignedInData();
        AWSCredentials aWSCredentialsRetrieveAWSCredentials = retrieveAWSCredentials();
        String strRetrieveIdentityId = retrieveIdentityId();
        if (aWSCredentialsRetrieveAWSCredentials == null || strRetrieveIdentityId == null) {
            userPool = signedInDataRetrieveSignedInData != null ? new AmplifyCredential.UserPool(signedInDataRetrieveSignedInData) : AmplifyCredential.Empty.INSTANCE;
        } else {
            FederatedToken federatedTokenRetrieveFederateToIdentityPoolToken = retrieveFederateToIdentityPoolToken();
            userPool = signedInDataRetrieveSignedInData != null ? new AmplifyCredential.UserAndIdentityPool(signedInDataRetrieveSignedInData, strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials) : federatedTokenRetrieveFederateToIdentityPoolToken != null ? new AmplifyCredential.IdentityPoolFederated(federatedTokenRetrieveFederateToIdentityPoolToken, strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials) : new AmplifyCredential.IdentityPool(strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials);
        }
        return userPool;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0029, B:6:0x002f, B:8:0x0039, B:9:0x003f, B:11:0x0049, B:13:0x0050, B:15:0x0059, B:22:0x0067, B:27:0x0071, B:28:0x0074, B:33:0x007e), top: B:40:0x0001 }] */
    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized DeviceMetadata retrieveDeviceMetadata(String str) {
        DeviceMetadata metadata;
        sq8.m48649h(str, "username");
        h8g h8gVar = h8g.f26398a;
        boolean z = true;
        String str2 = String.format(this.userDeviceDetailsCacheKey, Arrays.copyOf(new Object[]{str}, 1));
        sq8.m48648g(str2, "format(...)");
        KeyValueRepository keyValueRepositoryCreate = this.keyValueRepoFactory.create(this.context, str2);
        this.deviceKeyValue = keyValueRepositoryCreate;
        KeyValueRepository keyValueRepository = null;
        if (keyValueRepositoryCreate == null) {
            sq8.m48667z("deviceKeyValue");
            keyValueRepositoryCreate = null;
        }
        String str3 = keyValueRepositoryCreate.get(DEVICE_KEY);
        KeyValueRepository keyValueRepository2 = this.deviceKeyValue;
        if (keyValueRepository2 == null) {
            sq8.m48667z("deviceKeyValue");
            keyValueRepository2 = null;
        }
        String str4 = keyValueRepository2.get(DEVICE_GROUP_KEY);
        KeyValueRepository keyValueRepository3 = this.deviceKeyValue;
        if (keyValueRepository3 == null) {
            sq8.m48667z("deviceKeyValue");
        } else {
            keyValueRepository = keyValueRepository3;
        }
        String str5 = keyValueRepository.get(DEVICE_SECRET_KEY);
        if (str3 == null || str3.length() == 0) {
            if (str4 != null && str4.length() != 0) {
                z = false;
            }
            if (z) {
                metadata = DeviceMetadata.Empty.INSTANCE;
            }
        } else {
            if (str3 == null) {
                str3 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            metadata = new DeviceMetadata.Metadata(str3, str4, str5);
        }
        return metadata;
    }

    public final List<String> retrieveDeviceMetadataUsernameList() {
        try {
            final String str = ".xml";
            File[] fileArrListFiles = new File(this.context.getDataDir(), "shared_prefs").listFiles(new FilenameFilter() { // from class: o.t1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str2) {
                    return AWSCognitoLegacyCredentialStore.retrieveDeviceMetadataUsernameList$lambda$11(this.f46195a, str, file, str2);
                }
            });
            if (fileArrListFiles == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                String name = file.getName();
                sq8.m48648g(name, "getName(...)");
                arrayList.add(f9g.V0(f9g.P0(name, this.userDeviceDetailsCacheKeyPrefix, null, 2, null), ".xml", null, 2, null));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!f9g.d0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return ch3.m21246k();
        }
    }

    public final synchronized String retrieveLastAuthUserId() {
        String str;
        str = getTokenKeys().get(APP_LAST_AUTH_USER);
        return str != null ? getTokensKeyValue().get(str) : null;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveASFDevice(AmplifyCredential.ASFDevice aSFDevice) {
        sq8.m48649h(aSFDevice, "device");
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveCredential(AmplifyCredential amplifyCredential) {
        sq8.m48649h(amplifyCredential, "credential");
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveDeviceMetadata(String str, DeviceMetadata deviceMetadata) {
        sq8.m48649h(str, "username");
        sq8.m48649h(deviceMetadata, "deviceMetadata");
    }

    public /* synthetic */ AWSCognitoLegacyCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepositoryFactory, int i, id5 id5Var) {
        this(context, authConfiguration, (i & 4) != 0 ? new KeyValueRepositoryFactory() : keyValueRepositoryFactory);
    }
}
