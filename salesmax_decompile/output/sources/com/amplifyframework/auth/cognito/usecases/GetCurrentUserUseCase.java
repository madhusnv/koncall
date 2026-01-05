package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.google.api.Service;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes5.dex */
public final class GetCurrentUserUseCase {
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase", m36648f = "GetCurrentUserUseCase.kt", m36649l = {Service.SYSTEM_PARAMETERS_FIELD_NUMBER, 32}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase$execute$1 */
    public static final class C105311 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105311(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetCurrentUserUseCase.this.execute(this);
        }
    }

    public GetCurrentUserUseCase(FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(n64 n64Var) {
        C105311 c105311;
        GetCurrentUserUseCase getCurrentUserUseCase;
        AuthenticationState.SignedIn signedIn;
        AuthException error;
        if (n64Var instanceof C105311) {
            c105311 = (C105311) n64Var;
            int i = c105311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105311.label = i - Integer.MIN_VALUE;
            } else {
                c105311 = new C105311(n64Var);
            }
        }
        Object objRequireSignedInState = c105311.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105311.label;
        if (i2 == 0) {
            wre.m54934b(objRequireSignedInState);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105311.L$0 = this;
            c105311.label = 1;
            objRequireSignedInState = AuthStateMachineKt.requireSignedInState(authStateMachine, c105311);
            if (objRequireSignedInState == objM51918f) {
                return objM51918f;
            }
            getCurrentUserUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                signedIn = (AuthenticationState.SignedIn) c105311.L$0;
                wre.m54934b(objRequireSignedInState);
                error = ((AWSCognitoAuthSession) objRequireSignedInState).getUserPoolTokensResult().getError();
                if (error instanceof SessionExpiredException) {
                    return new AuthUser(signedIn.getSignedInData().getUserId(), signedIn.getSignedInData().getUsername());
                }
                throw error;
            }
            getCurrentUserUseCase = (GetCurrentUserUseCase) c105311.L$0;
            wre.m54934b(objRequireSignedInState);
        }
        AuthenticationState.SignedIn signedIn2 = (AuthenticationState.SignedIn) objRequireSignedInState;
        FetchAuthSessionUseCase fetchAuthSessionUseCase = getCurrentUserUseCase.fetchAuthSession;
        c105311.L$0 = signedIn2;
        c105311.label = 2;
        Object objExecute = fetchAuthSessionUseCase.execute(c105311);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        signedIn = signedIn2;
        objRequireSignedInState = objExecute;
        error = ((AWSCognitoAuthSession) objRequireSignedInState).getUserPoolTokensResult().getError();
        if (error instanceof SessionExpiredException) {
        }
    }
}
