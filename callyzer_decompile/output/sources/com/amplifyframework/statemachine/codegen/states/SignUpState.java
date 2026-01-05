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
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SignUpState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class AwaitingUserConfirmation extends SignUpState {
        private final SignUpData signUpData;
        private final AuthSignUpResult signUpResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AwaitingUserConfirmation(SignUpData signUpData, AuthSignUpResult signUpResult) {
            super(null);
            AbstractC4154l.m8923f(signUpData, "signUpData");
            AbstractC4154l.m8923f(signUpResult, "signUpResult");
            this.signUpData = signUpData;
            this.signUpResult = signUpResult;
        }

        public static /* synthetic */ AwaitingUserConfirmation copy$default(AwaitingUserConfirmation awaitingUserConfirmation, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signUpData = awaitingUserConfirmation.signUpData;
            }
            if ((i10 & 2) != 0) {
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

        public final AwaitingUserConfirmation copy(SignUpData signUpData, AuthSignUpResult signUpResult) {
            AbstractC4154l.m8923f(signUpData, "signUpData");
            AbstractC4154l.m8923f(signUpResult, "signUpResult");
            return new AwaitingUserConfirmation(signUpData, signUpResult);
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
            return AbstractC4154l.m8918a(this.signUpData, awaitingUserConfirmation.signUpData) && AbstractC4154l.m8918a(this.signUpResult, awaitingUserConfirmation.signUpResult);
        }

        public final SignUpData getSignUpData() {
            return this.signUpData;
        }

        public final AuthSignUpResult getSignUpResult() {
            return this.signUpResult;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signUpResult.hashCode() + (this.signUpData.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "AwaitingUserConfirmation(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ConfirmingSignUp extends SignUpState {
        private final SignUpData signUpData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmingSignUp(SignUpData signUpData) {
            super(null);
            AbstractC4154l.m8923f(signUpData, "signUpData");
            this.signUpData = signUpData;
        }

        public static /* synthetic */ ConfirmingSignUp copy$default(ConfirmingSignUp confirmingSignUp, SignUpData signUpData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signUpData = confirmingSignUp.signUpData;
            }
            return confirmingSignUp.copy(signUpData);
        }

        public final SignUpData component1() {
            return this.signUpData;
        }

        public final ConfirmingSignUp copy(SignUpData signUpData) {
            AbstractC4154l.m8923f(signUpData, "signUpData");
            return new ConfirmingSignUp(signUpData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmingSignUp) && AbstractC4154l.m8918a(this.signUpData, ((ConfirmingSignUp) obj).signUpData);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends SignUpState {
        private final Exception exception;
        private boolean hasNewResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception, boolean z6) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            this.exception = exception;
            this.hasNewResponse = z6;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            if ((i10 & 2) != 0) {
                z6 = error.hasNewResponse;
            }
            return error.copy(exc, z6);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final boolean component2() {
            return this.hasNewResponse;
        }

        public final Error copy(Exception exception, boolean z6) {
            AbstractC4154l.m8923f(exception, "exception");
            return new Error(exception, z6);
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
            return AbstractC4154l.m8918a(this.exception, error.exception) && this.hasNewResponse == error.hasNewResponse;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return Boolean.hashCode(this.hasNewResponse) + (this.exception.hashCode() * 31);
        }

        public final void setHasNewResponse(boolean z6) {
            this.hasNewResponse = z6;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        public /* synthetic */ Error(Exception exc, boolean z6, int i10, AbstractC4148f abstractC4148f) {
            this(exc, (i10 & 2) != 0 ? true : z6);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class InitiatingSignUp extends SignUpState {
        private final SignUpData signUpData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingSignUp(SignUpData signUpData) {
            super(null);
            AbstractC4154l.m8923f(signUpData, "signUpData");
            this.signUpData = signUpData;
        }

        public static /* synthetic */ InitiatingSignUp copy$default(InitiatingSignUp initiatingSignUp, SignUpData signUpData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signUpData = initiatingSignUp.signUpData;
            }
            return initiatingSignUp.copy(signUpData);
        }

        public final SignUpData component1() {
            return this.signUpData;
        }

        public final InitiatingSignUp copy(SignUpData signUpData) {
            AbstractC4154l.m8923f(signUpData, "signUpData");
            return new InitiatingSignUp(signUpData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingSignUp) && AbstractC4154l.m8918a(this.signUpData, ((InitiatingSignUp) obj).signUpData);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends SignUpState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43853id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43853id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43853id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43853id, ((NotStarted) obj).f43853id);
        }

        public final String getId() {
            return this.f43853id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43853id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43853id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43853id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<SignUpState> {
        private final NotStarted defaultState;
        private final SignUpActions signUpActions;

        public Resolver(SignUpActions signUpActions) {
            AbstractC4154l.m8923f(signUpActions, "signUpActions");
            this.signUpActions = signUpActions;
            this.defaultState = new NotStarted("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignUpState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignUpState, StateMachineResolver<SignUpState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignUpState> resolve(SignUpState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            AbstractC4148f abstractC4148f = null;
            int i10 = 2;
            StateResolution<SignUpState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            SignUpEvent.EventType eventTypeIsSignUpEvent = AuthEnvironmentKt.isSignUpEvent(event);
            boolean z6 = false;
            if ((oldState instanceof NotStarted) || (oldState instanceof SignedUp)) {
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp.getSignUpData()), pe.m10833h(this.signUpActions.initiateSignUpAction(initiateSignUp)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp) {
                    SignUpEvent.EventType.ConfirmSignUp confirmSignUp = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new ConfirmingSignUp(confirmSignUp.getSignUpData()), pe.m10833h(this.signUpActions.confirmSignUpAction(confirmSignUp)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z6, i10, abstractC4148f), null, 2, null);
                }
            } else if (oldState instanceof InitiatingSignUp) {
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp2 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp2.getSignUpData()), pe.m10833h(this.signUpActions.initiateSignUpAction(initiateSignUp2)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUpComplete) {
                    SignUpEvent.EventType.InitiateSignUpComplete initiateSignUpComplete = (SignUpEvent.EventType.InitiateSignUpComplete) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new AwaitingUserConfirmation(initiateSignUpComplete.getSignUpData(), initiateSignUpComplete.getSignUpResult()), null, 2, null);
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp) {
                    SignUpEvent.EventType.ConfirmSignUp confirmSignUp2 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new ConfirmingSignUp(confirmSignUp2.getSignUpData()), pe.m10833h(this.signUpActions.confirmSignUpAction(confirmSignUp2)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.SignedUp) {
                    SignUpEvent.EventType.SignedUp signedUp = (SignUpEvent.EventType.SignedUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new SignedUp(signedUp.getSignUpData(), signedUp.getSignUpResult()), null, 2, null);
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z6, i10, abstractC4148f), null, 2, null);
                }
            } else if (oldState instanceof AwaitingUserConfirmation) {
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp3 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp3.getSignUpData()), pe.m10833h(this.signUpActions.initiateSignUpAction(initiateSignUp3)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp) {
                    SignUpEvent.EventType.ConfirmSignUp confirmSignUp3 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new ConfirmingSignUp(confirmSignUp3.getSignUpData()), pe.m10833h(this.signUpActions.confirmSignUpAction(confirmSignUp3)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z6, i10, abstractC4148f), null, 2, null);
                }
            } else if (oldState instanceof ConfirmingSignUp) {
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp4 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp4.getSignUpData()), pe.m10833h(this.signUpActions.initiateSignUpAction(initiateSignUp4)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp) {
                    SignUpEvent.EventType.ConfirmSignUp confirmSignUp4 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new ConfirmingSignUp(confirmSignUp4.getSignUpData()), pe.m10833h(this.signUpActions.confirmSignUpAction(confirmSignUp4)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.SignedUp) {
                    SignUpEvent.EventType.SignedUp signedUp2 = (SignUpEvent.EventType.SignedUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new SignedUp(signedUp2.getSignUpData(), signedUp2.getSignUpResult()), null, 2, null);
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((SignUpEvent.EventType.ThrowError) eventTypeIsSignUpEvent).getException(), z6, i10, abstractC4148f), null, 2, null);
                }
            } else {
                if (!(oldState instanceof Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.InitiateSignUp) {
                    SignUpEvent.EventType.InitiateSignUp initiateSignUp5 = (SignUpEvent.EventType.InitiateSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new InitiatingSignUp(initiateSignUp5.getSignUpData()), pe.m10833h(this.signUpActions.initiateSignUpAction(initiateSignUp5)));
                }
                if (eventTypeIsSignUpEvent instanceof SignUpEvent.EventType.ConfirmSignUp) {
                    SignUpEvent.EventType.ConfirmSignUp confirmSignUp5 = (SignUpEvent.EventType.ConfirmSignUp) eventTypeIsSignUpEvent;
                    return new StateResolution<>(new ConfirmingSignUp(confirmSignUp5.getSignUpData()), pe.m10833h(this.signUpActions.confirmSignUpAction(confirmSignUp5)));
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedUp extends SignUpState {
        private final SignUpData signUpData;
        private final AuthSignUpResult signUpResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedUp(SignUpData signUpData, AuthSignUpResult signUpResult) {
            super(null);
            AbstractC4154l.m8923f(signUpData, "signUpData");
            AbstractC4154l.m8923f(signUpResult, "signUpResult");
            this.signUpData = signUpData;
            this.signUpResult = signUpResult;
        }

        public static /* synthetic */ SignedUp copy$default(SignedUp signedUp, SignUpData signUpData, AuthSignUpResult authSignUpResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signUpData = signedUp.signUpData;
            }
            if ((i10 & 2) != 0) {
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

        public final SignedUp copy(SignUpData signUpData, AuthSignUpResult signUpResult) {
            AbstractC4154l.m8923f(signUpData, "signUpData");
            AbstractC4154l.m8923f(signUpResult, "signUpResult");
            return new SignedUp(signUpData, signUpResult);
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
            return AbstractC4154l.m8918a(this.signUpData, signedUp.signUpData) && AbstractC4154l.m8918a(this.signUpResult, signedUp.signUpResult);
        }

        public final SignUpData getSignUpData() {
            return this.signUpData;
        }

        public final AuthSignUpResult getSignUpResult() {
            return this.signUpResult;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signUpResult.hashCode() + (this.signUpData.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedUp(signUpData=" + this.signUpData + ", signUpResult=" + this.signUpResult + ")";
        }
    }

    public /* synthetic */ SignUpState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private SignUpState() {
    }
}
