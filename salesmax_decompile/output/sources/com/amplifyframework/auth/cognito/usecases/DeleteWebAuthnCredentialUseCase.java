package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.auth.options.AuthDeleteWebAuthnCredentialOptions;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.ul5;
import p001o.um5;
import p001o.uq8;
import p001o.wm5;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class DeleteWebAuthnCredentialUseCase {
    private final kg3 client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.DeleteWebAuthnCredentialUseCase", m36648f = "DeleteWebAuthnCredentialUseCase.kt", m36649l = {32, wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER, um5.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.DeleteWebAuthnCredentialUseCase$execute$1 */
    public static final class C105261 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C105261(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteWebAuthnCredentialUseCase.this.execute(null, null, this);
        }
    }

    public DeleteWebAuthnCredentialUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, n64 n64Var) {
        C105261 c105261;
        DeleteWebAuthnCredentialUseCase deleteWebAuthnCredentialUseCase;
        kg3 kg3Var;
        ul5 ul5VarM51702a;
        if (n64Var instanceof C105261) {
            c105261 = (C105261) n64Var;
            int i = c105261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105261.label = i - Integer.MIN_VALUE;
            } else {
                c105261 = new C105261(n64Var);
            }
        }
        Object objExecute = c105261.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105261.label;
        if (i2 == 0) {
            wre.m54934b(objExecute);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105261.L$0 = this;
            c105261.L$1 = str;
            c105261.label = 1;
            if (AuthStateMachineKt.requireSignedInState(authStateMachine, c105261) == objM51918f) {
                return objM51918f;
            }
            deleteWebAuthnCredentialUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objExecute);
                    return y3i.f54824a;
                }
                str = (String) c105261.L$1;
                deleteWebAuthnCredentialUseCase = (DeleteWebAuthnCredentialUseCase) c105261.L$0;
                wre.m54934b(objExecute);
                String accessToken = ((AWSCognitoAuthSession) objExecute).getAccessToken();
                kg3Var = deleteWebAuthnCredentialUseCase.client;
                ul5.C17392a c17392a = new ul5.C17392a();
                c17392a.m51705d(accessToken);
                c17392a.m51706e(str);
                ul5VarM51702a = c17392a.m51702a();
                c105261.L$0 = null;
                c105261.L$1 = null;
                c105261.label = 3;
                if (kg3Var.a2(ul5VarM51702a, c105261) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            str = (String) c105261.L$1;
            deleteWebAuthnCredentialUseCase = (DeleteWebAuthnCredentialUseCase) c105261.L$0;
            wre.m54934b(objExecute);
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase = deleteWebAuthnCredentialUseCase.fetchAuthSession;
        c105261.L$0 = deleteWebAuthnCredentialUseCase;
        c105261.L$1 = str;
        c105261.label = 2;
        objExecute = fetchAuthSessionUseCase.execute(c105261);
        if (objExecute == objM51918f) {
            return objM51918f;
        }
        String accessToken2 = ((AWSCognitoAuthSession) objExecute).getAccessToken();
        kg3Var = deleteWebAuthnCredentialUseCase.client;
        ul5.C17392a c17392a2 = new ul5.C17392a();
        c17392a2.m51705d(accessToken2);
        c17392a2.m51706e(str);
        ul5VarM51702a = c17392a2.m51702a();
        c105261.L$0 = null;
        c105261.L$1 = null;
        c105261.label = 3;
        if (kg3Var.a2(ul5VarM51702a, c105261) == objM51918f) {
        }
        return y3i.f54824a;
    }
}
