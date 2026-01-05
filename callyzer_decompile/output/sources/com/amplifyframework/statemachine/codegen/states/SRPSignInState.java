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
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SRPSignInState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Cancelling extends SRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43832id;

        /* JADX WARN: Multi-variable type inference failed */
        public Cancelling() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Cancelling copy$default(Cancelling cancelling, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cancelling.f43832id;
            }
            return cancelling.copy(str);
        }

        public final String component1() {
            return this.f43832id;
        }

        public final Cancelling copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Cancelling(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancelling) && AbstractC4154l.m8918a(this.f43832id, ((Cancelling) obj).f43832id);
        }

        public final String getId() {
            return this.f43832id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43832id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Cancelling(id=", this.f43832id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancelling(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43832id = id2;
        }

        public /* synthetic */ Cancelling(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends SRPSignInState {
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
    public static final class InitiatingSRPA extends SRPSignInState {
        private final SignInMethod signInMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatingSRPA(SignInMethod signInMethod) {
            super(null);
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            this.signInMethod = signInMethod;
        }

        public static /* synthetic */ InitiatingSRPA copy$default(InitiatingSRPA initiatingSRPA, SignInMethod signInMethod, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signInMethod = initiatingSRPA.signInMethod;
            }
            return initiatingSRPA.copy(signInMethod);
        }

        public final SignInMethod component1() {
            return this.signInMethod;
        }

        public final InitiatingSRPA copy(SignInMethod signInMethod) {
            AbstractC4154l.m8923f(signInMethod, "signInMethod");
            return new InitiatingSRPA(signInMethod);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatingSRPA) && AbstractC4154l.m8918a(this.signInMethod, ((InitiatingSRPA) obj).signInMethod);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends SRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43833id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43833id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43833id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43833id, ((NotStarted) obj).f43833id);
        }

        public final String getId() {
            return this.f43833id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43833id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43833id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43833id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<SRPSignInState> {
        private final NotStarted defaultState;
        private final SRPActions srpActions;

        public Resolver(SRPActions srpActions) {
            AbstractC4154l.m8923f(srpActions, "srpActions");
            this.srpActions = srpActions;
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
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SRPSignInState, StateMachineResolver<SRPSignInState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SRPSignInState> resolve(SRPSignInState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            SRPEvent.EventType eventTypeAsSRPEvent = asSRPEvent(event);
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
            StateResolution<SRPSignInState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            if (!(oldState instanceof NotStarted)) {
                int i10 = 1;
                if (oldState instanceof InitiatingSRPA) {
                    if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.RespondPasswordVerifier) {
                        SRPEvent.EventType.RespondPasswordVerifier respondPasswordVerifier = (SRPEvent.EventType.RespondPasswordVerifier) eventTypeAsSRPEvent;
                        return new StateResolution<>(new RespondingPasswordVerifier(str, i10, objArr9 == true ? 1 : 0), pe.m10833h(this.srpActions.verifyPasswordSRPAction(respondPasswordVerifier.getChallengeParameters(), respondPasswordVerifier.getMetadata(), respondPasswordVerifier.getSession(), ((InitiatingSRPA) oldState).getSignInMethod())));
                    }
                    if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.ThrowAuthError) {
                        return new StateResolution<>(new Error(((SRPEvent.EventType.ThrowAuthError) eventTypeAsSRPEvent).getException()), null, 2, null);
                    }
                    if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.CancelSRPSignIn) {
                        return new StateResolution<>(new Cancelling(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0), null, 2, null);
                    }
                } else if (oldState instanceof RespondingPasswordVerifier) {
                    if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.RetryRespondPasswordVerifier) {
                        SRPEvent.EventType.RetryRespondPasswordVerifier retryRespondPasswordVerifier = (SRPEvent.EventType.RetryRespondPasswordVerifier) eventTypeAsSRPEvent;
                        return new StateResolution<>(new RespondingPasswordVerifier(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.srpActions.verifyPasswordSRPAction(retryRespondPasswordVerifier.getChallengeParameters(), retryRespondPasswordVerifier.getMetadata(), retryRespondPasswordVerifier.getSession(), retryRespondPasswordVerifier.getSignInMethod())));
                    }
                    if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.ThrowPasswordVerifierError) {
                        return new StateResolution<>(new Error(((SRPEvent.EventType.ThrowPasswordVerifierError) eventTypeAsSRPEvent).getException()), null, 2, null);
                    }
                    if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.CancelSRPSignIn) {
                        return new StateResolution<>(new Cancelling(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), null, 2, null);
                    }
                } else if ((oldState instanceof Cancelling) && (eventTypeAsSRPEvent instanceof SRPEvent.EventType.Reset)) {
                    return new StateResolution<>(new NotStarted(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), null, 2, null);
                }
            } else {
                if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.InitiateSRP) {
                    SRPEvent.EventType.InitiateSRP initiateSRP = (SRPEvent.EventType.InitiateSRP) eventTypeAsSRPEvent;
                    return new StateResolution<>(new InitiatingSRPA(AuthFlowTypeHelperKt.toSignInMethod(initiateSRP.getAuthFlowType())), pe.m10833h(this.srpActions.initiateSRPAuthAction(initiateSRP)));
                }
                if (eventTypeAsSRPEvent instanceof SRPEvent.EventType.InitiateSRPWithCustom) {
                    return new StateResolution<>(new InitiatingSRPA(new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.CUSTOM_AUTH)), pe.m10833h(this.srpActions.initiateSRPWithCustomAuthAction((SRPEvent.EventType.InitiateSRPWithCustom) eventTypeAsSRPEvent)));
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RespondingPasswordVerifier extends SRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43834id;

        /* JADX WARN: Multi-variable type inference failed */
        public RespondingPasswordVerifier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RespondingPasswordVerifier copy$default(RespondingPasswordVerifier respondingPasswordVerifier, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = respondingPasswordVerifier.f43834id;
            }
            return respondingPasswordVerifier.copy(str);
        }

        public final String component1() {
            return this.f43834id;
        }

        public final RespondingPasswordVerifier copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new RespondingPasswordVerifier(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingPasswordVerifier) && AbstractC4154l.m8918a(this.f43834id, ((RespondingPasswordVerifier) obj).f43834id);
        }

        public final String getId() {
            return this.f43834id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43834id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("RespondingPasswordVerifier(id=", this.f43834id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingPasswordVerifier(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43834id = id2;
        }

        public /* synthetic */ RespondingPasswordVerifier(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedIn extends SRPSignInState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43835id;

        /* JADX WARN: Multi-variable type inference failed */
        public SignedIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signedIn.f43835id;
            }
            return signedIn.copy(str);
        }

        public final String component1() {
            return this.f43835id;
        }

        public final SignedIn copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new SignedIn(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedIn) && AbstractC4154l.m8918a(this.f43835id, ((SignedIn) obj).f43835id);
        }

        public final String getId() {
            return this.f43835id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43835id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SignedIn(id=", this.f43835id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43835id = id2;
        }

        public /* synthetic */ SignedIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ SRPSignInState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private SRPSignInState() {
    }
}
