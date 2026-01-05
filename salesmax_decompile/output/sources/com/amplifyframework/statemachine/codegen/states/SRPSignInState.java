package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.helpers.AuthFlowTypeHelperKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SRPActions;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class SRPSignInState implements State {

    public static final class Cancelling extends SRPSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Cancelling() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Cancelling copy$default(Cancelling cancelling, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cancelling.id;
            }
            return cancelling.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Cancelling copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Cancelling(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancelling) && sq8.m48644c(this.id, ((Cancelling) obj).id);
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
            return "Cancelling(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancelling(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Cancelling(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends SRPSignInState {
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

    public static final class InitiatingSRPA extends SRPSignInState {
        private final SignInMethod signInMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingSRPA(SignInMethod signInMethod) {
            super(null);
            sq8.m48649h(signInMethod, "signInMethod");
            this.signInMethod = signInMethod;
        }

        public static /* synthetic */ InitiatingSRPA copy$default(InitiatingSRPA initiatingSRPA, SignInMethod signInMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                signInMethod = initiatingSRPA.signInMethod;
            }
            return initiatingSRPA.copy(signInMethod);
        }

        public final SignInMethod component1() {
            return this.signInMethod;
        }

        public final InitiatingSRPA copy(SignInMethod signInMethod) {
            sq8.m48649h(signInMethod, "signInMethod");
            return new InitiatingSRPA(signInMethod);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingSRPA) && sq8.m48644c(this.signInMethod, ((InitiatingSRPA) obj).signInMethod);
        }

        public final SignInMethod getSignInMethod() {
            return this.signInMethod;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signInMethod.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "InitiatingSRPA(signInMethod=" + this.signInMethod + ")";
        }
    }

    public static final class NotStarted extends SRPSignInState {
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

    public static final class Resolver implements StateMachineResolver<SRPSignInState> {
        private final NotStarted defaultState;
        private final SRPActions srpActions;

        public Resolver(SRPActions sRPActions) {
            sq8.m48649h(sRPActions, "srpActions");
            this.srpActions = sRPActions;
            this.defaultState = new NotStarted("");
        }

        private final SRPEvent.EventType asSRPEvent(StateMachineEvent stateMachineEvent) {
            SRPEvent sRPEvent = stateMachineEvent instanceof SRPEvent ? (SRPEvent) stateMachineEvent : null;
            if (sRPEvent != null) {
                return sRPEvent.getEventType();
            }
            return null;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SRPSignInState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SRPSignInState, StateMachineResolver<SRPSignInState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SRPSignInState> resolve(SRPSignInState sRPSignInState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(sRPSignInState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            SRPEvent.EventType eventTypeAsSRPEvent = asSRPEvent(stateMachineEvent);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            StateResolution<SRPSignInState> stateResolution = new StateResolution<>(sRPSignInState, null, 2, null);
            if (sRPSignInState instanceof NotStarted) {
                if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.InitiateSRP) {
                    SRPEvent.EventType.InitiateSRP initiateSRP = (SRPEvent.EventType.InitiateSRP) eventTypeAsSRPEvent;
                    return new StateResolution<>(new InitiatingSRPA(AuthFlowTypeHelperKt.toSignInMethod(initiateSRP.getAuthFlowType())), bh3.m18963e(this.srpActions.initiateSRPAuthAction(initiateSRP)));
                }
                if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.InitiateSRPWithCustom) {
                    return new StateResolution<>(new InitiatingSRPA(new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.CUSTOM_AUTH)), bh3.m18963e(this.srpActions.initiateSRPWithCustomAuthAction((SRPEvent.EventType.InitiateSRPWithCustom) eventTypeAsSRPEvent)));
                }
                return stateResolution;
            }
            int i = 1;
            if (sRPSignInState instanceof InitiatingSRPA) {
                if (!(eventTypeAsSRPEvent instanceof SRPEvent.EventType.RespondPasswordVerifier)) {
                    return eventTypeAsSRPEvent instanceof SRPEvent.EventType.ThrowAuthError ? new StateResolution<>(new Error(((SRPEvent.EventType.ThrowAuthError) eventTypeAsSRPEvent).getException()), null, 2, null) : eventTypeAsSRPEvent instanceof SRPEvent.EventType.CancelSRPSignIn ? new StateResolution<>(new Cancelling(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0), null, 2, null) : stateResolution;
                }
                SRPEvent.EventType.RespondPasswordVerifier respondPasswordVerifier = (SRPEvent.EventType.RespondPasswordVerifier) eventTypeAsSRPEvent;
                return new StateResolution<>(new RespondingPasswordVerifier(str, i, objArr9 == true ? 1 : 0), bh3.m18963e(this.srpActions.verifyPasswordSRPAction(respondPasswordVerifier.getChallengeParameters(), respondPasswordVerifier.getMetadata(), respondPasswordVerifier.getSession(), ((InitiatingSRPA) sRPSignInState).getSignInMethod())));
            }
            if (!(sRPSignInState instanceof RespondingPasswordVerifier)) {
                return ((sRPSignInState instanceof Cancelling) && (eventTypeAsSRPEvent instanceof SRPEvent.EventType.Reset)) ? new StateResolution<>(new NotStarted(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (!(eventTypeAsSRPEvent instanceof SRPEvent.EventType.RetryRespondPasswordVerifier)) {
                return eventTypeAsSRPEvent instanceof SRPEvent.EventType.ThrowPasswordVerifierError ? new StateResolution<>(new Error(((SRPEvent.EventType.ThrowPasswordVerifierError) eventTypeAsSRPEvent).getException()), null, 2, null) : eventTypeAsSRPEvent instanceof SRPEvent.EventType.CancelSRPSignIn ? new StateResolution<>(new Cancelling(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            SRPEvent.EventType.RetryRespondPasswordVerifier retryRespondPasswordVerifier = (SRPEvent.EventType.RetryRespondPasswordVerifier) eventTypeAsSRPEvent;
            return new StateResolution<>(new RespondingPasswordVerifier(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), bh3.m18963e(this.srpActions.verifyPasswordSRPAction(retryRespondPasswordVerifier.getChallengeParameters(), retryRespondPasswordVerifier.getMetadata(), retryRespondPasswordVerifier.getSession(), retryRespondPasswordVerifier.getSignInMethod())));
        }
    }

    public static final class RespondingPasswordVerifier extends SRPSignInState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public RespondingPasswordVerifier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RespondingPasswordVerifier copy$default(RespondingPasswordVerifier respondingPasswordVerifier, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = respondingPasswordVerifier.id;
            }
            return respondingPasswordVerifier.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final RespondingPasswordVerifier copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new RespondingPasswordVerifier(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingPasswordVerifier) && sq8.m48644c(this.id, ((RespondingPasswordVerifier) obj).id);
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
            return "RespondingPasswordVerifier(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingPasswordVerifier(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ RespondingPasswordVerifier(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SignedIn extends SRPSignInState {
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

    private SRPSignInState() {
    }

    public /* synthetic */ SRPSignInState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
