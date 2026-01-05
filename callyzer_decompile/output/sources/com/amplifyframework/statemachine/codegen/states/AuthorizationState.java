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
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AuthorizationState implements State {
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Configured extends AuthorizationState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43803id;

        /* JADX WARN: Multi-variable type inference failed */
        public Configured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Configured copy$default(Configured configured, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = configured.f43803id;
            }
            return configured.copy(str);
        }

        public final String component1() {
            return this.f43803id;
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
            return (obj instanceof Configured) && AbstractC4154l.m8918a(this.f43803id, ((Configured) obj).f43803id);
        }

        public final String getId() {
            return this.f43803id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43803id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Configured(id=", this.f43803id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Configured(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43803id = id2;
        }

        public /* synthetic */ Configured(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DeletingUser extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;
        private final DeleteUserState deleteUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeletingUser(DeleteUserState deleteUserState, AmplifyCredential amplifyCredential) {
            super(null);
            AbstractC4154l.m8923f(deleteUserState, "deleteUserState");
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
            this.deleteUserState = deleteUserState;
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ DeletingUser copy$default(DeletingUser deletingUser, DeleteUserState deleteUserState, AmplifyCredential amplifyCredential, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deleteUserState = deletingUser.deleteUserState;
            }
            if ((i10 & 2) != 0) {
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
            AbstractC4154l.m8923f(deleteUserState, "deleteUserState");
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
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
            return AbstractC4154l.m8918a(this.deleteUserState, deletingUser.deleteUserState) && AbstractC4154l.m8918a(this.amplifyCredential, deletingUser.amplifyCredential);
        }

        public final AmplifyCredential getAmplifyCredential() {
            return this.amplifyCredential;
        }

        public final DeleteUserState getDeleteUserState() {
            return this.deleteUserState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.amplifyCredential.hashCode() + (this.deleteUserState.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "DeletingUser(deleteUserState=" + this.deleteUserState + ", amplifyCredential=" + this.amplifyCredential + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Error extends AuthorizationState {
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
    public static final class FederatingToIdentityPool extends AuthorizationState {
        private final AmplifyCredential existingCredential;
        private final FederatedToken federatedToken;
        private final FetchAuthSessionState fetchAuthSessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FederatingToIdentityPool(FederatedToken federatedToken, FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential) {
            super(null);
            AbstractC4154l.m8923f(federatedToken, "federatedToken");
            AbstractC4154l.m8923f(fetchAuthSessionState, "fetchAuthSessionState");
            this.federatedToken = federatedToken;
            this.fetchAuthSessionState = fetchAuthSessionState;
            this.existingCredential = amplifyCredential;
        }

        public static /* synthetic */ FederatingToIdentityPool copy$default(FederatingToIdentityPool federatingToIdentityPool, FederatedToken federatedToken, FetchAuthSessionState fetchAuthSessionState, AmplifyCredential amplifyCredential, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                federatedToken = federatingToIdentityPool.federatedToken;
            }
            if ((i10 & 2) != 0) {
                fetchAuthSessionState = federatingToIdentityPool.fetchAuthSessionState;
            }
            if ((i10 & 4) != 0) {
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
            AbstractC4154l.m8923f(federatedToken, "federatedToken");
            AbstractC4154l.m8923f(fetchAuthSessionState, "fetchAuthSessionState");
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
            return AbstractC4154l.m8918a(this.federatedToken, federatingToIdentityPool.federatedToken) && AbstractC4154l.m8918a(this.fetchAuthSessionState, federatingToIdentityPool.fetchAuthSessionState) && AbstractC4154l.m8918a(this.existingCredential, federatingToIdentityPool.existingCredential);
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
            int iHashCode = (this.fetchAuthSessionState.hashCode() + (this.federatedToken.hashCode() * 31)) * 31;
            AmplifyCredential amplifyCredential = this.existingCredential;
            return iHashCode + (amplifyCredential == null ? 0 : amplifyCredential.hashCode());
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FederatingToIdentityPool(federatedToken=" + this.federatedToken + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ", existingCredential=" + this.existingCredential + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FetchingAuthSession extends AuthorizationState {
        private final FetchAuthSessionState fetchAuthSessionState;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingAuthSession(SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            AbstractC4154l.m8923f(signedInData, "signedInData");
            AbstractC4154l.m8923f(fetchAuthSessionState, "fetchAuthSessionState");
            this.signedInData = signedInData;
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ FetchingAuthSession copy$default(FetchingAuthSession fetchingAuthSession, SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = fetchingAuthSession.signedInData;
            }
            if ((i10 & 2) != 0) {
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
            AbstractC4154l.m8923f(signedInData, "signedInData");
            AbstractC4154l.m8923f(fetchAuthSessionState, "fetchAuthSessionState");
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
            return AbstractC4154l.m8918a(this.signedInData, fetchingAuthSession.signedInData) && AbstractC4154l.m8918a(this.fetchAuthSessionState, fetchingAuthSession.fetchAuthSessionState);
        }

        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.fetchAuthSessionState.hashCode() + (this.signedInData.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingAuthSession(signedInData=" + this.signedInData + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FetchingUnAuthSession extends AuthorizationState {
        private final FetchAuthSessionState fetchAuthSessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingUnAuthSession(FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            AbstractC4154l.m8923f(fetchAuthSessionState, "fetchAuthSessionState");
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ FetchingUnAuthSession copy$default(FetchingUnAuthSession fetchingUnAuthSession, FetchAuthSessionState fetchAuthSessionState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fetchAuthSessionState = fetchingUnAuthSession.fetchAuthSessionState;
            }
            return fetchingUnAuthSession.copy(fetchAuthSessionState);
        }

        public final FetchAuthSessionState component1() {
            return this.fetchAuthSessionState;
        }

        public final FetchingUnAuthSession copy(FetchAuthSessionState fetchAuthSessionState) {
            AbstractC4154l.m8923f(fetchAuthSessionState, "fetchAuthSessionState");
            return new FetchingUnAuthSession(fetchAuthSessionState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingUnAuthSession) && AbstractC4154l.m8918a(this.fetchAuthSessionState, ((FetchingUnAuthSession) obj).fetchAuthSessionState);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotConfigured extends AuthorizationState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43804id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notConfigured.f43804id;
            }
            return notConfigured.copy(str);
        }

        public final String component1() {
            return this.f43804id;
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
            return (obj instanceof NotConfigured) && AbstractC4154l.m8918a(this.f43804id, ((NotConfigured) obj).f43804id);
        }

        public final String getId() {
            return this.f43804id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43804id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotConfigured(id=", this.f43804id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43804id = id2;
        }

        public /* synthetic */ NotConfigured(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RefreshingSession extends AuthorizationState {
        private final AmplifyCredential existingCredential;
        private final RefreshSessionState refreshSessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingSession(AmplifyCredential existingCredential, RefreshSessionState refreshSessionState) {
            super(null);
            AbstractC4154l.m8923f(existingCredential, "existingCredential");
            AbstractC4154l.m8923f(refreshSessionState, "refreshSessionState");
            this.existingCredential = existingCredential;
            this.refreshSessionState = refreshSessionState;
        }

        public static /* synthetic */ RefreshingSession copy$default(RefreshingSession refreshingSession, AmplifyCredential amplifyCredential, RefreshSessionState refreshSessionState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                amplifyCredential = refreshingSession.existingCredential;
            }
            if ((i10 & 2) != 0) {
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

        public final RefreshingSession copy(AmplifyCredential existingCredential, RefreshSessionState refreshSessionState) {
            AbstractC4154l.m8923f(existingCredential, "existingCredential");
            AbstractC4154l.m8923f(refreshSessionState, "refreshSessionState");
            return new RefreshingSession(existingCredential, refreshSessionState);
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
            return AbstractC4154l.m8918a(this.existingCredential, refreshingSession.existingCredential) && AbstractC4154l.m8918a(this.refreshSessionState, refreshingSession.refreshSessionState);
        }

        public final AmplifyCredential getExistingCredential() {
            return this.existingCredential;
        }

        public final RefreshSessionState getRefreshSessionState() {
            return this.refreshSessionState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.refreshSessionState.hashCode() + (this.existingCredential.hashCode() * 31);
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingSession(existingCredential=" + this.existingCredential + ", refreshSessionState=" + this.refreshSessionState + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<AuthorizationState> {
        private final AuthorizationActions authorizationActions;
        private final NotConfigured defaultState;
        private final StateMachineResolver<DeleteUserState> deleteUserResolver;
        private final StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver;
        private final StateMachineResolver<RefreshSessionState> refreshSessionResolver;

        public Resolver(StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver, StateMachineResolver<RefreshSessionState> refreshSessionResolver, StateMachineResolver<DeleteUserState> deleteUserResolver, AuthorizationActions authorizationActions) {
            AbstractC4154l.m8923f(fetchAuthSessionResolver, "fetchAuthSessionResolver");
            AbstractC4154l.m8923f(refreshSessionResolver, "refreshSessionResolver");
            AbstractC4154l.m8923f(deleteUserResolver, "deleteUserResolver");
            AbstractC4154l.m8923f(authorizationActions, "authorizationActions");
            this.fetchAuthSessionResolver = fetchAuthSessionResolver;
            this.refreshSessionResolver = refreshSessionResolver;
            this.deleteUserResolver = deleteUserResolver;
            this.authorizationActions = authorizationActions;
            this.defaultState = new NotConfigured("");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<AuthorizationState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<AuthorizationState, StateMachineResolver<AuthorizationState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<AuthorizationState> resolve(AuthorizationState oldState, StateMachineEvent event) {
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            AuthEvent.EventType eventTypeIsAuthEvent = AuthEnvironmentKt.isAuthEvent(event);
            AuthenticationEvent.EventType eventTypeIsAuthenticationEvent = AuthEnvironmentKt.isAuthenticationEvent(event);
            AuthorizationEvent.EventType eventTypeIsAuthorizationEvent = AuthEnvironmentKt.isAuthorizationEvent(event);
            DeleteUserEvent.EventType eventTypeIsDeleteUserEvent = AuthEnvironmentKt.isDeleteUserEvent(event);
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
            StateResolution<AuthorizationState> stateResolution = new StateResolution<>(oldState, null, 2, null);
            boolean z6 = eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInCompleted;
            int i10 = 1;
            if (z6) {
                AuthenticationEvent.EventType.SignInCompleted signInCompleted = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                return new StateResolution<>(new FetchingAuthSession(signInCompleted.getSignedInData(), new FetchAuthSessionState.NotStarted(str, i10, objArr37 == true ? 1 : 0)), pe.m10833h(this.authorizationActions.initializeFetchAuthSession(signInCompleted.getSignedInData())));
            }
            if (oldState instanceof NotConfigured) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Configure) {
                    return new StateResolution<>(new Configured(objArr36 == true ? 1 : 0, i10, objArr35 == true ? 1 : 0), pe.m10833h(this.authorizationActions.configureAuthorizationAction()));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.CachedCredentialsAvailable) {
                    return new StateResolution<>(new SessionEstablished(((AuthorizationEvent.EventType.CachedCredentialsAvailable) eventTypeIsAuthorizationEvent).getAmplifyCredential()), pe.m10833h(this.authorizationActions.configureAuthorizationAction()));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                    return new StateResolution<>(new NotConfigured(objArr34 == true ? 1 : 0, i10, objArr33 == true ? 1 : 0), null, 2, null);
                }
            } else if (oldState instanceof Configured) {
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.FetchUnAuthSession) {
                    return new StateResolution<>(new FetchingUnAuthSession(new FetchAuthSessionState.NotStarted(objArr32 == true ? 1 : 0, i10, objArr31 == true ? 1 : 0)), pe.m10833h(this.authorizationActions.initializeFetchUnAuthSession()));
                }
                if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                    AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                    return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool.getToken(), new FetchAuthSessionState.NotStarted(objArr30 == true ? 1 : 0, i10, objArr29 == true ? 1 : 0), startFederationToIdentityPool.getExistingCredential()), pe.m10833h(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool.getToken(), startFederationToIdentityPool.getIdentityId())));
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                    return new StateResolution<>(new SigningIn(objArr28 == true ? 1 : 0, i10, objArr27 == true ? 1 : 0), null, 2, null);
                }
            } else if (oldState instanceof StoringCredentials) {
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.ReceivedCachedCredentials) {
                    return ((StoringCredentials) oldState).getAmplifyCredential() instanceof AmplifyCredential.Empty ? new StateResolution<>(new Configured(objArr26 == true ? 1 : 0, i10, objArr25 == true ? 1 : 0), null, 2, null) : new StateResolution<>(new SessionEstablished(((AuthEvent.EventType.ReceivedCachedCredentials) eventTypeIsAuthEvent).getStoredCredentials()), null, 2, null);
                }
                if (eventTypeIsAuthEvent instanceof AuthEvent.EventType.CachedCredentialsFailed) {
                    return new StateResolution<>(new NotConfigured(objArr24 == true ? 1 : 0, i10, objArr23 == true ? 1 : 0), null, 2, null);
                }
            } else if (oldState instanceof SigningIn) {
                if (z6) {
                    AuthenticationEvent.EventType.SignInCompleted signInCompleted2 = (AuthenticationEvent.EventType.SignInCompleted) eventTypeIsAuthenticationEvent;
                    return new StateResolution<>(new FetchingAuthSession(signInCompleted2.getSignedInData(), new FetchAuthSessionState.NotStarted(objArr22 == true ? 1 : 0, i10, objArr21 == true ? 1 : 0)), pe.m10833h(this.authorizationActions.initializeFetchAuthSession(signInCompleted2.getSignedInData())));
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignIn) {
                    return new StateResolution<>(new Configured(objArr20 == true ? 1 : 0, i10, objArr19 == true ? 1 : 0), null, 2, null);
                }
            } else if (oldState instanceof SigningOut) {
                if (AuthEnvironmentKt.isSignOutEvent(event) instanceof SignOutEvent.EventType.SignOutLocally) {
                    AuthorizationActions authorizationActions = this.authorizationActions;
                    AmplifyCredential.Empty empty = AmplifyCredential.Empty.INSTANCE;
                    return new StateResolution<>(new StoringCredentials(empty), pe.m10833h(authorizationActions.persistCredentials(empty)));
                }
                if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.CancelSignOut) {
                    return new StateResolution<>(new SessionEstablished(((SigningOut) oldState).getAmplifyCredential()), null, 2, null);
                }
            } else {
                if (oldState instanceof FetchingUnAuthSession) {
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                        AuthorizationEvent.EventType.Fetched fetched = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                        AmplifyCredential.IdentityPool identityPool = new AmplifyCredential.IdentityPool(fetched.getIdentityId(), fetched.getAwsCredentials());
                        return new StateResolution<>(new StoringCredentials(identityPool), pe.m10833h(this.authorizationActions.persistCredentials(identityPool)));
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                        return new StateResolution<>(new Error(new SessionError(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException(), AmplifyCredential.Empty.INSTANCE)), null, 2, null);
                    }
                    StateResolution<StateType> stateResolutionResolve = this.fetchAuthSessionResolver.resolve(((FetchingUnAuthSession) oldState).getFetchAuthSessionState(), event);
                    return new StateResolution<>(new FetchingUnAuthSession((FetchAuthSessionState) stateResolutionResolve.getNewState()), stateResolutionResolve.getActions());
                }
                if (oldState instanceof FetchingAuthSession) {
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                        AuthorizationEvent.EventType.Fetched fetched2 = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                        AmplifyCredential.UserAndIdentityPool userAndIdentityPool = new AmplifyCredential.UserAndIdentityPool(((FetchingAuthSession) oldState).getSignedInData(), fetched2.getIdentityId(), fetched2.getAwsCredentials());
                        return new StateResolution<>(new StoringCredentials(userAndIdentityPool), pe.m10833h(this.authorizationActions.persistCredentials(userAndIdentityPool)));
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                        AmplifyCredential.UserPool userPool = new AmplifyCredential.UserPool(((FetchingAuthSession) oldState).getSignedInData());
                        return new StateResolution<>(new StoringCredentials(userPool), pe.m10833h(this.authorizationActions.persistCredentials(userPool)));
                    }
                    FetchingAuthSession fetchingAuthSession = (FetchingAuthSession) oldState;
                    StateResolution<StateType> stateResolutionResolve2 = this.fetchAuthSessionResolver.resolve(fetchingAuthSession.getFetchAuthSessionState(), event);
                    return new StateResolution<>(new FetchingAuthSession(fetchingAuthSession.getSignedInData(), (FetchAuthSessionState) stateResolutionResolve2.getNewState()), stateResolutionResolve2.getActions());
                }
                if (oldState instanceof FederatingToIdentityPool) {
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Fetched) {
                        AuthorizationEvent.EventType.Fetched fetched3 = (AuthorizationEvent.EventType.Fetched) eventTypeIsAuthorizationEvent;
                        AmplifyCredential.IdentityPoolFederated identityPoolFederated = new AmplifyCredential.IdentityPoolFederated(((FederatingToIdentityPool) oldState).getFederatedToken(), fetched3.getIdentityId(), fetched3.getAwsCredentials());
                        return new StateResolution<>(new StoringCredentials(identityPoolFederated), pe.m10833h(this.authorizationActions.persistCredentials(identityPoolFederated)));
                    }
                    if (!(eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError)) {
                        FederatingToIdentityPool federatingToIdentityPool = (FederatingToIdentityPool) oldState;
                        StateResolution<StateType> stateResolutionResolve3 = this.fetchAuthSessionResolver.resolve(federatingToIdentityPool.getFetchAuthSessionState(), event);
                        return new StateResolution<>(new FederatingToIdentityPool(federatingToIdentityPool.getFederatedToken(), (FetchAuthSessionState) stateResolutionResolve3.getNewState(), federatingToIdentityPool.getExistingCredential()), stateResolutionResolve3.getActions());
                    }
                    Exception exception = ((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException();
                    AmplifyCredential existingCredential = ((FederatingToIdentityPool) oldState).getExistingCredential();
                    if (existingCredential == null) {
                        existingCredential = AmplifyCredential.Empty.INSTANCE;
                    }
                    return new StateResolution<>(new Error(new SessionError(exception, existingCredential)), null, 2, null);
                }
                if (oldState instanceof RefreshingSession) {
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.Refreshed) {
                        AuthorizationEvent.EventType.Refreshed refreshed = (AuthorizationEvent.EventType.Refreshed) eventTypeIsAuthorizationEvent;
                        return new StateResolution<>(new StoringCredentials(refreshed.getAmplifyCredential()), pe.m10833h(this.authorizationActions.persistCredentials(refreshed.getAmplifyCredential())));
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                        return new StateResolution<>(new Error(new SessionError(((AuthorizationEvent.EventType.ThrowError) eventTypeIsAuthorizationEvent).getException(), ((RefreshingSession) oldState).getExistingCredential())), null, 2, null);
                    }
                    RefreshingSession refreshingSession = (RefreshingSession) oldState;
                    StateResolution<StateType> stateResolutionResolve4 = this.refreshSessionResolver.resolve(refreshingSession.getRefreshSessionState(), event);
                    return new StateResolution<>(new RefreshingSession(refreshingSession.getExistingCredential(), (RefreshSessionState) stateResolutionResolve4.getNewState()), stateResolutionResolve4.getActions());
                }
                if (oldState instanceof DeletingUser) {
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.UserDeleted) {
                        return new StateResolution<>(new SigningOut(((DeletingUser) oldState).getAmplifyCredential()), C6668r.f31943a);
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.ThrowError) {
                        return new StateResolution<>(new SessionEstablished(((DeletingUser) oldState).getAmplifyCredential()), null, 2, null);
                    }
                    DeletingUser deletingUser = (DeletingUser) oldState;
                    StateResolution<StateType> stateResolutionResolve5 = this.deleteUserResolver.resolve(deletingUser.getDeleteUserState(), event);
                    return new StateResolution<>(new DeletingUser((DeleteUserState) stateResolutionResolve5.getNewState(), deletingUser.getAmplifyCredential()), stateResolutionResolve5.getActions());
                }
                if (oldState instanceof SessionEstablished) {
                    if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                        return new StateResolution<>(new SigningIn(objArr18 == true ? 1 : 0, i10, objArr17 == true ? 1 : 0), null, 2, null);
                    }
                    if ((eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) || (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.ClearFederationToIdentityPool)) {
                        return new StateResolution<>(new SigningOut(((SessionEstablished) oldState).getAmplifyCredential()), null, 2, null);
                    }
                    if (eventTypeIsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser) {
                        return new StateResolution<>(new DeletingUser(new DeleteUserState.NotStarted(objArr16 == true ? 1 : 0, i10, objArr15 == true ? 1 : 0), ((SessionEstablished) oldState).getAmplifyCredential()), pe.m10833h(this.authorizationActions.initiateDeleteUser((DeleteUserEvent.EventType.DeleteUser) eventTypeIsDeleteUserEvent)));
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.RefreshSession) {
                        AuthorizationEvent.EventType.RefreshSession refreshSession = (AuthorizationEvent.EventType.RefreshSession) eventTypeIsAuthorizationEvent;
                        return new StateResolution<>(new RefreshingSession(refreshSession.getAmplifyCredential(), new RefreshSessionState.NotStarted(objArr14 == true ? 1 : 0, i10, objArr13 == true ? 1 : 0)), pe.m10833h(this.authorizationActions.initiateRefreshSessionAction(refreshSession.getAmplifyCredential())));
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                        AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool2 = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                        return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool2.getToken(), new FetchAuthSessionState.NotStarted(objArr12 == true ? 1 : 0, i10, objArr11 == true ? 1 : 0), startFederationToIdentityPool2.getExistingCredential()), pe.m10833h(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool2.getToken(), startFederationToIdentityPool2.getIdentityId())));
                    }
                } else {
                    if (!(oldState instanceof Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignInRequested) {
                        return new StateResolution<>(new SigningIn(objArr10 == true ? 1 : 0, i10, objArr9 == true ? 1 : 0), null, 2, null);
                    }
                    if (eventTypeIsAuthenticationEvent instanceof AuthenticationEvent.EventType.SignOutRequested) {
                        return new StateResolution<>(new SigningOut(AmplifyCredential.Empty.INSTANCE), null, 2, null);
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.FetchUnAuthSession) {
                        return new StateResolution<>(new FetchingUnAuthSession(new FetchAuthSessionState.NotStarted(objArr8 == true ? 1 : 0, i10, objArr7 == true ? 1 : 0)), pe.m10833h(this.authorizationActions.initializeFetchUnAuthSession()));
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.RefreshSession) {
                        AuthorizationEvent.EventType.RefreshSession refreshSession2 = (AuthorizationEvent.EventType.RefreshSession) eventTypeIsAuthorizationEvent;
                        return new StateResolution<>(new RefreshingSession(refreshSession2.getAmplifyCredential(), new RefreshSessionState.NotStarted(objArr6 == true ? 1 : 0, i10, objArr5 == true ? 1 : 0)), pe.m10833h(this.authorizationActions.initiateRefreshSessionAction(refreshSession2.getAmplifyCredential())));
                    }
                    if (eventTypeIsAuthorizationEvent instanceof AuthorizationEvent.EventType.StartFederationToIdentityPool) {
                        AuthorizationEvent.EventType.StartFederationToIdentityPool startFederationToIdentityPool3 = (AuthorizationEvent.EventType.StartFederationToIdentityPool) eventTypeIsAuthorizationEvent;
                        return new StateResolution<>(new FederatingToIdentityPool(startFederationToIdentityPool3.getToken(), new FetchAuthSessionState.NotStarted(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), startFederationToIdentityPool3.getExistingCredential()), pe.m10833h(this.authorizationActions.initializeFederationToIdentityPool(startFederationToIdentityPool3.getToken(), startFederationToIdentityPool3.getIdentityId())));
                    }
                    if (eventTypeIsDeleteUserEvent instanceof DeleteUserEvent.EventType.DeleteUser) {
                        return new StateResolution<>(new DeletingUser(new DeleteUserState.NotStarted(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), AmplifyCredential.Empty.INSTANCE), pe.m10833h(this.authorizationActions.initiateDeleteUser((DeleteUserEvent.EventType.DeleteUser) eventTypeIsDeleteUserEvent)));
                    }
                }
            }
            return stateResolution;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SessionEstablished extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionEstablished(AmplifyCredential amplifyCredential) {
            super(null);
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ SessionEstablished copy$default(SessionEstablished sessionEstablished, AmplifyCredential amplifyCredential, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                amplifyCredential = sessionEstablished.amplifyCredential;
            }
            return sessionEstablished.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        public final SessionEstablished copy(AmplifyCredential amplifyCredential) {
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
            return new SessionEstablished(amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionEstablished) && AbstractC4154l.m8918a(this.amplifyCredential, ((SessionEstablished) obj).amplifyCredential);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningIn extends AuthorizationState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43805id;

        /* JADX WARN: Multi-variable type inference failed */
        public SigningIn() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SigningIn copy$default(SigningIn signingIn, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = signingIn.f43805id;
            }
            return signingIn.copy(str);
        }

        public final String component1() {
            return this.f43805id;
        }

        public final SigningIn copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new SigningIn(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningIn) && AbstractC4154l.m8918a(this.f43805id, ((SigningIn) obj).f43805id);
        }

        public final String getId() {
            return this.f43805id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43805id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("SigningIn(id=", this.f43805id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningIn(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43805id = id2;
        }

        public /* synthetic */ SigningIn(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SigningOut extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningOut(AmplifyCredential amplifyCredential) {
            super(null);
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ SigningOut copy$default(SigningOut signingOut, AmplifyCredential amplifyCredential, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                amplifyCredential = signingOut.amplifyCredential;
            }
            return signingOut.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        public final SigningOut copy(AmplifyCredential amplifyCredential) {
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
            return new SigningOut(amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SigningOut) && AbstractC4154l.m8918a(this.amplifyCredential, ((SigningOut) obj).amplifyCredential);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class StoringCredentials extends AuthorizationState {
        private final AmplifyCredential amplifyCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoringCredentials(AmplifyCredential amplifyCredential) {
            super(null);
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
            this.amplifyCredential = amplifyCredential;
        }

        public static /* synthetic */ StoringCredentials copy$default(StoringCredentials storingCredentials, AmplifyCredential amplifyCredential, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                amplifyCredential = storingCredentials.amplifyCredential;
            }
            return storingCredentials.copy(amplifyCredential);
        }

        public final AmplifyCredential component1() {
            return this.amplifyCredential;
        }

        public final StoringCredentials copy(AmplifyCredential amplifyCredential) {
            AbstractC4154l.m8923f(amplifyCredential, "amplifyCredential");
            return new StoringCredentials(amplifyCredential);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StoringCredentials) && AbstractC4154l.m8918a(this.amplifyCredential, ((StoringCredentials) obj).amplifyCredential);
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

    public /* synthetic */ AuthorizationState(AbstractC4148f abstractC4148f) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.type;
    }

    private AuthorizationState() {
        this.type = toString();
    }
}
