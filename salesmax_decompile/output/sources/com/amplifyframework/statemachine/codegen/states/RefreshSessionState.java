package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent;
import com.amplifyframework.statemachine.codegen.states.FetchAuthSessionState;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.hh3;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class RefreshSessionState implements State {
    private final FetchAuthSessionState fetchAuthSessionState;

    public static final class Builder implements com.amplifyframework.statemachine.Builder<RefreshSessionState> {
        private FetchAuthSessionState fetchAuthSessionState;
        private final RefreshSessionState refreshSessionState;

        public Builder(RefreshSessionState refreshSessionState) {
            sq8.m48649h(refreshSessionState, "refreshSessionState");
            this.refreshSessionState = refreshSessionState;
        }

        public final FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        public final void setFetchAuthSessionState(FetchAuthSessionState fetchAuthSessionState) {
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amplifyframework.statemachine.Builder
        public RefreshSessionState build() {
            RefreshSessionState refreshSessionState = this.refreshSessionState;
            return refreshSessionState instanceof RefreshingUnAuthSession ? new RefreshingUnAuthSession(this.fetchAuthSessionState) : refreshSessionState instanceof RefreshingAuthSession ? new RefreshingAuthSession(((RefreshingAuthSession) refreshSessionState).getSignedInData(), this.fetchAuthSessionState) : refreshSessionState;
        }
    }

    public static final class NotStarted extends RefreshSessionState {
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

    public static final class Refreshed extends RefreshSessionState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Refreshed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = refreshed.id;
            }
            return refreshed.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Refreshed copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Refreshed(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Refreshed) && sq8.m48644c(this.id, ((Refreshed) obj).id);
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
            return "Refreshed(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refreshed(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Refreshed(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class RefreshingAuthSession extends RefreshSessionState {
        private final FetchAuthSessionState fetchAuthSessionState;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingAuthSession(SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            sq8.m48649h(signedInData, "signedInData");
            this.signedInData = signedInData;
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ RefreshingAuthSession copy$default(RefreshingAuthSession refreshingAuthSession, SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = refreshingAuthSession.signedInData;
            }
            if ((i & 2) != 0) {
                fetchAuthSessionState = refreshingAuthSession.fetchAuthSessionState;
            }
            return refreshingAuthSession.copy(signedInData, fetchAuthSessionState);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final FetchAuthSessionState component2() {
            return this.fetchAuthSessionState;
        }

        public final RefreshingAuthSession copy(SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            sq8.m48649h(signedInData, "signedInData");
            return new RefreshingAuthSession(signedInData, fetchAuthSessionState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshingAuthSession)) {
                return false;
            }
            RefreshingAuthSession refreshingAuthSession = (RefreshingAuthSession) obj;
            return sq8.m48644c(this.signedInData, refreshingAuthSession.signedInData) && sq8.m48644c(this.fetchAuthSessionState, refreshingAuthSession.fetchAuthSessionState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.RefreshSessionState
        public FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.signedInData.hashCode() * 31;
            FetchAuthSessionState fetchAuthSessionState = this.fetchAuthSessionState;
            return iHashCode + (fetchAuthSessionState == null ? 0 : fetchAuthSessionState.hashCode());
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingAuthSession(signedInData=" + this.signedInData + ", fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }
    }

    public static final class RefreshingUnAuthSession extends RefreshSessionState {
        private final FetchAuthSessionState fetchAuthSessionState;

        public RefreshingUnAuthSession(FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ RefreshingUnAuthSession copy$default(RefreshingUnAuthSession refreshingUnAuthSession, FetchAuthSessionState fetchAuthSessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                fetchAuthSessionState = refreshingUnAuthSession.fetchAuthSessionState;
            }
            return refreshingUnAuthSession.copy(fetchAuthSessionState);
        }

        public final FetchAuthSessionState component1() {
            return this.fetchAuthSessionState;
        }

        public final RefreshingUnAuthSession copy(FetchAuthSessionState fetchAuthSessionState) {
            return new RefreshingUnAuthSession(fetchAuthSessionState);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshingUnAuthSession) && sq8.m48644c(this.fetchAuthSessionState, ((RefreshingUnAuthSession) obj).fetchAuthSessionState);
        }

        @Override // com.amplifyframework.statemachine.codegen.states.RefreshSessionState
        public FetchAuthSessionState getFetchAuthSessionState() {
            return this.fetchAuthSessionState;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            FetchAuthSessionState fetchAuthSessionState = this.fetchAuthSessionState;
            if (fetchAuthSessionState == null) {
                return 0;
            }
            return fetchAuthSessionState.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingUnAuthSession(fetchAuthSessionState=" + this.fetchAuthSessionState + ")";
        }
    }

    public static final class RefreshingUserPoolTokens extends RefreshSessionState {
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingUserPoolTokens(SignedInData signedInData) {
            super(null);
            sq8.m48649h(signedInData, "signedInData");
            this.signedInData = signedInData;
        }

        public static /* synthetic */ RefreshingUserPoolTokens copy$default(RefreshingUserPoolTokens refreshingUserPoolTokens, SignedInData signedInData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = refreshingUserPoolTokens.signedInData;
            }
            return refreshingUserPoolTokens.copy(signedInData);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final RefreshingUserPoolTokens copy(SignedInData signedInData) {
            sq8.m48649h(signedInData, "signedInData");
            return new RefreshingUserPoolTokens(signedInData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshingUserPoolTokens) && sq8.m48644c(this.signedInData, ((RefreshingUserPoolTokens) obj).signedInData);
        }

        public final SignedInData getSignedInData() {
            return this.signedInData;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.signedInData.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RefreshingUserPoolTokens(signedInData=" + this.signedInData + ")";
        }
    }

    public static final class Resolver implements StateMachineResolver<RefreshSessionState> {
        private final NotStarted defaultState;
        private final FetchAuthSessionActions fetchAuthSessionActions;
        private final StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(StateMachineResolver<FetchAuthSessionState> stateMachineResolver, FetchAuthSessionActions fetchAuthSessionActions) {
            sq8.m48649h(stateMachineResolver, "fetchAuthSessionResolver");
            sq8.m48649h(fetchAuthSessionActions, "fetchAuthSessionActions");
            this.fetchAuthSessionResolver = stateMachineResolver;
            this.fetchAuthSessionActions = fetchAuthSessionActions;
            this.defaultState = new NotStarted(null, 1, 0 == true ? 1 : 0);
        }

        private final FetchAuthSessionEvent.EventType asFetchAuthSessionEvent(StateMachineEvent stateMachineEvent) {
            FetchAuthSessionEvent fetchAuthSessionEvent = stateMachineEvent instanceof FetchAuthSessionEvent ? (FetchAuthSessionEvent) stateMachineEvent : null;
            if (fetchAuthSessionEvent != null) {
                return fetchAuthSessionEvent.getEventType();
            }
            return null;
        }

        private final RefreshSessionEvent.EventType asRefreshSessionEvent(StateMachineEvent stateMachineEvent) {
            RefreshSessionEvent refreshSessionEvent = stateMachineEvent instanceof RefreshSessionEvent ? (RefreshSessionEvent) stateMachineEvent : null;
            if (refreshSessionEvent != null) {
                return refreshSessionEvent.getEventType();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final StateResolution<RefreshSessionState> resolveRefreshSessionEvent(RefreshSessionState refreshSessionState, StateMachineEvent stateMachineEvent) {
            RefreshSessionEvent.EventType eventTypeAsRefreshSessionEvent = asRefreshSessionEvent(stateMachineEvent);
            FetchAuthSessionEvent.EventType eventTypeAsFetchAuthSessionEvent = asFetchAuthSessionEvent(stateMachineEvent);
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            StateResolution<RefreshSessionState> stateResolution = new StateResolution<>(refreshSessionState, null, 2, null);
            if (refreshSessionState instanceof NotStarted) {
                if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshUserPoolTokens) {
                    RefreshSessionEvent.EventType.RefreshUserPoolTokens refreshUserPoolTokens = (RefreshSessionEvent.EventType.RefreshUserPoolTokens) eventTypeAsRefreshSessionEvent;
                    return new StateResolution<>(new RefreshingUserPoolTokens(refreshUserPoolTokens.getSignedInData()), bh3.m18963e(this.fetchAuthSessionActions.refreshUserPoolTokensAction(refreshUserPoolTokens.getSignedInData())));
                }
                if (!(eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshUnAuthSession)) {
                    return stateResolution;
                }
                RefreshSessionEvent.EventType.RefreshUnAuthSession refreshUnAuthSession = (RefreshSessionEvent.EventType.RefreshUnAuthSession) eventTypeAsRefreshSessionEvent;
                return new StateResolution<>(new RefreshingUnAuthSession(new FetchAuthSessionState.FetchingAWSCredentials(refreshUnAuthSession.getIdentityId(), refreshUnAuthSession.getLogins())), bh3.m18963e(this.fetchAuthSessionActions.fetchAWSCredentialsAction(refreshUnAuthSession.getIdentityId(), refreshUnAuthSession.getLogins())));
            }
            int i = 1;
            if (refreshSessionState instanceof RefreshingUnAuthSession) {
                if (!(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                    return stateResolution;
                }
                FetchAuthSessionEvent.EventType.Fetched fetched = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
                return new StateResolution<>(new Refreshed(str, i, objArr5 == true ? 1 : 0), bh3.m18963e(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.IdentityPool(fetched.getIdentityId(), fetched.getAwsCredentials()))));
            }
            if (!(refreshSessionState instanceof RefreshingUserPoolTokens)) {
                if (!(refreshSessionState instanceof RefreshingAuthSession) || !(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                    return stateResolution;
                }
                FetchAuthSessionEvent.EventType.Fetched fetched2 = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
                return new StateResolution<>(new Refreshed(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), bh3.m18963e(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.UserAndIdentityPool(((RefreshingAuthSession) refreshSessionState).getSignedInData(), fetched2.getIdentityId(), fetched2.getAwsCredentials()))));
            }
            if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.Refreshed) {
                return new StateResolution<>(new Refreshed(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), bh3.m18963e(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.UserPool(((RefreshSessionEvent.EventType.Refreshed) eventTypeAsRefreshSessionEvent).getSignedInData()))));
            }
            if (!(eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshAuthSession)) {
                return stateResolution;
            }
            RefreshSessionEvent.EventType.RefreshAuthSession refreshAuthSession = (RefreshSessionEvent.EventType.RefreshAuthSession) eventTypeAsRefreshSessionEvent;
            return new StateResolution<>(new RefreshingAuthSession(refreshAuthSession.getSignedInData(), new FetchAuthSessionState.NotStarted(null, 1, null)), bh3.m18963e(this.fetchAuthSessionActions.refreshAuthSessionAction(refreshAuthSession.getLogins())));
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<RefreshSessionState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<RefreshSessionState, StateMachineResolver<RefreshSessionState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<RefreshSessionState> resolve(RefreshSessionState refreshSessionState, StateMachineEvent stateMachineEvent) {
            StateResolution<StateType> stateResolutionResolve;
            sq8.m48649h(refreshSessionState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            StateResolution<RefreshSessionState> stateResolutionResolveRefreshSessionEvent = resolveRefreshSessionEvent(refreshSessionState, stateMachineEvent);
            List listT0 = kh3.T0(stateResolutionResolveRefreshSessionEvent.getActions());
            Builder builder = new Builder((RefreshSessionState) stateResolutionResolveRefreshSessionEvent.getNewState());
            FetchAuthSessionState fetchAuthSessionState = refreshSessionState.getFetchAuthSessionState();
            if (fetchAuthSessionState != null && (stateResolutionResolve = this.fetchAuthSessionResolver.resolve(fetchAuthSessionState, stateMachineEvent)) != 0) {
                builder.setFetchAuthSessionState((FetchAuthSessionState) stateResolutionResolve.getNewState());
                hh3.m30441A(listT0, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), listT0);
        }
    }

    public /* synthetic */ RefreshSessionState(id5 id5Var) {
        this();
    }

    public FetchAuthSessionState getFetchAuthSessionState() {
        return this.fetchAuthSessionState;
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    private RefreshSessionState() {
        this.fetchAuthSessionState = new FetchAuthSessionState.NotStarted(null, 1, null);
    }
}
