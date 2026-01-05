package com.amplifyframework.auth.cognito.usecases;

import android.app.Activity;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.auth.cognito.helpers.AuthLogger;
import com.amplifyframework.auth.cognito.helpers.WebAuthnHelper;
import com.amplifyframework.auth.options.AuthAssociateWebAuthnCredentialsOptions;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.util.MaskUtilKt;
import com.amplifyframework.util.DocumentExtensionsKt;
import org.objectweb.asm.TypeReference;
import p001o.gm3;
import p001o.h4g;
import p001o.i4g;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.vv5;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AssociateWebAuthnCredentialUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final Logger logger;
    private final AuthStateMachine stateMachine;
    private final WebAuthnHelper webAuthnHelper;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase", m36648f = "AssociateWebAuthnCredentialUseCase.kt", m36649l = {um5.PHP_GENERIC_SERVICES_FIELD_NUMBER, um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 47, 51, 55}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase$execute$1 */
    public static final class C105231 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C105231(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssociateWebAuthnCredentialUseCase.this.execute(null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase", m36648f = "AssociateWebAuthnCredentialUseCase.kt", m36649l = {TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT}, m36650m = "getCredentialRequestJson")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase$getCredentialRequestJson$1 */
    public static final class C105241 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C105241(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssociateWebAuthnCredentialUseCase.this.getCredentialRequestJson(null, this);
        }
    }

    public AssociateWebAuthnCredentialUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine, WebAuthnHelper webAuthnHelper) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        sq8.m48649h(webAuthnHelper, "webAuthnHelper");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
        this.webAuthnHelper = webAuthnHelper;
        this.logger = AuthLogger.authLogger(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object associateCredential(String str, String str2, n64 n64Var) {
        kg3 kg3Var = this.client;
        gm3.C13778a c13778a = new gm3.C13778a();
        c13778a.m29032e(DocumentExtensionsKt.JsonDocument(str));
        c13778a.m29031d(str2);
        Object objQ2 = kg3Var.q2(c13778a.m29028a(), n64Var);
        return objQ2 == uq8.m51918f() ? objQ2 : y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCredentialRequestJson(String str, n64 n64Var) {
        C105241 c105241;
        if (n64Var instanceof C105241) {
            c105241 = (C105241) n64Var;
            int i = c105241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105241.label = i - Integer.MIN_VALUE;
            } else {
                c105241 = new C105241(n64Var);
            }
        }
        Object objMo35644B = c105241.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105241.label;
        if (i2 == 0) {
            wre.m54934b(objMo35644B);
            kg3 kg3Var = this.client;
            h4g.C13849a c13849a = new h4g.C13849a();
            c13849a.m29814c(str);
            h4g h4gVarM29812a = c13849a.m29812a();
            c105241.label = 1;
            objMo35644B = kg3Var.mo35644B(h4gVarM29812a, c105241);
            if (objMo35644B == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo35644B);
        }
        vv5 vv5VarM31563a = ((i4g) objMo35644B).m31563a();
        sq8.m48646e(vv5VarM31563a);
        return DocumentExtensionsKt.toJsonString(vv5VarM31563a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, n64 n64Var) throws AuthException {
        C105231 c105231;
        AssociateWebAuthnCredentialUseCase associateWebAuthnCredentialUseCase;
        Object credentialRequestJson;
        Activity activity2;
        String str;
        String str2;
        if (n64Var instanceof C105231) {
            c105231 = (C105231) n64Var;
            int i = c105231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105231.label = i - Integer.MIN_VALUE;
            } else {
                c105231 = new C105231(n64Var);
            }
        }
        Object objExecute = c105231.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105231.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105231.L$0 = this;
            c105231.L$1 = activity;
            c105231.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105231) == objM51918f) {
                return objM51918f;
            }
            associateWebAuthnCredentialUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    activity = (Activity) c105231.L$1;
                    associateWebAuthnCredentialUseCase = (AssociateWebAuthnCredentialUseCase) c105231.L$0;
                    wre.m54934b(objExecute);
                    String accessToken = ((AWSCognitoAuthSession) objExecute).getAccessToken();
                    c105231.L$0 = associateWebAuthnCredentialUseCase;
                    c105231.L$1 = activity;
                    c105231.L$2 = accessToken;
                    c105231.label = 3;
                    credentialRequestJson = associateWebAuthnCredentialUseCase.getCredentialRequestJson(accessToken, c105231);
                    if (credentialRequestJson != objM51918f) {
                        return objM51918f;
                    }
                    activity2 = activity;
                    str = accessToken;
                    objExecute = credentialRequestJson;
                    String str3 = (String) objExecute;
                    associateWebAuthnCredentialUseCase.logger.debug("Received credential request: " + MaskUtilKt.mask(str3));
                    WebAuthnHelper webAuthnHelper = associateWebAuthnCredentialUseCase.webAuthnHelper;
                    c105231.L$0 = associateWebAuthnCredentialUseCase;
                    c105231.L$1 = str;
                    c105231.L$2 = null;
                    c105231.label = 4;
                    objExecute = webAuthnHelper.createCredential(str3, activity2, c105231);
                    if (objExecute == objM51918f) {
                    }
                    str2 = (String) objExecute;
                    associateWebAuthnCredentialUseCase.logger.debug("Sending credential response: " + MaskUtilKt.mask(str2));
                    c105231.L$0 = null;
                    c105231.L$1 = null;
                    c105231.label = 5;
                    if (associateWebAuthnCredentialUseCase.associateCredential(str2, str, c105231) == objM51918f) {
                    }
                    return y3i.f54824a;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(objExecute);
                        return y3i.f54824a;
                    }
                    str = (String) c105231.L$1;
                    associateWebAuthnCredentialUseCase = (AssociateWebAuthnCredentialUseCase) c105231.L$0;
                    wre.m54934b(objExecute);
                    str2 = (String) objExecute;
                    associateWebAuthnCredentialUseCase.logger.debug("Sending credential response: " + MaskUtilKt.mask(str2));
                    c105231.L$0 = null;
                    c105231.L$1 = null;
                    c105231.label = 5;
                    if (associateWebAuthnCredentialUseCase.associateCredential(str2, str, c105231) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                str = (String) c105231.L$2;
                Activity activity3 = (Activity) c105231.L$1;
                AssociateWebAuthnCredentialUseCase associateWebAuthnCredentialUseCase2 = (AssociateWebAuthnCredentialUseCase) c105231.L$0;
                wre.m54934b(objExecute);
                activity2 = activity3;
                associateWebAuthnCredentialUseCase = associateWebAuthnCredentialUseCase2;
                String str32 = (String) objExecute;
                associateWebAuthnCredentialUseCase.logger.debug("Received credential request: " + MaskUtilKt.mask(str32));
                WebAuthnHelper webAuthnHelper2 = associateWebAuthnCredentialUseCase.webAuthnHelper;
                c105231.L$0 = associateWebAuthnCredentialUseCase;
                c105231.L$1 = str;
                c105231.L$2 = null;
                c105231.label = 4;
                objExecute = webAuthnHelper2.createCredential(str32, activity2, c105231);
                if (objExecute == objM51918f) {
                    return objM51918f;
                }
                str2 = (String) objExecute;
                associateWebAuthnCredentialUseCase.logger.debug("Sending credential response: " + MaskUtilKt.mask(str2));
                c105231.L$0 = null;
                c105231.L$1 = null;
                c105231.label = 5;
                if (associateWebAuthnCredentialUseCase.associateCredential(str2, str, c105231) == objM51918f) {
                }
                return y3i.f54824a;
            }
            activity = (Activity) c105231.L$1;
            associateWebAuthnCredentialUseCase = (AssociateWebAuthnCredentialUseCase) c105231.L$0;
            wre.m54934b(objExecute);
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = associateWebAuthnCredentialUseCase.fetchAuthSession;
        c105231.L$0 = associateWebAuthnCredentialUseCase;
        c105231.L$1 = activity;
        c105231.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105231);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        String accessToken2 = ((AWSCognitoAuthSession) objExecute).getAccessToken();
        c105231.L$0 = associateWebAuthnCredentialUseCase;
        c105231.L$1 = activity;
        c105231.L$2 = accessToken2;
        c105231.label = 3;
        credentialRequestJson = associateWebAuthnCredentialUseCase.getCredentialRequestJson(accessToken2, c105231);
        if (credentialRequestJson != objM51918f) {
        }
    }
}
