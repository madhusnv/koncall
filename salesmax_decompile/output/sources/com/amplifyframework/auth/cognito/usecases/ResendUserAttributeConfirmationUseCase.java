package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSessionKt;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendUserAttributeConfirmationCodeOptions;
import com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions;
import java.util.Map;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.ur7;
import p001o.vr7;
import p001o.wre;
import p001o.ze3;

/* loaded from: classes5.dex */
public final class ResendUserAttributeConfirmationUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ResendUserAttributeConfirmationUseCase", m36648f = "ResendUserAttributeConfirmationUseCase.kt", m36649l = {um5.SWIFT_PREFIX_FIELD_NUMBER, um5.PHP_NAMESPACE_FIELD_NUMBER, 54}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResendUserAttributeConfirmationUseCase$execute$1 */
    public static final class C105341 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C105341(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResendUserAttributeConfirmationUseCase.this.execute(null, null, this);
        }
    }

    public ResendUserAttributeConfirmationUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    public static /* synthetic */ Object execute$default(ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmationUseCase, AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            authResendUserAttributeConfirmationCodeOptions = AuthResendUserAttributeConfirmationCodeOptions.defaults();
            sq8.m48648g(authResendUserAttributeConfirmationCodeOptions, "defaults(...)");
        }
        return resendUserAttributeConfirmationUseCase.execute(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, n64 n64Var) throws CodeDeliveryFailureException {
        C105341 c105341;
        ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmationUseCase;
        AuthUserAttributeKey authUserAttributeKey2;
        AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions2;
        ze3 ze3VarM53335a;
        AuthCodeDeliveryDetails authCodeDeliveryDetails;
        if (n64Var instanceof C105341) {
            c105341 = (C105341) n64Var;
            int i = c105341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105341.label = i - Integer.MIN_VALUE;
            } else {
                c105341 = new C105341(n64Var);
            }
        }
        Object objExecute = c105341.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105341.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105341.L$0 = this;
            c105341.L$1 = authUserAttributeKey;
            c105341.L$2 = authResendUserAttributeConfirmationCodeOptions;
            c105341.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105341) == objM51918f) {
                return objM51918f;
            }
            resendUserAttributeConfirmationUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objExecute);
                    ze3VarM53335a = ((vr7) objExecute).m53335a();
                    if (ze3VarM53335a != null || (authCodeDeliveryDetails = ResetPasswordUseCaseKt.toAuthCodeDeliveryDetails(ze3VarM53335a)) == null) {
                        throw new CodeDeliveryFailureException(null, 1, null);
                    }
                    return authCodeDeliveryDetails;
                }
                authResendUserAttributeConfirmationCodeOptions2 = (AuthResendUserAttributeConfirmationCodeOptions) c105341.L$2;
                authUserAttributeKey2 = (AuthUserAttributeKey) c105341.L$1;
                resendUserAttributeConfirmationUseCase = (ResendUserAttributeConfirmationUseCase) c105341.L$0;
                wre.m54934b(objExecute);
                String strRequireAccessToken = AWSCognitoAuthSessionKt.requireAccessToken((AWSCognitoAuthSession) objExecute);
                AWSCognitoAuthResendUserAttributeConfirmationCodeOptions aWSCognitoAuthResendUserAttributeConfirmationCodeOptions = !(authResendUserAttributeConfirmationCodeOptions2 instanceof AWSCognitoAuthResendUserAttributeConfirmationCodeOptions) ? (AWSCognitoAuthResendUserAttributeConfirmationCodeOptions) authResendUserAttributeConfirmationCodeOptions2 : null;
                Map<String, String> metadata = aWSCognitoAuthResendUserAttributeConfirmationCodeOptions == null ? aWSCognitoAuthResendUserAttributeConfirmationCodeOptions.getMetadata() : null;
                kg3 kg3Var = resendUserAttributeConfirmationUseCase.client;
                ur7.C17436a c17436a = new ur7.C17436a();
                c17436a.m51958e(strRequireAccessToken);
                c17436a.m51959f(authUserAttributeKey2.getKeyString());
                c17436a.m51960g(metadata);
                ur7 ur7VarM51954a = c17436a.m51954a();
                c105341.L$0 = null;
                c105341.L$1 = null;
                c105341.L$2 = null;
                c105341.label = 3;
                objExecute = kg3Var.r1(ur7VarM51954a, c105341);
                if (objExecute == objM51918f) {
                    return objM51918f;
                }
                ze3VarM53335a = ((vr7) objExecute).m53335a();
                if (ze3VarM53335a != null) {
                }
                throw new CodeDeliveryFailureException(null, 1, null);
            }
            authResendUserAttributeConfirmationCodeOptions = (AuthResendUserAttributeConfirmationCodeOptions) c105341.L$2;
            authUserAttributeKey = (AuthUserAttributeKey) c105341.L$1;
            resendUserAttributeConfirmationUseCase = (ResendUserAttributeConfirmationUseCase) c105341.L$0;
            wre.m54934b(objExecute);
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = resendUserAttributeConfirmationUseCase.fetchAuthSession;
        c105341.L$0 = resendUserAttributeConfirmationUseCase;
        c105341.L$1 = authUserAttributeKey;
        c105341.L$2 = authResendUserAttributeConfirmationCodeOptions;
        c105341.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105341);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions3 = authResendUserAttributeConfirmationCodeOptions;
        authUserAttributeKey2 = authUserAttributeKey;
        authResendUserAttributeConfirmationCodeOptions2 = authResendUserAttributeConfirmationCodeOptions3;
        String strRequireAccessToken2 = AWSCognitoAuthSessionKt.requireAccessToken((AWSCognitoAuthSession) objExecute);
        if (!(authResendUserAttributeConfirmationCodeOptions2 instanceof AWSCognitoAuthResendUserAttributeConfirmationCodeOptions)) {
        }
        if (aWSCognitoAuthResendUserAttributeConfirmationCodeOptions == null) {
        }
        kg3 kg3Var2 = resendUserAttributeConfirmationUseCase.client;
        ur7.C17436a c17436a2 = new ur7.C17436a();
        c17436a2.m51958e(strRequireAccessToken2);
        c17436a2.m51959f(authUserAttributeKey2.getKeyString());
        c17436a2.m51960g(metadata);
        ur7 ur7VarM51954a2 = c17436a2.m51954a();
        c105341.L$0 = null;
        c105341.L$1 = null;
        c105341.L$2 = null;
        c105341.label = 3;
        objExecute = kg3Var2.r1(ur7VarM51954a2, c105341);
        if (objExecute == objM51918f) {
        }
        ze3VarM53335a = ((vr7) objExecute).m53335a();
        if (ze3VarM53335a != null) {
        }
        throw new CodeDeliveryFailureException(null, 1, null);
    }
}
