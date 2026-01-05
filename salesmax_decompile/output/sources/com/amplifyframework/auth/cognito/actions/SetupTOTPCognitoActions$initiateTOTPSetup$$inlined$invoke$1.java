package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import org.objectweb.asm.TypeReference;
import p001o.br0;
import p001o.cr0;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.SetupTOTP $eventType$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1", m36648f = "SetupTOTPCognitoActions.kt", m36649l = {TypeReference.METHOD_REFERENCE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1$1 */
    public static final class C104871 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C104871(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.SetupTOTP setupTOTP) {
        this.$eventType$inlined = setupTOTP;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[Catch: Exception -> 0x00ad, TryCatch #1 {Exception -> 0x00ad, blocks: (B:25:0x00aa, B:30:0x00b3, B:32:0x00b9, B:33:0x00e3), top: B:42:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[Catch: Exception -> 0x00ad, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ad, blocks: (B:25:0x00aa, B:30:0x00b3, B:32:0x00b9, B:33:0x00e3), top: B:42:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C104871 c104871;
        String id;
        AuthEnvironment authEnvironment;
        SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1;
        cr0 cr0Var;
        Object objD0;
        SetupTOTPEvent setupTOTPEvent;
        String strM21595a;
        if (n64Var instanceof C104871) {
            c104871 = (C104871) n64Var;
            int i = c104871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104871.label = i - Integer.MIN_VALUE;
            } else {
                c104871 = new C104871(n64Var);
            }
        }
        Object obj = c104871.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104871.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                kg3 cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    br0.C12477a c12477a = new br0.C12477a();
                    c12477a.m19616e(this.$eventType$inlined.getTotpSetupDetails().getSession());
                    br0 br0VarM19612a = c12477a.m19612a();
                    c104871.L$0 = this;
                    c104871.L$1 = eventDispatcher;
                    c104871.L$2 = id;
                    c104871.L$3 = authEnvironment;
                    c104871.label = 1;
                    objD0 = cognitoIdentityProviderClient.D0(br0VarM19612a, c104871);
                    if (objD0 == objM51918f) {
                        return objM51918f;
                    }
                    setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = this;
                    cr0Var = (cr0) objD0;
                    if (cr0Var == null) {
                    }
                } else {
                    setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = this;
                    cr0Var = null;
                    if (cr0Var == null) {
                    }
                }
            } catch (Exception e) {
                e = e;
                setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = this;
                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getSession(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
                eventDispatcher.send(setupTOTPEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AuthEnvironment authEnvironment2 = (AuthEnvironment) c104871.L$3;
            String str = (String) c104871.L$2;
            EventDispatcher eventDispatcher2 = (EventDispatcher) c104871.L$1;
            SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12 = (SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1) c104871.L$0;
            try {
                wre.m54934b(obj);
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
                setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12;
                objD0 = obj;
                id = str;
                try {
                    cr0Var = (cr0) objD0;
                    setupTOTPEvent = (cr0Var == null || (strM21595a = cr0Var.m21595a()) == null) ? new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new Exception("Software token setup failed"), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getSession(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null) : new SetupTOTPEvent(new SetupTOTPEvent.EventType.WaitForAnswer(new SignInTOTPSetupData(strM21595a, cr0Var.m21596b(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getUsername()), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getChallengeParams(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                } catch (Exception e2) {
                    e = e2;
                    setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getSession(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
                    eventDispatcher.send(setupTOTPEvent);
                    return y3i.f54824a;
                }
            } catch (Exception e3) {
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
                setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1 = setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$12;
                e = e3;
                id = str;
                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getUsername(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getTotpSetupDetails().getSession(), setupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1.$eventType$inlined.getSignInMethod()), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
                eventDispatcher.send(setupTOTPEvent);
                return y3i.f54824a;
            }
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + setupTOTPEvent.getType());
        eventDispatcher.send(setupTOTPEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
