package com.amplifyframework.auth.cognito;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.amplifyframework.auth.cognito.asf.UserContextDataProvider;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AuthEnvironment", m15344f = "AuthEnvironment.kt", m15345l = {111}, m15346m = "getDeviceMetadata")
    /* renamed from: com.amplifyframework.auth.cognito.AuthEnvironment$getDeviceMetadata$1 */
    public static final class C10461 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C10461(InterfaceC7559c<? super C10461> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthEnvironment.this.getDeviceMetadata(null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AuthEnvironment", m15344f = "AuthEnvironment.kt", m15345l = {93, 100}, m15346m = "getUserContextData")
    /* renamed from: com.amplifyframework.auth.cognito.AuthEnvironment$getUserContextData$1 */
    public static final class C10471 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C10471(InterfaceC7559c<? super C10471> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthEnvironment.this.getUserContextData(null, this);
        }
    }

    public AuthEnvironment(Context context, AuthConfiguration configuration, AWSCognitoAuthService cognitoAuthService, StoreClientBehavior credentialStoreClient, UserContextDataProvider userContextDataProvider, HostedUIClient hostedUIClient, Logger logger) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(configuration, "configuration");
        AbstractC4154l.m8923f(cognitoAuthService, "cognitoAuthService");
        AbstractC4154l.m8923f(credentialStoreClient, "credentialStoreClient");
        AbstractC4154l.m8923f(logger, "logger");
        this.context = context;
        this.configuration = configuration;
        this.cognitoAuthService = cognitoAuthService;
        this.credentialStoreClient = credentialStoreClient;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDeviceMetadata(java.lang.String r6, uw.InterfaceC7559c<? super com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Metadata> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amplifyframework.auth.cognito.AuthEnvironment.C10461
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.auth.cognito.AuthEnvironment$getDeviceMetadata$1 r0 = (com.amplifyframework.auth.cognito.AuthEnvironment.C10461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.AuthEnvironment$getDeviceMetadata$1 r0 = new com.amplifyframework.auth.cognito.AuthEnvironment$getDeviceMetadata$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            og.od.m10798c(r7)
            goto L49
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            og.od.m10798c(r7)
            com.amplifyframework.auth.cognito.StoreClientBehavior r7 = r5.credentialStoreClient
            com.amplifyframework.statemachine.codegen.data.CredentialType$Device r2 = new com.amplifyframework.statemachine.codegen.data.CredentialType$Device
            r2.<init>(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.loadCredentials(r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            boolean r6 = r7 instanceof com.amplifyframework.statemachine.codegen.data.AmplifyCredential.DeviceData
            if (r6 == 0) goto L50
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential$DeviceData r7 = (com.amplifyframework.statemachine.codegen.data.AmplifyCredential.DeviceData) r7
            goto L51
        L50:
            r7 = r4
        L51:
            if (r7 != 0) goto L61
            com.amplifyframework.logging.Logger r6 = r5.logger
            java.lang.String r7 = "loadCredentials returned unexpected AmplifyCredential Type."
            r6.warn(r7)
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential$DeviceData r7 = new com.amplifyframework.statemachine.codegen.data.AmplifyCredential$DeviceData
            com.amplifyframework.statemachine.codegen.data.DeviceMetadata$Empty r6 = com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Empty.INSTANCE
            r7.<init>(r6)
        L61:
            com.amplifyframework.statemachine.codegen.data.DeviceMetadata r6 = r7.getDeviceMetadata()
            boolean r7 = r6 instanceof com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Metadata
            if (r7 == 0) goto L6c
            com.amplifyframework.statemachine.codegen.data.DeviceMetadata$Metadata r6 = (com.amplifyframework.statemachine.codegen.data.DeviceMetadata.Metadata) r6
            return r6
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.AuthEnvironment.getDeviceMetadata(java.lang.String, uw.c):java.lang.Object");
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
            AbstractC4154l.m8922e(string2, "toString(...)");
            SharedPreferences.Editor editor = sharedPreferences.edit();
            AbstractC4154l.m8919b(editor, "editor");
            editor.putString(PINPOINT_UNIQUE_ID_KEY, string);
            editor.commit();
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
        AbstractC4154l.m8928k("srpHelper");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (r4.storeCredentials(r6, r2, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserContextData(java.lang.String r9, uw.InterfaceC7559c<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.amplifyframework.auth.cognito.AuthEnvironment.C10471
            if (r0 == 0) goto L13
            r0 = r10
            com.amplifyframework.auth.cognito.AuthEnvironment$getUserContextData$1 r0 = (com.amplifyframework.auth.cognito.AuthEnvironment.C10471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.AuthEnvironment$getUserContextData$1 r0 = new com.amplifyframework.auth.cognito.AuthEnvironment$getUserContextData$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r9 = r0.L$3
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential$ASFDevice r9 = (com.amplifyframework.statemachine.codegen.data.AmplifyCredential.ASFDevice) r9
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r0.L$1
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential$ASFDevice r1 = (com.amplifyframework.statemachine.codegen.data.AmplifyCredential.ASFDevice) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            og.od.m10798c(r10)
            goto Lba
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            og.od.m10798c(r10)
            goto L5e
        L4c:
            og.od.m10798c(r10)
            com.amplifyframework.auth.cognito.StoreClientBehavior r10 = r8.credentialStoreClient
            com.amplifyframework.statemachine.codegen.data.CredentialType$ASF r2 = com.amplifyframework.statemachine.codegen.data.CredentialType.ASF.INSTANCE
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = r10.loadCredentials(r2, r0)
            if (r10 != r1) goto L5e
            goto Lb3
        L5e:
            boolean r2 = r10 instanceof com.amplifyframework.statemachine.codegen.data.AmplifyCredential.ASFDevice
            if (r2 == 0) goto L65
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential$ASFDevice r10 = (com.amplifyframework.statemachine.codegen.data.AmplifyCredential.ASFDevice) r10
            goto L66
        L65:
            r10 = r5
        L66:
            if (r10 != 0) goto L6f
            com.amplifyframework.logging.Logger r2 = r8.logger
            java.lang.String r4 = "loadCredentials returned unexpected AmplifyCredential Type."
            r2.warn(r4)
        L6f:
            if (r10 == 0) goto L76
            java.lang.String r2 = r10.getId()
            goto L77
        L76:
            r2 = r5
        L77:
            if (r2 != 0) goto Lb4
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r6 = r2.getTime()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r10 = ":"
            r2.append(r10)
            r2.append(r6)
            java.lang.String r10 = r2.toString()
            com.amplifyframework.statemachine.codegen.data.AmplifyCredential$ASFDevice r2 = new com.amplifyframework.statemachine.codegen.data.AmplifyCredential$ASFDevice
            r2.<init>(r10)
            com.amplifyframework.auth.cognito.StoreClientBehavior r4 = r8.credentialStoreClient
            com.amplifyframework.statemachine.codegen.data.CredentialType$ASF r6 = com.amplifyframework.statemachine.codegen.data.CredentialType.ASF.INSTANCE
            r0.L$0 = r9
            r0.L$1 = r5
            r0.L$2 = r10
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r0 = r4.storeCredentials(r6, r2, r0)
            if (r0 != r1) goto Lb8
        Lb3:
            return r1
        Lb4:
            java.lang.String r10 = r10.getId()
        Lb8:
            r0 = r9
            r9 = r10
        Lba:
            com.amplifyframework.auth.cognito.asf.UserContextDataProvider r10 = r8.userContextDataProvider
            if (r10 == 0) goto Lc3
            java.lang.String r9 = r10.getEncodedContextData(r0, r9)
            return r9
        Lc3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.AuthEnvironment.getUserContextData(java.lang.String, uw.c):java.lang.Object");
    }

    public final void setSrpHelper$aws_auth_cognito_release(SRPHelper sRPHelper) {
        AbstractC4154l.m8923f(sRPHelper, "<set-?>");
        this.srpHelper = sRPHelper;
    }

    public /* synthetic */ AuthEnvironment(Context context, AuthConfiguration authConfiguration, AWSCognitoAuthService aWSCognitoAuthService, StoreClientBehavior storeClientBehavior, UserContextDataProvider userContextDataProvider, HostedUIClient hostedUIClient, Logger logger, int i10, AbstractC4148f abstractC4148f) {
        this(context, authConfiguration, aWSCognitoAuthService, storeClientBehavior, (i10 & 16) != 0 ? null : userContextDataProvider, hostedUIClient, logger);
    }
}
