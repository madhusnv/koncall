package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import p001o.gr5;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.n6i;
import p001o.o64;
import p001o.sq8;
import p001o.um5;
import p001o.uq8;
import p001o.wm5;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class RememberDeviceUseCase {
    private final kg3 client;
    private final AuthEnvironment environment;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.RememberDeviceUseCase", m36648f = "RememberDeviceUseCase.kt", m36649l = {32, 33, wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER, um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.RememberDeviceUseCase$execute$1 */
    public static final class C105331 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C105331(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RememberDeviceUseCase.this.execute(this);
        }
    }

    public RememberDeviceUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine, AuthEnvironment authEnvironment) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        sq8.m48649h(authEnvironment, "environment");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
        this.environment = authEnvironment;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(n64 n64Var) {
        C105331 c105331;
        RememberDeviceUseCase rememberDeviceUseCase;
        Object objExecute;
        String str;
        RememberDeviceUseCase rememberDeviceUseCase2;
        kg3 kg3Var;
        n6i n6iVarM40166a;
        if (n64Var instanceof C105331) {
            c105331 = (C105331) n64Var;
            int i = c105331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105331.label = i - Integer.MIN_VALUE;
            } else {
                c105331 = new C105331(n64Var);
            }
        }
        Object objRequireSignedInState = c105331.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105331.label;
        if (i2 == 0) {
            wre.m54934b(objRequireSignedInState);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105331.L$0 = this;
            c105331.label = 1;
            objRequireSignedInState = AuthStateMachineKt.requireSignedInState(authStateMachine, c105331);
            if (objRequireSignedInState == objM51918f) {
                return objM51918f;
            }
            rememberDeviceUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(objRequireSignedInState);
                        return y3i.f54824a;
                    }
                    str = (String) c105331.L$1;
                    rememberDeviceUseCase2 = (RememberDeviceUseCase) c105331.L$0;
                    wre.m54934b(objRequireSignedInState);
                    String accessToken = ((AWSCognitoAuthSession) objRequireSignedInState).getAccessToken();
                    kg3Var = rememberDeviceUseCase2.client;
                    n6i.C15517a c15517a = new n6i.C15517a();
                    c15517a.m40170e(accessToken);
                    c15517a.m40171f(str);
                    c15517a.m40172g(gr5.C13815c.f25685c);
                    n6iVarM40166a = c15517a.m40166a();
                    c105331.L$0 = null;
                    c105331.L$1 = null;
                    c105331.label = 4;
                    if (kg3Var.J0(n6iVarM40166a, c105331) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                rememberDeviceUseCase = (RememberDeviceUseCase) c105331.L$0;
                wre.m54934b(objRequireSignedInState);
                DeviceMetadata.Metadata metadata = (DeviceMetadata.Metadata) objRequireSignedInState;
                String deviceKey = metadata == null ? metadata.getDeviceKey() : null;
                FetchAuthSessionUseCase fetchAuthSessionUseCase = rememberDeviceUseCase.fetchAuthSession;
                c105331.L$0 = rememberDeviceUseCase;
                c105331.L$1 = deviceKey;
                c105331.label = 3;
                objExecute = fetchAuthSessionUseCase.execute(c105331);
                if (objExecute != objM51918f) {
                    return objM51918f;
                }
                RememberDeviceUseCase rememberDeviceUseCase3 = rememberDeviceUseCase;
                str = deviceKey;
                objRequireSignedInState = objExecute;
                rememberDeviceUseCase2 = rememberDeviceUseCase3;
                String accessToken2 = ((AWSCognitoAuthSession) objRequireSignedInState).getAccessToken();
                kg3Var = rememberDeviceUseCase2.client;
                n6i.C15517a c15517a2 = new n6i.C15517a();
                c15517a2.m40170e(accessToken2);
                c15517a2.m40171f(str);
                c15517a2.m40172g(gr5.C13815c.f25685c);
                n6iVarM40166a = c15517a2.m40166a();
                c105331.L$0 = null;
                c105331.L$1 = null;
                c105331.label = 4;
                if (kg3Var.J0(n6iVarM40166a, c105331) == objM51918f) {
                }
                return y3i.f54824a;
            }
            rememberDeviceUseCase = (RememberDeviceUseCase) c105331.L$0;
            wre.m54934b(objRequireSignedInState);
        }
        String username = ((AuthenticationState.SignedIn) objRequireSignedInState).getSignedInData().getUsername();
        AuthEnvironment authEnvironment = rememberDeviceUseCase.environment;
        c105331.L$0 = rememberDeviceUseCase;
        c105331.label = 2;
        objRequireSignedInState = authEnvironment.getDeviceMetadata(username, c105331);
        if (objRequireSignedInState == objM51918f) {
            return objM51918f;
        }
        DeviceMetadata.Metadata metadata2 = (DeviceMetadata.Metadata) objRequireSignedInState;
        if (metadata2 == null) {
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase2 = rememberDeviceUseCase.fetchAuthSession;
        c105331.L$0 = rememberDeviceUseCase;
        c105331.L$1 = deviceKey;
        c105331.label = 3;
        objExecute = fetchAuthSessionUseCase2.execute(c105331);
        if (objExecute != objM51918f) {
        }
    }
}
