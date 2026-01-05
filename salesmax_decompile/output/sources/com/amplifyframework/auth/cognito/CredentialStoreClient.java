package com.amplifyframework.auth.cognito;

import android.content.Context;
import com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import com.amplifyframework.statemachine.codegen.states.CredentialStoreState;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.a0f;
import p001o.dm7;
import p001o.kf9;
import p001o.n64;
import p001o.n75;
import p001o.sq8;
import p001o.tq8;
import p001o.uk7;
import p001o.uq8;
import p001o.vre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class CredentialStoreClient implements StoreClientBehavior {
    private final CredentialStoreStateMachine credentialStoreStateMachine;
    private final Logger logger;

    public static final class OneShotCredentialStoreStateListener {
        private Exception capturedError;
        private vre capturedSuccess;
        private final AtomicBoolean isActive;
        private final Logger logger;
        private final xk7 onError;
        private final xk7 onSuccess;

        public OneShotCredentialStoreStateListener(xk7 xk7Var, xk7 xk7Var2, Logger logger) {
            sq8.m48649h(xk7Var, "onSuccess");
            sq8.m48649h(xk7Var2, "onError");
            sq8.m48649h(logger, "logger");
            this.onSuccess = xk7Var;
            this.onError = xk7Var2;
            this.logger = logger;
            this.isActive = new AtomicBoolean(true);
        }

        public final Logger getLogger() {
            return this.logger;
        }

        public final xk7 getOnError() {
            return this.onError;
        }

        public final xk7 getOnSuccess() {
            return this.onSuccess;
        }

        public final void listen(CredentialStoreState credentialStoreState) {
            sq8.m48649h(credentialStoreState, "storeState");
            this.logger.verbose("Credential Store State Change: " + credentialStoreState);
            if (credentialStoreState instanceof CredentialStoreState.Success) {
                vre.C17665a c17665a = vre.f50797b;
                this.capturedSuccess = vre.m53350a(vre.m53351b(((CredentialStoreState.Success) credentialStoreState).getStoredCredentials()));
                return;
            }
            if (credentialStoreState instanceof CredentialStoreState.Error) {
                this.capturedError = ((CredentialStoreState.Error) credentialStoreState).getError();
                return;
            }
            if (credentialStoreState instanceof CredentialStoreState.Idle) {
                vre vreVar = this.capturedSuccess;
                Exception exc = this.capturedError;
                if (!(vreVar == null && exc == null) && this.isActive.getAndSet(false)) {
                    if (vreVar != null) {
                        this.onSuccess.invoke(vreVar);
                    } else if (exc != null) {
                        this.onError.invoke(exc);
                    }
                }
            }
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$1 */
    public /* synthetic */ class C103851 extends dm7 implements xk7 {
        public C103851(Object obj) {
            super(1, obj, OneShotCredentialStoreStateListener.class, "listen", "listen(Lcom/amplifyframework/statemachine/codegen/states/CredentialStoreState;)V", 0);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CredentialStoreState) obj);
            return y3i.f54824a;
        }

        public final void invoke(CredentialStoreState credentialStoreState) {
            sq8.m48649h(credentialStoreState, "p0");
            ((OneShotCredentialStoreStateListener) this.receiver).listen(credentialStoreState);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$2 */
    public static final class C103862 extends kf9 implements uk7 {
        final /* synthetic */ CredentialStoreEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103862(CredentialStoreEvent credentialStoreEvent) {
            super(0);
            this.$event = credentialStoreEvent;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68715invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68715invoke() {
            CredentialStoreClient.this.credentialStoreStateMachine.send(this.$event);
        }
    }

    public CredentialStoreClient(AuthConfiguration authConfiguration, Context context, Logger logger) {
        sq8.m48649h(authConfiguration, "configuration");
        sq8.m48649h(context, "context");
        sq8.m48649h(logger, "logger");
        this.logger = logger;
        this.credentialStoreStateMachine = createCredentialStoreStateMachine(authConfiguration, context);
    }

    private final CredentialStoreStateMachine createCredentialStoreStateMachine(AuthConfiguration authConfiguration, Context context) {
        Context applicationContext = context.getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        AWSCognitoAuthCredentialStore aWSCognitoAuthCredentialStore = new AWSCognitoAuthCredentialStore(applicationContext, authConfiguration, null, 4, null);
        Context applicationContext2 = context.getApplicationContext();
        sq8.m48648g(applicationContext2, "getApplicationContext(...)");
        return new CredentialStoreStateMachine(new CredentialStoreEnvironment(aWSCognitoAuthCredentialStore, new AWSCognitoLegacyCredentialStore(applicationContext2, authConfiguration, null, 4, null), this.logger));
    }

    private final void listenForResult(CredentialStoreEvent credentialStoreEvent, xk7 xk7Var, xk7 xk7Var2) {
        StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.credentialStoreStateMachine.listen(stateChangeListenerToken, new C103851(new OneShotCredentialStoreStateListener(new C10387xd9b9a9fc(this, stateChangeListenerToken, xk7Var), new C10388xd9b9a9fd(this, stateChangeListenerToken, xk7Var2), this.logger)), new C103862(credentialStoreEvent));
    }

    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object clearCredentials(CredentialType credentialType, n64 n64Var) throws Throwable {
        a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.ClearCredentialStore(credentialType), null, 2, null), new CredentialStoreClient$clearCredentials$2$1(a0fVar), new CredentialStoreClient$clearCredentials$2$2(a0fVar));
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object loadCredentials(CredentialType credentialType, n64 n64Var) throws Throwable {
        a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.LoadCredentialStore(credentialType), null, 2, null), new CredentialStoreClient$loadCredentials$2$1(a0fVar), new CredentialStoreClient$loadCredentials$2$2(a0fVar));
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object storeCredentials(CredentialType credentialType, AmplifyCredential amplifyCredential, n64 n64Var) throws Throwable {
        a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.StoreCredentials(credentialType, amplifyCredential), null, 2, null), new CredentialStoreClient$storeCredentials$2$1(a0fVar), new CredentialStoreClient$storeCredentials$2$2(a0fVar));
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }
}
