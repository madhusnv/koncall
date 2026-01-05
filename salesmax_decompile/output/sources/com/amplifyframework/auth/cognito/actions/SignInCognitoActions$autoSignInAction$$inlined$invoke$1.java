package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.isa;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.sz0;
import p001o.uq8;
import p001o.vyh;
import p001o.wi8;
import p001o.wre;
import p001o.xi8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignInCognitoActions$autoSignInAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignInEvent.EventType.InitiateAutoSignIn $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignInCognitoActions$autoSignInAction$$inlined$invoke$1", m36648f = "SignInCognitoActions.kt", m36649l = {Opcodes.FASTORE, Opcodes.CASTORE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$autoSignInAction$$inlined$invoke$1$1 */
    public static final class C104951 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C104951(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignInCognitoActions$autoSignInAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignInCognitoActions$autoSignInAction$$inlined$invoke$1(String str, SignInEvent.EventType.InitiateAutoSignIn initiateAutoSignIn) {
        this.$event$inlined = initiateAutoSignIn;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011c A[Catch: Exception -> 0x01cc, TryCatch #2 {Exception -> 0x01cc, blocks: (B:46:0x010c, B:48:0x011c, B:50:0x0130, B:52:0x0136, B:54:0x014b, B:56:0x0155, B:57:0x015d), top: B:83:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192 A[Catch: Exception -> 0x018a, TryCatch #3 {Exception -> 0x018a, blocks: (B:61:0x0185, B:66:0x0192, B:67:0x01ba, B:68:0x01cb), top: B:85:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba A[Catch: Exception -> 0x018a, TryCatch #3 {Exception -> 0x018a, blocks: (B:61:0x0185, B:66:0x0192, B:67:0x01ba, B:68:0x01cb), top: B:85:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) throws ServiceException {
        C104951 c104951;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher3;
        String username;
        String appClient;
        Map mapM32685l;
        SignInCognitoActions$autoSignInAction$$inlined$invoke$1 signInCognitoActions$autoSignInAction$$inlined$invoke$1;
        AuthEnvironment authEnvironment2;
        kg3 cognitoIdentityProviderClient;
        String str;
        xi8 xi8Var;
        StateMachineEvent authenticationEvent;
        if (n64Var instanceof C104951) {
            c104951 = (C104951) n64Var;
            int i = c104951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104951.label = i - Integer.MIN_VALUE;
            } else {
                c104951 = new C104951(n64Var);
            }
        }
        Object objI0 = c104951.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104951.label;
        if (i2 != 0) {
            if (i2 == 1) {
                Map map = (Map) c104951.L$5;
                String str2 = (String) c104951.L$4;
                authEnvironment2 = (AuthEnvironment) c104951.L$3;
                String str3 = (String) c104951.L$2;
                eventDispatcher3 = (EventDispatcher) c104951.L$1;
                signInCognitoActions$autoSignInAction$$inlined$invoke$1 = (SignInCognitoActions$autoSignInAction$$inlined$invoke$1) c104951.L$0;
                try {
                    wre.m54934b(objI0);
                    mapM32685l = map;
                    username = str2;
                    id = str3;
                    try {
                        String str4 = (String) objI0;
                        String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                        cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                        if (cognitoIdentityProviderClient == null) {
                            wi8.C17918a c17918a = new wi8.C17918a();
                            c17918a.m54591j(sz0.C16941g.f46139c);
                            UserPoolConfiguration userPool = authEnvironment2.getConfiguration().getUserPool();
                            c17918a.m54593l(userPool != null ? userPool.getAppClient() : null);
                            c17918a.m54592k(mapM32685l);
                            c17918a.m54594m(signInCognitoActions$autoSignInAction$$inlined$invoke$1.$event$inlined.getSignInData().getMetadata());
                            if (pinpointEndpointId != null) {
                                c17918a.m54582a(new SignInCognitoActions$autoSignInAction$1$evt$response$1$1$1(pinpointEndpointId));
                            }
                            if (str4 != null) {
                                c17918a.m54596o(new SignInCognitoActions$autoSignInAction$1$evt$response$1$2$1(str4));
                            }
                            c17918a.m54595n(signInCognitoActions$autoSignInAction$$inlined$invoke$1.$event$inlined.getSignInData().getSession());
                            wi8 wi8VarM54583b = c17918a.m54583b();
                            c104951.L$0 = eventDispatcher3;
                            c104951.L$1 = id;
                            c104951.L$2 = authEnvironment2;
                            c104951.L$3 = username;
                            c104951.L$4 = null;
                            c104951.L$5 = null;
                            c104951.label = 2;
                            objI0 = cognitoIdentityProviderClient.i0(wi8VarM54583b, c104951);
                            if (objI0 == objM51918f) {
                                return objM51918f;
                            }
                            authEnvironment = authEnvironment2;
                            xi8Var = (xi8) objI0;
                            str = username;
                            if (xi8Var == null) {
                            }
                        } else {
                            str = username;
                            xi8Var = null;
                            authEnvironment = authEnvironment2;
                            if (xi8Var == null) {
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        authEnvironment = authEnvironment2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    authEnvironment = authEnvironment2;
                    id = str3;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                username = (String) c104951.L$3;
                authEnvironment = (AuthEnvironment) c104951.L$2;
                id = (String) c104951.L$1;
                EventDispatcher eventDispatcher4 = (EventDispatcher) c104951.L$0;
                try {
                    wre.m54934b(objI0);
                    eventDispatcher3 = eventDispatcher4;
                    try {
                        xi8Var = (xi8) objI0;
                        str = username;
                        if (xi8Var == null) {
                            throw new ServiceException("Sign in failed", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
                        }
                        authenticationEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(str, xi8Var.m56336c(), xi8Var.m56338e(), (80 & 8) != 0 ? null : xi8Var.m56337d(), (80 & 16) != 0 ? null : null, xi8Var.m56334a(), (80 & 64) != 0 ? new WeakReference(null) : null, new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_AUTH));
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    eventDispatcher3 = eventDispatcher4;
                }
            }
            SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent.getType());
            eventDispatcher3.send(signInEvent);
            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
        } else {
            wre.m54934b(objI0);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            AuthEnvironment authEnvironment3 = (AuthEnvironment) environment;
            authEnvironment3.getLogger().verbose(id + " Starting execution");
            try {
                username = this.$event$inlined.getSignInData().getUsername();
                AuthHelper.Companion companion = AuthHelper.Companion;
                UserPoolConfiguration userPool2 = authEnvironment3.getConfiguration().getUserPool();
                if (userPool2 != null) {
                    try {
                        appClient = userPool2.getAppClient();
                    } catch (Exception e5) {
                        e = e5;
                        eventDispatcher3 = eventDispatcher;
                        authEnvironment = authEnvironment3;
                    }
                } else {
                    appClient = null;
                }
                UserPoolConfiguration userPool3 = authEnvironment3.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username, appClient, userPool3 != null ? userPool3.getAppClientSecret() : null);
                mapM32685l = isa.m32685l(vyh.m53620a("USERNAME", username));
                if (secretHash != null) {
                    mapM32685l.put("SECRET_HASH", secretHash);
                }
                c104951.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    c104951.L$1 = eventDispatcher2;
                    c104951.L$2 = id;
                    c104951.L$3 = authEnvironment3;
                    c104951.L$4 = username;
                    c104951.L$5 = mapM32685l;
                    c104951.label = 1;
                    Object userContextData = authEnvironment3.getUserContextData(username, c104951);
                    if (userContextData == objM51918f) {
                        return objM51918f;
                    }
                    signInCognitoActions$autoSignInAction$$inlined$invoke$1 = this;
                    authEnvironment2 = authEnvironment3;
                    objI0 = userContextData;
                    eventDispatcher3 = eventDispatcher2;
                    String str42 = (String) objI0;
                    String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                    }
                } catch (Exception e6) {
                    e = e6;
                    authEnvironment = authEnvironment3;
                    eventDispatcher3 = eventDispatcher2;
                    SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent2.getType());
                    eventDispatcher3.send(signInEvent2);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return y3i.f54824a;
                }
            } catch (Exception e7) {
                e = e7;
                eventDispatcher2 = eventDispatcher;
            }
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
        eventDispatcher3.send(authenticationEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
