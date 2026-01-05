package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.AuthStateMachineKt;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wc7;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class ForgetDeviceUseCase {
    private final kg3 client;
    private final AuthEnvironment environment;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    @l75(m36647c = "com.amplifyframework.auth.cognito.usecases.ForgetDeviceUseCase", m36648f = "ForgetDeviceUseCase.kt", m36649l = {32, 35, 37, 46}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ForgetDeviceUseCase$execute$1 */
    public static final class C105301 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C105301(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForgetDeviceUseCase.this.execute(null, this);
        }
    }

    public ForgetDeviceUseCase(kg3 kg3Var, FetchAuthSessionUseCase fetchAuthSessionUseCase, AuthStateMachine authStateMachine, AuthEnvironment authEnvironment) {
        sq8.m48649h(kg3Var, "client");
        sq8.m48649h(fetchAuthSessionUseCase, "fetchAuthSession");
        sq8.m48649h(authStateMachine, "stateMachine");
        sq8.m48649h(authEnvironment, "environment");
        this.client = kg3Var;
        this.fetchAuthSession = fetchAuthSessionUseCase;
        this.stateMachine = authStateMachine;
        this.environment = authEnvironment;
    }

    public static /* synthetic */ Object execute$default(ForgetDeviceUseCase forgetDeviceUseCase, AuthDevice authDevice, n64 n64Var, int i, Object obj) {
        if ((i & 1) != 0) {
            authDevice = AuthDevice.fromId("");
            sq8.m48648g(authDevice, "fromId(...)");
        }
        return forgetDeviceUseCase.execute(authDevice, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(AuthDevice authDevice, n64 n64Var) {
        C105301 c105301;
        ForgetDeviceUseCase forgetDeviceUseCase;
        ForgetDeviceUseCase forgetDeviceUseCase2;
        String id;
        DeviceMetadata.Metadata metadata;
        kg3 kg3Var;
        wc7 wc7VarM54205a;
        if (n64Var instanceof C105301) {
            c105301 = (C105301) n64Var;
            int i = c105301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105301.label = i - Integer.MIN_VALUE;
            } else {
                c105301 = new C105301(n64Var);
            }
        }
        Object objRequireSignedInState = c105301.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105301.label;
        if (i2 == 0) {
            wre.m54934b(objRequireSignedInState);
            AuthStateMachine authStateMachine = this.stateMachine;
            c105301.L$0 = this;
            c105301.L$1 = authDevice;
            c105301.label = 1;
            objRequireSignedInState = AuthStateMachineKt.requireSignedInState(authStateMachine, c105301);
            if (objRequireSignedInState == objM51918f) {
                return objM51918f;
            }
            forgetDeviceUseCase = this;
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
                    id = (String) c105301.L$1;
                    forgetDeviceUseCase = (ForgetDeviceUseCase) c105301.L$0;
                    wre.m54934b(objRequireSignedInState);
                    String accessToken = ((AWSCognitoAuthSession) objRequireSignedInState).getAccessToken();
                    kg3Var = forgetDeviceUseCase.client;
                    wc7.C17817a c17817a = new wc7.C17817a();
                    c17817a.m54208d(accessToken);
                    c17817a.m54209e(id);
                    wc7VarM54205a = c17817a.m54205a();
                    c105301.L$0 = null;
                    c105301.L$1 = null;
                    c105301.label = 4;
                    if (kg3Var.mo35646P(wc7VarM54205a, c105301) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                forgetDeviceUseCase2 = (ForgetDeviceUseCase) c105301.L$0;
                wre.m54934b(objRequireSignedInState);
                metadata = (DeviceMetadata.Metadata) objRequireSignedInState;
                if (metadata == null) {
                    forgetDeviceUseCase = forgetDeviceUseCase2;
                    id = metadata.getDeviceKey();
                } else {
                    forgetDeviceUseCase = forgetDeviceUseCase2;
                    id = null;
                }
                FetchAuthSessionUseCase fetchAuthSessionUseCase = forgetDeviceUseCase.fetchAuthSession;
                c105301.L$0 = forgetDeviceUseCase;
                c105301.L$1 = id;
                c105301.label = 3;
                objRequireSignedInState = fetchAuthSessionUseCase.execute(c105301);
                if (objRequireSignedInState == objM51918f) {
                    return objM51918f;
                }
                String accessToken2 = ((AWSCognitoAuthSession) objRequireSignedInState).getAccessToken();
                kg3Var = forgetDeviceUseCase.client;
                wc7.C17817a c17817a2 = new wc7.C17817a();
                c17817a2.m54208d(accessToken2);
                c17817a2.m54209e(id);
                wc7VarM54205a = c17817a2.m54205a();
                c105301.L$0 = null;
                c105301.L$1 = null;
                c105301.label = 4;
                if (kg3Var.mo35646P(wc7VarM54205a, c105301) == objM51918f) {
                }
                return y3i.f54824a;
            }
            authDevice = (AuthDevice) c105301.L$1;
            forgetDeviceUseCase = (ForgetDeviceUseCase) c105301.L$0;
            wre.m54934b(objRequireSignedInState);
        }
        String username = ((AuthenticationState.SignedIn) objRequireSignedInState).getSignedInData().getUsername();
        String id2 = authDevice.getId();
        sq8.m48648g(id2, "getId(...)");
        if (id2.length() > 0) {
            id = authDevice.getId();
            FetchAuthSessionUseCase fetchAuthSessionUseCase2 = forgetDeviceUseCase.fetchAuthSession;
            c105301.L$0 = forgetDeviceUseCase;
            c105301.L$1 = id;
            c105301.label = 3;
            objRequireSignedInState = fetchAuthSessionUseCase2.execute(c105301);
            if (objRequireSignedInState == objM51918f) {
            }
            String accessToken22 = ((AWSCognitoAuthSession) objRequireSignedInState).getAccessToken();
            kg3Var = forgetDeviceUseCase.client;
            wc7.C17817a c17817a22 = new wc7.C17817a();
            c17817a22.m54208d(accessToken22);
            c17817a22.m54209e(id);
            wc7VarM54205a = c17817a22.m54205a();
            c105301.L$0 = null;
            c105301.L$1 = null;
            c105301.label = 4;
            if (kg3Var.mo35646P(wc7VarM54205a, c105301) == objM51918f) {
            }
            return y3i.f54824a;
        }
        AuthEnvironment authEnvironment = forgetDeviceUseCase.environment;
        c105301.L$0 = forgetDeviceUseCase;
        c105301.L$1 = null;
        c105301.label = 2;
        objRequireSignedInState = authEnvironment.getDeviceMetadata(username, c105301);
        if (objRequireSignedInState == objM51918f) {
            return objM51918f;
        }
        forgetDeviceUseCase2 = forgetDeviceUseCase;
        metadata = (DeviceMetadata.Metadata) objRequireSignedInState;
        if (metadata == null) {
        }
        FetchAuthSessionUseCase fetchAuthSessionUseCase22 = forgetDeviceUseCase.fetchAuthSession;
        c105301.L$0 = forgetDeviceUseCase;
        c105301.L$1 = id;
        c105301.label = 3;
        objRequireSignedInState = fetchAuthSessionUseCase22.execute(c105301);
        if (objRequireSignedInState == objM51918f) {
        }
        String accessToken222 = ((AWSCognitoAuthSession) objRequireSignedInState).getAccessToken();
        kg3Var = forgetDeviceUseCase.client;
        wc7.C17817a c17817a222 = new wc7.C17817a();
        c17817a222.m54208d(accessToken222);
        c17817a222.m54209e(id);
        wc7VarM54205a = c17817a222.m54205a();
        c105301.L$0 = null;
        c105301.L$1 = null;
        c105301.label = 4;
        if (kg3Var.mo35646P(wc7VarM54205a, c105301) == objM51918f) {
        }
        return y3i.f54824a;
    }
}
