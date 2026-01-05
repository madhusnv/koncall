package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.AuthenticationActions;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.states.SignInState;
import com.amplifyframework.statemachine.codegen.states.SignOutState;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes5.dex */
public abstract class AuthenticationState implements State {

    public static final class Configured extends AuthenticationState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Configured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Configured copy$default(Configured configured, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configured.id;
            }
            return configured.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Configured copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Configured(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Configured) && sq8.m48644c(this.id, ((Configured) obj).id);
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
            return "Configured(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Configured(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Configured(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends AuthenticationState {
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

    public static final class FederatedToIdentityPool extends AuthenticationState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public FederatedToIdentityPool() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FederatedToIdentityPool copy$default(FederatedToIdentityPool federatedToIdentityPool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = federatedToIdentityPool.id;
            }
            return federatedToIdentityPool.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final FederatedToIdentityPool copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new FederatedToIdentityPool(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FederatedToIdentityPool) && sq8.m48644c(this.id, ((FederatedToIdentityPool) obj).id);
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
            return "FederatedToIdentityPool(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatedToIdentityPool(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ FederatedToIdentityPool(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class FederatingToIdentityPool extends AuthenticationState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public FederatingToIdentityPool() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FederatingToIdentityPool copy$default(FederatingToIdentityPool federatingToIdentityPool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = federatingToIdentityPool.id;
            }
            return federatingToIdentityPool.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final FederatingToIdentityPool copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new FederatingToIdentityPool(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FederatingToIdentityPool) && sq8.m48644c(this.id, ((FederatingToIdentityPool) obj).id);
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
            return "FederatingToIdentityPool(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatingToIdentityPool(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ FederatingToIdentityPool(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class NotConfigured extends AuthenticationState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notConfigured.id;
            }
            return notConfigured.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final NotConfigured copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new NotConfigured(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && sq8.m48644c(this.id, ((NotConfigured) obj).id);
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
            return "NotConfigured(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ NotConfigured(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Resolver implements StateMachineResolver<AuthenticationState> {
        private final AuthenticationActions authenticationActions;
        private final NotConfigured defaultState;
        private final StateMachineResolver<SignInState> signInResolver;
        private final StateMachineResolver<SignOutState> signOutResolver;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(StateMachineResolver<SignInState> stateMachineResolver, StateMachineResolver<SignOutState> stateMachineResolver2, AuthenticationActions authenticationActions) {
            sq8.m48649h(stateMachineResolver, "signInResolver");
            sq8.m48649h(stateMachineResolver2, "signOutResolver");
            sq8.m48649h(authenticationActions, "authenticationActions");
            this.signInResolver = stateMachineResolver;
            this.signOutResolver = stateMachineResolver2;
            this.authenticationActions = authenticationActions;
            this.defaultState = new NotConfigured(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthenticationState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthenticationState, StateMachineResolver<AuthenticationState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthenticationState> resolve(AuthenticationState authenticationState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(authenticationState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            AuthenticationEvent.EventType eventTypeIsAuthenticationEvent = AuthEnvironmentKt.isAuthenticationEvent(stateMachineEvent);
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
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            Object[] objArr17 = 0;
            Object[] objArr18 = 0;
            Object[] objArr19 = 0;
            Object[] objArr20 = 0;
            Object[] objArr21 = 0;
            Object[] objArr22 = 0;
            Object[] objArr23 = 0;
            Object[] objArr24 = 0;
            Object[] objArr25 = 0;
            StateResolution<AuthenticationState> stateResolution = new StateResolution<>(authenticationState, null, 2, null);
            int i = 1;
            if (authenticationState instanceof NotConfigured) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.Configure) {
                    return new StateResolution<>(new Configured(str, i, objArr25 == true ? 1 : 0), bh3.m18963e(this.authenticationActions.configureAuthenticationAction((AuthenticationEvent.EventType.Configure) eventTypeIsAuthenticationEvent)));
                }
                return eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool ? new StateResolution<>(new FederatingToIdentityPool(objArr24 == true ? 1 : 0, i, objArr23 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (authenticationState instanceof Configured) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedSignedIn) {
                    AuthenticationEvent.EventType.InitializedSignedIn initializedSignedIn = (AuthenticationEvent.EventType.InitializedSignedIn) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new SignedIn(initializedSignedIn.getSignedInData(), initializedSignedIn.getDeviceMetadata()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedFederated) {
                    return new StateResolution<>(new FederatedToIdentityPool(objArr22 == true ? 1 : 0, i, objArr21 == true ? 1 : 0), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedSignedOut) {
                    return new StateResolution<>(new SignedOut(((AuthenticationEvent.EventType.InitializedSignedOut) eventTypeIsAuthenticationEvent).getSignedOutData()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(objArr20 == true ? 1 : 0, i, objArr19 == true ? 1 : 0), bh3.m18963e(this.authenticationActions.initiateSignInAction((AuthenticationEvent.EventType.SignInRequested) eventTypeIsAuthenticationEvent)));
                }
                return stateResolution;
            }
            if (authenticationState instanceof SigningIn) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInCompleted) {
                    AuthenticationEvent.EventType.SignInCompleted signInCompleted = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new SignedIn(signInCompleted.getSignedInData(), signInCompleted.getDeviceMetadata()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignIn) {
                    AuthenticationEvent.EventType.CancelSignIn cancelSignIn = (AuthenticationEvent.EventType.CancelSignIn) eventTypeIsAuthenticationEvent;
                    if (cancelSignIn.getError() != null) {
                        new StateResolution(new Error(cancelSignIn.getError()), null, 2, null);
                    }
                    return new StateResolution<>(new SignedOut(new SignedOutData(null, null, null, null, 15, null)), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((AuthenticationEvent.EventType.ThrowError) eventTypeIsAuthenticationEvent).getException()), null, 2, null);
                }
                StateResolution<StateType> stateResolutionResolve = this.signInResolver.resolve(((SigningIn) authenticationState).getSignInState(), stateMachineEvent);
                return new StateResolution<>(new SigningIn((SignInState) stateResolutionResolve.getNewState()), stateResolutionResolve.getActions());
            }
            if (authenticationState instanceof SignedIn) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                    return new StateResolution<>(new SigningOut(objArr18 == true ? 1 : 0, i, objArr17 == true ? 1 : 0), bh3.m18963e(this.authenticationActions.initiateSignOutAction((AuthenticationEvent.EventType.SignOutRequested) eventTypeIsAuthenticationEvent, ((SignedIn) authenticationState).getSignedInData())));
                }
                return stateResolution;
            }
            if (authenticationState instanceof SigningOut) {
                SignOutEvent.EventType eventTypeIsSignOutEvent = AuthEnvironmentKt.isSignOutEvent(stateMachineEvent);
                if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignedOutSuccess) {
                    return new StateResolution<>(new SignedOut(((SignOutEvent.EventType.SignedOutSuccess) eventTypeIsSignOutEvent).getSignedOutData()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignOut) {
                    AuthenticationEvent.EventType.CancelSignOut cancelSignOut = (AuthenticationEvent.EventType.CancelSignOut) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new SignedIn(cancelSignOut.getSignedInData(), cancelSignOut.getDeviceMetadata()), null, 2, null);
                }
                StateResolution<StateType> stateResolutionResolve2 = this.signOutResolver.resolve(((SigningOut) authenticationState).getSignOutState(), stateMachineEvent);
                return new StateResolution<>(new SigningOut((SignOutState) stateResolutionResolve2.getNewState()), stateResolutionResolve2.getActions());
            }
            if (authenticationState instanceof SignedOut) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent2 = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(objArr16 == true ? 1 : 0, i, objArr15 == true ? 1 : 0), bh3.m18963e(this.authenticationActions.initiateSignInAction((AuthenticationEvent.EventType.SignInRequested) eventTypeIsAuthenticationEvent)));
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                    return new StateResolution<>(new SigningOut(objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0), bh3.m18963e(this.authenticationActions.initiateSignOutAction((AuthenticationEvent.EventType.SignOutRequested) eventTypeIsAuthenticationEvent, null)));
                }
                return eventTypeIsAuthorizationEvent2 instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool ? new StateResolution<>(new FederatingToIdentityPool(objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (authenticationState instanceof FederatingToIdentityPool) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent3 = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                return eventTypeIsAuthorizationEvent3 instanceof AuthorizationEvent.EventType.Fetched ? new StateResolution<>(new FederatedToIdentityPool(objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0), null, 2, null) : eventTypeIsAuthorizationEvent3 instanceof AuthorizationEvent.EventType.ThrowError ? new StateResolution<>(new Error(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent3).getException()), null, 2, null) : stateResolution;
            }
            if (authenticationState instanceof FederatedToIdentityPool) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent4 = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool) {
                    return new StateResolution<>(new SigningOut(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0), bh3.m18963e(this.authenticationActions.initiateSignOutAction(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(false, null, false, 7, null)), null)));
                }
                return eventTypeIsAuthorizationEvent4 instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool ? new StateResolution<>(new FederatingToIdentityPool(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (!(authenticationState instanceof Error)) {
                throw new szb();
            }
            if (AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent) instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                return new StateResolution<>(new FederatingToIdentityPool(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), null, 2, null);
            }
            if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool) {
                return new StateResolution<>(new SigningOut(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), bh3.m18963e(this.authenticationActions.initiateSignOutAction(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(false, null, false, 7, null)), null)));
            }
            return stateResolution;
        }
    }

    public static final class SignedIn extends AuthenticationState {
        private final DeviceMetadata deviceMetadata;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(SignedInData signedInData, DeviceMetadata deviceMetadata) {
            super(null);
            sq8.m48649h(signedInData, "signedInData");
            sq8.m48649h(deviceMetadata, "deviceMetadata");
            this.signedInData = signedInData;
            this.deviceMetadata = deviceMetadata;
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = signedIn.signedInData;
            }
            if ((i & 2) != 0) {
                deviceMetadata = signedIn.deviceMetadata;
            }
            return signedIn.copy(signedInData, deviceMetadata);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final DeviceMetadata component2() {
            return this.deviceMetadata;
        }

        public final SignedIn copy(SignedInData signedInData, DeviceMetadata deviceMetadata) {
            sq8.m48649h(signedInData, "signedInData");
            sq8.m48649h(deviceMetadata, "deviceMetadata");
            return new SignedIn(signedInData, deviceMetadata);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignedIn)) {
                return false;
            }
            SignedIn signedIn = (SignedIn) obj;
            return sq8.m48644c(this.signedInData, signedIn.signedInData) && sq8.m48644c(this.deviceMetadata, signedIn.deviceMetadata);
        }

        public final DeviceMetadata getDeviceMetadata() {
            return this.deviceMetadata;
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedIn(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
        }
    }

    public static final class SignedOut extends AuthenticationState {
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

    public static final class SigningIn extends AuthenticationState {
        private SignInState signInState;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, SignInState signInState, int i, Object obj) {
            if ((i & 1) != 0) {
                signInState = signingIn.signInState;
            }
            return signingIn.copy(signInState);
        }

        public final SignInState component1() {
            return this.signInState;
        }

        public final SigningIn copy(SignInState signInState) {
            sq8.m48649h(signInState, "signInState");
            return new SigningIn(signInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && sq8.m48644c(this.signInState, ((SigningIn) obj).signInState);
        }

        public final SignInState getSignInState() {
            return this.signInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signInState.hashCode();
        }

        public final void setSignInState(SignInState signInState) {
            sq8.m48649h(signInState, "<set-?>");
            this.signInState = signInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningIn(signInState=" + this.signInState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(SignInState signInState) {
            super(null);
            sq8.m48649h(signInState, "signInState");
            this.signInState = signInState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ SigningIn(SignInState signInState, int i, id5 id5Var) {
            this((i & 1) != 0 ? new SignInState.NotStarted(null, 1, 0 == true ? 1 : 0) : signInState);
        }
    }

    public static final class SigningOut extends AuthenticationState {
        private SignOutState signOutState;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningOut() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningOut copy$default(SigningOut signingOut, SignOutState signOutState, int i, Object obj) {
            if ((i & 1) != 0) {
                signOutState = signingOut.signOutState;
            }
            return signingOut.copy(signOutState);
        }

        public final SignOutState component1() {
            return this.signOutState;
        }

        public final SigningOut copy(SignOutState signOutState) {
            sq8.m48649h(signOutState, "signOutState");
            return new SigningOut(signOutState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOut) && sq8.m48644c(this.signOutState, ((SigningOut) obj).signOutState);
        }

        public final SignOutState getSignOutState() {
            return this.signOutState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signOutState.hashCode();
        }

        public final void setSignOutState(SignOutState signOutState) {
            sq8.m48649h(signOutState, "<set-?>");
            this.signOutState = signOutState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOut(signOutState=" + this.signOutState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOut(SignOutState signOutState) {
            super(null);
            sq8.m48649h(signOutState, "signOutState");
            this.signOutState = signOutState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ SigningOut(SignOutState signOutState, int i, id5 id5Var) {
            this((i & 1) != 0 ? new SignOutState.NotStarted(null, 1, 0 == true ? 1 : 0) : signOutState);
        }
    }

    private AuthenticationState() {
    }

    public /* synthetic */ AuthenticationState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
