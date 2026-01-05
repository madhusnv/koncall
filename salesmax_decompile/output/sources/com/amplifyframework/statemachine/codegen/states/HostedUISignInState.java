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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class HostedUISignInState implements State {

    public static final class Done extends HostedUISignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Done() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Done copy$default(Done done, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = done.id;
            }
            return done.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Done copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Done(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && sq8.m48644c(this.id, ((Done) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Done(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Done(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Done(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends HostedUISignInState {
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super(null);
            sq8.m48649h(exc, "exception");
            this.exception = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exc) {
            sq8.m48649h(exc, "exception");
            return new Error(exc);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && sq8.m48644c(this.exception, ((Error) obj).exception);
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
            return "Error(exception=" + this.exception + ")";
        }
    }

    public static final class FetchingToken extends HostedUISignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public FetchingToken() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FetchingToken copy$default(FetchingToken fetchingToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchingToken.id;
            }
            return fetchingToken.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final FetchingToken copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new FetchingToken(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingToken) && sq8.m48644c(this.id, ((FetchingToken) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingToken(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingToken(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ FetchingToken(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class NotStarted extends HostedUISignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notStarted.id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final NotStarted copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new NotStarted(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && sq8.m48644c(this.id, ((NotStarted) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "NotStarted(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ NotStarted(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<HostedUISignInState> {
        private final NotStarted defaultState;
        private final HostedUIActions hostedUIActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(HostedUIActions hostedUIActions) {
            sq8.m48649h(hostedUIActions, "hostedUIActions");
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
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<HostedUISignInState, StateMachineResolver<HostedUISignInState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<HostedUISignInState> resolve(HostedUISignInState hostedUISignInState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(hostedUISignInState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            HostedUIEvent.EventType eventTypeAsHostedUIEvent = asHostedUIEvent(stateMachineEvent);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            StateResolution<HostedUISignInState> stateResolution = new StateResolution<>(hostedUISignInState, null, 2, null);
            if (hostedUISignInState instanceof NotStarted) {
                if (!(eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ShowHostedUI)) {
                    return stateResolution;
                }
                HostedUIEvent.EventType.ShowHostedUI showHostedUI = (HostedUIEvent.EventType.ShowHostedUI) eventTypeAsHostedUIEvent;
                return new StateResolution<>(new ShowingUI(showHostedUI.getHostedUISignInData().getHostedUIOptions()), bh3.m18963e(this.hostedUIActions.showHostedUI(showHostedUI)));
            }
            int i = 1;
            if (!(hostedUISignInState instanceof ShowingUI)) {
                return hostedUISignInState instanceof FetchingToken ? eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.TokenFetched ? new StateResolution<>(new Done(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, 2, null) : eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ThrowError ? new StateResolution<>(new Error(((HostedUIEvent.EventType.ThrowError) eventTypeAsHostedUIEvent).getException()), null, 2, null) : stateResolution : stateResolution;
            }
            if (eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.FetchToken) {
                return new StateResolution<>(new FetchingToken(str, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.hostedUIActions.fetchHostedUISignInToken((HostedUIEvent.EventType.FetchToken) eventTypeAsHostedUIEvent, ((ShowingUI) hostedUISignInState).getHostedUIOptions().getBrowserPackage())));
            }
            return eventTypeAsHostedUIEvent instanceof HostedUIEvent.EventType.ThrowError ? new StateResolution<>(new Error(((HostedUIEvent.EventType.ThrowError) eventTypeAsHostedUIEvent).getException()), null, 2, null) : stateResolution;
        }
    }

    public static final class ShowingUI extends HostedUISignInState {
        private final HostedUIOptions hostedUIOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowingUI(HostedUIOptions hostedUIOptions) {
            super(null);
            sq8.m48649h(hostedUIOptions, "hostedUIOptions");
            this.hostedUIOptions = hostedUIOptions;
        }

        public static /* synthetic */ ShowingUI copy$default(ShowingUI showingUI, HostedUIOptions hostedUIOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUIOptions = showingUI.hostedUIOptions;
            }
            return showingUI.copy(hostedUIOptions);
        }

        public final HostedUIOptions component1() {
            return this.hostedUIOptions;
        }

        public final ShowingUI copy(HostedUIOptions hostedUIOptions) {
            sq8.m48649h(hostedUIOptions, "hostedUIOptions");
            return new ShowingUI(hostedUIOptions);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowingUI) && sq8.m48644c(this.hostedUIOptions, ((ShowingUI) obj).hostedUIOptions);
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

    private HostedUISignInState() {
    }

    public /* synthetic */ HostedUISignInState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
