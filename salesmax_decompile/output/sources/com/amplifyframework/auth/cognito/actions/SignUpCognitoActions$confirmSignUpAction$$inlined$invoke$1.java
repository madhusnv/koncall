package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.step.AuthNextSignUpStep;
import com.amplifyframework.auth.result.step.AuthSignUpStep;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import org.objectweb.asm.TypeReference;
import p001o.hc0;
import p001o.isa;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.qr3;
import p001o.rr3;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignUpEvent.EventType.ConfirmSignUp $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1", m36648f = "SignUpCognitoActions.kt", m36649l = {TypeReference.METHOD_REFERENCE, TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1$1 */
    public static final class C105061 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C105061(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1(String str, SignUpEvent.EventType.ConfirmSignUp confirmSignUp) {
        this.$event$inlined = confirmSignUp;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[Catch: Exception -> 0x01db, TryCatch #2 {Exception -> 0x01db, blocks: (B:31:0x00c2, B:33:0x00d2, B:35:0x00ed, B:37:0x00f3, B:39:0x0102, B:41:0x010a, B:43:0x0114, B:45:0x011c, B:47:0x0125, B:49:0x0135, B:50:0x013d), top: B:83:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192 A[Catch: Exception -> 0x0047, TryCatch #3 {Exception -> 0x0047, blocks: (B:13:0x0042, B:54:0x0171, B:57:0x017a, B:59:0x0192, B:61:0x0199, B:63:0x01ab, B:66:0x01b3, B:67:0x01b5), top: B:85:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ab A[Catch: Exception -> 0x0047, TryCatch #3 {Exception -> 0x0047, blocks: (B:13:0x0042, B:54:0x0171, B:57:0x017a, B:59:0x0192, B:61:0x0199, B:63:0x01ab, B:66:0x01b3, B:67:0x01b5), top: B:85:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3 A[Catch: Exception -> 0x0047, TryCatch #3 {Exception -> 0x0047, blocks: (B:13:0x0042, B:54:0x0171, B:57:0x017a, B:59:0x0192, B:61:0x0199, B:63:0x01ab, B:66:0x01b3, B:67:0x01b5), top: B:85:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C105061 c105061;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        String username;
        SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1 signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1;
        AuthEnvironment authEnvironment2;
        String str;
        kg3 cognitoIdentityProviderClient;
        SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1 signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12;
        rr3 rr3Var;
        SignUpEvent signUpEvent;
        if (n64Var instanceof C105061) {
            c105061 = (C105061) n64Var;
            int i = c105061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105061.label = i - Integer.MIN_VALUE;
            } else {
                c105061 = new C105061(n64Var);
            }
        }
        Object objG1 = c105061.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105061.label;
        if (i2 == 0) {
            wre.m54934b(objG1);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            AuthEnvironment authEnvironment3 = (AuthEnvironment) environment;
            authEnvironment3.getLogger().verbose(id + " Starting execution");
            try {
                username = this.$event$inlined.getSignUpData().getUsername();
                c105061.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    c105061.L$1 = eventDispatcher2;
                    c105061.L$2 = id;
                    c105061.L$3 = authEnvironment3;
                    c105061.L$4 = username;
                    c105061.label = 1;
                    Object userContextData = authEnvironment3.getUserContextData(username, c105061);
                    if (userContextData == objM51918f) {
                        return objM51918f;
                    }
                    signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1 = this;
                    authEnvironment2 = authEnvironment3;
                    objG1 = userContextData;
                    str = id;
                    String str2 = (String) objG1;
                    String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                    }
                } catch (Exception e) {
                    e = e;
                    authEnvironment = authEnvironment3;
                    signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signUpEvent.getType());
                    eventDispatcher2.send(signUpEvent);
                    return y3i.f54824a;
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else if (i2 == 1) {
            username = (String) c105061.L$4;
            authEnvironment2 = (AuthEnvironment) c105061.L$3;
            String str3 = (String) c105061.L$2;
            EventDispatcher eventDispatcher3 = (EventDispatcher) c105061.L$1;
            signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1 = (SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1) c105061.L$0;
            try {
                wre.m54934b(objG1);
                str = str3;
                eventDispatcher2 = eventDispatcher3;
            } catch (Exception e3) {
                e = e3;
                authEnvironment = authEnvironment2;
                id = str3;
                eventDispatcher2 = eventDispatcher3;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
            try {
                String str22 = (String) objG1;
                String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient == null) {
                    qr3.C16446a c16446a = new qr3.C16446a();
                    c16446a.m45799q(username);
                    c16446a.m45796n(signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1.$event$inlined.getConfirmationCode());
                    UserPoolConfiguration userPool = authEnvironment2.getConfiguration().getUserPool();
                    c16446a.m45794l(userPool != null ? userPool.getAppClient() : null);
                    AuthHelper.Companion companion = AuthHelper.Companion;
                    UserPoolConfiguration userPool2 = authEnvironment2.getConfiguration().getUserPool();
                    String appClient = userPool2 != null ? userPool2.getAppClient() : null;
                    UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                    c16446a.m45797o(companion.getSecretHash(username, appClient, userPool3 != null ? userPool3.getAppClientSecret() : null));
                    if (pinpointEndpointId2 != null) {
                        c16446a.m45793k(hc0.f26603b.m30167a(new SignUpCognitoActions$confirmSignUpAction$1$evt$response$1$1$1(pinpointEndpointId2)));
                    }
                    if (str22 != null) {
                        c16446a.m45800r(new SignUpCognitoActions$confirmSignUpAction$1$evt$response$1$2$1(str22));
                    }
                    c16446a.m45795m(signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getClientMetadata());
                    c16446a.m45798p(signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1.$event$inlined.getSignUpData().getSession());
                    qr3 qr3VarM45783a = c16446a.m45783a();
                    c105061.L$0 = signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1;
                    c105061.L$1 = eventDispatcher2;
                    c105061.L$2 = str;
                    c105061.L$3 = authEnvironment2;
                    c105061.L$4 = username;
                    c105061.label = 2;
                    objG1 = cognitoIdentityProviderClient.g1(qr3VarM45783a, c105061);
                    if (objG1 == objM51918f) {
                        return objM51918f;
                    }
                    authEnvironment = authEnvironment2;
                    id = str;
                    signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12 = signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1;
                    rr3Var = (rr3) objG1;
                    SignUpData signUpData = new SignUpData(username, signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getValidationData(), signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getClientMetadata(), rr3Var != null ? rr3Var.m47083a() : null, signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getUserId());
                    AuthSignUpStep authSignUpStep = AuthSignUpStep.DONE;
                    if ((rr3Var != null ? rr3Var.m47083a() : null) != null) {
                    }
                    signUpEvent = new SignUpEvent(new SignUpEvent.EventType.SignedUp(signUpData, new AuthSignUpResult(true, new AuthNextSignUpStep(authSignUpStep, isa.m32681h(), null), signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getUserId())), null, 2, null);
                } else {
                    authEnvironment = authEnvironment2;
                    id = str;
                    signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12 = signUpCognitoActions$confirmSignUpAction$$inlined$invoke$1;
                    rr3Var = null;
                    SignUpData signUpData2 = new SignUpData(username, signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getValidationData(), signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getClientMetadata(), rr3Var != null ? rr3Var.m47083a() : null, signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getUserId());
                    AuthSignUpStep authSignUpStep2 = AuthSignUpStep.DONE;
                    if ((rr3Var != null ? rr3Var.m47083a() : null) != null) {
                    }
                    signUpEvent = new SignUpEvent(new SignUpEvent.EventType.SignedUp(signUpData2, new AuthSignUpResult(true, new AuthNextSignUpStep(authSignUpStep2, isa.m32681h(), null), signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getUserId())), null, 2, null);
                }
            } catch (Exception e4) {
                e = e4;
                authEnvironment = authEnvironment2;
                id = str;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            username = (String) c105061.L$4;
            authEnvironment = (AuthEnvironment) c105061.L$3;
            id = (String) c105061.L$2;
            eventDispatcher2 = (EventDispatcher) c105061.L$1;
            signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12 = (SignUpCognitoActions$confirmSignUpAction$$inlined$invoke$1) c105061.L$0;
            try {
                wre.m54934b(objG1);
                rr3Var = (rr3) objG1;
                SignUpData signUpData22 = new SignUpData(username, signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getValidationData(), signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getClientMetadata(), rr3Var != null ? rr3Var.m47083a() : null, signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getUserId());
                AuthSignUpStep authSignUpStep22 = AuthSignUpStep.DONE;
                if ((rr3Var != null ? rr3Var.m47083a() : null) != null) {
                    authSignUpStep22 = AuthSignUpStep.COMPLETE_AUTO_SIGN_IN;
                }
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.SignedUp(signUpData22, new AuthSignUpResult(true, new AuthNextSignUpStep(authSignUpStep22, isa.m32681h(), null), signUpCognitoActions$confirmSignUpAction$$inlined$invoke$12.$event$inlined.getSignUpData().getUserId())), null, 2, null);
            } catch (Exception e5) {
                e = e5;
                signUpEvent = new SignUpEvent(new SignUpEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signUpEvent.getType());
                eventDispatcher2.send(signUpEvent);
                return y3i.f54824a;
            }
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + signUpEvent.getType());
        eventDispatcher2.send(signUpEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
