package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignInChallengeActions;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class SignInChallengeState implements State {

    public static final class Error extends SignInChallengeState {
        private final AuthChallenge challenge;
        private final Exception exception;
        private boolean hasNewResponse;
        private final SignInMethod signInMethod;

        public /* synthetic */ Error(Exception exc, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z, int i, id5 id5Var) {
            this(exc, authChallenge, signInMethod, (i & 8) != 0 ? false : z);
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            if ((i & 2) != 0) {
                authChallenge = error.challenge;
            }
            if ((i & 4) != 0) {
                signInMethod = error.signInMethod;
            }
            if ((i & 8) != 0) {
                z = error.hasNewResponse;
            }
            return error.copy(exc, authChallenge, signInMethod, z);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final AuthChallenge component2() {
            return this.challenge;
        }

        public final SignInMethod component3() {
            return this.signInMethod;
        }

        public final boolean component4() {
            return this.hasNewResponse;
        }

        public final Error copy(Exception exc, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z) {
            sq8.m48649h(exc, "exception");
            sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
            sq8.m48649h(signInMethod, "signInMethod");
            return new Error(exc, authChallenge, signInMethod, z);
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
            return sq8.m48644c(this.exception, error.exception) && sq8.m48644c(this.challenge, error.challenge) && sq8.m48644c(this.signInMethod, error.signInMethod) && this.hasNewResponse == error.hasNewResponse;
        }

        public final AuthChallenge getChallenge() {
            return this.challenge;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        public final SignInMethod getSignInMethod() {
            return this.signInMethod;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = ((((this.exception.hashCode() * 31) + this.challenge.hashCode()) * 31) + this.signInMethod.hashCode()) * 31;
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
            return "Error(exception=" + this.exception + ", challenge=" + this.challenge + ", signInMethod=" + this.signInMethod + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z) {
            super(null);
            sq8.m48649h(exc, "exception");
            sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
            sq8.m48649h(signInMethod, "signInMethod");
            this.exception = exc;
            this.challenge = authChallenge;
            this.signInMethod = signInMethod;
            this.hasNewResponse = z;
        }
    }

    public static final class NotStarted extends SignInChallengeState {
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

    public static final class Resolver implements StateMachineResolver<SignInChallengeState> {
        private final SignInChallengeActions challengeActions;
        private final SignInChallengeState defaultState;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(SignInChallengeActions signInChallengeActions) {
            sq8.m48649h(signInChallengeActions, "challengeActions");
            this.challengeActions = signInChallengeActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final SignInChallengeEvent.EventType asSignInChallengeEvent(StateMachineEvent stateMachineEvent) {
            SignInChallengeEvent signInChallengeEvent = stateMachineEvent instanceof SignInChallengeEvent ? (SignInChallengeEvent) stateMachineEvent : null;
            if (signInChallengeEvent != null) {
                return signInChallengeEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignInChallengeState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignInChallengeState, StateMachineResolver<SignInChallengeState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public SignInChallengeState getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignInChallengeState> resolve(SignInChallengeState signInChallengeState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(signInChallengeState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            StateResolution<SignInChallengeState> stateResolution = new StateResolution<>(signInChallengeState, null, 2, null);
            SignInChallengeEvent.EventType eventTypeAsSignInChallengeEvent = asSignInChallengeEvent(stateMachineEvent);
            if (signInChallengeState instanceof NotStarted) {
                if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer)) {
                    return stateResolution;
                }
                SignInChallengeEvent.EventType.WaitForAnswer waitForAnswer = (SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent;
                return new StateResolution<>(new WaitingForAnswer(waitForAnswer.getChallenge(), waitForAnswer.getSignInMethod(), false, 4, null), null, 2, null);
            }
            int i = 1;
            if (signInChallengeState instanceof WaitingForAnswer) {
                if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer) {
                    WaitingForAnswer waitingForAnswer = (WaitingForAnswer) signInChallengeState;
                    return new StateResolution<>(new WaitingForAnswer(new AuthChallenge(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge().getChallengeName(), waitingForAnswer.getChallenge().getUsername(), waitingForAnswer.getChallenge().getSession(), waitingForAnswer.getChallenge().getParameters(), (List) null, 16, (id5) null), waitingForAnswer.getSignInMethod(), true), null, 2, null);
                }
                if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.VerifyChallengeAnswer)) {
                    return stateResolution;
                }
                SignInChallengeEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer = (SignInChallengeEvent.EventType.VerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
                WaitingForAnswer waitingForAnswer2 = (WaitingForAnswer) signInChallengeState;
                return new StateResolution<>(new Verifying(waitingForAnswer2.getChallenge().getChallengeName(), waitingForAnswer2.getSignInMethod()), bh3.m18963e(this.challengeActions.verifyChallengeAuthAction(verifyChallengeAnswer.getAnswer(), verifyChallengeAnswer.getMetadata(), verifyChallengeAnswer.getUserAttributes(), waitingForAnswer2.getChallenge(), waitingForAnswer2.getSignInMethod())));
            }
            if (!(signInChallengeState instanceof Verifying)) {
                if (!(signInChallengeState instanceof Error)) {
                    return stateResolution;
                }
                if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.VerifyChallengeAnswer)) {
                    return eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer ? new StateResolution<>(new WaitingForAnswer(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge(), ((Error) signInChallengeState).getSignInMethod(), false, 4, null), ch3.m21246k()) : stateResolution;
                }
                SignInChallengeEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer2 = (SignInChallengeEvent.EventType.VerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
                Error error = (Error) signInChallengeState;
                return new StateResolution<>(new Verifying(error.getChallenge().getChallengeName(), error.getSignInMethod()), bh3.m18963e(this.challengeActions.verifyChallengeAuthAction(verifyChallengeAnswer2.getAnswer(), verifyChallengeAnswer2.getMetadata(), verifyChallengeAnswer2.getUserAttributes(), error.getChallenge(), error.getSignInMethod())));
            }
            if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.Verified) {
                return new StateResolution<>(new Verified(null, i, 0 == true ? 1 : 0), null, 2, null);
            }
            if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.ThrowError) {
                SignInChallengeEvent.EventType.ThrowError throwError = (SignInChallengeEvent.EventType.ThrowError) eventTypeAsSignInChallengeEvent;
                return new StateResolution<>(new Error(throwError.getException(), throwError.getChallenge(), ((Verifying) signInChallengeState).getSignInMethod(), true), ch3.m21246k());
            }
            if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer)) {
                return eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer ? new StateResolution<>(new WaitingForAnswer(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge(), ((Verifying) signInChallengeState).getSignInMethod(), true), ch3.m21246k()) : stateResolution;
            }
            SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer retryVerifyChallengeAnswer = (SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
            Verifying verifying = (Verifying) signInChallengeState;
            return new StateResolution<>(new Verifying(retryVerifyChallengeAnswer.getAuthChallenge().getChallengeName(), verifying.getSignInMethod()), bh3.m18963e(this.challengeActions.verifyChallengeAuthAction(retryVerifyChallengeAnswer.getAnswer(), retryVerifyChallengeAnswer.getMetadata(), retryVerifyChallengeAnswer.getUserAttributes(), retryVerifyChallengeAnswer.getAuthChallenge(), verifying.getSignInMethod())));
        }
    }

    public static final class Verified extends SignInChallengeState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Verified() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Verified copy$default(Verified verified, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verified.id;
            }
            return verified.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Verified copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Verified(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && sq8.m48644c(this.id, ((Verified) obj).id);
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
            return "Verified(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verified(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Verified(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Verifying extends SignInChallengeState {
        private final String id;
        private final SignInMethod signInMethod;

        public /* synthetic */ Verifying(String str, SignInMethod signInMethod, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str, signInMethod);
        }

        public static /* synthetic */ Verifying copy$default(Verifying verifying, String str, SignInMethod signInMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifying.id;
            }
            if ((i & 2) != 0) {
                signInMethod = verifying.signInMethod;
            }
            return verifying.copy(str, signInMethod);
        }

        public final String component1() {
            return this.id;
        }

        public final SignInMethod component2() {
            return this.signInMethod;
        }

        public final Verifying copy(String str, SignInMethod signInMethod) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(signInMethod, "signInMethod");
            return new Verifying(str, signInMethod);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Verifying)) {
                return false;
            }
            Verifying verifying = (Verifying) obj;
            return sq8.m48644c(this.id, verifying.id) && sq8.m48644c(this.signInMethod, verifying.signInMethod);
        }

        public final String getId() {
            return this.id;
        }

        public final SignInMethod getSignInMethod() {
            return this.signInMethod;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.id.hashCode() * 31) + this.signInMethod.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Verifying(id=" + this.id + ", signInMethod=" + this.signInMethod + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verifying(String str, SignInMethod signInMethod) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            sq8.m48649h(signInMethod, "signInMethod");
            this.id = str;
            this.signInMethod = signInMethod;
        }
    }

    public static final class WaitingForAnswer extends SignInChallengeState {
        private final AuthChallenge challenge;
        private boolean hasNewResponse;
        private final SignInMethod signInMethod;

        public /* synthetic */ WaitingForAnswer(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z, int i, id5 id5Var) {
            this(authChallenge, signInMethod, (i & 4) != 0 ? false : z);
        }

        public static /* synthetic */ WaitingForAnswer copy$default(WaitingForAnswer waitingForAnswer, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                authChallenge = waitingForAnswer.challenge;
            }
            if ((i & 2) != 0) {
                signInMethod = waitingForAnswer.signInMethod;
            }
            if ((i & 4) != 0) {
                z = waitingForAnswer.hasNewResponse;
            }
            return waitingForAnswer.copy(authChallenge, signInMethod, z);
        }

        public final AuthChallenge component1() {
            return this.challenge;
        }

        public final SignInMethod component2() {
            return this.signInMethod;
        }

        public final boolean component3() {
            return this.hasNewResponse;
        }

        public final WaitingForAnswer copy(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z) {
            sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
            sq8.m48649h(signInMethod, "signInMethod");
            return new WaitingForAnswer(authChallenge, signInMethod, z);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingForAnswer)) {
                return false;
            }
            WaitingForAnswer waitingForAnswer = (WaitingForAnswer) obj;
            return sq8.m48644c(this.challenge, waitingForAnswer.challenge) && sq8.m48644c(this.signInMethod, waitingForAnswer.signInMethod) && this.hasNewResponse == waitingForAnswer.hasNewResponse;
        }

        public final AuthChallenge getChallenge() {
            return this.challenge;
        }

        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        public final SignInMethod getSignInMethod() {
            return this.signInMethod;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = ((this.challenge.hashCode() * 31) + this.signInMethod.hashCode()) * 31;
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
            return "WaitingForAnswer(challenge=" + this.challenge + ", signInMethod=" + this.signInMethod + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingForAnswer(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z) {
            super(null);
            sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
            sq8.m48649h(signInMethod, "signInMethod");
            this.challenge = authChallenge;
            this.signInMethod = signInMethod;
            this.hasNewResponse = z;
        }
    }

    private SignInChallengeState() {
    }

    public /* synthetic */ SignInChallengeState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
