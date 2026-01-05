package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.AuthorizationActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.errors.SessionError;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import com.amplifyframework.statemachine.codegen.states.DeleteUserState;
import com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState;
import com.amplifyframework.statemachine.codegen.states.RefreshSessionState;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;
import p001o.szb;

/* loaded from: classes5.dex */
public abstract class AuthorizationState implements State {

    /* renamed from: type, reason: collision with root package name */
    private final String f58136type;

    public static final class Configured extends AuthorizationState {
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

    public static final class DeletingUser extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;
        private final DeleteUserState deleteUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeletingUser(DeleteUserState deleteUserState, AmplifyCredential amplifyCredential) {
            super(null);
            sq8.m48649h(deleteUserState, "deleteUserState");
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            this.deleteUserState = deleteUserState;
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ DeletingUser copy$default(DeletingUser deletingUser, DeleteUserState deleteUserState, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                deleteUserState = deletingUser.deleteUserState;
            }
            if ((i & 2) != 0) {
                amplifyCredential = deletingUser.amplifyCredential;
            }
            return deletingUser.copy(deleteUserState, amplifyCredential);
        }

        public final DeleteUserState component1() {
            return this.deleteUserState;
        }

        public final AmplifyCredential component2() {
            return this.amplifyCredential;
        }

        public final DeletingUser copy(DeleteUserState deleteUserState, AmplifyCredential amplifyCredential) {
            sq8.m48649h(deleteUserState, "deleteUserState");
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            return new DeletingUser(deleteUserState, amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeletingUser)) {
                return false;
            }
            DeletingUser deletingUser = (DeletingUser) obj;
            return sq8.m48644c(this.deleteUserState, deletingUser.deleteUserState) && sq8.m48644c(this.amplifyCredential, deletingUser.amplifyCredential);
        }

        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        public final DeleteUserState getDeleteUserState() {
            return this.deleteUserState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.deleteUserState.hashCode() * 31) + this.amplifyCredential.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "DeletingUser(deleteUserState=" + this.deleteUserState + ", amplifyCredential=" + this.amplifyCredential + ")";
        }
    }

    public static final class Error extends AuthorizationState {
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

    public static final class FederatingToIdentityPool extends AuthorizationState {
        private final AmplifyCredential existingCredential;
        private final FederatedToken federatedToken;
        private final FetchAuthSessionState fetchAuthSessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatingToIdentityPool(FederatedToken federatedToken, FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential) {
            super(null);
            sq8.m48649h(federatedToken, "federatedToken");
            sq8.m48649h(fetchAuthSessionState, "fetchAuthSessionState");
            this.federatedToken = federatedToken;
            this.fetchAuthSessionState = fetchAuthSessionState;
            this.existingCredential = amplifyCredential;
        }

        public static /* synthetic */ FederatingToIdentityPool copy$default(FederatingToIdentityPool federatingToIdentityPool, FederatedToken federatedToken, FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                federatedToken = federatingToIdentityPool.federatedToken;
            }
            if ((i & 2) != 0) {
                fetchAuthSessionState = federatingToIdentityPool.fetchAuthSessionState;
            }
            if ((i & 4) != 0) {
                amplifyCredential = federatingToIdentityPool.existingCredential;
            }
            return federatingToIdentityPool.copy(federatedToken, fetchAuthSessionState, amplifyCredential);
        }

        public final FederatedToken component1() {
            return this.federatedToken;
        }

        public final FetchAuthSessionState component2() {
            return this.fetchAuthSessionState;
        }

        public final AmplifyCredential component3() {
            return this.existingCredential;
        }

        public final FederatingToIdentityPool copy(FederatedToken federatedToken, FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential) {
            sq8.m48649h(federatedToken, "federatedToken");
            sq8.m48649h(fetchAuthSessionState, "fetchAuthSessionState");
            return new FederatingToIdentityPool(federatedToken, fetchAuthSessionState, amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FederatingToIdentityPool)) {
                return false;
            }
            FederatingToIdentityPool federatingToIdentityPool = (FederatingToIdentityPool) obj;
            return sq8.m48644c(this.federatedToken, federatingToIdentityPool.federatedToken) && sq8.m48644c(this.fetchAuthSessionState, federatingToIdentityPool.fetchAuthSessionState) && sq8.m48644c(this.existingCredential, federatingToIdentityPool.existingCredential);
        }

        public final AmplifyCredential getExistingCredential() {
            return this.existingCredential;
        }

        public final FederatedToken getFederatedToken() {
            return this.federatedToken;
        }

        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = ((this.federatedToken.hashCode() * 31) + this.fetchAuthSessionState.hashCode()) * 31;
            AmplifyCredential amplifyCredential = this.existingCredential;
            return iHashCode + (amplifyCredential == null ? 0 : amplifyCredential.hashCode());
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FederatingToIdentityPool(federatedToken=" + this.federatedToken + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ", existingCredential=" + this.existingCredential + ")";
        }
    }

    public static final class FetchingAuthSession extends AuthorizationState {
        private final FetchAuthSessionState fetchAuthSessionState;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingAuthSession(SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            sq8.m48649h(signedInData, "signedInData");
            sq8.m48649h(fetchAuthSessionState, "fetchAuthSessionState");
            this.signedInData = signedInData;
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ FetchingAuthSession copy$default(FetchingAuthSession fetchingAuthSession, SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = fetchingAuthSession.signedInData;
            }
            if ((i & 2) != 0) {
                fetchAuthSessionState = fetchingAuthSession.fetchAuthSessionState;
            }
            return fetchingAuthSession.copy(signedInData, fetchAuthSessionState);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final FetchAuthSessionState component2() {
            return this.fetchAuthSessionState;
        }

        public final FetchingAuthSession copy(SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            sq8.m48649h(signedInData, "signedInData");
            sq8.m48649h(fetchAuthSessionState, "fetchAuthSessionState");
            return new FetchingAuthSession(signedInData, fetchAuthSessionState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchingAuthSession)) {
                return false;
            }
            FetchingAuthSession fetchingAuthSession = (FetchingAuthSession) obj;
            return sq8.m48644c(this.signedInData, fetchingAuthSession.signedInData) && sq8.m48644c(this.fetchAuthSessionState, fetchingAuthSession.fetchAuthSessionState);
        }

        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.signedInData.hashCode() * 31) + this.fetchAuthSessionState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingAuthSession(signedInData=" + this.signedInData + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }
    }

    public static final class FetchingUnAuthSession extends AuthorizationState {
        private final FetchAuthSessionState fetchAuthSessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingUnAuthSession(FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            sq8.m48649h(fetchAuthSessionState, "fetchAuthSessionState");
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ FetchingUnAuthSession copy$default(FetchingUnAuthSession fetchingUnAuthSession, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                fetchAuthSessionState = fetchingUnAuthSession.fetchAuthSessionState;
            }
            return fetchingUnAuthSession.copy(fetchAuthSessionState);
        }

        public final FetchAuthSessionState component1() {
            return this.fetchAuthSessionState;
        }

        public final FetchingUnAuthSession copy(FetchAuthSessionState fetchAuthSessionState) {
            sq8.m48649h(fetchAuthSessionState, "fetchAuthSessionState");
            return new FetchingUnAuthSession(fetchAuthSessionState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingUnAuthSession) && sq8.m48644c(this.fetchAuthSessionState, ((FetchingUnAuthSession) obj).fetchAuthSessionState);
        }

        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.fetchAuthSessionState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingUnAuthSession(fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }
    }

    public static final class NotConfigured extends AuthorizationState {
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

    public static final class RefreshingSession extends AuthorizationState {
        private final AmplifyCredential existingCredential;
        private final RefreshSessionState refreshSessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingSession(AmplifyCredential amplifyCredential, RefreshSessionState refreshSessionState) {
            super(null);
            sq8.m48649h(amplifyCredential, "existingCredential");
            sq8.m48649h(refreshSessionState, "refreshSessionState");
            this.existingCredential = amplifyCredential;
            this.refreshSessionState = refreshSessionState;
        }

        public static /* synthetic */ RefreshingSession copy$default(RefreshingSession refreshingSession, AmplifyCredential amplifyCredential, RefreshSessionState refreshSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = refreshingSession.existingCredential;
            }
            if ((i & 2) != 0) {
                refreshSessionState = refreshingSession.refreshSessionState;
            }
            return refreshingSession.copy(amplifyCredential, refreshSessionState);
        }

        public final AmplifyCredential component1() {
            return this.existingCredential;
        }

        public final RefreshSessionState component2() {
            return this.refreshSessionState;
        }

        public final RefreshingSession copy(AmplifyCredential amplifyCredential, RefreshSessionState refreshSessionState) {
            sq8.m48649h(amplifyCredential, "existingCredential");
            sq8.m48649h(refreshSessionState, "refreshSessionState");
            return new RefreshingSession(amplifyCredential, refreshSessionState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshingSession)) {
                return false;
            }
            RefreshingSession refreshingSession = (RefreshingSession) obj;
            return sq8.m48644c(this.existingCredential, refreshingSession.existingCredential) && sq8.m48644c(this.refreshSessionState, refreshingSession.refreshSessionState);
        }

        public final AmplifyCredential getExistingCredential() {
            return this.existingCredential;
        }

        public final RefreshSessionState getRefreshSessionState() {
            return this.refreshSessionState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.existingCredential.hashCode() * 31) + this.refreshSessionState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingSession(existingCredential=" + this.existingCredential + ", refreshSessionState=" + this.refreshSessionState + ")";
        }
    }

    public static final class Resolver implements StateMachineResolver<AuthorizationState> {
        private final AuthorizationActions authorizationActions;
        private final NotConfigured defaultState;
        private final StateMachineResolver<DeleteUserState> deleteUserResolver;
        private final StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver;
        private final StateMachineResolver<RefreshSessionState> refreshSessionResolver;

        public Resolver(StateMachineResolver<FetchAuthSessionState> stateMachineResolver, StateMachineResolver<RefreshSessionState> stateMachineResolver2, StateMachineResolver<DeleteUserState> stateMachineResolver3, AuthorizationActions authorizationActions) {
            sq8.m48649h(stateMachineResolver, "fetchAuthSessionResolver");
            sq8.m48649h(stateMachineResolver2, "refreshSessionResolver");
            sq8.m48649h(stateMachineResolver3, "deleteUserResolver");
            sq8.m48649h(authorizationActions, "authorizationActions");
            this.fetchAuthSessionResolver = stateMachineResolver;
            this.refreshSessionResolver = stateMachineResolver2;
            this.deleteUserResolver = stateMachineResolver3;
            this.authorizationActions = authorizationActions;
            this.defaultState = new NotConfigured("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthorizationState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthorizationState, StateMachineResolver<AuthorizationState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthorizationState> resolve(AuthorizationState authorizationState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(authorizationState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(stateMachineEvent);
            AuthenticationEvent.EventType eventTypeIsAuthenticationEvent = AuthEnvironmentKt.isAuthenticationEvent(stateMachineEvent);
            AuthorizationEvent.EventType eventTypeIsAuthorizationEvent = AuthEnvironmentKt.isAuthorizationEvent(stateMachineEvent);
            DeleteUserEvent.EventType eventTypeIsDeleteUserEvent = AuthEnvironmentKt.isDeleteUserEvent(stateMachineEvent);
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
            Object[] objArr26 = 0;
            Object[] objArr27 = 0;
            Object[] objArr28 = 0;
            Object[] objArr29 = 0;
            Object[] objArr30 = 0;
            Object[] objArr31 = 0;
            Object[] objArr32 = 0;
            Object[] objArr33 = 0;
            Object[] objArr34 = 0;
            Object[] objArr35 = 0;
            Object[] objArr36 = 0;
            Object[] objArr37 = 0;
            StateResolution<AuthorizationState> stateResolution = new StateResolution<>(authorizationState, null, 2, null);
            boolean z = eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInCompleted;
            int i = 1;
            if (z) {
                AuthenticationEvent.EventType.SignInCompleted signInCompleted = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                return new StateResolution<>(new FetchingAuthSession(signInCompleted.getSignedInData(), new FetchAuthSessionState.NotStarted(str, i, objArr37 == true ? 1 : 0)), bh3.m18963e(this.authorizationActions.initializeFetchAuthSession(signInCompleted.getSignedInData())));
            }
            if (authorizationState instanceof NotConfigured) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Configure) {
                    return new StateResolution<>(new Configured(objArr36 == true ? 1 : 0, i, objArr35 == true ? 1 : 0), bh3.m18963e(this.authorizationActions.configureAuthorizationAction()));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.CachedCredentialsAvailable) {
                    return new StateResolution<>(new SessionEstablished(((AuthorizationEvent.EventType.CachedCredentialsAvailable) eventTypeIsAuthorizationEvent).getAmplifyCredential()), bh3.m18963e(this.authorizationActions.configureAuthorizationAction()));
                }
                return eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError ? new StateResolution<>(new NotConfigured(objArr34 == true ? 1 : 0, i, objArr33 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (authorizationState instanceof Configured) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.FetchUnAuthSession) {
                    return new StateResolution<>(new FetchingUnAuthSession(new FetchAuthSessionState.NotStarted(objArr32 == true ? 1 : 0, i, objArr31 == true ? 1 : 0)), bh3.m18963e(this.authorizationActions.initializeFetchUnAuthSession()));
                }
                if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool)) {
                    return eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested ? new StateResolution<>(new SigningIn(objArr28 == true ? 1 : 0, i, objArr27 == true ? 1 : 0), null, 2, null) : stateResolution;
                }
                AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool.getToken(), new FetchAuthSessionState.NotStarted(objArr30 == true ? 1 : 0, i, objArr29 == true ? 1 : 0), startFederationToIdentityPool.getExistingCredential()), bh3.m18963e(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool.getToken(), startFederationToIdentityPool.getIdentityId())));
            }
            if (authorizationState instanceof StoringCredentials) {
                return eventTypeIsAuthEvent instanceof AuthEvent.EventType.ReceivedCachedCredentials ? ((StoringCredentials) authorizationState).getAmplifyCredential() instanceof AmplifyCredential.Empty ? new StateResolution<>(new Configured(objArr26 == true ? 1 : 0, i, objArr25 == true ? 1 : 0), null, 2, null) : new StateResolution<>(new SessionEstablished(((AuthEvent.EventType.ReceivedCachedCredentials) eventTypeIsAuthEvent).getStoredCredentials()), null, 2, null) : eventTypeIsAuthEvent instanceof AuthEvent.EventType.CachedCredentialsFailed ? new StateResolution<>(new NotConfigured(objArr24 == true ? 1 : 0, i, objArr23 == true ? 1 : 0), null, 2, null) : stateResolution;
            }
            if (authorizationState instanceof SigningIn) {
                if (!z) {
                    return eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignIn ? new StateResolution<>(new Configured(objArr20 == true ? 1 : 0, i, objArr19 == true ? 1 : 0), null, 2, null) : stateResolution;
                }
                AuthenticationEvent.EventType.SignInCompleted signInCompleted2 = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                return new StateResolution<>(new FetchingAuthSession(signInCompleted2.getSignedInData(), new FetchAuthSessionState.NotStarted(objArr22 == true ? 1 : 0, i, objArr21 == true ? 1 : 0)), bh3.m18963e(this.authorizationActions.initializeFetchAuthSession(signInCompleted2.getSignedInData())));
            }
            if (authorizationState instanceof SigningOut) {
                if (!(AuthEnvironmentKt.isSignOutEvent(stateMachineEvent) instanceof SignOutEvent.EventType.SignOutLocally)) {
                    return eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignOut ? new StateResolution<>(new SessionEstablished(((SigningOut) authorizationState).getAmplifyCredential()), null, 2, null) : stateResolution;
                }
                AuthorizationActions authorizationActions = this.authorizationActions;
                AmplifyCredential.Empty empty = AmplifyCredential.Empty.INSTANCE;
                return new StateResolution<>(new StoringCredentials(empty), bh3.m18963e(authorizationActions.persistCredentials(empty)));
            }
            if (authorizationState instanceof FetchingUnAuthSession) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                    AuthorizationEvent.EventType.Fetched fetched = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                    AmplifyCredential.IdentityPool identityPool = new AmplifyCredential.IdentityPool(fetched.getIdentityId(), fetched.getAwsCredentials());
                    return new StateResolution<>(new StoringCredentials(identityPool), bh3.m18963e(this.authorizationActions.persistCredentials(identityPool)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(new SessionError(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException(), AmplifyCredential.Empty.INSTANCE)), null, 2, null);
                }
                StateResolution<StateType> stateResolutionResolve = this.fetchAuthSessionResolver.resolve(((FetchingUnAuthSession) authorizationState).getFetchAuthSessionState(), stateMachineEvent);
                return new StateResolution<>(new FetchingUnAuthSession((FetchAuthSessionState) stateResolutionResolve.getNewState()), stateResolutionResolve.getActions());
            }
            if (authorizationState instanceof FetchingAuthSession) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                    AuthorizationEvent.EventType.Fetched fetched2 = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                    AmplifyCredential.UserAndIdentityPool userAndIdentityPool = new AmplifyCredential.UserAndIdentityPool(((FetchingAuthSession) authorizationState).getSignedInData(), fetched2.getIdentityId(), fetched2.getAwsCredentials());
                    return new StateResolution<>(new StoringCredentials(userAndIdentityPool), bh3.m18963e(this.authorizationActions.persistCredentials(userAndIdentityPool)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    AmplifyCredential.UserPool userPool = new AmplifyCredential.UserPool(((FetchingAuthSession) authorizationState).getSignedInData());
                    return new StateResolution<>(new StoringCredentials(userPool), bh3.m18963e(this.authorizationActions.persistCredentials(userPool)));
                }
                FetchingAuthSession fetchingAuthSession = (FetchingAuthSession) authorizationState;
                StateResolution<StateType> stateResolutionResolve2 = this.fetchAuthSessionResolver.resolve(fetchingAuthSession.getFetchAuthSessionState(), stateMachineEvent);
                return new StateResolution<>(new FetchingAuthSession(fetchingAuthSession.getSignedInData(), (FetchAuthSessionState) stateResolutionResolve2.getNewState()), stateResolutionResolve2.getActions());
            }
            if (authorizationState instanceof FederatingToIdentityPool) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                    AuthorizationEvent.EventType.Fetched fetched3 = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                    AmplifyCredential.IdentityPoolFederated identityPoolFederated = new AmplifyCredential.IdentityPoolFederated(((FederatingToIdentityPool) authorizationState).getFederatedToken(), fetched3.getIdentityId(), fetched3.getAwsCredentials());
                    return new StateResolution<>(new StoringCredentials(identityPoolFederated), bh3.m18963e(this.authorizationActions.persistCredentials(identityPoolFederated)));
                }
                if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError)) {
                    FederatingToIdentityPool federatingToIdentityPool = (FederatingToIdentityPool) authorizationState;
                    StateResolution<StateType> stateResolutionResolve3 = this.fetchAuthSessionResolver.resolve(federatingToIdentityPool.getFetchAuthSessionState(), stateMachineEvent);
                    return new StateResolution<>(new FederatingToIdentityPool(federatingToIdentityPool.getFederatedToken(), (FetchAuthSessionState) stateResolutionResolve3.getNewState(), federatingToIdentityPool.getExistingCredential()), stateResolutionResolve3.getActions());
                }
                Exception exception = ((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException();
                AmplifyCredential existingCredential = ((FederatingToIdentityPool) authorizationState).getExistingCredential();
                if (existingCredential == null) {
                    existingCredential = AmplifyCredential.Empty.INSTANCE;
                }
                return new StateResolution<>(new Error(new SessionError(exception, existingCredential)), null, 2, null);
            }
            if (authorizationState instanceof RefreshingSession) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Refreshed) {
                    AuthorizationEvent.EventType.Refreshed refreshed = (AuthorizationEvent.EventType.Refreshed) eventTypeIsAuthorizationEvent;
                    return new StateResolution<>(new StoringCredentials(refreshed.getAmplifyCredential()), bh3.m18963e(this.authorizationActions.persistCredentials(refreshed.getAmplifyCredential())));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(new SessionError(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException(), ((RefreshingSession) authorizationState).getExistingCredential())), null, 2, null);
                }
                RefreshingSession refreshingSession = (RefreshingSession) authorizationState;
                StateResolution<StateType> stateResolutionResolve4 = this.refreshSessionResolver.resolve(refreshingSession.getRefreshSessionState(), stateMachineEvent);
                return new StateResolution<>(new RefreshingSession(refreshingSession.getExistingCredential(), (RefreshSessionState) stateResolutionResolve4.getNewState()), stateResolutionResolve4.getActions());
            }
            if (authorizationState instanceof DeletingUser) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.UserDeleted) {
                    return new StateResolution<>(new SigningOut(((DeletingUser) authorizationState).getAmplifyCredential()), ch3.m21246k());
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new SessionEstablished(((DeletingUser) authorizationState).getAmplifyCredential()), null, 2, null);
                }
                DeletingUser deletingUser = (DeletingUser) authorizationState;
                StateResolution<StateType> stateResolutionResolve5 = this.deleteUserResolver.resolve(deletingUser.getDeleteUserState(), stateMachineEvent);
                return new StateResolution<>(new DeletingUser((DeleteUserState) stateResolutionResolve5.getNewState(), deletingUser.getAmplifyCredential()), stateResolutionResolve5.getActions());
            }
            if (authorizationState instanceof SessionEstablished) {
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(objArr18 == true ? 1 : 0, i, objArr17 == true ? 1 : 0), null, 2, null);
                }
                if ((eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) || (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool)) {
                    return new StateResolution<>(new SigningOut(((SessionEstablished) authorizationState).getAmplifyCredential()), null, 2, null);
                }
                if (eventTypeIsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser) {
                    return new StateResolution<>(new DeletingUser(new DeleteUserState.NotStarted(objArr16 == true ? 1 : 0, i, objArr15 == true ? 1 : 0), ((SessionEstablished) authorizationState).getAmplifyCredential()), bh3.m18963e(this.authorizationActions.initiateDeleteUser((DeleteUserEvent.EventType.DeleteUser) eventTypeIsDeleteUserEvent)));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.RefreshSession) {
                    AuthorizationEvent.EventType.RefreshSession refreshSession = (AuthorizationEvent.EventType.RefreshSession) eventTypeIsAuthorizationEvent;
                    return new StateResolution<>(new RefreshingSession(refreshSession.getAmplifyCredential(), new RefreshSessionState.NotStarted(objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0)), bh3.m18963e(this.authorizationActions.initiateRefreshSessionAction(refreshSession.getAmplifyCredential())));
                }
                if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool)) {
                    return stateResolution;
                }
                AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool2 = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool2.getToken(), new FetchAuthSessionState.NotStarted(objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0), startFederationToIdentityPool2.getExistingCredential()), bh3.m18963e(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool2.getToken(), startFederationToIdentityPool2.getIdentityId())));
            }
            if (!(authorizationState instanceof Error)) {
                throw new szb();
            }
            if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                return new StateResolution<>(new SigningIn(objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0), null, 2, null);
            }
            if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                return new StateResolution<>(new SigningOut(AmplifyCredential.Empty.INSTANCE), null, 2, null);
            }
            if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.FetchUnAuthSession) {
                return new StateResolution<>(new FetchingUnAuthSession(new FetchAuthSessionState.NotStarted(objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0)), bh3.m18963e(this.authorizationActions.initializeFetchUnAuthSession()));
            }
            if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.RefreshSession) {
                AuthorizationEvent.EventType.RefreshSession refreshSession2 = (AuthorizationEvent.EventType.RefreshSession) eventTypeIsAuthorizationEvent;
                return new StateResolution<>(new RefreshingSession(refreshSession2.getAmplifyCredential(), new RefreshSessionState.NotStarted(objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0)), bh3.m18963e(this.authorizationActions.initiateRefreshSessionAction(refreshSession2.getAmplifyCredential())));
            }
            if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool)) {
                return eventTypeIsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser ? new StateResolution<>(new DeletingUser(new DeleteUserState.NotStarted(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), AmplifyCredential.Empty.INSTANCE), bh3.m18963e(this.authorizationActions.initiateDeleteUser((DeleteUserEvent.EventType.DeleteUser) eventTypeIsDeleteUserEvent))) : stateResolution;
            }
            AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool3 = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
            return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool3.getToken(), new FetchAuthSessionState.NotStarted(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), startFederationToIdentityPool3.getExistingCredential()), bh3.m18963e(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool3.getToken(), startFederationToIdentityPool3.getIdentityId())));
        }
    }

    public static final class SessionEstablished extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionEstablished(AmplifyCredential amplifyCredential) {
            super(null);
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ SessionEstablished copy$default(SessionEstablished sessionEstablished, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = sessionEstablished.amplifyCredential;
            }
            return sessionEstablished.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        public final SessionEstablished copy(AmplifyCredential amplifyCredential) {
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            return new SessionEstablished(amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionEstablished) && sq8.m48644c(this.amplifyCredential, ((SessionEstablished) obj).amplifyCredential);
        }

        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.amplifyCredential.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SessionEstablished(amplifyCredential=" + this.amplifyCredential + ")";
        }
    }

    public static final class SigningIn extends AuthorizationState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signingIn.id;
            }
            return signingIn.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SigningIn copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new SigningIn(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && sq8.m48644c(this.id, ((SigningIn) obj).id);
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
            return "SigningIn(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ SigningIn(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class SigningOut extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOut(AmplifyCredential amplifyCredential) {
            super(null);
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ SigningOut copy$default(SigningOut signingOut, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = signingOut.amplifyCredential;
            }
            return signingOut.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        public final SigningOut copy(AmplifyCredential amplifyCredential) {
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            return new SigningOut(amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOut) && sq8.m48644c(this.amplifyCredential, ((SigningOut) obj).amplifyCredential);
        }

        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.amplifyCredential.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SigningOut(amplifyCredential=" + this.amplifyCredential + ")";
        }
    }

    public static final class StoringCredentials extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoringCredentials(AmplifyCredential amplifyCredential) {
            super(null);
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ StoringCredentials copy$default(StoringCredentials storingCredentials, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = storingCredentials.amplifyCredential;
            }
            return storingCredentials.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        public final StoringCredentials copy(AmplifyCredential amplifyCredential) {
            sq8.m48649h(amplifyCredential, "amplifyCredential");
            return new StoringCredentials(amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StoringCredentials) && sq8.m48644c(this.amplifyCredential, ((StoringCredentials) obj).amplifyCredential);
        }

        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.amplifyCredential.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "StoringCredentials(amplifyCredential=" + this.amplifyCredential + ")";
        }
    }

    public /* synthetic */ AuthorizationState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.f58136type;
    }

    private AuthorizationState() {
        this.f58136type = toString();
    }
}
