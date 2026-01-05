package com.amplifyframework.statemachine.codegen.states;

import a2.AbstractC0030c;
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
import com.sun.mail.util.AbstractC1452a;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SetupTOTPState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends SetupTOTPState {
        private final Exception exception;
        private boolean hasNewResponse;
        private final String session;
        private final SignInMethod signInMethod;
        private final String username;

        public /* synthetic */ Error(Exception exc, String str, String str2, SignInMethod signInMethod, boolean z6, int i10, AbstractC4148f abstractC4148f) {
            this(exc, str, str2, signInMethod, (i10 & 16) != 0 ? false : z6);
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, String str, String str2, SignInMethod signInMethod, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.exception;
            }
            if ((i10 & 2) != 0) {
                str = error.username;
            }
            if ((i10 & 4) != 0) {
                str2 = error.session;
            }
            if ((i10 & 8) != 0) {
                signInMethod = error.signInMethod;
            }
            if ((i10 & 16) != 0) {
                z6 = error.hasNewResponse;
            }
            boolean z10 = z6;
            String str3 = str2;
            return error.copy(exc, str, str3, signInMethod, z10);
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

        public final Error copy(Exception exception, String username, String str, SignInMethod signInMethod, boolean z6) {
            AbstractC4154l.m8923f(exception, "exception");
            AbstractC4154l.m8923f(username, "username");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            return new Error(exception, username, str, signInMethod, z6);
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
            return AbstractC4154l.m8918a(this.exception, error.exception) && AbstractC4154l.m8918a(this.username, error.username) && AbstractC4154l.m8918a(this.session, error.session) && AbstractC4154l.m8918a(this.signInMethod, error.signInMethod) && this.hasNewResponse == error.hasNewResponse;
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

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iM113d = AbstractC0030c.m113d(this.exception.hashCode() * 31, 31, this.username);
            String str = this.session;
            return Boolean.hashCode(this.hasNewResponse) + ((this.signInMethod.hashCode() + ((iM113d + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final void setHasNewResponse(boolean z6) {
            this.hasNewResponse = z6;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            Exception exc = this.exception;
            String str = this.username;
            String str2 = this.session;
            SignInMethod signInMethod = this.signInMethod;
            boolean z6 = this.hasNewResponse;
            StringBuilder sb2 = new StringBuilder("Error(exception=");
            sb2.append(exc);
            sb2.append(", username=");
            sb2.append(str);
            sb2.append(", session=");
            sb2.append(str2);
            sb2.append(", signInMethod=");
            sb2.append(signInMethod);
            sb2.append(", hasNewResponse=");
            return AbstractC5601a.m11242m(sb2, z6, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exception, String username, String str, SignInMethod signInMethod, boolean z6) {
            super(null);
            AbstractC4154l.m8923f(exception, "exception");
            AbstractC4154l.m8923f(username, "username");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            this.exception = exception;
            this.username = username;
            this.session = str;
            this.signInMethod = signInMethod;
            this.hasNewResponse = z6;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends SetupTOTPState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43836id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43836id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43836id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43836id, ((NotStarted) obj).f43836id);
        }

        public final String getId() {
            return this.f43836id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43836id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43836id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43836id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<SetupTOTPState> {
        private final NotStarted defaultState;
        private final SetupTOTPActions setupTOTPActions;

        public Resolver(SetupTOTPActions setupTOTPActions) {
            AbstractC4154l.m8923f(setupTOTPActions, "setupTOTPActions");
            this.setupTOTPActions = setupTOTPActions;
            this.defaultState = new NotStarted("default");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SetupTOTPState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SetupTOTPState, StateMachineResolver<SetupTOTPState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SetupTOTPState> resolve(SetupTOTPState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
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
            StateResolution<SetupTOTPState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            SetupTOTPEvent setupTOTPEvent = event instanceof SetupTOTPEvent ? (SetupTOTPEvent) event : null;
            SetupTOTPEvent.EventType eventType = setupTOTPEvent != null ? setupTOTPEvent.getEventType() : null;
            int i10 = 1;
            if (oldState instanceof NotStarted) {
                if (eventType instanceof SetupTOTPEvent.EventType.SetupTOTP) {
                    return new StateResolution<>(new SetupTOTP(str, i10, objArr9 == true ? 1 : 0), pe.m10833h(this.setupTOTPActions.initiateTOTPSetup((SetupTOTPEvent.EventType.SetupTOTP) eventType)));
                }
                if (eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError) {
                    SetupTOTPEvent.EventType.ThrowAuthError throwAuthError = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                    return new StateResolution<>(new Error(throwAuthError.getException(), throwAuthError.getUsername(), throwAuthError.getSession(), throwAuthError.getSignInMethod(), false, 16, null), null, 2, null);
                }
            } else if (oldState instanceof SetupTOTP) {
                if (eventType instanceof SetupTOTPEvent.EventType.WaitForAnswer) {
                    SetupTOTPEvent.EventType.WaitForAnswer waitForAnswer = (SetupTOTPEvent.EventType.WaitForAnswer) eventType;
                    return new StateResolution<>(new WaitingForAnswer(waitForAnswer.getTotpSetupDetails(), true, waitForAnswer.getChallengeParams(), waitForAnswer.getSignInMethod()), null, 2, null);
                }
                if (eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError) {
                    SetupTOTPEvent.EventType.ThrowAuthError throwAuthError2 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                    return new StateResolution<>(new Error(throwAuthError2.getException(), throwAuthError2.getUsername(), throwAuthError2.getSession(), throwAuthError2.getSignInMethod(), false, 16, null), null, 2, null);
                }
            } else if (oldState instanceof WaitingForAnswer) {
                if (eventType instanceof SetupTOTPEvent.EventType.VerifyChallengeAnswer) {
                    return new StateResolution<>(new Verifying(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0), pe.m10833h(this.setupTOTPActions.verifyChallengeAnswer((SetupTOTPEvent.EventType.VerifyChallengeAnswer) eventType)));
                }
                if (eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError) {
                    SetupTOTPEvent.EventType.ThrowAuthError throwAuthError3 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                    return new StateResolution<>(new Error(throwAuthError3.getException(), throwAuthError3.getUsername(), throwAuthError3.getSession(), throwAuthError3.getSignInMethod(), false, 16, null), null, 2, null);
                }
            } else if (oldState instanceof Verifying) {
                if (eventType instanceof SetupTOTPEvent.EventType.RespondToAuthChallenge) {
                    return new StateResolution<>(new RespondingToAuthChallenge(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.setupTOTPActions.respondToAuthChallenge((SetupTOTPEvent.EventType.RespondToAuthChallenge) eventType)));
                }
                if (eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError) {
                    SetupTOTPEvent.EventType.ThrowAuthError throwAuthError4 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                    return new StateResolution<>(new Error(throwAuthError4.getException(), throwAuthError4.getUsername(), throwAuthError4.getSession(), throwAuthError4.getSignInMethod(), true), null, 2, null);
                }
            } else if (oldState instanceof RespondingToAuthChallenge) {
                if (eventType instanceof SetupTOTPEvent.EventType.Verified) {
                    return new StateResolution<>(new Success(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), null, 2, null);
                }
                if (eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError) {
                    SetupTOTPEvent.EventType.ThrowAuthError throwAuthError5 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                    return new StateResolution<>(new Error(throwAuthError5.getException(), throwAuthError5.getUsername(), throwAuthError5.getSession(), throwAuthError5.getSignInMethod(), false, 16, null), null, 2, null);
                }
            } else if (oldState instanceof Error) {
                if (eventType instanceof SetupTOTPEvent.EventType.VerifyChallengeAnswer) {
                    return new StateResolution<>(new Verifying(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), pe.m10833h(this.setupTOTPActions.verifyChallengeAnswer((SetupTOTPEvent.EventType.VerifyChallengeAnswer) eventType)));
                }
                if (eventType instanceof SetupTOTPEvent.EventType.WaitForAnswer) {
                    SetupTOTPEvent.EventType.WaitForAnswer waitForAnswer2 = (SetupTOTPEvent.EventType.WaitForAnswer) eventType;
                    return new StateResolution<>(new WaitingForAnswer(waitForAnswer2.getTotpSetupDetails(), true, waitForAnswer2.getChallengeParams(), waitForAnswer2.getSignInMethod()), null, 2, null);
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RespondingToAuthChallenge extends SetupTOTPState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43837id;

        /* JADX WARN: Multi-variable type inference failed */
        public RespondingToAuthChallenge() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RespondingToAuthChallenge copy$default(RespondingToAuthChallenge respondingToAuthChallenge, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = respondingToAuthChallenge.f43837id;
            }
            return respondingToAuthChallenge.copy(str);
        }

        public final String component1() {
            return this.f43837id;
        }

        public final RespondingToAuthChallenge copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new RespondingToAuthChallenge(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingToAuthChallenge) && AbstractC4154l.m8918a(this.f43837id, ((RespondingToAuthChallenge) obj).f43837id);
        }

        public final String getId() {
            return this.f43837id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43837id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("RespondingToAuthChallenge(id=", this.f43837id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingToAuthChallenge(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43837id = id2;
        }

        public /* synthetic */ RespondingToAuthChallenge(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SetupTOTP extends SetupTOTPState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43838id;

        /* JADX WARN: Multi-variable type inference failed */
        public SetupTOTP() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SetupTOTP copy$default(SetupTOTP setupTOTP, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setupTOTP.f43838id;
            }
            return setupTOTP.copy(str);
        }

        public final String component1() {
            return this.f43838id;
        }

        public final SetupTOTP copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new SetupTOTP(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupTOTP) && AbstractC4154l.m8918a(this.f43838id, ((SetupTOTP) obj).f43838id);
        }

        public final String getId() {
            return this.f43838id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43838id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SetupTOTP(id=", this.f43838id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupTOTP(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43838id = id2;
        }

        public /* synthetic */ SetupTOTP(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Success extends SetupTOTPState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43839id;

        /* JADX WARN: Multi-variable type inference failed */
        public Success() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.f43839id;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.f43839id;
        }

        public final Success copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Success(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && AbstractC4154l.m8918a(this.f43839id, ((Success) obj).f43839id);
        }

        public final String getId() {
            return this.f43839id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43839id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Success(id=", this.f43839id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43839id = id2;
        }

        public /* synthetic */ Success(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Verifying extends SetupTOTPState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43840id;

        /* JADX WARN: Multi-variable type inference failed */
        public Verifying() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Verifying copy$default(Verifying verifying, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = verifying.f43840id;
            }
            return verifying.copy(str);
        }

        public final String component1() {
            return this.f43840id;
        }

        public final Verifying copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Verifying(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verifying) && AbstractC4154l.m8918a(this.f43840id, ((Verifying) obj).f43840id);
        }

        public final String getId() {
            return this.f43840id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43840id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Verifying(id=", this.f43840id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verifying(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43840id = id2;
        }

        public /* synthetic */ Verifying(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class WaitingForAnswer extends SetupTOTPState {
        private final Map<String, String> challengeParams;
        private boolean hasNewResponse;
        private final SignInMethod signInMethod;
        private final SignInTOTPSetupData signInTOTPSetupData;

        public /* synthetic */ WaitingForAnswer(SignInTOTPSetupData signInTOTPSetupData, boolean z6, Map map, SignInMethod signInMethod, int i10, AbstractC4148f abstractC4148f) {
            this(signInTOTPSetupData, (i10 & 2) != 0 ? false : z6, map, signInMethod);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitingForAnswer copy$default(WaitingForAnswer waitingForAnswer, SignInTOTPSetupData signInTOTPSetupData, boolean z6, Map map, SignInMethod signInMethod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signInTOTPSetupData = waitingForAnswer.signInTOTPSetupData;
            }
            if ((i10 & 2) != 0) {
                z6 = waitingForAnswer.hasNewResponse;
            }
            if ((i10 & 4) != 0) {
                map = waitingForAnswer.challengeParams;
            }
            if ((i10 & 8) != 0) {
                signInMethod = waitingForAnswer.signInMethod;
            }
            return waitingForAnswer.copy(signInTOTPSetupData, z6, map, signInMethod);
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

        public final WaitingForAnswer copy(SignInTOTPSetupData signInTOTPSetupData, boolean z6, Map<String, String> map, SignInMethod signInMethod) {
            AbstractC4154l.m8923f(signInTOTPSetupData, "signInTOTPSetupData");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            return new WaitingForAnswer(signInTOTPSetupData, z6, map, signInMethod);
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
            return AbstractC4154l.m8918a(this.signInTOTPSetupData, waitingForAnswer.signInTOTPSetupData) && this.hasNewResponse == waitingForAnswer.hasNewResponse && AbstractC4154l.m8918a(this.challengeParams, waitingForAnswer.challengeParams) && AbstractC4154l.m8918a(this.signInMethod, waitingForAnswer.signInMethod);
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

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iM4558e = AbstractC1452a.m4558e(this.signInTOTPSetupData.hashCode() * 31, 31, this.hasNewResponse);
            Map<String, String> map = this.challengeParams;
            return this.signInMethod.hashCode() + ((iM4558e + (map == null ? 0 : map.hashCode())) * 31);
        }

        public final void setHasNewResponse(boolean z6) {
            this.hasNewResponse = z6;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "WaitingForAnswer(signInTOTPSetupData=" + this.signInTOTPSetupData + ", hasNewResponse=" + this.hasNewResponse + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingForAnswer(SignInTOTPSetupData signInTOTPSetupData, boolean z6, Map<String, String> map, SignInMethod signInMethod) {
            super(null);
            AbstractC4154l.m8923f(signInTOTPSetupData, "signInTOTPSetupData");
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            this.signInTOTPSetupData = signInTOTPSetupData;
            this.hasNewResponse = z6;
            this.challengeParams = map;
            this.signInMethod = signInMethod;
        }
    }

    public /* synthetic */ SetupTOTPState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private SetupTOTPState() {
    }
}
