package com.amplifyframework.auth.plugins.core;

import android.content.Context;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.exceptions.NotAuthorizedException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration;
import com.amplifyframework.auth.plugins.core.data.AWSCredentialsInternal;
import com.amplifyframework.auth.plugins.core.data.AuthCredentialStore;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import j$.time.Instant;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.bce;
import p001o.bp7;
import p001o.cg3;
import p001o.ch3;
import p001o.cp7;
import p001o.dh3;
import p001o.f9g;
import p001o.gk8;
import p001o.h9g;
import p001o.hc4;
import p001o.hsa;
import p001o.hwc;
import p001o.id5;
import p001o.iq7;
import p001o.jq7;
import p001o.l0c;
import p001o.l75;
import p001o.mge;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.p79;
import p001o.sm1;
import p001o.sq8;
import p001o.szb;
import p001o.to0;
import p001o.uq8;
import p001o.vyh;
import p001o.wre;

/* loaded from: classes5.dex */
public final class AWSCognitoIdentityPoolOperations {
    public static final Companion Companion = new Companion(null);
    public static final String OIDC_PLUGIN_LOG_NAMESPACE = "amplify:oidc-plugin:%s";
    private final String KEY_AWS_CREDENTIALS;
    private final String KEY_IDENTITY_ID;
    private final String KEY_LOGINS_PROVIDER;
    private final AuthCredentialStore awsAuthCredentialStore;
    private final cg3 cognitoIdentityClient;
    private final AWSCognitoIdentityPoolConfiguration identityPool;
    private final Logger logger;
    private final String pluginKeySanitized;
    private final String pluginVersionSanitized;
    private final mge semVerRegex;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
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

    @l75(m36647c = "com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations", m36648f = "AWSCognitoIdentityPoolOperations.kt", m36649l = {Opcodes.CHECKCAST, 210}, m36650m = "fetchAWSCognitoIdentityPoolDetails")
    /* renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$fetchAWSCognitoIdentityPoolDetails$1 */
    public static final class C105401 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C105401(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.fetchAWSCognitoIdentityPoolDetails(null, false, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations", m36648f = "AWSCognitoIdentityPoolOperations.kt", m36649l = {122}, m36650m = "getAWSCredentials")
    /* renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getAWSCredentials$1 */
    public static final class C105411 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105411(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.getAWSCredentials(null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations", m36648f = "AWSCognitoIdentityPoolOperations.kt", m36649l = {Opcodes.DUP2_X2}, m36650m = "getIdentityId")
    /* renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getIdentityId$1 */
    public static final class C105421 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105421(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.getIdentityId(null, this);
        }
    }

    public AWSCognitoIdentityPoolOperations(Context context, AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2) throws IOException {
        sq8.m48649h(context, "context");
        sq8.m48649h(aWSCognitoIdentityPoolConfiguration, "identityPool");
        sq8.m48649h(str, "pluginKey");
        sq8.m48649h(str2, "pluginVersion");
        this.identityPool = aWSCognitoIdentityPoolConfiguration;
        LoggingCategory loggingCategory = Amplify.Logging;
        String str3 = String.format(OIDC_PLUGIN_LOG_NAMESPACE, Arrays.copyOf(new Object[]{AWSCognitoIdentityPoolOperations.class.getSimpleName()}, 1));
        sq8.m48648g(str3, "format(...)");
        Logger loggerForNamespace = loggingCategory.forNamespace(str3);
        sq8.m48648g(loggerForNamespace, "forNamespace(...)");
        this.logger = loggerForNamespace;
        this.semVerRegex = new mge("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)?$");
        String strL1 = h9g.l1(str, 25);
        StringBuilder sb = new StringBuilder();
        int length = strL1.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strL1.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        this.pluginKeySanitized = string;
        String strL12 = h9g.l1(str2, 10);
        this.logger.warn("Plugin version does not match semantic versioning rules, version set to 1.0.0");
        strL12 = this.semVerRegex.m38995g(strL12) ? strL12 : null;
        strL12 = strL12 == null ? "1.0.0" : strL12;
        this.pluginVersionSanitized = strL12;
        this.KEY_LOGINS_PROVIDER = "amplify." + this.identityPool.getPoolId() + ".session.loginsProvider";
        this.KEY_IDENTITY_ID = "amplify." + this.identityPool.getPoolId() + ".session.identityId";
        this.KEY_AWS_CREDENTIALS = "amplify." + this.identityPool.getPoolId() + ".session.credential";
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        this.awsAuthCredentialStore = new AuthCredentialStore(applicationContext, string);
        this.cognitoIdentityClient = CognitoClientFactory.INSTANCE.createIdentityClient(this.identityPool, string, strL12);
    }

    private final AWSCredentialsInternal deserializeCredential(String str) {
        if (str == null) {
            return null;
        }
        try {
            p79.C16009a c16009a = p79.f39513d;
            c16009a.mo43085a();
            return (AWSCredentialsInternal) c16009a.m43086c(sm1.m48521p(AWSCredentialsInternal.Companion.serializer()), str);
        } catch (Exception unused) {
            return null;
        }
    }

    private final List<LoginProvider> deserializeLogins(String str) {
        if (str != null) {
            try {
                p79.C16009a c16009a = p79.f39513d;
                c16009a.mo43085a();
                List<LoginProvider> list = (List) c16009a.m43086c(sm1.m48521p(new to0(LoginProvider.Companion.serializer())), str);
                if (list != null) {
                    return list;
                }
            } catch (Exception unused) {
                return ch3.m21246k();
            }
        }
        return ch3.m21246k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAWSCredentials(String str, List<LoginProvider> list, n64 n64Var) throws Exception {
        C105411 c105411;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations;
        if (n64Var instanceof C105411) {
            c105411 = (C105411) n64Var;
            int i = c105411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105411.label = i - Integer.MIN_VALUE;
            } else {
                c105411 = new C105411(n64Var);
            }
        }
        Object objV2 = c105411.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105411.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objV2);
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(list, 10)), 16));
                    for (LoginProvider loginProvider : list) {
                        hwc hwcVarM53620a = vyh.m53620a(loginProvider.getName(), loginProvider.getUserIdentifier());
                        linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
                    }
                    bp7 bp7VarM19546a = bp7.f16661d.m19546a(new AWSCognitoIdentityPoolOperations$getAWSCredentials$request$1(str, linkedHashMap));
                    cg3 cg3Var = this.cognitoIdentityClient;
                    c105411.L$0 = this;
                    c105411.label = 1;
                    objV2 = cg3Var.V2(bp7VarM19546a, c105411);
                    if (objV2 == objM51918f) {
                        return objM51918f;
                    }
                    aWSCognitoIdentityPoolOperations = this;
                } catch (l0c e) {
                    e = e;
                    aWSCognitoIdentityPoolOperations = this;
                    l0c l0cVar = e;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, l0cVar, 1, null);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aWSCognitoIdentityPoolOperations = (AWSCognitoIdentityPoolOperations) c105411.L$0;
                try {
                    wre.m54934b(objV2);
                } catch (l0c e2) {
                    e = e2;
                    l0c l0cVar2 = e;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, l0cVar2, 1, null);
                }
            }
            cp7 cp7Var = (cp7) objV2;
            aWSCognitoIdentityPoolOperations.logger.verbose("getAWSCredentials: fetched AWS credentials");
            hc4 hc4VarM21565a = cp7Var.m21565a();
            if (hc4VarM21565a != null) {
                String strM21566b = cp7Var.m21566b();
                String strM30202a = hc4VarM21565a.m30202a();
                String strM30204c = hc4VarM21565a.m30204c();
                String strM30205d = hc4VarM21565a.m30205d();
                gk8 gk8VarM30203b = hc4VarM21565a.m30203b();
                hwc hwcVarM53620a2 = vyh.m53620a(strM21566b, new AWSCredentialsInternal(strM30202a, strM30204c, strM30205d, gk8VarM30203b != null ? ml1.m39305e(gk8VarM30203b.m28952e()) : null));
                if (hwcVarM53620a2 != null) {
                    return hwcVarM53620a2;
                }
            }
            throw new Exception("Fetching AWS credentials failed.");
        } catch (Exception e3) {
            throw new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, e3, 1, null);
        }
    }

    private final AuthSessionResult<AWSCredentials> getCredentialsResult(AWSCredentialsInternal aWSCredentialsInternal) {
        AWSCredentials aWSCredentialsCreateAWSCredentials = AWSCredentials.Factory.createAWSCredentials(aWSCredentialsInternal.getAccessKeyId(), aWSCredentialsInternal.getSecretAccessKey(), aWSCredentialsInternal.getSessionToken(), aWSCredentialsInternal.getExpiration());
        AuthSessionResult<AWSCredentials> authSessionResultSuccess = aWSCredentialsCreateAWSCredentials != null ? AuthSessionResult.success(aWSCredentialsCreateAWSCredentials) : null;
        if (authSessionResultSuccess != null) {
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCredentials> authSessionResultFailure = AuthSessionResult.failure(new UnknownException("Failed to fetch AWS credentials.", null, 2, null));
        sq8.m48648g(authSessionResultFailure, "failure(...)");
        return authSessionResultFailure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getIdentityId(List<LoginProvider> list, n64 n64Var) throws Exception {
        C105421 c105421;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations;
        if (n64Var instanceof C105421) {
            c105421 = (C105421) n64Var;
            int i = c105421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105421.label = i - Integer.MIN_VALUE;
            } else {
                c105421 = new C105421(n64Var);
            }
        }
        Object objE1 = c105421.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105421.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objE1);
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(list, 10)), 16));
                    for (LoginProvider loginProvider : list) {
                        hwc hwcVarM53620a = vyh.m53620a(loginProvider.getName(), loginProvider.getUserIdentifier());
                        linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
                    }
                    iq7 iq7VarM32555a = iq7.f29082d.m32555a(new AWSCognitoIdentityPoolOperations$getIdentityId$request$1(this, linkedHashMap));
                    cg3 cg3Var = this.cognitoIdentityClient;
                    c105421.L$0 = this;
                    c105421.label = 1;
                    objE1 = cg3Var.e1(iq7VarM32555a, c105421);
                    if (objE1 == objM51918f) {
                        return objM51918f;
                    }
                    aWSCognitoIdentityPoolOperations = this;
                } catch (l0c e) {
                    e = e;
                    aWSCognitoIdentityPoolOperations = this;
                    l0c l0cVar = e;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, l0cVar, 1, null);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aWSCognitoIdentityPoolOperations = (AWSCognitoIdentityPoolOperations) c105421.L$0;
                try {
                    wre.m54934b(objE1);
                } catch (l0c e2) {
                    e = e2;
                    l0c l0cVar2 = e;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, l0cVar2, 1, null);
                }
            }
            aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: fetched identity id");
            String strM34273a = ((jq7) objE1).m34273a();
            if (strM34273a != null) {
                return strM34273a;
            }
            throw new Exception("Fetching identity id failed.");
        } catch (Exception e3) {
            throw new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, e3, 1, null);
        }
    }

    private final boolean isValidSession(AWSCredentialsInternal aWSCredentialsInternal) {
        Instant instantNow = Instant.now();
        Long expiration = aWSCredentialsInternal.getExpiration();
        boolean z = instantNow.compareTo(expiration != null ? Instant.ofEpochSecond(expiration.longValue()) : null) < 0;
        this.logger.verbose("fetchAWSCognitoIdentityPoolDetails: is AWS session valid? " + z);
        return z;
    }

    public final void clearCredentials() {
        this.logger.verbose("clearCredentials: clear cached AWS credentials");
        this.awsAuthCredentialStore.removeAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v15, types: [com.amplifyframework.auth.result.AuthSessionResult] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.amplifyframework.auth.result.AuthSessionResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.amplifyframework.auth.result.AuthSessionResult, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAWSCognitoIdentityPoolDetails(List<LoginProvider> list, boolean z, n64 n64Var) throws Exception {
        C105401 c105401;
        AuthSessionResult<AWSCredentials> authSessionResultFailure;
        ?? r11;
        List<LoginProvider> listDeserializeLogins;
        AWSCredentialsInternal aWSCredentialsInternalDeserializeCredential;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations;
        AuthSessionResult authSessionResultSuccess;
        List<LoginProvider> list2;
        List<LoginProvider> list3;
        ?? r112;
        int i;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations2;
        String str;
        if (n64Var instanceof C105401) {
            c105401 = (C105401) n64Var;
            int i2 = c105401.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c105401.label = i2 - Integer.MIN_VALUE;
            } else {
                c105401 = new C105401(n64Var);
            }
        }
        Object identityId = c105401.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c105401.label;
        try {
            if (i3 == 0) {
                wre.m54934b(identityId);
                this.logger.verbose("fetchAWSCognitoIdentityPoolDetails: get cached AWS credentials");
                listDeserializeLogins = deserializeLogins(this.awsAuthCredentialStore.get(this.KEY_LOGINS_PROVIDER));
                String str2 = this.awsAuthCredentialStore.get(this.KEY_IDENTITY_ID);
                aWSCredentialsInternalDeserializeCredential = deserializeCredential(this.awsAuthCredentialStore.get(this.KEY_AWS_CREDENTIALS));
                this.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching identity id");
                if (str2 == null || f9g.d0(str2)) {
                    try {
                        c105401.L$0 = this;
                        c105401.L$1 = list;
                        c105401.L$2 = listDeserializeLogins;
                        c105401.L$3 = aWSCredentialsInternalDeserializeCredential;
                        c105401.Z$0 = z;
                        c105401.label = 1;
                        identityId = getIdentityId(list, c105401);
                    } catch (AuthException e) {
                        e = e;
                        aWSCognitoIdentityPoolOperations = this;
                        authSessionResultSuccess = AuthSessionResult.failure(e);
                        list2 = list;
                        boolean z2 = z;
                        list3 = list2;
                        r112 = authSessionResultSuccess;
                        boolean z3 = !sq8.m48644c(list3, listDeserializeLogins);
                        aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                        if (aWSCredentialsInternalDeserializeCredential != null) {
                        }
                        sq8.m48646e(r11);
                        sq8.m48646e(authSessionResultFailure);
                        return new AWSCognitoIdentityPoolDetails(r11, authSessionResultFailure);
                    }
                    if (identityId == objM51918f) {
                        return objM51918f;
                    }
                    aWSCognitoIdentityPoolOperations = this;
                    list = list;
                    authSessionResultSuccess = AuthSessionResult.success((String) identityId);
                    list2 = list;
                    boolean z22 = z;
                    list3 = list2;
                    r112 = authSessionResultSuccess;
                    boolean z32 = !sq8.m48644c(list3, listDeserializeLogins);
                    aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                    if (aWSCredentialsInternalDeserializeCredential != null) {
                        i = WhenMappings.$EnumSwitchMapping$0[r112.getType().ordinal()];
                        if (i != 1) {
                        }
                    }
                } else {
                    authSessionResultSuccess = AuthSessionResult.success(str2);
                    aWSCognitoIdentityPoolOperations = this;
                    list2 = list;
                    boolean z222 = z;
                    list3 = list2;
                    r112 = authSessionResultSuccess;
                    boolean z322 = !sq8.m48644c(list3, listDeserializeLogins);
                    aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                    if (aWSCredentialsInternalDeserializeCredential != null) {
                    }
                }
            } else if (i3 == 1) {
                z = c105401.Z$0;
                AWSCredentialsInternal aWSCredentialsInternal = (AWSCredentialsInternal) c105401.L$3;
                listDeserializeLogins = (List) c105401.L$2;
                List<LoginProvider> list4 = (List) c105401.L$1;
                aWSCognitoIdentityPoolOperations = (AWSCognitoIdentityPoolOperations) c105401.L$0;
                try {
                    wre.m54934b(identityId);
                    aWSCredentialsInternalDeserializeCredential = aWSCredentialsInternal;
                    list = list4;
                    try {
                        authSessionResultSuccess = AuthSessionResult.success((String) identityId);
                        list2 = list;
                    } catch (AuthException e2) {
                        e = e2;
                        authSessionResultSuccess = AuthSessionResult.failure(e);
                        list2 = list;
                        boolean z2222 = z;
                        list3 = list2;
                        r112 = authSessionResultSuccess;
                        boolean z3222 = !sq8.m48644c(list3, listDeserializeLogins);
                        aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                        if (aWSCredentialsInternalDeserializeCredential != null) {
                        }
                        sq8.m48646e(r11);
                        sq8.m48646e(authSessionResultFailure);
                        return new AWSCognitoIdentityPoolDetails(r11, authSessionResultFailure);
                    }
                } catch (AuthException e3) {
                    e = e3;
                    aWSCredentialsInternalDeserializeCredential = aWSCredentialsInternal;
                    list = list4;
                    authSessionResultSuccess = AuthSessionResult.failure(e);
                    list2 = list;
                    boolean z22222 = z;
                    list3 = list2;
                    r112 = authSessionResultSuccess;
                    boolean z32222 = !sq8.m48644c(list3, listDeserializeLogins);
                    aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                    if (aWSCredentialsInternalDeserializeCredential != null) {
                    }
                    sq8.m48646e(r11);
                    sq8.m48646e(authSessionResultFailure);
                    return new AWSCognitoIdentityPoolDetails(r11, authSessionResultFailure);
                }
                boolean z222222 = z;
                list3 = list2;
                r112 = authSessionResultSuccess;
                boolean z322222 = !sq8.m48644c(list3, listDeserializeLogins);
                aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                if (aWSCredentialsInternalDeserializeCredential != null || !aWSCognitoIdentityPoolOperations.isValidSession(aWSCredentialsInternalDeserializeCredential) || z322222 || z222222) {
                    i = WhenMappings.$EnumSwitchMapping$0[r112.getType().ordinal()];
                    if (i != 1) {
                        authSessionResultFailure = AuthSessionResult.failure(r112.getError());
                        r11 = r112;
                    } else {
                        if (i != 2) {
                            throw new szb();
                        }
                        String str3 = (String) r112.getValue();
                        c105401.L$0 = aWSCognitoIdentityPoolOperations;
                        c105401.L$1 = list3;
                        c105401.L$2 = r112;
                        c105401.L$3 = null;
                        c105401.label = 2;
                        identityId = aWSCognitoIdentityPoolOperations.getAWSCredentials(str3, list3, c105401);
                        if (identityId == objM51918f) {
                            return objM51918f;
                        }
                        aWSCognitoIdentityPoolOperations2 = aWSCognitoIdentityPoolOperations;
                        list = r112;
                        hwc hwcVar = (hwc) identityId;
                        str = (String) hwcVar.m31227a();
                        AWSCredentialsInternal aWSCredentialsInternal2 = (AWSCredentialsInternal) hwcVar.m31228b();
                        AuthCredentialStore authCredentialStore = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                        String str4 = aWSCognitoIdentityPoolOperations2.KEY_LOGINS_PROVIDER;
                        p79.C16009a c16009a = p79.f39513d;
                        c16009a.mo43085a();
                        authCredentialStore.put(str4, c16009a.mo31740b(new to0(LoginProvider.Companion.serializer()), list3));
                        AuthCredentialStore authCredentialStore2 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                        String str5 = aWSCognitoIdentityPoolOperations2.KEY_IDENTITY_ID;
                        if (str == null) {
                        }
                        authCredentialStore2.put(str5, str);
                        AuthCredentialStore authCredentialStore3 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                        String str6 = aWSCognitoIdentityPoolOperations2.KEY_AWS_CREDENTIALS;
                        c16009a.mo43085a();
                        authCredentialStore3.put(str6, c16009a.mo31740b(AWSCredentialsInternal.Companion.serializer(), aWSCredentialsInternal2));
                        aWSCognitoIdentityPoolOperations2.logger.verbose("fetchAWSCognitoIdentityPoolDetails: cached AWS credentials");
                        authSessionResultFailure = aWSCognitoIdentityPoolOperations2.getCredentialsResult(aWSCredentialsInternal2);
                        r11 = list;
                    }
                } else {
                    authSessionResultFailure = aWSCognitoIdentityPoolOperations.getCredentialsResult(aWSCredentialsInternalDeserializeCredential);
                    r11 = r112;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r113 = (AuthSessionResult) c105401.L$2;
                list3 = (List) c105401.L$1;
                aWSCognitoIdentityPoolOperations2 = (AWSCognitoIdentityPoolOperations) c105401.L$0;
                wre.m54934b(identityId);
                list = r113;
                hwc hwcVar2 = (hwc) identityId;
                str = (String) hwcVar2.m31227a();
                AWSCredentialsInternal aWSCredentialsInternal22 = (AWSCredentialsInternal) hwcVar2.m31228b();
                AuthCredentialStore authCredentialStore4 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                String str42 = aWSCognitoIdentityPoolOperations2.KEY_LOGINS_PROVIDER;
                p79.C16009a c16009a2 = p79.f39513d;
                c16009a2.mo43085a();
                authCredentialStore4.put(str42, c16009a2.mo31740b(new to0(LoginProvider.Companion.serializer()), list3));
                AuthCredentialStore authCredentialStore22 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                String str52 = aWSCognitoIdentityPoolOperations2.KEY_IDENTITY_ID;
                if (str == null) {
                    str = "";
                }
                authCredentialStore22.put(str52, str);
                AuthCredentialStore authCredentialStore32 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                String str62 = aWSCognitoIdentityPoolOperations2.KEY_AWS_CREDENTIALS;
                c16009a2.mo43085a();
                authCredentialStore32.put(str62, c16009a2.mo31740b(AWSCredentialsInternal.Companion.serializer(), aWSCredentialsInternal22));
                aWSCognitoIdentityPoolOperations2.logger.verbose("fetchAWSCognitoIdentityPoolDetails: cached AWS credentials");
                authSessionResultFailure = aWSCognitoIdentityPoolOperations2.getCredentialsResult(aWSCredentialsInternal22);
                r11 = list;
            }
        } catch (AuthException e4) {
            authSessionResultFailure = AuthSessionResult.failure(e4);
            r11 = list;
        }
        sq8.m48646e(r11);
        sq8.m48646e(authSessionResultFailure);
        return new AWSCognitoIdentityPoolDetails(r11, authSessionResultFailure);
    }

    public final cg3 getCognitoIdentityClient() {
        return this.cognitoIdentityClient;
    }

    public /* synthetic */ AWSCognitoIdentityPoolOperations(Context context, AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2, int i, id5 id5Var) {
        this(context, aWSCognitoIdentityPoolConfiguration, str, (i & 8) != 0 ? "1.0.0" : str2);
    }
}
