package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.FetchAuthSessionActions;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.bh3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class FetchAuthSessionState implements State {

    public static final class Error extends FetchAuthSessionState {
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

    public static final class Fetched extends FetchAuthSessionState {
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Fetched() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Fetched copy$default(Fetched fetched, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetched.id;
            }
            return fetched.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final Fetched copy(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new Fetched(str);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fetched) && sq8.m48644c(this.id, ((Fetched) obj).id);
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
            return "Fetched(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fetched(String str) {
            super(null);
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.id = str;
        }

        public /* synthetic */ Fetched(String str, int i, id5 id5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class FetchingAWSCredentials extends FetchAuthSessionState {
        private final String identityId;
        private final LoginsMapProvider logins;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingAWSCredentials(String str, LoginsMapProvider loginsMapProvider) {
            super(null);
            sq8.m48649h(str, "identityId");
            sq8.m48649h(loginsMapProvider, "logins");
            this.identityId = str;
            this.logins = loginsMapProvider;
        }

        public static /* synthetic */ FetchingAWSCredentials copy$default(FetchingAWSCredentials fetchingAWSCredentials, String str, LoginsMapProvider loginsMapProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchingAWSCredentials.identityId;
            }
            if ((i & 2) != 0) {
                loginsMapProvider = fetchingAWSCredentials.logins;
            }
            return fetchingAWSCredentials.copy(str, loginsMapProvider);
        }

        public final String component1() {
            return this.identityId;
        }

        public final LoginsMapProvider component2() {
            return this.logins;
        }

        public final FetchingAWSCredentials copy(String str, LoginsMapProvider loginsMapProvider) {
            sq8.m48649h(str, "identityId");
            sq8.m48649h(loginsMapProvider, "logins");
            return new FetchingAWSCredentials(str, loginsMapProvider);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchingAWSCredentials)) {
                return false;
            }
            FetchingAWSCredentials fetchingAWSCredentials = (FetchingAWSCredentials) obj;
            return sq8.m48644c(this.identityId, fetchingAWSCredentials.identityId) && sq8.m48644c(this.logins, fetchingAWSCredentials.logins);
        }

        public final String getIdentityId() {
            return this.identityId;
        }

        public final LoginsMapProvider getLogins() {
            return this.logins;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return (this.identityId.hashCode() * 31) + this.logins.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingAWSCredentials(identityId=" + this.identityId + ", logins=" + this.logins + ")";
        }
    }

    public static final class FetchingIdentity extends FetchAuthSessionState {
        private final LoginsMapProvider logins;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchingIdentity(LoginsMapProvider loginsMapProvider) {
            super(null);
            sq8.m48649h(loginsMapProvider, "logins");
            this.logins = loginsMapProvider;
        }

        public static /* synthetic */ FetchingIdentity copy$default(FetchingIdentity fetchingIdentity, LoginsMapProvider loginsMapProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                loginsMapProvider = fetchingIdentity.logins;
            }
            return fetchingIdentity.copy(loginsMapProvider);
        }

        public final LoginsMapProvider component1() {
            return this.logins;
        }

        public final FetchingIdentity copy(LoginsMapProvider loginsMapProvider) {
            sq8.m48649h(loginsMapProvider, "logins");
            return new FetchingIdentity(loginsMapProvider);
        }

        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchingIdentity) && sq8.m48644c(this.logins, ((FetchingIdentity) obj).logins);
        }

        public final LoginsMapProvider getLogins() {
            return this.logins;
        }

        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.logins.hashCode();
        }

        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "FetchingIdentity(logins=" + this.logins + ")";
        }
    }

    public static final class NotStarted extends FetchAuthSessionState {
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

    public static final class Resolver implements StateMachineResolver<FetchAuthSessionState> {
        private final NotStarted defaultState;
        private final FetchAuthSessionActions fetchAuthSessionActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Resolver(FetchAuthSessionActions fetchAuthSessionActions) {
            sq8.m48649h(fetchAuthSessionActions, "fetchAuthSessionActions");
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

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<FetchAuthSessionState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<FetchAuthSessionState, StateMachineResolver<FetchAuthSessionState>> logging(Logger logger, Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<FetchAuthSessionState> resolve(FetchAuthSessionState fetchAuthSessionState, StateMachineEvent stateMachineEvent) {
            sq8.m48649h(fetchAuthSessionState, "oldState");
            sq8.m48649h(stateMachineEvent, "event");
            FetchAuthSessionEvent.EventType eventTypeAsFetchAuthSessionEvent = asFetchAuthSessionEvent(stateMachineEvent);
            String str = null;
            Object[] objArr = 0;
            StateResolution<FetchAuthSessionState> stateResolution = new StateResolution<>(fetchAuthSessionState, null, 2, null);
            if (fetchAuthSessionState instanceof NotStarted) {
                if (eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchIdentity) {
                    FetchAuthSessionEvent.EventType.FetchIdentity fetchIdentity = (FetchAuthSessionEvent.EventType.FetchIdentity) eventTypeAsFetchAuthSessionEvent;
                    return new StateResolution<>(new FetchingIdentity(fetchIdentity.getLogins()), bh3.m18963e(this.fetchAuthSessionActions.fetchIdentityAction(fetchIdentity.getLogins())));
                }
                if (!(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchAwsCredentials)) {
                    return stateResolution;
                }
                FetchAuthSessionEvent.EventType.FetchAwsCredentials fetchAwsCredentials = (FetchAuthSessionEvent.EventType.FetchAwsCredentials) eventTypeAsFetchAuthSessionEvent;
                return new StateResolution<>(new FetchingAWSCredentials(fetchAwsCredentials.getIdentityId(), fetchAwsCredentials.getLogins()), bh3.m18963e(this.fetchAuthSessionActions.fetchAWSCredentialsAction(fetchAwsCredentials.getIdentityId(), fetchAwsCredentials.getLogins())));
            }
            if (fetchAuthSessionState instanceof FetchingIdentity) {
                if (!(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.FetchAwsCredentials)) {
                    return stateResolution;
                }
                FetchAuthSessionEvent.EventType.FetchAwsCredentials fetchAwsCredentials2 = (FetchAuthSessionEvent.EventType.FetchAwsCredentials) eventTypeAsFetchAuthSessionEvent;
                return new StateResolution<>(new FetchingAWSCredentials(fetchAwsCredentials2.getIdentityId(), fetchAwsCredentials2.getLogins()), bh3.m18963e(this.fetchAuthSessionActions.fetchAWSCredentialsAction(fetchAwsCredentials2.getIdentityId(), fetchAwsCredentials2.getLogins())));
            }
            if (!(fetchAuthSessionState instanceof FetchingAWSCredentials) || !(eventTypeAsFetchAuthSessionEvent instanceof FetchAuthSessionEvent.EventType.Fetched)) {
                return stateResolution;
            }
            FetchAuthSessionEvent.EventType.Fetched fetched = (FetchAuthSessionEvent.EventType.Fetched) eventTypeAsFetchAuthSessionEvent;
            return new StateResolution<>(new Fetched(str, 1, objArr == true ? 1 : 0), bh3.m18963e(this.fetchAuthSessionActions.notifySessionEstablishedAction(fetched.getIdentityId(), fetched.getAwsCredentials())));
        }
    }

    private FetchAuthSessionState() {
    }

    public /* synthetic */ FetchAuthSessionState(id5 id5Var) {
        this();
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }
}
