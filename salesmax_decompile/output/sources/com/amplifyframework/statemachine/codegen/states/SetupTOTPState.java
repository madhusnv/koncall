package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.client.config.CookieSpecs;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class SetupTOTPState implements State {

    public static final class Error extends SetupTOTPState {
        private final Exception exception;
        private boolean hasNewResponse;
        private final String session;
        private final SignInMethod signInMethod;
        private final String username;

        public /* synthetic */ Error(Exception exc, String str, String str2, SignInMethod signInMethod, boolean z, int i, id5 id5Var) {
            this(exc, str, str2, signInMethod, (i & 16) != 0 ? false : z);
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, String str, String str2, SignInMethod signInMethod, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            if ((i & 2) != 0) {
                str = error.username;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = error.session;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                signInMethod = error.signInMethod;
            }
            SignInMethod signInMethod2 = signInMethod;
            if ((i & 16) != 0) {
                z = error.hasNewResponse;
            }
            return error.copy(exc, str3, str4, signInMethod2, z);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final String component2() {
            return this.username;
        }

        public final String component3() {
            return this.session;
        }

        public final SignInMethod component4() {
            return this.signInMethod;
        }

        public final boolean component5() {
            return this.hasNewResponse;
        }

        public final Error copy(Exception exc, String str, String str2, SignInMethod signInMethod, boolean z) {
            sq8.m48649h(exc, "exception");
            sq8.m48649h(str, "username");
            sq8.m48649h(signInMethod, "signInMethod");
            return new Error(exc, str, str2, signInMethod, z);
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
            return sq8.m48644c(this.exception, error.exception) && sq8.m48644c(this.username, error.username) && sq8.m48644c(this.session, error.session) && sq8.m48644c(this.signInMethod, error.signInMethod) && this.hasNewResponse == error.hasNewResponse;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        public final String getSession() {
            return this.session;
        }

        public final SignInMethod getSignInMethod() {
            return this.signInMethod;
        }

        public final String getUsername() {
            return this.username;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = ((this.exception.hashCode() * 31) + this.username.hashCode()) * 31;
            String str = this.session;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.signInMethod.hashCode()) * 31;
            boolean z = this.hasNewResponse;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode2 + i;
        }

        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ", username=" + this.username + ", session=" + this.session + ", signInMethod=" + this.signInMethod + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc, String str, String str2, SignInMethod signInMethod, boolean z) {
            super(null);
            sq8.m48649h(exc, "exception");
            sq8.m48649h(str, "username");
            sq8.m48649h(signInMethod, "signInMethod");
            this.exception = exc;
            this.username = str;
            this.session = str2;
            this.signInMethod = signInMethod;
            this.hasNewResponse = z;
        }
    }

    public static final class NotStarted extends SetupTOTPState {
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

    public static final class Resolver implements StateMachineResolver<SetupTOTPState> {
        private final NotStarted defaultState;
        private final SetupTOTPActions setupTOTPActions;

        public Resolver(SetupTOTPActions setupTOTPActions) {
            sq8.m48649h(setupTOTPActions, "setupTOTPActions");
            this.setupTOTPActions = setupTOTPActions;
            this.defaultState = new NotStarted(CookieSpecs.DEFAULT);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SetupTOTPState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SetupTOTPState, StateMachineResolver<SetupTOTPState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SetupTOTPState> resolve(SetupTOTPState setupTOTPState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(setupTOTPState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
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
            StateResolution<SetupTOTPState> stateResolution = new StateResolution<>(setupTOTPState, null, 2, null);
            SetupTOTPEvent setupTOTPEvent = stateMachineEvent instanceof SetupTOTPEvent ? (SetupTOTPEvent) stateMachineEvent : null;
            SetupTOTPEvent.EventType eventType = setupTOTPEvent != null ? setupTOTPEvent.getEventType() : null;
            int i = 1;
            if (setupTOTPState instanceof NotStarted) {
                if (eventType instanceof SetupTOTPEvent.EventType.SetupTOTP) {
                    return new StateResolution<>(new SetupTOTP(str, i, objArr9 == true ? 1 : 0), bh3.m18963e(this.setupTOTPActions.initiateTOTPSetup((SetupTOTPEvent.EventType.SetupTOTP) eventType)));
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError.getException(), throwAuthError.getUsername(), throwAuthError.getSession(), throwAuthError.getSignInMethod(), false, 16, null), null, 2, null);
            }
            if (setupTOTPState instanceof SetupTOTP) {
                if (eventType instanceof SetupTOTPEvent.EventType.WaitForAnswer) {
                    SetupTOTPEvent.EventType.WaitForAnswer waitForAnswer = (SetupTOTPEvent.EventType.WaitForAnswer) eventType;
                    return new StateResolution<>(new WaitingForAnswer(waitForAnswer.getTotpSetupDetails(), true, waitForAnswer.getChallengeParams(), waitForAnswer.getSignInMethod()), null, 2, null);
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError2 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError2.getException(), throwAuthError2.getUsername(), throwAuthError2.getSession(), throwAuthError2.getSignInMethod(), false, 16, null), null, 2, null);
            }
            if (setupTOTPState instanceof WaitingForAnswer) {
                if (eventType instanceof SetupTOTPEvent.EventType.VerifyChallengeAnswer) {
                    return new StateResolution<>(new Verifying(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0), bh3.m18963e(this.setupTOTPActions.verifyChallengeAnswer((SetupTOTPEvent.EventType.VerifyChallengeAnswer) eventType)));
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError3 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError3.getException(), throwAuthError3.getUsername(), throwAuthError3.getSession(), throwAuthError3.getSignInMethod(), false, 16, null), null, 2, null);
            }
            if (setupTOTPState instanceof Verifying) {
                if (eventType instanceof SetupTOTPEvent.EventType.RespondToAuthChallenge) {
                    return new StateResolution<>(new RespondingToAuthChallenge(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), bh3.m18963e(this.setupTOTPActions.respondToAuthChallenge((SetupTOTPEvent.EventType.RespondToAuthChallenge) eventType)));
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError4 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError4.getException(), throwAuthError4.getUsername(), throwAuthError4.getSession(), throwAuthError4.getSignInMethod(), true), null, 2, null);
            }
            if (setupTOTPState instanceof RespondingToAuthChallenge) {
                if (eventType instanceof SetupTOTPEvent.EventType.Verified) {
                    return new StateResolution<>(new Success(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), null, 2, null);
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError5 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError5.getException(), throwAuthError5.getUsername(), throwAuthError5.getSession(), throwAuthError5.getSignInMethod(), false, 16, null), null, 2, null);
            }
            if (!(setupTOTPState instanceof Error)) {
                return stateResolution;
            }
            if (eventType instanceof SetupTOTPEvent.EventType.VerifyChallengeAnswer) {
                return new StateResolution<>(new Verifying(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), bh3.m18963e(this.setupTOTPActions.verifyChallengeAnswer((SetupTOTPEvent.EventType.VerifyChallengeAnswer) eventType)));
            }
            if (!(eventType instanceof SetupTOTPEvent.EventType.WaitForAnswer)) {
                return stateResolution;
            }
            SetupTOTPEvent.EventType.WaitForAnswer waitForAnswer2 = (SetupTOTPEvent.EventType.WaitForAnswer) eventType;
            return new StateResolution<>(new WaitingForAnswer(waitForAnswer2.getTotpSetupDetails(), true, waitForAnswer2.getChallengeParams(), waitForAnswer2.getSignInMethod()), null, 2, null);
        }
    }

    public static final class RespondingToAuthChallenge extends SetupTOTPState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public RespondingToAuthChallenge() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RespondingToAuthChallenge copy$default(RespondingToAuthChallenge respondingToAuthChallenge, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = respondingToAuthChallenge.id;
            }
            return respondingToAuthChallenge.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final RespondingToAuthChallenge copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new RespondingToAuthChallenge(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingToAuthChallenge) && sq8.m48644c(this.id, ((RespondingToAuthChallenge) obj).id);
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
            return "RespondingToAuthChallenge(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingToAuthChallenge(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ RespondingToAuthChallenge(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SetupTOTP extends SetupTOTPState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SetupTOTP() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SetupTOTP copy$default(SetupTOTP setupTOTP, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupTOTP.id;
            }
            return setupTOTP.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SetupTOTP copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SetupTOTP(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupTOTP) && sq8.m48644c(this.id, ((SetupTOTP) obj).id);
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
            return "SetupTOTP(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupTOTP(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SetupTOTP(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Success extends SetupTOTPState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Success() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.id;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Success copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Success(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && sq8.m48644c(this.id, ((Success) obj).id);
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
            return "Success(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Success(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Verifying extends SetupTOTPState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Verifying() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Verifying copy$default(Verifying verifying, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifying.id;
            }
            return verifying.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Verifying copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Verifying(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verifying) && sq8.m48644c(this.id, ((Verifying) obj).id);
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
            return "Verifying(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verifying(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Verifying(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class WaitingForAnswer extends SetupTOTPState {
        private final Map<String, String> challengeParams;
        private boolean hasNewResponse;
        private final SignInMethod signInMethod;
        private final SignInTOTPSetupData signInTOTPSetupData;

        public /* synthetic */ WaitingForAnswer(SignInTOTPSetupData signInTOTPSetupData, boolean z, Map map, SignInMethod signInMethod, int i, id5 id5Var) {
            this(signInTOTPSetupData, (i & 2) != 0 ? false : z, map, signInMethod);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitingForAnswer copy$default(WaitingForAnswer waitingForAnswer, SignInTOTPSetupData signInTOTPSetupData, boolean z, Map map, SignInMethod signInMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                signInTOTPSetupData = waitingForAnswer.signInTOTPSetupData;
            }
            if ((i & 2) != 0) {
                z = waitingForAnswer.hasNewResponse;
            }
            if ((i & 4) != 0) {
                map = waitingForAnswer.challengeParams;
            }
            if ((i & 8) != 0) {
                signInMethod = waitingForAnswer.signInMethod;
            }
            return waitingForAnswer.copy(signInTOTPSetupData, z, map, signInMethod);
        }

        public final SignInTOTPSetupData component1() {
            return this.signInTOTPSetupData;
        }

        public final boolean component2() {
            return this.hasNewResponse;
        }

        public final Map<String, String> component3() {
            return this.challengeParams;
        }

        public final SignInMethod component4() {
            return this.signInMethod;
        }

        public final WaitingForAnswer copy(SignInTOTPSetupData signInTOTPSetupData, boolean z, Map<String, String> map, SignInMethod signInMethod) {
            sq8.m48649h(signInTOTPSetupData, "signInTOTPSetupData");
            sq8.m48649h(signInMethod, "signInMethod");
            return new WaitingForAnswer(signInTOTPSetupData, z, map, signInMethod);
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
            return sq8.m48644c(this.signInTOTPSetupData, waitingForAnswer.signInTOTPSetupData) && this.hasNewResponse == waitingForAnswer.hasNewResponse && sq8.m48644c(this.challengeParams, waitingForAnswer.challengeParams) && sq8.m48644c(this.signInMethod, waitingForAnswer.signInMethod);
        }

        public final Map<String, String> getChallengeParams() {
            return this.challengeParams;
        }

        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        public final SignInMethod getSignInMethod() {
            return this.signInMethod;
        }

        public final SignInTOTPSetupData getSignInTOTPSetupData() {
            return this.signInTOTPSetupData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.signInTOTPSetupData.hashCode() * 31;
            boolean z = this.hasNewResponse;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (iHashCode + i) * 31;
            Map<String, String> map = this.challengeParams;
            return ((i2 + (map == null ? 0 : map.hashCode())) * 31) + this.signInMethod.hashCode();
        }

        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "WaitingForAnswer(signInTOTPSetupData=" + this.signInTOTPSetupData + ", hasNewResponse=" + this.hasNewResponse + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingForAnswer(SignInTOTPSetupData signInTOTPSetupData, boolean z, Map<String, String> map, SignInMethod signInMethod) {
            super(null);
            sq8.m48649h(signInTOTPSetupData, "signInTOTPSetupData");
            sq8.m48649h(signInMethod, "signInMethod");
            this.signInTOTPSetupData = signInTOTPSetupData;
            this.hasNewResponse = z;
            this.challengeParams = map;
            this.signInMethod = signInMethod;
        }
    }

    private SetupTOTPState() {
    }

    public /* synthetic */ SetupTOTPState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
