package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.HostedUIActions;
import com.amplifyframework.statemachine.codegen.data.HostedUIOptions;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class HostedUISignInState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Done extends HostedUISignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43824id;

        /* JADX WARN: Multi-variable type inference failed */
        public Done() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Done copy$default(Done done, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = done.f43824id;
            }
            return done.copy(str);
        }

        public final String component1() {
            return this.f43824id;
        }

        public final Done copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Done(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && AbstractC4154l.m8918a(this.f43824id, ((Done) obj).f43824id);
        }

        public final String getId() {
            return this.f43824id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43824id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Done(id=", this.f43824id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Done(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43824id = id2;
        }

        public /* synthetic */ Done(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends HostedUISignInState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exception) {
            AbstractC4154l.m8923f(exception, "exception");
            return new Error(exception);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && AbstractC4154l.m8918a(this.exception, ((Error) obj).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11237h("Error(exception=", ")", this.exception);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FetchingToken extends HostedUISignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43825id;

        /* JADX WARN: Multi-variable type inference failed */
        public FetchingToken() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FetchingToken copy$default(FetchingToken fetchingToken, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fetchingToken.f43825id;
            }
            return fetchingToken.copy(str);
        }

        public final String component1() {
            return this.f43825id;
        }

        public final FetchingToken copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new FetchingToken(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingToken) && AbstractC4154l.m8918a(this.f43825id, ((FetchingToken) obj).f43825id);
        }

        public final String getId() {
            return this.f43825id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43825id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("FetchingToken(id=", this.f43825id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingToken(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43825id = id2;
        }

        public /* synthetic */ FetchingToken(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends HostedUISignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43826id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43826id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43826id;
        }

        public final NotStarted copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new NotStarted(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43826id, ((NotStarted) obj).f43826id);
        }

        public final String getId() {
            return this.f43826id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43826id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43826id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43826id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<HostedUISignInState> {
        private final NotStarted defaultState;
        private final HostedUIActions hostedUIActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(HostedUIActions hostedUIActions) {
            AbstractC4154l.m8923f(hostedUIActions, "hostedUIActions");
            this.hostedUIActions = hostedUIActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final HostedUIEvent.EventType asHostedUIEvent(StateMachineEvent stateMachineEvent) {
            HostedUIEvent hostedUIEvent = stateMachineEvent instanceof HostedUIEvent ? (HostedUIEvent) stateMachineEvent : null;
            if (hostedUIEvent != null) {
                return hostedUIEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<HostedUISignInState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<HostedUISignInState, StateMachineResolver<HostedUISignInState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<HostedUISignInState> resolve(HostedUISignInState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            HostedUIEvent.EventType eventTypeAsHostedUIEvent = asHostedUIEvent(event);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            StateResolution<HostedUISignInState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            if (!(oldState instanceof NotStarted)) {
                int i10 = 1;
                if (oldState instanceof ShowingUI) {
                    if (eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.FetchToken) {
                        return new StateResolution<>(new FetchingToken(str, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.hostedUIActions.fetchHostedUISignInToken((HostedUIEvent.EventType.FetchToken) eventTypeAsHostedUIEvent, ((ShowingUI) oldState).getHostedUIOptions().getBrowserPackage())));
                    }
                    if (eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ThrowError) {
                        return new StateResolution<>(new Error(((HostedUIEvent.EventType.ThrowError) eventTypeAsHostedUIEvent).getException()), null, 2, null);
                    }
                } else if (oldState instanceof FetchingToken) {
                    if (eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.TokenFetched) {
                        return new StateResolution<>(new Done(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), null, 2, null);
                    }
                    if (eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ThrowError) {
                        return new StateResolution<>(new Error(((HostedUIEvent.EventType.ThrowError) eventTypeAsHostedUIEvent).getException()), null, 2, null);
                    }
                }
            } else if (eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ShowHostedUI) {
                HostedUIEvent.EventType.ShowHostedUI showHostedUI = (HostedUIEvent.EventType.ShowHostedUI) eventTypeAsHostedUIEvent;
                return new StateResolution<>(new ShowingUI(showHostedUI.getHostedUISignInData().getHostedUIOptions()), pe.m10833h(this.hostedUIActions.showHostedUI(showHostedUI)));
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ShowingUI extends HostedUISignInState {
        private final HostedUIOptions hostedUIOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowingUI(HostedUIOptions hostedUIOptions) {
            super(null);
            AbstractC4154l.m8923f(hostedUIOptions, "hostedUIOptions");
            this.hostedUIOptions = hostedUIOptions;
        }

        public static /* synthetic */ ShowingUI copy$default(ShowingUI showingUI, HostedUIOptions hostedUIOptions, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                hostedUIOptions = showingUI.hostedUIOptions;
            }
            return showingUI.copy(hostedUIOptions);
        }

        public final HostedUIOptions component1() {
            return this.hostedUIOptions;
        }

        public final ShowingUI copy(HostedUIOptions hostedUIOptions) {
            AbstractC4154l.m8923f(hostedUIOptions, "hostedUIOptions");
            return new ShowingUI(hostedUIOptions);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowingUI) && AbstractC4154l.m8918a(this.hostedUIOptions, ((ShowingUI) obj).hostedUIOptions);
        }

        public final HostedUIOptions getHostedUIOptions() {
            return this.hostedUIOptions;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.hostedUIOptions.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ShowingUI(hostedUIOptions=" + this.hostedUIOptions + ")";
        }
    }

    public /* synthetic */ HostedUISignInState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private HostedUISignInState() {
    }
}
