package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.auth.cognito.exceptions.service.UserCancelledException;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SignOutActions;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class SignOutState implements State {

    public static final class BuildingRevokeTokenError extends SignOutState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public BuildingRevokeTokenError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ BuildingRevokeTokenError copy$default(BuildingRevokeTokenError buildingRevokeTokenError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buildingRevokeTokenError.id;
            }
            return buildingRevokeTokenError.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final BuildingRevokeTokenError copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new BuildingRevokeTokenError(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildingRevokeTokenError) && sq8.m48644c(this.id, ((BuildingRevokeTokenError) obj).id);
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
            return "BuildingRevokeTokenError(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuildingRevokeTokenError(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ BuildingRevokeTokenError(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends SignOutState {
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

    public static final class NotStarted extends SignOutState {
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

    public static final class Resolver implements StateMachineResolver<SignOutState> {
        private final NotStarted defaultState;
        private final SignOutActions signOutActions;

        public Resolver(SignOutActions signOutActions) {
            sq8.m48649h(signOutActions, "signOutActions");
            this.signOutActions = signOutActions;
            this.defaultState = new NotStarted("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SignOutState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SignOutState, StateMachineResolver<SignOutState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SignOutState> resolve(SignOutState signOutState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(signOutState, "oldState");
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
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            StateResolution<SignOutState> stateResolution = new StateResolution<>(signOutState, null, 2, null);
            SignOutEvent.EventType eventTypeIsSignOutEvent = AuthEnvironmentKt.isSignOutEvent(stateMachineEvent);
            char c = 1;
            char c2 = 1;
            char c3 = 1;
            char c4 = 1;
            char c5 = 1;
            char c6 = 1;
            if (signOutState instanceof NotStarted) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.InvokeHostedUISignOut) {
                    SignOutEvent.EventType.InvokeHostedUISignOut invokeHostedUISignOut = (SignOutEvent.EventType.InvokeHostedUISignOut) eventTypeIsSignOutEvent;
                    return new StateResolution<>(new SigningOutHostedUI(invokeHostedUISignOut.getSignedInData(), invokeHostedUISignOut.getSignOutData().getGlobalSignOut(), invokeHostedUISignOut.getSignOutData().getBypassCancel()), bh3.m18963e(this.signOutActions.hostedUISignOutAction(invokeHostedUISignOut)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGlobally) {
                    return new StateResolution<>(new SigningOutGlobally(str, c6 == true ? 1 : 0, objArr11 == true ? 1 : 0), bh3.m18963e(this.signOutActions.globalSignOutAction((SignOutEvent.EventType.SignOutGlobally) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(objArr10 == true ? 1 : 0, c5 == true ? 1 : 0, objArr9 == true ? 1 : 0), bh3.m18963e(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (!(eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutLocally)) {
                    return stateResolution;
                }
                SignOutEvent.EventType.SignOutLocally signOutLocally = (SignOutEvent.EventType.SignOutLocally) eventTypeIsSignOutEvent;
                return new StateResolution<>(new SigningOutLocally(signOutLocally.getSignedInData()), bh3.m18963e(this.signOutActions.localSignOutAction(signOutLocally)));
            }
            if (signOutState instanceof SigningOutHostedUI) {
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGlobally) {
                    return new StateResolution<>(new SigningOutGlobally(objArr8 == true ? 1 : 0, c4 == true ? 1 : 0, objArr7 == true ? 1 : 0), bh3.m18963e(this.signOutActions.globalSignOutAction((SignOutEvent.EventType.SignOutGlobally) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                    return new StateResolution<>(new RevokingToken(objArr6 == true ? 1 : 0, c3 == true ? 1 : 0, objArr5 == true ? 1 : 0), bh3.m18963e(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
                }
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.UserCancelled) {
                    return new StateResolution<>(new Error(new UserCancelledException("The user cancelled the sign-out attempt, so it did not complete.", "To recover: catch this error, and attempt the sign out again.", null, 4, null)), bh3.m18963e(this.signOutActions.userCancelledAction((SignOutEvent.EventType.UserCancelled) eventTypeIsSignOutEvent)));
                }
                return stateResolution;
            }
            if (signOutState instanceof SigningOutLocally) {
                AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(stateMachineEvent);
                if (!(eventTypeIsAuthEvent instanceof AuthEvent.EventType.ReceivedCachedCredentials)) {
                    return eventTypeIsAuthEvent instanceof AuthEvent.EventType.CachedCredentialsFailed ? new StateResolution<>(new Error(new Exception("Failed clearing store")), null, 2, null) : stateResolution;
                }
                SignedInData signedInData = ((SigningOutLocally) signOutState).getSignedInData();
                return new StateResolution<>(new SignedOut(new SignedOutData(signedInData != null ? signedInData.getUsername() : null, null, null, null, 14, null)), null, 2, null);
            }
            if (!(signOutState instanceof SigningOutGlobally)) {
                if (!(signOutState instanceof RevokingToken ? true : signOutState instanceof BuildingRevokeTokenError) || !(eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutLocally)) {
                    return stateResolution;
                }
                SignOutEvent.EventType.SignOutLocally signOutLocally2 = (SignOutEvent.EventType.SignOutLocally) eventTypeIsSignOutEvent;
                return new StateResolution<>(new SigningOutLocally(signOutLocally2.getSignedInData()), bh3.m18963e(this.signOutActions.localSignOutAction(signOutLocally2)));
            }
            if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.RevokeToken) {
                return new StateResolution<>(new RevokingToken(objArr4 == true ? 1 : 0, c2 == true ? 1 : 0, objArr3 == true ? 1 : 0), bh3.m18963e(this.signOutActions.revokeTokenAction((SignOutEvent.EventType.RevokeToken) eventTypeIsSignOutEvent)));
            }
            if (!(eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignOutGloballyError)) {
                return stateResolution;
            }
            return new StateResolution<>(new BuildingRevokeTokenError(objArr2 == true ? 1 : 0, c == true ? 1 : 0, objArr == true ? 1 : 0), bh3.m18963e(this.signOutActions.buildRevokeTokenErrorAction((SignOutEvent.EventType.SignOutGloballyError) eventTypeIsSignOutEvent)));
        }
    }

    public static final class RevokingToken extends SignOutState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public RevokingToken() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RevokingToken copy$default(RevokingToken revokingToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = revokingToken.id;
            }
            return revokingToken.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final RevokingToken copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new RevokingToken(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevokingToken) && sq8.m48644c(this.id, ((RevokingToken) obj).id);
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
            return "RevokingToken(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevokingToken(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ RevokingToken(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SignedOut extends SignOutState {
        private final SignedOutData signedOutData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedOut(SignedOutData signedOutData) {
            super(null);
            sq8.m48649h(signedOutData, "signedOutData");
            this.signedOutData = signedOutData;
        }

        public static /* synthetic */ SignedOut copy$default(SignedOut signedOut, SignedOutData signedOutData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedOutData = signedOut.signedOutData;
            }
            return signedOut.copy(signedOutData);
        }

        public final SignedOutData component1() {
            return this.signedOutData;
        }

        public final SignedOut copy(SignedOutData signedOutData) {
            sq8.m48649h(signedOutData, "signedOutData");
            return new SignedOut(signedOutData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedOut) && sq8.m48644c(this.signedOutData, ((SignedOut) obj).signedOutData);
        }

        public final SignedOutData getSignedOutData() {
            return this.signedOutData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signedOutData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedOut(signedOutData=" + this.signedOutData + ")";
        }
    }

    public static final class SigningOutGlobally extends SignOutState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningOutGlobally() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningOutGlobally copy$default(SigningOutGlobally signingOutGlobally, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signingOutGlobally.id;
            }
            return signingOutGlobally.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SigningOutGlobally copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SigningOutGlobally(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOutGlobally) && sq8.m48644c(this.id, ((SigningOutGlobally) obj).id);
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
            return "SigningOutGlobally(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOutGlobally(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SigningOutGlobally(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningOutHostedUI extends SignOutState {
        private final boolean bypassCancel;
        private final boolean globalSignOut;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOutHostedUI(SignedInData signedInData, boolean z, boolean z2) {
            super(null);
            sq8.m48649h(signedInData, "signedInData");
            this.signedInData = signedInData;
            this.globalSignOut = z;
            this.bypassCancel = z2;
        }

        public static /* synthetic */ SigningOutHostedUI copy$default(SigningOutHostedUI signingOutHostedUI, SignedInData signedInData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = signingOutHostedUI.signedInData;
            }
            if ((i & 2) != 0) {
                z = signingOutHostedUI.globalSignOut;
            }
            if ((i & 4) != 0) {
                z2 = signingOutHostedUI.bypassCancel;
            }
            return signingOutHostedUI.copy(signedInData, z, z2);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final boolean component2() {
            return this.globalSignOut;
        }

        public final boolean component3() {
            return this.bypassCancel;
        }

        public final SigningOutHostedUI copy(SignedInData signedInData, boolean z, boolean z2) {
            sq8.m48649h(signedInData, "signedInData");
            return new SigningOutHostedUI(signedInData, z, z2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SigningOutHostedUI)) {
                return false;
            }
            SigningOutHostedUI signingOutHostedUI = (SigningOutHostedUI) obj;
            return sq8.m48644c(this.signedInData, signingOutHostedUI.signedInData) && this.globalSignOut == signingOutHostedUI.globalSignOut && this.bypassCancel == signingOutHostedUI.bypassCancel;
        }

        public final boolean getBypassCancel() {
            return this.bypassCancel;
        }

        public final boolean getGlobalSignOut() {
            return this.globalSignOut;
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.signedInData.hashCode() * 31;
            boolean z = this.globalSignOut;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (iHashCode + i) * 31;
            boolean z2 = this.bypassCancel;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOutHostedUI(signedInData=" + this.signedInData + ", globalSignOut=" + this.globalSignOut + ", bypassCancel=" + this.bypassCancel + ")";
        }
    }

    public static final class SigningOutLocally extends SignOutState {
        private final SignedInData signedInData;

        public SigningOutLocally(SignedInData signedInData) {
            super(null);
            this.signedInData = signedInData;
        }

        public static /* synthetic */ SigningOutLocally copy$default(SigningOutLocally signingOutLocally, SignedInData signedInData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = signingOutLocally.signedInData;
            }
            return signingOutLocally.copy(signedInData);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final SigningOutLocally copy(SignedInData signedInData) {
            return new SigningOutLocally(signedInData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOutLocally) && sq8.m48644c(this.signedInData, ((SigningOutLocally) obj).signedInData);
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            SignedInData signedInData = this.signedInData;
            if (signedInData == null) {
                return 0;
            }
            return signedInData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOutLocally(signedInData=" + this.signedInData + ")";
        }
    }

    private SignOutState() {
    }

    public /* synthetic */ SignOutState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
