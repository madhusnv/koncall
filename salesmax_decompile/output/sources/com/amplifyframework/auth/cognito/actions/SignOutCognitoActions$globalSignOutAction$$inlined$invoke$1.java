package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import org.objectweb.asm.TypeReference;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.pt7;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignOutEvent.EventType.SignOutGlobally $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1", m36648f = "SignOutCognitoActions.kt", m36649l = {TypeReference.METHOD_REFERENCE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1$1 */
    public static final class C105041 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C105041(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1(String str, SignOutEvent.EventType.SignOutGlobally signOutGlobally) {
        this.$event$inlined = signOutGlobally;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C105041 c105041;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1 signOutCognitoActions$globalSignOutAction$$inlined$invoke$1;
        String str;
        String str2;
        kg3 cognitoIdentityProviderClient;
        EventDispatcher eventDispatcher3;
        SignOutEvent signOutEvent;
        if (n64Var instanceof C105041) {
            c105041 = (C105041) n64Var;
            int i = c105041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105041.label = i - Integer.MIN_VALUE;
            } else {
                c105041 = new C105041(n64Var);
            }
        }
        Object obj = c105041.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105041.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            String accessToken = this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getAccessToken();
            try {
                cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            } catch (Exception e) {
                e = e;
                eventDispatcher2 = eventDispatcher;
            }
            if (cognitoIdentityProviderClient == null) {
                signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = this;
                str = id;
                str2 = accessToken;
                eventDispatcher3 = eventDispatcher;
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.RevokeToken(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, 4, null), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return y3i.f54824a;
            }
            pt7 pt7VarM44144a = pt7.f40533b.m44144a(new SignOutCognitoActions$globalSignOutAction$1$evt$1(accessToken));
            c105041.L$0 = this;
            eventDispatcher2 = eventDispatcher;
            try {
                c105041.L$1 = eventDispatcher2;
                c105041.L$2 = id;
                c105041.L$3 = authEnvironment;
                c105041.L$4 = accessToken;
                c105041.label = 1;
                Object objU2 = cognitoIdentityProviderClient.u2(pt7VarM44144a, c105041);
                if (objU2 == objM51918f) {
                    return objM51918f;
                }
                signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = this;
                str = id;
                str2 = accessToken;
                eventDispatcher3 = eventDispatcher2;
                obj = objU2;
            } catch (Exception e2) {
                e = e2;
                signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = this;
                str = id;
                str2 = accessToken;
                authEnvironment.getLogger().warn("Failed to sign out globally.", e);
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutGloballyError(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), new GlobalSignOutErrorData(str2, e)), null, 2, null);
                eventDispatcher3 = eventDispatcher2;
                authEnvironment.getLogger().verbose(str + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) c105041.L$4;
            authEnvironment = (AuthEnvironment) c105041.L$3;
            str = (String) c105041.L$2;
            eventDispatcher3 = (EventDispatcher) c105041.L$1;
            signOutCognitoActions$globalSignOutAction$$inlined$invoke$1 = (SignOutCognitoActions$globalSignOutAction$$inlined$invoke$1) c105041.L$0;
            try {
                wre.m54934b(obj);
            } catch (Exception e3) {
                e = e3;
                eventDispatcher2 = eventDispatcher3;
                authEnvironment.getLogger().warn("Failed to sign out globally.", e);
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutGloballyError(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), new GlobalSignOutErrorData(str2, e)), null, 2, null);
                eventDispatcher3 = eventDispatcher2;
                authEnvironment.getLogger().verbose(str + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return y3i.f54824a;
            }
        }
        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.RevokeToken(signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$globalSignOutAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, 4, null), null, 2, null);
        authEnvironment.getLogger().verbose(str + " Sending event " + signOutEvent.getType());
        eventDispatcher3.send(signOutEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
