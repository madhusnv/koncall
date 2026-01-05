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
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthenticationState implements State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Configured extends AuthenticationState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43799id;

        /* JADX WARN: Multi-variable type inference failed */
        public Configured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Configured copy$default(Configured configured, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = configured.f43799id;
            }
            return configured.copy(str);
        }

        public final String component1() {
            return this.f43799id;
        }

        public final Configured copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Configured(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Configured) && AbstractC4154l.m8918a(this.f43799id, ((Configured) obj).f43799id);
        }

        public final String getId() {
            return this.f43799id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43799id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Configured(id=", this.f43799id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Configured(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43799id = id2;
        }

        public /* synthetic */ Configured(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends AuthenticationState {
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
    public static final class FederatedToIdentityPool extends AuthenticationState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43800id;

        /* JADX WARN: Multi-variable type inference failed */
        public FederatedToIdentityPool() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FederatedToIdentityPool copy$default(FederatedToIdentityPool federatedToIdentityPool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = federatedToIdentityPool.f43800id;
            }
            return federatedToIdentityPool.copy(str);
        }

        public final String component1() {
            return this.f43800id;
        }

        public final FederatedToIdentityPool copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new FederatedToIdentityPool(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FederatedToIdentityPool) && AbstractC4154l.m8918a(this.f43800id, ((FederatedToIdentityPool) obj).f43800id);
        }

        public final String getId() {
            return this.f43800id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43800id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("FederatedToIdentityPool(id=", this.f43800id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatedToIdentityPool(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43800id = id2;
        }

        public /* synthetic */ FederatedToIdentityPool(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FederatingToIdentityPool extends AuthenticationState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43801id;

        /* JADX WARN: Multi-variable type inference failed */
        public FederatingToIdentityPool() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FederatingToIdentityPool copy$default(FederatingToIdentityPool federatingToIdentityPool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = federatingToIdentityPool.f43801id;
            }
            return federatingToIdentityPool.copy(str);
        }

        public final String component1() {
            return this.f43801id;
        }

        public final FederatingToIdentityPool copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new FederatingToIdentityPool(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FederatingToIdentityPool) && AbstractC4154l.m8918a(this.f43801id, ((FederatingToIdentityPool) obj).f43801id);
        }

        public final String getId() {
            return this.f43801id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43801id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("FederatingToIdentityPool(id=", this.f43801id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatingToIdentityPool(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43801id = id2;
        }

        public /* synthetic */ FederatingToIdentityPool(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotConfigured extends AuthenticationState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43802id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notConfigured.f43802id;
            }
            return notConfigured.copy(str);
        }

        public final String component1() {
            return this.f43802id;
        }

        public final NotConfigured copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new NotConfigured(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && AbstractC4154l.m8918a(this.f43802id, ((NotConfigured) obj).f43802id);
        }

        public final String getId() {
            return this.f43802id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43802id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotConfigured(id=", this.f43802id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43802id = id2;
        }

        public /* synthetic */ NotConfigured(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<AuthenticationState> {
        private final AuthenticationActions authenticationActions;
        private final NotConfigured defaultState;
        private final StateMachineResolver<SignInState> signInResolver;
        private final StateMachineResolver<SignOutState> signOutResolver;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(StateMachineResolver<SignInState> signInResolver, StateMachineResolver<SignOutState> signOutResolver, AuthenticationActions authenticationActions) {
            AbstractC4154l.m8923f(signInResolver, "signInResolver");
            AbstractC4154l.m8923f(signOutResolver, "signOutResolver");
            AbstractC4154l.m8923f(authenticationActions, "authenticationActions");
            this.signInResolver = signInResolver;
            this.signOutResolver = signOutResolver;
            this.authenticationActions = authenticationActions;
            this.defaultState = new NotConfigured(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthenticationState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthenticationState, StateMachineResolver<AuthenticationState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthenticationState> resolve(AuthenticationState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            AuthenticationEvent.EventType eventTypeIsAuthenticationEvent = AuthEnvironmentKt.isAuthenticationEvent(event);
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
            StateResolution<AuthenticationState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            int i10 = 1;
            if (oldState instanceof NotConfigured) {
                AuthorizationEvent.EventType eventTypeIsAuthorizationEvent = AuthEnvironmentKt.isAuthorizationEvent(event);
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.Configure) {
                    return new StateResolution<>(new Configured(str, i10, objArr25 == true ? 1 : 0), pe.m10833h(this.authenticationActions.configureAuthenticationAction((AuthenticationEvent.EventType.Configure) eventTypeIsAuthenticationEvent)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                    return new StateResolution<>(new FederatingToIdentityPool(objArr24 == true ? 1 : 0, i10, objArr23 == true ? 1 : 0), null, 2, null);
                }
            } else if (oldState instanceof Configured) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedSignedIn) {
                    AuthenticationEvent.EventType.InitializedSignedIn initializedSignedIn = (AuthenticationEvent.EventType.InitializedSignedIn) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new SignedIn(initializedSignedIn.getSignedInData(), initializedSignedIn.getDeviceMetadata()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedFederated) {
                    return new StateResolution<>(new FederatedToIdentityPool(objArr22 == true ? 1 : 0, i10, objArr21 == true ? 1 : 0), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.InitializedSignedOut) {
                    return new StateResolution<>(new SignedOut(((AuthenticationEvent.EventType.InitializedSignedOut) eventTypeIsAuthenticationEvent).getSignedOutData()), null, 2, null);
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(objArr20 == true ? 1 : 0, i10, objArr19 == true ? 1 : 0), pe.m10833h(this.authenticationActions.initiateSignInAction((AuthenticationEvent.EventType.SignInRequested) eventTypeIsAuthenticationEvent)));
                }
            } else {
                if (oldState instanceof SigningIn) {
                    if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInCompleted) {
                        AuthenticationEvent.EventType.SignInCompleted signInCompleted = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                        return new StateResolution<>(new SignedIn(signInCompleted.getSignedInData(), signInCompleted.getDeviceMetadata()), null, 2, null);
                    }
                    if (!(eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignIn)) {
                        if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ThrowError) {
                            return new StateResolution<>(new Error(((AuthenticationEvent.EventType.ThrowError) eventTypeIsAuthenticationEvent).getException()), null, 2, null);
                        }
                        StateResolution<StateType> stateResolutionResolve = this.signInResolver.resolve(((SigningIn) oldState).getSignInState(), event);
                        return new StateResolution<>(new SigningIn((SignInState) stateResolutionResolve.getNewState()), stateResolutionResolve.getActions());
                    }
                    AuthenticationEvent.EventType.CancelSignIn cancelSignIn = (AuthenticationEvent.EventType.CancelSignIn) eventTypeIsAuthenticationEvent;
                    if (cancelSignIn.getError() != null) {
                        new StateResolution(new Error(cancelSignIn.getError()), null, 2, null);
                    }
                    return new StateResolution<>(new SignedOut(new SignedOutData(null, null, null, null, 15, null)), null, 2, null);
                }
                if (oldState instanceof SignedIn) {
                    if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                        return new StateResolution<>(new SigningOut(objArr18 == true ? 1 : 0, i10, objArr17 == true ? 1 : 0), pe.m10833h(this.authenticationActions.initiateSignOutAction((AuthenticationEvent.EventType.SignOutRequested) eventTypeIsAuthenticationEvent, ((SignedIn) oldState).getSignedInData())));
                    }
                } else {
                    if (oldState instanceof SigningOut) {
                        SignOutEvent.EventType eventTypeIsSignOutEvent = AuthEnvironmentKt.isSignOutEvent(event);
                        if (eventTypeIsSignOutEvent instanceof SignOutEvent.EventType.SignedOutSuccess) {
                            return new StateResolution<>(new SignedOut(((SignOutEvent.EventType.SignedOutSuccess) eventTypeIsSignOutEvent).getSignedOutData()), null, 2, null);
                        }
                        if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignOut) {
                            AuthenticationEvent.EventType.CancelSignOut cancelSignOut = (AuthenticationEvent.EventType.CancelSignOut) eventTypeIsAuthenticationEvent;
                            return new StateResolution<>(new SignedIn(cancelSignOut.getSignedInData(), cancelSignOut.getDeviceMetadata()), null, 2, null);
                        }
                        StateResolution<StateType> stateResolutionResolve2 = this.signOutResolver.resolve(((SigningOut) oldState).getSignOutState(), event);
                        return new StateResolution<>(new SigningOut((SignOutState) stateResolutionResolve2.getNewState()), stateResolutionResolve2.getActions());
                    }
                    if (oldState instanceof SignedOut) {
                        AuthorizationEvent.EventType eventTypeIsAuthorizationEvent2 = AuthEnvironmentKt.isAuthorizationEvent(event);
                        if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                            return new StateResolution<>(new SigningIn(objArr16 == true ? 1 : 0, i10, objArr15 == true ? 1 : 0), pe.m10833h(this.authenticationActions.initiateSignInAction((AuthenticationEvent.EventType.SignInRequested) eventTypeIsAuthenticationEvent)));
                        }
                        if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                            return new StateResolution<>(new SigningOut(objArr14 == true ? 1 : 0, i10, objArr13 == true ? 1 : 0), pe.m10833h(this.authenticationActions.initiateSignOutAction((AuthenticationEvent.EventType.SignOutRequested) eventTypeIsAuthenticationEvent, null)));
                        }
                        if (eventTypeIsAuthorizationEvent2 instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                            return new StateResolution<>(new FederatingToIdentityPool(objArr12 == true ? 1 : 0, i10, objArr11 == true ? 1 : 0), null, 2, null);
                        }
                    } else if (oldState instanceof FederatingToIdentityPool) {
                        AuthorizationEvent.EventType eventTypeIsAuthorizationEvent3 = AuthEnvironmentKt.isAuthorizationEvent(event);
                        if (eventTypeIsAuthorizationEvent3 instanceof AuthorizationEvent.EventType.Fetched) {
                            return new StateResolution<>(new FederatedToIdentityPool(objArr10 == true ? 1 : 0, i10, objArr9 == true ? 1 : 0), null, 2, null);
                        }
                        if (eventTypeIsAuthorizationEvent3 instanceof AuthorizationEvent.EventType.ThrowError) {
                            return new StateResolution<>(new Error(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent3).getException()), null, 2, null);
                        }
                    } else if (oldState instanceof FederatedToIdentityPool) {
                        AuthorizationEvent.EventType eventTypeIsAuthorizationEvent4 = AuthEnvironmentKt.isAuthorizationEvent(event);
                        if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool) {
                            return new StateResolution<>(new SigningOut(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0), pe.m10833h(this.authenticationActions.initiateSignOutAction(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(false, null, false, 7, null)), null)));
                        }
                        if (eventTypeIsAuthorizationEvent4 instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                            return new StateResolution<>(new FederatingToIdentityPool(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0), null, 2, null);
                        }
                    } else {
                        if (!(oldState instanceof Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (AuthEnvironmentKt.isAuthorizationEvent(event) instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                            return new StateResolution<>(new FederatingToIdentityPool(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), null, 2, null);
                        }
                        if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool) {
                            return new StateResolution<>(new SigningOut(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), pe.m10833h(this.authenticationActions.initiateSignOutAction(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(false, null, false, 7, null)), null)));
                        }
                    }
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedIn extends AuthenticationState {
        private final DeviceMetadata deviceMetadata;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedIn(SignedInData signedInData, DeviceMetadata deviceMetadata) {
            super(null);
            AbstractC4154l.m8923f(signedInData, "signedInData");
            AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
            this.signedInData = signedInData;
            this.deviceMetadata = deviceMetadata;
        }

        public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, SignedInData signedInData, DeviceMetadata deviceMetadata, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = signedIn.signedInData;
            }
            if ((i10 & 2) != 0) {
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
            AbstractC4154l.m8923f(signedInData, "signedInData");
            AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
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
            return AbstractC4154l.m8918a(this.signedInData, signedIn.signedInData) && AbstractC4154l.m8918a(this.deviceMetadata, signedIn.deviceMetadata);
        }

        public final DeviceMetadata getDeviceMetadata() {
            return this.deviceMetadata;
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.deviceMetadata.hashCode() + (this.signedInData.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SignedIn(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SignedOut extends AuthenticationState {
        private final SignedOutData signedOutData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignedOut(SignedOutData signedOutData) {
            super(null);
            AbstractC4154l.m8923f(signedOutData, "signedOutData");
            this.signedOutData = signedOutData;
        }

        public static /* synthetic */ SignedOut copy$default(SignedOut signedOut, SignedOutData signedOutData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedOutData = signedOut.signedOutData;
            }
            return signedOut.copy(signedOutData);
        }

        public final SignedOutData component1() {
            return this.signedOutData;
        }

        public final SignedOut copy(SignedOutData signedOutData) {
            AbstractC4154l.m8923f(signedOutData, "signedOutData");
            return new SignedOut(signedOutData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignedOut) && AbstractC4154l.m8918a(this.signedOutData, ((SignedOut) obj).signedOutData);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningIn extends AuthenticationState {
        private SignInState signInState;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, SignInState signInState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signInState = signingIn.signInState;
            }
            return signingIn.copy(signInState);
        }

        public final SignInState component1() {
            return this.signInState;
        }

        public final SigningIn copy(SignInState signInState) {
            AbstractC4154l.m8923f(signInState, "signInState");
            return new SigningIn(signInState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && AbstractC4154l.m8918a(this.signInState, ((SigningIn) obj).signInState);
        }

        public final SignInState getSignInState() {
            return this.signInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signInState.hashCode();
        }

        public final void setSignInState(SignInState signInState) {
            AbstractC4154l.m8923f(signInState, "<set-?>");
            this.signInState = signInState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningIn(signInState=" + this.signInState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(SignInState signInState) {
            super(null);
            AbstractC4154l.m8923f(signInState, "signInState");
            this.signInState = signInState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ SigningIn(SignInState signInState, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? new SignInState.NotStarted(null, 1, 0 == true ? 1 : 0) : signInState);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningOut extends AuthenticationState {
        private SignOutState signOutState;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningOut() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningOut copy$default(SigningOut signingOut, SignOutState signOutState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signOutState = signingOut.signOutState;
            }
            return signingOut.copy(signOutState);
        }

        public final SignOutState component1() {
            return this.signOutState;
        }

        public final SigningOut copy(SignOutState signOutState) {
            AbstractC4154l.m8923f(signOutState, "signOutState");
            return new SigningOut(signOutState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOut) && AbstractC4154l.m8918a(this.signOutState, ((SigningOut) obj).signOutState);
        }

        public final SignOutState getSignOutState() {
            return this.signOutState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signOutState.hashCode();
        }

        public final void setSignOutState(SignOutState signOutState) {
            AbstractC4154l.m8923f(signOutState, "<set-?>");
            this.signOutState = signOutState;
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOut(signOutState=" + this.signOutState + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOut(SignOutState signOutState) {
            super(null);
            AbstractC4154l.m8923f(signOutState, "signOutState");
            this.signOutState = signOutState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ SigningOut(SignOutState signOutState, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? new SignOutState.NotStarted(null, 1, 0 == true ? 1 : 0) : signOutState);
        }
    }

    public /* synthetic */ AuthenticationState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private AuthenticationState() {
    }
}
