package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.JWTParser;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import org.objectweb.asm.TypeReference;
import p001o.kg3;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.ote;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignOutEvent.EventType.RevokeToken $event$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1", m36648f = "SignOutCognitoActions.kt", m36649l = {TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1$1 */
    public static final class C105051 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C105051(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1(String str, SignOutEvent.EventType.RevokeToken revokeToken) {
        this.$event$inlined = revokeToken;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C105051 c105051;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        Exception e;
        SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1 signOutCognitoActions$revokeTokenAction$$inlined$invoke$1;
        AuthEnvironment authEnvironment2;
        String str;
        SignOutEvent signOutEvent;
        EventDispatcher eventDispatcher3;
        if (n64Var instanceof C105051) {
            c105051 = (C105051) n64Var;
            int i = c105051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105051.label = i - Integer.MIN_VALUE;
            } else {
                c105051 = new C105051(n64Var);
            }
        }
        Object obj = c105051.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c105051.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            String accessToken = this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getAccessToken();
            String refreshToken = this.$event$inlined.getSignedInData().getCognitoUserPoolTokens().getRefreshToken();
            eventDispatcher2 = null;
            if (accessToken != null) {
                try {
                    if (JWTParser.INSTANCE.hasClaim(accessToken, "origin_jti")) {
                        eventDispatcher2 = 1;
                    }
                } catch (Exception e2) {
                    e = e2;
                    eventDispatcher2 = eventDispatcher;
                    signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = this;
                    authEnvironment2 = authEnvironment;
                    str = refreshToken;
                    authEnvironment2.getLogger().warn("Failed to revoke tokens.", e);
                    signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(str, e)), null, 2, null);
                    authEnvironment = authEnvironment2;
                    eventDispatcher3 = eventDispatcher2;
                    authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                    eventDispatcher3.send(signOutEvent);
                    return y3i.f54824a;
                }
            }
            try {
            } catch (Exception e3) {
                e = e3;
                signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = this;
                authEnvironment2 = authEnvironment;
                str = refreshToken;
                authEnvironment2.getLogger().warn("Failed to revoke tokens.", e);
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(str, e)), null, 2, null);
                authEnvironment = authEnvironment2;
                eventDispatcher3 = eventDispatcher2;
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return y3i.f54824a;
            }
            if (eventDispatcher2 == null) {
                eventDispatcher2 = eventDispatcher;
                authEnvironment.getLogger().debug("Access Token does not contain `origin_jti` claim. Skip revoking tokens.");
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(this.$event$inlined.getSignedInData(), this.$event$inlined.getHostedUIErrorData(), this.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(refreshToken, new Exception("Access Token does not contain `origin_jti` claim. Skip revoking tokens."))), null, 2, null);
                eventDispatcher3 = eventDispatcher2;
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return y3i.f54824a;
            }
            kg3 cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient == null) {
                signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = this;
                authEnvironment2 = authEnvironment;
                str = refreshToken;
                eventDispatcher3 = eventDispatcher;
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, null, 12, null), null, 2, null);
                authEnvironment = authEnvironment2;
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return y3i.f54824a;
            }
            ote oteVarM42673a = ote.f38888d.m42673a(new SignOutCognitoActions$revokeTokenAction$1$evt$2(authEnvironment, refreshToken));
            c105051.L$0 = this;
            c105051.L$1 = eventDispatcher;
            c105051.L$2 = id;
            c105051.L$3 = authEnvironment;
            c105051.L$4 = refreshToken;
            c105051.label = 1;
            Object objT0 = cognitoIdentityProviderClient.t0(oteVarM42673a, c105051);
            if (objT0 == objM51918f) {
                return objM51918f;
            }
            signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = this;
            authEnvironment2 = authEnvironment;
            str = refreshToken;
            eventDispatcher3 = eventDispatcher;
            obj = objT0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c105051.L$4;
            authEnvironment2 = (AuthEnvironment) c105051.L$3;
            id = (String) c105051.L$2;
            eventDispatcher3 = (EventDispatcher) c105051.L$1;
            signOutCognitoActions$revokeTokenAction$$inlined$invoke$1 = (SignOutCognitoActions$revokeTokenAction$$inlined$invoke$1) c105051.L$0;
            try {
                wre.m54934b(obj);
            } catch (Exception e4) {
                e = e4;
                eventDispatcher2 = eventDispatcher3;
                authEnvironment2.getLogger().warn("Failed to revoke tokens.", e);
                signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getGlobalSignOutErrorData(), new RevokeTokenErrorData(str, e)), null, 2, null);
                authEnvironment = authEnvironment2;
                eventDispatcher3 = eventDispatcher2;
                authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
                eventDispatcher3.send(signOutEvent);
                return y3i.f54824a;
            }
        }
        signOutEvent = new SignOutEvent(new SignOutEvent.EventType.SignOutLocally(signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getSignedInData(), signOutCognitoActions$revokeTokenAction$$inlined$invoke$1.$event$inlined.getHostedUIErrorData(), null, null, 12, null), null, 2, null);
        authEnvironment = authEnvironment2;
        authEnvironment.getLogger().verbose(id + " Sending event " + signOutEvent.getType());
        eventDispatcher3.send(signOutEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
