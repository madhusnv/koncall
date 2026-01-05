package com.amplifyframework.auth.cognito;

import android.content.Context;
import bt.i0;
import com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import com.amplifyframework.statemachine.codegen.states.CredentialStoreState;
import ex.InterfaceC2139c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import qw.C6364n;
import qw.a0;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialStoreClient implements StoreClientBehavior {
    private final CredentialStoreStateMachine credentialStoreStateMachine;
    private final Logger logger;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class OneShotCredentialStoreStateListener {
        private Exception capturedError;
        private C6364n capturedSuccess;
        private final AtomicBoolean isActive;
        private final Logger logger;
        private final InterfaceC2139c onError;
        private final InterfaceC2139c onSuccess;

        public OneShotCredentialStoreStateListener(InterfaceC2139c onSuccess, InterfaceC2139c onError, Logger logger) {
            AbstractC4154l.m8923f(onSuccess, "onSuccess");
            AbstractC4154l.m8923f(onError, "onError");
            AbstractC4154l.m8923f(logger, "logger");
            this.onSuccess = onSuccess;
            this.onError = onError;
            this.logger = logger;
            this.isActive = new AtomicBoolean(true);
        }

        public final Logger getLogger() {
            return this.logger;
        }

        public final InterfaceC2139c getOnError() {
            return this.onError;
        }

        public final InterfaceC2139c getOnSuccess() {
            return this.onSuccess;
        }

        public final void listen(CredentialStoreState storeState) {
            AbstractC4154l.m8923f(storeState, "storeState");
            this.logger.verbose("Credential Store State Change: " + storeState);
            if (storeState instanceof CredentialStoreState.Success) {
                this.capturedSuccess = new C6364n(((CredentialStoreState.Success) storeState).getStoredCredentials());
                return;
            }
            if (storeState instanceof CredentialStoreState.Error) {
                this.capturedError = ((CredentialStoreState.Error) storeState).getError();
                return;
            }
            if (storeState instanceof CredentialStoreState.Idle) {
                C6364n c6364n = this.capturedSuccess;
                Exception exc = this.capturedError;
                if (!(c6364n == null && exc == null) && this.isActive.getAndSet(false)) {
                    if (c6364n != null) {
                        this.onSuccess.invoke(c6364n);
                    } else if (exc != null) {
                        this.onError.invoke(exc);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$1 */
    public static final /* synthetic */ class C10501 extends AbstractC4152j implements InterfaceC2139c {
        public C10501(Object obj) {
            super(1, 0, OneShotCredentialStoreStateListener.class, obj, "listen", "listen(Lcom/amplifyframework/statemachine/codegen/states/CredentialStoreState;)V");
        }

        @Override // ex.InterfaceC2139c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CredentialStoreState) obj);
            return a0.f30746a;
        }

        public final void invoke(CredentialStoreState p02) {
            AbstractC4154l.m8923f(p02, "p0");
            ((OneShotCredentialStoreStateListener) this.receiver).listen(p02);
        }
    }

    public CredentialStoreClient(AuthConfiguration configuration, Context context, Logger logger) {
        AbstractC4154l.m8923f(configuration, "configuration");
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(logger, "logger");
        this.logger = logger;
        this.credentialStoreStateMachine = createCredentialStoreStateMachine(configuration, context);
    }

    private final CredentialStoreStateMachine createCredentialStoreStateMachine(AuthConfiguration authConfiguration, Context context) {
        Context applicationContext = context.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "getApplicationContext(...)");
        AWSCognitoAuthCredentialStore aWSCognitoAuthCredentialStore = new AWSCognitoAuthCredentialStore(applicationContext, authConfiguration, null, 4, null);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext2, "getApplicationContext(...)");
        return new CredentialStoreStateMachine(new CredentialStoreEnvironment(aWSCognitoAuthCredentialStore, new AWSCognitoLegacyCredentialStore(applicationContext2, authConfiguration, null, 4, null), this.logger));
    }

    private final void listenForResult(CredentialStoreEvent credentialStoreEvent, final InterfaceC2139c interfaceC2139c, final InterfaceC2139c interfaceC2139c2) {
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        final int i10 = 0;
        InterfaceC2139c interfaceC2139c3 = new InterfaceC2139c(this) { // from class: com.amplifyframework.auth.cognito.a

            /* renamed from: b */
            public final /* synthetic */ CredentialStoreClient f5827b;

            {
                this.f5827b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return CredentialStoreClient.listenForResult$lambda$0(this.f5827b, stateChangeListenerToken, interfaceC2139c, (C6364n) obj);
                    default:
                        return CredentialStoreClient.listenForResult$lambda$1(this.f5827b, stateChangeListenerToken, interfaceC2139c, (Exception) obj);
                }
            }
        };
        final int i11 = 1;
        this.credentialStoreStateMachine.listen(stateChangeListenerToken, new C10501(new OneShotCredentialStoreStateListener(interfaceC2139c3, new InterfaceC2139c(this) { // from class: com.amplifyframework.auth.cognito.a

            /* renamed from: b */
            public final /* synthetic */ CredentialStoreClient f5827b;

            {
                this.f5827b = this;
            }

            @Override // ex.InterfaceC2139c
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return CredentialStoreClient.listenForResult$lambda$0(this.f5827b, stateChangeListenerToken, interfaceC2139c2, (C6364n) obj);
                    default:
                        return CredentialStoreClient.listenForResult$lambda$1(this.f5827b, stateChangeListenerToken, interfaceC2139c2, (Exception) obj);
                }
            }
        }, this.logger)), new i0(2, this, credentialStoreEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 listenForResult$lambda$0(CredentialStoreClient credentialStoreClient, StateChangeListenerToken stateChangeListenerToken, InterfaceC2139c interfaceC2139c, C6364n c6364n) {
        credentialStoreClient.credentialStoreStateMachine.cancel(stateChangeListenerToken);
        interfaceC2139c.invoke(c6364n);
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 listenForResult$lambda$1(CredentialStoreClient credentialStoreClient, StateChangeListenerToken stateChangeListenerToken, InterfaceC2139c interfaceC2139c, Exception it) {
        AbstractC4154l.m8923f(it, "it");
        credentialStoreClient.credentialStoreStateMachine.cancel(stateChangeListenerToken);
        interfaceC2139c.invoke(it);
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 listenForResult$lambda$2(CredentialStoreClient credentialStoreClient, CredentialStoreEvent credentialStoreEvent) {
        credentialStoreClient.credentialStoreStateMachine.send(credentialStoreEvent);
        return a0.f30746a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object clearCredentials(CredentialType credentialType, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.ClearCredentialStore(credentialType), null, 2, 0 == true ? 1 : 0), new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$clearCredentials$2$1
            @Override // ex.InterfaceC2139c
            public /* synthetic */ Object invoke(Object obj) {
                m16558invoke(((C6364n) obj).f30758a);
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16558invoke(Object obj) {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$clearCredentials$2$2
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Exception) obj);
                return a0.f30746a;
            }

            public final void invoke(Exception it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object loadCredentials(CredentialType credentialType, InterfaceC7559c<? super AmplifyCredential> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.LoadCredentialStore(credentialType), null, 2, 0 == true ? 1 : 0), new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$loadCredentials$2$1
            @Override // ex.InterfaceC2139c
            public /* synthetic */ Object invoke(Object obj) {
                m16559invoke(((C6364n) obj).f30758a);
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16559invoke(Object obj) {
                c7566j.resumeWith(obj);
            }
        }, new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$loadCredentials$2$2
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Exception) obj);
                return a0.f30746a;
            }

            public final void invoke(Exception it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object storeCredentials(CredentialType credentialType, AmplifyCredential amplifyCredential, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.StoreCredentials(credentialType, amplifyCredential), null, 2, 0 == true ? 1 : 0), new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$storeCredentials$2$1
            @Override // ex.InterfaceC2139c
            public /* synthetic */ Object invoke(Object obj) {
                m16560invoke(((C6364n) obj).f30758a);
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16560invoke(Object obj) {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new InterfaceC2139c() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$storeCredentials$2$2
            @Override // ex.InterfaceC2139c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Exception) obj);
                return a0.f30746a;
            }

            public final void invoke(Exception it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }
}
