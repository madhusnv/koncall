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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class RefreshSessionState implements State {
    private final FetchAuthSessionState fetchAuthSessionState;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder implements com.amplifyframework.statemachine.Builder<RefreshSessionState> {
        private FetchAuthSessionState fetchAuthSessionState;
        private final RefreshSessionState refreshSessionState;

        public Builder(RefreshSessionState refreshSessionState) {
            AbstractC4154l.m8923f(refreshSessionState, "refreshSessionState");
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class NotStarted extends RefreshSessionState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43830id;

        /* JADX WARN: Multi-variable type inference failed */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notStarted.f43830id;
            }
            return notStarted.copy(str);
        }

        public final String component1() {
            return this.f43830id;
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
            return (obj instanceof NotStarted) && AbstractC4154l.m8918a(this.f43830id, ((NotStarted) obj).f43830id);
        }

        public final String getId() {
            return this.f43830id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43830id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("NotStarted(id=", this.f43830id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43830id = id2;
        }

        public /* synthetic */ NotStarted(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Refreshed extends RefreshSessionState {

        /* renamed from: id, reason: collision with root package name */
        private final String f43831id;

        /* JADX WARN: Multi-variable type inference failed */
        public Refreshed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = refreshed.f43831id;
            }
            return refreshed.copy(str);
        }

        public final String component1() {
            return this.f43831id;
        }

        public final Refreshed copy(String id2) {
            AbstractC4154l.m8923f(id2, "id");
            return new Refreshed(id2);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Refreshed) && AbstractC4154l.m8918a(this.f43831id, ((Refreshed) obj).f43831id);
        }

        public final String getId() {
            return this.f43831id;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.f43831id.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return AbstractC5601a.m11238i("Refreshed(id=", this.f43831id, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refreshed(String id2) {
            super(null);
            AbstractC4154l.m8923f(id2, "id");
            this.f43831id = id2;
        }

        public /* synthetic */ Refreshed(String str, int i10, AbstractC4148f abstractC4148f) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RefreshingAuthSession extends RefreshSessionState {
        private final FetchAuthSessionState fetchAuthSessionState;
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingAuthSession(SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            AbstractC4154l.m8923f(signedInData, "signedInData");
            this.signedInData = signedInData;
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ RefreshingAuthSession copy$default(RefreshingAuthSession refreshingAuthSession, SignedInData signedInData, FetchAuthSessionState fetchAuthSessionState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = refreshingAuthSession.signedInData;
            }
            if ((i10 & 2) != 0) {
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
            AbstractC4154l.m8923f(signedInData, "signedInData");
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
            return AbstractC4154l.m8918a(this.signedInData, refreshingAuthSession.signedInData) && AbstractC4154l.m8918a(this.fetchAuthSessionState, refreshingAuthSession.fetchAuthSessionState);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RefreshingUnAuthSession extends RefreshSessionState {
        private final FetchAuthSessionState fetchAuthSessionState;

        public RefreshingUnAuthSession(FetchAuthSessionState fetchAuthSessionState) {
            super(null);
            this.fetchAuthSessionState = fetchAuthSessionState;
        }

        public static /* synthetic */ RefreshingUnAuthSession copy$default(RefreshingUnAuthSession refreshingUnAuthSession, FetchAuthSessionState fetchAuthSessionState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
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
            return (obj instanceof RefreshingUnAuthSession) && AbstractC4154l.m8918a(this.fetchAuthSessionState, ((RefreshingUnAuthSession) obj).fetchAuthSessionState);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class RefreshingUserPoolTokens extends RefreshSessionState {
        private final SignedInData signedInData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshingUserPoolTokens(SignedInData signedInData) {
            super(null);
            AbstractC4154l.m8923f(signedInData, "signedInData");
            this.signedInData = signedInData;
        }

        public static /* synthetic */ RefreshingUserPoolTokens copy$default(RefreshingUserPoolTokens refreshingUserPoolTokens, SignedInData signedInData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = refreshingUserPoolTokens.signedInData;
            }
            return refreshingUserPoolTokens.copy(signedInData);
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final RefreshingUserPoolTokens copy(SignedInData signedInData) {
            AbstractC4154l.m8923f(signedInData, "signedInData");
            return new RefreshingUserPoolTokens(signedInData);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshingUserPoolTokens) && AbstractC4154l.m8918a(this.signedInData, ((RefreshingUserPoolTokens) obj).signedInData);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Resolver implements StateMachineResolver<RefreshSessionState> {
        private final NotStarted defaultState;
        private final FetchAuthSessionActions fetchAuthSessionActions;
        private final StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(StateMachineResolver<FetchAuthSessionState> fetchAuthSessionResolver, FetchAuthSessionActions fetchAuthSessionActions) {
            AbstractC4154l.m8923f(fetchAuthSessionResolver, "fetchAuthSessionResolver");
            AbstractC4154l.m8923f(fetchAuthSessionActions, "fetchAuthSessionActions");
            this.fetchAuthSessionResolver = fetchAuthSessionResolver;
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
            if (!(refreshSessionState instanceof NotStarted)) {
                int i10 = 1;
                if (refreshSessionState instanceof RefreshingUnAuthSession) {
                    if (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched) {
                        FetchAuthSessionEvent.EventType.Fetched fetched = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
                        return new StateResolution<>(new Refreshed(str, i10, objArr5 == true ? 1 : 0), pe.m10833h(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.IdentityPool(fetched.getIdentityId(), fetched.getAwsCredentials()))));
                    }
                } else if (refreshSessionState instanceof RefreshingUserPoolTokens) {
                    if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.Refreshed) {
                        return new StateResolution<>(new Refreshed(objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0), pe.m10833h(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.UserPool(((RefreshSessionEvent.EventType.Refreshed) eventTypeAsRefreshSessionEvent).getSignedInData()))));
                    }
                    if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshAuthSession) {
                        RefreshSessionEvent.EventType.RefreshAuthSession refreshAuthSession = (RefreshSessionEvent.EventType.RefreshAuthSession) eventTypeAsRefreshSessionEvent;
                        return new StateResolution<>(new RefreshingAuthSession(refreshAuthSession.getSignedInData(), new FetchAuthSessionState.NotStarted(null, 1, null)), pe.m10833h(this.fetchAuthSessionActions.refreshAuthSessionAction(refreshAuthSession.getLogins())));
                    }
                } else if ((refreshSessionState instanceof RefreshingAuthSession) && (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                    FetchAuthSessionEvent.EventType.Fetched fetched2 = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
                    return new StateResolution<>(new Refreshed(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0), pe.m10833h(this.fetchAuthSessionActions.notifySessionRefreshedAction(new AmplifyCredential.UserAndIdentityPool(((RefreshingAuthSession) refreshSessionState).getSignedInData(), fetched2.getIdentityId(), fetched2.getAwsCredentials()))));
                }
            } else {
                if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshUserPoolTokens) {
                    RefreshSessionEvent.EventType.RefreshUserPoolTokens refreshUserPoolTokens = (RefreshSessionEvent.EventType.RefreshUserPoolTokens) eventTypeAsRefreshSessionEvent;
                    return new StateResolution<>(new RefreshingUserPoolTokens(refreshUserPoolTokens.getSignedInData()), pe.m10833h(this.fetchAuthSessionActions.refreshUserPoolTokensAction(refreshUserPoolTokens.getSignedInData())));
                }
                if (eventTypeAsRefreshSessionEvent instanceof RefreshSessionEvent.EventType.RefreshUnAuthSession) {
                    RefreshSessionEvent.EventType.RefreshUnAuthSession refreshUnAuthSession = (RefreshSessionEvent.EventType.RefreshUnAuthSession) eventTypeAsRefreshSessionEvent;
                    return new StateResolution<>(new RefreshingUnAuthSession(new FetchAuthSessionState.FetchingAWSCredentials(refreshUnAuthSession.getIdentityId(), refreshUnAuthSession.getLogins())), pe.m10833h(this.fetchAuthSessionActions.fetchAWSCredentialsAction(refreshUnAuthSession.getIdentityId(), refreshUnAuthSession.getLogins())));
                }
            }
            return stateResolution;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<RefreshSessionState, ?> eraseToAnyResolver() {
            return super.eraseToAnyResolver();
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<RefreshSessionState, StateMachineResolver<RefreshSessionState>> logging(Logger logger, Level level) {
            return super.logging(logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<RefreshSessionState> resolve(RefreshSessionState oldState, StateMachineEvent event) {
            StateResolution<StateType> stateResolutionResolve;
            AbstractC4154l.m8923f(oldState, "oldState");
            AbstractC4154l.m8923f(event, "event");
            StateResolution<RefreshSessionState> stateResolutionResolveRefreshSessionEvent = resolveRefreshSessionEvent(oldState, event);
            ArrayList arrayListD0 = AbstractC6663m.d0(stateResolutionResolveRefreshSessionEvent.getActions());
            Builder builder = new Builder((RefreshSessionState) stateResolutionResolveRefreshSessionEvent.getNewState());
            FetchAuthSessionState fetchAuthSessionState = oldState.getFetchAuthSessionState();
            if (fetchAuthSessionState != null && (stateResolutionResolve = this.fetchAuthSessionResolver.resolve(fetchAuthSessionState, event)) != 0) {
                builder.setFetchAuthSessionState((FetchAuthSessionState) stateResolutionResolve.getNewState());
                AbstractC6663m.m12765x(arrayListD0, stateResolutionResolve.getActions());
            }
            return new StateResolution<>(builder.build(), arrayListD0);
        }
    }

    public /* synthetic */ RefreshSessionState(AbstractC4148f abstractC4148f) {
        this();
    }

    public FetchAuthSessionState getFetchAuthSessionState() {
        return this.fetchAuthSessionState;
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return super.getType();
    }

    private RefreshSessionState() {
        this.fetchAuthSessionState = new FetchAuthSessionState.NotStarted(null, 1, null);
    }
}
