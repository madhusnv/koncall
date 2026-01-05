package com.amplifyframework.auth.plugins.core;

import android.content.Context;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration;
import com.amplifyframework.auth.plugins.core.data.AWSCredentialsInternal;
import com.amplifyframework.auth.plugins.core.data.AuthCredentialStore;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import jy.C3866c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.C4270b;
import nx.AbstractC5178p;
import nx.C5176n;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.math.Primes;
import pb.AbstractC5870b;
import qw.a0;
import rw.C6668r;
import ua.InterfaceC7383c;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;
import ya.C8603b;
import ya.C8606e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoIdentityPoolOperations {
    public static final Companion Companion = new Companion(null);
    public static final String OIDC_PLUGIN_LOG_NAMESPACE = "amplify:oidc-plugin:%s";
    private final AuthCredentialStore awsAuthCredentialStore;
    private final InterfaceC7383c cognitoIdentityClient;
    private final AWSCognitoIdentityPoolConfiguration identityPool;
    private final String keyAwsCredentials;
    private final String keyIdentityId;
    private final String keyLoginsProvider;
    private final Logger logger;
    private final String pluginKeySanitized;
    private final String pluginVersionSanitized;
    private final C5176n semVerRegex;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthSessionResult.Type.values().length];
            try {
                iArr[AuthSessionResult.Type.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthSessionResult.Type.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations", m15344f = "AWSCognitoIdentityPoolOperations.kt", m15345l = {191, Primes.SMALL_FACTOR_LIMIT}, m15346m = "fetchAWSCognitoIdentityPoolDetails")
    /* renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$fetchAWSCognitoIdentityPoolDetails$1 */
    public static final class C11781 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C11781(InterfaceC7559c<? super C11781> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.fetchAWSCognitoIdentityPoolDetails(null, false, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations", m15344f = "AWSCognitoIdentityPoolOperations.kt", m15345l = {121}, m15346m = "getAWSCredentials")
    /* renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getAWSCredentials$1 */
    public static final class C11791 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11791(InterfaceC7559c<? super C11791> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.getAWSCredentials(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations", m15344f = "AWSCognitoIdentityPoolOperations.kt", m15345l = {93}, m15346m = "getIdentityId")
    /* renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getIdentityId$1 */
    public static final class C11801 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11801(InterfaceC7559c<? super C11801> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.getIdentityId(null, this);
        }
    }

    public AWSCognitoIdentityPoolOperations(Context context, AWSCognitoIdentityPoolConfiguration identityPool, String pluginKey, String pluginVersion) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(identityPool, "identityPool");
        AbstractC4154l.m8923f(pluginKey, "pluginKey");
        AbstractC4154l.m8923f(pluginVersion, "pluginVersion");
        this.identityPool = identityPool;
        Logger loggerForNamespace = Amplify.Logging.forNamespace(String.format(OIDC_PLUGIN_LOG_NAMESPACE, Arrays.copyOf(new Object[]{"AWSCognitoIdentityPoolOperations"}, 1)));
        AbstractC4154l.m8922e(loggerForNamespace, "forNamespace(...)");
        this.logger = loggerForNamespace;
        this.semVerRegex = new C5176n("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)?$");
        String strF0 = AbstractC5178p.f0(25, pluginKey);
        StringBuilder sb2 = new StringBuilder();
        int length = strF0.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strF0.charAt(i10);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        this.pluginKeySanitized = string;
        String strF02 = AbstractC5178p.f0(10, pluginVersion);
        this.logger.warn("Plugin version does not match semantic versioning rules, version set to 1.0.0");
        strF02 = this.semVerRegex.m10087c(strF02) ? strF02 : null;
        strF02 = strF02 == null ? "1.0.0" : strF02;
        this.pluginVersionSanitized = strF02;
        this.keyLoginsProvider = AbstractC5601a.m11238i("amplify.", this.identityPool.getPoolId(), ".session.loginsProvider");
        this.keyIdentityId = AbstractC5601a.m11238i("amplify.", this.identityPool.getPoolId(), ".session.identityId");
        this.keyAwsCredentials = AbstractC5601a.m11238i("amplify.", this.identityPool.getPoolId(), ".session.credential");
        Context applicationContext = context.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "getApplicationContext(...)");
        this.awsAuthCredentialStore = new AuthCredentialStore(applicationContext, string);
        this.cognitoIdentityClient = CognitoClientFactory.INSTANCE.createIdentityClient(this.identityPool, string, strF02);
    }

    private final AWSCredentialsInternal deserializeCredential(String str) {
        if (str != null) {
            try {
                C4270b c4270b = AbstractC4271c.f21666d;
                c4270b.getClass();
                return (AWSCredentialsInternal) c4270b.m8987a(AbstractC5870b.m11498a(AWSCredentialsInternal.Companion.serializer()), str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final List<LoginProvider> deserializeLogins(String str) {
        C6668r c6668r = C6668r.f31943a;
        if (str != null) {
            try {
                C4270b c4270b = AbstractC4271c.f21666d;
                c4270b.getClass();
                List<LoginProvider> list = (List) c4270b.m8987a(AbstractC5870b.m11498a(new C3866c(LoginProvider.Companion.serializer())), str);
                if (list != null) {
                    return list;
                }
            } catch (Exception unused) {
            }
        }
        return c6668r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAWSCredentials(java.lang.String r7, java.util.List<com.amplifyframework.auth.plugins.core.LoginProvider> r8, uw.InterfaceC7559c<? super qw.C6361k> r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations.getAWSCredentials(java.lang.String, java.util.List, uw.c):java.lang.Object");
    }

    private static final a0 getAWSCredentials$lambda$7(String str, Map map, C8603b GetCredentialsForIdentityRequest) {
        AbstractC4154l.m8923f(GetCredentialsForIdentityRequest, "$this$GetCredentialsForIdentityRequest");
        GetCredentialsForIdentityRequest.f41862a = str;
        GetCredentialsForIdentityRequest.f41863b = map;
        return a0.f30746a;
    }

    private final AuthSessionResult<AWSCredentials> getCredentialsResult(AWSCredentialsInternal aWSCredentialsInternal) {
        AuthSessionResult<AWSCredentials> authSessionResultSuccess;
        AWSCredentials aWSCredentialsCreateAWSCredentials = AWSCredentials.Factory.createAWSCredentials(aWSCredentialsInternal.getAccessKeyId(), aWSCredentialsInternal.getSecretAccessKey(), aWSCredentialsInternal.getSessionToken(), aWSCredentialsInternal.getExpiration());
        if (aWSCredentialsCreateAWSCredentials != null && (authSessionResultSuccess = AuthSessionResult.success(aWSCredentialsCreateAWSCredentials)) != null) {
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCredentials> authSessionResultFailure = AuthSessionResult.failure(new UnknownException("Failed to fetch AWS credentials.", null, 2, null));
        AbstractC4154l.m8922e(authSessionResultFailure, "failure(...)");
        return authSessionResultFailure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getIdentityId(java.util.List<com.amplifyframework.auth.plugins.core.LoginProvider> r7, uw.InterfaceC7559c<? super java.lang.String> r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations.C11801
            if (r0 == 0) goto L13
            r0 = r8
            com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getIdentityId$1 r0 = (com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations.C11801) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getIdentityId$1 r0 = new com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getIdentityId$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.L$2
            ya.f r7 = (ya.C8607f) r7
            java.lang.Object r7 = r0.L$1
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            og.od.m10798c(r8)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            goto L99
        L33:
            r0 = move-exception
            r7 = r0
            r3 = r7
            goto Laf
        L38:
            r0 = move-exception
            r7 = r0
            r3 = r7
            goto Lba
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            og.od.m10798c(r8)
            r8 = 10
            int r8 = rw.AbstractC6664n.m12768r(r7, r8)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            int r8 = rw.AbstractC6674x.m12776d(r8)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r2 = 16
            if (r8 >= r2) goto L57
            r8 = r2
        L57:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r2.<init>(r8)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
        L60:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            com.amplifyframework.auth.plugins.core.LoginProvider r8 = (com.amplifyframework.auth.plugins.core.LoginProvider) r8     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            java.lang.String r4 = r8.getName()     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            java.lang.String r8 = r8.getUserIdentifier()     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r2.put(r4, r8)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            goto L60
        L78:
            ya.e r7 = new ya.e     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r7.<init>()     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            getIdentityId$lambda$4(r6, r2, r7)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            ya.f r8 = new ya.f     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r8.<init>(r7)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            ua.c r7 = r6.cognitoIdentityClient     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r2 = 0
            r0.L$0 = r2     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r0.L$1 = r2     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r0.L$2 = r2     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            r0.label = r3     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            ua.d r7 = (ua.C7384d) r7     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            java.lang.Object r8 = r7.m13795j(r8, r0)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            if (r8 != r1) goto L99
            return r1
        L99:
            ya.g r8 = (ya.C8608g) r8     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            com.amplifyframework.logging.Logger r7 = r6.logger     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            java.lang.String r0 = "getIdentityId: fetched identity id"
            r7.verbose(r0)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            java.lang.String r7 = r8.f41872a     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            if (r7 == 0) goto La7
            return r7
        La7:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            java.lang.String r8 = "Fetching identity id failed."
            r7.<init>(r8)     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
            throw r7     // Catch: java.lang.Exception -> L33 aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException -> L38
        Laf:
            com.amplifyframework.auth.exceptions.SignedOutException r0 = new com.amplifyframework.auth.exceptions.SignedOutException
            r4 = 1
            r5 = 0
            r1 = 0
            java.lang.String r2 = "If you have guest access enabled, please check that your device is online and try again. Otherwise if guest access is not enabled, you'll need to sign in and try again."
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        Lba:
            com.amplifyframework.logging.Logger r7 = r6.logger
            java.lang.String r8 = "getIdentityId: guest access disabled"
            r7.verbose(r8)
            com.amplifyframework.auth.exceptions.NotAuthorizedException r0 = new com.amplifyframework.auth.exceptions.NotAuthorizedException
            r4 = 1
            r5 = 0
            r1 = 0
            java.lang.String r2 = "Please sign in and reattempt the operation."
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations.getIdentityId(java.util.List, uw.c):java.lang.Object");
    }

    private static final a0 getIdentityId$lambda$4(AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations, Map map, C8606e GetIdRequest) {
        AbstractC4154l.m8923f(GetIdRequest, "$this$GetIdRequest");
        GetIdRequest.f41868a = aWSCognitoIdentityPoolOperations.identityPool.getPoolId();
        GetIdRequest.f41869b = map;
        return a0.f30746a;
    }

    private final boolean isValidSession(AWSCredentialsInternal aWSCredentialsInternal) {
        Instant instantNow = Instant.now();
        Long expiration = aWSCredentialsInternal.getExpiration();
        boolean z6 = instantNow.compareTo(expiration != null ? Instant.ofEpochSecond(expiration.longValue()) : null) < 0;
        this.logger.verbose("fetchAWSCognitoIdentityPoolDetails: is AWS session valid? " + z6);
        return z6;
    }

    public final void clearCredentials() {
        this.logger.verbose("clearCredentials: clear cached AWS credentials");
        this.awsAuthCredentialStore.removeAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations] */
    /* JADX WARN: Type inference failed for: r12v16, types: [com.amplifyframework.auth.result.AuthSessionResult] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.amplifyframework.auth.result.AuthSessionResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.amplifyframework.auth.result.AuthSessionResult, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAWSCognitoIdentityPoolDetails(java.util.List<com.amplifyframework.auth.plugins.core.LoginProvider> r12, boolean r13, uw.InterfaceC7559c<? super com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolDetails> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations.fetchAWSCognitoIdentityPoolDetails(java.util.List, boolean, uw.c):java.lang.Object");
    }

    public final InterfaceC7383c getCognitoIdentityClient() {
        return this.cognitoIdentityClient;
    }

    public /* synthetic */ AWSCognitoIdentityPoolOperations(Context context, AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2, int i10, AbstractC4148f abstractC4148f) {
        this(context, aWSCognitoIdentityPoolConfiguration, str, (i10 & 8) != 0 ? "1.0.0" : str2);
    }
}
