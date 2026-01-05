package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import org.objectweb.asm.TypeReference;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1 implements Action {
    final /* synthetic */ AmplifyCredential $amplifyCredential$inlined;
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1", m36648f = "AuthorizationCognitoActions.kt", m36649l = {TypeReference.CONSTRUCTOR_REFERENCE}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1$1 */
    public static final class C104491 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C104491(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    public AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1(String str, AmplifyCredential amplifyCredential) {
        this.$amplifyCredential$inlined = amplifyCredential;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        C104491 c104491;
        String id;
        AuthEnvironment authEnvironment;
        AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1 authorizationCognitoActions$persistCredentials$$inlined$invoke$1;
        AuthEvent authEvent;
        if (n64Var instanceof C104491) {
            c104491 = (C104491) n64Var;
            int i = c104491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104491.label = i - Integer.MIN_VALUE;
            } else {
                c104491 = new C104491(n64Var);
            }
        }
        Object obj = c104491.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c104491.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
                CredentialType.Amplify amplify = CredentialType.Amplify.INSTANCE;
                AmplifyCredential amplifyCredential = this.$amplifyCredential$inlined;
                c104491.L$0 = this;
                c104491.L$1 = eventDispatcher;
                c104491.L$2 = id;
                c104491.L$3 = authEnvironment;
                c104491.label = 1;
                if (credentialStoreClient.storeCredentials(amplify, amplifyCredential, c104491) == objM51918f) {
                    return objM51918f;
                }
                authorizationCognitoActions$persistCredentials$$inlined$invoke$1 = this;
            } catch (Exception unused) {
                authEvent = new AuthEvent(AuthEvent.EventType.CachedCredentialsFailed.INSTANCE, null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authEvent.getType());
                eventDispatcher.send(authEvent);
                return y3i.f54824a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AuthEnvironment authEnvironment2 = (AuthEnvironment) c104491.L$3;
            String str = (String) c104491.L$2;
            EventDispatcher eventDispatcher2 = (EventDispatcher) c104491.L$1;
            authorizationCognitoActions$persistCredentials$$inlined$invoke$1 = (AuthorizationCognitoActions$persistCredentials$$inlined$invoke$1) c104491.L$0;
            try {
                wre.m54934b(obj);
                id = str;
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
            } catch (Exception unused2) {
                id = str;
                authEnvironment = authEnvironment2;
                eventDispatcher = eventDispatcher2;
                authEvent = new AuthEvent(AuthEvent.EventType.CachedCredentialsFailed.INSTANCE, null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authEvent.getType());
                eventDispatcher.send(authEvent);
                return y3i.f54824a;
            }
        }
        authEvent = new AuthEvent(new AuthEvent.EventType.ReceivedCachedCredentials(authorizationCognitoActions$persistCredentials$$inlined$invoke$1.$amplifyCredential$inlined), null, 2, null);
        authEnvironment.getLogger().verbose(id + " Sending event " + authEvent.getType());
        eventDispatcher.send(authEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
