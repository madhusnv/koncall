package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import org.objectweb.asm.TypeReference;
import p001o.fti;
import p001o.gti;
import p001o.hti;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.VerifyChallengeAnswer $eventType$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1", m36648f = "SetupTOTPCognitoActions.kt", m36649l = {TypeReference.METHOD_REFERENCE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1$1 */
    public static final class C104891 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C104891(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer) {
        this.$eventType$inlined = verifyChallengeAnswer;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[Catch: Exception -> 0x0046, TryCatch #2 {Exception -> 0x0046, blocks: (B:12:0x0041, B:27:0x00bd, B:32:0x00cb, B:34:0x00d3, B:35:0x00ef, B:36:0x0119), top: B:48:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119 A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #2 {Exception -> 0x0046, blocks: (B:12:0x0041, B:27:0x00bd, B:32:0x00cb, B:34:0x00d3, B:35:0x00ef, B:36:0x0119), top: B:48:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C104891 c104891;
        String id;
        EventDispatcher eventDispatcher2;
        SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher3;
        gti gtiVar;
        SetupTOTPEvent setupTOTPEvent;
        if (n64Var instanceof C104891) {
            c104891 = (C104891) n64Var;
            int i = c104891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104891.label = i - Integer.MIN_VALUE;
            } else {
                c104891 = new C104891(n64Var);
            }
        }
        Object obj = c104891.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104891.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            AuthEnvironment authEnvironment2 = (AuthEnvironment) environment;
            authEnvironment2.getLogger().verbose(id + " Starting execution");
            try {
                kg3 cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    fti.C13554a c13554a = new fti.C13554a();
                    c13554a.m27485i(this.$eventType$inlined.getAnswer());
                    c13554a.m27484h(this.$eventType$inlined.getSession());
                    c13554a.m27483g(this.$eventType$inlined.getFriendlyDeviceName());
                    fti ftiVarM27477a = c13554a.m27477a();
                    c104891.L$0 = this;
                    eventDispatcher2 = eventDispatcher;
                    try {
                        c104891.L$1 = eventDispatcher2;
                        c104891.L$2 = id;
                        c104891.L$3 = authEnvironment2;
                        c104891.label = 1;
                        Object objX0 = cognitoIdentityProviderClient.x0(ftiVarM27477a, c104891);
                        if (objX0 == objM51918f) {
                            return objM51918f;
                        }
                        setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = this;
                        authEnvironment = authEnvironment2;
                        eventDispatcher3 = eventDispatcher2;
                        obj = objX0;
                        gtiVar = (gti) obj;
                        if (gtiVar != null) {
                        }
                    } catch (Exception e) {
                        e = e;
                        setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = this;
                        authEnvironment = authEnvironment2;
                        eventDispatcher3 = eventDispatcher2;
                        setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                        authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
                        eventDispatcher3.send(setupTOTPEvent);
                        return y3i.f54824a;
                    }
                } else {
                    setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = this;
                    authEnvironment = authEnvironment2;
                    gtiVar = null;
                    eventDispatcher3 = eventDispatcher;
                    if (gtiVar != null) {
                    }
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) c104891.L$3;
            id = (String) c104891.L$2;
            eventDispatcher3 = (EventDispatcher) c104891.L$1;
            setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1 = (SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1) c104891.L$0;
            try {
                wre.m54934b(obj);
                gtiVar = (gti) obj;
                setupTOTPEvent = gtiVar != null ? gtiVar.m29483b() instanceof hti.C14077d ? new SetupTOTPEvent(new SetupTOTPEvent.EventType.RespondToAuthChallenge(setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), gtiVar.m29482a(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null) : new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new ServiceException("An unknown service error has occurred", "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null) : new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new Exception("Software token verification failed"), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
            } catch (Exception e3) {
                e = e3;
                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSession(), setupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
                eventDispatcher3.send(setupTOTPEvent);
                return y3i.f54824a;
            }
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
        eventDispatcher3.send(setupTOTPEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
