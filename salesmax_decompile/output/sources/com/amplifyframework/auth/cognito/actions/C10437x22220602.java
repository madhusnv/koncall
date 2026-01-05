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

/* renamed from: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1 */
/* loaded from: classes5.dex */
public final class C10437x22220602 implements Action {
    private final String id;

    @l75(m36647c = "com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1", m36648f = "AuthCognitoActions.kt", m36649l = {TypeReference.NEW}, m36650m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthConfigurationAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C10437x22220602.this.execute(null, null, this);
        }
    }

    public C10437x22220602(String str) {
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        AnonymousClass1 anonymousClass1;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        String str;
        if (n64Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) n64Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(n64Var);
            }
        }
        Object obj = anonymousClass1.result;
        Object objM51918f = uq8.m51918f();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
            String id = getId();
            AuthEnvironment authEnvironment2 = (AuthEnvironment) environment;
            authEnvironment2.getLogger().verbose(id + " Starting execution");
            StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
            CredentialType.Amplify amplify = CredentialType.Amplify.INSTANCE;
            anonymousClass1.L$0 = eventDispatcher;
            anonymousClass1.L$1 = id;
            anonymousClass1.L$2 = authEnvironment2;
            anonymousClass1.label = 1;
            Object objLoadCredentials = credentialStoreClient.loadCredentials(amplify, anonymousClass1);
            if (objLoadCredentials == objM51918f) {
                return objM51918f;
            }
            eventDispatcher2 = eventDispatcher;
            authEnvironment = authEnvironment2;
            str = id;
            obj = objLoadCredentials;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) anonymousClass1.L$2;
            str = (String) anonymousClass1.L$1;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$0;
            wre.m54934b(obj);
        }
        AmplifyCredential amplifyCredential = (AmplifyCredential) obj;
        AuthEvent authEvent = authEnvironment.getConfiguration().getUserPool() != null ? new AuthEvent(new AuthEvent.EventType.ConfigureAuthentication(authEnvironment.getConfiguration(), amplifyCredential), null, 2, null) : new AuthEvent(new AuthEvent.EventType.ConfigureAuthorization(authEnvironment.getConfiguration(), amplifyCredential), null, 2, null);
        authEnvironment.getLogger().verbose(str + " Sending event " + authEvent.getType());
        eventDispatcher2.send(authEvent);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
