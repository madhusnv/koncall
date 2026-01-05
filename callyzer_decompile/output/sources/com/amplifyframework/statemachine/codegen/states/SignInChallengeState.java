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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SignInChallengeState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends SignInChallengeState {
        private final AuthChallenge challenge;
        private final Exception exception;
        private boolean hasNewResponse;
        private final SignInMethod signInMethod;

        public /* synthetic */ Error(Exception exc, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z6, int i10, AbstractC4148f abstractC4148f) {
            this(exc, authChallenge, signInMethod, (i10 & 8) != 0 ? false : z6);
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            if ((i10 & 2) != 0) {
                authChallenge = error.challenge;
            }
            if ((i10 & 4) != 0) {
                signInMethod = error.signInMethod;
            }
            if ((i10 & 8) != 0) {
                z6 = error.hasNewResponse;
            }
            return error.copy(exc, authChallenge, signInMethod, z6);
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

        public final Error copy(Exception exception, AuthChallenge challenge, SignInMethod signInMethod, boolean z6) {
            AbstractC4154l.m8923f(exception, "exception");
            AbstractC4154l.m8923f(challenge, "challenge");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            return new Error(exception, challenge, signInMethod, z6);
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
            return AbstractC4154l.m8918a(this.exception, error.exception) && AbstractC4154l.m8918a(this.challenge, error.challenge) && AbstractC4154l.m8918a(this.signInMethod, error.signInMethod) && this.hasNewResponse == error.hasNewResponse;
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

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return Boolean.hashCode(this.hasNewResponse) + ((this.signInMethod.hashCode() + ((this.challenge.hashCode() + (this.exception.hashCode() * 31)) * 31)) * 31);
        }

        public final void setHasNewResponse(boolean z6) {
            this.hasNewResponse = z6;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ", challenge=" + this.challenge + ", signInMethod=" + this.signInMethod + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception, AuthChallenge challenge, SignInMethod signInMethod, boolean z6) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            AbstractC4154l.m8923f(challenge, "challenge");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            this.exception = exception;
            this.challenge = challenge;
            this.signInMethod = signInMethod;
            this.hasNewResponse = z6;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends SignInChallengeState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43841id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43841id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43841id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43841id, ((NotStarted) obj).f43841id);
        }

        public final String getId() {
            return this.f43841id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43841id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43841id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43841id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<SignInChallengeState> {
        private final SignInChallengeActions challengeActions;
        private final SignInChallengeState defaultState;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(SignInChallengeActions challengeActions) {
            AbstractC4154l.m8923f(challengeActions, "challengeActions");
            this.challengeActions = challengeActions;
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
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignInChallengeState, StateMachineResolver<SignInChallengeState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public SignInChallengeState getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignInChallengeState> resolve(SignInChallengeState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            String str = null;
            Object[] objArr = 0;
            StateResolution<SignInChallengeState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            SignInChallengeEvent.EventType eventTypeAsSignInChallengeEvent = asSignInChallengeEvent(event);
            if (oldState instanceof NotStarted) {
                if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer)) {
                    return stateResolution;
                }
                SignInChallengeEvent.EventType.WaitForAnswer waitForAnswer = (SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent;
                return new StateResolution<>(new WaitingForAnswer(waitForAnswer.getChallenge(), waitForAnswer.getSignInMethod(), false, 4, null), null, 2, null);
            }
            int i10 = 1;
            if (oldState instanceof WaitingForAnswer) {
                if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer) {
                    WaitingForAnswer waitingForAnswer = (WaitingForAnswer) oldState;
                    return new StateResolution<>(new WaitingForAnswer(new AuthChallenge(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge().getChallengeName(), waitingForAnswer.getChallenge().getUsername(), waitingForAnswer.getChallenge().getSession(), waitingForAnswer.getChallenge().getParameters(), (List) null, 16, (AbstractC4148f) null), waitingForAnswer.getSignInMethod(), true), null, 2, null);
                }
                if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.VerifyChallengeAnswer)) {
                    return stateResolution;
                }
                SignInChallengeEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer = (SignInChallengeEvent.EventType.VerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
                WaitingForAnswer waitingForAnswer2 = (WaitingForAnswer) oldState;
                return new StateResolution<>(new Verifying(waitingForAnswer2.getChallenge().getChallengeName(), waitingForAnswer2.getSignInMethod()), pe.m10833h(this.challengeActions.verifyChallengeAuthAction(verifyChallengeAnswer.getAnswer(), verifyChallengeAnswer.getMetadata(), verifyChallengeAnswer.getUserAttributes(), waitingForAnswer2.getChallenge(), waitingForAnswer2.getSignInMethod())));
            }
            boolean z6 = oldState instanceof Verifying;
            C6668r c6668r = C6668r.f31943a;
            if (!z6) {
                if (!(oldState instanceof Error)) {
                    return stateResolution;
                }
                if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.VerifyChallengeAnswer) {
                    SignInChallengeEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer2 = (SignInChallengeEvent.EventType.VerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
                    Error error = (Error) oldState;
                    return new StateResolution<>(new Verifying(error.getChallenge().getChallengeName(), error.getSignInMethod()), pe.m10833h(this.challengeActions.verifyChallengeAuthAction(verifyChallengeAnswer2.getAnswer(), verifyChallengeAnswer2.getMetadata(), verifyChallengeAnswer2.getUserAttributes(), error.getChallenge(), error.getSignInMethod())));
                }
                if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer) {
                    return new StateResolution<>(new WaitingForAnswer(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge(), ((Error) oldState).getSignInMethod(), false, 4, null), c6668r);
                }
                return stateResolution;
            }
            if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.Verified) {
                return new StateResolution<>(new Verified(str, i10, objArr == true ? 1 : 0), null, 2, null);
            }
            if (eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.ThrowError) {
                SignInChallengeEvent.EventType.ThrowError throwError = (SignInChallengeEvent.EventType.ThrowError) eventTypeAsSignInChallengeEvent;
                return new StateResolution<>(new Error(throwError.getException(), throwError.getChallenge(), ((Verifying) oldState).getSignInMethod(), true), c6668r);
            }
            if (!(eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer)) {
                return eventTypeAsSignInChallengeEvent instanceof SignInChallengeEvent.EventType.WaitForAnswer ? new StateResolution<>(new WaitingForAnswer(((SignInChallengeEvent.EventType.WaitForAnswer) eventTypeAsSignInChallengeEvent).getChallenge(), ((Verifying) oldState).getSignInMethod(), true), c6668r) : stateResolution;
            }
            SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer retryVerifyChallengeAnswer = (SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer) eventTypeAsSignInChallengeEvent;
            Verifying verifying = (Verifying) oldState;
            return new StateResolution<>(new Verifying(retryVerifyChallengeAnswer.getAuthChallenge().getChallengeName(), verifying.getSignInMethod()), pe.m10833h(this.challengeActions.verifyChallengeAuthAction(retryVerifyChallengeAnswer.getAnswer(), retryVerifyChallengeAnswer.getMetadata(), retryVerifyChallengeAnswer.getUserAttributes(), retryVerifyChallengeAnswer.getAuthChallenge(), verifying.getSignInMethod())));
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Verified extends SignInChallengeState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43842id;

        /* JADX WARN: Multi-variable type inference failed */
        public Verified() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Verified copy$default(Verified verified, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = verified.f43842id;
            }
            return verified.copy(str);
        }

        public final String component1() {
            return this.f43842id;
        }

        public final Verified copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Verified(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && AbstractC4154l.m8918a(this.f43842id, ((Verified) obj).f43842id);
        }

        public final String getId() {
            return this.f43842id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43842id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Verified(id=", this.f43842id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verified(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43842id = id2;
        }

        public /* synthetic */ Verified(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class WaitingForAnswer extends SignInChallengeState {
        private final AuthChallenge challenge;
        private boolean hasNewResponse;
        private final SignInMethod signInMethod;

        public /* synthetic */ WaitingForAnswer(AuthChallenge authChallenge, SignInMethod signInMethod, boolean z6, int i10, AbstractC4148f abstractC4148f) {
            this(authChallenge, signInMethod, (i10 & 4) != 0 ? false : z6);
        }

        public static /* synthetic */ WaitingForAnswer copy$default(WaitingForAnswer waitingForAnswer, AuthChallenge authChallenge, SignInMethod signInMethod, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                authChallenge = waitingForAnswer.challenge;
            }
            if ((i10 & 2) != 0) {
                signInMethod = waitingForAnswer.signInMethod;
            }
            if ((i10 & 4) != 0) {
                z6 = waitingForAnswer.hasNewResponse;
            }
            return waitingForAnswer.copy(authChallenge, signInMethod, z6);
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

        public final WaitingForAnswer copy(AuthChallenge challenge, SignInMethod signInMethod, boolean z6) {
            AbstractC4154l.m8923f(challenge, "challenge");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            return new WaitingForAnswer(challenge, signInMethod, z6);
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
            return AbstractC4154l.m8918a(this.challenge, waitingForAnswer.challenge) && AbstractC4154l.m8918a(this.signInMethod, waitingForAnswer.signInMethod) && this.hasNewResponse == waitingForAnswer.hasNewResponse;
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

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return Boolean.hashCode(this.hasNewResponse) + ((this.signInMethod.hashCode() + (this.challenge.hashCode() * 31)) * 31);
        }

        public final void setHasNewResponse(boolean z6) {
            this.hasNewResponse = z6;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            AuthChallenge authChallenge = this.challenge;
            SignInMethod signInMethod = this.signInMethod;
            boolean z6 = this.hasNewResponse;
            StringBuilder sb2 = new StringBuilder("WaitingForAnswer(challenge=");
            sb2.append(authChallenge);
            sb2.append(", signInMethod=");
            sb2.append(signInMethod);
            sb2.append(", hasNewResponse=");
            return AbstractC5601a.m11242m(sb2, z6, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingForAnswer(AuthChallenge challenge, SignInMethod signInMethod, boolean z6) {
            super(null);
            AbstractC4154l.m8923f(challenge, "challenge");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            this.challenge = challenge;
            this.signInMethod = signInMethod;
            this.hasNewResponse = z6;
        }
    }

    public /* synthetic */ SignInChallengeState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Verifying extends SignInChallengeState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43843id;
        private final SignInMethod signInMethod;

        public /* synthetic */ Verifying(String str, SignInMethod signInMethod, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str, signInMethod);
        }

        public static /* synthetic */ Verifying copy$default(Verifying verifying, String str, SignInMethod signInMethod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = verifying.f43843id;
            }
            if ((i10 & 2) != 0) {
                signInMethod = verifying.signInMethod;
            }
            return verifying.copy(str, signInMethod);
        }

        public final String component1() {
            return this.f43843id;
        }

        public final SignInMethod component2() {
            return this.signInMethod;
        }

        public final Verifying copy(String id2, SignInMethod signInMethod) {
            AbstractC4154l.m8923f(id2, "id");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            return new Verifying(id2, signInMethod);
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
            return AbstractC4154l.m8918a(this.f43843id, verifying.f43843id) && AbstractC4154l.m8918a(this.signInMethod, verifying.signInMethod);
        }

        public final String getId() {
            return this.f43843id;
        }

        public final SignInMethod getSignInMethod() {
            return this.signInMethod;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signInMethod.hashCode() + (this.f43843id.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Verifying(id=" + this.f43843id + ", signInMethod=" + this.signInMethod + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verifying(String id2, SignInMethod signInMethod) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            this.f43843id = id2;
            this.signInMethod = signInMethod;
        }
    }

    private SignInChallengeState() {
    }
}
