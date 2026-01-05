package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.CustomSignInActions;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class CustomSignInState implements State {

    /* renamed from: type, reason: collision with root package name */
    private final String f58138type;

    public static final class Error extends CustomSignInState {
        private final Exception error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super(null);
            sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.error = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.error;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.error;
        }

        public final Error copy(Exception exc) {
            sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            return new Error(exc);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && sq8.m48644c(this.error, ((Error) obj).error);
        }

        public final Exception getError() {
            return this.error;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.error.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public static final class Initiating extends CustomSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Initiating() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Initiating copy$default(Initiating initiating, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initiating.id;
            }
            return initiating.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Initiating copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Initiating(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initiating) && sq8.m48644c(this.id, ((Initiating) obj).id);
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
            return "Initiating(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initiating(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Initiating(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class NotStarted extends CustomSignInState {
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

    public static final class Resolver implements StateMachineResolver<CustomSignInState> {
        private final NotStarted defaultState;
        private final CustomSignInActions signInCustomActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(CustomSignInActions customSignInActions) {
            sq8.m48649h(customSignInActions, "signInCustomActions");
            this.signInCustomActions = customSignInActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final CustomSignInEvent.EventType asCustomSignInEvent(StateMachineEvent stateMachineEvent) {
            CustomSignInEvent customSignInEvent = stateMachineEvent instanceof CustomSignInEvent ? (CustomSignInEvent) stateMachineEvent : null;
            if (customSignInEvent != null) {
                return customSignInEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<CustomSignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<CustomSignInState, StateMachineResolver<CustomSignInState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<CustomSignInState> resolve(CustomSignInState customSignInState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(customSignInState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            StateResolution<CustomSignInState> stateResolution = new StateResolution<>(customSignInState, null, 2, null);
            CustomSignInEvent.EventType eventTypeAsCustomSignInEvent = asCustomSignInEvent(stateMachineEvent);
            int i = 1;
            return customSignInState instanceof NotStarted ? eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.InitiateCustomSignIn ? new StateResolution<>(new Initiating(str, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.signInCustomActions.initiateCustomSignInAuthAction((CustomSignInEvent.EventType.InitiateCustomSignIn) eventTypeAsCustomSignInEvent))) : eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.ThrowAuthError ? new StateResolution<>(new Error(((CustomSignInEvent.EventType.ThrowAuthError) eventTypeAsCustomSignInEvent).getException()), null, 2, null) : stateResolution : customSignInState instanceof Initiating ? eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.FinalizeSignIn ? new StateResolution<>(new SignedIn(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, 2, null) : eventTypeAsCustomSignInEvent instanceof CustomSignInEvent.EventType.ThrowAuthError ? new StateResolution<>(new Error(((CustomSignInEvent.EventType.ThrowAuthError) eventTypeAsCustomSignInEvent).getException()), null, 2, null) : stateResolution : stateResolution;
        }
    }

    public static final class SignedIn extends CustomSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signedIn.id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SignedIn copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SignedIn(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedIn) && sq8.m48644c(this.id, ((SignedIn) obj).id);
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
            return "SignedIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SignedIn(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ CustomSignInState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.f58138type;
    }

    private CustomSignInState() {
        this.f58138type = toString();
    }
}
