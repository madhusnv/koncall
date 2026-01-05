package com.amplifyframework.statemachine;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.State;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.cqb;
import p001o.e47;
import p001o.eu5;
import p001o.gdg;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.pm1;
import p001o.q4g;
import p001o.q74;
import p001o.rm1;
import p001o.s4g;
import p001o.sq8;
import p001o.uk7;
import p001o.uq8;
import p001o.wkh;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;
import p001o.z74;

/* loaded from: classes5.dex */
public class StateMachine<StateType extends State, EnvironmentType extends Environment> implements EventDispatcher {
    private final cqb _state;
    private final z74 dispatcherQueue;
    private final EnvironmentType environment;
    private final EffectExecutor executor;
    private final Set<StateChangeListenerToken> pendingCancellations;
    private final AnyResolver<StateType, ?> resolver;
    private final q4g state;
    private final q74 stateMachineContext;
    private final h84 stateMachineScope;
    private final Map<StateChangeListenerToken, xk7> subscribers;

    @l75(m36647c = "com.amplifyframework.statemachine.StateMachine$addSubscription$1", m36648f = "StateMachine.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$addSubscription$1 */
    public static final class C106721 extends jgg implements nl7 {
        final /* synthetic */ StateType $currentState;
        final /* synthetic */ xk7 $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106721(xk7 xk7Var, StateType statetype, n64 n64Var) {
            super(2, n64Var);
            this.$listener = xk7Var;
            this.$currentState = statetype;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106721(this.$listener, this.$currentState, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.$listener.invoke(this.$currentState);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106721) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.statemachine.StateMachine$cancel$1", m36648f = "StateMachine.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$cancel$1 */
    public static final class C106731 extends jgg implements nl7 {
        final /* synthetic */ StateChangeListenerToken $token;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106731(StateMachine<StateType, EnvironmentType> stateMachine, StateChangeListenerToken stateChangeListenerToken, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = stateMachine;
            this.$token = stateChangeListenerToken;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106731(this.this$0, this.$token, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.this$0.removeSubscription(this.$token);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106731) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.statemachine.StateMachine$getCurrentState$1", m36648f = "StateMachine.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$getCurrentState$1 */
    public static final class C106741 extends jgg implements nl7 {
        final /* synthetic */ xk7 $completion;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106741(xk7 xk7Var, StateMachine<StateType, EnvironmentType> stateMachine, n64 n64Var) {
            super(2, n64Var);
            this.$completion = xk7Var;
            this.this$0 = stateMachine;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106741(this.$completion, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.$completion.invoke(this.this$0.getCurrentState());
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106741) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.statemachine.StateMachine$getCurrentState$3", m36648f = "StateMachine.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$getCurrentState$3 */
    public static final class C106753 extends jgg implements nl7 {
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106753(StateMachine<StateType, EnvironmentType> stateMachine, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = stateMachine;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106753(this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return this.this$0.getCurrentState();
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106753) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.statemachine.StateMachine$listen$1", m36648f = "StateMachine.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$listen$1 */
    public static final class C106761 extends jgg implements nl7 {
        final /* synthetic */ xk7 $listener;
        final /* synthetic */ uk7 $onSubscribe;
        final /* synthetic */ StateChangeListenerToken $token;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106761(StateMachine<StateType, EnvironmentType> stateMachine, StateChangeListenerToken stateChangeListenerToken, xk7 xk7Var, uk7 uk7Var, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = stateMachine;
            this.$token = stateChangeListenerToken;
            this.$listener = xk7Var;
            this.$onSubscribe = uk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106761(this.this$0, this.$token, this.$listener, this.$onSubscribe, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.this$0.addSubscription(this.$token, this.$listener, this.$onSubscribe);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106761) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.statemachine.StateMachine$send$1", m36648f = "StateMachine.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$send$1 */
    public static final class C106771 extends jgg implements nl7 {
        final /* synthetic */ StateMachineEvent $event;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106771(StateMachine<StateType, EnvironmentType> stateMachine, StateMachineEvent stateMachineEvent, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = stateMachine;
            this.$event = stateMachineEvent;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C106771(this.this$0, this.$event, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.this$0.process(this.$event);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106771) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public StateMachine(StateMachineResolver<StateType> stateMachineResolver, EnvironmentType environmenttype, z74 z74Var, EffectExecutor effectExecutor, StateType statetype) {
        sq8.m48649h(stateMachineResolver, "resolver");
        sq8.m48649h(environmenttype, "environment");
        sq8.m48649h(z74Var, "dispatcherQueue");
        sq8.m48649h(effectExecutor, "executor");
        this.environment = environmenttype;
        this.dispatcherQueue = z74Var;
        this.executor = effectExecutor;
        this.resolver = stateMachineResolver.eraseToAnyResolver();
        cqb cqbVarM47838a = s4g.m47838a(statetype == null ? (StateType) stateMachineResolver.getDefaultState() : statetype);
        this._state = cqbVarM47838a;
        this.state = e47.m24268b(cqbVarM47838a);
        q74 q74VarPlus = gdg.m28505b(null, 1, null).plus(wkh.m54673b("StateMachineContext"));
        this.stateMachineContext = q74VarPlus;
        this.stateMachineScope = i84.m31707a(q74VarPlus);
        this.subscribers = new LinkedHashMap();
        this.pendingCancellations = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSubscription(StateChangeListenerToken stateChangeListenerToken, xk7 xk7Var, uk7 uk7Var) {
        if (this.pendingCancellations.contains(stateChangeListenerToken)) {
            return;
        }
        State currentState = getCurrentState();
        this.subscribers.put(stateChangeListenerToken, xk7Var);
        if (uk7Var != null) {
            uk7Var.invoke();
        }
        rm1.m46952d(this.stateMachineScope, this.dispatcherQueue, null, new C106721(xk7Var, currentState, null), 2, null);
    }

    private final void execute(List<? extends Action> list) {
        this.executor.execute(list, this, this.environment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateType getCurrentState() {
        return (StateType) this._state.getValue();
    }

    private static /* synthetic */ void getStateMachineContext$annotations() {
    }

    private final boolean notifySubscribers(Map.Entry<StateChangeListenerToken, ? extends xk7> entry, StateType statetype) {
        if (this.pendingCancellations.contains(entry.getKey())) {
            return false;
        }
        entry.getValue().invoke(statetype);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void process(StateMachineEvent stateMachineEvent) {
        StateResolution<StateType> stateResolutionResolve = this.resolver.resolve(getCurrentState(), stateMachineEvent);
        if (!sq8.m48644c(getCurrentState(), stateResolutionResolve.getNewState())) {
            setCurrentState(stateResolutionResolve.getNewState());
            Map<StateChangeListenerToken, xk7> map = this.subscribers;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<StateChangeListenerToken, xk7> entry : map.entrySet()) {
                if (!notifySubscribers(entry, stateResolutionResolve.getNewState())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                this.subscribers.remove(((Map.Entry) it.next()).getKey());
            }
        }
        execute(stateResolutionResolve.getActions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSubscription(StateChangeListenerToken stateChangeListenerToken) {
        this.pendingCancellations.remove(stateChangeListenerToken);
        this.subscribers.remove(stateChangeListenerToken);
    }

    private final void setCurrentState(StateType statetype) {
        this._state.setValue(statetype);
    }

    public final void cancel(StateChangeListenerToken stateChangeListenerToken) {
        sq8.m48649h(stateChangeListenerToken, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        this.pendingCancellations.add(stateChangeListenerToken);
        rm1.m46952d(this.stateMachineScope, null, null, new C106731(this, stateChangeListenerToken, null), 3, null);
    }

    public final EnvironmentType getEnvironment() {
        return this.environment;
    }

    public final q4g getState() {
        return this.state;
    }

    public final void listen(StateChangeListenerToken stateChangeListenerToken, xk7 xk7Var, uk7 uk7Var) {
        sq8.m48649h(stateChangeListenerToken, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(xk7Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        rm1.m46952d(this.stateMachineScope, null, null, new C106761(this, stateChangeListenerToken, xk7Var, uk7Var, null), 3, null);
    }

    @Override // com.amplifyframework.statemachine.EventDispatcher
    public void send(StateMachineEvent stateMachineEvent) {
        sq8.m48649h(stateMachineEvent, "event");
        rm1.m46952d(this.stateMachineScope, null, null, new C106771(this, stateMachineEvent, null), 3, null);
    }

    public final void getCurrentState(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "completion");
        rm1.m46952d(this.stateMachineScope, null, null, new C106741(xk7Var, this, null), 3, null);
    }

    public final Object getCurrentState(n64 n64Var) {
        return pm1.m43867g(this.stateMachineContext, new C106753(this, null), n64Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StateMachine(StateMachineResolver stateMachineResolver, Environment environment, z74 z74Var, EffectExecutor effectExecutor, State state, int i, id5 id5Var) {
        z74 z74VarM25610a = (i & 4) != 0 ? eu5.m25610a() : z74Var;
        this(stateMachineResolver, environment, z74VarM25610a, (i & 8) != 0 ? new ConcurrentEffectExecutor(z74VarM25610a) : effectExecutor, (i & 16) != 0 ? null : state);
    }
}
