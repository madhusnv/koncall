package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignUpActions;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import com.amplifyframework.statemachine.codegen.events.SignUpEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes5.dex */
public abstract class SignUpState implements State {

    public static final class AwaitingUserConfirmation extends SignUpState {
        private final SignUpData signUpData;
        private final AuthSignUpResult signUpResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AwaitingUserConfirmation(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
            super(null);
            sq8.m48649h(signUpData, "signUpData");
            sq8.m48649h(authSignUpResult, "signUpResult");
            this.signUpData = signUpData;
            this.signUpResult = authSignUpResult;
        }

        public static /* synthetic */ AwaitingUserConfirmation copy$default(AwaitingUserConfirmation awaitingUserConfirmation, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i, Object obj) {
            if ((i & 1) != 0) {
                signUpData = awaitingUserConfirmation.signUpData;
            }
            if ((i & 2) != 0) {
                authSignUpResult = awaitingUserConfirmation.signUpResult;
            }
            return awaitingUserConfirmation.copy(signUpData, authSignUpResult);
        }

        public final SignUpData component1() {
            return this.signUpData;
        }

        public final AuthSignUpResult component2() {
            return this.signUpResult;
        }

        public final AwaitingUserConfirmation copy(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
            sq8.m48649h(signUpData, "signUpData");
            sq8.m48649h(authSignUpResult, "signUpResult");
            return new AwaitingUserConfirmation(signUpData, authSignUpResult);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AwaitingUserConfirmation)) {
                return false;
            }
            AwaitingUserConfirmation awaitingUserConfirmation = (AwaitingUserConfirmation) obj;
            return sq8.m48644c(this.signUpData, awaitingUserConfirmation.signUpData) && sq8.m48644c(this.signUpResult, awaitingUserConfirmation.signUpResult);
        }

        public final SignUpData getSignUpData() {
            return this.signUpData;
        }

        public final AuthSignUpResult getSignUpResult() {
            return this.signUpResult;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.signUpData.hashCode() * 31) + this.signUpResult.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "AwaitingUserConfirmation(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
        }
    }

    public static final class ConfirmingSignUp extends SignUpState {
        private final SignUpData signUpData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmingSignUp(SignUpData signUpData) {
            super(null);
            sq8.m48649h(signUpData, "signUpData");
            this.signUpData = signUpData;
        }

        public static /* synthetic */ ConfirmingSignUp copy$default(ConfirmingSignUp confirmingSignUp, SignUpData signUpData, int i, Object obj) {
            if ((i & 1) != 0) {
                signUpData = confirmingSignUp.signUpData;
            }
            return confirmingSignUp.copy(signUpData);
        }

        public final SignUpData component1() {
            return this.signUpData;
        }

        public final ConfirmingSignUp copy(SignUpData signUpData) {
            sq8.m48649h(signUpData, "signUpData");
            return new ConfirmingSignUp(signUpData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmingSignUp) && sq8.m48644c(this.signUpData, ((ConfirmingSignUp) obj).signUpData);
        }

        public final SignUpData getSignUpData() {
            return this.signUpData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signUpData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "ConfirmingSignUp(signUpData=" + this.signUpData + ")";
        }
    }

    public static final class Error extends SignUpState {
        private final Exception exception;
        private boolean hasNewResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc, boolean z) {
            super(null);
            sq8.m48649h(exc, "exception");
            this.exception = exc;
            this.hasNewResponse = z;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            if ((i & 2) != 0) {
                z = error.hasNewResponse;
            }
            return error.copy(exc, z);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final boolean component2() {
            return this.hasNewResponse;
        }

        public final Error copy(Exception exc, boolean z) {
            sq8.m48649h(exc, "exception");
            return new Error(exc, z);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return sq8.m48644c(this.exception, error.exception) && this.hasNewResponse == error.hasNewResponse;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.exception.hashCode() * 31;
            boolean z = this.hasNewResponse;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        public /* synthetic */ Error(Exception exc, boolean z, int i, id5 id5Var) {
            this(exc, (i & 2) != 0 ? true : z);
        }
    }

    public static final class InitiatingSignUp extends SignUpState {
        private final SignUpData signUpData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingSignUp(SignUpData signUpData) {
            super(null);
            sq8.m48649h(signUpData, "signUpData");
            this.signUpData = signUpData;
        }

        public static /* synthetic */ InitiatingSignUp copy$default(InitiatingSignUp initiatingSignUp, SignUpData signUpData, int i, Object obj) {
            if ((i & 1) != 0) {
                signUpData = initiatingSignUp.signUpData;
            }
            return initiatingSignUp.copy(signUpData);
        }

        public final SignUpData component1() {
            return this.signUpData;
        }

        public final InitiatingSignUp copy(SignUpData signUpData) {
            sq8.m48649h(signUpData, "signUpData");
            return new InitiatingSignUp(signUpData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingSignUp) && sq8.m48644c(this.signUpData, ((InitiatingSignUp) obj).signUpData);
        }

        public final SignUpData getSignUpData() {
            return this.signUpData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signUpData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "InitiatingSignUp(signUpData=" + this.signUpData + ")";
        }
    }

    public static final class NotStarted extends SignUpState {
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

    public static final class Resolver implements StateMachineResolver<SignUpState> {
        private final NotStarted defaultState;
        private final SignUpActions signUpActions;

        public Resolver(SignUpActions signUpActions) {
            sq8.m48649h(signUpActions, "signUpActions");
            this.signUpActions = signUpActions;
            this.defaultState = new NotStarted("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignUpState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignUpState, StateMachineResolver<SignUpState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignUpState> resolve(SignUpState signUpState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(signUpState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            id5 id5Var = null;
            int i = 2;
            StateResolution<SignUpState> stateResolution = new StateResolution<>(signUpState, null, 2, null);
            SignUpEvent.EventType eventTypeIsSignUpEvent = AuthEnvironmentKt.isSignUpEvent(stateMachineEvent);
            boolean z = false;
            if (signUpState instanceof NotStarted ? true : signUpState instanceof SignedUp) {
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp.getSignUpData()), bh3.m18963e(this.signUpActions.initiateSignUpAction(initiateSignUp)));
                }
                if (!(eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp)) {
                    return eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z, i, id5Var), null, 2, null) : stateResolution;
                }
                SignUpEvent.EventType.ConfirmSignUp confirmSignUp = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                return new StateResolution<>(new ConfirmingSignUp(confirmSignUp.getSignUpData()), bh3.m18963e(this.signUpActions.confirmSignUpAction(confirmSignUp)));
            }
            if (signUpState instanceof InitiatingSignUp) {
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp2 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp2.getSignUpData()), bh3.m18963e(this.signUpActions.initiateSignUpAction(initiateSignUp2)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUpComplete) {
                    SignUpEvent.EventType.InitiateSignUpComplete initiateSignUpComplete = (SignUpEvent.EventType.InitiateSignUpComplete) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new AwaitingUserConfirmation(initiateSignUpComplete.getSignUpData(), initiateSignUpComplete.getSignUpResult()), null, 2, null);
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp) {
                    SignUpEvent.EventType.ConfirmSignUp confirmSignUp2 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new ConfirmingSignUp(confirmSignUp2.getSignUpData()), bh3.m18963e(this.signUpActions.confirmSignUpAction(confirmSignUp2)));
                }
                if (!(eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.SignedUp)) {
                    return eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z, i, id5Var), null, 2, null) : stateResolution;
                }
                SignUpEvent.EventType.SignedUp signedUp = (SignUpEvent.EventType.SignedUp) eventTypeIsSignUpEvent;
                return new StateResolution<>(new SignedUp(signedUp.getSignUpData(), signedUp.getSignUpResult()), null, 2, null);
            }
            if (signUpState instanceof AwaitingUserConfirmation) {
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp3 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp3.getSignUpData()), bh3.m18963e(this.signUpActions.initiateSignUpAction(initiateSignUp3)));
                }
                if (!(eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp)) {
                    return eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z, i, id5Var), null, 2, null) : stateResolution;
                }
                SignUpEvent.EventType.ConfirmSignUp confirmSignUp3 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                return new StateResolution<>(new ConfirmingSignUp(confirmSignUp3.getSignUpData()), bh3.m18963e(this.signUpActions.confirmSignUpAction(confirmSignUp3)));
            }
            if (!(signUpState instanceof ConfirmingSignUp)) {
                if (!(signUpState instanceof Error)) {
                    throw new szb();
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp4 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp4.getSignUpData()), bh3.m18963e(this.signUpActions.initiateSignUpAction(initiateSignUp4)));
                }
                if (!(eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp)) {
                    return stateResolution;
                }
                SignUpEvent.EventType.ConfirmSignUp confirmSignUp4 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                return new StateResolution<>(new ConfirmingSignUp(confirmSignUp4.getSignUpData()), bh3.m18963e(this.signUpActions.confirmSignUpAction(confirmSignUp4)));
            }
            if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                SignUpEvent.EventType.InitiateSignUp initiateSignUp5 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                return new StateResolution<>(new InitiatingSignUp(initiateSignUp5.getSignUpData()), bh3.m18963e(this.signUpActions.initiateSignUpAction(initiateSignUp5)));
            }
            if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp) {
                SignUpEvent.EventType.ConfirmSignUp confirmSignUp5 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                return new StateResolution<>(new ConfirmingSignUp(confirmSignUp5.getSignUpData()), bh3.m18963e(this.signUpActions.confirmSignUpAction(confirmSignUp5)));
            }
            if (!(eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.SignedUp)) {
                return eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError ? new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z, i, id5Var), null, 2, null) : stateResolution;
            }
            SignUpEvent.EventType.SignedUp signedUp2 = (SignUpEvent.EventType.SignedUp) eventTypeIsSignUpEvent;
            return new StateResolution<>(new SignedUp(signedUp2.getSignUpData(), signedUp2.getSignUpResult()), null, 2, null);
        }
    }

    public static final class SignedUp extends SignUpState {
        private final SignUpData signUpData;
        private final AuthSignUpResult signUpResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedUp(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
            super(null);
            sq8.m48649h(signUpData, "signUpData");
            sq8.m48649h(authSignUpResult, "signUpResult");
            this.signUpData = signUpData;
            this.signUpResult = authSignUpResult;
        }

        public static /* synthetic */ SignedUp copy$default(SignedUp signedUp, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i, Object obj) {
            if ((i & 1) != 0) {
                signUpData = signedUp.signUpData;
            }
            if ((i & 2) != 0) {
                authSignUpResult = signedUp.signUpResult;
            }
            return signedUp.copy(signUpData, authSignUpResult);
        }

        public final SignUpData component1() {
            return this.signUpData;
        }

        public final AuthSignUpResult component2() {
            return this.signUpResult;
        }

        public final SignedUp copy(SignUpData signUpData, AuthSignUpResult authSignUpResult) {
            sq8.m48649h(signUpData, "signUpData");
            sq8.m48649h(authSignUpResult, "signUpResult");
            return new SignedUp(signUpData, authSignUpResult);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignedUp)) {
                return false;
            }
            SignedUp signedUp = (SignedUp) obj;
            return sq8.m48644c(this.signUpData, signedUp.signUpData) && sq8.m48644c(this.signUpResult, signedUp.signUpResult);
        }

        public final SignUpData getSignUpData() {
            return this.signUpData;
        }

        public final AuthSignUpResult getSignUpResult() {
            return this.signUpResult;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.signUpData.hashCode() * 31) + this.signUpResult.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedUp(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
        }
    }

    private SignUpState() {
    }

    public /* synthetic */ SignUpState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
