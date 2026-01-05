package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.State;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import jo.C3810f;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.x5;
import qw.InterfaceC6353c;
import qw.a0;
import tx.AbstractC7262v;
import tx.InterfaceC7266z;
import tx.c0;
import tx.m0;
import tx.u1;
import tx.x1;
import tx.y0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8209j;
import wx.c1;
import wx.k1;
import wx.m1;
import wx.u0;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class StateMachine<StateType extends State, EnvironmentType extends Environment> implements EventDispatcher {
    private final u0 _state;
    private final AbstractC7262v dispatcherQueue;
    private final EnvironmentType environment;
    private final EffectExecutor executor;
    private final Set<StateChangeListenerToken> pendingCancellations;
    private final AnyResolver<StateType, ?> resolver;
    private final k1 state;
    private final InterfaceC7564h stateMachineContext;
    private final InterfaceC7266z stateMachineScope;
    private final Map<StateChangeListenerToken, InterfaceC2139c> subscribers;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.statemachine.StateMachine$addSubscription$1", m15344f = "StateMachine.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$addSubscription$1 */
    public static final class C12201 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ StateType $currentState;
        final /* synthetic */ InterfaceC2139c $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12201(InterfaceC2139c interfaceC2139c, StateType statetype, InterfaceC7559c<? super C12201> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$listener = interfaceC2139c;
            this.$currentState = statetype;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12201(this.$listener, this.$currentState, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            this.$listener.invoke(this.$currentState);
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12201) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.statemachine.StateMachine$cancel$1", m15344f = "StateMachine.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$cancel$1 */
    public static final class C12211 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ StateChangeListenerToken $token;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12211(StateMachine<StateType, EnvironmentType> stateMachine, StateChangeListenerToken stateChangeListenerToken, InterfaceC7559c<? super C12211> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.this$0 = stateMachine;
            this.$token = stateChangeListenerToken;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12211(this.this$0, this.$token, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            this.this$0.removeSubscription(this.$token);
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12211) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.statemachine.StateMachine$getCurrentState$1", m15344f = "StateMachine.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$getCurrentState$1 */
    public static final class C12221 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ InterfaceC2139c $completion;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12221(InterfaceC2139c interfaceC2139c, StateMachine<StateType, EnvironmentType> stateMachine, InterfaceC7559c<? super C12221> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$completion = interfaceC2139c;
            this.this$0 = stateMachine;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12221(this.$completion, this.this$0, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            this.$completion.invoke(this.this$0.getCurrentState());
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12221) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.statemachine.StateMachine$getCurrentState$3", m15344f = "StateMachine.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$getCurrentState$3 */
    public static final class C12233 extends AbstractC8199i implements InterfaceC2141e {
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12233(StateMachine<StateType, EnvironmentType> stateMachine, InterfaceC7559c<? super C12233> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.this$0 = stateMachine;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12233(this.this$0, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return this.this$0.getCurrentState();
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super StateType> interfaceC7559c) {
            return ((C12233) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.statemachine.StateMachine$listen$1", m15344f = "StateMachine.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$listen$1 */
    public static final class C12241 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ InterfaceC2139c $listener;
        final /* synthetic */ InterfaceC2137a $onSubscribe;
        final /* synthetic */ StateChangeListenerToken $token;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12241(StateMachine<StateType, EnvironmentType> stateMachine, StateChangeListenerToken stateChangeListenerToken, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, InterfaceC7559c<? super C12241> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.this$0 = stateMachine;
            this.$token = stateChangeListenerToken;
            this.$listener = interfaceC2139c;
            this.$onSubscribe = interfaceC2137a;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12241(this.this$0, this.$token, this.$listener, this.$onSubscribe, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            this.this$0.addSubscription(this.$token, this.$listener, this.$onSubscribe);
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12241) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.statemachine.StateMachine$send$1", m15344f = "StateMachine.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.statemachine.StateMachine$send$1 */
    public static final class C12251 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ StateMachineEvent $event;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12251(StateMachine<StateType, EnvironmentType> stateMachine, StateMachineEvent stateMachineEvent, InterfaceC7559c<? super C12251> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.this$0 = stateMachine;
            this.$event = stateMachineEvent;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12251(this.this$0, this.$event, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            this.this$0.process(this.$event);
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12251) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StateMachine(StateMachineResolver stateMachineResolver, Environment environment, AbstractC7262v abstractC7262v, EffectExecutor effectExecutor, State state, int i10, AbstractC4148f abstractC4148f) {
        AbstractC7262v abstractC7262v2 = (i10 & 4) != 0 ? m0.f34659a : abstractC7262v;
        this(stateMachineResolver, environment, abstractC7262v2, (i10 & 8) != 0 ? new ConcurrentEffectExecutor(abstractC7262v2) : effectExecutor, (i10 & 16) != 0 ? null : state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSubscription(StateChangeListenerToken stateChangeListenerToken, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a) {
        if (this.pendingCancellations.contains(stateChangeListenerToken)) {
            return;
        }
        State currentState = getCurrentState();
        this.subscribers.put(stateChangeListenerToken, interfaceC2139c);
        if (interfaceC2137a != null) {
            interfaceC2137a.invoke();
        }
        c0.m13502y(this.stateMachineScope, this.dispatcherQueue, null, new C12201(interfaceC2139c, currentState, null), 2);
    }

    private final void execute(List<? extends Action> list) {
        this.executor.execute(list, this, this.environment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateType getCurrentState() {
        return (StateType) ((m1) this._state).getValue();
    }

    private final boolean notifySubscribers(Map.Entry<StateChangeListenerToken, ? extends InterfaceC2139c> entry, StateType statetype) {
        if (this.pendingCancellations.contains(entry.getKey())) {
            return false;
        }
        entry.getValue().invoke(statetype);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void process(StateMachineEvent stateMachineEvent) {
        StateResolution<StateType> stateResolutionResolve = this.resolver.resolve(getCurrentState(), stateMachineEvent);
        if (!AbstractC4154l.m8918a(getCurrentState(), stateResolutionResolve.getNewState())) {
            setCurrentState(stateResolutionResolve.getNewState());
            Map<StateChangeListenerToken, InterfaceC2139c> map = this.subscribers;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<StateChangeListenerToken, InterfaceC2139c> entry : map.entrySet()) {
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
        ((m1) this._state).m15398j(statetype);
    }

    @InterfaceC6353c
    public final void cancel(StateChangeListenerToken token) {
        AbstractC4154l.m8923f(token, "token");
        this.pendingCancellations.add(token);
        c0.m13502y(this.stateMachineScope, null, null, new C12211(this, token, null), 3);
    }

    public final EnvironmentType getEnvironment() {
        return this.environment;
    }

    public final k1 getState() {
        return this.state;
    }

    public final InterfaceC8209j getStateTransitions() {
        return new C3810f(this.state, 2);
    }

    @InterfaceC6353c
    public final void listen(StateChangeListenerToken token, InterfaceC2139c listener, InterfaceC2137a interfaceC2137a) {
        AbstractC4154l.m8923f(token, "token");
        AbstractC4154l.m8923f(listener, "listener");
        c0.m13502y(this.stateMachineScope, null, null, new C12241(this, token, listener, interfaceC2137a, null), 3);
    }

    @Override // com.amplifyframework.statemachine.EventDispatcher
    public void send(StateMachineEvent event) {
        AbstractC4154l.m8923f(event, "event");
        c0.m13502y(this.stateMachineScope, null, null, new C12251(this, event, null), 3);
    }

    @InterfaceC6353c
    public final void getCurrentState(InterfaceC2139c completion) {
        AbstractC4154l.m8923f(completion, "completion");
        c0.m13502y(this.stateMachineScope, null, null, new C12221(completion, this, null), 3);
    }

    public final Object getCurrentState(InterfaceC7559c<? super StateType> interfaceC7559c) {
        return c0.m13475K(this.stateMachineContext, new C12233(this, null), interfaceC7559c);
    }

    public StateMachine(StateMachineResolver<StateType> resolver, EnvironmentType environment, AbstractC7262v dispatcherQueue, EffectExecutor executor, StateType statetype) {
        AbstractC4154l.m8923f(resolver, "resolver");
        AbstractC4154l.m8923f(environment, "environment");
        AbstractC4154l.m8923f(dispatcherQueue, "dispatcherQueue");
        AbstractC4154l.m8923f(executor, "executor");
        this.environment = environment;
        this.dispatcherQueue = dispatcherQueue;
        this.executor = executor;
        this.resolver = resolver.eraseToAnyResolver();
        m1 m1VarM15372c = c1.m15372c(statetype == null ? (StateType) resolver.getDefaultState() : statetype);
        this._state = m1VarM15372c;
        this.state = new w0(m1VarM15372c);
        u1 u1VarM13481d = c0.m13481d();
        new AtomicInteger();
        InterfaceC7564h interfaceC7564hM11928d = x5.m11928d(u1VarM13481d, new y0(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(1, new x1()))));
        this.stateMachineContext = interfaceC7564hM11928d;
        this.stateMachineScope = c0.m13479b(interfaceC7564hM11928d);
        this.subscribers = new LinkedHashMap();
        this.pendingCancellations = new LinkedHashSet();
    }

    private static /* synthetic */ void getStateMachineContext$annotations() {
    }
}
