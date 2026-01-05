package com.amplifyframework.auth.cognito;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.amplifyframework.auth.cognito.asf.UserContextDataProvider;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import java.util.Date;
import java.util.UUID;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes5.dex */
public final class AuthEnvironment implements Environment {
    public static final Companion Companion = new Companion(null);
    public static final String PINPOINT_SHARED_PREFS_SUFFIX = "515d6767-01b7-49e5-8273-c8d11b0f331d";
    public static final String PINPOINT_UNIQUE_ID_KEY = "UniqueId";
    private String cachedPinpointEndpointId;
    private final AWSCognitoAuthService cognitoAuthService;
    private final AuthConfiguration configuration;
    private final Context context;
    private final StoreClientBehavior credentialStoreClient;
    private final HostedUIClient hostedUIClient;
    private final Logger logger;
    public SRPHelper srpHelper;
    private final UserContextDataProvider userContextDataProvider;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AuthEnvironment", m36648f = "AuthEnvironment.kt", m36649l = {110}, m36650m = "getDeviceMetadata")
    /* renamed from: com.amplifyframework.auth.cognito.AuthEnvironment$getDeviceMetadata$1 */
    public static final class C103821 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C103821(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthEnvironment.this.getDeviceMetadata(null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AuthEnvironment", m36648f = "AuthEnvironment.kt", m36649l = {Opcodes.DUP2, Opcodes.DADD}, m36650m = "getUserContextData")
    /* renamed from: com.amplifyframework.auth.cognito.AuthEnvironment$getUserContextData$1 */
    public static final class C103831 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C103831(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthEnvironment.this.getUserContextData(null, this);
        }
    }

    public AuthEnvironment(Context context, AuthConfiguration authConfiguration, AWSCognitoAuthService aWSCognitoAuthService, StoreClientBehavior storeClientBehavior, UserContextDataProvider userContextDataProvider, HostedUIClient hostedUIClient, Logger logger) {
        sq8.m48649h(context, "context");
        sq8.m48649h(authConfiguration, "configuration");
        sq8.m48649h(aWSCognitoAuthService, "cognitoAuthService");
        sq8.m48649h(storeClientBehavior, "credentialStoreClient");
        sq8.m48649h(logger, "logger");
        this.context = context;
        this.configuration = authConfiguration;
        this.cognitoAuthService = aWSCognitoAuthService;
        this.credentialStoreClient = storeClientBehavior;
        this.userContextDataProvider = userContextDataProvider;
        this.hostedUIClient = hostedUIClient;
        this.logger = logger;
    }

    public final AWSCognitoAuthService getCognitoAuthService() {
        return this.cognitoAuthService;
    }

    public final AuthConfiguration getConfiguration() {
        return this.configuration;
    }

    public final Context getContext() {
        return this.context;
    }

    public final StoreClientBehavior getCredentialStoreClient() {
        return this.credentialStoreClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDeviceMetadata(String str, n64 n64Var) {
        C103821 c103821;
        AuthEnvironment authEnvironment;
        if (n64Var instanceof C103821) {
            c103821 = (C103821) n64Var;
            int i = c103821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103821.label = i - Integer.MIN_VALUE;
            } else {
                c103821 = new C103821(n64Var);
            }
        }
        Object objLoadCredentials = c103821.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c103821.label;
        if (i2 == 0) {
            wre.m54934b(objLoadCredentials);
            StoreClientBehavior storeClientBehavior = this.credentialStoreClient;
            CredentialType.Device device = new CredentialType.Device(str);
            c103821.L$0 = this;
            c103821.label = 1;
            objLoadCredentials = storeClientBehavior.loadCredentials(device, c103821);
            if (objLoadCredentials == objM51918f) {
                return objM51918f;
            }
            authEnvironment = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) c103821.L$0;
            wre.m54934b(objLoadCredentials);
        }
        AmplifyCredential.DeviceData deviceData = objLoadCredentials instanceof AmplifyCredential.DeviceData ? (AmplifyCredential.DeviceData) objLoadCredentials : null;
        if (deviceData == null) {
            authEnvironment.logger.warn("loadCredentials returned unexpected AmplifyCredential Type.");
            deviceData = new AmplifyCredential.DeviceData(DeviceMetadata.Empty.INSTANCE);
        }
        DeviceMetadata deviceMetadata = deviceData.getDeviceMetadata();
        if (deviceMetadata instanceof DeviceMetadata.Metadata) {
            return (DeviceMetadata.Metadata) deviceMetadata;
        }
        return null;
    }

    public final HostedUIClient getHostedUIClient() {
        return this.hostedUIClient;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    @SuppressLint({"ApplySharedPref"})
    public final synchronized String getPinpointEndpointId() {
        UserPoolConfiguration userPool = this.configuration.getUserPool();
        if ((userPool != null ? userPool.getPinpointAppId() : null) == null) {
            return null;
        }
        String str = this.cachedPinpointEndpointId;
        if (str != null) {
            return str;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(this.configuration.getUserPool().getPinpointAppId() + PINPOINT_SHARED_PREFS_SUFFIX, 0);
        String string = sharedPreferences.getString(PINPOINT_UNIQUE_ID_KEY, null);
        if (string == null) {
            String string2 = UUID.randomUUID().toString();
            sq8.m48648g(string2, "toString(...)");
            sharedPreferences.edit().putString(PINPOINT_UNIQUE_ID_KEY, string).commit();
            string = string2;
        }
        this.cachedPinpointEndpointId = string;
        return string;
    }

    public final SRPHelper getSrpHelper$aws_auth_cognito_release() {
        SRPHelper sRPHelper = this.srpHelper;
        if (sRPHelper != null) {
            return sRPHelper;
        }
        sq8.m48667z("srpHelper");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUserContextData(String str, n64 n64Var) {
        C103831 c103831;
        AuthEnvironment authEnvironment;
        String str2;
        String id;
        AuthEnvironment authEnvironment2;
        UserContextDataProvider userContextDataProvider;
        if (n64Var instanceof C103831) {
            c103831 = (C103831) n64Var;
            int i = c103831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103831.label = i - Integer.MIN_VALUE;
            } else {
                c103831 = new C103831(n64Var);
            }
        }
        Object objLoadCredentials = c103831.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c103831.label;
        if (i2 == 0) {
            wre.m54934b(objLoadCredentials);
            StoreClientBehavior storeClientBehavior = this.credentialStoreClient;
            CredentialType.ASF asf = CredentialType.ASF.INSTANCE;
            c103831.L$0 = this;
            c103831.L$1 = str;
            c103831.label = 1;
            objLoadCredentials = storeClientBehavior.loadCredentials(asf, c103831);
            if (objLoadCredentials == objM51918f) {
                return objM51918f;
            }
            authEnvironment = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                id = (String) c103831.L$2;
                str2 = (String) c103831.L$1;
                authEnvironment2 = (AuthEnvironment) c103831.L$0;
                wre.m54934b(objLoadCredentials);
                authEnvironment = authEnvironment2;
                userContextDataProvider = authEnvironment.userContextDataProvider;
                if (userContextDataProvider != null) {
                    return userContextDataProvider.getEncodedContextData(str2, id);
                }
                return null;
            }
            str = (String) c103831.L$1;
            authEnvironment = (AuthEnvironment) c103831.L$0;
            wre.m54934b(objLoadCredentials);
        }
        AmplifyCredential.ASFDevice aSFDevice = objLoadCredentials instanceof AmplifyCredential.ASFDevice ? (AmplifyCredential.ASFDevice) objLoadCredentials : null;
        if (aSFDevice == null) {
            authEnvironment.logger.warn("loadCredentials returned unexpected AmplifyCredential Type.");
        }
        if ((aSFDevice != null ? aSFDevice.getId() : null) == null) {
            String str3 = UUID.randomUUID() + ":" + new Date().getTime();
            AmplifyCredential.ASFDevice aSFDevice2 = new AmplifyCredential.ASFDevice(str3);
            StoreClientBehavior storeClientBehavior2 = authEnvironment.credentialStoreClient;
            CredentialType.ASF asf2 = CredentialType.ASF.INSTANCE;
            c103831.L$0 = authEnvironment;
            c103831.L$1 = str;
            c103831.L$2 = str3;
            c103831.label = 2;
            if (storeClientBehavior2.storeCredentials(asf2, aSFDevice2, c103831) == objM51918f) {
                return objM51918f;
            }
            str2 = str;
            id = str3;
            authEnvironment2 = authEnvironment;
            authEnvironment = authEnvironment2;
            userContextDataProvider = authEnvironment.userContextDataProvider;
            if (userContextDataProvider != null) {
            }
        } else {
            str2 = str;
            id = aSFDevice.getId();
            userContextDataProvider = authEnvironment.userContextDataProvider;
            if (userContextDataProvider != null) {
            }
        }
    }

    public final void setSrpHelper$aws_auth_cognito_release(SRPHelper sRPHelper) {
        sq8.m48649h(sRPHelper, "<set-?>");
        this.srpHelper = sRPHelper;
    }

    public /* synthetic */ AuthEnvironment(Context context, AuthConfiguration authConfiguration, AWSCognitoAuthService aWSCognitoAuthService, StoreClientBehavior storeClientBehavior, UserContextDataProvider userContextDataProvider, HostedUIClient hostedUIClient, Logger logger, int i, id5 id5Var) {
        this(context, authConfiguration, aWSCognitoAuthService, storeClientBehavior, (i & 16) != 0 ? null : userContextDataProvider, hostedUIClient, logger);
    }
}
